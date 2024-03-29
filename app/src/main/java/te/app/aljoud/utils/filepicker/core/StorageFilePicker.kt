package te.app.aljoud.utils.filepicker.core

import android.graphics.Bitmap
import android.net.Uri
import androidx.activity.ComponentActivity
import androidx.activity.result.contract.ActivityResultContracts
import androidx.lifecycle.lifecycleScope
import te.app.aljoud.utils.filepicker.decoder.Decoder
import te.app.aljoud.utils.filepicker.decoder.UriDecoder
import te.app.aljoud.utils.filepicker.request.FilePickerRequest
import te.app.aljoud.utils.filepicker.request.ImageCameraRequest
import te.app.aljoud.utils.filepicker.request.ImagePickerRequest
import te.app.aljoud.utils.filepicker.request.PdfPickerRequest
import te.app.aljoud.utils.filepicker.request.PickerRequest
import java.io.File
import java.lang.ref.WeakReference

internal class StorageFilePicker(private val activity: WeakReference<ComponentActivity>) :
    FilePicker {

    private lateinit var pickerRequest: PickerRequest
    private lateinit var cameraRequest: ImageCameraRequest
    private val decoder: Decoder by lazy { UriDecoder(activity.get()?.applicationContext) }

    private val filePickerLauncher =
        activity.get()?.registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            result?.data?.data?.let { processFile(it) }
        }

    private val cameraCaptureLauncher =
        activity.get()?.registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            (result.data?.extras?.get("data") as? Bitmap)?.let { processBitmap(it) }
        }

    override fun pickImage(onImagePicked: (Pair<Bitmap?, File?>?) -> Unit) {
        pickerRequest = ImagePickerRequest(decoder, onImagePicked)
        initialize()
    }

    override fun captureCameraImage(onImagePicked: (Pair<Bitmap?, File?>?) -> Unit) {
        cameraRequest = ImageCameraRequest(decoder, onImagePicked)
        cameraCaptureLauncher?.launch(cameraRequest.intent)
    }

    override fun pickPdf(onPdfPicked: (Pair<String?, File?>?) -> Unit) {
        pickerRequest = PdfPickerRequest(decoder, onPdfPicked)
        initialize()
    }

    override fun pickFile(onFilePicked: (Pair<String?, File?>?) -> Unit) {
        pickerRequest = FilePickerRequest(decoder, onFilePicked)
        initialize()
    }

    private fun initialize() {
        filePickerLauncher?.launch(pickerRequest.intent)
    }

    private fun processFile(uri: Uri) {
        activity.get()?.lifecycleScope?.launchWhenResumed {
            pickerRequest.invokeCallback(uri)
        }
    }

    private fun processBitmap(bitmap: Bitmap) {
        activity.get()?.lifecycleScope?.launchWhenResumed {
            cameraRequest.invokeCameraCallback(bitmap)
        }
    }

}