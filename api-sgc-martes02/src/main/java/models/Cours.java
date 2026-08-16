package models;

public class Cours {

    private long id;
    private String code;
    private String name;
    private String description;
    private int capacity;


    public Cours(long id, String code, String name, String description, int capacity) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.description = description;
        this.capacity = capacity;
    }

    public long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
