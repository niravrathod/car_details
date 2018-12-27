package com.cuvora.carinfo.models.homepage;

import java.util.List;
import java.util.Map;

public class StateCityData {
    private Map<String, List<City>> cities;
    private List<State> states;

    public List<State> getStates() {
        return this.states;
    }

    public void setStates(List<State> list) {
        this.states = list;
    }

    public Map<String, List<City>> getCities() {
        return this.cities;
    }

    public void setCities(Map<String, List<City>> map) {
        this.cities = map;
    }
}
