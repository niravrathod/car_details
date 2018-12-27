package com.google.firebase.iid;

import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;

public class zzl implements Parcelable {
    public static final Creator<zzl> CREATOR = new al();
    /* renamed from: a */
    private Messenger f11081a;
    /* renamed from: b */
    private au f11082b;

    /* renamed from: com.google.firebase.iid.zzl$a */
    public static final class C2607a extends ClassLoader {
        protected final Class<?> loadClass(String str, boolean z) {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z);
            }
            if (FirebaseInstanceId.m12665g() != null) {
                Log.d("FirebaseInstanceId", "Using renamed FirebaseIidMessengerCompat class");
            }
            return zzl.class;
        }
    }

    public zzl(IBinder iBinder) {
        if (VERSION.SDK_INT >= 21) {
            this.f11081a = new Messenger(iBinder);
        } else {
            this.f11082b = new av(iBinder);
        }
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final void m12806a(Message message) {
        if (this.f11081a != null) {
            this.f11081a.send(message);
        } else {
            this.f11082b.mo3326a(message);
        }
    }

    /* renamed from: a */
    private final IBinder m12805a() {
        return this.f11081a != null ? this.f11081a.getBinder() : this.f11082b.asBinder();
    }

    public boolean equals(java.lang.Object r3) {
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
        r2 = this;
        r0 = 0;
        if (r3 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r2.m12805a();	 Catch:{ ClassCastException -> 0x0013 }
        r3 = (com.google.firebase.iid.zzl) r3;	 Catch:{ ClassCastException -> 0x0013 }
        r3 = r3.m12805a();	 Catch:{ ClassCastException -> 0x0013 }
        r3 = r1.equals(r3);	 Catch:{ ClassCastException -> 0x0013 }
        return r3;
    L_0x0013:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.zzl.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return m12805a().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.f11081a != 0) {
            parcel.writeStrongBinder(this.f11081a.getBinder());
        } else {
            parcel.writeStrongBinder(this.f11082b.asBinder());
        }
    }
}
