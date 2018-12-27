package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Debug.MemoryInfo;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.ImagesContract;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzaer
public final class zzahc {
    /* renamed from: a */
    public static JSONObject m9529a(Context context, zzagv zzagv) {
        String str;
        String str2;
        zzagv zzagv2 = zzagv;
        zzafp zzafp = zzagv2.f8600i;
        Location location = zzagv2.f8595d;
        zzahg zzahg = zzagv2.f8601j;
        Bundle bundle = zzagv2.f8592a;
        JSONObject jSONObject = zzagv2.f8602k;
        try {
            int i;
            int i2;
            String str3;
            Object obj;
            boolean z;
            Map hashMap = new HashMap();
            hashMap.put("extra_caps", zzkd.m10713e().m10897a(zznw.bs));
            if (zzagv2.f8594c.size() > 0) {
                hashMap.put("eid", TextUtils.join(",", zzagv2.f8594c));
            }
            if (zzafp.f19734b != null) {
                hashMap.put("ad_pos", zzafp.f19734b);
            }
            zzjk zzjk = zzafp.f19735c;
            zzalb.m9741a();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
            if (zzjk.f20207b != -1) {
                hashMap.put("cust_age", simpleDateFormat.format(new Date(zzjk.f20207b)));
            }
            if (zzjk.f20208c != null) {
                hashMap.put("extras", zzjk.f20208c);
            }
            int i3 = -1;
            if (zzjk.f20209d != -1) {
                hashMap.put("cust_gender", Integer.valueOf(zzjk.f20209d));
            }
            if (zzjk.f20210e != null) {
                hashMap.put("kw", zzjk.f20210e);
            }
            if (zzjk.f20212g != -1) {
                hashMap.put("tag_for_child_directed_treatment", Integer.valueOf(zzjk.f20212g));
            }
            if (zzjk.f20211f) {
                hashMap.put("test_request", Boolean.valueOf(true));
            }
            if (zzjk.f20206a >= 2) {
                if (zzjk.f20213h) {
                    hashMap.put("d_imp_hdr", Integer.valueOf(1));
                }
                if (!TextUtils.isEmpty(zzjk.f20214i)) {
                    hashMap.put("ppid", zzjk.f20214i);
                }
            }
            if (zzjk.f20206a >= 3 && zzjk.f20217l != null) {
                hashMap.put(ImagesContract.URL, zzjk.f20217l);
            }
            if (zzjk.f20206a >= 5) {
                if (zzjk.f20219n != null) {
                    hashMap.put("custom_targeting", zzjk.f20219n);
                }
                if (zzjk.f20220o != null) {
                    hashMap.put("category_exclusions", zzjk.f20220o);
                }
                if (zzjk.f20221p != null) {
                    hashMap.put("request_agent", zzjk.f20221p);
                }
            }
            if (zzjk.f20206a >= 6 && zzjk.f20222q != null) {
                hashMap.put("request_pkg", zzjk.f20222q);
            }
            if (zzjk.f20206a >= 7) {
                hashMap.put("is_designed_for_families", Boolean.valueOf(zzjk.f20223r));
            }
            if (zzjk.f20206a >= 8) {
                if (zzjk.f20225t != -1) {
                    hashMap.put("tag_for_under_age_of_consent", Integer.valueOf(zzjk.f20225t));
                }
                if (zzjk.f20226u != null) {
                    hashMap.put("max_ad_content_rating", zzjk.f20226u);
                }
            }
            if (zzafp.f19736d.f20233g != null) {
                Object obj2 = null;
                Object obj3 = null;
                for (zzjo zzjo : zzafp.f19736d.f20233g) {
                    if (!zzjo.f20235i && r17 == null) {
                        hashMap.put("format", zzjo.f20227a);
                        obj2 = 1;
                    }
                    if (zzjo.f20235i && r18 == null) {
                        hashMap.put("fluid", "height");
                        obj3 = 1;
                    }
                    if (obj2 != null && r18 != null) {
                        break;
                    }
                }
            } else {
                hashMap.put("format", zzafp.f19736d.f20227a);
                if (zzafp.f19736d.f20235i) {
                    hashMap.put("fluid", "height");
                }
            }
            if (zzafp.f19736d.f20231e == -1) {
                hashMap.put("smart_w", "full");
            }
            if (zzafp.f19736d.f20228b == -2) {
                hashMap.put("smart_h", "auto");
            }
            if (zzafp.f19736d.f20233g != null) {
                StringBuilder stringBuilder = new StringBuilder();
                zzjo[] zzjoArr = zzafp.f19736d.f20233g;
                int length = zzjoArr.length;
                i2 = 0;
                Object obj4 = null;
                while (i2 < length) {
                    zzjo zzjo2 = zzjoArr[i2];
                    if (zzjo2.f20235i) {
                        obj4 = 1;
                    } else {
                        int i4;
                        if (stringBuilder.length() != 0) {
                            stringBuilder.append("|");
                        }
                        if (zzjo2.f20231e == i3) {
                            i = (int) (((float) zzjo2.f20232f) / zzahg.f8690t);
                        } else {
                            i = zzjo2.f20231e;
                        }
                        stringBuilder.append(i);
                        stringBuilder.append("x");
                        if (zzjo2.f20228b == -2) {
                            i4 = (int) (((float) zzjo2.f20229c) / zzahg.f8690t);
                        } else {
                            i4 = zzjo2.f20228b;
                        }
                        stringBuilder.append(i4);
                    }
                    i2++;
                    i3 = -1;
                }
                if (obj4 != null) {
                    if (stringBuilder.length() != 0) {
                        i = 0;
                        stringBuilder.insert(0, "|");
                    } else {
                        i = 0;
                    }
                    stringBuilder.insert(i, "320x50");
                }
                hashMap.put("sz", stringBuilder);
            }
            if (zzafp.f19745m != 0) {
                hashMap.put("native_version", Integer.valueOf(zzafp.f19745m));
                hashMap.put("native_templates", zzafp.f19746n);
                str3 = "native_image_orientation";
                zzpy zzpy = zzafp.f19757y;
                if (zzpy != null) {
                    switch (zzpy.f20342c) {
                        case 0:
                            obj = "any";
                            break;
                        case 1:
                            obj = "portrait";
                            break;
                        case 2:
                            obj = "landscape";
                            break;
                        default:
                            obj = "not_set";
                            break;
                    }
                }
                obj = "any";
                hashMap.put(str3, obj);
                str3 = "native_multiple_images";
                zzpy = zzafp.f19757y;
                z = zzpy != null && zzpy.f20343d;
                hashMap.put(str3, Boolean.valueOf(z));
                if (!zzafp.f19758z.isEmpty()) {
                    hashMap.put("native_custom_templates", zzafp.f19758z);
                }
                if (zzafp.f19733a >= 24) {
                    hashMap.put("max_num_ads", Integer.valueOf(zzafp.f19731Y));
                }
                if (!TextUtils.isEmpty(zzafp.f19729W)) {
                    try {
                        hashMap.put("native_advanced_settings", new JSONArray(zzafp.f19729W));
                    } catch (Throwable e) {
                        zzaok.m10004c("Problem creating json from native advanced settings", e);
                    }
                }
            }
            if (zzafp.f19728V != null && zzafp.f19728V.size() > 0) {
                for (Integer num : zzafp.f19728V) {
                    if (num.intValue() == 2) {
                        hashMap.put("iba", Boolean.valueOf(true));
                    } else if (num.intValue() == 1) {
                        hashMap.put("ina", Boolean.valueOf(true));
                    }
                }
            }
            if (zzafp.f19736d.f20236j) {
                hashMap.put("ene", Boolean.valueOf(true));
            }
            if (zzafp.f19721O != null) {
                hashMap.put("is_icon_ad", Boolean.valueOf(true));
                hashMap.put("icon_ad_expansion_behavior", Integer.valueOf(zzafp.f19721O.f20242a));
            }
            if (zzafp.ae != null) {
                str3 = "ia_var";
                zzti zzti = zzafp.ae;
                switch (zzti.f20398a) {
                    case 1:
                        obj = "l";
                        break;
                    case 2:
                        obj = "p";
                        break;
                    default:
                        i = zzti.f20398a;
                        StringBuilder stringBuilder2 = new StringBuilder(52);
                        stringBuilder2.append("Instream ad video aspect ratio ");
                        stringBuilder2.append(i);
                        stringBuilder2.append(" is wrong.");
                        zzaok.m10003c(stringBuilder2.toString());
                        obj = "l";
                        break;
                }
                hashMap.put(str3, obj);
                hashMap.put("instr", Boolean.valueOf(true));
            }
            hashMap.put("slotname", zzafp.f19737e);
            hashMap.put("pn", zzafp.f19738f.packageName);
            if (zzafp.f19739g != null) {
                hashMap.put("vc", Integer.valueOf(zzafp.f19739g.versionCode));
            }
            hashMap.put("ms", zzagv2.f8598g);
            hashMap.put("seq_num", zzafp.f19741i);
            hashMap.put("session_id", zzafp.f19742j);
            hashMap.put("js", zzafp.f19743k.f19893a);
            Bundle bundle2 = zzafp.f19719M;
            Bundle bundle3 = zzagv2.f8593b;
            hashMap.put("am", Integer.valueOf(zzahg.f8671a));
            hashMap.put("cog", m9526a(zzahg.f8672b));
            hashMap.put("coh", m9526a(zzahg.f8673c));
            if (!TextUtils.isEmpty(zzahg.f8674d)) {
                hashMap.put("carrier", zzahg.f8674d);
            }
            hashMap.put("gl", zzahg.f8675e);
            if (zzahg.f8676f) {
                hashMap.put("simulator", Integer.valueOf(1));
            }
            hashMap.put("is_latchsky", Boolean.valueOf(zzahg.f8677g));
            if (zzahg.f8678h) {
                hashMap.put("is_sidewinder", Integer.valueOf(1));
            }
            hashMap.put("ma", m9526a(zzahg.f8679i));
            hashMap.put("sp", m9526a(zzahg.f8680j));
            hashMap.put("hl", zzahg.f8681k);
            if (!TextUtils.isEmpty(zzahg.f8682l)) {
                hashMap.put("mv", zzahg.f8682l);
            }
            hashMap.put("muv", Integer.valueOf(zzahg.f8684n));
            if (zzahg.f8685o != -2) {
                hashMap.put("cnt", Integer.valueOf(zzahg.f8685o));
            }
            hashMap.put("gnt", Integer.valueOf(zzahg.f8686p));
            hashMap.put("pt", Integer.valueOf(zzahg.f8687q));
            hashMap.put("rm", Integer.valueOf(zzahg.f8688r));
            hashMap.put("riv", Integer.valueOf(zzahg.f8689s));
            Bundle bundle4 = new Bundle();
            bundle4.putString("build_build", zzahg.f8668A);
            bundle4.putString("build_device", zzahg.f8669B);
            Bundle bundle5 = new Bundle();
            bundle5.putBoolean("is_charging", zzahg.f8694x);
            Bundle bundle6 = bundle3;
            bundle5.putDouble("battery_level", zzahg.f8693w);
            bundle4.putBundle("battery", bundle5);
            Bundle bundle7 = new Bundle();
            bundle7.putInt("active_network_state", zzahg.f8696z);
            bundle7.putBoolean("active_network_metered", zzahg.f8695y);
            bundle4.putBundle("network", bundle7);
            bundle7 = new Bundle();
            bundle7.putBoolean("is_browser_custom_tabs_capable", zzahg.f8670C);
            bundle4.putBundle("browser", bundle7);
            if (bundle2 != null) {
                String str4 = "android_mem_info";
                bundle3 = new Bundle();
                bundle3.putString("runtime_free", Long.toString(bundle2.getLong("runtime_free_memory", -1)));
                bundle3.putString("runtime_max", Long.toString(bundle2.getLong("runtime_max_memory", -1)));
                bundle3.putString("runtime_total", Long.toString(bundle2.getLong("runtime_total_memory", -1)));
                i2 = 0;
                bundle3.putString("web_view_count", Integer.toString(bundle2.getInt("web_view_count", 0)));
                MemoryInfo memoryInfo = (MemoryInfo) bundle2.getParcelable("debug_memory_info");
                if (memoryInfo != null) {
                    bundle3.putString("debug_info_dalvik_private_dirty", Integer.toString(memoryInfo.dalvikPrivateDirty));
                    bundle3.putString("debug_info_dalvik_pss", Integer.toString(memoryInfo.dalvikPss));
                    bundle3.putString("debug_info_dalvik_shared_dirty", Integer.toString(memoryInfo.dalvikSharedDirty));
                    bundle3.putString("debug_info_native_private_dirty", Integer.toString(memoryInfo.nativePrivateDirty));
                    bundle3.putString("debug_info_native_pss", Integer.toString(memoryInfo.nativePss));
                    bundle3.putString("debug_info_native_shared_dirty", Integer.toString(memoryInfo.nativeSharedDirty));
                    bundle3.putString("debug_info_other_private_dirty", Integer.toString(memoryInfo.otherPrivateDirty));
                    bundle3.putString("debug_info_other_pss", Integer.toString(memoryInfo.otherPss));
                    bundle3.putString("debug_info_other_shared_dirty", Integer.toString(memoryInfo.otherSharedDirty));
                }
                bundle4.putBundle(str4, bundle3);
            } else {
                i2 = 0;
            }
            bundle2 = new Bundle();
            bundle2.putBundle("parental_controls", bundle6);
            if (!TextUtils.isEmpty(zzahg.f8683m)) {
                bundle2.putString("package_version", zzahg.f8683m);
            }
            bundle4.putBundle("play_store", bundle2);
            hashMap.put("device", bundle4);
            bundle2 = new Bundle();
            bundle2.putString("doritos", zzagv2.f8596e);
            bundle2.putString("doritos_v2", zzagv2.f8597f);
            if (((Boolean) zzkd.m10713e().m10897a(zznw.av)).booleanValue()) {
                Object id;
                if (zzagv2.f8599h != null) {
                    id = zzagv2.f8599h.getId();
                    z = zzagv2.f8599h.isLimitAdTrackingEnabled();
                } else {
                    id = null;
                    z = false;
                }
                if (TextUtils.isEmpty(id)) {
                    zzkd.m10709a();
                    bundle2.putString("pdid", zzaoa.m9964b(context));
                    bundle2.putString("pdidtype", "ssaid");
                } else {
                    bundle2.putString("rdid", id);
                    bundle2.putBoolean("is_lat", z);
                    bundle2.putString("idtype", "adid");
                }
            }
            hashMap.put("pii", bundle2);
            hashMap.put("platform", Build.MANUFACTURER);
            hashMap.put("submodel", Build.MODEL);
            if (location != null) {
                m9531a((HashMap) hashMap, location);
            } else if (zzafp.f19735c.f20206a >= 2 && zzafp.f19735c.f20216k != null) {
                m9531a((HashMap) hashMap, zzafp.f19735c.f20216k);
            }
            if (zzafp.f19733a >= 2) {
                hashMap.put("quality_signals", zzafp.f19744l);
            }
            if (zzafp.f19733a >= 4 && zzafp.f19748p) {
                hashMap.put("forceHttps", Boolean.valueOf(zzafp.f19748p));
            }
            if (bundle != null) {
                hashMap.put("content_info", bundle);
            }
            if (zzafp.f19733a >= 5) {
                hashMap.put("u_sd", Float.valueOf(zzafp.f19751s));
                hashMap.put("sh", Integer.valueOf(zzafp.f19750r));
                hashMap.put("sw", Integer.valueOf(zzafp.f19749q));
            } else {
                hashMap.put("u_sd", Float.valueOf(zzahg.f8690t));
                hashMap.put("sh", Integer.valueOf(zzahg.f8692v));
                hashMap.put("sw", Integer.valueOf(zzahg.f8691u));
            }
            if (zzafp.f19733a >= 6) {
                if (!TextUtils.isEmpty(zzafp.f19752t)) {
                    try {
                        hashMap.put("view_hierarchy", new JSONObject(zzafp.f19752t));
                    } catch (Throwable e2) {
                        zzaok.m10004c("Problem serializing view hierarchy to JSON", e2);
                    }
                }
                hashMap.put("correlation_id", Long.valueOf(zzafp.f19753u));
            }
            if (zzafp.f19733a >= 7) {
                hashMap.put("request_id", zzafp.f19754v);
            }
            if (zzafp.f19733a >= 12 && !TextUtils.isEmpty(zzafp.f19708B)) {
                hashMap.put("anchor", zzafp.f19708B);
            }
            if (zzafp.f19733a >= 13) {
                hashMap.put("android_app_volume", Float.valueOf(zzafp.f19709C));
            }
            if (zzafp.f19733a >= 18) {
                hashMap.put("android_app_muted", Boolean.valueOf(zzafp.f19715I));
            }
            if (zzafp.f19733a >= 14 && zzafp.f19710D > 0) {
                hashMap.put("target_api", Integer.valueOf(zzafp.f19710D));
            }
            if (zzafp.f19733a >= 15) {
                String str5 = "scroll_index";
                int i5 = -1;
                if (zzafp.f19711E != -1) {
                    i5 = zzafp.f19711E;
                }
                hashMap.put(str5, Integer.valueOf(i5));
            }
            if (zzafp.f19733a >= 16) {
                hashMap.put("_activity_context", Boolean.valueOf(zzafp.f19712F));
            }
            if (zzafp.f19733a >= 18) {
                if (!TextUtils.isEmpty(zzafp.f19716J)) {
                    try {
                        hashMap.put("app_settings", new JSONObject(zzafp.f19716J));
                    } catch (Throwable e22) {
                        zzaok.m10004c("Problem creating json from app settings", e22);
                    }
                }
                hashMap.put("render_in_browser", Boolean.valueOf(zzafp.f19717K));
            }
            if (zzafp.f19733a >= 18) {
                hashMap.put("android_num_video_cache_tasks", Integer.valueOf(zzafp.f19718L));
            }
            zzaop zzaop = zzafp.f19743k;
            boolean z2 = zzafp.f19732Z;
            boolean z3 = zzagv2.f8603l;
            boolean z4 = zzafp.ab;
            bundle2 = new Bundle();
            bundle7 = new Bundle();
            bundle7.putString("cl", "215809645");
            bundle7.putString("rapid_rc", "dev");
            bundle7.putString("rapid_rollup", "HEAD");
            bundle2.putBundle("build_meta", bundle7);
            bundle2.putString("mf", Boolean.toString(((Boolean) zzkd.m10713e().m10897a(zznw.bu)).booleanValue()));
            bundle2.putBoolean("instant_app", z2);
            bundle2.putBoolean("lite", zzaop.f19897e);
            bundle2.putBoolean("local_service", z3);
            bundle2.putBoolean("is_privileged_process", z4);
            bundle2.putInt("container_version", 12451009);
            hashMap.put("sdk_env", bundle2);
            hashMap.put("cache_state", jSONObject);
            if (zzafp.f19733a >= 19) {
                hashMap.put("gct", zzafp.f19720N);
            }
            if (zzafp.f19733a >= 21 && zzafp.f19722P) {
                hashMap.put("de", "1");
            }
            if (((Boolean) zzkd.m10713e().m10897a(zznw.aB)).booleanValue()) {
                Object obj5;
                Bundle bundle8;
                Object obj6;
                Bundle bundle9;
                str = zzafp.f19736d.f20227a;
                if (!str.equals("interstitial_mb")) {
                    if (!str.equals("reward_mb")) {
                        obj5 = null;
                        bundle8 = zzafp.f19723Q;
                        obj6 = bundle8 == null ? 1 : null;
                        if (!(obj5 == null || obj6 == null)) {
                            bundle9 = new Bundle();
                            bundle9.putBundle("interstitial_pool", bundle8);
                            hashMap.put("counters", bundle9);
                        }
                    }
                }
                obj5 = 1;
                bundle8 = zzafp.f19723Q;
                if (bundle8 == null) {
                }
                bundle9 = new Bundle();
                bundle9.putBundle("interstitial_pool", bundle8);
                hashMap.put("counters", bundle9);
            }
            if (zzafp.f19724R != null) {
                hashMap.put("gmp_app_id", zzafp.f19724R);
            }
            if (zzafp.f19725S == null) {
                hashMap.put("fbs_aiid", "");
            } else if ("TIME_OUT".equals(zzafp.f19725S)) {
                hashMap.put("sai_timeout", zzkd.m10713e().m10897a(zznw.ag));
            } else {
                hashMap.put("fbs_aiid", zzafp.f19725S);
            }
            if (zzafp.f19726T != null) {
                hashMap.put("fbs_aeid", zzafp.f19726T);
            }
            if (zzafp.af != null) {
                hashMap.put("apm_id_origin", zzafp.af);
            }
            if (zzafp.f19733a >= 24) {
                hashMap.put("disable_ml", Boolean.valueOf(zzafp.aa));
            }
            str = (String) zzkd.m10713e().m10897a(zznw.f9678C);
            if (!(str == null || str.isEmpty())) {
                if (VERSION.SDK_INT >= ((Integer) zzkd.m10713e().m10897a(zznw.f9679D)).intValue()) {
                    HashMap hashMap2 = new HashMap();
                    String[] split = str.split(",");
                    int length2 = split.length;
                    for (i2 = 
/*
Method generation error in method: com.google.android.gms.internal.ads.zzahc.a(android.content.Context, com.google.android.gms.internal.ads.zzagv):org.json.JSONObject, dex: classes.dex
jadx.core.utils.exceptions.CodegenException: Error generate insn: PHI: (r14_21 'i2' int) = (r14_19 'i2' int), (r14_20 'i2' int) binds: {(r14_19 'i2' int)=B:201:0x056f, (r14_20 'i2' int)=B:202:0x0573} in method: com.google.android.gms.internal.ads.zzahc.a(android.content.Context, com.google.android.gms.internal.ads.zzagv):org.json.JSONObject, dex: classes.dex
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:226)
	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:184)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:61)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:118)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:57)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:118)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:57)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:279)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:187)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:320)
	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:257)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:220)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:110)
	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:75)
	at jadx.core.codegen.CodeGen.visit(CodeGen.java:12)
	at jadx.core.ProcessClass.process(ProcessClass.java:40)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
Caused by: jadx.core.utils.exceptions.CodegenException: PHI can be used only in fallback mode
	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:537)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:509)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:220)
	... 31 more

*/

                    /* renamed from: a */
                    private static void m9531a(HashMap<String, Object> hashMap, Location location) {
                        HashMap hashMap2 = new HashMap();
                        Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
                        Long valueOf2 = Long.valueOf(location.getTime() * 1000);
                        Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
                        location = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
                        hashMap2.put("radius", valueOf);
                        hashMap2.put("lat", valueOf3);
                        hashMap2.put("long", location);
                        hashMap2.put("time", valueOf2);
                        hashMap.put("uule", hashMap2);
                    }

                    /* renamed from: a */
                    private static Integer m9526a(boolean z) {
                        return Integer.valueOf(z);
                    }

                    /* renamed from: a */
                    public static zzaft m9525a(Context context, zzafp zzafp, String str) {
                        zzafp zzafp2 = zzafp;
                        String optString;
                        try {
                            int b;
                            int i;
                            String str2;
                            zzaft zzaft;
                            long j;
                            JSONArray optJSONArray;
                            List list;
                            List list2;
                            List list3;
                            List a;
                            List a2;
                            long j2;
                            String optString2;
                            boolean optBoolean;
                            String optString3;
                            boolean optBoolean2;
                            boolean optBoolean3;
                            boolean optBoolean4;
                            boolean optBoolean5;
                            boolean optBoolean6;
                            String str3;
                            long optLong;
                            String optString4;
                            boolean equals;
                            boolean optBoolean7;
                            List a3;
                            List a4;
                            zzajk a5;
                            boolean optBoolean8;
                            zzafv a6;
                            String optString5;
                            List a7;
                            zzajv a8;
                            boolean optBoolean9;
                            boolean optBoolean10;
                            boolean optBoolean11;
                            String optString6;
                            boolean optBoolean12;
                            Bundle bundle;
                            boolean z;
                            JSONObject jSONObject = new JSONObject(str);
                            optString = jSONObject.optString("ad_base_url", null);
                            Object optString7 = jSONObject.optString("ad_url", null);
                            String optString8 = jSONObject.optString("ad_size", null);
                            String optString9 = jSONObject.optString("ad_slot_size", optString8);
                            boolean z2 = (zzafp2 == null || zzafp2.f19745m == 0) ? false : true;
                            CharSequence optString10 = jSONObject.optString("ad_json", null);
                            if (optString10 == null) {
                                optString10 = jSONObject.optString("ad_html", null);
                            }
                            if (optString10 == null) {
                                optString10 = jSONObject.optString("body", null);
                            }
                            if (optString10 == null && jSONObject.has("ads")) {
                                optString10 = jSONObject.toString();
                            }
                            String optString11 = jSONObject.optString("debug_dialog", null);
                            String optString12 = jSONObject.optString("debug_signals", null);
                            long j3 = jSONObject.has("interstitial_timeout") ? (long) (jSONObject.getDouble("interstitial_timeout") * 1000.0d) : -1;
                            String optString13 = jSONObject.optString("orientation", null);
                            if ("portrait".equals(optString13)) {
                                b = zzbv.zzem().mo2365b();
                            } else if ("landscape".equals(optString13)) {
                                b = zzbv.zzem().mo2363a();
                            } else {
                                i = -1;
                                if (TextUtils.isEmpty(optString10) || TextUtils.isEmpty(optString7)) {
                                    optString13 = optString;
                                    str2 = optString10;
                                    zzaft = null;
                                    j = -1;
                                } else {
                                    zzaft = zzagx.m26192a(zzafp, context, zzafp2.f19743k.f19893a, optString7, null, null, null, null, null);
                                    String str4 = zzaft.f19786a;
                                    optString13 = zzaft.f19787b;
                                    j = zzaft.f19798m;
                                    str2 = optString13;
                                    optString13 = str4;
                                }
                                if (str2 == null) {
                                    return new zzaft(0);
                                }
                                optJSONArray = jSONObject.optJSONArray("click_urls");
                                if (zzaft != null) {
                                    list = null;
                                } else {
                                    list = zzaft.f19788c;
                                }
                                if (optJSONArray != null) {
                                    list = m9527a(optJSONArray, list);
                                }
                                optJSONArray = jSONObject.optJSONArray("impression_urls");
                                if (zzaft != null) {
                                    list2 = null;
                                } else {
                                    list2 = zzaft.f19790e;
                                }
                                if (optJSONArray != null) {
                                    list2 = m9527a(optJSONArray, list2);
                                }
                                optJSONArray = jSONObject.optJSONArray("downloaded_impression_urls");
                                if (zzaft != null) {
                                    list3 = null;
                                } else {
                                    list3 = zzaft.f19777R;
                                }
                                a = optJSONArray == null ? m9527a(optJSONArray, list3) : list3;
                                optJSONArray = jSONObject.optJSONArray("manual_impression_urls");
                                if (zzaft != null) {
                                    list3 = null;
                                } else {
                                    list3 = zzaft.f19794i;
                                }
                                a2 = optJSONArray == null ? m9527a(optJSONArray, list3) : list3;
                                if (zzaft != null) {
                                    if (zzaft.f19796k != -1) {
                                        i = zzaft.f19796k;
                                    }
                                    if (zzaft.f19791f > 0) {
                                        j2 = zzaft.f19791f;
                                        optString2 = jSONObject.optString("active_view");
                                        optBoolean = jSONObject.optBoolean("ad_is_javascript", false);
                                        optString3 = optBoolean ? jSONObject.optString("ad_passback_url", null) : null;
                                        optBoolean2 = jSONObject.optBoolean("mediation", false);
                                        optBoolean3 = jSONObject.optBoolean("custom_render_allowed", false);
                                        optBoolean4 = jSONObject.optBoolean("content_url_opted_out", true);
                                        optBoolean5 = jSONObject.optBoolean("content_vertical_opted_out", true);
                                        optBoolean6 = jSONObject.optBoolean("prefetch", false);
                                        str3 = optString8;
                                        j3 = jSONObject.optLong("refresh_interval_milliseconds", -1);
                                        optLong = jSONObject.optLong("mediation_config_cache_time_milliseconds", -1);
                                        optString4 = jSONObject.optString("gws_query_id", "");
                                        equals = "height".equals(jSONObject.optString("fluid", ""));
                                        optBoolean7 = jSONObject.optBoolean("native_express", false);
                                        a3 = m9527a(jSONObject.optJSONArray("video_start_urls"), null);
                                        a4 = m9527a(jSONObject.optJSONArray("video_complete_urls"), null);
                                        a5 = zzajk.m26268a(jSONObject.optJSONArray("rewards"));
                                        optBoolean8 = jSONObject.optBoolean("use_displayed_impression", false);
                                        a6 = zzafv.m26177a(jSONObject.optJSONObject("auto_protection_configuration"));
                                        optString5 = jSONObject.optString("set_cookie", "");
                                        a7 = m9527a(jSONObject.optJSONArray("remote_ping_urls"), null);
                                        a8 = zzajv.m26269a(jSONObject.optJSONObject("safe_browsing"));
                                        optBoolean9 = jSONObject.optBoolean("render_in_browser", zzafp2.f19717K);
                                        optBoolean10 = jSONObject.optBoolean("custom_close_blocked");
                                        optBoolean11 = jSONObject.optBoolean("enable_omid", false);
                                        optString6 = jSONObject.optString("omid_settings", null);
                                        optBoolean12 = jSONObject.optBoolean("disable_closable_area", false);
                                        bundle = zzafp2.f19735c.f20218m.getBundle(AdMobAdapter.class.getName());
                                        z = bundle == null && bundle.getBoolean("is_analytics_logging_enabled", false);
                                        return new zzaft(zzafp, optString13, str2, list, list2, j2, optBoolean2, optLong, a2, j3, i, str3, j, optString11, optBoolean, optString3, optString2, optBoolean3, z2, zzafp2.f19748p, optBoolean4, optBoolean6, optString4, equals, optBoolean7, a5, a3, a4, optBoolean8, a6, zzafp2.f19713G, optString5, a7, optBoolean9, optString9, a8, optString12, optBoolean5, zzafp2.f19727U, optBoolean10, 0, optBoolean11, a, optBoolean12, optString6, "", z);
                                    }
                                }
                                j2 = j3;
                                optString2 = jSONObject.optString("active_view");
                                optBoolean = jSONObject.optBoolean("ad_is_javascript", false);
                                if (optBoolean) {
                                }
                                optBoolean2 = jSONObject.optBoolean("mediation", false);
                                optBoolean3 = jSONObject.optBoolean("custom_render_allowed", false);
                                optBoolean4 = jSONObject.optBoolean("content_url_opted_out", true);
                                optBoolean5 = jSONObject.optBoolean("content_vertical_opted_out", true);
                                optBoolean6 = jSONObject.optBoolean("prefetch", false);
                                str3 = optString8;
                                j3 = jSONObject.optLong("refresh_interval_milliseconds", -1);
                                optLong = jSONObject.optLong("mediation_config_cache_time_milliseconds", -1);
                                optString4 = jSONObject.optString("gws_query_id", "");
                                equals = "height".equals(jSONObject.optString("fluid", ""));
                                optBoolean7 = jSONObject.optBoolean("native_express", false);
                                a3 = m9527a(jSONObject.optJSONArray("video_start_urls"), null);
                                a4 = m9527a(jSONObject.optJSONArray("video_complete_urls"), null);
                                a5 = zzajk.m26268a(jSONObject.optJSONArray("rewards"));
                                optBoolean8 = jSONObject.optBoolean("use_displayed_impression", false);
                                a6 = zzafv.m26177a(jSONObject.optJSONObject("auto_protection_configuration"));
                                optString5 = jSONObject.optString("set_cookie", "");
                                a7 = m9527a(jSONObject.optJSONArray("remote_ping_urls"), null);
                                a8 = zzajv.m26269a(jSONObject.optJSONObject("safe_browsing"));
                                optBoolean9 = jSONObject.optBoolean("render_in_browser", zzafp2.f19717K);
                                optBoolean10 = jSONObject.optBoolean("custom_close_blocked");
                                optBoolean11 = jSONObject.optBoolean("enable_omid", false);
                                optString6 = jSONObject.optString("omid_settings", null);
                                optBoolean12 = jSONObject.optBoolean("disable_closable_area", false);
                                bundle = zzafp2.f19735c.f20218m.getBundle(AdMobAdapter.class.getName());
                                if (bundle == null) {
                                }
                                return new zzaft(zzafp, optString13, str2, list, list2, j2, optBoolean2, optLong, a2, j3, i, str3, j, optString11, optBoolean, optString3, optString2, optBoolean3, z2, zzafp2.f19748p, optBoolean4, optBoolean6, optString4, equals, optBoolean7, a5, a3, a4, optBoolean8, a6, zzafp2.f19713G, optString5, a7, optBoolean9, optString9, a8, optString12, optBoolean5, zzafp2.f19727U, optBoolean10, 0, optBoolean11, a, optBoolean12, optString6, "", z);
                            }
                            i = b;
                            if (TextUtils.isEmpty(optString10)) {
                            }
                            optString13 = optString;
                            str2 = optString10;
                            zzaft = null;
                            j = -1;
                            if (str2 == null) {
                                return new zzaft(0);
                            }
                            optJSONArray = jSONObject.optJSONArray("click_urls");
                            if (zzaft != null) {
                                list = zzaft.f19788c;
                            } else {
                                list = null;
                            }
                            if (optJSONArray != null) {
                                list = m9527a(optJSONArray, list);
                            }
                            optJSONArray = jSONObject.optJSONArray("impression_urls");
                            if (zzaft != null) {
                                list2 = zzaft.f19790e;
                            } else {
                                list2 = null;
                            }
                            if (optJSONArray != null) {
                                list2 = m9527a(optJSONArray, list2);
                            }
                            optJSONArray = jSONObject.optJSONArray("downloaded_impression_urls");
                            if (zzaft != null) {
                                list3 = zzaft.f19777R;
                            } else {
                                list3 = null;
                            }
                            if (optJSONArray == null) {
                            }
                            optJSONArray = jSONObject.optJSONArray("manual_impression_urls");
                            if (zzaft != null) {
                                list3 = zzaft.f19794i;
                            } else {
                                list3 = null;
                            }
                            if (optJSONArray == null) {
                            }
                            if (zzaft != null) {
                                if (zzaft.f19796k != -1) {
                                    i = zzaft.f19796k;
                                }
                                if (zzaft.f19791f > 0) {
                                    j2 = zzaft.f19791f;
                                    optString2 = jSONObject.optString("active_view");
                                    optBoolean = jSONObject.optBoolean("ad_is_javascript", false);
                                    if (optBoolean) {
                                    }
                                    optBoolean2 = jSONObject.optBoolean("mediation", false);
                                    optBoolean3 = jSONObject.optBoolean("custom_render_allowed", false);
                                    optBoolean4 = jSONObject.optBoolean("content_url_opted_out", true);
                                    optBoolean5 = jSONObject.optBoolean("content_vertical_opted_out", true);
                                    optBoolean6 = jSONObject.optBoolean("prefetch", false);
                                    str3 = optString8;
                                    j3 = jSONObject.optLong("refresh_interval_milliseconds", -1);
                                    optLong = jSONObject.optLong("mediation_config_cache_time_milliseconds", -1);
                                    optString4 = jSONObject.optString("gws_query_id", "");
                                    equals = "height".equals(jSONObject.optString("fluid", ""));
                                    optBoolean7 = jSONObject.optBoolean("native_express", false);
                                    a3 = m9527a(jSONObject.optJSONArray("video_start_urls"), null);
                                    a4 = m9527a(jSONObject.optJSONArray("video_complete_urls"), null);
                                    a5 = zzajk.m26268a(jSONObject.optJSONArray("rewards"));
                                    optBoolean8 = jSONObject.optBoolean("use_displayed_impression", false);
                                    a6 = zzafv.m26177a(jSONObject.optJSONObject("auto_protection_configuration"));
                                    optString5 = jSONObject.optString("set_cookie", "");
                                    a7 = m9527a(jSONObject.optJSONArray("remote_ping_urls"), null);
                                    a8 = zzajv.m26269a(jSONObject.optJSONObject("safe_browsing"));
                                    optBoolean9 = jSONObject.optBoolean("render_in_browser", zzafp2.f19717K);
                                    optBoolean10 = jSONObject.optBoolean("custom_close_blocked");
                                    optBoolean11 = jSONObject.optBoolean("enable_omid", false);
                                    optString6 = jSONObject.optString("omid_settings", null);
                                    optBoolean12 = jSONObject.optBoolean("disable_closable_area", false);
                                    bundle = zzafp2.f19735c.f20218m.getBundle(AdMobAdapter.class.getName());
                                    if (bundle == null) {
                                    }
                                    return new zzaft(zzafp, optString13, str2, list, list2, j2, optBoolean2, optLong, a2, j3, i, str3, j, optString11, optBoolean, optString3, optString2, optBoolean3, z2, zzafp2.f19748p, optBoolean4, optBoolean6, optString4, equals, optBoolean7, a5, a3, a4, optBoolean8, a6, zzafp2.f19713G, optString5, a7, optBoolean9, optString9, a8, optString12, optBoolean5, zzafp2.f19727U, optBoolean10, 0, optBoolean11, a, optBoolean12, optString6, "", z);
                                }
                            }
                            j2 = j3;
                            optString2 = jSONObject.optString("active_view");
                            optBoolean = jSONObject.optBoolean("ad_is_javascript", false);
                            if (optBoolean) {
                            }
                            optBoolean2 = jSONObject.optBoolean("mediation", false);
                            optBoolean3 = jSONObject.optBoolean("custom_render_allowed", false);
                            optBoolean4 = jSONObject.optBoolean("content_url_opted_out", true);
                            optBoolean5 = jSONObject.optBoolean("content_vertical_opted_out", true);
                            optBoolean6 = jSONObject.optBoolean("prefetch", false);
                            str3 = optString8;
                            j3 = jSONObject.optLong("refresh_interval_milliseconds", -1);
                            optLong = jSONObject.optLong("mediation_config_cache_time_milliseconds", -1);
                            optString4 = jSONObject.optString("gws_query_id", "");
                            equals = "height".equals(jSONObject.optString("fluid", ""));
                            optBoolean7 = jSONObject.optBoolean("native_express", false);
                            a3 = m9527a(jSONObject.optJSONArray("video_start_urls"), null);
                            a4 = m9527a(jSONObject.optJSONArray("video_complete_urls"), null);
                            a5 = zzajk.m26268a(jSONObject.optJSONArray("rewards"));
                            optBoolean8 = jSONObject.optBoolean("use_displayed_impression", false);
                            a6 = zzafv.m26177a(jSONObject.optJSONObject("auto_protection_configuration"));
                            optString5 = jSONObject.optString("set_cookie", "");
                            a7 = m9527a(jSONObject.optJSONArray("remote_ping_urls"), null);
                            a8 = zzajv.m26269a(jSONObject.optJSONObject("safe_browsing"));
                            optBoolean9 = jSONObject.optBoolean("render_in_browser", zzafp2.f19717K);
                            optBoolean10 = jSONObject.optBoolean("custom_close_blocked");
                            optBoolean11 = jSONObject.optBoolean("enable_omid", false);
                            optString6 = jSONObject.optString("omid_settings", null);
                            optBoolean12 = jSONObject.optBoolean("disable_closable_area", false);
                            bundle = zzafp2.f19735c.f20218m.getBundle(AdMobAdapter.class.getName());
                            if (bundle == null) {
                            }
                            return new zzaft(zzafp, optString13, str2, list, list2, j2, optBoolean2, optLong, a2, j3, i, str3, j, optString11, optBoolean, optString3, optString2, optBoolean3, z2, zzafp2.f19748p, optBoolean4, optBoolean6, optString4, equals, optBoolean7, a5, a3, a4, optBoolean8, a6, zzafp2.f19713G, optString5, a7, optBoolean9, optString9, a8, optString12, optBoolean5, zzafp2.f19727U, optBoolean10, 0, optBoolean11, a, optBoolean12, optString6, "", z);
                        } catch (JSONException e) {
                            optString = "Could not parse the inline ad response: ";
                            String valueOf = String.valueOf(e.getMessage());
                            zzaok.m10007e(valueOf.length() != 0 ? optString.concat(valueOf) : new String(optString));
                            return new zzaft(0);
                        }
                    }

                    /* renamed from: a */
                    private static List<String> m9527a(JSONArray jSONArray, List<String> list) {
                        if (jSONArray == null) {
                            return null;
                        }
                        if (list == null) {
                            list = new ArrayList();
                        }
                        for (int i = 0; i < jSONArray.length(); i++) {
                            list.add(jSONArray.getString(i));
                        }
                        return list;
                    }

                    /* renamed from: a */
                    public static JSONObject m9530a(zzaft zzaft) {
                        JSONObject jSONObject = new JSONObject();
                        if (zzaft.f19786a != null) {
                            jSONObject.put("ad_base_url", zzaft.f19786a);
                        }
                        if (zzaft.f19797l != null) {
                            jSONObject.put("ad_size", zzaft.f19797l);
                        }
                        jSONObject.put("native", zzaft.f19804s);
                        if (zzaft.f19804s) {
                            jSONObject.put("ad_json", zzaft.f19787b);
                        } else {
                            jSONObject.put("ad_html", zzaft.f19787b);
                        }
                        if (zzaft.f19799n != null) {
                            jSONObject.put("debug_dialog", zzaft.f19799n);
                        }
                        if (zzaft.f19771L != null) {
                            jSONObject.put("debug_signals", zzaft.f19771L);
                        }
                        if (zzaft.f19791f != -1) {
                            double d = (double) zzaft.f19791f;
                            Double.isNaN(d);
                            jSONObject.put("interstitial_timeout", d / 1000.0d);
                        }
                        if (zzaft.f19796k == zzbv.zzem().mo2365b()) {
                            jSONObject.put("orientation", "portrait");
                        } else if (zzaft.f19796k == zzbv.zzem().mo2363a()) {
                            jSONObject.put("orientation", "landscape");
                        }
                        if (zzaft.f19788c != null) {
                            jSONObject.put("click_urls", m9528a(zzaft.f19788c));
                        }
                        if (zzaft.f19790e != null) {
                            jSONObject.put("impression_urls", m9528a(zzaft.f19790e));
                        }
                        if (zzaft.f19777R != null) {
                            jSONObject.put("downloaded_impression_urls", m9528a(zzaft.f19777R));
                        }
                        if (zzaft.f19794i != null) {
                            jSONObject.put("manual_impression_urls", m9528a(zzaft.f19794i));
                        }
                        if (zzaft.f19802q != null) {
                            jSONObject.put("active_view", zzaft.f19802q);
                        }
                        jSONObject.put("ad_is_javascript", zzaft.f19800o);
                        if (zzaft.f19801p != null) {
                            jSONObject.put("ad_passback_url", zzaft.f19801p);
                        }
                        jSONObject.put("mediation", zzaft.f19792g);
                        jSONObject.put("custom_render_allowed", zzaft.f19803r);
                        jSONObject.put("content_url_opted_out", zzaft.f19806u);
                        jSONObject.put("content_vertical_opted_out", zzaft.f19772M);
                        jSONObject.put("prefetch", zzaft.f19807v);
                        if (zzaft.f19795j != -1) {
                            jSONObject.put("refresh_interval_milliseconds", zzaft.f19795j);
                        }
                        if (zzaft.f19793h != -1) {
                            jSONObject.put("mediation_config_cache_time_milliseconds", zzaft.f19793h);
                        }
                        if (!TextUtils.isEmpty(zzaft.f19809x)) {
                            jSONObject.put("gws_query_id", zzaft.f19809x);
                        }
                        jSONObject.put("fluid", zzaft.f19810y ? "height" : "");
                        jSONObject.put("native_express", zzaft.f19811z);
                        if (zzaft.f19761B != null) {
                            jSONObject.put("video_start_urls", m9528a(zzaft.f19761B));
                        }
                        if (zzaft.f19762C != null) {
                            jSONObject.put("video_complete_urls", m9528a(zzaft.f19762C));
                        }
                        if (zzaft.f19760A != null) {
                            zzajk zzajk = zzaft.f19760A;
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("rb_type", zzajk.f19880a);
                            jSONObject2.put("rb_amount", zzajk.f19881b);
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(jSONObject2);
                            jSONObject.put("rewards", jSONArray);
                        }
                        jSONObject.put("use_displayed_impression", zzaft.f19763D);
                        jSONObject.put("auto_protection_configuration", zzaft.f19764E);
                        jSONObject.put("render_in_browser", zzaft.f19768I);
                        jSONObject.put("disable_closable_area", zzaft.f19778S);
                        return jSONObject;
                    }

                    /* renamed from: a */
                    private static JSONArray m9528a(List<String> list) {
                        JSONArray jSONArray = new JSONArray();
                        for (String put : list) {
                            jSONArray.put(put);
                        }
                        return jSONArray;
                    }
                }
