package android.support.v4.app;

import android.app.Service;
import android.content.ComponentName;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class JobIntentService extends Service {
    /* renamed from: e */
    static final Object f1120e = new Object();
    /* renamed from: f */
    static final HashMap<ComponentName, Object> f1121f = new HashMap();
    /* renamed from: a */
    boolean f1122a = false;
    /* renamed from: b */
    boolean f1123b = false;
    /* renamed from: c */
    boolean f1124c = false;
    /* renamed from: d */
    final ArrayList<Object> f1125d;

    public JobIntentService() {
        if (VERSION.SDK_INT >= 26) {
            this.f1125d = null;
        } else {
            this.f1125d = new ArrayList();
        }
    }
}
