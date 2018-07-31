package com.pattarn.strategy.alarm.common;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.time.LocalTime;

import static com.pattarn.strategy.alarm.common.AlarmConst.*;

/**
 * Created on 2018/5/23
 */
public class AlarmCenter {
    private static Log log = LogFactory.getLog(AlarmCenter.class.getName());
    public static String record(LocalTime time, String operation){
        System.out.println(RECORD + time + operation);
        log.info(RECORD + time + operation);
        return RECORD;
    }

    public static String notify(LocalTime time, String operation){
        System.out.println(NOTIFY + time + operation);
        log.info(NOTIFY + time + operation);
        return NOTIFY;
    }

    public static String call(LocalTime time, String operation){
        System.out.println(CALL + time + operation);
        log.info(CALL + time + operation);
        return CALL;
    }

    public static String callMessage(LocalTime time, String operation){
        System.out.println(CALLMESSAGE + time + operation);
        log.info(CALLMESSAGE + time + operation);
        return CALLMESSAGE;
    }
}
