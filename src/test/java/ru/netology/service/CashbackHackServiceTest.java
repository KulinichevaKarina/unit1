package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();
    @Test
    public void shouldCashTestMin() {
        int amount = 900;

        int expected = 100;
        int actual = service.remain(900);

        assertEquals(expected, actual);
    }
    @Test
    public void shouldCashTestNormal() {
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(expected, actual);

    }
    @Test
    public void shouldCashTestMax() {
        int amount = 1100;

        int expected = 900;
        int actual = service.remain(1100);

        assertEquals(expected, actual);

    }

}
