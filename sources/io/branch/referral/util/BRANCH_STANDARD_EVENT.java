package io.branch.referral.util;

public enum BRANCH_STANDARD_EVENT {
    ADD_TO_CART("ADD_TO_CART"),
    ADD_TO_WISHLIST("ADD_TO_WISHLIST"),
    VIEW_CART("VIEW_CART"),
    INITIATE_PURCHASE("INITIATE_PURCHASE"),
    ADD_PAYMENT_INFO("ADD_PAYMENT_INFO"),
    PURCHASE("PURCHASE"),
    SPEND_CREDITS("SPEND_CREDITS"),
    SEARCH("SEARCH"),
    VIEW_ITEM("VIEW_ITEM"),
    VIEW_ITEMS("VIEW_ITEMS"),
    RATE("RATE"),
    SHARE("SHARE"),
    COMPLETE_REGISTRATION("COMPLETE_REGISTRATION"),
    COMPLETE_TUTORIAL("COMPLETE_TUTORIAL"),
    ACHIEVE_LEVEL("ACHIEVE_LEVEL"),
    UNLOCK_ACHIEVEMENT("UNLOCK_ACHIEVEMENT");
    
    private final String name;

    private BRANCH_STANDARD_EVENT(String str) {
        this.name = str;
    }

    /* renamed from: a */
    public String m13432a() {
        return this.name;
    }
}
