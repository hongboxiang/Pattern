package com.pattarn.strategy.alarm.handler;

import com.pattarn.strategy.alarm.common.AlarmCenter;

import java.time.LocalTime;

import static com.pattarn.strategy.alarm.common.AlarmConst.USE_BELL;

/**
 * Created on 2018/5/23
 */
public abstract class TimeHandler {
    protected final LocalTime time;

    public TimeHandler(LocalTime time) {
        this.time = time;
    }

    public abstract String useGold();

    public String useBell(){
        return AlarmCenter.notify(time, USE_BELL);
    }

    public abstract String usePhone();
}
