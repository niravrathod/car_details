package com.crashlytics.android.answers;

import android.content.Context;
import io.fabric.sdk.android.C2766c;
import io.fabric.sdk.android.C2774k;

/* renamed from: com.crashlytics.android.answers.k */
class C1332k {
    /* renamed from: a */
    private final Context f4187a;
    /* renamed from: b */
    private final FirebaseAnalyticsEventMapper f4188b;
    /* renamed from: c */
    private EventLogger f4189c;

    public C1332k(Context context) {
        this(context, new FirebaseAnalyticsEventMapper());
    }

    public C1332k(Context context, FirebaseAnalyticsEventMapper firebaseAnalyticsEventMapper) {
        this.f4187a = context;
        this.f4188b = firebaseAnalyticsEventMapper;
    }

    /* renamed from: a */
    public EventLogger m5381a() {
        if (this.f4189c == null) {
            this.f4189c = AppMeasurementEventLogger.getEventLogger(this.f4187a);
        }
        return this.f4189c;
    }

    /* renamed from: a */
    public void m5382a(SessionEvent sessionEvent) {
        EventLogger a = m5381a();
        if (a == null) {
            C2766c.m13524h().mo3554a(Answers.TAG, "Firebase analytics logging was enabled, but not available...");
            return;
        }
        FirebaseAnalyticsEvent mapEvent = this.f4188b.mapEvent(sessionEvent);
        if (mapEvent == null) {
            C2774k h = C2766c.m13524h();
            String str = Answers.TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fabric event was not mappable to Firebase event: ");
            stringBuilder.append(sessionEvent);
            h.mo3554a(str, stringBuilder.toString());
            return;
        }
        a.logEvent(mapEvent.getEventName(), mapEvent.getEventParams());
        if ("levelEnd".equals(sessionEvent.f4166g) != null) {
            a.logEvent("post_score", mapEvent.getEventParams());
        }
    }
}
