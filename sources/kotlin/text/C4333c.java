package kotlin.text;

/* renamed from: kotlin.text.c */
class C4333c extends C2891b {
    /* renamed from: a */
    public static final boolean m23719a(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (z) {
            return Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2);
        } else {
            return false;
        }
    }
}
