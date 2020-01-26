package ru.job4j.tracker;

public class Item {
    private String name;
    private String id;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return name + ", " + id;
    }

//    @Override
//    public int compareTo(Item o) {
//        return Integer.compare(Integer.parseInt(id), Integer.parseInt(o.id));
//    }
}
