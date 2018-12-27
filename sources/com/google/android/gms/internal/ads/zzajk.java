package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import org.json.JSONArray;

@zzaer
@Class(creator = "RewardItemParcelCreator")
@Reserved({1})
public final class zzajk extends AbstractSafeParcelable {
    public static final Creator<zzajk> CREATOR = new zzajl();
    @Field(id = 2)
    /* renamed from: a */
    public final String f19880a;
    @Field(id = 3)
    /* renamed from: b */
    public final int f19881b;

    public zzajk(RewardItem rewardItem) {
        this(rewardItem.getType(), rewardItem.getAmount());
    }

    @Constructor
    public zzajk(@Param(id = 2) String str, @Param(id = 3) int i) {
        this.f19880a = str;
        this.f19881b = i;
    }

    /* renamed from: a */
    public static zzajk m26268a(JSONArray jSONArray) {
        if (jSONArray != null) {
            if (jSONArray.length() != 0) {
                return new zzajk(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
            }
        }
        return null;
    }

    /* renamed from: a */
    public static com.google.android.gms.internal.ads.zzajk m26267a(java.lang.String r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
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
        r0 = android.text.TextUtils.isEmpty(r2);
        r1 = 0;
        if (r0 == 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r0 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x0012 }
        r0.<init>(r2);	 Catch:{ JSONException -> 0x0012 }
        r2 = m26268a(r0);	 Catch:{ JSONException -> 0x0012 }
        return r2;
    L_0x0012:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajk.a(java.lang.String):com.google.android.gms.internal.ads.zzajk");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f19880a, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f19881b);
        SafeParcelWriter.finishObjectHeader(parcel, i);
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof zzajk) {
                zzajk zzajk = (zzajk) obj;
                if (!Objects.equal(this.f19880a, zzajk.f19880a) || Objects.equal(Integer.valueOf(this.f19881b), Integer.valueOf(zzajk.f19881b)) == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f19880a, Integer.valueOf(this.f19881b));
    }
}
