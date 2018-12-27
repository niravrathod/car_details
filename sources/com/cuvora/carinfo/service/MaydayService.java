package com.cuvora.carinfo.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import com.cuvora.carinfo.genericScraper.C1529b;
import com.cuvora.carinfo.helpers.C1540d;
import com.cuvora.carinfo.helpers.C1543g;
import com.cuvora.carinfo.helpers.C1543g.C1542a;
import com.cuvora.carinfo.helpers.C1545h;
import com.cuvora.carinfo.helpers.C1562q;
import com.cuvora.carinfo.helpers.C1565s;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.models.Mayday;
import com.cuvora.carinfo.models.Response;
import com.cuvora.carinfo.modes.GenericScraperContentType;
import com.cuvora.carinfo.modes.GenericScraperMethodType;
import com.google.gson.C4257m;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import okhttp3.C2988w;
import okhttp3.C2990y.C2989a;
import okhttp3.C2991z;
import okhttp3.C4385q.C2978a;

public class MaydayService extends Service {
    /* renamed from: a */
    private List<AsyncTask> f4792a = new ArrayList();

    /* renamed from: com.cuvora.carinfo.service.MaydayService$a */
    public class C1582a extends AsyncTask<Void, Void, C1529b> {
        /* renamed from: a */
        final /* synthetic */ MaydayService f4784a;
        /* renamed from: b */
        private Context f4785b;
        /* renamed from: c */
        private Mayday f4786c;

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return m6089a((Void[]) objArr);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            m6090a((C1529b) obj);
        }

        public C1582a(MaydayService maydayService, Context context, Mayday mayday) {
            this.f4784a = maydayService;
            this.f4785b = context;
            this.f4786c = mayday;
        }

        /* renamed from: a */
        protected C1529b m6089a(Void... voidArr) {
            voidArr = this.f4786c.getScrapeResponse();
            C2989a c2989a = new C2989a();
            c2989a.m14608a(voidArr.m18503c());
            for (Entry entry : voidArr.m18505e().entrySet()) {
                c2989a.m14617b((String) entry.getKey(), (String) entry.getValue());
            }
            C1529b c1529b = new C1529b();
            c1529b.m5748b(voidArr.m18504d());
            if (voidArr.m18501a().equalsIgnoreCase(GenericScraperMethodType.POST.name())) {
                if (voidArr.m18502b().equalsIgnoreCase(GenericScraperContentType.APPLICATION_JSON.name())) {
                    C4257m c4257m = new C4257m();
                    for (Entry entry2 : voidArr.m18506f().entrySet()) {
                        c4257m.m23354a((String) entry2.getKey(), (String) entry2.getValue());
                    }
                    try {
                        c1529b.m5746a(new C2988w().m14581a(c2989a.m14617b("Content-Encoding", "gzip").m14614a(C1570t.m5976a(C1570t.m5995b(C2991z.m14632a(C1542a.f4673a, c4257m.toString())))).m14620c()).mo3689a().m14017h().m14033f());
                    } catch (Void[] voidArr2) {
                        voidArr2.printStackTrace();
                        return null;
                    }
                } else if (voidArr2.m18502b().equalsIgnoreCase(GenericScraperContentType.FORM_PARAM.name())) {
                    C2978a c2978a = new C2978a();
                    for (Entry entry3 : voidArr2.m18506f().entrySet()) {
                        c2978a.m14527a((String) entry3.getKey(), (String) entry3.getValue());
                    }
                    C2991z a = c2978a.m14528a();
                    try {
                        c1529b.m5746a((String) C1543g.m5859a().m5865a(String.class, voidArr2.m18503c(), this.f4786c.getNumber(), a, 1));
                    } catch (Void[] voidArr22) {
                        voidArr22.printStackTrace();
                        return null;
                    }
                }
            } else if (voidArr22.m18501a().equalsIgnoreCase(GenericScraperMethodType.GET.name())) {
                try {
                    c1529b.m5746a((String) C1543g.m5859a().m5867a(String.class, voidArr22.m18503c(), this.f4786c.getNumber(), new int[0]));
                } catch (Void[] voidArr222) {
                    voidArr222.printStackTrace();
                    return null;
                }
            }
            return c1529b;
        }

        /* renamed from: a */
        protected void m6090a(C1529b c1529b) {
            super.onPostExecute(c1529b);
            if (c1529b == null || !C1562q.m5946a(c1529b.m5745a())) {
                this.f4784a.stopSelf();
                return;
            }
            AsyncTask c1583b = new C1583b(this.f4784a, this.f4785b, this.f4786c.getNumber(), c1529b.m5745a(), c1529b.m5747b());
            this.f4784a.f4792a.add(c1583b);
            c1583b.execute(new Void[null]);
        }
    }

    /* renamed from: com.cuvora.carinfo.service.MaydayService$b */
    public class C1583b extends AsyncTask<Void, Void, Response> {
        /* renamed from: a */
        final /* synthetic */ MaydayService f4787a;
        /* renamed from: b */
        private Context f4788b;
        /* renamed from: c */
        private String f4789c;
        /* renamed from: d */
        private String f4790d;
        /* renamed from: e */
        private String f4791e;

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return m6091a((Void[]) objArr);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            m6092a((Response) obj);
        }

        public C1583b(MaydayService maydayService, Context context, String str, String str2, String str3) {
            this.f4787a = maydayService;
            this.f4788b = context;
            this.f4789c = str;
            this.f4790d = str2;
            this.f4791e = str3;
        }

        /* renamed from: a */
        protected Response m6091a(Void... voidArr) {
            String b = C1565s.m5957b(this.f4788b);
            voidArr = new C2978a().m14527a("vehicle_num", this.f4789c).m14527a("result", this.f4790d);
            voidArr.m14527a("clientId", this.f4791e);
            C2991z a = voidArr.m14528a();
            try {
                voidArr = C1545h.m5878b((String) C1543g.m5859a().m5865a(String.class, b, this.f4789c, a, 1));
                if (voidArr != null) {
                    return voidArr.getResponse();
                }
            } catch (Void[] voidArr2) {
                voidArr2.printStackTrace();
            }
            return null;
        }

        /* renamed from: a */
        protected void m6092a(Response response) {
            super.onPostExecute(response);
            if (response != null) {
                C1540d.m5826e(this.f4789c);
            }
            this.f4787a.stopSelf();
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            m6094a((Mayday) intent.getSerializableExtra("KEY_MAYDAY"));
        }
        return super.onStartCommand(intent, i, i2);
    }

    /* renamed from: a */
    private void m6094a(Mayday mayday) {
        AsyncTask c1582a = new C1582a(this, this, mayday);
        this.f4792a.add(c1582a);
        c1582a.execute(new Void[null]);
    }

    public void onDestroy() {
        for (AsyncTask asyncTask : this.f4792a) {
            if (!(asyncTask == null || asyncTask.isCancelled())) {
                asyncTask.cancel(true);
            }
        }
        super.onDestroy();
    }
}
