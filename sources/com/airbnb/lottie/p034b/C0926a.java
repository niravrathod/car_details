package com.airbnb.lottie.p034b;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable.Callback;
import android.util.Log;
import android.view.View;
import com.airbnb.lottie.C0925a;
import com.airbnb.lottie.model.C0992h;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.airbnb.lottie.b.a */
public class C0926a {
    /* renamed from: a */
    private final C0992h<String> f3115a = new C0992h();
    /* renamed from: b */
    private final Map<C0992h<String>, Typeface> f3116b = new HashMap();
    /* renamed from: c */
    private final Map<String, Typeface> f3117c = new HashMap();
    /* renamed from: d */
    private final AssetManager f3118d;
    /* renamed from: e */
    private C0925a f3119e;
    /* renamed from: f */
    private String f3120f = ".ttf";

    public C0926a(Callback callback, C0925a c0925a) {
        this.f3119e = c0925a;
        if ((callback instanceof View) == null) {
            Log.w("LOTTIE", "LottieDrawable must be inside of a view for images to work.");
            this.f3118d = null;
            return;
        }
        this.f3118d = ((View) callback).getContext().getAssets();
    }

    /* renamed from: a */
    public void m4013a(C0925a c0925a) {
        this.f3119e = c0925a;
    }

    /* renamed from: a */
    public Typeface m4012a(String str, String str2) {
        this.f3115a.m4281a(str, str2);
        Typeface typeface = (Typeface) this.f3116b.get(this.f3115a);
        if (typeface != null) {
            return typeface;
        }
        str = m4010a(m4011a(str), str2);
        this.f3116b.put(this.f3115a, str);
        return str;
    }

    /* renamed from: a */
    private Typeface m4011a(String str) {
        Typeface typeface = (Typeface) this.f3117c.get(str);
        if (typeface != null) {
            return typeface;
        }
        typeface = null;
        if (this.f3119e != null) {
            typeface = this.f3119e.m4008a(str);
        }
        if (this.f3119e != null && r0 == null) {
            String b = this.f3119e.m4009b(str);
            if (b != null) {
                typeface = Typeface.createFromAsset(this.f3118d, b);
            }
        }
        if (typeface == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fonts/");
            stringBuilder.append(str);
            stringBuilder.append(this.f3120f);
            typeface = Typeface.createFromAsset(this.f3118d, stringBuilder.toString());
        }
        this.f3117c.put(str, typeface);
        return typeface;
    }

    /* renamed from: a */
    private Typeface m4010a(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        str = str.contains("Bold");
        str = (!contains || str == null) ? contains ? 2 : str != null ? true : null : 3;
        if (typeface.getStyle() == str) {
            return typeface;
        }
        return Typeface.create(typeface, str);
    }
}
