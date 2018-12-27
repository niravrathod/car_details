package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.zzc;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@zzaer
@Class(creator = "AdSizeParcelCreator")
@Reserved({1})
public class zzjo extends AbstractSafeParcelable {
    public static final Creator<zzjo> CREATOR = new zzjp();
    @Field(id = 2)
    /* renamed from: a */
    public final String f20227a;
    @Field(id = 3)
    /* renamed from: b */
    public final int f20228b;
    @Field(id = 4)
    /* renamed from: c */
    public final int f20229c;
    @Field(id = 5)
    /* renamed from: d */
    public final boolean f20230d;
    @Field(id = 6)
    /* renamed from: e */
    public final int f20231e;
    @Field(id = 7)
    /* renamed from: f */
    public final int f20232f;
    @Field(id = 8)
    /* renamed from: g */
    public final zzjo[] f20233g;
    @Field(id = 9)
    /* renamed from: h */
    public final boolean f20234h;
    @Field(id = 10)
    /* renamed from: i */
    public final boolean f20235i;
    @Field(id = 11)
    /* renamed from: j */
    public boolean f20236j;

    /* renamed from: a */
    public static int m26614a(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    /* renamed from: b */
    public static int m26617b(DisplayMetrics displayMetrics) {
        return (int) (((float) m26618c(displayMetrics)) * displayMetrics.density);
    }

    /* renamed from: c */
    private static int m26618c(DisplayMetrics displayMetrics) {
        displayMetrics = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        if (displayMetrics <= 400) {
            return 32;
        }
        return displayMetrics <= 720 ? 50 : 90;
    }

    /* renamed from: a */
    public static zzjo m26616a(Context context) {
        return new zzjo("320x50_mb", 0, 0, false, 0, 0, null, true, false, false);
    }

    /* renamed from: a */
    public static zzjo m26615a() {
        return new zzjo("reward_mb", 0, 0, true, 0, 0, null, false, false, false);
    }

    public zzjo() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false);
    }

    public zzjo(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    public zzjo(Context context, AdSize[] adSizeArr) {
        int i;
        int i2;
        int i3;
        AdSize adSize = adSizeArr[0];
        this.f20230d = false;
        this.f20235i = adSize.isFluid();
        if (this.f20235i) {
            this.f20231e = AdSize.BANNER.getWidth();
            this.f20228b = AdSize.BANNER.getHeight();
        } else {
            this.f20231e = adSize.getWidth();
            this.f20228b = adSize.getHeight();
        }
        Object obj = this.f20231e == -1 ? 1 : null;
        Object obj2 = this.f20228b == -2 ? 1 : null;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (obj != null) {
            double d;
            double d2;
            zzkd.m10709a();
            if (zzaoa.m9970d(context)) {
                zzkd.m10709a();
                if (zzaoa.m9971e(context)) {
                    i = displayMetrics.widthPixels;
                    zzkd.m10709a();
                    this.f20232f = i - zzaoa.m9972f(context);
                    d = (double) (((float) this.f20232f) / displayMetrics.density);
                    i2 = (int) d;
                    d2 = (double) i2;
                    Double.isNaN(d);
                    Double.isNaN(d2);
                    if (d - d2 >= 0.01d) {
                        i2++;
                    }
                }
            }
            this.f20232f = displayMetrics.widthPixels;
            d = (double) (((float) this.f20232f) / displayMetrics.density);
            i2 = (int) d;
            d2 = (double) i2;
            Double.isNaN(d);
            Double.isNaN(d2);
            if (d - d2 >= 0.01d) {
                i2++;
            }
        } else {
            i2 = this.f20231e;
            zzkd.m10709a();
            this.f20232f = zzaoa.m9953a(displayMetrics, this.f20231e);
        }
        if (obj2 != null) {
            i = m26618c(displayMetrics);
        } else {
            i = this.f20228b;
        }
        zzkd.m10709a();
        this.f20229c = zzaoa.m9953a(displayMetrics, i);
        if (obj == null) {
            if (obj2 == null) {
                if (this.f20235i) {
                    this.f20227a = "320x50_mb";
                } else {
                    this.f20227a = adSize.toString();
                }
                if (adSizeArr.length <= 1) {
                    this.f20233g = new zzjo[adSizeArr.length];
                    for (i3 = 0; i3 < adSizeArr.length; i3++) {
                        this.f20233g[i3] = new zzjo(context, adSizeArr[i3]);
                    }
                } else {
                    this.f20233g = null;
                }
                this.f20234h = false;
                this.f20236j = false;
            }
        }
        StringBuilder stringBuilder = new StringBuilder(26);
        stringBuilder.append(i2);
        stringBuilder.append("x");
        stringBuilder.append(i);
        stringBuilder.append("_as");
        this.f20227a = stringBuilder.toString();
        if (adSizeArr.length <= 1) {
            this.f20233g = null;
        } else {
            this.f20233g = new zzjo[adSizeArr.length];
            for (i3 = 0; i3 < adSizeArr.length; i3++) {
                this.f20233g[i3] = new zzjo(context, adSizeArr[i3]);
            }
        }
        this.f20234h = false;
        this.f20236j = false;
    }

    public zzjo(zzjo zzjo, zzjo[] zzjoArr) {
        this(zzjo.f20227a, zzjo.f20228b, zzjo.f20229c, zzjo.f20230d, zzjo.f20231e, zzjo.f20232f, zzjoArr, zzjo.f20234h, zzjo.f20235i, zzjo.f20236j);
    }

    @Constructor
    zzjo(@Param(id = 2) String str, @Param(id = 3) int i, @Param(id = 4) int i2, @Param(id = 5) boolean z, @Param(id = 6) int i3, @Param(id = 7) int i4, @Param(id = 8) zzjo[] zzjoArr, @Param(id = 9) boolean z2, @Param(id = 10) boolean z3, @Param(id = 11) boolean z4) {
        this.f20227a = str;
        this.f20228b = i;
        this.f20229c = i2;
        this.f20230d = z;
        this.f20231e = i3;
        this.f20232f = i4;
        this.f20233g = zzjoArr;
        this.f20234h = z2;
        this.f20235i = z3;
        this.f20236j = z4;
    }

    /* renamed from: b */
    public final AdSize m26619b() {
        return zzc.zza(this.f20231e, this.f20228b, this.f20227a);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f20227a, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f20228b);
        SafeParcelWriter.writeInt(parcel, 4, this.f20229c);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f20230d);
        SafeParcelWriter.writeInt(parcel, 6, this.f20231e);
        SafeParcelWriter.writeInt(parcel, 7, this.f20232f);
        SafeParcelWriter.writeTypedArray(parcel, 8, this.f20233g, i, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.f20234h);
        SafeParcelWriter.writeBoolean(parcel, 10, this.f20235i);
        SafeParcelWriter.writeBoolean(parcel, 11, this.f20236j);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
