package ru.yandex.praktikum.animals;

import java.util.List;

public class Feline extends Animal implements Predator, IFeline {

    public Feline() {

    }

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }

    @Override
    public String getFamily() {
        return "Кошачьи";
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }

}
