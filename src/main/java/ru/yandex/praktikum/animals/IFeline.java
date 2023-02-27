package ru.yandex.praktikum.animals;

import java.util.List;

public interface IFeline {
    int getKittens(int kittensCount);

    List<String> getFood(String animalKind) throws Exception;
}
