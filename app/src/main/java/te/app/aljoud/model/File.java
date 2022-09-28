package te.app.aljoud.model;

public class File {
    private String file;
    private String type;

    public File(String file, String type) {
        this.file = file;
        this.type = type;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
