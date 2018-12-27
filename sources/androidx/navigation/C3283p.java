package androidx.navigation;

import android.annotation.SuppressLint;
import androidx.navigation.C0909m.C0907b;
import java.util.HashMap;
import java.util.Map;

@SuppressLint({"TypeParameterUnusedInFormals"})
/* renamed from: androidx.navigation.p */
public class C3283p implements C0910n {
    /* renamed from: a */
    private static final HashMap<Class, String> f14005a = new HashMap();
    /* renamed from: b */
    private final HashMap<String, C0909m<? extends C0900g>> f14006b = new HashMap();

    /* renamed from: a */
    private String m16933a(Class<? extends C0909m> cls) {
        String str = (String) f14005a.get(cls);
        if (str == null) {
            C0907b c0907b = (C0907b) cls.getAnnotation(C0907b.class);
            str = c0907b != null ? c0907b.m3961a() : null;
            if (m16934b(str)) {
                f14005a.put(cls, str);
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("No @Navigator.Name annotation found for ");
                stringBuilder.append(cls.getSimpleName());
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        return str;
    }

    /* renamed from: a */
    public <D extends C0900g, T extends C0909m<? extends D>> T mo864a(String str) {
        if (m16934b(str)) {
            C0909m c0909m = (C0909m) this.f14006b.get(str);
            if (c0909m != null) {
                return c0909m;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not find Navigator with name \"");
            stringBuilder.append(str);
            stringBuilder.append("\". You must call NavController.addNavigator() for each navigation type.");
            throw new IllegalStateException(stringBuilder.toString());
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }

    /* renamed from: a */
    public C0909m<? extends C0900g> mo863a(C0909m<? extends C0900g> c0909m) {
        return mo3876a(m16933a(c0909m.getClass()), c0909m);
    }

    /* renamed from: a */
    public C0909m<? extends C0900g> mo3876a(String str, C0909m<? extends C0900g> c0909m) {
        if (m16934b(str)) {
            return (C0909m) this.f14006b.put(str, c0909m);
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }

    /* renamed from: a */
    Map<String, C0909m<? extends C0900g>> m16938a() {
        return this.f14006b;
    }

    /* renamed from: b */
    private boolean m16934b(String str) {
        return (str == null || str.isEmpty() != null) ? null : true;
    }
}
