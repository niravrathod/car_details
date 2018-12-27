package com.cuvora.carinfo.models.cars;

import com.cuvora.carinfo.models.Response;
import com.google.gson.p140a.C2621c;
import java.io.Serializable;
import java.util.ArrayList;

public class CarVariantsData implements Response, Serializable {
    private ArrayList<MileageData> mileageData;
    private ModelDetails modelDetails;
    @C2621c(a = "modelColors")
    private ArrayList<VariantColors> variantColors;
    @C2621c(a = "modelVersions")
    private ArrayList<Variants> variants;

    public ModelDetails getModelDetails() {
        return this.modelDetails;
    }

    public void setModelDetails(ModelDetails modelDetails) {
        this.modelDetails = modelDetails;
    }

    public ArrayList<VariantColors> getVariantColors() {
        return this.variantColors;
    }

    public void setVariantColors(ArrayList<VariantColors> arrayList) {
        this.variantColors = arrayList;
    }

    public ArrayList<Variants> getVariants() {
        return this.variants;
    }

    public void setVariants(ArrayList<Variants> arrayList) {
        this.variants = arrayList;
    }

    public ArrayList<MileageData> getMileageData() {
        return this.mileageData;
    }

    public void setMileageData(ArrayList<MileageData> arrayList) {
        this.mileageData = arrayList;
    }
}
