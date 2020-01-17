package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tracker {
    private List<Item> items = new ArrayList<>();

    public Item add(Item item) {
        item.setId(generateId());
        this.items.add(item);
        return item;
    }

    public boolean replace(String id, Item item) {
        boolean result = false;
        int count = 0;
        for (Item element : this.items) {
            if (element.getId().equals(id)) {
                items.set(count, item);
                result = true;
                item.setId(id);
                break;
            }
            count++;
        }
        return result;
    }

    public boolean delete(String id) {
        boolean result = false;
        for (Item element : this.items) {
            if (element.getId().equals(id)) {
                this.items.remove(element);
                result = true;
                break;
            }
        }
        return result;
    }

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public List<Item> findAll() {
        return this.items;
    }

    public List<Item> findByName(String key) {
        List<Item> tmp = new ArrayList<>();
        for (Item element : this.items) {
            if (element.getName().equals(key)) {
                tmp.add(element);
            }
        }
        return tmp;
    }

    public Item findById(String id) {
        Item it = null;
        for (Item element : items) {
            if (element.getId().equals(id)) {
                it = element;
                break;
            }
        }
        return it;
    }
}
