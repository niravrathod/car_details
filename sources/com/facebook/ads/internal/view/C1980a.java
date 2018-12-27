package com.facebook.ads.internal.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.p091j.C1815d;

/* renamed from: com.facebook.ads.internal.view.a */
public interface C1980a {

    /* renamed from: com.facebook.ads.internal.view.a$a */
    public interface C1965a {
        /* renamed from: a */
        void mo1279a(View view);

        /* renamed from: a */
        void mo1280a(String str);

        /* renamed from: a */
        void mo1281a(String str, C1815d c1815d);
    }

    /* renamed from: a */
    void mo1420a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity);

    /* renamed from: a */
    void mo1421a(Bundle bundle);

    /* renamed from: e */
    void mo1422e();

    /* renamed from: k */
    void mo1423k();

    /* renamed from: l */
    void mo1424l();

    void setListener(C1965a c1965a);
}
