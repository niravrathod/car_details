package com.feedbox;

import android.util.Log;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.CustomEvent;
import java.util.HashMap;
import java.util.Map.Entry;
import kotlin.jvm.internal.C2885g;

/* renamed from: com.feedbox.a */
public final class C2100a {
    /* renamed from: a */
    public static final C2100a f6432a = new C2100a();

    private C2100a() {
    }

    /* renamed from: a */
    public final void m7664a(Event event, HashMap<String, String> hashMap) {
        C2885g.m13910b(event, "events");
        C2885g.m13910b(hashMap, "map");
        CustomEvent customEvent = new CustomEvent(event.name());
        for (Entry entry : hashMap.entrySet()) {
            customEvent.putCustomAttribute((String) entry.getKey(), (String) entry.getValue());
        }
        Log.d("AnalyticsTracker :", customEvent.toString());
        Answers.getInstance().logCustom(customEvent);
    }
}
