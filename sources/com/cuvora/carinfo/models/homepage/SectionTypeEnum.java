package com.cuvora.carinfo.models.homepage;

public enum SectionTypeEnum {
    NEWS(1),
    GRID(2),
    CARS(3),
    TRENDING(4),
    VIDEOS(5),
    SHAREAPP(6),
    SELECT_CARS(7),
    FUEL_PRICES(8),
    BANNER(9),
    BANNER_AD(10),
    CROSS_SELL(11),
    RATING_POPUP(12),
    CARS_RAIL(13),
    FEATURE_RAIL(14),
    UNOMER(15),
    RECENT_SEARCH(16);
    
    private int itemType;

    private SectionTypeEnum(int i) {
        this.itemType = i;
    }

    public int getItemType() {
        return this.itemType;
    }

    public static SectionTypeEnum getSectionType(String str) {
        for (SectionTypeEnum sectionTypeEnum : values()) {
            if (sectionTypeEnum.name().equalsIgnoreCase(str)) {
                return sectionTypeEnum;
            }
        }
        return null;
    }

    public static SectionTypeEnum getSectionTypeFromItemType(int i) {
        for (SectionTypeEnum sectionTypeEnum : values()) {
            if (sectionTypeEnum.getItemType() == i) {
                return sectionTypeEnum;
            }
        }
        return BANNER_AD;
    }
}
