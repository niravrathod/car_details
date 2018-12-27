package com.google.android.gms.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzmg;
import com.google.android.gms.internal.ads.zzmh;
import java.util.Date;
import java.util.Set;

@VisibleForTesting
public final class AdRequest {
    public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int GENDER_FEMALE = 2;
    public static final int GENDER_MALE = 1;
    public static final int GENDER_UNKNOWN = 0;
    public static final int MAX_CONTENT_URL_LENGTH = 512;
    /* renamed from: a */
    private final zzmg f7596a;

    @VisibleForTesting
    public static final class Builder {
        /* renamed from: a */
        private final zzmh f7595a = new zzmh();

        public Builder() {
            this.f7595a.m10798b("B3EEABB8EE11C2BE770B684D95219ECB");
        }

        public final Builder addKeyword(String str) {
            this.f7595a.m10793a(str);
            return this;
        }

        public final Builder addNetworkExtras(NetworkExtras networkExtras) {
            this.f7595a.m10791a(networkExtras);
            return this;
        }

        public final Builder addNetworkExtrasBundle(Class<? extends MediationAdapter> cls, Bundle bundle) {
            this.f7595a.m10792a((Class) cls, bundle);
            if (!(cls.equals(AdMobAdapter.class) == null || bundle.getBoolean("_emulatorLiveAds") == null)) {
                this.f7595a.m10800c("B3EEABB8EE11C2BE770B684D95219ECB");
            }
            return this;
        }

        public final Builder addCustomEventExtrasBundle(Class<? extends CustomEvent> cls, Bundle bundle) {
            this.f7595a.m10797b(cls, bundle);
            return this;
        }

        public final Builder addTestDevice(String str) {
            this.f7595a.m10798b(str);
            return this;
        }

        public final AdRequest build() {
            return new AdRequest();
        }

        @Deprecated
        public final Builder setBirthday(Date date) {
            this.f7595a.m10795a(date);
            return this;
        }

        public final Builder setContentUrl(String str) {
            Preconditions.checkNotNull(str, "Content URL must be non-null.");
            Preconditions.checkNotEmpty(str, "Content URL must be non-empty.");
            Preconditions.checkArgument(str.length() <= AdRequest.MAX_CONTENT_URL_LENGTH, "Content URL must not exceed %d in length.  Provided length was %d.", Integer.valueOf(AdRequest.MAX_CONTENT_URL_LENGTH), Integer.valueOf(str.length()));
            this.f7595a.m10802d(str);
            return this;
        }

        @Deprecated
        public final Builder setGender(int i) {
            this.f7595a.m10789a(i);
            return this;
        }

        public final Builder setLocation(Location location) {
            this.f7595a.m10790a(location);
            return this;
        }

        public final Builder setRequestAgent(String str) {
            this.f7595a.m10804f(str);
            return this;
        }

        public final Builder tagForChildDirectedTreatment(boolean z) {
            this.f7595a.m10799b(z);
            return this;
        }

        @Deprecated
        public final Builder setIsDesignedForFamilies(boolean z) {
            this.f7595a.m10801c(z);
            return this;
        }
    }

    private AdRequest(Builder builder) {
        this.f7596a = new zzmg(builder.f7595a);
    }

    @Deprecated
    public final Date getBirthday() {
        return this.f7596a.m10754a();
    }

    public final String getContentUrl() {
        return this.f7596a.m10757b();
    }

    @Deprecated
    public final int getGender() {
        return this.f7596a.m10758c();
    }

    public final Set<String> getKeywords() {
        return this.f7596a.m10760d();
    }

    public final Location getLocation() {
        return this.f7596a.m10761e();
    }

    @Deprecated
    public final <T extends NetworkExtras> T getNetworkExtras(Class<T> cls) {
        return this.f7596a.m10753a((Class) cls);
    }

    public final <T extends MediationAdapter> Bundle getNetworkExtrasBundle(Class<T> cls) {
        return this.f7596a.m10756b(cls);
    }

    public final <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> cls) {
        return this.f7596a.m10759c(cls);
    }

    public final boolean isTestDevice(Context context) {
        return this.f7596a.m10755a(context);
    }

    public final zzmg zzay() {
        return this.f7596a;
    }
}
