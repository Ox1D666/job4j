package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.*;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }
    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1");
        tracker.add(previous);
        Item next = new Item("test2");
        next.setId(previous.getId());
        tracker.replace(previous.getId(), next);
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }
    @Test
    public void whenDeleteItemAndMoveMassiveLeft() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        tracker.add(item1);
        tracker.add(item2);
        tracker.delete(item1.getId());
        Item expect = tracker.findById(item1.getId());
        assertNull(expect);
    }
    @Test
    public void findByNameTest() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        Item item3 = new Item("test3");
        Item item2 = new Item("test2");
        Item item4 = new Item("test1");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);
        List<Item> expect = tracker.findByName("test1");
        assertThat(expect.get(0).getName(), is(item1.getName()));
    }
    @Test
    public void findAllTest() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        tracker.add(item1);
        tracker.add(item2);
        List<Item> expect = tracker.findAll();
        assertThat(tracker.findAll(), is(expect));
    }
}