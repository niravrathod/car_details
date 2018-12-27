package p173;

import android.app.Activity;
import android.content.Context;
import android.webkit.JavascriptInterface;
import com.unomer.sdk.C2691b;
import com.unomer.sdk.UnomerWebActivity;

/* renamed from: g */
public final class C4903g {
    /* renamed from: a */
    public static Context f21949a;
    /* renamed from: b */
    public static C2691b f21950b;

    public C4903g(Context context, C2691b c2691b) {
        f21949a = context;
        f21950b = c2691b;
    }

    @JavascriptInterface
    public final void surveyCompleted(int i, String str, String str2, int i2, String str3, String str4) {
        final int i3 = i;
        final String str5 = str;
        final String str6 = str2;
        final int i4 = i2;
        final String str7 = str3;
        final String str8 = str4;
        ((Activity) f21949a).runOnUiThread(new Runnable(this) {
            /* renamed from: g */
            final /* synthetic */ C4903g f21941g;

            public final void run() {
                UnomerWebActivity.a(i3, str5, str6, i4, str7, str8);
            }
        });
    }

    @JavascriptInterface
    public final void surveyFetchFailed(final String str) {
        ((Activity) f21949a).runOnUiThread(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ C4903g f21948b;

            public final void run() {
                C4903g.f21950b.a(str);
            }
        });
    }

    @JavascriptInterface
    public final void surveyFetchSuccess(String str, int i, String str2, int i2) {
        C4899f.m30259a("Default", "true");
        final String str3 = str;
        final int i3 = i;
        final String str4 = str2;
        final int i4 = i2;
        ((Activity) f21949a).runOnUiThread(new Runnable(this) {
            /* renamed from: e */
            final /* synthetic */ C4903g f21946e;

            public final void run() {
                C4903g.f21950b.a(Boolean.parseBoolean(str3), i3, str4, i4);
            }
        });
    }
}
