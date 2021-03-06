package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestPhoneDictionary {
    @Test
    public void searchMatches() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        assertThat(phones.find("Petr").get(0).getSurname(), is("Arsentev"));
    }
}
