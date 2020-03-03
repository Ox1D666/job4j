package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class NotifyAccountTest {

    @Test
    public void sent() {
        assertThat(NotifyAccount.sent(
                List.of(new Account("123", "Petr Arsentev", "eDer3432f"),
                        new Account("142", "Petr Arsentev", "000001"),
                        new Account("142", "Petr Arsentev", "000001"))),
                is(
                        Set.of(new Account("123", "Petr Arsentev", "eDer3432f"),
                                new Account("142", "Petr Arsentev", "000001"))));
    }
}