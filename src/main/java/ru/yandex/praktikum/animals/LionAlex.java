package ru.yandex.praktikum.animals;

import java.util.List;

public class LionAlex extends Lion {

    public LionAlex(String sex, IFeline feline) throws Exception {
        super("Самец", feline);
    }

    @Override
    public int getKittens() {
        return feline.getKittens(0);
    }

    public List<String> getFriends() {
        return List.of("Зебра Марти", "Бегемотиха Глория", "Жираф Мелман");
    }

    public String getPlaceOfLive() {
        return "Нью-Йоркский зоопарк";
    }

}
