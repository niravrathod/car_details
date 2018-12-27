package android.support.v4.p017f;

import android.os.Build.VERSION;
import java.util.Objects;

/* renamed from: android.support.v4.f.i */
public class C0428i {
    /* renamed from: a */
    public static boolean m1569a(Object obj, Object obj2) {
        if (VERSION.SDK_INT >= 19) {
            return Objects.equals(obj, obj2);
        }
        if (obj != obj2) {
            if (obj == null || obj.equals(obj2) == null) {
                obj = null;
                return obj;
            }
        }
        obj = true;
        return obj;
    }
}
