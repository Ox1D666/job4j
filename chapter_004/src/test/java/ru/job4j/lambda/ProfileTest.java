package ru.job4j.lambda;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

public class ProfileTest {
    @Test
    public void collectAddress() {
        List<Address> result = List.of(new Address("Msk", "Gagarina", 12, 1961),
                new Address("Nsk", "Lenina", 8, 1917));
        List<Profile> profiles = List.of(
                new Profile(new Address("Msk", "Gagarina", 12, 1961)),
                new Profile(new Address("Nsk", "Lenina", 8, 1917)));
        Profiles prof = new Profiles();
        List<Address> expect = prof.collect(profiles);
        assertThat(expect, is(result));
    }
}
