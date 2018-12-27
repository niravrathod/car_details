package com.cuvora.carinfo.models.homepage;

import com.cuvora.carinfo.models.Response;
import java.io.Serializable;
import java.util.List;

public class HomePageData implements Response, Serializable {
    private List<Section> sections;

    public List<Section> getSections() {
        return this.sections;
    }

    public void setSections(List<Section> list) {
        this.sections = list;
    }
}
