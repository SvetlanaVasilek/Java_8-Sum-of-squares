package ru.netology.homework6.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    // @CsvSource({
    //"3, 200, 300",
    //"7, 5000, 6000"
    // })
    @CsvFileSource (files = "src/test/resources/bonus.csv")
    public void calculSqrInlimit (int expected, int firstValue, int lastValue) {
        // int expected = 3;
        SQRService service =  new SQRService();
        int actual = SQRService.calculSqr(firstValue, lastValue);
        Assertions.assertEquals(expected, actual);

    }
    // @Test
    // public void calculSqrInLimit2() {
    // int expected = 7;
    //  int actual = sqrService.calculSqr (5000, 6000);
    //  Assertions.assertEquals(expected, actual);

}

