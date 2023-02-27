package ru.yandex.praktikum.animals;

import java.util.List;

public class Lion extends Animal {
    IFeline feline; // перменная объект кошка, для
    boolean hasMane;

    public Lion(String sex, IFeline feline) throws Exception {
        this.feline = feline;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }


    public int getKittens() {
        return feline.getKittens(1);
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
