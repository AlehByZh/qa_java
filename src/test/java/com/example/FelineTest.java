package com.example;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    private Feline feline;

    @Before
    public void setUp() {
        feline = new Feline();
    }

    @Test
    public void getKittensTest() {
        assertEquals(feline.getKittens(),1);
    }
    @Test
    public void getKittensCountTest() {
        assertEquals(feline.getKittens(3),3);
    }
    @Test
    public void getFamilyTest() {
        assertEquals(feline.getFamily(),"Кошачьи");
    }
    @Test
    public void eatMeatTest() throws Exception {
        List<String> result = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(feline.eatMeat(),result);
    }
}
