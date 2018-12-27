package android.arch.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class LifecycleService extends Service implements C0023f {
    /* renamed from: a */
    private final C0034p f12711a = new C0034p(this);

    public void onCreate() {
        this.f12711a.m85a();
        super.onCreate();
    }

    public IBinder onBind(Intent intent) {
        this.f12711a.m86b();
        return null;
    }

    public void onStart(Intent intent, int i) {
        this.f12711a.m87c();
        super.onStart(intent, i);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }

    public void onDestroy() {
        this.f12711a.m88d();
        super.onDestroy();
    }

    public Lifecycle getLifecycle() {
        return this.f12711a.m89e();
    }
}
