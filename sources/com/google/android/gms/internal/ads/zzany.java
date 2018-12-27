package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.VideoCapabilities;
import android.media.MediaCodecList;
import android.os.Build.VERSION;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@zzaer
public final class zzany {
    /* renamed from: a */
    private static Map<String, List<Map<String, Object>>> f8938a = new HashMap();
    /* renamed from: b */
    private static List<MediaCodecInfo> f8939b;
    /* renamed from: c */
    private static final Object f8940c = new Object();

    @TargetApi(16)
    /* renamed from: a */
    public static List<Map<String, Object>> m9942a(String str) {
        synchronized (f8940c) {
            if (f8938a.containsKey(str)) {
                return (List) f8938a.get(str);
            }
            List arrayList;
            try {
                synchronized (f8940c) {
                    if (f8939b != null) {
                    } else {
                        if (VERSION.SDK_INT >= 21) {
                            f8939b = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                        } else if (VERSION.SDK_INT >= 16) {
                            int codecCount = MediaCodecList.getCodecCount();
                            f8939b = new ArrayList(codecCount);
                            for (int i = 0; i < codecCount; i++) {
                                f8939b.add(MediaCodecList.getCodecInfoAt(i));
                            }
                        } else {
                            f8939b = Collections.emptyList();
                        }
                    }
                }
                arrayList = new ArrayList();
                for (MediaCodecInfo mediaCodecInfo : f8939b) {
                    if (!mediaCodecInfo.isEncoder() && Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str)) {
                        Map hashMap = new HashMap();
                        hashMap.put("codecName", mediaCodecInfo.getName());
                        CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                        ArrayList arrayList2 = new ArrayList();
                        for (CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                            arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                        }
                        hashMap.put("profileLevels", arrayList2);
                        if (VERSION.SDK_INT >= 21) {
                            VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                            hashMap.put("bitRatesBps", m9943a(videoCapabilities.getBitrateRange()));
                            hashMap.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                            hashMap.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                            hashMap.put("frameRates", m9943a(videoCapabilities.getSupportedFrameRates()));
                            hashMap.put("widths", m9943a(videoCapabilities.getSupportedWidths()));
                            hashMap.put("heights", m9943a(videoCapabilities.getSupportedHeights()));
                        }
                        if (VERSION.SDK_INT >= 23) {
                            hashMap.put("instancesLimit", Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                        }
                        arrayList.add(hashMap);
                    }
                }
                f8938a.put(str, arrayList);
                return arrayList;
            } catch (RuntimeException e) {
                Map hashMap2 = new HashMap();
                hashMap2.put("error", e.getClass().getSimpleName());
                arrayList = new ArrayList();
                arrayList.add(hashMap2);
                f8938a.put(str, arrayList);
                return arrayList;
            }
        }
    }

    @TargetApi(21)
    /* renamed from: a */
    private static Integer[] m9943a(Range<Integer> range) {
        return new Integer[]{(Integer) range.getLower(), (Integer) range.getUpper()};
    }
}
