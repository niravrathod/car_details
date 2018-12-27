package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import java.util.List;

@zzaer
@Class(creator = "CacheOfferingCreator")
@Reserved({1})
public final class zzho extends AbstractSafeParcelable {
    public static final Creator<zzho> CREATOR = new zzhp();
    @Field(id = 2)
    /* renamed from: a */
    public final String f20131a;
    @Field(id = 3)
    /* renamed from: b */
    private final long f20132b;
    @Field(id = 4)
    /* renamed from: c */
    private final String f20133c;
    @Field(id = 5)
    /* renamed from: d */
    private final String f20134d;
    @Field(id = 6)
    /* renamed from: e */
    private final String f20135e;
    @Field(id = 7)
    /* renamed from: f */
    private final Bundle f20136f;
    @Field(id = 8)
    /* renamed from: g */
    private final boolean f20137g;
    @Field(id = 9)
    /* renamed from: h */
    private long f20138h;

    /* renamed from: a */
    public static zzho m26576a(String str) {
        return m26575a(Uri.parse(str));
    }

    /* renamed from: a */
    public static zzho m26575a(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                uri = pathSegments.size();
                StringBuilder stringBuilder = new StringBuilder(62);
                stringBuilder.append("Expected 2 path parts for namespace and id, found :");
                stringBuilder.append(uri);
                zzaok.m10007e(stringBuilder.toString());
                return null;
            }
            long j;
            String str = (String) pathSegments.get(0);
            String str2 = (String) pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter(ImagesContract.URL);
            boolean equals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            if (queryParameter2 == null) {
                j = 0;
            } else {
                j = Long.parseLong(queryParameter2);
            }
            long j2 = j;
            Bundle bundle = new Bundle();
            for (String str3 : zzbv.zzem().mo4177a(uri)) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new zzho(queryParameter, j2, host, str, str2, bundle, equals, 0);
        } catch (Uri uri2) {
            zzaok.m10004c("Unable to parse Uri into cache offering.", uri2);
            return null;
        }
    }

    @Constructor
    zzho(@Param(id = 2) String str, @Param(id = 3) long j, @Param(id = 4) String str2, @Param(id = 5) String str3, @Param(id = 6) String str4, @Param(id = 7) Bundle bundle, @Param(id = 8) boolean z, @Param(id = 9) long j2) {
        this.f20131a = str;
        this.f20132b = j;
        if (str2 == null) {
            str2 = "";
        }
        this.f20133c = str2;
        if (str3 == null) {
            str3 = "";
        }
        this.f20134d = str3;
        if (str4 == null) {
            str4 = "";
        }
        this.f20135e = str4;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f20136f = bundle;
        this.f20137g = z;
        this.f20138h = j2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f20131a, false);
        SafeParcelWriter.writeLong(parcel, 3, this.f20132b);
        SafeParcelWriter.writeString(parcel, 4, this.f20133c, false);
        SafeParcelWriter.writeString(parcel, 5, this.f20134d, false);
        SafeParcelWriter.writeString(parcel, 6, this.f20135e, false);
        SafeParcelWriter.writeBundle(parcel, 7, this.f20136f, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.f20137g);
        SafeParcelWriter.writeLong(parcel, 9, this.f20138h);
        SafeParcelWriter.finishObjectHeader(parcel, i);
    }
}
