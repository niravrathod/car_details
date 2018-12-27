package com.facebook.ads.internal.view.p116f.p120d;

import android.net.Uri;
import android.view.View;
import com.facebook.ads.internal.view.p116f.p117a.C2038a;

/* renamed from: com.facebook.ads.internal.view.f.d.c */
public interface C2071c {
    /* renamed from: a */
    void mo1451a(int i);

    /* renamed from: a */
    void mo1453a(C2038a c2038a);

    /* renamed from: a */
    void mo1458a(boolean z);

    /* renamed from: c */
    void mo1461c();

    /* renamed from: d */
    void mo1462d();

    /* renamed from: e */
    boolean mo1463e();

    /* renamed from: g */
    void mo1465g();

    int getCurrentPosition();

    int getDuration();

    long getInitialBufferTime();

    C2038a getStartReason();

    C2072d getState();

    int getVideoHeight();

    int getVideoWidth();

    View getView();

    float getVolume();

    void setBackgroundPlaybackEnabled(boolean z);

    void setControlsAnchorView(View view);

    void setFullScreen(boolean z);

    void setRequestedVolume(float f);

    void setVideoMPD(String str);

    void setVideoStateChangeListener(C2073e c2073e);

    void setup(Uri uri);
}
