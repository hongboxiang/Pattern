package com.pattarn.strategy.alarm.common;

import com.google.common.collect.ImmutableMap;

import java.time.LocalTime;
import java.util.Map;

/**
 * Created on 2018/5/23
 */
public class AlarmConst {
    public static final String USE_GOLD = "�������ʹ�ð�ť";
    public static final String USE_BELL = "ʹ�þ���";
    public static final String USE_PHONE = "ʹ�õ绰";
    public static final String RECORD = "����¼����";
    public static final String NOTIFY = "�����ͽ�����̬֪ͨ����";
    public static final String CALL = "�����о������ġ���";
    public static final String CALLMESSAGE = "�����о����������Ե绰����";

    public static final Map<LocalTime, LocalTime> DAY_TIME = ImmutableMap.of(
            LocalTime.of(9,0), LocalTime.of(12,0),
            LocalTime.of(13,0), LocalTime.of(17,0)
    );

    public static final Map<LocalTime, LocalTime> LUNCH_TIME = ImmutableMap.of(
            LocalTime.of(12,0), LocalTime.of(13,0)
    );
}
