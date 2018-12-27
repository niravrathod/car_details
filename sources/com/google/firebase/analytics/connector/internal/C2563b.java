package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.measurement.AppMeasurement.UserProperty;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.firebase.analytics.connector.internal.b */
public final class C2563b {
    /* renamed from: a */
    private static final Set<String> f10911a = new HashSet(Arrays.asList(new String[]{"_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}));
    /* renamed from: b */
    private static final List<String> f10912b = Arrays.asList(new String[]{"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd", "app_open"});
    /* renamed from: c */
    private static final List<String> f10913c = Arrays.asList(new String[]{"auto", "app", "am"});
    /* renamed from: d */
    private static final List<String> f10914d = Arrays.asList(new String[]{"_r", "_dbg"});
    /* renamed from: e */
    private static final List<String> f10915e = Arrays.asList((String[]) ArrayUtils.concat(UserProperty.f10399a, UserProperty.f10400b));
    /* renamed from: f */
    private static final List<String> f10916f = Arrays.asList(new String[]{"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"});

    /* renamed from: a */
    public static boolean m12582a(String str) {
        return f10913c.contains(str) == null ? true : null;
    }

    /* renamed from: a */
    public static boolean m12583a(String str, Bundle bundle) {
        if (f10912b.contains(str) != null) {
            return false;
        }
        if (bundle != null) {
            for (String containsKey : f10914d) {
                if (bundle.containsKey(containsKey)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m12584a(String str, String str2) {
        if (!"_ce1".equals(str2)) {
            if (!"_ce2".equals(str2)) {
                if ("_ln".equals(str2)) {
                    if (str.equals("fcm") == null) {
                        if (str.equals("fiam") == null) {
                            return false;
                        }
                    }
                    return true;
                } else if (f10915e.contains(str2) != null) {
                    return false;
                } else {
                    for (String matches : f10916f) {
                        if (str2.matches(matches)) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        if (str.equals("fcm") == null) {
            if (str.equals("frc") == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m12585a(String str, String str2, Bundle bundle) {
        if ("_cmp".equals(str2) == null) {
            return true;
        }
        if (C2563b.m12582a(str) == null || bundle == null) {
            return false;
        }
        for (String containsKey : f10914d) {
            if (bundle.containsKey(containsKey)) {
                return false;
            }
        }
        int hashCode = str.hashCode();
        if (hashCode != 101200) {
            if (hashCode != 101230) {
                if (hashCode == 3142703) {
                    if (str.equals("fiam") != null) {
                        str = 2;
                        switch (str) {
                            case null:
                                bundle.putString("_cis", "fcm_integration");
                                return true;
                            case 1:
                                bundle.putString("_cis", "fdl_integration");
                                return true;
                            case 2:
                                bundle.putString("_cis", "fiam_integration");
                                return true;
                            default:
                                return false;
                        }
                    }
                }
            } else if (str.equals("fdl") != null) {
                str = true;
                switch (str) {
                    case null:
                        bundle.putString("_cis", "fcm_integration");
                        return true;
                    case 1:
                        bundle.putString("_cis", "fdl_integration");
                        return true;
                    case 2:
                        bundle.putString("_cis", "fiam_integration");
                        return true;
                    default:
                        return false;
                }
            }
        } else if (str.equals("fcm") != null) {
            str = null;
            switch (str) {
                case null:
                    bundle.putString("_cis", "fcm_integration");
                    return true;
                case 1:
                    bundle.putString("_cis", "fdl_integration");
                    return true;
                case 2:
                    bundle.putString("_cis", "fiam_integration");
                    return true;
                default:
                    return false;
            }
        }
        str = -1;
        switch (str) {
            case null:
                bundle.putString("_cis", "fcm_integration");
                return true;
            case 1:
                bundle.putString("_cis", "fdl_integration");
                return true;
            case 2:
                bundle.putString("_cis", "fiam_integration");
                return true;
            default:
                return false;
        }
    }
}
