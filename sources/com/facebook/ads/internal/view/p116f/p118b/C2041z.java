package com.facebook.ads.internal.view.p116f.p118b;

/* renamed from: com.facebook.ads.internal.view.f.b.z */
public enum C2041z {
    REWARDED_VIDEO_COMPLETE("com.facebook.ads.rewarded_video.completed"),
    REWARDED_VIDEO_COMPLETE_WITHOUT_REWARD("com.facebook.ads.rewarded_video.completed.without.reward"),
    REWARDED_VIDEO_END_ACTIVITY("com.facebook.ads.rewarded_video.end_activity"),
    REWARDED_VIDEO_ERROR("com.facebook.ads.rewarded_video.error"),
    REWARDED_VIDEO_AD_CLICK("com.facebook.ads.rewarded_video.ad_click"),
    REWARDED_VIDEO_IMPRESSION("com.facebook.ads.rewarded_video.ad_impression"),
    REWARDED_VIDEO_CLOSED("com.facebook.ads.rewarded_video.closed"),
    REWARD_SERVER_SUCCESS("com.facebook.ads.rewarded_video.server_reward_success"),
    REWARD_SERVER_FAILED("com.facebook.ads.rewarded_video.server_reward_failed");
    
    /* renamed from: j */
    private String f6318j;

    private C2041z(String str) {
        this.f6318j = str;
    }

    /* renamed from: a */
    public String m7604a() {
        return this.f6318j;
    }

    /* renamed from: a */
    public String m7605a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f6318j);
        stringBuilder.append(":");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }
}
