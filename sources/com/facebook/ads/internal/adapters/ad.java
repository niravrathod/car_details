package com.facebook.ads.internal.adapters;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.ads.C1700b;
import com.facebook.ads.internal.view.p116f.p118b.C2041z;

public class ad extends BroadcastReceiver {
    /* renamed from: a */
    private String f5251a;
    /* renamed from: b */
    private C1748l f5252b;
    /* renamed from: c */
    private C3770j f5253c;

    public ad(String str, C3770j c3770j, C1748l c1748l) {
        this.f5253c = c3770j;
        this.f5252b = c1748l;
        this.f5251a = str;
    }

    /* renamed from: a */
    public IntentFilter m6587a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(C2041z.REWARDED_VIDEO_COMPLETE.m7605a(this.f5251a));
        intentFilter.addAction(C2041z.REWARDED_VIDEO_ERROR.m7605a(this.f5251a));
        intentFilter.addAction(C2041z.REWARDED_VIDEO_AD_CLICK.m7605a(this.f5251a));
        intentFilter.addAction(C2041z.REWARDED_VIDEO_IMPRESSION.m7605a(this.f5251a));
        intentFilter.addAction(C2041z.REWARDED_VIDEO_CLOSED.m7605a(this.f5251a));
        intentFilter.addAction(C2041z.REWARD_SERVER_SUCCESS.m7605a(this.f5251a));
        intentFilter.addAction(C2041z.REWARD_SERVER_FAILED.m7605a(this.f5251a));
        return intentFilter;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (C2041z.REWARDED_VIDEO_COMPLETE.m7605a(this.f5251a).equals(action)) {
            this.f5252b.mo1305d(this.f5253c);
        } else if (C2041z.REWARDED_VIDEO_ERROR.m7605a(this.f5251a).equals(action)) {
            this.f5252b.mo1302a(this.f5253c, C1700b.f5123e);
        } else if (C2041z.REWARDED_VIDEO_AD_CLICK.m7605a(this.f5251a).equals(action)) {
            this.f5252b.mo1303b(this.f5253c);
        } else if (C2041z.REWARDED_VIDEO_IMPRESSION.m7605a(this.f5251a).equals(action)) {
            this.f5252b.mo1304c(this.f5253c);
        } else if (C2041z.REWARDED_VIDEO_CLOSED.m7605a(this.f5251a).equals(action)) {
            this.f5252b.mo1300a();
        } else if (C2041z.REWARD_SERVER_FAILED.m7605a(this.f5251a).equals(action)) {
            this.f5252b.mo1306e(this.f5253c);
        } else if (C2041z.REWARD_SERVER_SUCCESS.m7605a(this.f5251a).equals(action)) {
            this.f5252b.mo1307f(this.f5253c);
        }
    }
}
