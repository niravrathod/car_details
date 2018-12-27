package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.gmsg.zzb;
import com.google.android.gms.ads.internal.gmsg.zzd;
import com.google.android.gms.ads.internal.zzaq;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzaop;
import com.google.android.gms.internal.ads.zzasg;
import com.google.android.gms.internal.ads.zzjc;

@zzaer
@Class(creator = "AdOverlayInfoCreator")
@Reserved({1})
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<AdOverlayInfoParcel> CREATOR = new zzm();
    @Field(id = 11)
    public final int orientation;
    @Field(id = 13)
    public final String url;
    @Field(id = 14)
    public final zzaop zzadg;
    @Field(id = 2)
    public final zzc zzcbw;
    @Field(getter = "getAdClickListenerAsBinder", id = 3, type = "android.os.IBinder")
    public final zzjc zzcbx;
    @Field(getter = "getAdOverlayListenerAsBinder", id = 4, type = "android.os.IBinder")
    public final zzn zzcby;
    @Field(getter = "getAdWebViewAsBinder", id = 5, type = "android.os.IBinder")
    public final zzasg zzcbz;
    @Field(getter = "getAppEventGmsgListenerAsBinder", id = 6, type = "android.os.IBinder")
    public final zzd zzcca;
    @Field(id = 7)
    public final String zzccb;
    @Field(id = 8)
    public final boolean zzccc;
    @Field(id = 9)
    public final String zzccd;
    @Field(getter = "getLeaveApplicationListenerAsBinder", id = 10, type = "android.os.IBinder")
    public final zzt zzcce;
    @Field(id = 12)
    public final int zzccf;
    @Field(id = 16)
    public final String zzccg;
    @Field(id = 17)
    public final zzaq zzcch;
    @Field(getter = "getAdMetadataGmsgListenerAsBinder", id = 18, type = "android.os.IBinder")
    public final zzb zzcci;

    public static void zza(Intent intent, AdOverlayInfoParcel adOverlayInfoParcel) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    public static com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel zzc(android.content.Intent r1) {
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
        r0 = "com.google.android.gms.ads.inernal.overlay.AdOverlayInfo";	 Catch:{ Exception -> 0x0018 }
        r1 = r1.getBundleExtra(r0);	 Catch:{ Exception -> 0x0018 }
        r0 = com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.class;	 Catch:{ Exception -> 0x0018 }
        r0 = r0.getClassLoader();	 Catch:{ Exception -> 0x0018 }
        r1.setClassLoader(r0);	 Catch:{ Exception -> 0x0018 }
        r0 = "com.google.android.gms.ads.inernal.overlay.AdOverlayInfo";	 Catch:{ Exception -> 0x0018 }
        r1 = r1.getParcelable(r0);	 Catch:{ Exception -> 0x0018 }
        r1 = (com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel) r1;	 Catch:{ Exception -> 0x0018 }
        return r1;
    L_0x0018:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.zzc(android.content.Intent):com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel");
    }

    public AdOverlayInfoParcel(zzjc zzjc, zzn zzn, zzt zzt, zzasg zzasg, int i, zzaop zzaop, String str, zzaq zzaq) {
        this.zzcbw = null;
        this.zzcbx = zzjc;
        this.zzcby = zzn;
        this.zzcbz = zzasg;
        this.zzcci = null;
        this.zzcca = null;
        this.zzccb = null;
        this.zzccc = null;
        this.zzccd = null;
        this.zzcce = zzt;
        this.orientation = i;
        this.zzccf = 1;
        this.url = null;
        this.zzadg = zzaop;
        this.zzccg = str;
        this.zzcch = zzaq;
    }

    public AdOverlayInfoParcel(zzjc zzjc, zzn zzn, zzt zzt, zzasg zzasg, boolean z, int i, zzaop zzaop) {
        this.zzcbw = null;
        this.zzcbx = zzjc;
        this.zzcby = zzn;
        this.zzcbz = zzasg;
        this.zzcci = null;
        this.zzcca = null;
        this.zzccb = null;
        this.zzccc = z;
        this.zzccd = null;
        this.zzcce = zzt;
        this.orientation = i;
        this.zzccf = 2;
        this.url = null;
        this.zzadg = zzaop;
        this.zzccg = null;
        this.zzcch = null;
    }

    public AdOverlayInfoParcel(zzjc zzjc, zzn zzn, zzb zzb, zzd zzd, zzt zzt, zzasg zzasg, boolean z, int i, String str, zzaop zzaop) {
        this.zzcbw = null;
        this.zzcbx = zzjc;
        this.zzcby = zzn;
        this.zzcbz = zzasg;
        this.zzcci = zzb;
        this.zzcca = zzd;
        this.zzccb = null;
        this.zzccc = z;
        this.zzccd = null;
        this.zzcce = zzt;
        this.orientation = i;
        this.zzccf = 3;
        this.url = str;
        this.zzadg = zzaop;
        this.zzccg = null;
        this.zzcch = null;
    }

    public AdOverlayInfoParcel(zzjc zzjc, zzn zzn, zzb zzb, zzd zzd, zzt zzt, zzasg zzasg, boolean z, int i, String str, String str2, zzaop zzaop) {
        this.zzcbw = null;
        this.zzcbx = zzjc;
        this.zzcby = zzn;
        this.zzcbz = zzasg;
        this.zzcci = zzb;
        this.zzcca = zzd;
        this.zzccb = str2;
        this.zzccc = z;
        this.zzccd = str;
        this.zzcce = zzt;
        this.orientation = i;
        this.zzccf = 3;
        this.url = null;
        this.zzadg = zzaop;
        this.zzccg = null;
        this.zzcch = null;
    }

    public AdOverlayInfoParcel(zzc zzc, zzjc zzjc, zzn zzn, zzt zzt, zzaop zzaop) {
        this.zzcbw = zzc;
        this.zzcbx = zzjc;
        this.zzcby = zzn;
        this.zzcbz = null;
        this.zzcci = null;
        this.zzcca = null;
        this.zzccb = null;
        this.zzccc = null;
        this.zzccd = null;
        this.zzcce = zzt;
        this.orientation = -1;
        this.zzccf = 4;
        this.url = null;
        this.zzadg = zzaop;
        this.zzccg = null;
        this.zzcch = null;
    }

    @Constructor
    AdOverlayInfoParcel(@Param(id = 2) zzc zzc, @Param(id = 3) IBinder iBinder, @Param(id = 4) IBinder iBinder2, @Param(id = 5) IBinder iBinder3, @Param(id = 6) IBinder iBinder4, @Param(id = 7) String str, @Param(id = 8) boolean z, @Param(id = 9) String str2, @Param(id = 10) IBinder iBinder5, @Param(id = 11) int i, @Param(id = 12) int i2, @Param(id = 13) String str3, @Param(id = 14) zzaop zzaop, @Param(id = 16) String str4, @Param(id = 17) zzaq zzaq, @Param(id = 18) IBinder iBinder6) {
        this.zzcbw = zzc;
        this.zzcbx = (zzjc) ObjectWrapper.m26020a(Stub.m20401a(iBinder));
        this.zzcby = (zzn) ObjectWrapper.m26020a(Stub.m20401a(iBinder2));
        this.zzcbz = (zzasg) ObjectWrapper.m26020a(Stub.m20401a(iBinder3));
        this.zzcci = (zzb) ObjectWrapper.m26020a(Stub.m20401a(iBinder6));
        this.zzcca = (zzd) ObjectWrapper.m26020a(Stub.m20401a(iBinder4));
        this.zzccb = str;
        this.zzccc = z;
        this.zzccd = str2;
        this.zzcce = (zzt) ObjectWrapper.m26020a(Stub.m20401a(iBinder5));
        this.orientation = i;
        this.zzccf = i2;
        this.url = str3;
        this.zzadg = zzaop;
        this.zzccg = str4;
        this.zzcch = zzaq;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzcbw, i, false);
        SafeParcelWriter.writeIBinder(parcel, 3, ObjectWrapper.m26019a(this.zzcbx).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 4, ObjectWrapper.m26019a(this.zzcby).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 5, ObjectWrapper.m26019a(this.zzcbz).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 6, ObjectWrapper.m26019a(this.zzcca).asBinder(), false);
        SafeParcelWriter.writeString(parcel, 7, this.zzccb, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzccc);
        SafeParcelWriter.writeString(parcel, 9, this.zzccd, false);
        SafeParcelWriter.writeIBinder(parcel, 10, ObjectWrapper.m26019a(this.zzcce).asBinder(), false);
        SafeParcelWriter.writeInt(parcel, 11, this.orientation);
        SafeParcelWriter.writeInt(parcel, 12, this.zzccf);
        SafeParcelWriter.writeString(parcel, 13, this.url, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzadg, i, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzccg, false);
        SafeParcelWriter.writeParcelable(parcel, 17, this.zzcch, i, false);
        SafeParcelWriter.writeIBinder(parcel, 18, ObjectWrapper.m26019a(this.zzcci).asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
