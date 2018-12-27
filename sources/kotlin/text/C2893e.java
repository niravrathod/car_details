package kotlin.text;

/* renamed from: kotlin.text.e */
final class C2893e {
    /* renamed from: a */
    public static final Regex f12102a;
    /* renamed from: b */
    public static final C2893e f12103b = new C2893e();

    static {
        String str = "(\\p{Digit}+)";
        String str2 = "(\\p{XDigit}+)";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[eE][+-]?");
        stringBuilder.append(str);
        String stringBuilder2 = stringBuilder.toString();
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("(0[xX]");
        stringBuilder3.append(str2);
        stringBuilder3.append("(\\.)?)|");
        stringBuilder3.append("(0[xX]");
        stringBuilder3.append(str2);
        stringBuilder3.append("?(\\.)");
        stringBuilder3.append(str2);
        stringBuilder3.append(')');
        String stringBuilder4 = stringBuilder3.toString();
        StringBuilder stringBuilder5 = new StringBuilder();
        stringBuilder5.append('(');
        stringBuilder5.append(str);
        stringBuilder5.append("(\\.)?(");
        stringBuilder5.append(str);
        stringBuilder5.append("?)(");
        stringBuilder5.append(stringBuilder2);
        stringBuilder5.append(")?)|");
        stringBuilder5.append("(\\.(");
        stringBuilder5.append(str);
        stringBuilder5.append(")(");
        stringBuilder5.append(stringBuilder2);
        stringBuilder5.append(")?)|");
        stringBuilder5.append("((");
        stringBuilder5.append(stringBuilder4);
        stringBuilder5.append(")[pP][+-]?");
        stringBuilder5.append(str);
        stringBuilder5.append(')');
        str = stringBuilder5.toString();
        StringBuilder stringBuilder6 = new StringBuilder();
        stringBuilder6.append("[\\x00-\\x20]*[+-]?(NaN|Infinity|((");
        stringBuilder6.append(str);
        stringBuilder6.append(")[fFdD]?))[\\x00-\\x20]*");
        f12102a = new Regex(stringBuilder6.toString());
    }

    private C2893e() {
    }
}
