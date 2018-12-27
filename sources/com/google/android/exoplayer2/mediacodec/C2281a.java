package com.google.android.exoplayer2.mediacodec;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.media.MediaCodecInfo.AudioCapabilities;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.VideoCapabilities;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.p126c.C2163a;
import com.google.android.exoplayer2.p126c.C2170h;
import com.google.android.exoplayer2.p126c.C2186s;

@TargetApi(16)
/* renamed from: com.google.android.exoplayer2.mediacodec.a */
public final class C2281a {
    /* renamed from: a */
    public final String f7237a;
    /* renamed from: b */
    public final boolean f7238b;
    /* renamed from: c */
    public final boolean f7239c;
    /* renamed from: d */
    private final String f7240d;
    /* renamed from: e */
    private final CodecCapabilities f7241e;

    /* renamed from: a */
    public static C2281a m8381a(String str) {
        return new C2281a(str, null, null, false);
    }

    /* renamed from: a */
    public static C2281a m8382a(String str, String str2, CodecCapabilities codecCapabilities, boolean z) {
        return new C2281a(str, str2, codecCapabilities, z);
    }

    private C2281a(String str, String str2, CodecCapabilities codecCapabilities, boolean z) {
        this.f7237a = (String) C2163a.m7914a((Object) str);
        this.f7240d = str2;
        this.f7241e = codecCapabilities;
        str = true;
        z = (z || codecCapabilities == null || !C2281a.m8383a(codecCapabilities)) ? false : true;
        this.f7238b = z;
        if (codecCapabilities == null || C2281a.m8387c(codecCapabilities) == null) {
            str = null;
        }
        this.f7239c = str;
    }

    /* renamed from: a */
    public CodecProfileLevel[] m8393a() {
        if (this.f7241e != null) {
            if (this.f7241e.profileLevels != null) {
                return this.f7241e.profileLevels;
            }
        }
        return new CodecProfileLevel[0];
    }

    /* renamed from: b */
    public boolean m8395b(String str) {
        if (str != null) {
            if (this.f7240d != null) {
                String d = C2170h.m7945d(str);
                if (d == null) {
                    return true;
                }
                StringBuilder stringBuilder;
                if (this.f7240d.equals(d)) {
                    Pair a = MediaCodecUtil.m8371a(str);
                    if (a == null) {
                        return true;
                    }
                    for (CodecProfileLevel codecProfileLevel : m8393a()) {
                        if (codecProfileLevel.profile == ((Integer) a.first).intValue() && codecProfileLevel.level >= ((Integer) a.second).intValue()) {
                            return true;
                        }
                    }
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("codec.profileLevel, ");
                    stringBuilder.append(str);
                    stringBuilder.append(", ");
                    stringBuilder.append(d);
                    m8386c(stringBuilder.toString());
                    return false;
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("codec.mime ");
                stringBuilder.append(str);
                stringBuilder.append(", ");
                stringBuilder.append(d);
                m8386c(stringBuilder.toString());
                return false;
            }
        }
        return true;
    }

    @TargetApi(21)
    /* renamed from: a */
    public boolean m8392a(int i, int i2, double d) {
        if (this.f7241e == null) {
            m8386c("sizeAndRate.caps");
            return false;
        }
        VideoCapabilities videoCapabilities = this.f7241e.getVideoCapabilities();
        if (videoCapabilities == null) {
            m8386c("sizeAndRate.vCaps");
            return false;
        }
        if (!C2281a.m8384a(videoCapabilities, i, i2, d)) {
            StringBuilder stringBuilder;
            if (i < i2) {
                if (C2281a.m8384a(videoCapabilities, i2, i, d)) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("sizeAndRate.rotated, ");
                    stringBuilder.append(i);
                    stringBuilder.append("x");
                    stringBuilder.append(i2);
                    stringBuilder.append("x");
                    stringBuilder.append(d);
                    m8388d(stringBuilder.toString());
                }
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("sizeAndRate.support, ");
            stringBuilder.append(i);
            stringBuilder.append("x");
            stringBuilder.append(i2);
            stringBuilder.append("x");
            stringBuilder.append(d);
            m8386c(stringBuilder.toString());
            return false;
        }
        return true;
    }

    @TargetApi(21)
    /* renamed from: a */
    public Point m8390a(int i, int i2) {
        if (this.f7241e == null) {
            m8386c("align.caps");
            return null;
        }
        VideoCapabilities videoCapabilities = this.f7241e.getVideoCapabilities();
        if (videoCapabilities == null) {
            m8386c("align.vCaps");
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(C2186s.m8040a(i, widthAlignment) * widthAlignment, C2186s.m8040a(i2, heightAlignment) * heightAlignment);
    }

    @TargetApi(21)
    /* renamed from: a */
    public boolean m8391a(int i) {
        if (this.f7241e == null) {
            m8386c("sampleRate.caps");
            return false;
        }
        AudioCapabilities audioCapabilities = this.f7241e.getAudioCapabilities();
        if (audioCapabilities == null) {
            m8386c("sampleRate.aCaps");
            return false;
        } else if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("sampleRate.support, ");
            stringBuilder.append(i);
            m8386c(stringBuilder.toString());
            return false;
        }
    }

    @TargetApi(21)
    /* renamed from: b */
    public boolean m8394b(int i) {
        if (this.f7241e == null) {
            m8386c("channelCount.caps");
            return false;
        }
        AudioCapabilities audioCapabilities = this.f7241e.getAudioCapabilities();
        if (audioCapabilities == null) {
            m8386c("channelCount.aCaps");
            return false;
        } else if (audioCapabilities.getMaxInputChannelCount() >= i) {
            return true;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("channelCount.support, ");
            stringBuilder.append(i);
            m8386c(stringBuilder.toString());
            return false;
        }
    }

    /* renamed from: c */
    private void m8386c(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NoSupport [");
        stringBuilder.append(str);
        stringBuilder.append("] [");
        stringBuilder.append(this.f7237a);
        stringBuilder.append(", ");
        stringBuilder.append(this.f7240d);
        stringBuilder.append("] [");
        stringBuilder.append(C2186s.f6765e);
        stringBuilder.append("]");
        Log.d("MediaCodecInfo", stringBuilder.toString());
    }

    /* renamed from: d */
    private void m8388d(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AssumedSupport [");
        stringBuilder.append(str);
        stringBuilder.append("] [");
        stringBuilder.append(this.f7237a);
        stringBuilder.append(", ");
        stringBuilder.append(this.f7240d);
        stringBuilder.append("] [");
        stringBuilder.append(C2186s.f6765e);
        stringBuilder.append("]");
        Log.d("MediaCodecInfo", stringBuilder.toString());
    }

    /* renamed from: a */
    private static boolean m8383a(CodecCapabilities codecCapabilities) {
        return (C2186s.f6761a < 19 || C2281a.m8385b(codecCapabilities) == null) ? null : true;
    }

    @TargetApi(19)
    /* renamed from: b */
    private static boolean m8385b(CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    @TargetApi(21)
    /* renamed from: a */
    private static boolean m8384a(VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (d != -1.0d) {
            if (d > 0.0d) {
                return videoCapabilities.areSizeAndRateSupported(i, i2, d);
            }
        }
        return videoCapabilities.isSizeSupported(i, i2);
    }

    /* renamed from: c */
    private static boolean m8387c(CodecCapabilities codecCapabilities) {
        return (C2186s.f6761a < 21 || C2281a.m8389d(codecCapabilities) == null) ? null : true;
    }

    @TargetApi(21)
    /* renamed from: d */
    private static boolean m8389d(CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }
}
