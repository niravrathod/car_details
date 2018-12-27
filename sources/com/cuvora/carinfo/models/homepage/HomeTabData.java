package com.cuvora.carinfo.models.homepage;

import com.cuvora.carinfo.models.Response;
import java.util.List;

public class HomeTabData implements Response {
    private List<TabContent> tabContents;

    public List<TabContent> getTabContents() {
        return this.tabContents;
    }

    public void setTabContents(List<TabContent> list) {
        this.tabContents = list;
    }
}
