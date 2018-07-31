package com.pattarn.strategy.alarm.common;

import com.google.common.collect.ImmutableMap;

import java.time.LocalTime;
import java.util.Map;

/**
 * Created on 2018/5/23
 */
public class AlarmConst {
    public static final String USE_GOLD = "操作金库使用按钮";
    public static final String USE_BELL = "使用警铃";
    public static final String USE_PHONE = "使用电话";
    public static final String RECORD = "【记录】：";
    public static final String NOTIFY = "【发送紧急事态通知】：";
    public static final String CALL = "【呼叫警报中心】：";
    public static final String CALLMESSAGE = "【呼叫警报中心留言电话】：";

    public static final Map<LocalTime, LocalTime> DAY_TIME = ImmutableMap.of(
            LocalTime.of(9,0), LocalTime.of(12,0),
            LocalTime.of(13,0), LocalTime.of(17,0)
    );

    public static final Map<LocalTime, LocalTime> LUNCH_TIME = ImmutableMap.of(
            LocalTime.of(12,0), LocalTime.of(13,0)
    );
}
