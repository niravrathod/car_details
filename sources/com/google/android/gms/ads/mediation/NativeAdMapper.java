package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.internal.ads.zzaer;
import java.util.Map;

@zzaer
@Deprecated
public class NativeAdMapper {
    /* renamed from: a */
    private View f7826a;
    /* renamed from: b */
    protected boolean f7827b;
    /* renamed from: c */
    protected boolean f7828c;
    /* renamed from: d */
    protected Bundle f7829d = new Bundle();
    /* renamed from: e */
    protected View f7830e;
    /* renamed from: f */
    private VideoController f7831f;
    /* renamed from: g */
    private boolean f7832g;

    public void handleClick(View view) {
    }

    public void recordImpression() {
    }

    @Deprecated
    public void trackView(View view) {
    }

    public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
    }

    public void untrackView(View view) {
    }

    public final void setOverrideImpressionRecording(boolean z) {
        this.f7827b = z;
    }

    public final void setOverrideClickHandling(boolean z) {
        this.f7828c = z;
    }

    public final void setExtras(Bundle bundle) {
        this.f7829d = bundle;
    }

    public void setAdChoicesContent(View view) {
        this.f7830e = view;
    }

    public final boolean getOverrideImpressionRecording() {
        return this.f7827b;
    }

    public final boolean getOverrideClickHandling() {
        return this.f7828c;
    }

    public final Bundle getExtras() {
        return this.f7829d;
    }

    public View getAdChoicesContent() {
        return this.f7830e;
    }

    public void setMediaView(View view) {
        this.f7826a = view;
    }

    public final View zzxr() {
        return this.f7826a;
    }

    public final void zza(VideoController videoController) {
        this.f7831f = videoController;
    }

    public final VideoController getVideoController() {
        return this.f7831f;
    }

    public void setHasVideoContent(boolean z) {
        this.f7832g = z;
    }

    public boolean hasVideoContent() {
        return this.f7832g;
    }
}
