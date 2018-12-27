package android.support.v4.os;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.os.C0508b.C3155a;

public class ResultReceiver implements Parcelable {
    public static final Creator<ResultReceiver> CREATOR = new C05051();
    /* renamed from: a */
    final boolean f1611a = false;
    /* renamed from: b */
    final Handler f1612b = null;
    /* renamed from: c */
    C0508b f1613c;

    /* renamed from: android.support.v4.os.ResultReceiver$1 */
    static class C05051 implements Creator<ResultReceiver> {
        C05051() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m1874a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m1875a(i);
        }

        /* renamed from: a */
        public ResultReceiver m1874a(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        /* renamed from: a */
        public ResultReceiver[] m1875a(int i) {
            return new ResultReceiver[i];
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$b */
    class C0506b implements Runnable {
        /* renamed from: a */
        final int f1608a;
        /* renamed from: b */
        final Bundle f1609b;
        /* renamed from: c */
        final /* synthetic */ ResultReceiver f1610c;

        C0506b(ResultReceiver resultReceiver, int i, Bundle bundle) {
            this.f1610c = resultReceiver;
            this.f1608a = i;
            this.f1609b = bundle;
        }

        public void run() {
            this.f1610c.mo340a(this.f1608a, this.f1609b);
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$a */
    class C4440a extends C3155a {
        /* renamed from: a */
        final /* synthetic */ ResultReceiver f18421a;

        C4440a(ResultReceiver resultReceiver) {
            this.f18421a = resultReceiver;
        }

        /* renamed from: a */
        public void mo435a(int i, Bundle bundle) {
            if (this.f18421a.f1612b != null) {
                this.f18421a.f1612b.post(new C0506b(this.f18421a, i, bundle));
            } else {
                this.f18421a.mo340a(i, bundle);
            }
        }
    }

    /* renamed from: a */
    protected void mo340a(int i, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: b */
    public void m1877b(int r3, android.os.Bundle r4) {
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
        r0 = r2.f1611a;
        if (r0 == 0) goto L_0x0017;
    L_0x0004:
        r0 = r2.f1612b;
        if (r0 == 0) goto L_0x0013;
    L_0x0008:
        r0 = r2.f1612b;
        r1 = new android.support.v4.os.ResultReceiver$b;
        r1.<init>(r2, r3, r4);
        r0.post(r1);
        goto L_0x0016;
    L_0x0013:
        r2.mo340a(r3, r4);
    L_0x0016:
        return;
    L_0x0017:
        r0 = r2.f1613c;
        if (r0 == 0) goto L_0x0020;
    L_0x001b:
        r0 = r2.f1613c;	 Catch:{ RemoteException -> 0x0020 }
        r0.mo435a(r3, r4);	 Catch:{ RemoteException -> 0x0020 }
    L_0x0020:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.os.ResultReceiver.b(int, android.os.Bundle):void");
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f1613c == 0) {
                this.f1613c = new C4440a(this);
            }
            parcel.writeStrongBinder(this.f1613c.asBinder());
        }
    }

    ResultReceiver(Parcel parcel) {
        this.f1613c = C3155a.m15754a(parcel.readStrongBinder());
    }
}
