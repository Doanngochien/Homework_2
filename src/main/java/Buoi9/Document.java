package Buoi9;

public class Document {
    private int ID;
    private String name;

    public Document(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Document{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                '}';
    }
}
