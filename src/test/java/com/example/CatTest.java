package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getSound() {

        Cat cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound());

    }

    @Test
    public void getFood() {
        try {
            Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
            Cat cat = new Cat(feline);
            assertEquals(cat.getFood(), List.of("Животные", "Птицы", "Рыба"));
        } catch (Exception e) {
            System.out.println("Произошла ошибка!");
        }
    }
}