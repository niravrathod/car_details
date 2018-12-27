package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;

@zzaer
public final class zzabq extends zzabr implements zzu<zzasg> {
    /* renamed from: a */
    private final zzasg f16755a;
    /* renamed from: b */
    private final Context f16756b;
    /* renamed from: c */
    private final WindowManager f16757c;
    /* renamed from: d */
    private final zznh f16758d;
    /* renamed from: e */
    private DisplayMetrics f16759e;
    /* renamed from: f */
    private float f16760f;
    /* renamed from: g */
    private int f16761g = -1;
    /* renamed from: h */
    private int f16762h = -1;
    /* renamed from: i */
    private int f16763i;
    /* renamed from: j */
    private int f16764j = -1;
    /* renamed from: k */
    private int f16765k = -1;
    /* renamed from: l */
    private int f16766l = -1;
    /* renamed from: m */
    private int f16767m = -1;

    public zzabq(zzasg zzasg, Context context, zznh zznh) {
        super(zzasg);
        this.f16755a = zzasg;
        this.f16756b = context;
        this.f16758d = zznh;
        this.f16757c = (WindowManager) context.getSystemService("window");
    }

    /* renamed from: a */
    public final void m21074a(int i, int i2) {
        int i3 = 0;
        if (this.f16756b instanceof Activity) {
            i3 = zzbv.zzek().m9845c((Activity) this.f16756b)[0];
        }
        if (this.f16755a.mo4205s() == null || !this.f16755a.mo4205s().m10134e()) {
            zzkd.m10709a();
            this.f16766l = zzaoa.m9962b(this.f16756b, this.f16755a.getWidth());
            zzkd.m10709a();
            this.f16767m = zzaoa.m9962b(this.f16756b, this.f16755a.getHeight());
        }
        m9446b(i, i2 - i3, this.f16766l, this.f16767m);
        this.f16755a.mo4782u().mo2390a(i, i2);
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        int[] iArr;
        int b;
        this.f16759e = new DisplayMetrics();
        obj = this.f16757c.getDefaultDisplay();
        obj.getMetrics(this.f16759e);
        this.f16760f = this.f16759e.density;
        this.f16763i = obj.getRotation();
        zzkd.m10709a();
        this.f16761g = zzaoa.m9963b(this.f16759e, this.f16759e.widthPixels);
        zzkd.m10709a();
        this.f16762h = zzaoa.m9963b(this.f16759e, this.f16759e.heightPixels);
        Activity d = this.f16755a.mo4199d();
        if (d != null) {
            if (d.getWindow() != null) {
                zzbv.zzek();
                obj = zzalo.m9802a(d);
                zzkd.m10709a();
                this.f16764j = zzaoa.m9963b(this.f16759e, obj[0]);
                zzkd.m10709a();
                this.f16765k = zzaoa.m9963b(this.f16759e, obj[1]);
                if (this.f16755a.mo4205s().m10134e() == null) {
                    this.f16766l = this.f16761g;
                    this.f16767m = this.f16762h;
                } else {
                    this.f16755a.measure(0, 0);
                }
                m9444a(this.f16761g, this.f16762h, this.f16764j, this.f16765k, this.f16760f, this.f16763i);
                this.f16755a.mo2748a("onDeviceFeaturesReceived", new zzabn(new zzabp().m9439b(this.f16758d.m10871a()).m9438a(this.f16758d.m10872b()).m9440c(this.f16758d.m10874d()).m9441d(this.f16758d.m10873c()).m9442e(true)).m9432a());
                iArr = new int[2];
                this.f16755a.getLocationOnScreen(iArr);
                zzkd.m10709a();
                b = zzaoa.m9962b(this.f16756b, iArr[0]);
                zzkd.m10709a();
                m21074a(b, zzaoa.m9962b(this.f16756b, iArr[1]));
                if (zzaok.m10000a(2) != null) {
                    zzaok.m10005d("Dispatching Ready Event.");
                }
                m9447b(this.f16755a.mo4204i().f19893a);
            }
        }
        this.f16764j = this.f16761g;
        this.f16765k = this.f16762h;
        if (this.f16755a.mo4205s().m10134e() == null) {
            this.f16755a.measure(0, 0);
        } else {
            this.f16766l = this.f16761g;
            this.f16767m = this.f16762h;
        }
        m9444a(this.f16761g, this.f16762h, this.f16764j, this.f16765k, this.f16760f, this.f16763i);
        this.f16755a.mo2748a("onDeviceFeaturesReceived", new zzabn(new zzabp().m9439b(this.f16758d.m10871a()).m9438a(this.f16758d.m10872b()).m9440c(this.f16758d.m10874d()).m9441d(this.f16758d.m10873c()).m9442e(true)).m9432a());
        iArr = new int[2];
        this.f16755a.getLocationOnScreen(iArr);
        zzkd.m10709a();
        b = zzaoa.m9962b(this.f16756b, iArr[0]);
        zzkd.m10709a();
        m21074a(b, zzaoa.m9962b(this.f16756b, iArr[1]));
        if (zzaok.m10000a(2) != null) {
            zzaok.m10005d("Dispatching Ready Event.");
        }
        m9447b(this.f16755a.mo4204i().f19893a);
    }
}
