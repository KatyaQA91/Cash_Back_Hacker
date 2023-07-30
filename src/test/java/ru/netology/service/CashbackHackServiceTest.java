package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;


public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void minimumValueAmount() {

        int amount = 1;

        int expected = 999;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void minimumValueAmountPlusOne() {

        int amount = 2;

        int expected = 998;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void valueLessThanLimitAmount() {

        int amount = 340;

        int expected = 660;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void amountEqualBoundaryMinusOne() {

        int amount = 999;

        int expected = 1;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void theValueOfTheLimitAmount() {

        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void theValueOfTheLimitAmountPlusOne() {

        int amount = 1001;

        int expected = 999;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void limitValueAmountWithValueInMillions() {

        int amount = 10_735_504;

        int expected = 496;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    } @Test
    public void amountLimitWhenTheValueExceedsSeveralThousand() {

        int amount = 2_150;

        int expected = 850;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }



}