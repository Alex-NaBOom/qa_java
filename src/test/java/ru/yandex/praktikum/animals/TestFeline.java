package ru.yandex.praktikum.animals;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestFeline {

    @Test
    public void eatMeatFelineListForPredator() throws Exception {
        Feline feline = new Feline();
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        assertEquals(expected, actual);
    }

    @Test
    public void getFamilyFeline() {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensValueOne() {
        Feline feline = new Feline();
        int expected = 1;
        int actual = feline.getKittens(1);
        assertEquals(expected, actual);
    }
}
