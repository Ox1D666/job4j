package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void checkMax() {
        int res = SqMax.max(5,10,2,25);
        assertThat(res,is(25));
    }

}
