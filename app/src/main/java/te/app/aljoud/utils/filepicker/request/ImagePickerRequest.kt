package te.app.aljoud.utils.filepicker.request

import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.provider.MediaStore
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import te.app.aljoud.utils.filepicker.decoder.Decoder
import java.io.File

internal class ImagePickerRequest(
    private val decoder: Decoder,
    private val onImagePicked: (Pair<Bitmap?, File?>?) -> Unit
) : PickerRequest {
    override val intent: Intent
        get() = Intent(
            Intent.ACTION_PICK,
            MediaStore.Images.Media.EXTERNAL_CONTENT_URI
        )

    override suspend fun invokeCallback(uri: Uri) {
        var result: Pair<Bitmap?, File?>? = null
        decoder.getStorageImage(uri).collect { result = it }
        withContext(Dispatchers.Main) {
            onImagePicked(result)
        }
    }

}