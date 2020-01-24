package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ItemSortTest {
    @Test
    public void sortByIdUp() {
        ArrayList<Item> list = new ArrayList<>();
        Item it1 = new Item("a");
        Item it2 = new Item("b");
        it1.setId("1");
        it2.setId("2");
        list.add(it1);
        list.add(it2);
        list.sort(new SortItemById());
        assertThat(list.toString(), is("[a, 1, b, 2]"));
    }

    @Test
    public void sortByIdDown() {
        ArrayList<Item> list = new ArrayList<>();
        Item it1 = new Item("a");
        Item it2 = new Item("b");
        it1.setId("1");
        it2.setId("2");
        list.add(it1);
        list.add(it2);
        list.sort(Collections.reverseOrder());
        assertThat(list.toString(), is("[b, 2, a, 1]"));
    }
    @Test
    public void sortByNameUp() {
        ArrayList<Item> list = new ArrayList<>();
        Item it1 = new Item("e");
        Item it2 = new Item("c");
        it1.setId("1");
        it2.setId("2");
        list.add(it1);
        list.add(it2);
        list.sort(new SortItemByName());
        assertThat(list.toString(), is("[c, 2, e, 1]"));
    }

    @Test
    public void sortByNameDown() {
        ArrayList<Item> list = new ArrayList<>();
        Item it1 = new Item("e");
        Item it2 = new Item("c");
        it1.setId("1");
        it2.setId("2");
        list.add(it1);
        list.add(it2);
        Collections.sort(list, Collections.reverseOrder());
        assertThat(list.toString(), is("[e, 1, c, 2]"));
    }
}
