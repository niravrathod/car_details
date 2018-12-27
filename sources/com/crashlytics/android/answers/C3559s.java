package com.crashlytics.android.answers;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.crashlytics.android.answers.BackgroundManager.Listener;
import io.fabric.sdk.android.C2764a;
import io.fabric.sdk.android.C2766c;
import io.fabric.sdk.android.C2771h;
import io.fabric.sdk.android.C2774k;
import io.fabric.sdk.android.services.common.C2802l;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.network.C2834c;
import io.fabric.sdk.android.services.network.C4317b;
import io.fabric.sdk.android.services.p148c.C4297b;
import io.fabric.sdk.android.services.settings.C2839b;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.crashlytics.android.answers.s */
class C3559s implements Listener {
    /* renamed from: a */
    final C3551c f14657a;
    /* renamed from: b */
    final C2764a f14658b;
    /* renamed from: c */
    final BackgroundManager f14659c;
    /* renamed from: d */
    final C1330f f14660d;
    /* renamed from: e */
    private final long f14661e;

    /* renamed from: a */
    public void m18056a(String str) {
    }

    /* renamed from: a */
    public static C3559s m18049a(C2771h c2771h, Context context, IdManager idManager, String str, String str2, long j) {
        Context context2 = context;
        IdManager idManager2 = idManager;
        C1336w c1336w = new C1336w(context, idManager, str, str2);
        C2771h c2771h2 = c2771h;
        C1329d c1329d = new C1329d(context, new C4297b(c2771h));
        C2834c c4317b = new C4317b(C2766c.m13524h());
        C2764a c2764a = new C2764a(context);
        ScheduledExecutorService b = C2802l.m13691b("Answers Events Handler");
        BackgroundManager backgroundManager = new BackgroundManager(b);
        return new C3559s(new C3551c(c2771h2, context, c1329d, c1336w, c4317b, b, new C1332k(context)), c2764a, backgroundManager, C1330f.m5377a(context), j);
    }

    C3559s(C3551c c3551c, C2764a c2764a, BackgroundManager backgroundManager, C1330f c1330f, long j) {
        this.f14657a = c3551c;
        this.f14658b = c2764a;
        this.f14659c = backgroundManager;
        this.f14660d = c1330f;
        this.f14661e = j;
    }

    /* renamed from: a */
    public void m18050a() {
        this.f14657a.m18027b();
        this.f14658b.m13510a(new C3552e(this, this.f14659c));
        this.f14659c.m5354a((Listener) this);
        if (m18059c()) {
            m18051a(this.f14661e);
            this.f14660d.m5378a();
        }
    }

    /* renamed from: b */
    public void m18058b() {
        this.f14658b.m13509a();
        this.f14657a.m18022a();
    }

    /* renamed from: a */
    public void m18053a(CustomEvent customEvent) {
        C2774k h = C2766c.m13524h();
        String str = Answers.TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Logged custom event: ");
        stringBuilder.append(customEvent);
        h.mo3554a(str, stringBuilder.toString());
        this.f14657a.m18023a(SessionEvent.m5364a(customEvent));
    }

    /* renamed from: a */
    public void m18054a(PredefinedEvent predefinedEvent) {
        C2774k h = C2766c.m13524h();
        String str = Answers.TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Logged predefined event: ");
        stringBuilder.append(predefinedEvent);
        h.mo3554a(str, stringBuilder.toString());
        this.f14657a.m18023a(SessionEvent.m5365a(predefinedEvent));
    }

    /* renamed from: a */
    public void m18057a(String str, String str2) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C2766c.m13524h().mo3554a(Answers.TAG, "Logged crash");
            this.f14657a.m18030c(SessionEvent.m5368a(str, str2));
            return;
        }
        throw new IllegalStateException("onCrash called from main thread!!!");
    }

    /* renamed from: a */
    public void m18051a(long j) {
        C2766c.m13524h().mo3554a(Answers.TAG, "Logged install");
        this.f14657a.m18028b(SessionEvent.m5363a(j));
    }

    /* renamed from: a */
    public void m18052a(Activity activity, Type type) {
        C2774k h = C2766c.m13524h();
        String str = Answers.TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Logged lifecycle event: ");
        stringBuilder.append(type.name());
        h.mo3554a(str, stringBuilder.toString());
        this.f14657a.m18023a(SessionEvent.m5366a(type, activity));
    }

    public void onBackground() {
        C2766c.m13524h().mo3554a(Answers.TAG, "Flush events when app is backgrounded");
        this.f14657a.m18029c();
    }

    /* renamed from: a */
    public void m18055a(C2839b c2839b, String str) {
        this.f14659c.m5355a(c2839b.f12002j);
        this.f14657a.m18025a(c2839b, str);
    }

    /* renamed from: c */
    boolean m18059c() {
        return this.f14660d.m5379b() ^ 1;
    }
}
