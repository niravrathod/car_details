package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

@zzaer
public final class zznw {
    /* renamed from: A */
    public static final zznl<Boolean> f9676A = zznl.m10880a(1, "gads:video:aggressive_media_codec_release", Boolean.valueOf(false));
    /* renamed from: B */
    public static final zznl<Boolean> f9677B = zznl.m10880a(1, "gads:memory_bundle:debug_info", Boolean.valueOf(false));
    /* renamed from: C */
    public static final zznl<String> f9678C = zznl.m10881a(1, "gads:video:codec_query_mime_types", "");
    /* renamed from: D */
    public static final zznl<Integer> f9679D = zznl.m10878a(1, "gads:video:codec_query_minimum_version", 16);
    /* renamed from: E */
    public static final zznl<String> f9680E = zznl.m10881a(1, "gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_banner.js");
    /* renamed from: F */
    public static final zznl<String> f9681F = zznl.m10881a(1, "gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_expanded_banner.js");
    /* renamed from: G */
    public static final zznl<String> f9682G = zznl.m10881a(1, "gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_interstitial.js");
    /* renamed from: H */
    public static final zznl<String> f9683H = zznl.m10881a(1, "gad:mraid:version", "2.0");
    /* renamed from: I */
    public static final zznl<Boolean> f9684I = zznl.m10880a(1, "gads:mraid:unload", Boolean.valueOf(false));
    /* renamed from: J */
    public static final zznl<Boolean> f9685J = zznl.m10880a(0, "gads:enabled_sdk_csi", Boolean.valueOf(false));
    /* renamed from: K */
    public static final zznl<String> f9686K = zznl.m10881a(0, "gads:sdk_csi_server", "https://csi.gstatic.com/csi");
    /* renamed from: L */
    public static final zznl<Boolean> f9687L = zznl.m10880a(0, "gads:sdk_csi_write_to_file", Boolean.valueOf(false));
    /* renamed from: M */
    public static final zznl<Boolean> f9688M = zznl.m10880a(0, "gads:enable_content_fetching", Boolean.valueOf(true));
    /* renamed from: N */
    public static final zznl<Integer> f9689N = zznl.m10878a(0, "gads:content_length_weight", 1);
    /* renamed from: O */
    public static final zznl<Integer> f9690O = zznl.m10878a(0, "gads:content_age_weight", 1);
    /* renamed from: P */
    public static final zznl<Integer> f9691P = zznl.m10878a(0, "gads:min_content_len", 11);
    /* renamed from: Q */
    public static final zznl<Integer> f9692Q = zznl.m10878a(0, "gads:fingerprint_number", 10);
    /* renamed from: R */
    public static final zznl<Integer> f9693R = zznl.m10878a(0, "gads:sleep_sec", 10);
    /* renamed from: S */
    public static final zznl<Integer> f9694S = zznl.m10878a(1, "gads:content_vertical_fingerprint_number", 100);
    /* renamed from: T */
    public static final zznl<Integer> f9695T = zznl.m10878a(1, "gads:content_vertical_fingerprint_bits", 23);
    /* renamed from: U */
    public static final zznl<Integer> f9696U = zznl.m10878a(1, "gads:content_vertical_fingerprint_ngram", 3);
    /* renamed from: V */
    public static final zznl<String> f9697V = zznl.m10881a(1, "gads:content_fetch_view_tag_id", "googlebot");
    /* renamed from: W */
    public static final zznl<String> f9698W = zznl.m10881a(1, "gads:content_fetch_exclude_view_tag", "none");
    /* renamed from: X */
    public static final zznl<Boolean> f9699X = zznl.m10880a(1, "gads:content_fetch_disable_get_title_from_webview", Boolean.valueOf(false));
    /* renamed from: Y */
    public static final zznl<Boolean> f9700Y = zznl.m10880a(0, "gads:app_index:without_content_info_present:enabled", Boolean.valueOf(true));
    /* renamed from: Z */
    public static final zznl<Long> f9701Z = zznl.m10879a(0, "gads:app_index:timeout_ms", 1000);
    /* renamed from: a */
    public static final zznl<String> f9702a = zznl.m10881a(0, "gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html");
    public static final zznl<Boolean> aA = zznl.m10880a(1, "gads:disabling_closable_area:enabled", Boolean.valueOf(false));
    public static final zznl<Boolean> aB = zznl.m10880a(1, "gads:interstitial_ad_pool:enabled", Boolean.valueOf(false));
    public static final zznl<Boolean> aC = zznl.m10880a(1, "gads:interstitial_ad_pool:enabled_for_rewarded", Boolean.valueOf(false));
    public static final zznl<String> aD = zznl.m10881a(1, "gads:interstitial_ad_pool:schema", "customTargeting");
    public static final zznl<String> aE = zznl.m10881a(1, "gads:interstitial_ad_pool:request_exclusions", "com.google.ads.mediation.admob.AdMobAdapter/_ad");
    public static final zznl<Integer> aF = zznl.m10878a(1, "gads:interstitial_ad_pool:max_pools", 3);
    public static final zznl<Integer> aG = zznl.m10878a(1, "gads:interstitial_ad_pool:max_pool_depth", 2);
    public static final zznl<Integer> aH = zznl.m10878a(1, "gads:interstitial_ad_pool:time_limit_sec", 1200);
    public static final zznl<String> aI = zznl.m10881a(1, "gads:interstitial_ad_pool:ad_unit_exclusions", "(?!)");
    public static final zznl<Integer> aJ = zznl.m10878a(1, "gads:interstitial_ad_pool:top_off_latency_min_millis", 0);
    public static final zznl<Integer> aK = zznl.m10878a(1, "gads:interstitial_ad_pool:top_off_latency_range_millis", 0);
    public static final zznl<Long> aL = zznl.m10879a(1, "gads:interstitial_ad_pool:discard_thresholds", 0);
    public static final zznl<Long> aM = zznl.m10879a(1, "gads:interstitial_ad_pool:miss_thresholds", 0);
    public static final zznl<Float> aN = zznl.m10877a(1, "gads:interstitial_ad_pool:discard_asymptote", 0.0f);
    public static final zznl<Float> aO = zznl.m10877a(1, "gads:interstitial_ad_pool:miss_asymptote", 0.0f);
    public static final zznl<Boolean> aP = zznl.m10880a(0, "gads:debug_logging_feature:enable", Boolean.valueOf(false));
    public static final zznl<Boolean> aQ = zznl.m10880a(0, "gads:debug_logging_feature:intercept_web_view", Boolean.valueOf(false));
    public static final zznl<String> aR = zznl.m10881a(1, "gads:spherical_video:vertex_shader", "");
    public static final zznl<String> aS = zznl.m10881a(1, "gads:spherical_video:fragment_shader", "");
    public static final zznl<Boolean> aT = zznl.m10880a(0, "gads:log:verbose_enabled", Boolean.valueOf(false));
    public static final zznl<Boolean> aU = zznl.m10880a(1, "gads:include_local_global_rectangles", Boolean.valueOf(false));
    public static final zznl<Long> aV = zznl.m10879a(1, "gads:position_watcher:throttle_ms", 200);
    public static final zznl<Long> aW = zznl.m10879a(0, "gads:device_info_caching_expiry_ms:expiry", 300000);
    public static final zznl<Boolean> aX = zznl.m10880a(1, "gads:gen204_signals:enabled", Boolean.valueOf(false));
    public static final zznl<Boolean> aY = zznl.m10880a(0, "gads:webview:error_reporting_enabled", Boolean.valueOf(false));
    public static final zznl<Long> aZ = zznl.m10879a(0, "gads:resolve_future:default_timeout_ms", 30000);
    public static final zznl<Boolean> aa = zznl.m10880a(0, "gads:ad_key_enabled", Boolean.valueOf(false));
    public static final zznl<Boolean> ab = zznl.m10880a(1, "gads:sai:enabled", Boolean.valueOf(true));
    public static final zznl<String> ac = zznl.m10881a(1, "gads:sai:click_ping_schema_v2", "^[^?]*(/aclk\\?|/pcs/click\\?).*");
    public static final zznl<String> ad = zznl.m10881a(1, "gads:sai:impression_ping_schema_v2", "^[^?]*/adview.*");
    public static final zznl<Boolean> ae = zznl.m10880a(1, "gads:sai:using_macro:enabled", Boolean.valueOf(false));
    public static final zznl<String> af = zznl.m10881a(1, "gads:sai:ad_event_id_macro_name", "[gw_fbsaeid]");
    public static final zznl<Long> ag = zznl.m10879a(1, "gads:sai:timeout_ms", -1);
    public static final zznl<Integer> ah = zznl.m10878a(1, "gads:sai:scion_thread_pool_size", 5);
    public static final zznl<Boolean> ai = zznl.m10880a(1, "gads:sai:gmscore_availability_check_disabled", Boolean.valueOf(false));
    public static final zznl<Boolean> aj = zznl.m10880a(1, "gads:sai:logging_disabled_for_drx", Boolean.valueOf(false));
    public static final zznl<Boolean> ak = zznl.m10880a(1, "gads:interstitial:app_must_be_foreground:enabled", Boolean.valueOf(false));
    public static final zznl<Boolean> al = zznl.m10880a(0, "gads:corewebview:adwebview_factory:enable", Boolean.valueOf(false));
    public static final zznl<Boolean> am = zznl.m10880a(0, "gads:corewebview:javascript_engine", Boolean.valueOf(false));
    public static final zznl<Boolean> an = zznl.m10880a(1, "gad:webview:inject_scripts", Boolean.valueOf(false));
    public static final zznl<Boolean> ao = zznl.m10880a(0, "gads:webview:permission:disabled", Boolean.valueOf(false));
    public static final zznl<Boolean> ap = zznl.m10880a(1, "gads:rewarded:adapter_initialization_enabled", Boolean.valueOf(false));
    public static final zznl<Long> aq = zznl.m10879a(1, "gads:rewarded:adapter_timeout_ms", 20000);
    public static final zznl<Boolean> ar = zznl.m10880a(1, "gads:rewarded:ad_metadata_enabled", Boolean.valueOf(false));
    public static final zznl<Boolean> as = zznl.m10880a(1, "gads:rewarded:ssv_custom_data_enabled", Boolean.valueOf(true));
    public static final zznl<Long> at = zznl.m10879a(1, "gads:app_activity_tracker:notify_background_listeners_delay_ms", 500);
    public static final zznl<Long> au = zznl.m10879a(1, "gads:app_activity_tracker:app_session_timeout_ms", TimeUnit.MINUTES.toMillis(5));
    public static final zznl<Boolean> av = zznl.m10880a(1, "gads:adid_values_in_adrequest:enabled", Boolean.valueOf(false));
    public static final zznl<Long> aw = zznl.m10879a(1, "gads:adid_values_in_adrequest:timeout", 2000);
    public static final zznl<Boolean> ax = zznl.m10880a(1, "gads:disable_adid_values_in_ms", Boolean.valueOf(false));
    public static final zznl<Long> ay = zznl.m10879a(1, "gads:ad_overlay:delay_page_close_timeout_ms", 5000);
    public static final zznl<Boolean> az = zznl.m10880a(1, "gads:custom_close_blocking:enabled", Boolean.valueOf(false));
    /* renamed from: b */
    public static final zznl<Boolean> f9703b = zznl.m10880a(0, "gads:sdk_crash_report_enabled", Boolean.valueOf(false));
    public static final zznl<String> bA = zznl.m10881a(1, "gads:ad_choices_content_description", "Ad Choices Icon");
    public static final zznl<Boolean> bB = zznl.m10880a(1, "gads:enable_store_active_view_state", Boolean.valueOf(false));
    public static final zznl<Boolean> bC = zznl.m10880a(1, "gads:enable_singleton_broadcast_receiver", Boolean.valueOf(false));
    public static final zznl<Boolean> bD = zznl.m10880a(1, "gads:native:media_view_match_parent:enabled", Boolean.valueOf(false));
    public static final zznl<Boolean> bE = zznl.m10880a(1, "gads:native:count_impression_for_assets", Boolean.valueOf(false));
    public static final zznl<Boolean> bF = zznl.m10880a(1, "gads:native:custom_one_point_five_click:enable", Boolean.valueOf(true));
    public static final zznl<Boolean> bG = zznl.m10880a(1, "gads:unified_native_ad:enable", Boolean.valueOf(true));
    public static final zznl<Boolean> bH = zznl.m10880a(1, "gads:instream_ad:enabled", Boolean.valueOf(true));
    public static final zznl<Boolean> bI = zznl.m10880a(1, "gads:fluid_ad:use_wrap_content_height", Boolean.valueOf(false));
    public static final zznl<Long> bJ = zznl.m10879a(1, "gads:auto_location_timeout", 2000);
    public static final zznl<Boolean> bK = zznl.m10880a(1, "gads:fetch_app_settings_using_cld:enabled", Boolean.valueOf(false));
    public static final zznl<Long> bL = zznl.m10879a(1, "gads:fetch_app_settings_using_cld:refresh_interval_ms", 7200000);
    public static final zznl<String> bM = zznl.m10881a(0, "gads:afs:csa_webview_gmsg_ad_failed", "gmsg://noAdLoaded");
    public static final zznl<String> bN = zznl.m10881a(0, "gads:afs:csa_webview_gmsg_script_load_failed", "gmsg://scriptLoadFailed");
    public static final zznl<String> bO = zznl.m10881a(0, "gads:afs:csa_webview_gmsg_ad_loaded", "gmsg://adResized");
    public static final zznl<String> bP = zznl.m10881a(0, "gads:afs:csa_webview_static_file_path", "/afs/ads/i/webview.html");
    public static final zznl<String> bQ = zznl.m10881a(0, "gads:afs:csa_webview_custom_domain_param_key", "csa_customDomain");
    public static final zznl<Long> bR = zznl.m10879a(0, "gads:afs:csa_webview_adshield_timeout_ms", 1000);
    public static final zznl<Long> bS = zznl.m10879a(1, "gads:parental_controls:timeout", 2000);
    public static final zznl<Boolean> bT = zznl.m10880a(0, "gads:safe_browsing:debug", Boolean.valueOf(false));
    public static final zznl<Boolean> bU = zznl.m10880a(1, "gads:cache:bind_on_foreground", Boolean.valueOf(false));
    public static final zznl<Boolean> bV = zznl.m10880a(1, "gads:cache:bind_on_init", Boolean.valueOf(false));
    public static final zznl<Boolean> bW = zznl.m10880a(1, "gads:cache:bind_on_request", Boolean.valueOf(false));
    public static final zznl<Long> bX = zznl.m10879a(1, "gads:cache:bind_on_request_keep_alive", TimeUnit.SECONDS.toMillis(30));
    public static final zznl<Boolean> bY = zznl.m10880a(1, "gads:cache:use_cache_data_source", Boolean.valueOf(false));
    public static final zznl<Boolean> bZ = zznl.m10880a(1, "gads:http_assets_cache:enabled", Boolean.valueOf(false));
    public static final zznl<Long> ba = zznl.m10879a(0, "gads:ad_loader:timeout_ms", 60000);
    public static final zznl<Long> bb = zznl.m10879a(0, "gads:rendering:timeout_ms", 60000);
    public static final zznl<Boolean> bc = zznl.m10880a(0, "gads:adshield:enable_adshield_instrumentation", Boolean.valueOf(false));
    public static final zznl<Long> bd = zznl.m10879a(1, "gads:gestures:task_timeout", 2000);
    public static final zznl<Boolean> be = zznl.m10880a(1, "gads:gestures:asig:enabled", Boolean.valueOf(false));
    public static final zznl<Boolean> bf = zznl.m10880a(1, "gads:gestures:ans:enabled", Boolean.valueOf(false));
    public static final zznl<Boolean> bg = zznl.m10880a(1, "gads:gestures:tos:enabled", Boolean.valueOf(false));
    public static final zznl<Boolean> bh = zznl.m10880a(1, "gads:gestures:brt:enabled", Boolean.valueOf(false));
    public static final zznl<Boolean> bi = zznl.m10880a(1, "gads:signal:app_permissions:disabled", Boolean.valueOf(false));
    public static final zznl<Boolean> bj = zznl.m10880a(1, "gads:gestures:inthex:enabled", Boolean.valueOf(false));
    public static final zznl<Boolean> bk = zznl.m10880a(1, "gads:gestures:hpk:enabled", Boolean.valueOf(true));
    public static final zznl<String> bl = zznl.m10881a(1, "gads:gestures:pk", "");
    public static final zznl<Boolean> bm = zznl.m10880a(1, "gads:gestures:bs:enabled", Boolean.valueOf(true));
    public static final zznl<Boolean> bn = zznl.m10880a(1, "gads:gestures:check_initialization_thread:enabled", Boolean.valueOf(false));
    public static final zznl<Boolean> bo = zznl.m10880a(1, "gads:gestures:get_query_in_non_ui_thread:enabled", Boolean.valueOf(true));
    public static final zznl<Boolean> bp = zznl.m10880a(0, "gass:enabled", Boolean.valueOf(true));
    public static final zznl<Boolean> bq = zznl.m10880a(0, "gass:enable_int_signal", Boolean.valueOf(true));
    public static final zznl<Boolean> br = zznl.m10880a(0, "gass:enable_ad_attestation_signal", Boolean.valueOf(true));
    public static final zznl<String> bs = zznl.m10881a(1, "gads:sdk_core_constants:caps", "");
    public static final zznl<Long> bt = zznl.m10879a(0, "gads:js_flags:update_interval", TimeUnit.HOURS.toMillis(12));
    public static final zznl<Boolean> bu = zznl.m10880a(0, "gads:js_flags:mf", Boolean.valueOf(false));
    public static final zznl<Boolean> bv = zznl.m10880a(0, "gads:custom_render:ping_on_ad_rendered", Boolean.valueOf(false));
    public static final zznl<String> bw = zznl.m10881a(1, "gads:native:engine_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");
    public static final zznl<String> bx = zznl.m10881a(1, "gads:native:video_url_with_protocol", "https://imasdk.googleapis.com/admob/sdkloader/native_video.html");
    public static final zznl<Integer> by = zznl.m10878a(1, "gads:native_video_load_timeout", 10);
    public static final zznl<Integer> bz = zznl.m10878a(1, "gads:omid:native_webview_load_timeout", 2000);
    /* renamed from: c */
    public static final zznl<Boolean> f9704c = zznl.m10880a(0, "gads:report_dynamite_crash_in_background_thread", Boolean.valueOf(false));
    public static final zznl<Boolean> cA = zznl.m10880a(1, "gads:nonagon:banner:check_dp_size", Boolean.valueOf(false));
    public static final zznl<Boolean> cB = zznl.m10880a(1, "gads:nonagon:return_last_error_code", Boolean.valueOf(false));
    public static final zznl<Boolean> cC = zznl.m10880a(1, "gads:nonagon:open_not_loaded_interstitial", Boolean.valueOf(true));
    public static final zznl<Boolean> cD = zznl.m10880a(1, "gads:signals:doritos:v1:enabled", Boolean.valueOf(false));
    public static final zznl<Long> cE = zznl.m10879a(1, "gads:mobius_linking:sdk_side_cooldown_time_threshold:ms", 3600000);
    public static final zznl<String> cF = zznl.m10881a(0, "gads:public_beta:traffic_multiplier", "1.0");
    public static final zznl<Integer> cG = zznl.m10878a(1, "gads:adoverlay:b68684796:targeting_sdk:lower_bound", 27);
    public static final zznl<Integer> cH = zznl.m10878a(1, "gads:adoverlay:b68684796:targeting_sdk:upper_bound", 27);
    public static final zznl<Integer> cI = zznl.m10878a(1, "gads:adoverlay:b68684796:sdk_int:lower_bound", 26);
    public static final zznl<Integer> cJ = zznl.m10878a(1, "gads:adoverlay:b68684796:sdk_int:upper_bound", 27);
    public static final zznl<Boolean> cK = zznl.m10880a(1, "gads:consent:shared_preference_reading:enabled", Boolean.valueOf(true));
    public static final zznl<Boolean> cL = zznl.m10880a(1, "gads:consent:iab_consent_info:enabled", Boolean.valueOf(true));
    public static final zznl<Integer> cM = zznl.m10878a(0, "gads:dynamite_load:fail:sample_rate", 10000);
    private static final zznl<String> cN = zznl.m10876a(0, "gads:sdk_core_experiment_id");
    private static final zznl<String> cO = zznl.m10881a(0, "gads:sdk_core_js_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.js");
    private static final zznl<Boolean> cP = zznl.m10880a(0, "gads:request_builder:singleton_webview", Boolean.valueOf(false));
    private static final zznl<String> cQ = zznl.m10876a(0, "gads:request_builder:singleton_webview_experiment_id");
    private static final zznl<Boolean> cR = zznl.m10880a(0, "gads:sdk_use_dynamic_module", Boolean.valueOf(true));
    private static final zznl<String> cS = zznl.m10876a(0, "gads:sdk_use_dynamic_module_experiment_id");
    private static final zznl<String> cT = zznl.m10876a(0, "gads:block_autoclicks_experiment_id");
    private static final zznl<String> cU = zznl.m10876a(0, "gads:spam_app_context:experiment_id");
    private static final zznl<Integer> cV = zznl.m10878a(1, "gads:http_url_connection_factory:timeout_millis", 10000);
    private static final zznl<String> cW = zznl.m10876a(0, "gads:video_stream_cache:experiment_id");
    private static final zznl<Float> cX = zznl.m10877a(0, "gads:ad_id_app_context:ping_ratio", 0.0f);
    private static final zznl<String> cY = zznl.m10876a(0, "gads:ad_id_use_shared_preference:experiment_id");
    private static final zznl<Boolean> cZ = zznl.m10880a(0, "gads:ad_id_use_shared_preference:enabled", Boolean.valueOf(false));
    public static final zznl<String> ca = zznl.m10881a(1, "gads:http_assets_cache:regex", "(?i)https:\\/\\/(tpc\\.googlesyndication\\.com\\/(.*)|lh\\d+\\.googleusercontent\\.com\\/(.*))");
    public static final zznl<Integer> cb = zznl.m10878a(1, "gads:http_assets_cache:time_out", 100);
    public static final zznl<Boolean> cc = zznl.m10880a(1, "gads:chrome_custom_tabs_browser:enabled", Boolean.valueOf(false));
    public static final zznl<Boolean> cd = zznl.m10880a(1, "gads:chrome_custom_tabs:disabled", Boolean.valueOf(false));
    public static final zznl<Boolean> ce = zznl.m10880a(1, "gads:debug_hold_gesture:enabled", Boolean.valueOf(false));
    public static final zznl<Long> cf = zznl.m10879a(1, "gads:debug_hold_gesture:time_millis", 2000);
    public static final zznl<String> cg = zznl.m10881a(1, "gads:drx_debug:debug_device_linking_url", "https://www.google.com/dfp/linkDevice");
    public static final zznl<String> ch = zznl.m10881a(1, "gads:drx_debug:in_app_preview_status_url", "https://www.google.com/dfp/inAppPreview");
    public static final zznl<String> ci = zznl.m10881a(1, "gads:drx_debug:debug_signal_status_url", "https://www.google.com/dfp/debugSignals");
    public static final zznl<String> cj = zznl.m10881a(1, "gads:drx_debug:send_debug_data_url", "https://www.google.com/dfp/sendDebugData");
    public static final zznl<Integer> ck = zznl.m10878a(1, "gads:drx_debug:timeout_ms", 5000);
    public static final zznl<Integer> cl = zznl.m10878a(1, "gad:pixel_dp_comparision_multiplier", 1);
    public static final zznl<Boolean> cm = zznl.m10880a(1, "gad:interstitial_for_multi_window", Boolean.valueOf(false));
    public static final zznl<Boolean> cn = zznl.m10880a(1, "gad:interstitial_ad_stay_active_in_multi_window", Boolean.valueOf(false));
    public static final zznl<Boolean> co = zznl.m10880a(1, "gad:interstitial_multi_window_method", Boolean.valueOf(false));
    public static final zznl<Integer> cp = zznl.m10878a(1, "gad:interstitial:close_button_padding_dip", 0);
    public static final zznl<Boolean> cq = zznl.m10880a(1, "gads:clearcut_logging:enabled", Boolean.valueOf(false));
    public static final zznl<Boolean> cr = zznl.m10880a(1, "gads:clearcut_logging:write_to_file", Boolean.valueOf(false));
    public static final zznl<Boolean> cs = zznl.m10880a(0, "gad:force_local_ad_request_service:enabled", Boolean.valueOf(false));
    public static final zznl<Boolean> ct = zznl.m10880a(1, "gad:publisher_testing:force_local_request:enabled", Boolean.valueOf(false));
    public static final zznl<String> cu = zznl.m10881a(1, "gad:publisher_testing:force_local_request:enabled_list", "");
    public static final zznl<String> cv = zznl.m10881a(1, "gad:publisher_testing:force_local_request:disabled_list", "");
    public static final zznl<Boolean> cw = zznl.m10880a(0, "gad:force_dynamite_loading_enabled", Boolean.valueOf(false));
    public static final zznl<Integer> cx = zznl.m10878a(1, "gad:http_redirect_max_count:times", 8);
    public static final zznl<Boolean> cy = zznl.m10880a(1, "gads:omid:enabled", Boolean.valueOf(false));
    public static final zznl<Integer> cz = zznl.m10878a(1, "gads:omid:destroy_webview_delay", 1000);
    /* renamed from: d */
    public static final zznl<Boolean> f9705d = zznl.m10880a(0, "gads:sdk_crash_report_full_stacktrace", Boolean.valueOf(false));
    private static final zznl<String> dA = zznl.m10882b(1, "gads:auto_location_for_coarse_permission:experiment_id");
    private static final zznl<String> dB = zznl.m10882b(1, "gads:auto_location_timeout:experiment_id");
    private static final zznl<Long> dC = zznl.m10879a(1, "gads:auto_location_interval", -1);
    private static final zznl<String> dD = zznl.m10882b(1, "gads:auto_location_interval:experiment_id");
    private static final zznl<Boolean> dE = zznl.m10880a(0, "gads:auto_location_interval:without_thread", Boolean.valueOf(true));
    private static final zznl<String> dF = zznl.m10876a(1, "gads:fetch_app_settings_using_cld:enabled:experiment_id");
    private static final zznl<String> dG = zznl.m10876a(0, "gads:afs:csa:experiment_id");
    private static final zznl<String> dH = zznl.m10881a(0, "gads:safe_browsing:api_key", "AIzaSyDRKQ9d6kfsoZT2lUnZcZnBYvH69HExNPE");
    private static final zznl<Long> dI = zznl.m10879a(0, "gads:safe_browsing:safety_net:delay_ms", 2000);
    private static final zznl<Integer> dJ = zznl.m10878a(1, "gads:cache:ad_request_timeout_millis", 250);
    private static final zznl<Integer> dK = zznl.m10878a(1, "gads:cache:max_concurrent_downloads", 10);
    private static final zznl<Long> dL = zznl.m10879a(1, "gads:cache:javascript_timeout_millis", 5000);
    private static final zznl<Boolean> dM = zznl.m10880a(1, "gads:cache:connection_per_read", Boolean.valueOf(false));
    private static final zznl<Long> dN = zznl.m10879a(1, "gads:cache:connection_timeout", 5000);
    private static final zznl<Long> dO = zznl.m10879a(1, "gads:cache:read_only_connection_timeout", 5000);
    private static final zznl<String> dP = zznl.m10876a(0, "gad:dynamite_module:experiment_id");
    private static final zznl<Boolean> dQ = zznl.m10880a(0, "gads:nonagon:red_button", Boolean.valueOf(false));
    private static final zznl<Boolean> dR = zznl.m10880a(1, "gads:nonagon:banner:enabled", Boolean.valueOf(false));
    private static final zznl<String> dS = zznl.m10881a(1, "gads:nonagon:banner:ad_unit_exclusions", "(?!)");
    private static final zznl<Boolean> dT = zznl.m10880a(1, "gads:nonagon:interstitial:enabled", Boolean.valueOf(false));
    private static final zznl<String> dU = zznl.m10881a(1, "gads:nonagon:interstitial:ad_unit_exclusions", "(?!)");
    private static final zznl<Boolean> dV = zznl.m10880a(1, "gads:nonagon:rewardedvideo:enabled", Boolean.valueOf(false));
    private static final zznl<Boolean> dW = zznl.m10880a(1, "gads:nonagon:mobile_ads_setting_manager:enabled", Boolean.valueOf(false));
    private static final zznl<String> dX = zznl.m10881a(1, "gads:nonagon:rewardedvideo:ad_unit_exclusions", "(?!)");
    private static final zznl<Boolean> dY = zznl.m10880a(1, "gads:nonagon:nativead:enabled", Boolean.valueOf(false));
    private static final zznl<String> dZ = zznl.m10881a(1, "gads:nonagon:nativead:app_name", "(?!)");
    private static final zznl<Float> da = zznl.m10877a(0, "gads:ad_id_use_shared_preference:ping_ratio", 0.0f);
    private static final zznl<Boolean> db = zznl.m10880a(0, "gads:ad_id_use_persistent_service:enabled", Boolean.valueOf(false));
    private static final zznl<Boolean> dc = zznl.m10880a(0, "gads:ad_id:use_ipc:enabled", Boolean.valueOf(false));
    private static final zznl<String> dd = zznl.m10876a(0, "gads:app_index:experiment_id");
    private static final zznl<Boolean> de = zznl.m10880a(1, "gads:sai:app_measurement_enabled", Boolean.valueOf(false));
    private static final zznl<Boolean> df = zznl.m10880a(1, "gads:sai:force_through_reflection", Boolean.valueOf(true));
    private static final zznl<Integer> dg = zznl.m10878a(0, "gads:webview_cache_version", 0);
    private static final zznl<String> dh = zznl.m10882b(0, "gads:pan:experiment_id");
    private static final zznl<Boolean> di = zznl.m10880a(1, "gads:new_rewarded_ad:enabled", Boolean.valueOf(true));
    private static final zznl<Boolean> dj = zznl.m10880a(0, "gads:ad_serving:enabled", Boolean.valueOf(true));
    private static final zznl<Boolean> dk = zznl.m10880a(1, "gads:impression_optimization_enabled", Boolean.valueOf(false));
    private static final zznl<String> dl = zznl.m10881a(1, "gads:banner_ad_pool:schema", "customTargeting");
    private static final zznl<Integer> dm = zznl.m10878a(1, "gads:banner_ad_pool:max_queues", 3);
    private static final zznl<Integer> dn = zznl.m10878a(1, "gads:banner_ad_pool:max_pools", 3);
    /* renamed from: do */
    private static final zznl<Integer> f9706do = zznl.m10878a(1, "gads:heap_wastage:bytes", 0);
    private static final zznl<Boolean> dp = zznl.m10880a(0, "gads:adid_reporting:enabled", Boolean.valueOf(false));
    private static final zznl<Boolean> dq = zznl.m10880a(0, "gads:ad_settings_page_reporting:enabled", Boolean.valueOf(false));
    private static final zznl<Boolean> dr = zznl.m10880a(0, "gads:adid_info_gmscore_upgrade_reporting:enabled", Boolean.valueOf(false));
    private static final zznl<Long> ds = zznl.m10879a(1, "gads:rtb_signal_timeout_ms", 1000);
    private static final zznl<Boolean> dt = zznl.m10880a(1, "gads:rtb_cld:enabled", Boolean.valueOf(false));
    private static final zznl<Boolean> du = zznl.m10880a(0, "gads:adid_notification:first_party_check:enabled", Boolean.valueOf(true));
    private static final zznl<String> dv = zznl.m10876a(1, "gads:sdk_core_constants:experiment_id");
    private static final zznl<Boolean> dw = zznl.m10880a(1, "gads:js_flags:disable_phenotype", Boolean.valueOf(false));
    private static final zznl<String> dx = zznl.m10881a(0, "gads:native:engine_js_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/native_ads.js");
    private static final zznl<String> dy = zznl.m10881a(1, "gads:native:video_url", "//imasdk.googleapis.com/admob/sdkloader/native_video.html");
    private static final zznl<Boolean> dz = zznl.m10880a(1, "gads:auto_location_for_coarse_permission", Boolean.valueOf(false));
    /* renamed from: e */
    public static final zznl<String> f9707e = zznl.m10881a(0, "gads:sdk_crash_report_class_prefix", "com.google.");
    private static final zznl<Boolean> ea = zznl.m10880a(1, "gads:nonagon:rewarded:load_multiple_ads", Boolean.valueOf(true));
    private static final zznl<Boolean> eb = zznl.m10880a(1, "gads:nonagon:return_no_fill_error_code", Boolean.valueOf(false));
    private static final zznl<Boolean> ec = zznl.m10880a(1, "gads:nonagon:continue_on_no_fill", Boolean.valueOf(false));
    private static final zznl<Boolean> ed = zznl.m10880a(1, "gads:nonagon:separate_timeout:enabled", Boolean.valueOf(false));
    private static final zznl<Integer> ee = zznl.m10878a(1, "gads:nonagon:request_timeout:seconds", 60);
    private static final zznl<Boolean> ef = zznl.m10880a(0, "gads:nonagon:limit_ad_request_connection", Boolean.valueOf(true));
    private static final zznl<Boolean> eg = zznl.m10880a(1, "gads:nonagon:javascript_ad_request:enabled", Boolean.valueOf(false));
    private static final zznl<Boolean> eh = zznl.m10880a(1, "gads:nonagon:service:enabled", Boolean.valueOf(false));
    private static final zznl<Boolean> ei = zznl.m10880a(1, "gads:signals:ad_id_info:enabled", Boolean.valueOf(false));
    private static final zznl<Boolean> ej = zznl.m10880a(1, "gads:signals:app_index:enabled", Boolean.valueOf(false));
    private static final zznl<Boolean> ek = zznl.m10880a(1, "gads:signals:cache:enabled", Boolean.valueOf(false));
    private static final zznl<Boolean> el = zznl.m10880a(1, "gads:signals:doritos:enabled", Boolean.valueOf(false));
    private static final zznl<Boolean> em = zznl.m10880a(1, "gads:signals:location:enabled", Boolean.valueOf(false));
    private static final zznl<Boolean> en = zznl.m10880a(1, "gads:signals:network_prediction:enabled", Boolean.valueOf(false));
    private static final zznl<Boolean> eo = zznl.m10880a(1, "gads:signals:parental_control:enabled", Boolean.valueOf(false));
    private static final zznl<Boolean> ep = zznl.m10880a(1, "gads:signals:video_decoder:enabled", Boolean.valueOf(false));
    private static final zznl<Boolean> eq = zznl.m10880a(0, "gads:rewarded_sku:enabled", Boolean.valueOf(true));
    private static final zznl<Boolean> er = zznl.m10880a(0, "gads:rewarded_sku:override_test:enabled", Boolean.valueOf(false));
    private static final zznl<Boolean> es = zznl.m10880a(1, "gads:nativeads:image:sample:enabled", Boolean.valueOf(true));
    private static final zznl<Integer> et = zznl.m10878a(1, "gads:nativeads:image:sample:pixels", 1048576);
    private static final zznl<Boolean> eu = zznl.m10880a(0, "gads:service:webview:enable_directory_suffix", Boolean.valueOf(true));
    private static byte[] ev;
    /* renamed from: f */
    public static final zznl<Float> f9708f = zznl.m10877a(1, "gads:trapped_exception_sample_rate", 0.01f);
    /* renamed from: g */
    public static final zznl<String> f9709g = zznl.m10881a(1, "gads:video_exo_player:version", "1");
    /* renamed from: h */
    public static final zznl<Integer> f9710h = zznl.m10878a(1, "gads:video_exo_player:connect_timeout", 8000);
    /* renamed from: i */
    public static final zznl<Integer> f9711i = zznl.m10878a(1, "gads:video_exo_player:read_timeout", 8000);
    /* renamed from: j */
    public static final zznl<Integer> f9712j = zznl.m10878a(1, "gads:video_exo_player:loading_check_interval", 1048576);
    /* renamed from: k */
    public static final zznl<Integer> f9713k = zznl.m10878a(1, "gads:video_exo_player:exo_player_precache_limit", (int) BaseClientBuilder.API_PRIORITY_OTHER);
    /* renamed from: l */
    public static final zznl<Integer> f9714l = zznl.m10878a(1, "gads:video_exo_player:byte_buffer_precache_limit", (int) BaseClientBuilder.API_PRIORITY_OTHER);
    /* renamed from: m */
    public static final zznl<Integer> f9715m = zznl.m10878a(1, "gads:video_stream_cache:limit_count", 5);
    /* renamed from: n */
    public static final zznl<Integer> f9716n = zznl.m10878a(1, "gads:video_stream_cache:limit_space", 8388608);
    /* renamed from: o */
    public static final zznl<Integer> f9717o = zznl.m10878a(1, "gads:video_stream_exo_cache:buffer_size", 8388608);
    /* renamed from: p */
    public static final zznl<Long> f9718p = zznl.m10879a(1, "gads:video_stream_cache:limit_time_sec", 300);
    /* renamed from: q */
    public static final zznl<Long> f9719q = zznl.m10879a(1, "gads:video_stream_cache:notify_interval_millis", 125);
    /* renamed from: r */
    public static final zznl<Integer> f9720r = zznl.m10878a(1, "gads:video_stream_cache:connect_timeout_millis", 10000);
    /* renamed from: s */
    public static final zznl<Boolean> f9721s = zznl.m10880a(0, "gads:video:metric_reporting_enabled", Boolean.valueOf(false));
    /* renamed from: t */
    public static final zznl<String> f9722t = zznl.m10881a(1, "gads:video:metric_frame_hash_times", "");
    /* renamed from: u */
    public static final zznl<Long> f9723u = zznl.m10879a(1, "gads:video:metric_frame_hash_time_leniency", 500);
    /* renamed from: v */
    public static final zznl<Boolean> f9724v = zznl.m10880a(1, "gads:video:force_watermark", Boolean.valueOf(false));
    /* renamed from: w */
    public static final zznl<Long> f9725w = zznl.m10879a(1, "gads:video:surface_update_min_spacing_ms", 1000);
    /* renamed from: x */
    public static final zznl<Boolean> f9726x = zznl.m10880a(1, "gads:video:spinner:enabled", Boolean.valueOf(false));
    /* renamed from: y */
    public static final zznl<Integer> f9727y = zznl.m10878a(1, "gads:video:spinner:scale", 4);
    /* renamed from: z */
    public static final zznl<Long> f9728z = zznl.m10879a(1, "gads:video:spinner:jank_threshold_ms", 50);

    /* renamed from: a */
    public static void m10901a(Context context) {
        zzanr.m9933a(context, new sm(context));
        context = ((Integer) zzkd.m10713e().m10897a(f9706do)).intValue();
        if (context > null && ev == null) {
            ev = new byte[context];
        }
    }

    /* renamed from: a */
    public static void m10902a(Context context, int i, JSONObject jSONObject) {
        zzkd.m10711c();
        context = context.getSharedPreferences("google_ads_flags", 0).edit();
        zzkd.m10712d().m10890a(context, 1, jSONObject);
        zzkd.m10711c();
        context.commit();
    }

    /* renamed from: a */
    public static List<String> m10900a() {
        return zzkd.m10712d().m10889a();
    }

    /* renamed from: b */
    public static List<String> m10903b() {
        return zzkd.m10712d().m10892b();
    }
}
