package kotlin.text;

import kotlin.jvm.internal.C2885g;
import kotlin.p153d.C4838f;

/* renamed from: kotlin.text.n */
class C4883n extends C4880m {
    /* renamed from: a */
    public static final boolean m30195a(String str, String str2, boolean z) {
        if (str == null) {
            return str2 == null ? true : null;
        }
        if (z) {
            str = str.equalsIgnoreCase(str2);
        } else {
            str = str.equals(str2);
        }
        return str;
    }

    /* renamed from: a */
    public static final String m30192a(String str, String str2, String str3, boolean z) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        C2885g.m13910b(str4, "$receiver");
        C2885g.m13910b(str5, "oldValue");
        C2885g.m13910b(str6, "newValue");
        return C4838f.m28685a(C4886o.m30231a((CharSequence) str4, new String[]{str5}, z, 0, 4, null), str6, null, null, 0, null, null, 62, null);
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ boolean m30196a(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return C4883n.m30195a(str, str2, z);
    }

    /* renamed from: a */
    public static final boolean m30194a(String str, int i, String str2, int i2, int i3, boolean z) {
        C2885g.m13910b(str, "$receiver");
        C2885g.m13910b(str2, "other");
        if (z) {
            return str.regionMatches(z, i, str2, i2, i3);
        }
        return str.regionMatches(i, str2, i2, i3);
    }
}
