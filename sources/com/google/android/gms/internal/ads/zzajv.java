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
import java.util.List;
import org.json.JSONObject;

@zzaer
@Class(creator = "SafeBrowsingConfigParcelCreator")
@Reserved({1})
public final class zzajv extends AbstractSafeParcelable {
    public static final Creator<zzajv> CREATOR = new zzajw();
    @Field(id = 2)
    /* renamed from: a */
    public final String f19882a;
    @Field(id = 3)
    /* renamed from: b */
    public final String f19883b;
    @Field(id = 4)
    /* renamed from: c */
    public final boolean f19884c;
    @Field(id = 5)
    /* renamed from: d */
    public final boolean f19885d;
    @Field(id = 6)
    /* renamed from: e */
    public final List<String> f19886e;
    @Field(id = 7)
    /* renamed from: f */
    public final boolean f19887f;
    @Field(id = 8)
    /* renamed from: g */
    public final boolean f19888g;
    @Field(id = 9)
    /* renamed from: h */
    public final List<String> f19889h;

    @Constructor
    public zzajv(@Param(id = 2) String str, @Param(id = 3) String str2, @Param(id = 4) boolean z, @Param(id = 5) boolean z2, @Param(id = 6) List<String> list, @Param(id = 7) boolean z3, @Param(id = 8) boolean z4, @Param(id = 9) List<String> list2) {
        this.f19882a = str;
        this.f19883b = str2;
        this.f19884c = z;
        this.f19885d = z2;
        this.f19886e = list;
        this.f19887f = z3;
        this.f19888g = z4;
        if (list2 == null) {
            list2 = new ArrayList();
        }
        this.f19889h = list2;
    }

    /* renamed from: a */
    public static zzajv m26269a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new zzajv(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), zzanj.m9923a(jSONObject.optJSONArray("allowed_headers"), null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), zzanj.m9923a(jSONObject.optJSONArray("webview_permissions"), null));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f19882a, false);
        SafeParcelWriter.writeString(parcel, 3, this.f19883b, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f19884c);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f19885d);
        SafeParcelWriter.writeStringList(parcel, 6, this.f19886e, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.f19887f);
        SafeParcelWriter.writeBoolean(parcel, 8, this.f19888g);
        SafeParcelWriter.writeStringList(parcel, 9, this.f19889h, false);
        SafeParcelWriter.finishObjectHeader(parcel, i);
    }
}
