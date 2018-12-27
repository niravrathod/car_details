package com.feedbox.p123b;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v4.content.C0389b;
import android.widget.ImageView;
import com.bumptech.glide.C1143c;
import com.bumptech.glide.request.C1313e;
import com.feedbox.C2108b.C2101a;
import com.feedbox.C2110d;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.jvm.internal.C2885g;

/* renamed from: com.feedbox.b.b */
public final class C2104b {
    /* renamed from: a */
    public static final C2104b f6439a = new C2104b();
    /* renamed from: b */
    private static final ColorDrawable f6440b = new ColorDrawable(C0389b.m1438c(((C2110d) C2110d.f6448c.m7672a()).m7676a().getApplicationContext(), C2101a.color_gray_back));

    private C2104b() {
    }

    /* renamed from: a */
    public final void m7666a(String str, ImageView imageView) {
        C2885g.m13910b(str, ImagesContract.URL);
        C2885g.m13910b(imageView, "imageView");
        C1143c.m4771b(((C2110d) C2110d.f6448c.m7672a()).m7676a().getApplicationContext()).m17286a(str).m4830a(new C1313e().m5309a((Drawable) f6440b)).m4835a(imageView);
    }

    /* renamed from: a */
    public final boolean m7667a() {
        Object systemService = ((C2110d) C2110d.f6448c.m7672a()).m7676a().getApplicationContext().getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (!(systemService instanceof ConnectivityManager)) {
            systemService = null;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        }
        return networkInfo != null && networkInfo.isConnectedOrConnecting();
    }

    /* renamed from: b */
    public final String m7668b() {
        C2105c c2105c = C2105c.f6441a;
        Object applicationContext = ((C2110d) C2110d.f6448c.m7672a()).m7676a().getApplicationContext();
        C2885g.m13907a(applicationContext, "VideoApp.getInstance().a…cation.applicationContext");
        String a = c2105c.m7670a(applicationContext, C2105c.f6441a.m7669a());
        return (((CharSequence) a).length() > 0 ? 1 : null) != null ? a : ((C2110d) C2110d.f6448c.m7672a()).m7678b();
    }
}
