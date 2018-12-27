package com.cuvora.carinfo.models;

import com.cuvora.carinfo.genericScraper.ScrapeResponse;
import java.io.Serializable;

public class Mayday implements Serializable {
    private String number;
    private ScrapeResponse scrapeResponse;

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String str) {
        this.number = str;
    }

    public ScrapeResponse getScrapeResponse() {
        return this.scrapeResponse;
    }

    public void setScrapeResponse(ScrapeResponse scrapeResponse) {
        this.scrapeResponse = scrapeResponse;
    }
}
