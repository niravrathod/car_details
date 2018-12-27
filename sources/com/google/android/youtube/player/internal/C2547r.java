package com.google.android.youtube.player.internal;

import android.content.Context;
import android.content.res.Resources;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.youtube.player.internal.r */
public final class C2547r {
    /* renamed from: a */
    public final String f10884a;
    /* renamed from: b */
    public final String f10885b;
    /* renamed from: c */
    public final String f10886c;
    /* renamed from: d */
    public final String f10887d;
    /* renamed from: e */
    public final String f10888e;
    /* renamed from: f */
    public final String f10889f;
    /* renamed from: g */
    public final String f10890g;
    /* renamed from: h */
    public final String f10891h;
    /* renamed from: i */
    public final String f10892i;
    /* renamed from: j */
    public final String f10893j;

    public C2547r(Context context) {
        Resources resources = context.getResources();
        Locale locale = (resources == null || resources.getConfiguration() == null || resources.getConfiguration().locale == null) ? Locale.getDefault() : resources.getConfiguration().locale;
        Map a = C2558z.m12566a(locale);
        this.f10884a = (String) a.get("error_initializing_player");
        this.f10885b = (String) a.get("get_youtube_app_title");
        this.f10886c = (String) a.get("get_youtube_app_text");
        this.f10887d = (String) a.get("get_youtube_app_action");
        this.f10888e = (String) a.get("enable_youtube_app_title");
        this.f10889f = (String) a.get("enable_youtube_app_text");
        this.f10890g = (String) a.get("enable_youtube_app_action");
        this.f10891h = (String) a.get("update_youtube_app_title");
        this.f10892i = (String) a.get("update_youtube_app_text");
        this.f10893j = (String) a.get("update_youtube_app_action");
    }
}
