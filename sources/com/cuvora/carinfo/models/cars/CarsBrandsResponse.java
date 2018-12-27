package com.cuvora.carinfo.models.cars;

import com.cuvora.carinfo.models.Response;
import com.google.gson.p140a.C2621c;
import java.util.List;

public class CarsBrandsResponse implements Response {
    @C2621c(a = "data")
    private List<Brands> brandsArrayList;

    public List<Brands> getBrandsArrayList() {
        return this.brandsArrayList;
    }

    public void setBrandsArrayList(List<Brands> list) {
        this.brandsArrayList = list;
    }
}
