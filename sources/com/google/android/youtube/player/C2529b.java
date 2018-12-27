package com.google.android.youtube.player;

import android.content.Context;
import android.content.Intent;
import com.google.android.youtube.player.internal.ab;

/* renamed from: com.google.android.youtube.player.b */
public final class C2529b {
    /* renamed from: a */
    static Intent m12459a(Intent intent, Context context) {
        intent.putExtra("app_package", context.getPackageName()).putExtra("app_version", ab.m12472d(context)).putExtra("client_library_version", ab.m12466a());
        return intent;
    }
}
