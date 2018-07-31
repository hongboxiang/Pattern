package com.pattarn.strategy.alarm.context;

import com.pattarn.strategy.alarm.handler.DayHandler;
import com.pattarn.strategy.alarm.handler.LunchHandler;
import com.pattarn.strategy.alarm.handler.NightHandler;
import com.pattarn.strategy.alarm.handler.TimeHandler;

import java.time.LocalTime;
import java.util.Map;

import static com.pattarn.strategy.alarm.common.AlarmConst.DAY_TIME;
import static com.pattarn.strategy.alarm.common.AlarmConst.LUNCH_TIME;

/**
 * Created on 2018/5/23
 */
public class AlarmContext {
    private TimeHandler timeHandler;

    public AlarmContext(LocalTime time) {
        if (isInTimeRange(time, DAY_TIME)) {
            this.timeHandler = new DayHandler(time);
        } else if (isInTimeRange(time, LUNCH_TIME)) {
            this.timeHandler = new LunchHandler(time);
        } else {
            this.timeHandler = new NightHandler(time);
        }
    }

    private boolean isInTimeRange(LocalTime time, Map<LocalTime, LocalTime> timeRanges) {
        for(Map.Entry<LocalTime, LocalTime> timeRange : timeRanges.entrySet()){
            if(isInTimeRange(time,timeRange.getKey(),timeRange.getValue())){
                return true;
            }
        }
        return false;
    }

    private boolean isInTimeRange(LocalTime time, LocalTime start, LocalTime end) {
        return time.isAfter(start.plusMinutes(-1)) && time.isBefore(end);
    }

    public String useGold() {
        return timeHandler.useGold();
    }

    public String useBell() {
        return timeHandler.useBell();
    }

    public String usePhone() {
        return timeHandler.usePhone();
    }

}
