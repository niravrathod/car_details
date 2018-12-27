package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.ad;
import java.util.ArrayDeque;
import java.util.Iterator;

/* renamed from: androidx.navigation.f */
public class C0896f {
    /* renamed from: a */
    private final Context f3050a;
    /* renamed from: b */
    private final Intent f3051b;
    /* renamed from: c */
    private C3281h f3052c;
    /* renamed from: d */
    private int f3053d;

    public C0896f(Context context) {
        this.f3050a = context;
        if ((this.f3050a instanceof Activity) != null) {
            this.f3051b = new Intent(this.f3050a, this.f3050a.getClass());
        } else {
            context = this.f3050a.getPackageManager().getLaunchIntentForPackage(this.f3050a.getPackageName());
            if (context == null) {
                context = new Intent();
            }
            this.f3051b = context;
        }
        this.f3051b.addFlags(268468224);
    }

    C0896f(C0894d c0894d) {
        this(c0894d.m3886a());
        this.f3052c = c0894d.m3903g();
    }

    /* renamed from: a */
    public C0896f m3909a(int i) {
        this.f3053d = i;
        if (this.f3052c != 0) {
            m3907b();
        }
        return this;
    }

    /* renamed from: b */
    private void m3907b() {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(this.f3052c);
        C0900g c0900g = null;
        while (!arrayDeque.isEmpty() && c0900g == null) {
            C0900g c0900g2 = (C0900g) arrayDeque.poll();
            if (c0900g2.m3923d() == this.f3053d) {
                c0900g = c0900g2;
            } else if (c0900g2 instanceof C3281h) {
                Iterator it = ((C3281h) c0900g2).iterator();
                while (it.hasNext()) {
                    arrayDeque.add((C0900g) it.next());
                }
            }
        }
        if (c0900g != null) {
            this.f3051b.putExtra("android-support-nav:controller:deepLinkIds", c0900g.m3927h());
            return;
        }
        String a = C0900g.m3912a(this.f3050a, this.f3053d);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("navigation destination ");
        stringBuilder.append(a);
        stringBuilder.append(" is unknown to this NavController");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: a */
    public ad m3908a() {
        if (this.f3051b.getIntArrayExtra("android-support-nav:controller:deepLinkIds") != null) {
            ad b = ad.m1156a(this.f3050a).m1163b(new Intent(this.f3051b));
            for (int i = 0; i < b.m1157a(); i++) {
                b.m1158a(i).putExtra("android-support-nav:controller:deepLinkIntent", this.f3051b);
            }
            return b;
        } else if (this.f3052c == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link");
        } else {
            throw new IllegalStateException("You must call setDestination() before constructing the deep link");
        }
    }
}
