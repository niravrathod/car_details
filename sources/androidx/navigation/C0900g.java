package androidx.navigation;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.p017f.C0429j;
import android.support.v4.p017f.C0434n;
import android.util.AttributeSet;
import androidx.navigation.C0909m.C0906a;
import androidx.navigation.p030a.C0890a.C0889a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: androidx.navigation.g */
public class C0900g {
    /* renamed from: a */
    private static final HashMap<String, Class> f3054a = new HashMap();
    /* renamed from: b */
    private final C0909m f3055b;
    /* renamed from: c */
    private C3281h f3056c;
    /* renamed from: d */
    private int f3057d;
    /* renamed from: e */
    private CharSequence f3058e;
    /* renamed from: f */
    private Bundle f3059f;
    /* renamed from: g */
    private ArrayList<C0895e> f3060g;
    /* renamed from: h */
    private C0434n<C0892c> f3061h;

    /* renamed from: a */
    protected static <C> Class<? extends C> m3911a(Context context, String str, Class<? extends C> cls) {
        if (str.charAt(0) == '.') {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(context.getPackageName());
            stringBuilder.append(str);
            str = stringBuilder.toString();
        }
        Class<? extends C> cls2 = (Class) f3054a.get(str);
        if (cls2 == null) {
            try {
                cls2 = Class.forName(str, true, context.getClassLoader());
                f3054a.put(str, cls2);
            } catch (Context context2) {
                throw new IllegalArgumentException(context2);
            }
        }
        if (cls.isAssignableFrom(cls2) != null) {
            return cls2;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" must be a subclass of ");
        stringBuilder.append(cls);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: a */
    static java.lang.String m3912a(android.content.Context r0, int r1) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r0 = r0.getResources();	 Catch:{ NotFoundException -> 0x0009 }
        r0 = r0.getResourceName(r1);	 Catch:{ NotFoundException -> 0x0009 }
        return r0;
    L_0x0009:
        r0 = java.lang.Integer.toString(r1);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.g.a(android.content.Context, int):java.lang.String");
    }

    public C0900g(C0909m<? extends C0900g> c0909m) {
        this.f3055b = c0909m;
    }

    /* renamed from: a */
    public void mo852a(Context context, AttributeSet attributeSet) {
        context = context.getResources().obtainAttributes(attributeSet, C0889a.Navigator);
        m3913a(context.getResourceId(C0889a.Navigator_android_id, 0));
        m3918a(context.getText(C0889a.Navigator_android_label));
        context.recycle();
    }

    /* renamed from: a */
    void m3917a(C3281h c3281h) {
        this.f3056c = c3281h;
    }

    /* renamed from: c */
    public C3281h m3921c() {
        return this.f3056c;
    }

    /* renamed from: d */
    public int m3923d() {
        return this.f3057d;
    }

    /* renamed from: a */
    public void m3913a(int i) {
        this.f3057d = i;
    }

    /* renamed from: a */
    public void m3918a(CharSequence charSequence) {
        this.f3058e = charSequence;
    }

    /* renamed from: e */
    public CharSequence m3924e() {
        return this.f3058e;
    }

    /* renamed from: f */
    public C0909m m3925f() {
        return this.f3055b;
    }

    /* renamed from: g */
    public Bundle m3926g() {
        if (this.f3059f == null) {
            this.f3059f = new Bundle();
        }
        return this.f3059f;
    }

    /* renamed from: c */
    public void m3922c(String str) {
        if (this.f3060g == null) {
            this.f3060g = new ArrayList();
        }
        this.f3060g.add(new C0895e(str));
    }

    /* renamed from: b */
    C0429j<C0900g, Bundle> mo862b(Uri uri) {
        if (this.f3060g == null) {
            return null;
        }
        Iterator it = this.f3060g.iterator();
        while (it.hasNext()) {
            Bundle a = ((C0895e) it.next()).m3906a(uri);
            if (a != null) {
                return C0429j.m1570a(this, a);
            }
        }
        return null;
    }

    /* renamed from: h */
    int[] m3927h() {
        ArrayDeque arrayDeque = new ArrayDeque();
        C0900g c0900g = this;
        while (true) {
            C0900g c = c0900g.m3921c();
            if (c == null || c.m16918a() != c0900g.m3923d()) {
                arrayDeque.addFirst(c0900g);
            }
            if (c == null) {
                break;
            }
            c0900g = c;
        }
        int[] iArr = new int[arrayDeque.size()];
        int i = 0;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            int i2 = i + 1;
            iArr[i] = ((C0900g) it.next()).m3923d();
            i = i2;
        }
        return iArr;
    }

    /* renamed from: b */
    public C0892c m3920b(int i) {
        C0892c c0892c = this.f3061h == null ? null : (C0892c) this.f3061h.m1590a(i);
        if (c0892c != null) {
            return c0892c;
        }
        if (m3921c() != null) {
            return m3921c().m3920b(i);
        }
        return null;
    }

    /* renamed from: a */
    public void m3914a(int i, C0892c c0892c) {
        if (i != 0) {
            if (this.f3061h == null) {
                this.f3061h = new C0434n();
            }
            this.f3061h.m1594b(i, c0892c);
            return;
        }
        throw new IllegalArgumentException("Cannot have an action with actionId 0");
    }

    /* renamed from: a */
    public void m3916a(Bundle bundle, C0904k c0904k, C0906a c0906a) {
        Bundle g = m3926g();
        Bundle bundle2 = new Bundle();
        bundle2.putAll(g);
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        this.f3055b.mo853a(this, bundle2, c0904k, c0906a);
    }
}
