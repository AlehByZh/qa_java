package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParametrizedTest {
        private final String sex;
        private final boolean hasMane;


        public LionParametrizedTest(String sex, boolean hasMane) {
            this.sex = sex;
            this.hasMane = hasMane;
        }

        @Parameterized.Parameters
        public static Object[][] getTestData() {
            return new Object[][]{
                    {"Самец", true},
                    {"Самка", false},
            };
        }

        @Test
        public void TestLion() throws Exception {
            Feline feline = Mockito.mock(Feline.class);
            Lion lion = new Lion(sex, feline);
            assertEquals(hasMane,lion.doesHaveMane());
        }
}
