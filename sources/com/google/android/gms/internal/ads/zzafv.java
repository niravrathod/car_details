package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONObject;

@zzaer
@Class(creator = "AutoClickProtectionConfigurationParcelCreator")
@Reserved({1})
@ParametersAreNonnullByDefault
public final class zzafv extends AbstractSafeParcelable {
    public static final Creator<zzafv> CREATOR = new zzafw();
    @Field(id = 2)
    /* renamed from: a */
    public final boolean f19812a;
    @Field(id = 3)
    /* renamed from: b */
    public final List<String> f19813b;

    public zzafv() {
        this(false, Collections.emptyList());
    }

    @Constructor
    public zzafv(@Param(id = 2) boolean z, @Param(id = 3) List<String> list) {
        this.f19812a = z;
        this.f19813b = list;
    }

    /* renamed from: a */
    public static zzafv m26177a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new zzafv();
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("reporting_urls");
        List arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    arrayList.add(optJSONArray.getString(i));
                } catch (Throwable e) {
                    zzaok.m10004c("Error grabbing url from json.", e);
                }
            }
        }
        return new zzafv(jSONObject.optBoolean("enable_protection"), arrayList);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f19812a);
        SafeParcelWriter.writeStringList(parcel, 3, this.f19813b, false);
        SafeParcelWriter.finishObjectHeader(parcel, i);
    }
}
