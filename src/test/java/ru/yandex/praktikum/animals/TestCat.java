package ru.yandex.praktikum.animals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestCat {
    @Mock
    Feline feline;

    @Test
    public void getSoundCatSoundMiaow() {
        Cat cat = new Cat(feline);
        String expected = "Мяу";
        String actual = cat.getSound();
        assertEquals(expected, actual);
    }

    @Test
    public void getFoodCatListForPredator() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expected);
        List<String> actual = cat.getFood();
        assertEquals(expected, actual);
    }
}
