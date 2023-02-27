package ru.yandex.praktikum.animals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;

@RunWith(MockitoJUnitRunner.class)
public class TestLionAlex {
    @Mock
    Feline feline;

    @Test
    public void getKittensLionAlex() throws Exception {
        LionAlex alex = new LionAlex("Самец", feline);
        int expected = 0;
        Mockito.when(feline.getKittens(anyInt())).thenReturn(0);
        int actual = alex.getKittens();
        assertEquals(expected, actual);
    }

    @Test
    public void getFriendsLionAlex() throws Exception {
        LionAlex alex = new LionAlex("Самец", feline);
        List<String> expected = List.of("Зебра Марти", "Бегемотиха Глория", "Жираф Мелман");
        List<String> actual = alex.getFriends();
        assertEquals(expected, actual);
    }

    @Test
    public void getPlaceOfLiveLionAlex() throws Exception {
        LionAlex alex = new LionAlex("Самец", feline);
        String expected = "Нью-Йоркский зоопарк";
        String actual = alex.getPlaceOfLive();
        assertEquals(expected, actual);
    }
}
