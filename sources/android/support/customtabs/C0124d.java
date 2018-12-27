package android.support.customtabs;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.C0128h.C3033a;

/* renamed from: android.support.customtabs.d */
public abstract class C0124d implements ServiceConnection {
    /* renamed from: a */
    public abstract void mo2432a(ComponentName componentName, C0120b c0120b);

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        mo2432a(componentName, new C0120b(this, C3033a.m14845a(iBinder), componentName) {
            /* renamed from: a */
            final /* synthetic */ C0124d f12775a;
        });
    }
}
