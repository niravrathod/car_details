package io.fabric.sdk.android.services.settings;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import io.fabric.sdk.android.C2766c;
import io.fabric.sdk.android.services.common.CommonUtils;

/* renamed from: io.fabric.sdk.android.services.settings.n */
public class C2846n {
    /* renamed from: a */
    public final String f12032a;
    /* renamed from: b */
    public final int f12033b;
    /* renamed from: c */
    public final int f12034c;
    /* renamed from: d */
    public final int f12035d;

    public C2846n(String str, int i, int i2, int i3) {
        this.f12032a = str;
        this.f12033b = i;
        this.f12034c = i2;
        this.f12035d = i3;
    }

    /* renamed from: a */
    public static C2846n m13853a(Context context, String str) {
        if (str != null) {
            try {
                int l = CommonUtils.m13636l(context);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("App icon resource ID is ");
                stringBuilder.append(l);
                C2766c.m13524h().mo3554a("Fabric", stringBuilder.toString());
                Options options = new Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeResource(context.getResources(), l, options);
                return new C2846n(str, l, options.outWidth, options.outHeight);
            } catch (Context context2) {
                C2766c.m13524h().mo3562e("Fabric", "Failed to load icon", context2);
            }
        }
        return null;
    }
}
