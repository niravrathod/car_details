package io.branch.referral.util;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import io.branch.referral.SharingHelper.SHARE_WITH;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.branch.referral.util.a */
public class C2758a {
    /* renamed from: a */
    final Context f11766a;
    /* renamed from: b */
    private Drawable f11767b;
    /* renamed from: c */
    private String f11768c;
    /* renamed from: d */
    private Drawable f11769d;
    /* renamed from: e */
    private String f11770e;
    /* renamed from: f */
    private String f11771f;
    /* renamed from: g */
    private final String f11772g;
    /* renamed from: h */
    private final String f11773h;
    /* renamed from: i */
    private final ArrayList<SHARE_WITH> f11774i;
    /* renamed from: j */
    private String f11775j;
    /* renamed from: k */
    private int f11776k = -1;
    /* renamed from: l */
    private int f11777l = -1;
    /* renamed from: m */
    private boolean f11778m;
    /* renamed from: n */
    private int f11779n = -1;
    /* renamed from: o */
    private int f11780o = 50;
    /* renamed from: p */
    private String f11781p = null;
    /* renamed from: q */
    private View f11782q = null;
    /* renamed from: r */
    private List<String> f11783r = new ArrayList();
    /* renamed from: s */
    private List<String> f11784s = new ArrayList();

    public C2758a(Context context, String str, String str2) {
        this.f11766a = context;
        this.f11767b = null;
        this.f11768c = null;
        this.f11769d = null;
        this.f11770e = null;
        this.f11771f = null;
        this.f11774i = new ArrayList();
        this.f11775j = null;
        this.f11772g = str;
        this.f11773h = str2;
    }

    /* renamed from: a */
    public C2758a m13455a(Drawable drawable, String str) {
        this.f11767b = drawable;
        this.f11768c = str;
        return this;
    }

    /* renamed from: a */
    public C2758a m13456a(Drawable drawable, String str, String str2) {
        this.f11769d = drawable;
        this.f11770e = str;
        this.f11771f = str2;
        return this;
    }

    /* renamed from: a */
    public C2758a m13457a(SHARE_WITH share_with) {
        this.f11774i.add(share_with);
        return this;
    }

    /* renamed from: a */
    public C2758a m13459a(boolean z) {
        this.f11778m = z;
        return this;
    }

    /* renamed from: a */
    public C2758a m13458a(String str) {
        this.f11781p = str;
        return this;
    }

    /* renamed from: a */
    public List<String> m13460a() {
        return this.f11784s;
    }

    /* renamed from: b */
    public List<String> m13461b() {
        return this.f11783r;
    }

    /* renamed from: c */
    public ArrayList<SHARE_WITH> m13462c() {
        return this.f11774i;
    }

    /* renamed from: d */
    public Drawable m13463d() {
        return this.f11769d;
    }

    /* renamed from: e */
    public Drawable m13464e() {
        return this.f11767b;
    }

    /* renamed from: f */
    public String m13465f() {
        return this.f11773h;
    }

    /* renamed from: g */
    public String m13466g() {
        return this.f11772g;
    }

    /* renamed from: h */
    public String m13467h() {
        return this.f11770e;
    }

    /* renamed from: i */
    public String m13468i() {
        return this.f11775j;
    }

    /* renamed from: j */
    public String m13469j() {
        return this.f11768c;
    }

    /* renamed from: k */
    public String m13470k() {
        return this.f11771f;
    }

    /* renamed from: l */
    public int m13471l() {
        return this.f11779n;
    }

    /* renamed from: m */
    public String m13472m() {
        return this.f11781p;
    }

    /* renamed from: n */
    public View m13473n() {
        return this.f11782q;
    }

    /* renamed from: o */
    public boolean m13474o() {
        return this.f11778m;
    }

    /* renamed from: p */
    public int m13475p() {
        return this.f11777l;
    }

    /* renamed from: q */
    public int m13476q() {
        return this.f11776k;
    }

    /* renamed from: r */
    public int m13477r() {
        return this.f11780o;
    }
}
