package fr.istic.vv;

import org.junit.jupiter.api.Test;

import static fr.istic.vv.Date.isLeapYear;
import static fr.istic.vv.Date.isValidDate;
import static org.junit.jupiter.api.Assertions.*;

class DateTest {
    /*  All our dates

    Date DayIsZero = new Date(0,1,0);
    Date MonthIsZero = new Date(1,0,-1);
    Date MonthIsMoreThanTwelve = new Date(1,13,2022);
    Date ValidLeapYear = new Date(29,2,2024);
    Date NotValidLeapYear = new Date(29,2,2022);
    Date ValidThirtyDayMonth = new Date(30,4,2022);
    Date ValidThirtyOneDayMonth = new Date(31,12,2022);
    Date NotValidThirtyDayMonth = new Date(31,4,2022);
    Date NotValidThirtyOneDayMonth = new Date(32,12,2022);
    */

    @Test
    void testIsValidDateDayIsZero(){
        assertFalse(isValidDate(0,1,0));
    }
    @Test
    void testIsValidDateMonthIsZero(){
        assertFalse(isValidDate(1,0,-1));
    }
    @Test
    void testIsValidDateMonthIsMoreThanTwelve(){
        assertFalse(isValidDate(1,13,2022));
    }
    @Test
    void testIsValidDateValidLeapYear(){
        assertTrue(isValidDate(29,2,2024));
    }
    @Test
    void testIsValidDateNotValidLeapYear(){
        assertFalse(isValidDate(29,2,2022));
    }
    @Test
    void testIsValidDateValidThirtyDayMonth(){
        assertTrue(isValidDate(30,4,2022));
    }
    @Test
    void testIsValidDateValidThirtyOneDayMonth(){
        assertTrue(isValidDate(31,12,2022));
    }
    @Test
    void testIsValidDateNotValidThirtyDayMonth(){
        assertFalse(isValidDate(31,4,2022));
    }
    @Test
    void testIsValidDateNotValidThirtyOneDayMonth(){
        assertFalse(isValidDate(32,12,2022));
    }
    @Test
    void testIsLeapYearNotValid(){
        assertFalse(isLeapYear(2022));
    }
    @Test
    void testIsLeapYearValid(){
        assertTrue(isLeapYear(2024));
    }
    /*@Test
    void testNextDateNullDayIsZero(){
        Date date = new Date(0,1,0);
        assertNull(date.nextDate());
    }
    @Test
    void testNextDateNullOverMaxDaysOfMonth(){
        Date date = new Date(32,1,0);
        assertNull(date.nextDate());
    }
    @Test
    void testNextDateNullMonthOverTwelve(){
        Date date = new Date(1,13,0);
        assertNull(date.nextDate());
    }
    @Test
    void testNextDateNullMonthOverTwelve2(){
        Date date = new Date(20,13,0);
        assertNull(date.nextDate());
    }*/


}