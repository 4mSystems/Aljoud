package te.app.aljoud.utils.filepicker.picker

import android.app.Activity
import android.graphics.Bitmap
import android.webkit.MimeTypeMap
import te.app.aljoud.activity.BaseActivity
import java.io.File

fun getImagePickerResult(activity: Activity, onImagePicked: (Pair<Bitmap?, File?>?) -> Unit) {
    (activity as BaseActivity).filePicker.pickImage {
        onImagePicked.invoke(it)
    }
}

fun getMimeType(path: String): String? {
    val extension = MimeTypeMap.getFileExtensionFromUrl(path)
    if (extension != null) {
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(extension)
    }
    return null
}