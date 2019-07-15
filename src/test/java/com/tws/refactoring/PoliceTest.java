package com.tws.refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PoliceTest {
    @Test
    public void should_return_true_when_age_is_greater_than_18() {
        //given
        Police police = new Police();
        Driver driver = new Driver(19);

        //when
        boolean result = police.checkDriver(driver);

        //then
        assertTrue(result);
    }

    @Test
    public void should_return_true_when_age_is_18() {
        //given
        Police police = new Police();
        Driver driver = new Driver(18);

        //when
        boolean result = police.checkDriver(driver);

        //then
        assertTrue(result);
    }

    @Test
    public void should_return_true_when_age_is_smaller_than_18() {
        //given
        Police police = new Police();
        Driver driver = new Driver(17);

        //when
        boolean result = police.checkDriver(driver);

        //then
        assertFalse(result);
    }

}