package com.pattarn.strategy.alarm.context;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Collection;

import static com.pattarn.strategy.alarm.common.AlarmConst.*;
import static org.junit.Assert.*;

/**
 * Created on 2018/5/23
 */
@RunWith(Parameterized.class)
public class AlarmContextTest {
    String expectedUseGold = "";
    String expectedUseBell = "";
    String expectedUsePhone = "";
    LocalTime time;

    @Parameterized.Parameters(name = "{index}: time_{3}")
    public static Collection parameter() {
        Object [][] object = {
                {RECORD,NOTIFY,CALL, LocalTime.of(9,0)},
                {NOTIFY,NOTIFY,CALLMESSAGE, LocalTime.of(12,0)},
                {NOTIFY,NOTIFY,CALLMESSAGE, LocalTime.of(23,59)},
        };
        return Arrays.asList(object);
    }

    public AlarmContextTest(String expectedUseGold, String expectedUseBell, String expectedUsePhone, LocalTime time) {
        this.expectedUseGold = expectedUseGold;
        this.expectedUseBell = expectedUseBell;
        this.expectedUsePhone = expectedUsePhone;
        this.time = time;
    }

    @Test
    public void TestUseGold() throws Exception {
        assertEquals(expectedUseGold, new AlarmContext(time).useGold());
    }

    @Test
    public void TestUseBell() throws Exception {
        assertEquals(expectedUseBell, new AlarmContext(time).useBell());
    }

    @Test
    public void TestUsePhone() throws Exception {
        assertEquals(expectedUsePhone, new AlarmContext(time).usePhone());
    }

}