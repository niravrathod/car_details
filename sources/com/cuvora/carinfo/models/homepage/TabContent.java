package com.cuvora.carinfo.models.homepage;

import java.io.Serializable;

public class TabContent implements Serializable {
    private HomePageData homePageData;
    private String icon;
    private boolean selected;
    private String selectedIcon;
    private boolean showBanner = true;
    private String tabName;
    private String title;
    private TabTypeEnum type;

    public TabTypeEnum getType() {
        return this.type;
    }

    public void setType(TabTypeEnum tabTypeEnum) {
        this.type = tabTypeEnum;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public String getSelectedIcon() {
        return this.selectedIcon;
    }

    public void setSelectedIcon(String str) {
        this.selectedIcon = str;
    }

    public void setSelected(boolean z) {
        this.selected = z;
    }

    public boolean isSelected() {
        return this.selected;
    }

    public String getTabName() {
        return this.tabName;
    }

    public void setTabName(String str) {
        this.tabName = str;
    }

    public HomePageData getHomePageData() {
        return this.homePageData;
    }

    public void setHomePageData(HomePageData homePageData) {
        this.homePageData = homePageData;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setShowBanner(boolean z) {
        this.showBanner = z;
    }

    public boolean isShowBanner() {
        return this.showBanner;
    }
}
