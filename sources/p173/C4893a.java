package p173;

import android.os.AsyncTask;
import java.util.HashMap;
import java.util.Map;

/* renamed from: a */
public abstract class C4893a extends AsyncTask<String, String, String> {
    /* renamed from: a */
    public Map<String, String> f21920a = new HashMap();
    /* renamed from: b */
    String f21921b = "";

    /* renamed from: a */
    private java.lang.String m30251a(java.lang.String... r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = new org.apache.http.impl.client.DefaultHttpClient;
        r0.<init>();
        r1 = new org.apache.http.client.methods.HttpPost;
        r2 = 0;
        r5 = r5[r2];
        r1.<init>(r5);
        r5 = "Content-Type";	 Catch:{ ClientProtocolException -> 0x005e, ClientProtocolException -> 0x005e }
        r2 = "application/x-www-form-urlencoded;charset=UTF-8";	 Catch:{ ClientProtocolException -> 0x005e, ClientProtocolException -> 0x005e }
        r1.setHeader(r5, r2);	 Catch:{ ClientProtocolException -> 0x005e, ClientProtocolException -> 0x005e }
        r5 = new java.util.ArrayList;	 Catch:{ ClientProtocolException -> 0x005e, ClientProtocolException -> 0x005e }
        r5.<init>();	 Catch:{ ClientProtocolException -> 0x005e, ClientProtocolException -> 0x005e }
        r5 = r4.f21920a;	 Catch:{ ClientProtocolException -> 0x005e, ClientProtocolException -> 0x005e }
        r5 = p173.C4894b.m30255b(r5);	 Catch:{ ClientProtocolException -> 0x005e, ClientProtocolException -> 0x005e }
        r2 = new org.apache.http.client.entity.UrlEncodedFormEntity;	 Catch:{ ClientProtocolException -> 0x005e, ClientProtocolException -> 0x005e }
        r3 = "UTF-8";	 Catch:{ ClientProtocolException -> 0x005e, ClientProtocolException -> 0x005e }
        r2.<init>(r5, r3);	 Catch:{ ClientProtocolException -> 0x005e, ClientProtocolException -> 0x005e }
        r1.setEntity(r2);	 Catch:{ ClientProtocolException -> 0x005e, ClientProtocolException -> 0x005e }
        r5 = r0.execute(r1);	 Catch:{ ClientProtocolException -> 0x005e, ClientProtocolException -> 0x005e }
        r0 = new java.io.BufferedReader;	 Catch:{ ClientProtocolException -> 0x005e, ClientProtocolException -> 0x005e }
        r1 = new java.io.InputStreamReader;	 Catch:{ ClientProtocolException -> 0x005e, ClientProtocolException -> 0x005e }
        r5 = r5.getEntity();	 Catch:{ ClientProtocolException -> 0x005e, ClientProtocolException -> 0x005e }
        r5 = r5.getContent();	 Catch:{ ClientProtocolException -> 0x005e, ClientProtocolException -> 0x005e }
        r2 = "iso-8859-1";	 Catch:{ ClientProtocolException -> 0x005e, ClientProtocolException -> 0x005e }
        r1.<init>(r5, r2);	 Catch:{ ClientProtocolException -> 0x005e, ClientProtocolException -> 0x005e }
        r5 = 8;	 Catch:{ ClientProtocolException -> 0x005e, ClientProtocolException -> 0x005e }
        r0.<init>(r1, r5);	 Catch:{ ClientProtocolException -> 0x005e, ClientProtocolException -> 0x005e }
        r5 = new java.lang.StringBuilder;	 Catch:{ ClientProtocolException -> 0x005e, ClientProtocolException -> 0x005e }
        r5.<init>();	 Catch:{ ClientProtocolException -> 0x005e, ClientProtocolException -> 0x005e }
    L_0x0048:
        r1 = r0.readLine();	 Catch:{ ClientProtocolException -> 0x005e, ClientProtocolException -> 0x005e }
        if (r1 == 0) goto L_0x0052;	 Catch:{ ClientProtocolException -> 0x005e, ClientProtocolException -> 0x005e }
    L_0x004e:
        r5.append(r1);	 Catch:{ ClientProtocolException -> 0x005e, ClientProtocolException -> 0x005e }
        goto L_0x0048;	 Catch:{ ClientProtocolException -> 0x005e, ClientProtocolException -> 0x005e }
    L_0x0052:
        r0.close();	 Catch:{ ClientProtocolException -> 0x005e, ClientProtocolException -> 0x005e }
        r5 = r5.toString();	 Catch:{ ClientProtocolException -> 0x005e, ClientProtocolException -> 0x005e }
        r4.f21921b = r5;	 Catch:{ ClientProtocolException -> 0x005e, ClientProtocolException -> 0x005e }
        r5 = r4.f21921b;	 Catch:{ ClientProtocolException -> 0x005e, ClientProtocolException -> 0x005e }
        return r5;
    L_0x005e:
        r5 = r4.f21921b;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a(java.lang.String[]):java.lang.String");
    }

    /* renamed from: a */
    public abstract void mo5047a(String str);

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m30251a((String[]) objArr);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        super.onPostExecute(str);
        mo5047a(str);
    }
}
