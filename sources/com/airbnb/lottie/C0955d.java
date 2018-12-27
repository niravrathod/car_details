package com.airbnb.lottie;

import android.graphics.Rect;
import android.support.v4.p017f.C0420f;
import android.support.v4.p017f.C0434n;
import android.util.Log;
import com.airbnb.lottie.model.C0983c;
import com.airbnb.lottie.model.C0988d;
import com.airbnb.lottie.model.layer.Layer;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: com.airbnb.lottie.d */
public class C0955d {
    /* renamed from: a */
    private final C0976l f3146a = new C0976l();
    /* renamed from: b */
    private final HashSet<String> f3147b = new HashSet();
    /* renamed from: c */
    private Map<String, List<Layer>> f3148c;
    /* renamed from: d */
    private Map<String, C0967g> f3149d;
    /* renamed from: e */
    private Map<String, C0983c> f3150e;
    /* renamed from: f */
    private C0434n<C0988d> f3151f;
    /* renamed from: g */
    private C0420f<Layer> f3152g;
    /* renamed from: h */
    private List<Layer> f3153h;
    /* renamed from: i */
    private Rect f3154i;
    /* renamed from: j */
    private float f3155j;
    /* renamed from: k */
    private float f3156k;
    /* renamed from: l */
    private float f3157l;

    /* renamed from: a */
    public void m4111a(Rect rect, float f, float f2, float f3, List<Layer> list, C0420f<Layer> c0420f, Map<String, List<Layer>> map, Map<String, C0967g> map2, C0434n<C0988d> c0434n, Map<String, C0983c> map3) {
        this.f3154i = rect;
        this.f3155j = f;
        this.f3156k = f2;
        this.f3157l = f3;
        this.f3153h = list;
        this.f3152g = c0420f;
        this.f3148c = map;
        this.f3149d = map2;
        this.f3151f = c0434n;
        this.f3150e = map3;
    }

    /* renamed from: a */
    public void m4112a(String str) {
        Log.w("LOTTIE", str);
        this.f3147b.add(str);
    }

    /* renamed from: a */
    public void m4113a(boolean z) {
        this.f3146a.m4232a(z);
    }

    /* renamed from: a */
    public C0976l m4109a() {
        return this.f3146a;
    }

    /* renamed from: a */
    public Layer m4110a(long j) {
        return (Layer) this.f3152g.m1539a(j);
    }

    /* renamed from: b */
    public Rect m4114b() {
        return this.f3154i;
    }

    /* renamed from: c */
    public float m4116c() {
        return (float) ((long) ((m4124k() / this.f3157l) * 1000.0f));
    }

    /* renamed from: d */
    public float m4117d() {
        return this.f3155j;
    }

    /* renamed from: e */
    public float m4118e() {
        return this.f3156k;
    }

    /* renamed from: f */
    public float m4119f() {
        return this.f3157l;
    }

    /* renamed from: g */
    public List<Layer> m4120g() {
        return this.f3153h;
    }

    /* renamed from: b */
    public List<Layer> m4115b(String str) {
        return (List) this.f3148c.get(str);
    }

    /* renamed from: h */
    public C0434n<C0988d> m4121h() {
        return this.f3151f;
    }

    /* renamed from: i */
    public Map<String, C0983c> m4122i() {
        return this.f3150e;
    }

    /* renamed from: j */
    public Map<String, C0967g> m4123j() {
        return this.f3149d;
    }

    /* renamed from: k */
    public float m4124k() {
        return this.f3156k - this.f3155j;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("LottieComposition:\n");
        for (Layer a : this.f3153h) {
            stringBuilder.append(a.m4283a("\t"));
        }
        return stringBuilder.toString();
    }
}
