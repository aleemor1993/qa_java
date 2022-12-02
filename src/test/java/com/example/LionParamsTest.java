package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParamsTest {

    String sex;
    boolean hasMane;

    @Mock
    Feline feline;

    @Before
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    public LionParamsTest(String sex, boolean hasMane){
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getParams() {
        return new Object[][] {
                { "Самец", true},
                { "Самка", false},
        };
    }

    @Test
    public void doesHaveMane() throws Exception{

        Lion lion = new Lion(sex, feline);
        assertEquals(lion.doesHaveMane(), hasMane);

    }

    @Test
    public void getFood() throws Exception{

        Lion lion = new Lion(sex, feline);
        lion.getFood();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");

    }
}