package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

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
        // Добавляем заявку в трекер. Теперь в объект проинициализирован id.
        tracker.add(previous);
        // Создаем новую заявку.
        Item next = new Item("test2");
        // Проставляем старый id из previous, который был сгенерирован выше.
        next.setId(previous.getId());
        // Обновляем заявку в трекере.
        tracker.replace(previous.getId(), next);
        // Проверяем, что заявка с таким id имеет новые имя test2.
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
        Item[] expect = new Item[1];
        expect[0] = item2;
        assertThat(tracker.findAll(), is(expect));
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
        tracker.findByName("test1");
        Item[] expect = new Item[2];
        expect[0] = item1;
        expect[1] = item4;
        assertThat(tracker.findByName("test1"), is(expect));
    }
    @Test
    public void findAllTest() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        tracker.add(item1);
        tracker.add(item2);
        Item[] expect = new Item[2];
        expect[0] = item1;
        expect[1] = item2;
        assertThat(tracker.findAll(), is (expect));
    }
}