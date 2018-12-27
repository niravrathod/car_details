package com.cuvora.carinfo.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import com.cuvora.carinfo.helpers.C1540d;
import com.cuvora.carinfo.helpers.C1541e;
import com.cuvora.carinfo.helpers.C1543g;
import com.cuvora.carinfo.helpers.C1543g.C1542a;
import com.cuvora.carinfo.helpers.C1562q;
import com.cuvora.carinfo.helpers.C1565s;
import com.cuvora.carinfo.helpers.C1570t;
import java.util.ArrayList;
import java.util.List;
import okhttp3.C2988w;
import okhttp3.C2990y.C2989a;
import okhttp3.C2991z;
import okhttp3.C4385q.C2978a;
import okhttp3.aa;
import org.json.JSONObject;
import p000a.C0002c;

public class ScraperService extends Service {
    /* renamed from: a */
    private String f4800a;
    /* renamed from: b */
    private Integer f4801b;
    /* renamed from: c */
    private int f4802c;
    /* renamed from: d */
    private String f4803d;
    /* renamed from: e */
    private int f4804e = 0;
    /* renamed from: f */
    private List<AsyncTask> f4805f = new ArrayList();

    /* renamed from: com.cuvora.carinfo.service.ScraperService$a */
    public class C1584a extends AsyncTask<Void, Void, String> {
        /* renamed from: a */
        final /* synthetic */ ScraperService f4793a;
        /* renamed from: b */
        private String f4794b;
        /* renamed from: c */
        private Context f4795c;

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return m6095a((Void[]) objArr);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            m6096a((String) obj);
        }

        public C1584a(ScraperService scraperService, Context context, String str) {
            this.f4793a = scraperService;
            this.f4794b = str;
            this.f4795c = context;
        }

        /* renamed from: a */
        protected String m6095a(Void... voidArr) {
            voidArr = C0002c.m1a(this.f4794b);
            C2989a c2989a = new C2989a();
            c2989a.m14608a(C1541e.m5852a("MPaivahanUrl"));
            c2989a.m14617b("Auth-Token", voidArr.m4a());
            c2989a.m14617b("Content-Type", "application/json");
            c2989a.m14617b("Accept", "application/json");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(voidArr.m7b().toString().getBytes().length);
            c2989a.m14617b("Content-Length", stringBuilder.toString());
            c2989a.m14617b("Content-Language", "en-US");
            c2989a.m14617b("Source-Name", "mParivahan");
            c2989a.m14617b("Host", "mparivahan.com");
            try {
                aa a = new C2988w().m14581a(c2989a.m14614a(C2991z.m14632a(C1542a.f4673a, voidArr.m7b().toString())).m14620c()).mo3689a();
                String f = a.m14017h().m14033f();
                if (a.m14013d()) {
                    voidArr = C0002c.m2b(f);
                    if (voidArr != null) {
                        return voidArr;
                    }
                }
                C1570t.m5988a(a);
            } catch (Void[] voidArr2) {
                voidArr2.printStackTrace();
            }
            return null;
        }

        /* renamed from: a */
        protected void m6096a(String str) {
            super.onPostExecute(str);
            if (C1562q.m5946a(str)) {
                AsyncTask c1585b = new C1585b(this.f4793a, this.f4795c, this.f4794b, str);
                this.f4793a.f4805f.add(c1585b);
                c1585b.execute(new Void[null]);
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.service.ScraperService$b */
    public class C1585b extends AsyncTask<Void, Void, Boolean> {
        /* renamed from: a */
        final /* synthetic */ ScraperService f4796a;
        /* renamed from: b */
        private Context f4797b;
        /* renamed from: c */
        private String f4798c;
        /* renamed from: d */
        private String f4799d;

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return m6097a((Void[]) objArr);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            m6098a((Boolean) obj);
        }

        public C1585b(ScraperService scraperService, Context context, String str, String str2) {
            this.f4796a = scraperService;
            this.f4797b = context;
            this.f4798c = str;
            this.f4799d = str2;
        }

        /* renamed from: a */
        protected Boolean m6097a(Void... voidArr) {
            String b = C1565s.m5957b(this.f4797b);
            C2991z a = new C2978a().m14527a("vehicle_num", this.f4798c).m14527a("result", this.f4799d).m14527a("autoscraped", "true").m14527a("clientId", "echallan").m14528a();
            try {
                return Boolean.valueOf(((aa) C1543g.m5859a().m5865a(aa.class, b, this.f4798c, a, 1)).m14013d());
            } catch (Void[] voidArr2) {
                voidArr2.printStackTrace();
                return null;
            }
        }

        /* renamed from: a */
        protected void m6098a(Boolean bool) {
            super.onPostExecute(bool);
            try {
                Integer d = C1570t.m6011d(this.f4798c);
                if (d == null) {
                    this.f4796a.stopSelf();
                    C1540d.m5810a(this.f4796a.f4803d, this.f4796a.f4804e);
                    return;
                }
                if (!(bool == null || bool.booleanValue() == null)) {
                    this.f4796a.f4804e = this.f4796a.f4804e + 1;
                }
                bool = Integer.valueOf(d.intValue() + 1);
                if (bool.equals(this.f4796a.f4801b)) {
                    bool = Integer.valueOf(bool.intValue() + 1);
                }
                if (bool.intValue() <= Math.min(9999, this.f4796a.f4801b.intValue() + this.f4796a.f4802c)) {
                    ScraperService scraperService = this.f4796a;
                    Context context = this.f4797b;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(this.f4796a.f4800a);
                    stringBuilder.append(bool);
                    AsyncTask c1584a = new C1584a(scraperService, context, stringBuilder.toString());
                    this.f4796a.f4805f.add(c1584a);
                    c1584a.execute(new Void[null]);
                } else {
                    C1540d.m5810a(this.f4796a.f4803d, this.f4796a.f4804e);
                    this.f4796a.stopSelf();
                }
            } catch (Boolean bool2) {
                bool2.printStackTrace();
                this.f4796a.stopSelf();
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            this.f4803d = intent.getStringExtra("KEY_VEHICLE_NUMBER");
            m6100a(this.f4803d);
        }
        return super.onStartCommand(intent, i, i2);
    }

    /* renamed from: a */
    private void m6100a(String str) {
        JSONObject d = C1541e.m5857d("scraperVahanSettings");
        try {
            if (d.getBoolean("enabled")) {
                this.f4800a = str.substring(0, str.length() - 4);
                this.f4801b = C1570t.m6011d(str);
                if (this.f4801b != null) {
                    this.f4802c = d.getInt("scrapeRange");
                    str = Math.max(0, this.f4801b.intValue() - this.f4802c);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(this.f4800a);
                    stringBuilder.append(str);
                    AsyncTask c1584a = new C1584a(this, this, stringBuilder.toString());
                    this.f4805f.add(c1584a);
                    c1584a.execute(new Void[0]);
                    return;
                }
                stopSelf();
            }
        } catch (String str2) {
            str2.printStackTrace();
            stopSelf();
        }
    }

    public void onDestroy() {
        for (AsyncTask asyncTask : this.f4805f) {
            if (!(asyncTask == null || asyncTask.isCancelled())) {
                asyncTask.cancel(true);
            }
        }
        super.onDestroy();
    }
}
