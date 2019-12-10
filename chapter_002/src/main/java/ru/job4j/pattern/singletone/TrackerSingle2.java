package ru.job4j.pattern.singletone;

import ru.job4j.tracker.Item;

import java.util.Arrays;
import java.util.Random;

public class TrackerSingle2 {
    private final Item[] items = new Item[100];
    private int position = 0;
    private static TrackerSingle2 instance;

    private TrackerSingle2() {
    }

    public static TrackerSingle2 getInstance() {
        if (instance == null) {
            instance = new TrackerSingle2();
        }
        return instance;
    }
    public Item add(Item item) {
        return item;
    }


    public boolean replace(String id, Item item) {
        boolean result = false;
        for (int i = 0; i < this.position; i++) {
            if (items[i].getId().equals(id)) {
                items[i] = item;
                result = true;
                item.setId(id);
                break;
            }
        }
        return result;
    }

    public boolean delete(String id) {
        boolean result = false;
        for (int i = 0; i < this.position; i++) {
            if (this.items[i].getId().equals(id)) {
                this.items[i] = null;
                System.arraycopy(items, 1 + i, items, i, this.position);
                this.position--;
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

    public Item[] findAll() {
        return Arrays.copyOf(items, position);
    }

    public Item[] findByName(String key) {
        Item[] tmp = new Item[this.position];
        int count = 0;
        for (int i = 0; i < this.position; i++) {
            if (this.items[i].getName().equals(key)) {
                tmp[count] = this.items[i];
                count++;
            }
        }
        Item[] result = Arrays.copyOf(tmp, count);
        return result;
    }

    public Item findById(String id) {
        Item it = null;
        for (int i = 0; i < this.position; i++) {
            it = items[i];
            if (it.getId().equals(id)) {
                it = items[i];
                break;
            }
        }
        return it;
    }
}
