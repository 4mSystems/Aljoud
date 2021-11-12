package te.app.aljoud.connection;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Log;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;

import te.app.aljoud.utils.Constants;


//n2es hena 2nna n3mel check 3la type al file swa2 image , video 34an n2dr nb3to be retrofit

public class FileObject implements Serializable {
    private String filePath = "",paramName;
    private int fileType;
    private Uri uri;
    private File file;



    public FileObject(String paramName , String filePath, int fileType) {
        this.paramName=paramName;
        this.filePath=filePath;
        this.fileType=fileType;
        this.file = new File(filePath);
        //compressImage();
    }

    public FileObject() {
    }

    public Bitmap getResizedBitmap(File file) {
        int maxSize = 400;
        BitmapFactory.Options bmOptions = new BitmapFactory.Options();
        Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath(),bmOptions);

        int width = bitmap.getWidth();
        int height = bitmap.getHeight();

        float bitmapRatio = (float)width / (float) height;
        if (bitmapRatio > 1) {
            width = maxSize;
            height = (int) (width / bitmapRatio);
        } else {
            height = maxSize;
            width = (int) (height * bitmapRatio);
        }
        return Bitmap.createScaledBitmap(bitmap, width, height, true);
    }
    public void compressImage() {
        if(fileType == Constants.FILE_TYPE_IMAGE) {
            File imageFile = new File(getFilePath());
            Bitmap bitmap = getResizedBitmap(imageFile);
            setBitmap(bitmap);
            OutputStream os;
            try {
                os = new FileOutputStream(imageFile);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 70, os);
                os.flush();
                os.close();
            } catch (Exception e) {
                Log.e("err_compress_image", e.getMessage());
            }
            setFilePath(imageFile.getAbsolutePath());
            setFile(imageFile);
            setBitmap(bitmap);
        }
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFileType(int fileType) {
        this.fileType = fileType;
    }

    public int getFileType() {
        return fileType;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public byte[] getBytes(){
        File file = new File(getFilePath());
        int size = (int) file.length();
        byte[] bytes = new byte[size];
        try {
            BufferedInputStream buf = new BufferedInputStream(new FileInputStream(file));
            buf.read(bytes, 0, bytes.length);
            buf.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return bytes;
    }

    private Bitmap bitmap;
    public void setBitmap(Bitmap bitmap){
        this.bitmap = bitmap;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setUri(Uri uri) {
        this.uri = uri;
    }

    public Uri getUri() {
        return uri;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public File getFile() {
        return file;
    }
}
