package te.app.aljoud;

import com.google.gson.Gson;

import java.io.Serializable;


public class PassingObject implements Serializable {
    private int id;
    private Object objectClass;
    private String object;
    private String object2;

    public PassingObject() {
    }

    public PassingObject(int id, String object) {
        this.id = id;
        this.object = object;
    }

    public PassingObject(int id, String object, String object2) {
        this.id = id;
        this.object = object;
        this.object2 = object2;
    }

    public PassingObject(String object, String object2) {
        this.object = object;
        this.object2 = object2;
    }

    public PassingObject(String object, Object objectClass) {
        this.objectClass = objectClass;
        this.object = object;
    }


    public PassingObject(String object) {
        this.object = object;
    }


    public PassingObject(Object objectClass) {
        Gson gson = new Gson();
        String json = gson.toJson(objectClass);

        this.objectClass = (String) json;
    }

    public PassingObject(Object objectClass, int id) {
        Gson gson = new Gson();
        String json = gson.toJson(objectClass);

        this.objectClass = (String) json;
        this.id = id;
    }

    public String getObject2() {
        return object2;
    }

    public void setObject2(String object2) {
        this.object2 = object2;
    }

    public PassingObject(int id) {
        this.id = id;
    }

    public Object getObjectClass() {
        return objectClass;
    }

    public void setObjectClass(Object objectClass) {
        this.objectClass = objectClass;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
