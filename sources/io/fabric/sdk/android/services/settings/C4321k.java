package io.fabric.sdk.android.services.settings;

import com.crashlytics.android.beta.BuildConfig;
import com.google.android.gms.common.internal.ImagesContract;
import io.fabric.sdk.android.services.common.C2799j;
import org.json.JSONObject;

/* renamed from: io.fabric.sdk.android.services.settings.k */
class C4321k implements C2855u {
    C4321k() {
    }

    /* renamed from: a */
    public C2853s mo3598a(C2799j c2799j, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        return new C2853s(m23684a(c2799j, (long) optInt2, jSONObject), m23685a(jSONObject.getJSONObject("app")), m23689e(jSONObject.getJSONObject("session")), m23690f(jSONObject.getJSONObject("prompt")), m23687c(jSONObject.getJSONObject("features")), m23688d(jSONObject.getJSONObject("analytics")), m23691g(jSONObject.getJSONObject(BuildConfig.ARTIFACT_ID)), optInt, optInt2);
    }

    /* renamed from: a */
    private C2842e m23685a(JSONObject jSONObject) {
        String string = jSONObject.getString("identifier");
        String string2 = jSONObject.getString("status");
        String string3 = jSONObject.getString(ImagesContract.URL);
        String string4 = jSONObject.getString("reports_url");
        String string5 = jSONObject.getString("ndk_reports_url");
        boolean optBoolean = jSONObject.optBoolean("update_required", false);
        jSONObject = (jSONObject.has("icon") && jSONObject.getJSONObject("icon").has("hash")) ? m23686b(jSONObject.getJSONObject("icon")) : null;
        return new C2842e(string, string2, string3, string4, string5, optBoolean, jSONObject);
    }

    /* renamed from: b */
    private C2840c m23686b(JSONObject jSONObject) {
        return new C2840c(jSONObject.getString("hash"), jSONObject.getInt("width"), jSONObject.getInt("height"));
    }

    /* renamed from: c */
    private C2845m m23687c(JSONObject jSONObject) {
        return new C2845m(jSONObject.optBoolean("prompt_enabled", false), jSONObject.optBoolean("collect_logged_exceptions", true), jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_analytics", false), jSONObject.optBoolean("firebase_crashlytics_enabled", false));
    }

    /* renamed from: d */
    private C2839b m23688d(JSONObject jSONObject) {
        return new C2839b(jSONObject.optString(ImagesContract.URL, "https://e.crashlytics.com/spi/v2/events"), jSONObject.optInt("flush_interval_secs", 600), jSONObject.optInt("max_byte_size_per_file", 8000), jSONObject.optInt("max_file_count_per_send", 1), jSONObject.optInt("max_pending_send_file_count", 100), jSONObject.optBoolean("forward_to_google_analytics", false), jSONObject.optBoolean("include_purchase_events_in_forwarded_events", false), jSONObject.optBoolean("track_custom_events", true), jSONObject.optBoolean("track_predefined_events", true), jSONObject.optInt("sampling_rate", 1), jSONObject.optBoolean("flush_on_background", true));
    }

    /* renamed from: e */
    private C2848p m23689e(JSONObject jSONObject) {
        return new C2848p(jSONObject.optInt("log_buffer_size", 64000), jSONObject.optInt("max_chained_exception_depth", 8), jSONObject.optInt("max_custom_exception_events", 64), jSONObject.optInt("max_custom_key_value_pairs", 64), jSONObject.optInt("identifier_mask", 255), jSONObject.optBoolean("send_session_without_crash", false), jSONObject.optInt("max_complete_sessions_count", 4));
    }

    /* renamed from: f */
    private C2847o m23690f(JSONObject jSONObject) {
        return new C2847o(jSONObject.optString("title", "Send Crash Report?"), jSONObject.optString("message", "Looks like we crashed! Please help us fix the problem by sending a crash report."), jSONObject.optString("send_button_title", "Send"), jSONObject.optBoolean("show_cancel_button", true), jSONObject.optString("cancel_button_title", "Don't Send"), jSONObject.optBoolean("show_always_send_button", true), jSONObject.optString("always_send_button_title", "Always Send"));
    }

    /* renamed from: g */
    private C2843f m23691g(JSONObject jSONObject) {
        return new C2843f(jSONObject.optString("update_endpoint", C2854t.f12064a), jSONObject.optInt("update_suspend_duration", 3600));
    }

    /* renamed from: a */
    private long m23684a(C2799j c2799j, long j, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.getLong("expires_at");
        }
        return (j * 1000) + c2799j.mo3580a();
    }
}
