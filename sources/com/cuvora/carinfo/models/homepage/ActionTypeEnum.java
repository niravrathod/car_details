package com.cuvora.carinfo.models.homepage;

public enum ActionTypeEnum {
    RCSTATUS,
    CARS_HOME,
    MYGARAGE,
    MARKET,
    INSTANT_ARTICLE,
    VEHICLE_DETAILS,
    SHARE,
    REDIRECT,
    SEARCHBYNAME,
    VIDEO_YOUTUBE,
    DEEPLINK,
    REWARDED,
    REWARDED_INAPP,
    INAPP,
    CAR_MODEL,
    DL,
    VIDEO_HOME,
    LICENCE_DETAILS;

    public static ActionTypeEnum getActionType(String str) {
        for (ActionTypeEnum actionTypeEnum : values()) {
            if (actionTypeEnum.name().equalsIgnoreCase(str)) {
                return actionTypeEnum;
            }
        }
        return null;
    }
}
