package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    private Lion lion;

    @Mock
    private Feline feline;

    @Before
    public void setUp() throws Exception {
        lion = new Lion("Самец",feline);
    }

    @Test
    public void testGetKittens() {
        when(feline.getKittens()).thenReturn(3);
        int result = lion.getKittens();
        assertEquals(3, result);
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        //new Lion("Самец", feline);
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void testGetFood() throws Exception {
        when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> food = lion.getFood();
        assertEquals(food,lion.getFood());
    }

    @Test
    public void testInvalidLionSex() {
        try {
            new Lion("", feline);
            fail("Expected an Exception to be throw");
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самей или самка", e.getMessage());
        }
    }
}