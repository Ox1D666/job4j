package ru.job4j.singletone;

import org.junit.Test;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;

import ru.job4j.pattern.singletone.TrackerSingle1;
import ru.job4j.pattern.singletone.TrackerSingle2;
import static org.hamcrest.Matchers.is;

import ru.job4j.pattern.singletone.TrackerSingle3;
import ru.job4j.pattern.singletone.TrackerSingle4;
import ru.job4j.tracker.Tracker;

public class TrackerSingleTest {
    @Test
    public void whenCreateSingletoneEnum() {
        TrackerSingle1 firstRequest = TrackerSingle1.INSTANCE;
        TrackerSingle1 secondRequest = TrackerSingle1.INSTANCE;
        assertSame(firstRequest, secondRequest);
    }
    @Test
    public void whenCreateSingletoneSynchronizedAccessor() {
        TrackerSingle2 firstRequest = TrackerSingle2.getInstance();
        TrackerSingle2 secondRequest = TrackerSingle2.getInstance();
        assertSame(firstRequest, secondRequest);
    }
    @Test
    public void whenCreateSingletoneWithInitializedObject() {
        TrackerSingle3 firstRequest = TrackerSingle3.getInstance();
        TrackerSingle3 secondRequest = TrackerSingle3.getInstance();
        assertSame(firstRequest, secondRequest);
    }
    @Test
    public void whenCreateSingletoneWithInnerClass() {
        TrackerSingle4 firstRequest = TrackerSingle4.getInstance();
        TrackerSingle4 secondRequest = TrackerSingle4.getInstance();
        assertSame(firstRequest, secondRequest);
    }
}
