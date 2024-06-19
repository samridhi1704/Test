package org.example;

import org.example.exception.ArrayProcessingException;
import org.example.exception.NumberNotPresent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OverLoadingTest {
    @Test
    void shouldReturnTwentyWhenFiveAndFifteenIsPassed() throws NumberNotPresent  {
        int expectedValue = 20;
        OverLoading add = new OverLoading();

        int actualValue = add.sum(5,15);

        assertEquals(expectedValue,actualValue);

    }

    @Test
    void shouldReturnIllegalNumberWhenNumberLessThanZeroIsPassed() {

        OverLoading add = new OverLoading();
        assertThrows(NumberNotPresent.class , ()->{
             add.sum(-3, -4, 0);
        });
    }

    @Test
    void shouldReturnFifteenWhenFiveFiveAndFiveIsAdded() throws NumberNotPresent
    {
        int expectedValue = 15;
        OverLoading add = new OverLoading();

        int actualValue = add.sum(5,5,5);

        assertEquals(expectedValue,actualValue);
    }

    @Test
    void shouldReturnArrayWhenValuesArePassed() throws ArrayProcessingException {

        int[] expectedValue = {2,4,5};

        OverLoading arr = new OverLoading();

        int[] actualValue = arr.listt();
        assertArrayEquals(expectedValue,actualValue);


    }

    @Test
    void shouldReturnNameWhenParameterIsPassed() {

        String expectedValue = "Samridhi";

        OverLoading ss = new OverLoading();
        String actualValue = ss.lisq();

        assertEquals(expectedValue,actualValue);

    }

    //    @Test
//    void shouldThrowArrayProcessingExceptionWhenTheListOfItemsIsMore() throws ArrayProcessingException {
//        assertThrows(ArrayProcessingException.class , ()->{
//
//            OverLoading arr2 = new OverLoading();
//            int[] arrayList ={2,4,5,6};
//            arr2.listt();
//        });
//    }




}
