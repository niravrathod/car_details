package com.cuvora.carinfo.loaders;

import android.content.Context;
import android.support.v4.content.C3124a;
import com.cuvora.carinfo.helpers.C1541e;
import com.cuvora.carinfo.helpers.C1543g.C1542a;
import com.cuvora.carinfo.helpers.C1570t;
import java.io.IOException;
import okhttp3.C2988w;
import okhttp3.C2990y.C2989a;
import okhttp3.C2991z;
import okhttp3.aa;
import p000a.C0002c;
import p000a.C0004e;

/* renamed from: com.cuvora.carinfo.loaders.m */
public class C4570m extends C3124a<String> {
    /* renamed from: o */
    private String f18938o;

    /* renamed from: d */
    public /* synthetic */ Object mo3929d() {
        return m25165w();
    }

    public C4570m(Context context, String str) {
        super(context);
        this.f18938o = str;
    }

    /* renamed from: w */
    public String m25165w() {
        C0004e a = C0002c.m1a(this.f18938o);
        C2989a c2989a = new C2989a();
        c2989a.m14608a(C1541e.m5852a("MPaivahanUrl"));
        c2989a.m14617b("Auth-Token", a.m4a());
        c2989a.m14617b("Content-Type", "application/json");
        c2989a.m14617b("Accept", "application/json");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(a.m7b().toString().getBytes().length);
        c2989a.m14617b("Content-Length", stringBuilder.toString());
        c2989a.m14617b("Content-Language", "en-US");
        c2989a.m14617b("Source-Name", "mParivahan");
        c2989a.m14617b("Host", "mparivahan.com");
        c2989a.m14617b("Content-Encoding", "gzip");
        try {
            aa a2 = new C2988w().m14581a(c2989a.m14614a(C1570t.m5976a(C1570t.m5995b(C2991z.m14632a(C1542a.f4673a, a.m7b().toString())))).m14620c()).mo3689a();
            String f = a2.m14017h().m14033f();
            if (a2.m14013d()) {
                String b = C0002c.m2b(f);
                if (b != null) {
                    return b;
                }
            }
            C1570t.m5988a(a2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
