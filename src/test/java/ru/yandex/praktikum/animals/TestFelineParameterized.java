package ru.yandex.praktikum.animals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestFelineParameterized {
    private final int kittens;

    public TestFelineParameterized(int kittens) {
        this.kittens = kittens;
    }

    @Parameterized.Parameters
    public static Object[] getKittensData() {
        return new Object[]{0, 4, 10};
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getKittensWithNumberInConstructorReturnQuantity() {
        Feline feline = Mockito.spy(Feline.class);
        int expected = kittens;
        int actual = feline.getKittens(kittens);
        assertEquals(expected, actual);
    }
}
