package ru.job4j.search;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PriorityQueueTest {
    @Test
    public void whenHigherPriority() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("middle", 2));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 4));
        queue.put(new Task("middle", 3));
        Task rsl = queue.take();
        assertThat(rsl.getDescription(), is("urgent"));
    }
    @Test
    public void whenHigherPriority2() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("middle", 3));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 4));
        queue.put(new Task("low", 5));
        queue.put(new Task("middle", 2));
        Task rsl = queue.take();
        assertThat(rsl.getDescription(), is("urgent"));
    }
    @Test
    public void whenHigherPriority3() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("urgent", 1));
        queue.put(new Task("low", 5));
        queue.put(new Task("middle", 3));
        queue.put(new Task("middle", 4));
        queue.put(new Task("middle", 2));
        Task rsl = queue.take();
        assertThat(rsl.getDescription(), is("urgent"));
    }
    @Test
    public void whenHigherPriority4() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 2));
        queue.put(new Task("middle", 3));
        queue.put(new Task("middle", 4));
        queue.put(new Task("low", 5));
        Task rsl = queue.take();
        assertThat(rsl.getDescription(), is("urgent"));
    }
    @Test
    public void whenHigherPriority5() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("middle", 2));
        queue.put(new Task("middle", 3));
        queue.put(new Task("middle", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("low", 4));
        Task rsl = queue.take();
        assertThat(rsl.getDescription(), is("urgent"));
    }
    @Test
    public void whenHigherPriority6() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("middle", 4));
        queue.put(new Task("low", 5));
        queue.put(new Task("middle", 2));
        queue.put(new Task("middle", 3));
        queue.put(new Task("urgent", 1));
        Task rsl = queue.take();
        assertThat(rsl.getDescription(), is("urgent"));
    }
    @Test
    public void whenHigherPriority7() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("middle", 3));
        queue.put(new Task("middle", 4));
        queue.put(new Task("low", 5));
        queue.put(new Task("middle", 2));
        queue.put(new Task("urgent", 1));
        Task rsl = queue.take();
        assertThat(rsl.getDescription(), is("urgent"));
    }
}
