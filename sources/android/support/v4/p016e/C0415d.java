package android.support.v4.p016e;

import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: android.support.v4.e.d */
public final class C0415d {
    /* renamed from: a */
    private static final Locale f1406a = new Locale("", "");

    /* renamed from: a */
    public static int m1516a(Locale locale) {
        if (VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (!(locale == null || locale.equals(f1406a))) {
            String a = C0411a.m1510a(locale);
            if (a == null) {
                return C0415d.m1517b(locale);
            }
            if (!(a.equalsIgnoreCase("Arab") == null && a.equalsIgnoreCase("Hebr") == null)) {
                return 1;
            }
        }
        return null;
    }

    /* renamed from: b */
    private static int m1517b(Locale locale) {
        switch (Character.getDirectionality(locale.getDisplayName(locale).charAt(0))) {
            case 1:
            case 2:
                return 1;
            default:
                return 0;
        }
    }
}
