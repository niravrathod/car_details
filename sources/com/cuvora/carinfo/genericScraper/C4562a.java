package com.cuvora.carinfo.genericScraper;

import android.content.Context;
import android.support.v4.content.C3124a;
import com.cuvora.carinfo.helpers.C1543g.C1542a;
import com.cuvora.carinfo.modes.GenericScraperContentType;
import com.cuvora.carinfo.modes.GenericScraperMethodType;
import com.google.gson.C4257m;
import java.io.IOException;
import java.util.Map.Entry;
import okhttp3.C2988w;
import okhttp3.C2990y.C2989a;
import okhttp3.C2991z;
import okhttp3.C4385q.C2978a;
import okhttp3.aa;

/* renamed from: com.cuvora.carinfo.genericScraper.a */
public class C4562a extends C3124a<C1529b> {
    /* renamed from: o */
    private Context f18919o;
    /* renamed from: p */
    private ScrapeResponse f18920p;
    /* renamed from: q */
    private String f18921q;

    /* renamed from: d */
    public /* synthetic */ Object mo3929d() {
        return m25133w();
    }

    public C4562a(Context context, ScrapeResponse scrapeResponse, String str) {
        super(context);
        this.f18919o = context;
        this.f18920p = scrapeResponse;
        this.f18921q = str;
    }

    /* renamed from: w */
    public C1529b m25133w() {
        C2989a c2989a = new C2989a();
        c2989a.m14608a(this.f18920p.m18503c());
        for (Entry entry : this.f18920p.m18505e().entrySet()) {
            c2989a.m14617b((String) entry.getKey(), (String) entry.getValue());
        }
        C1529b c1529b = new C1529b();
        c1529b.m5748b(this.f18920p.m18504d());
        aa a;
        if (this.f18920p.m18501a().equalsIgnoreCase(GenericScraperMethodType.POST.name())) {
            if (this.f18920p.m18502b().equalsIgnoreCase(GenericScraperContentType.APPLICATION_JSON.name())) {
                C4257m c4257m = new C4257m();
                for (Entry entry2 : this.f18920p.m18506f().entrySet()) {
                    c4257m.m23354a((String) entry2.getKey(), (String) entry2.getValue());
                }
                try {
                    a = new C2988w().m14581a(c2989a.m14614a(C2991z.m14632a(C1542a.f4673a, c4257m.toString())).m14620c()).mo3689a();
                    if (a.m14017h() != null) {
                        c1529b.m5746a(a.m14017h().m14033f());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    return null;
                }
            } else if (this.f18920p.m18502b().equalsIgnoreCase(GenericScraperContentType.FORM_PARAM.name())) {
                C2978a c2978a = new C2978a();
                for (Entry entry22 : this.f18920p.m18506f().entrySet()) {
                    c2978a.m14527a((String) entry22.getKey(), (String) entry22.getValue());
                }
                try {
                    a = new C2988w().m14581a(c2989a.m14614a(c2978a.m14528a()).m14620c()).mo3689a();
                    if (a.m14017h() != null) {
                        c1529b.m5746a(a.m14017h().m14033f());
                    }
                } catch (IOException e2) {
                    e2.printStackTrace();
                    return null;
                }
            }
        } else if (this.f18920p.m18501a().equalsIgnoreCase(GenericScraperMethodType.GET.name())) {
            try {
                a = new C2988w().m14581a(c2989a.m14620c()).mo3689a();
                if (a.m14017h() != null) {
                    c1529b.m5746a(a.m14017h().m14033f());
                }
            } catch (IOException e22) {
                e22.printStackTrace();
                return null;
            }
        }
        return c1529b;
    }
}
