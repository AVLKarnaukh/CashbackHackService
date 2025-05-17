package ru.netology.service;


import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class CashbackHackServiceTest {

    @Test
    public void shouldCalcCashBackEquals() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalcCashBackMore() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1400;
        int expected = 600;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalcCashBackNotEnough() {
        CashbackHackService service = new CashbackHackService();
        int amount = 400;
        int expected = 600;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

}

