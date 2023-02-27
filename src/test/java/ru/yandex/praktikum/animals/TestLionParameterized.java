package ru.yandex.praktikum.animals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class TestLionParameterized {
    private final String sex;

    public TestLionParameterized(String sex) {
        this.sex = sex;
    }

    @Parameterized.Parameters
    public static Object[] getSexData() {
        return new Object[]{"Самец", "Самка"};
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void createLionWithDifferentSex() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Lion lion = new Lion(sex, feline);
        switch (sex) {
            case ("Самец"):
                assertTrue(lion.hasMane);
                break;
            case ("Самка"):
                assertFalse(lion.hasMane);
                break;
        }
    }

    @Test
    public void doesHaveManeLionWithDifferentSex() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Lion lion = new Lion(sex, feline);
        switch (sex) {
            case ("Самец"):
                assertTrue(lion.doesHaveMane());
                break;
            case ("Самка"):
                assertFalse(lion.doesHaveMane());
                break;
        }
    }
}
