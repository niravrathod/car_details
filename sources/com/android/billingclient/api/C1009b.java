package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import com.android.billingclient.api.C1025g.C1024a;

/* renamed from: com.android.billingclient.api.b */
public abstract class C1009b {

    /* renamed from: com.android.billingclient.api.b$a */
    public static final class C1008a {
        /* renamed from: a */
        private final Context f3378a;
        /* renamed from: b */
        private C1027i f3379b;

        private C1008a(Context context) {
            this.f3378a = context;
        }

        /* renamed from: a */
        public C1008a m4343a(C1027i c1027i) {
            this.f3379b = c1027i;
            return this;
        }

        /* renamed from: a */
        public C1009b m4344a() {
            if (this.f3378a == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            } else if (this.f3379b != null) {
                return new C3330c(this.f3378a, this.f3379b);
            } else {
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
        }
    }

    /* renamed from: a */
    public abstract int mo889a(Activity activity, C1019e c1019e);

    /* renamed from: a */
    public abstract int mo890a(String str);

    /* renamed from: a */
    public abstract void mo891a(C1016d c1016d);

    /* renamed from: a */
    public abstract void mo892a(C1032k c1032k, C1033l c1033l);

    /* renamed from: a */
    public abstract void mo893a(String str, C1026h c1026h);

    /* renamed from: a */
    public abstract boolean mo894a();

    /* renamed from: b */
    public abstract C1024a mo895b(String str);

    /* renamed from: b */
    public abstract void mo896b();

    /* renamed from: a */
    public static C1008a m4345a(Context context) {
        return new C1008a(context);
    }
}
