package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.internal.zzbt;
import com.google.android.gms.measurement.internal.zzfk;
import com.j256.ormlite.field.FieldType;
import java.util.List;
import java.util.Map;

@Deprecated
public class AppMeasurement {
    /* renamed from: a */
    private final zzbt f10401a;

    @KeepForSdk
    public static class ConditionalUserProperty {
        @Keep
        @KeepForSdk
        public boolean mActive;
        @Keep
        @KeepForSdk
        public String mAppId;
        @Keep
        @KeepForSdk
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        @KeepForSdk
        public String mName;
        @Keep
        @KeepForSdk
        public String mOrigin;
        @Keep
        @KeepForSdk
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        @KeepForSdk
        public String mTriggerEventName;
        @Keep
        @KeepForSdk
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        @KeepForSdk
        public long mTriggeredTimestamp;
        @Keep
        @KeepForSdk
        public Object mValue;

        public ConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
            Preconditions.checkNotNull(conditionalUserProperty);
            this.mAppId = conditionalUserProperty.mAppId;
            this.mOrigin = conditionalUserProperty.mOrigin;
            this.mCreationTimestamp = conditionalUserProperty.mCreationTimestamp;
            this.mName = conditionalUserProperty.mName;
            if (conditionalUserProperty.mValue != null) {
                this.mValue = zzfk.m28601b(conditionalUserProperty.mValue);
                if (this.mValue == null) {
                    this.mValue = conditionalUserProperty.mValue;
                }
            }
            this.mActive = conditionalUserProperty.mActive;
            this.mTriggerEventName = conditionalUserProperty.mTriggerEventName;
            this.mTriggerTimeout = conditionalUserProperty.mTriggerTimeout;
            this.mTimedOutEventName = conditionalUserProperty.mTimedOutEventName;
            if (conditionalUserProperty.mTimedOutEventParams != null) {
                this.mTimedOutEventParams = new Bundle(conditionalUserProperty.mTimedOutEventParams);
            }
            this.mTriggeredEventName = conditionalUserProperty.mTriggeredEventName;
            if (conditionalUserProperty.mTriggeredEventParams != null) {
                this.mTriggeredEventParams = new Bundle(conditionalUserProperty.mTriggeredEventParams);
            }
            this.mTriggeredTimestamp = conditionalUserProperty.mTriggeredTimestamp;
            this.mTimeToLive = conditionalUserProperty.mTimeToLive;
            this.mExpiredEventName = conditionalUserProperty.mExpiredEventName;
            if (conditionalUserProperty.mExpiredEventParams != null) {
                this.mExpiredEventParams = new Bundle(conditionalUserProperty.mExpiredEventParams);
            }
        }
    }

    @KeepForSdk
    public static final class Event {
        /* renamed from: a */
        public static final String[] f10395a = new String[]{"app_clear_data", "app_exception", "app_remove", "app_upgrade", "app_install", "app_update", "firebase_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "user_engagement", "ad_exposure", "adunit_exposure", "ad_query", "ad_activeview", "ad_impression", "ad_click", "ad_reward", "screen_view", "ga_extra_parameter"};
        /* renamed from: b */
        public static final String[] f10396b = new String[]{"_cd", "_ae", "_ui", "_ug", "_in", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_e", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "_ar", "_vs", "_ep"};

        private Event() {
        }

        /* renamed from: a */
        public static String m12208a(String str) {
            return zzfk.m28590a(str, f10395a, f10396b);
        }
    }

    @KeepForSdk
    public interface EventInterceptor {
        @KeepForSdk
        /* renamed from: a */
        void m12209a(String str, String str2, Bundle bundle, long j);
    }

    @KeepForSdk
    public interface OnEventListener {
        @KeepForSdk
        /* renamed from: a */
        void m12210a(String str, String str2, Bundle bundle, long j);
    }

    @KeepForSdk
    public static final class Param {
        /* renamed from: a */
        public static final String[] f10397a = new String[]{"firebase_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "message_device_time", "message_id", "message_name", "message_time", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "deferred_analytics_collection", "session_number", "session_id"};
        /* renamed from: b */
        public static final String[] f10398b = new String[]{"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_ndt", "_nmid", "_nmn", "_nmt", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_dac", "_sno", "_sid"};

        private Param() {
        }

        /* renamed from: a */
        public static String m12211a(String str) {
            return zzfk.m28590a(str, f10397a, f10398b);
        }
    }

    @KeepForSdk
    public static final class UserProperty {
        /* renamed from: a */
        public static final String[] f10399a = new String[]{"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "first_open_after_install", "lifetime_user_engagement", "google_allow_ad_personalization_signals", "session_number", "session_id"};
        /* renamed from: b */
        public static final String[] f10400b = new String[]{"_ln", "_fot", "_fvt", "_ldl", FieldType.FOREIGN_ID_FIELD_SUFFIX, "_fi", "_lte", "_ap", "_sno", "_sid"};

        private UserProperty() {
        }

        /* renamed from: a */
        public static String m12212a(String str) {
            return zzfk.m28590a(str, f10399a, f10400b);
        }
    }

    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        return zzbt.m22702a(context, null).m22728i();
    }

    /* renamed from: a */
    public final void m12213a(String str, Bundle bundle) {
        this.f10401a.m22727h().m29584a("app", str, bundle, true);
    }

    /* renamed from: a */
    public final void m12214a(String str, String str2) {
        this.f10401a.m22727h().m29587a("app", str, (Object) str2, false);
    }

    /* renamed from: a */
    public final void m12216a(boolean z) {
        this.f10401a.m22727h().m29590a(z);
    }

    public AppMeasurement(zzbt zzbt) {
        Preconditions.checkNotNull(zzbt);
        this.f10401a = zzbt;
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f10401a.m22727h().m29583a(str, str2, bundle);
    }

    @KeepForSdk
    /* renamed from: a */
    public void m12215a(String str, String str2, Object obj) {
        Preconditions.checkNotEmpty(str);
        this.f10401a.m22727h().m29587a(str, str2, obj, true);
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    /* renamed from: b */
    public java.util.Map<java.lang.String, java.lang.Object> m12217b(boolean r4) {
        /* JADX: method processing error */
/*
Error: java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:410)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.fixIterableType(LoopRegionVisitor.java:308)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkIterableForEach(LoopRegionVisitor.java:249)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.processLoopRegion(LoopRegionVisitor.java:68)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.enterRegion(LoopRegionVisitor.java:52)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:56)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:18)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:46)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r3 = this;
        r0 = r3.f10401a;
        r0 = r0.m22727h();
        r4 = r0.m29591b(r4);
        r0 = new android.support.v4.f.a;
        r1 = r4.size();
        r0.<init>(r1);
        r4 = r4.iterator();
    L_0x0017:
        r1 = r4.hasNext();
        if (r1 == 0) goto L_0x002d;
    L_0x001d:
        r1 = r4.next();
        r1 = (com.google.android.gms.measurement.internal.zzfh) r1;
        r2 = r1.f20681a;
        r1 = r1.m27328a();
        r0.put(r2, r1);
        goto L_0x0017;
    L_0x002d:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.b(boolean):java.util.Map<java.lang.String, java.lang.Object>");
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f10401a.m22727h().m29618z();
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f10401a.m22727h().m29573A();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f10401a.m22727h().m29616x();
    }

    @Keep
    public String getGmpAppId() {
        return this.f10401a.m22727h().m29574B();
    }

    @Keep
    public long generateEventId() {
        return this.f10401a.m22729j().m28635g();
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f10401a.m22708A().m28475a(str, this.f10401a.mo3169m().elapsedRealtime());
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f10401a.m22708A().m28477b(str, this.f10401a.mo3169m().elapsedRealtime());
    }

    @Keep
    @KeepForSdk
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        this.f10401a.m22727h().m29580a(conditionalUserProperty);
    }

    @Keep
    @VisibleForTesting
    protected void setConditionalUserPropertyAs(ConditionalUserProperty conditionalUserProperty) {
        this.f10401a.m22727h().m29593b(conditionalUserProperty);
    }

    @Keep
    @KeepForSdk
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f10401a.m22727h().m29596c(str, str2, bundle);
    }

    @Keep
    @VisibleForTesting
    protected void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) {
        this.f10401a.m22727h().m29589a(str, str2, str3, bundle);
    }

    @Keep
    @VisibleForTesting
    protected Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.f10401a.m22727h().m29578a(str, str2, z);
    }

    @Keep
    @VisibleForTesting
    protected Map<String, Object> getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        return this.f10401a.m22727h().m29577a(str, str2, str3, z);
    }

    @Keep
    @KeepForSdk
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        return this.f10401a.m22727h().m29575a(str, str2);
    }

    @Keep
    @VisibleForTesting
    protected List<ConditionalUserProperty> getConditionalUserPropertiesAs(String str, String str2, String str3) {
        return this.f10401a.m22727h().m29576a(str, str2, str3);
    }

    @Keep
    @KeepForSdk
    public int getMaxUserProperties(String str) {
        this.f10401a.m22727h();
        Preconditions.checkNotEmpty(str);
        return 25;
    }
}
