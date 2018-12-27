package com.crashlytics.android.answers.shim;

import android.util.Log;
import com.crashlytics.android.answers.Answers;

/* renamed from: com.crashlytics.android.answers.shim.a */
class C3560a implements KitEventLogger {
    /* renamed from: a */
    private final Answers f14662a;

    private C3560a(Answers answers) {
        this.f14662a = answers;
    }

    /* renamed from: a */
    public static C3560a m18060a() {
        return C3560a.m18061a(Answers.getInstance());
    }

    /* renamed from: a */
    static C3560a m18061a(Answers answers) {
        if (answers != null) {
            return new C3560a(answers);
        }
        throw new IllegalStateException("Answers must be initialized before logging kit events");
    }

    public void logKitEvent(KitEvent kitEvent) {
        try {
            this.f14662a.logCustom(kitEvent.toCustomEvent());
        } catch (KitEvent kitEvent2) {
            Log.w("AnswersKitEventLogger", "Unexpected error sending Answers event", kitEvent2);
        }
    }
}
