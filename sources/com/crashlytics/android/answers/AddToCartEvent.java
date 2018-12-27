package com.crashlytics.android.answers;

import java.math.BigDecimal;
import java.util.Currency;

public class AddToCartEvent extends PredefinedEvent<AddToCartEvent> {
    static final String CURRENCY_ATTRIBUTE = "currency";
    static final String ITEM_ID_ATTRIBUTE = "itemId";
    static final String ITEM_NAME_ATTRIBUTE = "itemName";
    static final String ITEM_PRICE_ATTRIBUTE = "itemPrice";
    static final String ITEM_TYPE_ATTRIBUTE = "itemType";
    static final BigDecimal MICRO_CONSTANT = BigDecimal.valueOf(1000000);
    static final String TYPE = "addToCart";

    String getPredefinedType() {
        return TYPE;
    }

    public AddToCartEvent putItemId(String str) {
        this.predefinedAttributes.m5371a(ITEM_ID_ATTRIBUTE, str);
        return this;
    }

    public AddToCartEvent putItemName(String str) {
        this.predefinedAttributes.m5371a(ITEM_NAME_ATTRIBUTE, str);
        return this;
    }

    public AddToCartEvent putItemType(String str) {
        this.predefinedAttributes.m5371a(ITEM_TYPE_ATTRIBUTE, str);
        return this;
    }

    public AddToCartEvent putItemPrice(BigDecimal bigDecimal) {
        if (!this.validator.m5374a((Object) bigDecimal, ITEM_PRICE_ATTRIBUTE)) {
            this.predefinedAttributes.m5369a(ITEM_PRICE_ATTRIBUTE, Long.valueOf(priceToMicros(bigDecimal)));
        }
        return this;
    }

    public AddToCartEvent putCurrency(Currency currency) {
        if (!this.validator.m5374a((Object) currency, CURRENCY_ATTRIBUTE)) {
            this.predefinedAttributes.m5371a(CURRENCY_ATTRIBUTE, currency.getCurrencyCode());
        }
        return this;
    }

    long priceToMicros(BigDecimal bigDecimal) {
        return MICRO_CONSTANT.multiply(bigDecimal).longValue();
    }
}
