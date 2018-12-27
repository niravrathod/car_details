package com.google.android.exoplayer2.audio;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Arrays;

@TargetApi(21)
/* renamed from: com.google.android.exoplayer2.audio.b */
public final class C2138b {
    /* renamed from: a */
    public static final C2138b f6611a = new C2138b(new int[]{2}, 2);
    /* renamed from: b */
    private final int[] f6612b;
    /* renamed from: c */
    private final int f6613c;

    /* renamed from: a */
    public static C2138b m7853a(Context context) {
        return C2138b.m7854a(context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    static C2138b m7854a(Intent intent) {
        if (intent != null) {
            if (intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 0) {
                return new C2138b(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 0));
            }
        }
        return f6611a;
    }

    C2138b(int[] iArr, int i) {
        if (iArr != null) {
            this.f6612b = Arrays.copyOf(iArr, iArr.length);
            Arrays.sort(this.f6612b);
        } else {
            this.f6612b = new int[null];
        }
        this.f6613c = i;
    }

    /* renamed from: a */
    public boolean m7855a(int i) {
        return Arrays.binarySearch(this.f6612b, i) >= 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2138b)) {
            return false;
        }
        C2138b c2138b = (C2138b) obj;
        if (!Arrays.equals(this.f6612b, c2138b.f6612b) || this.f6613c != c2138b.f6613c) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.f6613c + (Arrays.hashCode(this.f6612b) * 31);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AudioCapabilities[maxChannelCount=");
        stringBuilder.append(this.f6613c);
        stringBuilder.append(", supportedEncodings=");
        stringBuilder.append(Arrays.toString(this.f6612b));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
