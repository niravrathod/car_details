package com.crashlytics.android.answers;

import java.math.BigDecimal;
import java.util.Currency;

public class StartCheckoutEvent extends PredefinedEvent<StartCheckoutEvent> {
    static final String CURRENCY_ATTRIBUTE = "currency";
    static final String ITEM_COUNT_ATTRIBUTE = "itemCount";
    static final BigDecimal MICRO_CONSTANT = BigDecimal.valueOf(1000000);
    static final String TOTAL_PRICE_ATTRIBUTE = "totalPrice";
    static final String TYPE = "startCheckout";

    String getPredefinedType() {
        return TYPE;
    }

    public StartCheckoutEvent putItemCount(int i) {
        this.predefinedAttributes.m5369a(ITEM_COUNT_ATTRIBUTE, Integer.valueOf(i));
        return this;
    }

    public StartCheckoutEvent putTotalPrice(BigDecimal bigDecimal) {
        if (!this.validator.m5374a((Object) bigDecimal, TOTAL_PRICE_ATTRIBUTE)) {
            this.predefinedAttributes.m5369a(TOTAL_PRICE_ATTRIBUTE, Long.valueOf(priceToMicros(bigDecimal)));
        }
        return this;
    }

    public StartCheckoutEvent putCurrency(Currency currency) {
        if (!this.validator.m5374a((Object) currency, CURRENCY_ATTRIBUTE)) {
            this.predefinedAttributes.m5371a(CURRENCY_ATTRIBUTE, currency.getCurrencyCode());
        }
        return this;
    }

    long priceToMicros(BigDecimal bigDecimal) {
        return MICRO_CONSTANT.multiply(bigDecimal).longValue();
    }
}
