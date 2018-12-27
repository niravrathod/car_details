package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzck;
import com.google.android.gms.internal.ads.zzkd;
import com.google.android.gms.internal.ads.zznw;
import java.util.concurrent.TimeUnit;

final class ad extends AsyncTask<Void, Void, String> {
    /* renamed from: a */
    private final /* synthetic */ zzbp f7641a;

    private ad(zzbp zzbp) {
        this.f7641a = zzbp;
    }

    /* renamed from: a */
    private final String m8771a(Void... voidArr) {
        try {
            this.f7641a.f19594h = (zzck) this.f7641a.f19589c.get(((Long) zzkd.m10713e().m10897a(zznw.bR)).longValue(), TimeUnit.MILLISECONDS);
        } catch (Void[] voidArr2) {
            zzaok.m10004c("", voidArr2);
        }
        return this.f7641a.m25973a();
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        if (this.f7641a.f19592f != null && str != null) {
            this.f7641a.f19592f.loadUrl(str);
        }
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m8771a((Void[]) objArr);
    }
}
