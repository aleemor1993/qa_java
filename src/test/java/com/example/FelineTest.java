package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void eatMeat() {

        Feline feline = new Feline();
        try {
            assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
        } catch (Exception e){
            System.out.println("Ошибка вызова eatMeat()");
        }
    }

    @Test
    public void getFamily() {
    }

    @Test
    public void getKittensForOne() {

        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittens() {

        Feline feline = new Feline();
        assertEquals(1, feline.getKittens(1));

    }
}