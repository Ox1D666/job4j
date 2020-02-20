package ru.job4j.lambda;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SchoolTest {
    @Test
    public void whenScoreMoreThen70() {
        List<Student> students = Arrays.asList(new Student(75),
                new Student(45),
                new Student(55));
        School sc = new School();
        List<Student> result = sc.collect(students, x -> x.getScore() > 70);
        List<Student> expect = Arrays.asList(new Student(75));
        assertEquals(result, expect);
    }
    @Test
    public void whenScoreMoreThen50() {
        List<Student> students = Arrays.asList(new Student(75),
                new Student(45),
                new Student(55));
        School sc = new School();
        List<Student> result = sc.collect(students, x -> x.getScore() > 50 & x.getScore() < 70);
        List<Student> expect = Arrays.asList(new Student(55));
        assertEquals(result, expect);
    }
    @Test
    public void whenScoreMoreThen0() {
        List<Student> students = Arrays.asList(new Student(75),
                new Student(45),
                new Student(55));
        School sc = new School();
        List<Student> result = sc.collect(students, x -> x.getScore() > 0 & x.getScore() < 50);
        List<Student> expect = Arrays.asList(new Student(45));
        assertEquals(result, expect);
    }
}
