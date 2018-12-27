package kotlin.text;

/* renamed from: kotlin.text.b */
class C2891b {
    /* renamed from: a */
    public static final boolean m13922a(char c) {
        if (!Character.isWhitespace(c)) {
            if (Character.isSpaceChar(c) == '\u0000') {
                return false;
            }
        }
        return true;
    }
}
