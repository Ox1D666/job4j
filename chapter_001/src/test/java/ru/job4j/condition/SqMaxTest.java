package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void checkMaxWhenForth() {
        int res = SqMax.max(1,2,3,4);
        assertThat(res,is(4));
    }
    @Test
    public void checkMaxWhenThird() {
        int res = SqMax.max(1,2,4,3);
        assertThat(res,is(4));
    }
    @Test
    public void checkMaxWhenSecond() {
        int res = SqMax.max(1,4,2,3);
        assertThat(res,is(4));
    }
    @Test
    public void checkMaxWhenFirst() {
        int res = SqMax.max(4,3,2,1);
        assertThat(res,is(4));
    }
}
