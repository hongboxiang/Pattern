package com.pattarn.strategy.alarm.handler;

import com.pattarn.strategy.alarm.common.AlarmCenter;

import java.time.LocalTime;

import static com.pattarn.strategy.alarm.common.AlarmConst.*;

/**
 * Created on 2018/5/23
 */
public class NightHandler extends TimeHandler {
    public NightHandler(LocalTime time) {
        super(time);
    }

    @Override
    public String useGold() {
        return AlarmCenter.notify(time, USE_GOLD);
    }

    @Override
    public String usePhone() {
        return AlarmCenter.callMessage(time, USE_PHONE);
    }
}
