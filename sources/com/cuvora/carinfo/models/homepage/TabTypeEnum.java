package com.cuvora.carinfo.models.homepage;

public enum TabTypeEnum {
    PAGE,
    GARAGE,
    CAR,
    RC;

    public static TabTypeEnum getTabType(String str) {
        for (TabTypeEnum tabTypeEnum : values()) {
            if (tabTypeEnum.name().equalsIgnoreCase(str)) {
                return tabTypeEnum;
            }
        }
        return null;
    }
}
