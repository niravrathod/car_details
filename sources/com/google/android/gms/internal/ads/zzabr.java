package com.google.android.gms.internal.ads;

import org.json.JSONObject;

@zzaer
public class zzabr {
    /* renamed from: a */
    private final zzasg f8501a;
    /* renamed from: b */
    private final String f8502b;

    public zzabr(zzasg zzasg) {
        this(zzasg, "");
    }

    public zzabr(zzasg zzasg, String str) {
        this.f8501a = zzasg;
        this.f8502b = str;
    }

    /* renamed from: a */
    public final void m9445a(String str) {
        try {
            this.f8501a.mo2748a("onError", (JSONObject) new JSONObject().put("message", str).put("action", this.f8502b));
        } catch (String str2) {
            zzaok.m10002b("Error occurred while dispatching error event.", str2);
        }
    }

    /* renamed from: b */
    public final void m9447b(String str) {
        try {
            this.f8501a.mo2748a("onReadyEventReceived", (JSONObject) new JSONObject().put("js", str));
        } catch (String str2) {
            zzaok.m10002b("Error occured while dispatching ready Event.", str2);
        }
    }

    /* renamed from: a */
    public final void m9443a(int i, int i2, int i3, int i4) {
        try {
            this.f8501a.mo2748a("onSizeChanged", (JSONObject) new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (int i5) {
            zzaok.m10002b("Error occured while dispatching size change.", i5);
        }
    }

    /* renamed from: b */
    public final void m9446b(int i, int i2, int i3, int i4) {
        try {
            this.f8501a.mo2748a("onDefaultPositionReceived", (JSONObject) new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (int i5) {
            zzaok.m10002b("Error occured while dispatching default position.", i5);
        }
    }

    /* renamed from: c */
    public final void m9448c(String str) {
        try {
            this.f8501a.mo2748a("onStateChanged", (JSONObject) new JSONObject().put("state", str));
        } catch (String str2) {
            zzaok.m10002b("Error occured while dispatching state change.", str2);
        }
    }

    /* renamed from: a */
    public final void m9444a(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.f8501a.mo2748a("onScreenInfoChanged", (JSONObject) new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", (double) f).put("rotation", i5));
        } catch (int i6) {
            zzaok.m10002b("Error occured while obtaining screen information.", i6);
        }
    }
}
