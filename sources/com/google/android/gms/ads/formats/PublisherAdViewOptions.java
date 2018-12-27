package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzjq;
import com.google.android.gms.internal.ads.zzlc;
import com.google.android.gms.internal.ads.zzld;

@zzaer
@Class(creator = "PublisherAdViewOptionsCreator")
public final class PublisherAdViewOptions extends AbstractSafeParcelable {
    public static final Creator<PublisherAdViewOptions> CREATOR = new zzc();
    @Field(getter = "getManualImpressionsEnabled", id = 1)
    /* renamed from: a */
    private final boolean f19497a;
    @Field(getter = "getAppEventListenerBinder", id = 2, type = "android.os.IBinder")
    /* renamed from: b */
    private final zzlc f19498b;
    /* renamed from: c */
    private AppEventListener f19499c;

    public static final class Builder {
        /* renamed from: a */
        private boolean f7634a = false;
        /* renamed from: b */
        private AppEventListener f7635b;

        public final Builder setManualImpressionsEnabled(boolean z) {
            this.f7634a = z;
            return this;
        }

        public final Builder setAppEventListener(AppEventListener appEventListener) {
            this.f7635b = appEventListener;
            return this;
        }

        public final PublisherAdViewOptions build() {
            return new PublisherAdViewOptions();
        }
    }

    private PublisherAdViewOptions(Builder builder) {
        this.f19497a = builder.f7634a;
        this.f19499c = builder.f7635b;
        this.f19498b = this.f19499c != null ? new zzjq(this.f19499c) : null;
    }

    @Constructor
    PublisherAdViewOptions(@Param(id = 1) boolean z, @Param(id = 2) IBinder iBinder) {
        this.f19497a = z;
        this.f19498b = iBinder != null ? zzld.m21757a(iBinder) : false;
    }

    public final AppEventListener getAppEventListener() {
        return this.f19499c;
    }

    public final boolean getManualImpressionsEnabled() {
        return this.f19497a;
    }

    public final zzlc zzbg() {
        return this.f19498b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, getManualImpressionsEnabled());
        SafeParcelWriter.writeIBinder(parcel, 2, this.f19498b == null ? null : this.f19498b.asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, i);
    }
}
