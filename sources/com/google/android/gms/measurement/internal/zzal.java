package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;

public final class zzal extends ch {
    /* renamed from: a */
    private final C2477b f21632a = new C2477b(this, mo3170n(), "google_app_measurement_local.db");
    /* renamed from: b */
    private boolean f21633b;

    zzal(zzbt zzbt) {
        super(zzbt);
    }

    /* renamed from: v */
    protected final boolean mo4962v() {
        return false;
    }

    /* renamed from: x */
    public final void m29502x() {
        mo4393b();
        mo4395d();
        try {
            int delete = m29475y().delete("messages", null, null) + 0;
            if (delete > 0) {
                mo3172r().m28555x().m12355a("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            mo3172r().v_().m12355a("Error resetting local analytics data. error", e);
        }
    }

    /* renamed from: a */
    private final boolean m29474a(int r18, byte[] r19) {
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
        r17 = this;
        r1 = r17;
        r17.mo4393b();
        r17.mo4395d();
        r0 = r1.f21633b;
        r2 = 0;
        if (r0 == 0) goto L_0x000e;
    L_0x000d:
        return r2;
    L_0x000e:
        r3 = new android.content.ContentValues;
        r3.<init>();
        r0 = "type";
        r4 = java.lang.Integer.valueOf(r18);
        r3.put(r0, r4);
        r0 = "entry";
        r4 = r19;
        r3.put(r0, r4);
        r4 = 5;
        r5 = 0;
        r6 = 5;
    L_0x0026:
        if (r5 >= r4) goto L_0x0132;
    L_0x0028:
        r7 = 0;
        r8 = 1;
        r9 = r17.m29475y();	 Catch:{ SQLiteFullException -> 0x0104, SQLiteDatabaseLockedException -> 0x00f2, SQLiteException -> 0x00c7, all -> 0x00c3 }
        if (r9 != 0) goto L_0x0040;
    L_0x0030:
        r1.f21633b = r8;	 Catch:{ SQLiteFullException -> 0x003d, SQLiteDatabaseLockedException -> 0x00f3, SQLiteException -> 0x0038 }
        if (r9 == 0) goto L_0x0037;
    L_0x0034:
        r9.close();
    L_0x0037:
        return r2;
    L_0x0038:
        r0 = move-exception;
        r12 = r7;
    L_0x003a:
        r7 = r9;
        goto L_0x00c9;
    L_0x003d:
        r0 = move-exception;
        goto L_0x0106;
    L_0x0040:
        r9.beginTransaction();	 Catch:{ SQLiteFullException -> 0x003d, SQLiteDatabaseLockedException -> 0x00f3, SQLiteException -> 0x0038 }
        r10 = 0;	 Catch:{ SQLiteFullException -> 0x003d, SQLiteDatabaseLockedException -> 0x00f3, SQLiteException -> 0x0038 }
        r0 = "select count(1) from messages";	 Catch:{ SQLiteFullException -> 0x003d, SQLiteDatabaseLockedException -> 0x00f3, SQLiteException -> 0x0038 }
        r12 = r9.rawQuery(r0, r7);	 Catch:{ SQLiteFullException -> 0x003d, SQLiteDatabaseLockedException -> 0x00f3, SQLiteException -> 0x0038 }
        if (r12 == 0) goto L_0x0061;
    L_0x004d:
        r0 = r12.moveToFirst();	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
        if (r0 == 0) goto L_0x0061;	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
    L_0x0053:
        r10 = r12.getLong(r2);	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
        goto L_0x0061;	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
    L_0x0058:
        r0 = move-exception;	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
        goto L_0x0127;	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
    L_0x005b:
        r0 = move-exception;	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
        goto L_0x003a;	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
    L_0x005d:
        r0 = move-exception;	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
        r7 = r12;	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
        goto L_0x0106;	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
    L_0x0061:
        r13 = 100000; // 0x186a0 float:1.4013E-40 double:4.94066E-319;	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
        r0 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1));	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
        if (r0 < 0) goto L_0x00ab;	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
    L_0x0068:
        r0 = r17.mo3172r();	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
        r0 = r0.v_();	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
        r15 = "Data loss, local db full";	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
        r0.m12354a(r15);	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
        r0 = 0;	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
        r13 = r13 - r10;	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
        r10 = 1;	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
        r13 = r13 + r10;	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
        r0 = "messages";	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
        r10 = "rowid in (select rowid from messages order by rowid asc limit ?)";	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
        r11 = new java.lang.String[r8];	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
        r15 = java.lang.Long.toString(r13);	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
        r11[r2] = r15;	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
        r0 = r9.delete(r0, r10, r11);	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
        r10 = (long) r0;	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
        r0 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1));	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
        if (r0 == 0) goto L_0x00ab;	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
    L_0x008f:
        r0 = r17.mo3172r();	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
        r0 = r0.v_();	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
        r15 = "Different delete count than expected in local db. expected, received, difference";	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
        r4 = java.lang.Long.valueOf(r13);	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
        r2 = java.lang.Long.valueOf(r10);	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
        r16 = 0;	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
        r13 = r13 - r10;	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
        r10 = java.lang.Long.valueOf(r13);	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
        r0.m12357a(r15, r4, r2, r10);	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
    L_0x00ab:
        r0 = "messages";	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
        r9.insertOrThrow(r0, r7, r3);	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
        r9.setTransactionSuccessful();	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
        r9.endTransaction();	 Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
        if (r12 == 0) goto L_0x00bb;
    L_0x00b8:
        r12.close();
    L_0x00bb:
        if (r9 == 0) goto L_0x00c0;
    L_0x00bd:
        r9.close();
    L_0x00c0:
        return r8;
    L_0x00c1:
        r7 = r12;
        goto L_0x00f3;
    L_0x00c3:
        r0 = move-exception;
        r9 = r7;
        r12 = r9;
        goto L_0x0127;
    L_0x00c7:
        r0 = move-exception;
        r12 = r7;
    L_0x00c9:
        if (r7 == 0) goto L_0x00d8;
    L_0x00cb:
        r2 = r7.inTransaction();	 Catch:{ all -> 0x00d5 }
        if (r2 == 0) goto L_0x00d8;	 Catch:{ all -> 0x00d5 }
    L_0x00d1:
        r7.endTransaction();	 Catch:{ all -> 0x00d5 }
        goto L_0x00d8;	 Catch:{ all -> 0x00d5 }
    L_0x00d5:
        r0 = move-exception;	 Catch:{ all -> 0x00d5 }
        r9 = r7;	 Catch:{ all -> 0x00d5 }
        goto L_0x0127;	 Catch:{ all -> 0x00d5 }
    L_0x00d8:
        r2 = r17.mo3172r();	 Catch:{ all -> 0x00d5 }
        r2 = r2.v_();	 Catch:{ all -> 0x00d5 }
        r4 = "Error writing entry to local database";	 Catch:{ all -> 0x00d5 }
        r2.m12355a(r4, r0);	 Catch:{ all -> 0x00d5 }
        r1.f21633b = r8;	 Catch:{ all -> 0x00d5 }
        if (r12 == 0) goto L_0x00ec;
    L_0x00e9:
        r12.close();
    L_0x00ec:
        if (r7 == 0) goto L_0x011f;
    L_0x00ee:
        r7.close();
        goto L_0x011f;
    L_0x00f2:
        r9 = r7;
    L_0x00f3:
        r10 = (long) r6;
        android.os.SystemClock.sleep(r10);	 Catch:{ all -> 0x0125 }
        r6 = r6 + 20;
        if (r7 == 0) goto L_0x00fe;
    L_0x00fb:
        r7.close();
    L_0x00fe:
        if (r9 == 0) goto L_0x011f;
    L_0x0100:
        r9.close();
        goto L_0x011f;
    L_0x0104:
        r0 = move-exception;
        r9 = r7;
    L_0x0106:
        r2 = r17.mo3172r();	 Catch:{ all -> 0x0125 }
        r2 = r2.v_();	 Catch:{ all -> 0x0125 }
        r4 = "Error writing entry to local database";	 Catch:{ all -> 0x0125 }
        r2.m12355a(r4, r0);	 Catch:{ all -> 0x0125 }
        r1.f21633b = r8;	 Catch:{ all -> 0x0125 }
        if (r7 == 0) goto L_0x011a;
    L_0x0117:
        r7.close();
    L_0x011a:
        if (r9 == 0) goto L_0x011f;
    L_0x011c:
        r9.close();
    L_0x011f:
        r5 = r5 + 1;
        r2 = 0;
        r4 = 5;
        goto L_0x0026;
    L_0x0125:
        r0 = move-exception;
        r12 = r7;
    L_0x0127:
        if (r12 == 0) goto L_0x012c;
    L_0x0129:
        r12.close();
    L_0x012c:
        if (r9 == 0) goto L_0x0131;
    L_0x012e:
        r9.close();
    L_0x0131:
        throw r0;
    L_0x0132:
        r0 = r17.mo3172r();
        r0 = r0.m28540i();
        r2 = "Failed to write entry to local database";
        r0.m12354a(r2);
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.a(int, byte[]):boolean");
    }

    /* renamed from: a */
    public final boolean m29478a(zzad zzad) {
        Parcel obtain = Parcel.obtain();
        zzad.writeToParcel(obtain, 0);
        zzad = obtain.marshall();
        obtain.recycle();
        if (zzad.length <= 131072) {
            return m29474a(0, zzad);
        }
        mo3172r().m28540i().m12354a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    /* renamed from: a */
    public final boolean m29479a(zzfh zzfh) {
        Parcel obtain = Parcel.obtain();
        zzfh.writeToParcel(obtain, 0);
        zzfh = obtain.marshall();
        obtain.recycle();
        if (zzfh.length <= 131072) {
            return m29474a(1, zzfh);
        }
        mo3172r().m28540i().m12354a("User property too long for local database. Sending directly to service");
        return false;
    }

    /* renamed from: a */
    public final boolean m29480a(zzl zzl) {
        mo4398p();
        zzl = zzfk.m28598a((Parcelable) zzl);
        if (zzl.length <= 131072) {
            return m29474a(2, zzl);
        }
        mo3172r().m28540i().m12354a("Conditional user property too long for local database. Sending directly to service");
        return null;
    }

    /* renamed from: a */
    public final java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable> m29476a(int r19) {
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
        r18 = this;
        r1 = r18;
        r18.mo4395d();
        r18.mo4393b();
        r0 = r1.f21633b;
        r2 = 0;
        if (r0 == 0) goto L_0x000e;
    L_0x000d:
        return r2;
    L_0x000e:
        r3 = new java.util.ArrayList;
        r3.<init>();
        r0 = r18.mo3170n();
        r4 = "google_app_measurement_local.db";
        r0 = r0.getDatabasePath(r4);
        r0 = r0.exists();
        if (r0 != 0) goto L_0x0024;
    L_0x0023:
        return r3;
    L_0x0024:
        r4 = 5;
        r5 = 0;
        r6 = 0;
        r7 = 5;
    L_0x0028:
        if (r6 >= r4) goto L_0x01ed;
    L_0x002a:
        r8 = 1;
        r15 = r18.m29475y();	 Catch:{ SQLiteFullException -> 0x01c0, SQLiteDatabaseLockedException -> 0x01ad, SQLiteException -> 0x0185, all -> 0x0181 }
        if (r15 != 0) goto L_0x004b;
    L_0x0031:
        r1.f21633b = r8;	 Catch:{ SQLiteFullException -> 0x0046, SQLiteDatabaseLockedException -> 0x0043, SQLiteException -> 0x003e, all -> 0x0039 }
        if (r15 == 0) goto L_0x0038;
    L_0x0035:
        r15.close();
    L_0x0038:
        return r2;
    L_0x0039:
        r0 = move-exception;
        r9 = r2;
        r4 = r15;
        goto L_0x01e2;
    L_0x003e:
        r0 = move-exception;
        r9 = r2;
        r4 = r15;
        goto L_0x0188;
    L_0x0043:
        r4 = r15;
        goto L_0x017b;
    L_0x0046:
        r0 = move-exception;
        r9 = r2;
        r4 = r15;
        goto L_0x01c3;
    L_0x004b:
        r15.beginTransaction();	 Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x0043, SQLiteException -> 0x0177, all -> 0x0172 }
        r10 = "messages";	 Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x0043, SQLiteException -> 0x0177, all -> 0x0172 }
        r0 = "rowid";	 Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x0043, SQLiteException -> 0x0177, all -> 0x0172 }
        r9 = "type";	 Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x0043, SQLiteException -> 0x0177, all -> 0x0172 }
        r11 = "entry";	 Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x0043, SQLiteException -> 0x0177, all -> 0x0172 }
        r11 = new java.lang.String[]{r0, r9, r11};	 Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x0043, SQLiteException -> 0x0177, all -> 0x0172 }
        r12 = 0;	 Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x0043, SQLiteException -> 0x0177, all -> 0x0172 }
        r13 = 0;	 Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x0043, SQLiteException -> 0x0177, all -> 0x0172 }
        r14 = 0;	 Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x0043, SQLiteException -> 0x0177, all -> 0x0172 }
        r0 = 0;	 Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x0043, SQLiteException -> 0x0177, all -> 0x0172 }
        r16 = "rowid asc";	 Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x0043, SQLiteException -> 0x0177, all -> 0x0172 }
        r9 = 100;	 Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x0043, SQLiteException -> 0x0177, all -> 0x0172 }
        r17 = java.lang.Integer.toString(r9);	 Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x0043, SQLiteException -> 0x0177, all -> 0x0172 }
        r9 = r15;
        r4 = r15;
        r15 = r0;
        r9 = r9.query(r10, r11, r12, r13, r14, r15, r16, r17);	 Catch:{ SQLiteFullException -> 0x0170, SQLiteDatabaseLockedException -> 0x017b, SQLiteException -> 0x016e, all -> 0x016c }
        r10 = -1;
    L_0x006f:
        r0 = r9.moveToNext();	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
        if (r0 == 0) goto L_0x0133;	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
    L_0x0075:
        r10 = r9.getLong(r5);	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
        r0 = r9.getInt(r8);	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
        r12 = 2;	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
        r13 = r9.getBlob(r12);	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
        if (r0 != 0) goto L_0x00b7;	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
    L_0x0084:
        r12 = android.os.Parcel.obtain();	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
        r0 = r13.length;	 Catch:{ ParseException -> 0x00a2 }
        r12.unmarshall(r13, r5, r0);	 Catch:{ ParseException -> 0x00a2 }
        r12.setDataPosition(r5);	 Catch:{ ParseException -> 0x00a2 }
        r0 = com.google.android.gms.measurement.internal.zzad.CREATOR;	 Catch:{ ParseException -> 0x00a2 }
        r0 = r0.createFromParcel(r12);	 Catch:{ ParseException -> 0x00a2 }
        r0 = (com.google.android.gms.measurement.internal.zzad) r0;	 Catch:{ ParseException -> 0x00a2 }
        r12.recycle();	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
        if (r0 == 0) goto L_0x006f;	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
    L_0x009c:
        r3.add(r0);	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
        goto L_0x006f;
    L_0x00a0:
        r0 = move-exception;
        goto L_0x00b3;
    L_0x00a2:
        r0 = r18.mo3172r();	 Catch:{ all -> 0x00a0 }
        r0 = r0.v_();	 Catch:{ all -> 0x00a0 }
        r13 = "Failed to load event from local database";	 Catch:{ all -> 0x00a0 }
        r0.m12354a(r13);	 Catch:{ all -> 0x00a0 }
        r12.recycle();	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
        goto L_0x006f;	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
    L_0x00b3:
        r12.recycle();	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
        throw r0;	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
    L_0x00b7:
        if (r0 != r8) goto L_0x00ed;	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
    L_0x00b9:
        r12 = android.os.Parcel.obtain();	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
        r0 = r13.length;	 Catch:{ ParseException -> 0x00d2 }
        r12.unmarshall(r13, r5, r0);	 Catch:{ ParseException -> 0x00d2 }
        r12.setDataPosition(r5);	 Catch:{ ParseException -> 0x00d2 }
        r0 = com.google.android.gms.measurement.internal.zzfh.CREATOR;	 Catch:{ ParseException -> 0x00d2 }
        r0 = r0.createFromParcel(r12);	 Catch:{ ParseException -> 0x00d2 }
        r0 = (com.google.android.gms.measurement.internal.zzfh) r0;	 Catch:{ ParseException -> 0x00d2 }
        r12.recycle();	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
        goto L_0x00e3;
    L_0x00d0:
        r0 = move-exception;
        goto L_0x00e9;
    L_0x00d2:
        r0 = r18.mo3172r();	 Catch:{ all -> 0x00d0 }
        r0 = r0.v_();	 Catch:{ all -> 0x00d0 }
        r13 = "Failed to load user property from local database";	 Catch:{ all -> 0x00d0 }
        r0.m12354a(r13);	 Catch:{ all -> 0x00d0 }
        r12.recycle();	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
        r0 = r2;	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
    L_0x00e3:
        if (r0 == 0) goto L_0x006f;	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
    L_0x00e5:
        r3.add(r0);	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
        goto L_0x006f;	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
    L_0x00e9:
        r12.recycle();	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
        throw r0;	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
    L_0x00ed:
        if (r0 != r12) goto L_0x0124;	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
    L_0x00ef:
        r12 = android.os.Parcel.obtain();	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
        r0 = r13.length;	 Catch:{ ParseException -> 0x0108 }
        r12.unmarshall(r13, r5, r0);	 Catch:{ ParseException -> 0x0108 }
        r12.setDataPosition(r5);	 Catch:{ ParseException -> 0x0108 }
        r0 = com.google.android.gms.measurement.internal.zzl.CREATOR;	 Catch:{ ParseException -> 0x0108 }
        r0 = r0.createFromParcel(r12);	 Catch:{ ParseException -> 0x0108 }
        r0 = (com.google.android.gms.measurement.internal.zzl) r0;	 Catch:{ ParseException -> 0x0108 }
        r12.recycle();	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
        goto L_0x0119;
    L_0x0106:
        r0 = move-exception;
        goto L_0x0120;
    L_0x0108:
        r0 = r18.mo3172r();	 Catch:{ all -> 0x0106 }
        r0 = r0.v_();	 Catch:{ all -> 0x0106 }
        r13 = "Failed to load user property from local database";	 Catch:{ all -> 0x0106 }
        r0.m12354a(r13);	 Catch:{ all -> 0x0106 }
        r12.recycle();	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
        r0 = r2;	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
    L_0x0119:
        if (r0 == 0) goto L_0x006f;	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
    L_0x011b:
        r3.add(r0);	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
        goto L_0x006f;	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
    L_0x0120:
        r12.recycle();	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
        throw r0;	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
    L_0x0124:
        r0 = r18.mo3172r();	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
        r0 = r0.v_();	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
        r12 = "Unknown record type in local database";	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
        r0.m12354a(r12);	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
        goto L_0x006f;	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
    L_0x0133:
        r0 = "messages";	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
        r12 = "rowid <= ?";	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
        r13 = new java.lang.String[r8];	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
        r10 = java.lang.Long.toString(r10);	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
        r13[r5] = r10;	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
        r0 = r4.delete(r0, r12, r13);	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
        r10 = r3.size();	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
        if (r0 >= r10) goto L_0x0156;	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
    L_0x0149:
        r0 = r18.mo3172r();	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
        r0 = r0.v_();	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
        r10 = "Fewer entries removed from local database than expected";	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
        r0.m12354a(r10);	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
    L_0x0156:
        r4.setTransactionSuccessful();	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
        r4.endTransaction();	 Catch:{ SQLiteFullException -> 0x0169, SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0167 }
        if (r9 == 0) goto L_0x0161;
    L_0x015e:
        r9.close();
    L_0x0161:
        if (r4 == 0) goto L_0x0166;
    L_0x0163:
        r4.close();
    L_0x0166:
        return r3;
    L_0x0167:
        r0 = move-exception;
        goto L_0x0188;
    L_0x0169:
        r0 = move-exception;
        goto L_0x01c3;
    L_0x016c:
        r0 = move-exception;
        goto L_0x0174;
    L_0x016e:
        r0 = move-exception;
        goto L_0x0179;
    L_0x0170:
        r0 = move-exception;
        goto L_0x017f;
    L_0x0172:
        r0 = move-exception;
        r4 = r15;
    L_0x0174:
        r9 = r2;
        goto L_0x01e2;
    L_0x0177:
        r0 = move-exception;
        r4 = r15;
    L_0x0179:
        r9 = r2;
        goto L_0x0188;
    L_0x017b:
        r9 = r2;
        goto L_0x01af;
    L_0x017d:
        r0 = move-exception;
        r4 = r15;
    L_0x017f:
        r9 = r2;
        goto L_0x01c3;
    L_0x0181:
        r0 = move-exception;
        r4 = r2;
        r9 = r4;
        goto L_0x01e2;
    L_0x0185:
        r0 = move-exception;
        r4 = r2;
        r9 = r4;
    L_0x0188:
        if (r4 == 0) goto L_0x0193;
    L_0x018a:
        r10 = r4.inTransaction();	 Catch:{ all -> 0x01e1 }
        if (r10 == 0) goto L_0x0193;	 Catch:{ all -> 0x01e1 }
    L_0x0190:
        r4.endTransaction();	 Catch:{ all -> 0x01e1 }
    L_0x0193:
        r10 = r18.mo3172r();	 Catch:{ all -> 0x01e1 }
        r10 = r10.v_();	 Catch:{ all -> 0x01e1 }
        r11 = "Error reading entries from local database";	 Catch:{ all -> 0x01e1 }
        r10.m12355a(r11, r0);	 Catch:{ all -> 0x01e1 }
        r1.f21633b = r8;	 Catch:{ all -> 0x01e1 }
        if (r9 == 0) goto L_0x01a7;
    L_0x01a4:
        r9.close();
    L_0x01a7:
        if (r4 == 0) goto L_0x01dc;
    L_0x01a9:
        r4.close();
        goto L_0x01dc;
    L_0x01ad:
        r4 = r2;
        r9 = r4;
    L_0x01af:
        r10 = (long) r7;
        android.os.SystemClock.sleep(r10);	 Catch:{ all -> 0x01e1 }
        r7 = r7 + 20;
        if (r9 == 0) goto L_0x01ba;
    L_0x01b7:
        r9.close();
    L_0x01ba:
        if (r4 == 0) goto L_0x01dc;
    L_0x01bc:
        r4.close();
        goto L_0x01dc;
    L_0x01c0:
        r0 = move-exception;
        r4 = r2;
        r9 = r4;
    L_0x01c3:
        r10 = r18.mo3172r();	 Catch:{ all -> 0x01e1 }
        r10 = r10.v_();	 Catch:{ all -> 0x01e1 }
        r11 = "Error reading entries from local database";	 Catch:{ all -> 0x01e1 }
        r10.m12355a(r11, r0);	 Catch:{ all -> 0x01e1 }
        r1.f21633b = r8;	 Catch:{ all -> 0x01e1 }
        if (r9 == 0) goto L_0x01d7;
    L_0x01d4:
        r9.close();
    L_0x01d7:
        if (r4 == 0) goto L_0x01dc;
    L_0x01d9:
        r4.close();
    L_0x01dc:
        r6 = r6 + 1;
        r4 = 5;
        goto L_0x0028;
    L_0x01e1:
        r0 = move-exception;
    L_0x01e2:
        if (r9 == 0) goto L_0x01e7;
    L_0x01e4:
        r9.close();
    L_0x01e7:
        if (r4 == 0) goto L_0x01ec;
    L_0x01e9:
        r4.close();
    L_0x01ec:
        throw r0;
    L_0x01ed:
        r0 = r18.mo3172r();
        r0 = r0.m28540i();
        r3 = "Failed to read events from database in reasonable time";
        r0.m12354a(r3);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.a(int):java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable>");
    }

    @VisibleForTesting
    /* renamed from: y */
    private final SQLiteDatabase m29475y() {
        if (this.f21633b) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f21632a.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f21633b = true;
        return null;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo4392a() {
        super.mo4392a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo4393b() {
        super.mo4393b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo4394c() {
        super.mo4394c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo4395d() {
        super.mo4395d();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ zza mo4841e() {
        return super.mo4841e();
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ zzcs mo4842f() {
        return super.mo4842f();
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ zzaj mo4843g() {
        return super.mo4843g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ zzdr mo4844h() {
        return super.mo4844h();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ zzdo mo4845i() {
        return super.mo4845i();
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ zzal mo4846j() {
        return super.mo4846j();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ zzeq mo4847k() {
        return super.mo4847k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ zzx mo4396l() {
        return super.mo4396l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Clock mo3169m() {
        return super.mo3169m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ Context mo3170n() {
        return super.mo3170n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ zzan mo4397o() {
        return super.mo4397o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ zzfk mo4398p() {
        return super.mo4398p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ zzbo mo3171q() {
        return super.mo3171q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ zzap mo3172r() {
        return super.mo3172r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C4832l mo4399s() {
        return super.mo4399s();
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ zzn mo4400t() {
        return super.mo4400t();
    }

    /* renamed from: u */
    public final /* bridge */ /* synthetic */ zzk mo3173u() {
        return super.mo3173u();
    }
}
