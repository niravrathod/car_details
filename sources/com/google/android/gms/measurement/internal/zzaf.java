package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzsl;
import com.google.android.gms.internal.measurement.zzsv;
import java.util.ArrayList;
import java.util.List;

@VisibleForTesting
public final class zzaf {
    /* renamed from: A */
    public static zza<Long> f10686A = zza.m12324a("measurement.upload.window_interval", 3600000, 3600000);
    /* renamed from: B */
    public static zza<Long> f10687B = zza.m12324a("measurement.upload.interval", 3600000, 3600000);
    /* renamed from: C */
    public static zza<Long> f10688C = zza.m12324a("measurement.upload.realtime_upload_interval", 10000, 10000);
    /* renamed from: D */
    public static zza<Long> f10689D = zza.m12324a("measurement.upload.debug_upload_interval", 1000, 1000);
    /* renamed from: E */
    public static zza<Long> f10690E = zza.m12324a("measurement.upload.minimum_delay", 500, 500);
    /* renamed from: F */
    public static zza<Long> f10691F = zza.m12324a("measurement.alarm_manager.minimum_interval", 60000, 60000);
    /* renamed from: G */
    public static zza<Long> f10692G = zza.m12324a("measurement.upload.stale_data_deletion_interval", 86400000, 86400000);
    /* renamed from: H */
    public static zza<Long> f10693H = zza.m12324a("measurement.upload.refresh_blacklisted_config_interval", 604800000, 604800000);
    /* renamed from: I */
    public static zza<Long> f10694I = zza.m12324a("measurement.upload.initial_upload_delay_time", 15000, 15000);
    /* renamed from: J */
    public static zza<Long> f10695J = zza.m12324a("measurement.upload.retry_time", 1800000, 1800000);
    /* renamed from: K */
    public static zza<Integer> f10696K = zza.m12323a("measurement.upload.retry_count", 6, 6);
    /* renamed from: L */
    public static zza<Long> f10697L = zza.m12324a("measurement.upload.max_queue_time", 2419200000L, 2419200000L);
    /* renamed from: M */
    public static zza<Integer> f10698M = zza.m12323a("measurement.lifetimevalue.max_currency_tracked", 4, 4);
    /* renamed from: N */
    public static zza<Integer> f10699N = zza.m12323a("measurement.audience.filter_result_max_count", 200, 200);
    /* renamed from: O */
    public static zza<Long> f10700O = zza.m12324a("measurement.service_client.idle_disconnect_millis", 5000, 5000);
    /* renamed from: P */
    public static zza<Boolean> f10701P = zza.m12326a("measurement.test.boolean_flag", false, false);
    /* renamed from: Q */
    public static zza<String> f10702Q;
    /* renamed from: R */
    public static zza<Long> f10703R = zza.m12324a("measurement.test.long_flag", -1, -1);
    /* renamed from: S */
    public static zza<Integer> f10704S = zza.m12323a("measurement.test.int_flag", -2, -2);
    /* renamed from: T */
    public static zza<Double> f10705T = zza.m12322a("measurement.test.double_flag", -3.0d, -3.0d);
    /* renamed from: U */
    public static zza<Boolean> f10706U = zza.m12326a("measurement.lifetimevalue.user_engagement_tracking_enabled", false, false);
    /* renamed from: V */
    public static zza<Boolean> f10707V = zza.m12326a("measurement.audience.complex_param_evaluation", false, false);
    /* renamed from: W */
    public static zza<Boolean> f10708W = zza.m12326a("measurement.validation.internal_limits_internal_event_params", false, false);
    /* renamed from: X */
    public static zza<Boolean> f10709X = zza.m12326a("measurement.quality.unsuccessful_update_retry_counter", false, false);
    /* renamed from: Y */
    public static zza<Boolean> f10710Y = zza.m12326a("measurement.iid.disable_on_collection_disabled", true, true);
    /* renamed from: Z */
    public static zza<Boolean> f10711Z = zza.m12326a("measurement.app_launch.call_only_when_enabled", true, true);
    /* renamed from: a */
    static zzk f10712a;
    public static zza<Boolean> aa = zza.m12326a("measurement.run_on_worker_inline", true, false);
    public static zza<Boolean> ab = zza.m12326a("measurement.audience.dynamic_filters", false, false);
    public static zza<Boolean> ac = zza.m12326a("measurement.reset_analytics.persist_time", false, false);
    public static zza<Boolean> ad = zza.m12326a("measurement.validation.value_and_currency_params", false, false);
    public static zza<Boolean> ae = zza.m12326a("measurement.sampling.time_zone_offset_enabled", false, false);
    public static zza<Boolean> af = zza.m12326a("measurement.referrer.enable_logging_install_referrer_cmp_from_apk", false, false);
    public static zza<Boolean> ag = zza.m12326a("measurement.disconnect_from_remote_service", false, false);
    public static zza<Boolean> ah = zza.m12326a("measurement.clear_local_database", false, false);
    public static zza<Boolean> ai = zza.m12326a("measurement.fetch_config_with_admob_app_id", false, false);
    public static zza<Boolean> aj = zza.m12326a("measurement.sessions.session_id_enabled", false, false);
    public static zza<Boolean> ak = zza.m12326a("measurement.sessions.immediate_start_enabled", false, false);
    public static zza<Boolean> al = zza.m12326a("measurement.collection.firebase_global_collection_flag_enabled", true, true);
    public static zza<Boolean> am = zza.m12326a("measurement.personalized_ads_feature_enabled", false, false);
    public static zza<Boolean> an = zza.m12326a("measurement.remove_app_instance_id_cache_enabled", true, true);
    private static final zzsv ao;
    private static volatile zzbt ap;
    @VisibleForTesting
    private static Boolean aq;
    private static zza<Boolean> ar = zza.m12326a("measurement.log_third_party_store_events_enabled", false, false);
    private static zza<Boolean> as = zza.m12326a("measurement.log_installs_enabled", false, false);
    private static zza<Boolean> at = zza.m12326a("measurement.log_upgrades_enabled", false, false);
    private static zza<Boolean> au = zza.m12326a("measurement.sessions.background_sessions_enabled", false, false);
    private static zza<Boolean> av = zza.m12326a("measurement.collection.efficient_engagement_reporting_enabled", false, false);
    /* renamed from: b */
    static List<zza<Integer>> f10713b = new ArrayList();
    /* renamed from: c */
    static List<zza<Long>> f10714c = new ArrayList();
    /* renamed from: d */
    static List<zza<Boolean>> f10715d = new ArrayList();
    /* renamed from: e */
    static List<zza<String>> f10716e = new ArrayList();
    /* renamed from: f */
    static List<zza<Double>> f10717f = new ArrayList();
    /* renamed from: g */
    public static zza<Boolean> f10718g = zza.m12326a("measurement.log_androidId_enabled", false, false);
    /* renamed from: h */
    public static zza<Boolean> f10719h = zza.m12326a("measurement.upload_dsid_enabled", false, false);
    /* renamed from: i */
    public static zza<String> f10720i = zza.m12325a("measurement.log_tag", "FA", "FA-SVC");
    /* renamed from: j */
    public static zza<Long> f10721j = zza.m12324a("measurement.ad_id_cache_time", 10000, 10000);
    /* renamed from: k */
    public static zza<Long> f10722k = zza.m12324a("measurement.monitoring.sample_period_millis", 86400000, 86400000);
    /* renamed from: l */
    public static zza<Long> f10723l = zza.m12324a("measurement.config.cache_time", 86400000, 3600000);
    /* renamed from: m */
    public static zza<String> f10724m;
    /* renamed from: n */
    public static zza<String> f10725n;
    /* renamed from: o */
    public static zza<Integer> f10726o = zza.m12323a("measurement.upload.max_bundles", 100, 100);
    /* renamed from: p */
    public static zza<Integer> f10727p = zza.m12323a("measurement.upload.max_batch_size", 65536, 65536);
    /* renamed from: q */
    public static zza<Integer> f10728q = zza.m12323a("measurement.upload.max_bundle_size", 65536, 65536);
    /* renamed from: r */
    public static zza<Integer> f10729r = zza.m12323a("measurement.upload.max_events_per_bundle", 1000, 1000);
    /* renamed from: s */
    public static zza<Integer> f10730s = zza.m12323a("measurement.upload.max_events_per_day", 100000, 100000);
    /* renamed from: t */
    public static zza<Integer> f10731t = zza.m12323a("measurement.upload.max_error_events_per_day", 1000, 1000);
    /* renamed from: u */
    public static zza<Integer> f10732u = zza.m12323a("measurement.upload.max_public_events_per_day", 50000, 50000);
    /* renamed from: v */
    public static zza<Integer> f10733v = zza.m12323a("measurement.upload.max_conversions_per_day", 500, 500);
    /* renamed from: w */
    public static zza<Integer> f10734w = zza.m12323a("measurement.upload.max_realtime_events_per_day", 10, 10);
    /* renamed from: x */
    public static zza<Integer> f10735x = zza.m12323a("measurement.store.max_stored_events_per_app", 100000, 100000);
    /* renamed from: y */
    public static zza<String> f10736y;
    /* renamed from: z */
    public static zza<Long> f10737z = zza.m12324a("measurement.upload.backoff_period", 43200000, 43200000);

    @VisibleForTesting
    public static final class zza<V> {
        /* renamed from: a */
        private zzsl<V> f10681a;
        /* renamed from: b */
        private final V f10682b;
        /* renamed from: c */
        private final V f10683c;
        /* renamed from: d */
        private volatile V f10684d;
        /* renamed from: e */
        private final String f10685e;

        private zza(String str, V v, V v2) {
            this.f10685e = str;
            this.f10683c = v;
            this.f10682b = v2;
        }

        /* renamed from: a */
        static zza<Boolean> m12326a(String str, boolean z, boolean z2) {
            zza<Boolean> zza = new zza(str, Boolean.valueOf(z), Boolean.valueOf(z2));
            zzaf.f10715d.add(zza);
            return zza;
        }

        /* renamed from: a */
        static zza<String> m12325a(String str, String str2, String str3) {
            zza<String> zza = new zza(str, str2, str3);
            zzaf.f10716e.add(zza);
            return zza;
        }

        /* renamed from: a */
        static zza<Long> m12324a(String str, long j, long j2) {
            zza<Long> zza = new zza(str, Long.valueOf(j), Long.valueOf(j2));
            zzaf.f10714c.add(zza);
            return zza;
        }

        /* renamed from: a */
        static zza<Integer> m12323a(String str, int i, int i2) {
            zza<Integer> zza = new zza(str, Integer.valueOf(i), Integer.valueOf(i2));
            zzaf.f10713b.add(zza);
            return zza;
        }

        /* renamed from: a */
        static zza<Double> m12322a(String str, double d, double d2) {
            d = new zza(str, Double.valueOf(-3.0d), Double.valueOf(-3.0d));
            zzaf.f10717f.add(d);
            return d;
        }

        /* renamed from: a */
        public final String m12331a() {
            return this.f10685e;
        }

        /* renamed from: d */
        private static void m12328d() {
            synchronized (zza.class) {
                for (zza zza : zzaf.f10715d) {
                    zzsv a = zzaf.ao;
                    String str = zza.f10685e;
                    zzk zzk = zzaf.f10712a;
                    zza.f10681a = a.m12001a(str, ((Boolean) zza.f10683c).booleanValue());
                }
                for (zza zza2 : zzaf.f10716e) {
                    a = zzaf.ao;
                    str = zza2.f10685e;
                    zzk = zzaf.f10712a;
                    zza2.f10681a = a.m12000a(str, (String) zza2.f10683c);
                }
                for (zza zza22 : zzaf.f10714c) {
                    a = zzaf.ao;
                    str = zza22.f10685e;
                    zzk = zzaf.f10712a;
                    zza22.f10681a = a.m11999a(str, ((Long) zza22.f10683c).longValue());
                }
                for (zza zza222 : zzaf.f10713b) {
                    a = zzaf.ao;
                    str = zza222.f10685e;
                    zzk = zzaf.f10712a;
                    zza222.f10681a = a.m11998a(str, ((Integer) zza222.f10683c).intValue());
                }
                for (zza zza2222 : zzaf.f10717f) {
                    a = zzaf.ao;
                    str = zza2222.f10685e;
                    zzk = zzaf.f10712a;
                    zza2222.f10681a = a.m11997a(str, ((Double) zza2222.f10683c).doubleValue());
                }
            }
        }

        /* renamed from: e */
        private static void m12329e() {
            synchronized (zza.class) {
                if (zzk.m12390a()) {
                    throw new IllegalStateException("Tried to refresh flag cache on main thread or on package side.");
                }
                zzk zzk = zzaf.f10712a;
                try {
                    for (zza zza : zzaf.f10715d) {
                        zza.f10684d = zza.f10681a.m11992b();
                    }
                    for (zza zza2 : zzaf.f10716e) {
                        zza2.f10684d = zza2.f10681a.m11992b();
                    }
                    for (zza zza22 : zzaf.f10714c) {
                        zza22.f10684d = zza22.f10681a.m11992b();
                    }
                    for (zza zza222 : zzaf.f10713b) {
                        zza222.f10684d = zza222.f10681a.m11992b();
                    }
                    for (zza zza2222 : zzaf.f10717f) {
                        zza2222.f10684d = zza2222.f10681a.m11992b();
                    }
                } catch (Exception e) {
                    zzaf.m12336a(e);
                }
            }
        }

        /* renamed from: b */
        public final V m12332b() {
            if (zzaf.f10712a == null) {
                return this.f10683c;
            }
            zzk zzk = zzaf.f10712a;
            if (zzk.m12390a()) {
                return this.f10684d == null ? this.f10683c : this.f10684d;
            } else {
                m12329e();
                try {
                    return this.f10681a.m11992b();
                } catch (Exception e) {
                    zzaf.m12336a(e);
                    return this.f10681a.m11990a();
                }
            }
        }

        /* renamed from: a */
        public final V m12330a(V v) {
            if (v != null) {
                return v;
            }
            if (zzaf.f10712a == null) {
                return this.f10683c;
            }
            v = zzaf.f10712a;
            if (zzk.m12390a() != null) {
                return this.f10684d == null ? this.f10683c : this.f10684d;
            } else {
                m12329e();
                try {
                    return this.f10681a.m11992b();
                } catch (Exception e) {
                    zzaf.m12336a(e);
                    return this.f10681a.m11990a();
                }
            }
        }
    }

    /* renamed from: a */
    static void m12334a(zzbt zzbt) {
        ap = zzbt;
    }

    @VisibleForTesting
    /* renamed from: a */
    static void m12336a(Exception exception) {
        if (ap != null) {
            Context n = ap.mo3170n();
            if (aq == null) {
                aq = Boolean.valueOf(GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(n, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE) == 0);
            }
            if (aq.booleanValue()) {
                ap.mo3172r().v_().m12355a("Got Exception on PhenotypeFlag.get on Play device", exception);
            }
        }
    }

    /* renamed from: a */
    static void m12335a(zzk zzk) {
        f10712a = zzk;
        zza.m12328d();
    }

    static {
        String str = "content://com.google.android.gms.phenotype/";
        String valueOf = String.valueOf(Uri.encode("com.google.android.gms.measurement"));
        ao = new zzsv(Uri.parse(valueOf.length() != 0 ? str.concat(valueOf) : new String(str)));
        String str2 = "https";
        f10724m = zza.m12325a("measurement.config.url_scheme", str2, str2);
        str2 = "app-measurement.com";
        f10725n = zza.m12325a("measurement.config.url_authority", str2, str2);
        str2 = "https://app-measurement.com/a";
        f10736y = zza.m12325a("measurement.upload.url", str2, str2);
        str = "---";
        f10702Q = zza.m12325a("measurement.test.string_flag", str, str);
    }
}
