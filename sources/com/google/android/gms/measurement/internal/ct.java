package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzfu;
import com.google.android.gms.internal.measurement.zzfv;
import com.google.android.gms.internal.measurement.zzfy;
import com.google.android.gms.internal.measurement.zzgf;
import com.google.android.gms.internal.measurement.zzgg;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzyx;
import com.google.android.gms.internal.measurement.zzyy;
import com.google.android.gms.internal.measurement.zzzg;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class ct extends cg {
    /* renamed from: b */
    private static final String[] f21614b = new String[]{"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;"};
    /* renamed from: c */
    private static final String[] f21615c = new String[]{"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    /* renamed from: d */
    private static final String[] f21616d = new String[]{"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;"};
    /* renamed from: e */
    private static final String[] f21617e = new String[]{"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    /* renamed from: f */
    private static final String[] f21618f = new String[]{"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    /* renamed from: g */
    private static final String[] f21619g = new String[]{"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    /* renamed from: h */
    private final cv f21620h = new cv(this, mo3170n(), "google_app_measurement.db");
    /* renamed from: i */
    private final cd f21621i = new cd(mo3169m());

    ct(zzfa zzfa) {
        super(zzfa);
    }

    /* renamed from: e */
    protected final boolean mo4961e() {
        return false;
    }

    /* renamed from: f */
    public final void m29437f() {
        m28438k();
        m29442y().beginTransaction();
    }

    /* renamed from: w */
    public final void m29440w() {
        m28438k();
        m29442y().setTransactionSuccessful();
    }

    /* renamed from: x */
    public final void m29441x() {
        m28438k();
        m29442y().endTransaction();
    }

    /* renamed from: b */
    private final long m29399b(String str, String[] strArr) {
        Object e;
        String[] strArr2 = null;
        try {
            strArr = m29442y().rawQuery(str, strArr);
            try {
                if (strArr.moveToFirst()) {
                    long j = strArr.getLong(0);
                    if (strArr != null) {
                        strArr.close();
                    }
                    return j;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e2) {
                e = e2;
                strArr2 = strArr;
                try {
                    mo3172r().v_().m12356a("Database error", str, e);
                    throw e;
                } catch (Throwable th) {
                    str = th;
                    strArr = strArr2;
                    if (strArr != null) {
                        strArr.close();
                    }
                    throw str;
                }
            } catch (Throwable th2) {
                str = th2;
                if (strArr != null) {
                    strArr.close();
                }
                throw str;
            }
        } catch (SQLiteException e3) {
            e = e3;
            mo3172r().v_().m12356a("Database error", str, e);
            throw e;
        }
    }

    /* renamed from: a */
    private final long m29392a(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            strArr = m29442y().rawQuery(str, strArr);
            try {
                if (strArr.moveToFirst()) {
                    j = strArr.getLong(0);
                    if (strArr != null) {
                        strArr.close();
                    }
                    return j;
                }
                if (strArr != null) {
                    strArr.close();
                }
                return j;
            } catch (SQLiteException e) {
                j = e;
                cursor = strArr;
                try {
                    mo3172r().v_().m12356a("Database error", str, j);
                    throw j;
                } catch (Throwable th) {
                    str = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw str;
                }
            } catch (Throwable th2) {
                str = th2;
                cursor = strArr;
                if (cursor != null) {
                    cursor.close();
                }
                throw str;
            }
        } catch (SQLiteException e2) {
            j = e2;
            mo3172r().v_().m12356a("Database error", str, j);
            throw j;
        }
    }

    @VisibleForTesting
    /* renamed from: y */
    final SQLiteDatabase m29442y() {
        mo4395d();
        try {
            return this.f21620h.getWritableDatabase();
        } catch (SQLiteException e) {
            mo3172r().m28540i().m12355a("Error opening database", e);
            throw e;
        }
    }

    /* renamed from: a */
    public final cy m29409a(String str, String str2) {
        Cursor cursor;
        Object e;
        Throwable th;
        String str3 = str2;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        mo4395d();
        m28438k();
        try {
            r5 = new String[2];
            boolean z = false;
            r5[0] = str;
            r5[1] = str3;
            Cursor query = m29442y().query("events", new String[]{"lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling"}, "app_id=? and name=?", r5, null, null, null);
            try {
                if (query.moveToFirst()) {
                    Boolean bool;
                    long j = query.getLong(0);
                    long j2 = query.getLong(1);
                    long j3 = query.getLong(2);
                    long j4 = query.isNull(3) ? 0 : query.getLong(3);
                    Long valueOf = query.isNull(4) ? null : Long.valueOf(query.getLong(4));
                    Long valueOf2 = query.isNull(5) ? null : Long.valueOf(query.getLong(5));
                    cy valueOf3 = query.isNull(6) ? null : Long.valueOf(query.getLong(6));
                    if (query.isNull(7)) {
                        bool = null;
                    } else {
                        if (query.getLong(7) == 1) {
                            z = true;
                        }
                        bool = Boolean.valueOf(z);
                    }
                    cy cyVar = cyVar;
                    long j5 = j4;
                    cursor = query;
                    try {
                        cyVar = new cy(str, str2, j, j2, j3, j5, valueOf, valueOf2, valueOf3, bool);
                        if (cursor.moveToNext()) {
                            mo3172r().v_().m12355a("Got multiple records for event aggregates, expected one. appId", zzap.m28525a(str));
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        return cyVar;
                    } catch (SQLiteException e2) {
                        e = e2;
                        try {
                            mo3172r().v_().m12357a("Error querying events. appId", zzap.m28525a(str), mo4397o().m28503a(str2), e);
                            if (cursor != null) {
                                cursor.close();
                            }
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                }
                if (query != null) {
                    query.close();
                }
                return null;
            } catch (SQLiteException e3) {
                e = e3;
                cursor = query;
                mo3172r().v_().m12357a("Error querying events. appId", zzap.m28525a(str), mo4397o().m28503a(str2), e);
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
                cursor = query;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e4) {
            e = e4;
            cursor = null;
            mo3172r().v_().m12357a("Error querying events. appId", zzap.m28525a(str), mo4397o().m28503a(str2), e);
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            cursor = null;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final void m29417a(cy cyVar) {
        Preconditions.checkNotNull(cyVar);
        mo4395d();
        m28438k();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", cyVar.f10612a);
        contentValues.put("name", cyVar.f10613b);
        contentValues.put("lifetime_count", Long.valueOf(cyVar.f10614c));
        contentValues.put("current_bundle_count", Long.valueOf(cyVar.f10615d));
        contentValues.put("last_fire_timestamp", Long.valueOf(cyVar.f10616e));
        contentValues.put("last_bundled_timestamp", Long.valueOf(cyVar.f10617f));
        contentValues.put("last_bundled_day", cyVar.f10618g);
        contentValues.put("last_sampled_complex_event_id", cyVar.f10619h);
        contentValues.put("last_sampling_rate", cyVar.f10620i);
        Long valueOf = (cyVar.f10621j == null || !cyVar.f10621j.booleanValue()) ? null : Long.valueOf(1);
        contentValues.put("last_exempt_from_sampling", valueOf);
        try {
            if (m29442y().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                mo3172r().v_().m12355a("Failed to insert/update event aggregates (got -1). appId", zzap.m28525a(cyVar.f10612a));
            }
        } catch (SQLiteException e) {
            mo3172r().v_().m12356a("Error storing event aggregates. appId", zzap.m28525a(cyVar.f10612a), e);
        }
    }

    /* renamed from: b */
    public final void m29427b(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        mo4395d();
        m28438k();
        try {
            mo3172r().m28555x().m12355a("Deleted user attribute rows", Integer.valueOf(m29442y().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2})));
        } catch (SQLiteException e) {
            mo3172r().v_().m12357a("Error deleting user attribute. appId", zzap.m28525a(str), mo4397o().m28507c(str2), e);
        }
    }

    /* renamed from: a */
    public final boolean m29421a(cm cmVar) {
        Preconditions.checkNotNull(cmVar);
        mo4395d();
        m28438k();
        if (m29429c(cmVar.f10569a, cmVar.f10571c) == null) {
            if (zzfk.m28595a(cmVar.f10571c)) {
                if (m29399b("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{cmVar.f10569a}) >= 25) {
                    return false;
                }
            }
            long b = m29399b("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{cmVar.f10569a, cmVar.f10570b});
            if (mo4400t().m27348d(cmVar.f10569a, zzaf.am)) {
                if (!"_ap".equals(cmVar.f10571c) && b >= 25) {
                    return false;
                }
            } else if (b >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", cmVar.f10569a);
        contentValues.put("origin", cmVar.f10570b);
        contentValues.put("name", cmVar.f10571c);
        contentValues.put("set_timestamp", Long.valueOf(cmVar.f10572d));
        m29395a(contentValues, "value", cmVar.f10573e);
        try {
            if (m29442y().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                mo3172r().v_().m12355a("Failed to insert/update user property (got -1). appId", zzap.m28525a(cmVar.f10569a));
            }
        } catch (SQLiteException e) {
            mo3172r().v_().m12356a("Error storing user property. appId", zzap.m28525a(cmVar.f10569a), e);
        }
        return true;
    }

    /* renamed from: c */
    public final cm m29429c(String str, String str2) {
        Cursor query;
        Object e;
        Throwable th;
        ct ctVar;
        String str3 = str2;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        mo4395d();
        m28438k();
        try {
            query = m29442y().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str3}, null, null, null);
            try {
                if (query.moveToFirst()) {
                    long j = query.getLong(0);
                    try {
                        String str4 = str;
                        cm cmVar = new cm(str4, query.getString(2), str2, j, m29394a(query, 1));
                        if (query.moveToNext()) {
                            mo3172r().v_().m12355a("Got multiple records for user property, expected one. appId", zzap.m28525a(str));
                        }
                        if (query != null) {
                            query.close();
                        }
                        return cmVar;
                    } catch (SQLiteException e2) {
                        e = e2;
                        try {
                            mo3172r().v_().m12357a("Error querying user property. appId", zzap.m28525a(str), mo4397o().m28507c(str3), e);
                            if (query != null) {
                                query.close();
                            }
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (query != null) {
                                query.close();
                            }
                            throw th;
                        }
                    }
                }
                if (query != null) {
                    query.close();
                }
                return null;
            } catch (SQLiteException e3) {
                e = e3;
                ctVar = this;
                mo3172r().v_().m12357a("Error querying user property. appId", zzap.m28525a(str), mo4397o().m28507c(str3), e);
                if (query != null) {
                    query.close();
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
                ctVar = this;
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        } catch (SQLiteException e4) {
            e = e4;
            ctVar = this;
            query = null;
            mo3172r().v_().m12357a("Error querying user property. appId", zzap.m28525a(str), mo4397o().m28507c(str3), e);
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            ctVar = this;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final List<cm> m29412a(String str) {
        Object e;
        Preconditions.checkNotEmpty(str);
        mo4395d();
        m28438k();
        List<cm> arrayList = new ArrayList();
        Cursor query;
        try {
            query = m29442y().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
            try {
                if (query.moveToFirst()) {
                    do {
                        String string = query.getString(0);
                        String string2 = query.getString(1);
                        if (string2 == null) {
                            string2 = "";
                        }
                        String str2 = string2;
                        long j = query.getLong(2);
                        Object a = m29394a(query, 3);
                        if (a == null) {
                            mo3172r().v_().m12355a("Read invalid user property value, ignoring it. appId", zzap.m28525a(str));
                        } else {
                            arrayList.add(new cm(str, str2, string, j, a));
                        }
                    } while (query.moveToNext());
                    if (query != null) {
                        query.close();
                    }
                    return arrayList;
                }
                if (query != null) {
                    query.close();
                }
                return arrayList;
            } catch (SQLiteException e2) {
                e = e2;
            }
        } catch (SQLiteException e3) {
            e = e3;
            query = null;
            try {
                mo3172r().v_().m12356a("Error querying user properties. appId", zzap.m28525a(str), e);
                if (query != null) {
                    query.close();
                }
                return null;
            } catch (Throwable th) {
                str = th;
                if (query != null) {
                    query.close();
                }
                throw str;
            }
        } catch (Throwable th2) {
            str = th2;
            query = null;
            if (query != null) {
                query.close();
            }
            throw str;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final java.util.List<com.google.android.gms.measurement.internal.cm> m29414a(java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
        r21 = this;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r22);
        r21.mo4395d();
        r21.m28438k();
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = 0;
        r2 = new java.util.ArrayList;	 Catch:{ SQLiteException -> 0x0105, all -> 0x0101 }
        r3 = 3;
        r2.<init>(r3);	 Catch:{ SQLiteException -> 0x0105, all -> 0x0101 }
        r11 = r22;
        r2.add(r11);	 Catch:{ SQLiteException -> 0x00fd, all -> 0x0101 }
        r4 = new java.lang.StringBuilder;	 Catch:{ SQLiteException -> 0x00fd, all -> 0x0101 }
        r5 = "app_id=?";
        r4.<init>(r5);	 Catch:{ SQLiteException -> 0x00fd, all -> 0x0101 }
        r5 = android.text.TextUtils.isEmpty(r23);	 Catch:{ SQLiteException -> 0x00fd, all -> 0x0101 }
        if (r5 != 0) goto L_0x0037;
    L_0x0027:
        r5 = r23;
        r2.add(r5);	 Catch:{ SQLiteException -> 0x0032, all -> 0x0101 }
        r6 = " and origin=?";
        r4.append(r6);	 Catch:{ SQLiteException -> 0x0032, all -> 0x0101 }
        goto L_0x0039;
    L_0x0032:
        r0 = move-exception;
        r12 = r21;
        goto L_0x010c;
    L_0x0037:
        r5 = r23;
    L_0x0039:
        r6 = android.text.TextUtils.isEmpty(r24);	 Catch:{ SQLiteException -> 0x0032, all -> 0x0101 }
        if (r6 != 0) goto L_0x0051;
    L_0x003f:
        r6 = java.lang.String.valueOf(r24);	 Catch:{ SQLiteException -> 0x0032, all -> 0x0101 }
        r7 = "*";
        r6 = r6.concat(r7);	 Catch:{ SQLiteException -> 0x0032, all -> 0x0101 }
        r2.add(r6);	 Catch:{ SQLiteException -> 0x0032, all -> 0x0101 }
        r6 = " and name glob ?";
        r4.append(r6);	 Catch:{ SQLiteException -> 0x0032, all -> 0x0101 }
    L_0x0051:
        r6 = r2.size();	 Catch:{ SQLiteException -> 0x0032, all -> 0x0101 }
        r6 = new java.lang.String[r6];	 Catch:{ SQLiteException -> 0x0032, all -> 0x0101 }
        r2 = r2.toArray(r6);	 Catch:{ SQLiteException -> 0x0032, all -> 0x0101 }
        r16 = r2;
        r16 = (java.lang.String[]) r16;	 Catch:{ SQLiteException -> 0x0032, all -> 0x0101 }
        r12 = r21.m29442y();	 Catch:{ SQLiteException -> 0x0032, all -> 0x0101 }
        r13 = "user_attributes";
        r2 = "name";
        r6 = "set_timestamp";
        r7 = "value";
        r8 = "origin";
        r14 = new java.lang.String[]{r2, r6, r7, r8};	 Catch:{ SQLiteException -> 0x0032, all -> 0x0101 }
        r15 = r4.toString();	 Catch:{ SQLiteException -> 0x0032, all -> 0x0101 }
        r17 = 0;
        r18 = 0;
        r19 = "rowid";
        r20 = "1001";
        r2 = r12.query(r13, r14, r15, r16, r17, r18, r19, r20);	 Catch:{ SQLiteException -> 0x0032, all -> 0x0101 }
        r4 = r2.moveToFirst();	 Catch:{ SQLiteException -> 0x00f9, all -> 0x00f5 }
        if (r4 != 0) goto L_0x008d;
    L_0x0087:
        if (r2 == 0) goto L_0x008c;
    L_0x0089:
        r2.close();
    L_0x008c:
        return r0;
    L_0x008d:
        r4 = r0.size();	 Catch:{ SQLiteException -> 0x00f9, all -> 0x00f5 }
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        if (r4 < r6) goto L_0x00a9;
    L_0x0095:
        r3 = r21.mo3172r();	 Catch:{ SQLiteException -> 0x00f9, all -> 0x00f5 }
        r3 = r3.v_();	 Catch:{ SQLiteException -> 0x00f9, all -> 0x00f5 }
        r4 = "Read more than the max allowed user properties, ignoring excess";
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ SQLiteException -> 0x00f9, all -> 0x00f5 }
        r3.m12355a(r4, r6);	 Catch:{ SQLiteException -> 0x00f9, all -> 0x00f5 }
        r12 = r21;
        goto L_0x00eb;
    L_0x00a9:
        r4 = 0;
        r7 = r2.getString(r4);	 Catch:{ SQLiteException -> 0x00f9, all -> 0x00f5 }
        r4 = 1;
        r8 = r2.getLong(r4);	 Catch:{ SQLiteException -> 0x00f9, all -> 0x00f5 }
        r4 = 2;
        r12 = r21;
        r10 = r12.m29394a(r2, r4);	 Catch:{ SQLiteException -> 0x00f3 }
        r13 = r2.getString(r3);	 Catch:{ SQLiteException -> 0x00f3 }
        if (r10 != 0) goto L_0x00d7;
    L_0x00c0:
        r4 = r21.mo3172r();	 Catch:{ SQLiteException -> 0x00d4 }
        r4 = r4.v_();	 Catch:{ SQLiteException -> 0x00d4 }
        r5 = "(2)Read invalid user property value, ignoring it";
        r6 = com.google.android.gms.measurement.internal.zzap.m28525a(r22);	 Catch:{ SQLiteException -> 0x00d4 }
        r14 = r24;
        r4.m12357a(r5, r6, r13, r14);	 Catch:{ SQLiteException -> 0x00d4 }
        goto L_0x00e5;
    L_0x00d4:
        r0 = move-exception;
        r5 = r13;
        goto L_0x010d;
    L_0x00d7:
        r14 = r24;
        r15 = new com.google.android.gms.measurement.internal.cm;	 Catch:{ SQLiteException -> 0x00d4 }
        r4 = r15;
        r5 = r22;
        r6 = r13;
        r4.<init>(r5, r6, r7, r8, r10);	 Catch:{ SQLiteException -> 0x00d4 }
        r0.add(r15);	 Catch:{ SQLiteException -> 0x00d4 }
    L_0x00e5:
        r4 = r2.moveToNext();	 Catch:{ SQLiteException -> 0x00d4 }
        if (r4 != 0) goto L_0x00f1;
    L_0x00eb:
        if (r2 == 0) goto L_0x00f0;
    L_0x00ed:
        r2.close();
    L_0x00f0:
        return r0;
    L_0x00f1:
        r5 = r13;
        goto L_0x008d;
    L_0x00f3:
        r0 = move-exception;
        goto L_0x010d;
    L_0x00f5:
        r0 = move-exception;
        r12 = r21;
        goto L_0x0125;
    L_0x00f9:
        r0 = move-exception;
        r12 = r21;
        goto L_0x010d;
    L_0x00fd:
        r0 = move-exception;
        r12 = r21;
        goto L_0x010a;
    L_0x0101:
        r0 = move-exception;
        r12 = r21;
        goto L_0x0126;
    L_0x0105:
        r0 = move-exception;
        r12 = r21;
        r11 = r22;
    L_0x010a:
        r5 = r23;
    L_0x010c:
        r2 = r1;
    L_0x010d:
        r3 = r21.mo3172r();	 Catch:{ all -> 0x0124 }
        r3 = r3.v_();	 Catch:{ all -> 0x0124 }
        r4 = "(2)Error querying user properties";
        r6 = com.google.android.gms.measurement.internal.zzap.m28525a(r22);	 Catch:{ all -> 0x0124 }
        r3.m12357a(r4, r6, r5, r0);	 Catch:{ all -> 0x0124 }
        if (r2 == 0) goto L_0x0123;
    L_0x0120:
        r2.close();
    L_0x0123:
        return r1;
    L_0x0124:
        r0 = move-exception;
    L_0x0125:
        r1 = r2;
    L_0x0126:
        if (r1 == 0) goto L_0x012b;
    L_0x0128:
        r1.close();
    L_0x012b:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ct.a(java.lang.String, java.lang.String, java.lang.String):java.util.List<com.google.android.gms.measurement.internal.cm>");
    }

    /* renamed from: a */
    public final boolean m29422a(zzl zzl) {
        Preconditions.checkNotNull(zzl);
        mo4395d();
        m28438k();
        if (m29429c(zzl.f20707a, zzl.f20709c.f20681a) == null) {
            if (m29399b("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{zzl.f20707a}) >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzl.f20707a);
        contentValues.put("origin", zzl.f20708b);
        contentValues.put("name", zzl.f20709c.f20681a);
        m29395a(contentValues, "value", zzl.f20709c.m27328a());
        contentValues.put("active", Boolean.valueOf(zzl.f20711e));
        contentValues.put("trigger_event_name", zzl.f20712f);
        contentValues.put("trigger_timeout", Long.valueOf(zzl.f20714h));
        mo4398p();
        contentValues.put("timed_out_event", zzfk.m28598a(zzl.f20713g));
        contentValues.put("creation_timestamp", Long.valueOf(zzl.f20710d));
        mo4398p();
        contentValues.put("triggered_event", zzfk.m28598a(zzl.f20715i));
        contentValues.put("triggered_timestamp", Long.valueOf(zzl.f20709c.f20682b));
        contentValues.put("time_to_live", Long.valueOf(zzl.f20716j));
        mo4398p();
        contentValues.put("expired_event", zzfk.m28598a(zzl.f20717k));
        try {
            if (m29442y().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                mo3172r().v_().m12355a("Failed to insert/update conditional user property (got -1)", zzap.m28525a(zzl.f20707a));
            }
        } catch (SQLiteException e) {
            mo3172r().v_().m12356a("Error storing conditional user property", zzap.m28525a(zzl.f20707a), e);
        }
        return true;
    }

    /* renamed from: d */
    public final zzl m29430d(String str, String str2) {
        Object e;
        Throwable th;
        ct ctVar;
        String str3 = str2;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        mo4395d();
        m28438k();
        Cursor query;
        try {
            query = m29442y().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str3}, null, null, null);
            try {
                if (query.moveToFirst()) {
                    String string = query.getString(0);
                    try {
                        Object a = m29394a(query, 1);
                        boolean z = query.getInt(2) != 0;
                        String string2 = query.getString(3);
                        long j = query.getLong(4);
                        zzad zzad = (zzad) mo4964g().m29775a(query.getBlob(5), zzad.CREATOR);
                        String str4 = str;
                        zzl zzl = new zzl(str4, string, new zzfh(str2, query.getLong(8), a, string), query.getLong(6), z, string2, zzad, j, (zzad) mo4964g().m29775a(query.getBlob(7), zzad.CREATOR), query.getLong(9), (zzad) mo4964g().m29775a(query.getBlob(10), zzad.CREATOR));
                        if (query.moveToNext()) {
                            mo3172r().v_().m12356a("Got multiple records for conditional property, expected one", zzap.m28525a(str), mo4397o().m28507c(str3));
                        }
                        if (query != null) {
                            query.close();
                        }
                        return zzl;
                    } catch (SQLiteException e2) {
                        e = e2;
                        try {
                            mo3172r().v_().m12357a("Error querying conditional property", zzap.m28525a(str), mo4397o().m28507c(str3), e);
                            if (query != null) {
                                query.close();
                            }
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (query != null) {
                                query.close();
                            }
                            throw th;
                        }
                    }
                }
                if (query != null) {
                    query.close();
                }
                return null;
            } catch (SQLiteException e3) {
                e = e3;
                ctVar = this;
                mo3172r().v_().m12357a("Error querying conditional property", zzap.m28525a(str), mo4397o().m28507c(str3), e);
                if (query != null) {
                    query.close();
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
                ctVar = this;
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        } catch (SQLiteException e4) {
            e = e4;
            ctVar = this;
            query = null;
            mo3172r().v_().m12357a("Error querying conditional property", zzap.m28525a(str), mo4397o().m28507c(str3), e);
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            ctVar = this;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    /* renamed from: e */
    public final int m29432e(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        mo4395d();
        m28438k();
        try {
            return m29442y().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            mo3172r().v_().m12357a("Error deleting conditional property", zzap.m28525a(str), mo4397o().m28507c(str2), e);
            return 0;
        }
    }

    /* renamed from: b */
    public final List<zzl> m29426b(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        mo4395d();
        m28438k();
        List arrayList = new ArrayList(3);
        arrayList.add(str);
        str = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            str.append(" and origin=?");
        }
        if (TextUtils.isEmpty(str3) == null) {
            arrayList.add(String.valueOf(str3).concat("*"));
            str.append(" and name glob ?");
        }
        return m29415a(str.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* renamed from: a */
    public final List<zzl> m29415a(String str, String[] strArr) {
        Object e;
        Throwable th;
        mo4395d();
        m28438k();
        List<zzl> arrayList = new ArrayList();
        Cursor cursor = null;
        Cursor query;
        try {
            query = m29442y().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", NativeContentAd.ASSET_HEADLINE);
            try {
                if (query.moveToFirst()) {
                    do {
                        if (arrayList.size() >= 1000) {
                            mo3172r().v_().m12355a("Read more than the max allowed conditional properties, ignoring extra", Integer.valueOf(1000));
                            break;
                        }
                        boolean z = false;
                        String string = query.getString(0);
                        String string2 = query.getString(1);
                        String string3 = query.getString(2);
                        Object a = m29394a(query, 3);
                        if (query.getInt(4) != 0) {
                            z = true;
                        }
                        String string4 = query.getString(5);
                        long j = query.getLong(6);
                        zzad zzad = (zzad) mo4964g().m29775a(query.getBlob(7), zzad.CREATOR);
                        long j2 = query.getLong(8);
                        zzad zzad2 = (zzad) mo4964g().m29775a(query.getBlob(9), zzad.CREATOR);
                        long j3 = query.getLong(10);
                        long j4 = query.getLong(11);
                        zzad zzad3 = (zzad) mo4964g().m29775a(query.getBlob(12), zzad.CREATOR);
                        zzfh zzfh = new zzfh(string3, j3, a, string2);
                        boolean z2 = z;
                        zzl zzl = r3;
                        zzl zzl2 = new zzl(string, string2, zzfh, j2, z2, string4, zzad, j, zzad2, j4, zzad3);
                        arrayList.add(zzl);
                    } while (query.moveToNext());
                    if (query != null) {
                        query.close();
                    }
                    return arrayList;
                }
                if (query != null) {
                    query.close();
                }
                return arrayList;
            } catch (SQLiteException e2) {
                e = e2;
                cursor = query;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (SQLiteException e3) {
            e = e3;
            try {
                mo3172r().v_().m12355a("Error querying conditional user property value", e);
                arrayList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return arrayList;
            } catch (Throwable th3) {
                th = th3;
                query = cursor;
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final cp m29425b(String str) {
        Cursor query;
        Object e;
        Throwable th;
        ct ctVar;
        String str2 = str;
        Preconditions.checkNotEmpty(str);
        mo4395d();
        m28438k();
        try {
            boolean z = true;
            query = m29442y().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "ssaid_reporting_enabled", "admob_app_id"}, "app_id=?", new String[]{str2}, null, null, null);
            try {
                if (query.moveToFirst()) {
                    try {
                        boolean z2;
                        cp cpVar = new cp(this.a.m22814o(), str2);
                        cpVar.m12252a(query.getString(0));
                        cpVar.m12256b(query.getString(1));
                        cpVar.m12264d(query.getString(2));
                        cpVar.m12269f(query.getLong(3));
                        cpVar.m12251a(query.getLong(4));
                        cpVar.m12255b(query.getLong(5));
                        cpVar.m12270f(query.getString(6));
                        cpVar.m12273g(query.getString(7));
                        cpVar.m12263d(query.getLong(8));
                        cpVar.m12266e(query.getLong(9));
                        if (!query.isNull(10)) {
                            if (query.getInt(10) == 0) {
                                z2 = false;
                                cpVar.m12253a(z2);
                                cpVar.m12278i(query.getLong(11));
                                cpVar.m12280j(query.getLong(12));
                                cpVar.m12282k(query.getLong(13));
                                cpVar.m12284l(query.getLong(14));
                                cpVar.m12272g(query.getLong(15));
                                cpVar.m12275h(query.getLong(16));
                                cpVar.m12259c(query.isNull(17) ? -2147483648L : (long) query.getInt(17));
                                cpVar.m12267e(query.getString(18));
                                cpVar.m12288n(query.getLong(19));
                                cpVar.m12286m(query.getLong(20));
                                cpVar.m12276h(query.getString(21));
                                cpVar.m12289o(query.isNull(22) ? 0 : query.getLong(22));
                                if (!query.isNull(23)) {
                                    if (query.getInt(23) != 0) {
                                        z2 = false;
                                        cpVar.m12257b(z2);
                                        if (!query.isNull(24)) {
                                            if (query.getInt(24) == 0) {
                                                z = false;
                                            }
                                        }
                                        cpVar.m12261c(z);
                                        cpVar.m12260c(query.getString(25));
                                        cpVar.m12250a();
                                        if (query.moveToNext()) {
                                            mo3172r().v_().m12355a("Got multiple records for app, expected one. appId", zzap.m28525a(str));
                                        }
                                        if (query != null) {
                                            query.close();
                                        }
                                        return cpVar;
                                    }
                                }
                                z2 = true;
                                cpVar.m12257b(z2);
                                if (query.isNull(24)) {
                                    if (query.getInt(24) == 0) {
                                        z = false;
                                    }
                                }
                                cpVar.m12261c(z);
                                cpVar.m12260c(query.getString(25));
                                cpVar.m12250a();
                                if (query.moveToNext()) {
                                    mo3172r().v_().m12355a("Got multiple records for app, expected one. appId", zzap.m28525a(str));
                                }
                                if (query != null) {
                                    query.close();
                                }
                                return cpVar;
                            }
                        }
                        z2 = true;
                        cpVar.m12253a(z2);
                        cpVar.m12278i(query.getLong(11));
                        cpVar.m12280j(query.getLong(12));
                        cpVar.m12282k(query.getLong(13));
                        cpVar.m12284l(query.getLong(14));
                        cpVar.m12272g(query.getLong(15));
                        cpVar.m12275h(query.getLong(16));
                        if (query.isNull(17)) {
                        }
                        cpVar.m12259c(query.isNull(17) ? -2147483648L : (long) query.getInt(17));
                        cpVar.m12267e(query.getString(18));
                        cpVar.m12288n(query.getLong(19));
                        cpVar.m12286m(query.getLong(20));
                        cpVar.m12276h(query.getString(21));
                        if (query.isNull(22)) {
                        }
                        cpVar.m12289o(query.isNull(22) ? 0 : query.getLong(22));
                        if (query.isNull(23)) {
                            if (query.getInt(23) != 0) {
                                z2 = false;
                                cpVar.m12257b(z2);
                                if (query.isNull(24)) {
                                    if (query.getInt(24) == 0) {
                                        z = false;
                                    }
                                }
                                cpVar.m12261c(z);
                                cpVar.m12260c(query.getString(25));
                                cpVar.m12250a();
                                if (query.moveToNext()) {
                                    mo3172r().v_().m12355a("Got multiple records for app, expected one. appId", zzap.m28525a(str));
                                }
                                if (query != null) {
                                    query.close();
                                }
                                return cpVar;
                            }
                        }
                        z2 = true;
                        cpVar.m12257b(z2);
                        if (query.isNull(24)) {
                            if (query.getInt(24) == 0) {
                                z = false;
                            }
                        }
                        cpVar.m12261c(z);
                        cpVar.m12260c(query.getString(25));
                        cpVar.m12250a();
                        if (query.moveToNext()) {
                            mo3172r().v_().m12355a("Got multiple records for app, expected one. appId", zzap.m28525a(str));
                        }
                        if (query != null) {
                            query.close();
                        }
                        return cpVar;
                    } catch (SQLiteException e2) {
                        e = e2;
                        try {
                            mo3172r().v_().m12356a("Error querying app. appId", zzap.m28525a(str), e);
                            if (query != null) {
                                query.close();
                            }
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (query != null) {
                                query.close();
                            }
                            throw th;
                        }
                    }
                }
                if (query != null) {
                    query.close();
                }
                return null;
            } catch (SQLiteException e3) {
                e = e3;
                ctVar = this;
                mo3172r().v_().m12356a("Error querying app. appId", zzap.m28525a(str), e);
                if (query != null) {
                    query.close();
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
                ctVar = this;
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        } catch (SQLiteException e4) {
            e = e4;
            ctVar = this;
            query = null;
            mo3172r().v_().m12356a("Error querying app. appId", zzap.m28525a(str), e);
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            ctVar = this;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final void m29416a(cp cpVar) {
        Preconditions.checkNotNull(cpVar);
        mo4395d();
        m28438k();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", cpVar.m12254b());
        contentValues.put("app_instance_id", cpVar.m12258c());
        contentValues.put("gmp_app_id", cpVar.m12262d());
        contentValues.put("resettable_device_id_hash", cpVar.m12268f());
        contentValues.put("last_bundle_index", Long.valueOf(cpVar.m12291p()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(cpVar.m12274h()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(cpVar.m12277i()));
        contentValues.put("app_version", cpVar.m12279j());
        contentValues.put("app_store", cpVar.m12283l());
        contentValues.put("gmp_version", Long.valueOf(cpVar.m12285m()));
        contentValues.put("dev_cert_hash", Long.valueOf(cpVar.m12287n()));
        contentValues.put("measurement_enabled", Boolean.valueOf(cpVar.m12290o()));
        contentValues.put("day", Long.valueOf(cpVar.m12295t()));
        contentValues.put("daily_public_events_count", Long.valueOf(cpVar.m12296u()));
        contentValues.put("daily_events_count", Long.valueOf(cpVar.m12297v()));
        contentValues.put("daily_conversions_count", Long.valueOf(cpVar.m12298w()));
        contentValues.put("config_fetched_time", Long.valueOf(cpVar.m12292q()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(cpVar.m12293r()));
        contentValues.put("app_version_int", Long.valueOf(cpVar.m12281k()));
        contentValues.put("firebase_instance_id", cpVar.m12271g());
        contentValues.put("daily_error_events_count", Long.valueOf(cpVar.m12300y()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(cpVar.m12299x()));
        contentValues.put("health_monitor_sample", cpVar.m12301z());
        contentValues.put("android_id", Long.valueOf(cpVar.m12247B()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(cpVar.m12248C()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(cpVar.m12249D()));
        contentValues.put("admob_app_id", cpVar.m12265e());
        try {
            SQLiteDatabase y = m29442y();
            if (((long) y.update("apps", contentValues, "app_id = ?", new String[]{cpVar.m12254b()})) == 0 && y.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                mo3172r().v_().m12355a("Failed to insert/update app (got -1). appId", zzap.m28525a(cpVar.m12254b()));
            }
        } catch (SQLiteException e) {
            mo3172r().v_().m12356a("Error storing app. appId", zzap.m28525a(cpVar.m12254b()), e);
        }
    }

    /* renamed from: c */
    public final long m29428c(String str) {
        Preconditions.checkNotEmpty(str);
        mo4395d();
        m28438k();
        try {
            SQLiteDatabase y = m29442y();
            String valueOf = String.valueOf(Math.max(0, Math.min(1000000, mo4400t().m27340b(str, zzaf.f10735x))));
            return (long) y.delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, valueOf});
        } catch (SQLiteException e) {
            mo3172r().v_().m12356a("Error deleting over the limit events. appId", zzap.m28525a(str), e);
            return 0;
        }
    }

    /* renamed from: a */
    public final zzr m29410a(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Object e;
        Throwable th;
        Preconditions.checkNotEmpty(str);
        mo4395d();
        m28438k();
        String[] strArr = new String[]{str};
        zzr zzr = new zzr();
        Cursor cursor = null;
        try {
            SQLiteDatabase y = m29442y();
            SQLiteDatabase sQLiteDatabase = y;
            Cursor query = sQLiteDatabase.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                if (query.moveToFirst()) {
                    if (query.getLong(0) == j) {
                        zzr.f10787b = query.getLong(1);
                        zzr.f10786a = query.getLong(2);
                        zzr.f10788c = query.getLong(3);
                        zzr.f10789d = query.getLong(4);
                        zzr.f10790e = query.getLong(5);
                    }
                    if (z) {
                        zzr.f10787b++;
                    }
                    if (z2) {
                        zzr.f10786a++;
                    }
                    if (z3) {
                        zzr.f10788c++;
                    }
                    if (z4) {
                        zzr.f10789d++;
                    }
                    if (z5) {
                        zzr.f10790e++;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j));
                    contentValues.put("daily_public_events_count", Long.valueOf(zzr.f10786a));
                    contentValues.put("daily_events_count", Long.valueOf(zzr.f10787b));
                    contentValues.put("daily_conversions_count", Long.valueOf(zzr.f10788c));
                    contentValues.put("daily_error_events_count", Long.valueOf(zzr.f10789d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(zzr.f10790e));
                    y.update("apps", contentValues, "app_id=?", strArr);
                    if (query != null) {
                        query.close();
                    }
                    return zzr;
                }
                mo3172r().m28540i().m12355a("Not updating daily counts, app is not known. appId", zzap.m28525a(str));
                if (query != null) {
                    query.close();
                }
                return zzr;
            } catch (SQLiteException e2) {
                e = e2;
                cursor = query;
                try {
                    mo3172r().v_().m12356a("Error updating daily counts. appId", zzap.m28525a(str), e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return zzr;
                } catch (Throwable th2) {
                    th = th2;
                    query = cursor;
                    if (query != null) {
                        query.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            mo3172r().v_().m12356a("Error updating daily counts. appId", zzap.m28525a(str), e);
            if (cursor != null) {
                cursor.close();
            }
            return zzr;
        }
    }

    /* renamed from: d */
    public final byte[] m29431d(String str) {
        Cursor query;
        Object e;
        Preconditions.checkNotEmpty(str);
        mo4395d();
        m28438k();
        try {
            query = m29442y().query("apps", new String[]{"remote_config"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                if (query.moveToFirst()) {
                    byte[] blob = query.getBlob(0);
                    if (query.moveToNext()) {
                        mo3172r().v_().m12355a("Got multiple records for app config, expected one. appId", zzap.m28525a(str));
                    }
                    if (query != null) {
                        query.close();
                    }
                    return blob;
                }
                if (query != null) {
                    query.close();
                }
                return null;
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    mo3172r().v_().m12356a("Error querying remote config. appId", zzap.m28525a(str), e);
                    if (query != null) {
                        query.close();
                    }
                    return null;
                } catch (Throwable th) {
                    str = th;
                    if (query != null) {
                        query.close();
                    }
                    throw str;
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            query = null;
            mo3172r().v_().m12356a("Error querying remote config. appId", zzap.m28525a(str), e);
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th2) {
            str = th2;
            query = null;
            if (query != null) {
                query.close();
            }
            throw str;
        }
    }

    /* renamed from: a */
    public final boolean m29420a(zzgi zzgi, boolean z) {
        mo4395d();
        m28438k();
        Preconditions.checkNotNull(zzgi);
        Preconditions.checkNotEmpty(zzgi.f20627o);
        Preconditions.checkNotNull(zzgi.f20618f);
        m29401B();
        long currentTimeMillis = mo3169m().currentTimeMillis();
        if (zzgi.f20618f.longValue() < currentTimeMillis - zzn.m27330j() || zzgi.f20618f.longValue() > zzn.m27330j() + currentTimeMillis) {
            mo3172r().m28540i().m12357a("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzap.m28525a(zzgi.f20627o), Long.valueOf(currentTimeMillis), zzgi.f20618f);
        }
        try {
            byte[] bArr = new byte[zzgi.m12203e()];
            zzyy a = zzyy.m12153a(bArr, 0, bArr.length);
            zzgi.mo3160a(a);
            a.m12164a();
            bArr = mo4964g().m29787b(bArr);
            mo3172r().m28555x().m12355a("Saving bundle, size", Integer.valueOf(bArr.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzgi.f20627o);
            contentValues.put("bundle_end_timestamp", zzgi.f20618f);
            contentValues.put("data", bArr);
            contentValues.put("has_realtime", Integer.valueOf(z));
            if (zzgi.f20607H) {
                contentValues.put("retry_count", zzgi.f20607H);
            }
            try {
                if (m29442y().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                mo3172r().v_().m12355a("Failed to insert bundle (got -1). appId", zzap.m28525a(zzgi.f20627o));
                return false;
            } catch (boolean z2) {
                mo3172r().v_().m12356a("Error storing bundle. appId", zzap.m28525a(zzgi.f20627o), z2);
                return false;
            }
        } catch (boolean z22) {
            mo3172r().v_().m12356a("Data loss. Failed to serialize bundle. appId", zzap.m28525a(zzgi.f20627o), z22);
            return false;
        }
    }

    /* renamed from: z */
    public final String m29443z() {
        Object e;
        Throwable th;
        Cursor rawQuery;
        try {
            rawQuery = m29442y().rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
            try {
                if (rawQuery.moveToFirst()) {
                    String string = rawQuery.getString(0);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return string;
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return null;
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    mo3172r().v_().m12355a("Database error getting next bundle app id", e);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            rawQuery = null;
            mo3172r().v_().m12355a("Database error getting next bundle app id", e);
            if (rawQuery != null) {
                rawQuery.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            rawQuery = null;
            if (rawQuery != null) {
                rawQuery.close();
            }
            throw th;
        }
    }

    /* renamed from: A */
    public final boolean m29400A() {
        return m29399b("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    /* renamed from: a */
    public final List<Pair<zzgi, Long>> m29413a(String str, int i, int i2) {
        mo4395d();
        m28438k();
        Preconditions.checkArgument(i > 0);
        Preconditions.checkArgument(i2 > 0);
        Preconditions.checkNotEmpty(str);
        Cursor cursor = null;
        try {
            i = m29442y().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i));
            try {
                if (i.moveToFirst()) {
                    List<Pair<zzgi, Long>> arrayList = new ArrayList();
                    int i3 = 0;
                    do {
                        long j = i.getLong(0);
                        try {
                            byte[] a = mo4964g().m29784a(i.getBlob(1));
                            if (!arrayList.isEmpty() && a.length + i3 > i2) {
                                break;
                            }
                            zzyx a2 = zzyx.m12125a(a, 0, a.length);
                            zzzg zzgi = new zzgi();
                            try {
                                zzgi.mo4347a(a2);
                                if (!i.isNull(2)) {
                                    zzgi.f20607H = Integer.valueOf(i.getInt(2));
                                }
                                i3 += a.length;
                                arrayList.add(Pair.create(zzgi, Long.valueOf(j)));
                            } catch (IOException e) {
                                mo3172r().v_().m12356a("Failed to merge queued bundle. appId", zzap.m28525a(str), e);
                            }
                            if (!i.moveToNext()) {
                                break;
                            }
                        } catch (IOException e2) {
                            mo3172r().v_().m12356a("Failed to unzip queued bundle. appId", zzap.m28525a(str), e2);
                        }
                    } while (i3 <= i2);
                    if (i != 0) {
                        i.close();
                    }
                    return arrayList;
                }
                i2 = Collections.emptyList();
                if (i != 0) {
                    i.close();
                }
                return i2;
            } catch (SQLiteException e3) {
                i2 = e3;
                cursor = i;
            } catch (Throwable th) {
                str = th;
            }
        } catch (SQLiteException e4) {
            i2 = e4;
            try {
                mo3172r().v_().m12356a("Error querying bundles. appId", zzap.m28525a(str), i2);
                str = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return str;
            } catch (Throwable th2) {
                str = th2;
                i = cursor;
                if (i != 0) {
                    i.close();
                }
                throw str;
            }
        }
    }

    /* renamed from: B */
    final void m29401B() {
        mo4395d();
        m28438k();
        if (m29391N()) {
            long a = mo4399s().f21386f.m12360a();
            long elapsedRealtime = mo3169m().elapsedRealtime();
            if (Math.abs(elapsedRealtime - a) > ((Long) zzaf.f10692G.m12332b()).longValue()) {
                mo4399s().f21386f.m12361a(elapsedRealtime);
                mo4395d();
                m28438k();
                if (m29391N()) {
                    int delete = m29442y().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(mo3169m().currentTimeMillis()), String.valueOf(zzn.m27330j())});
                    if (delete > 0) {
                        mo3172r().m28555x().m12355a("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    @VisibleForTesting
    /* renamed from: a */
    final void m29419a(List<Long> list) {
        mo4395d();
        m28438k();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (m29391N()) {
            list = TextUtils.join(",", list);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(list).length() + 2);
            stringBuilder.append("(");
            stringBuilder.append(list);
            stringBuilder.append(")");
            list = stringBuilder.toString();
            stringBuilder = new StringBuilder(String.valueOf(list).length() + 80);
            stringBuilder.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            stringBuilder.append(list);
            stringBuilder.append(" AND retry_count =  2147483647 LIMIT 1");
            if (m29399b(stringBuilder.toString(), null) > 0) {
                mo3172r().m28540i().m12354a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase y = m29442y();
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(list).length() + 127);
                stringBuilder2.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                stringBuilder2.append(list);
                stringBuilder2.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                y.execSQL(stringBuilder2.toString());
            } catch (List<Long> list2) {
                mo3172r().v_().m12355a("Error incrementing retry count. error", list2);
            }
        }
    }

    /* renamed from: a */
    final void m29418a(String str, zzfu[] zzfuArr) {
        m28438k();
        mo4395d();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzfuArr);
        SQLiteDatabase y = m29442y();
        y.beginTransaction();
        try {
            m28438k();
            mo4395d();
            Preconditions.checkNotEmpty(str);
            SQLiteDatabase y2 = m29442y();
            String[] strArr = new String[1];
            int i = 0;
            strArr[0] = str;
            y2.delete("property_filters", "app_id=?", strArr);
            y2.delete("event_filters", "app_id=?", new String[]{str});
            for (zzfu zzfu : zzfuArr) {
                m28438k();
                mo4395d();
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotNull(zzfu);
                Preconditions.checkNotNull(zzfu.f20532c);
                Preconditions.checkNotNull(zzfu.f20531b);
                if (zzfu.f20530a == null) {
                    mo3172r().m28540i().m12355a("Audience with no ID. appId", zzap.m28525a(str));
                } else {
                    Object obj;
                    int intValue = zzfu.f20530a.intValue();
                    for (zzfv zzfv : zzfu.f20532c) {
                        if (zzfv.f20536a == null) {
                            mo3172r().m28540i().m12356a("Event filter with no ID. Audience definition ignored. appId, audienceId", zzap.m28525a(str), zzfu.f20530a);
                            break;
                        }
                    }
                    for (zzfy zzfy : zzfu.f20531b) {
                        if (zzfy.f20554a == null) {
                            mo3172r().m28540i().m12356a("Property filter with no ID. Audience definition ignored. appId, audienceId", zzap.m28525a(str), zzfu.f20530a);
                            break;
                        }
                    }
                    for (zzfv zzfv2 : zzfu.f20532c) {
                        if (!m29396a(str, intValue, zzfv2)) {
                            obj = null;
                            break;
                        }
                    }
                    obj = 1;
                    if (obj != null) {
                        for (zzfy zzfy2 : zzfu.f20531b) {
                            if (!m29397a(str, intValue, zzfy2)) {
                                obj = null;
                                break;
                            }
                        }
                    }
                    if (obj == null) {
                        m28438k();
                        mo4395d();
                        Preconditions.checkNotEmpty(str);
                        SQLiteDatabase y3 = m29442y();
                        y3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(intValue)});
                        y3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(intValue)});
                    }
                }
            }
            List arrayList = new ArrayList();
            int length = zzfuArr.length;
            while (i < length) {
                arrayList.add(zzfuArr[i].f20530a);
                i++;
            }
            m29398a(str, arrayList);
            y.setTransactionSuccessful();
        } finally {
            y.endTransaction();
        }
    }

    /* renamed from: a */
    private final boolean m29396a(String str, int i, zzfv zzfv) {
        m28438k();
        mo4395d();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzfv);
        if (TextUtils.isEmpty(zzfv.f20537b)) {
            mo3172r().m28540i().m12357a("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", zzap.m28525a(str), Integer.valueOf(i), String.valueOf(zzfv.f20536a));
            return false;
        }
        try {
            byte[] bArr = new byte[zzfv.m12203e()];
            zzyy a = zzyy.m12153a(bArr, 0, bArr.length);
            zzfv.mo3160a(a);
            a.m12164a();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i));
            contentValues.put("filter_id", zzfv.f20536a);
            contentValues.put("event_name", zzfv.f20537b);
            contentValues.put("data", bArr);
            try {
                if (m29442y().insertWithOnConflict("event_filters", null, contentValues, 5) == -1) {
                    mo3172r().v_().m12355a("Failed to insert event filter (got -1). appId", zzap.m28525a(str));
                }
                return true;
            } catch (int i2) {
                mo3172r().v_().m12356a("Error storing event filter. appId", zzap.m28525a(str), i2);
                return false;
            }
        } catch (int i22) {
            mo3172r().v_().m12356a("Configuration loss. Failed to serialize event filter. appId", zzap.m28525a(str), i22);
            return false;
        }
    }

    /* renamed from: a */
    private final boolean m29397a(String str, int i, zzfy zzfy) {
        m28438k();
        mo4395d();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzfy);
        if (TextUtils.isEmpty(zzfy.f20555b)) {
            mo3172r().m28540i().m12357a("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", zzap.m28525a(str), Integer.valueOf(i), String.valueOf(zzfy.f20554a));
            return false;
        }
        try {
            byte[] bArr = new byte[zzfy.m12203e()];
            zzyy a = zzyy.m12153a(bArr, 0, bArr.length);
            zzfy.mo3160a(a);
            a.m12164a();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i));
            contentValues.put("filter_id", zzfy.f20554a);
            contentValues.put("property_name", zzfy.f20555b);
            contentValues.put("data", bArr);
            try {
                if (m29442y().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                    return true;
                }
                mo3172r().v_().m12355a("Failed to insert property filter (got -1). appId", zzap.m28525a(str));
                return false;
            } catch (int i2) {
                mo3172r().v_().m12356a("Error storing property filter. appId", zzap.m28525a(str), i2);
                return false;
            }
        } catch (int i22) {
            mo3172r().v_().m12356a("Configuration loss. Failed to serialize property filter. appId", zzap.m28525a(str), i22);
            return false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: f */
    final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.zzfv>> m29436f(java.lang.String r13, java.lang.String r14) {
        /*
        r12 = this;
        r12.m28438k();
        r12.mo4395d();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r13);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r14);
        r0 = new android.support.v4.f.a;
        r0.<init>();
        r1 = r12.m29442y();
        r9 = 0;
        r2 = "event_filters";
        r3 = "audience_id";
        r4 = "data";
        r3 = new java.lang.String[]{r3, r4};	 Catch:{ SQLiteException -> 0x0096, all -> 0x0093 }
        r4 = "app_id=? AND event_name=?";
        r5 = 2;
        r5 = new java.lang.String[r5];	 Catch:{ SQLiteException -> 0x0096, all -> 0x0093 }
        r10 = 0;
        r5[r10] = r13;	 Catch:{ SQLiteException -> 0x0096, all -> 0x0093 }
        r11 = 1;
        r5[r11] = r14;	 Catch:{ SQLiteException -> 0x0096, all -> 0x0093 }
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r14 = r1.query(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ SQLiteException -> 0x0096, all -> 0x0093 }
        r1 = r14.moveToFirst();	 Catch:{ SQLiteException -> 0x0091 }
        if (r1 != 0) goto L_0x0042;
    L_0x0038:
        r0 = java.util.Collections.emptyMap();	 Catch:{ SQLiteException -> 0x0091 }
        if (r14 == 0) goto L_0x0041;
    L_0x003e:
        r14.close();
    L_0x0041:
        return r0;
    L_0x0042:
        r1 = r14.getBlob(r11);	 Catch:{ SQLiteException -> 0x0091 }
        r2 = r1.length;	 Catch:{ SQLiteException -> 0x0091 }
        r1 = com.google.android.gms.internal.measurement.zzyx.m12125a(r1, r10, r2);	 Catch:{ SQLiteException -> 0x0091 }
        r2 = new com.google.android.gms.internal.measurement.zzfv;	 Catch:{ SQLiteException -> 0x0091 }
        r2.<init>();	 Catch:{ SQLiteException -> 0x0091 }
        r2.mo4347a(r1);	 Catch:{ IOException -> 0x0073 }
        r1 = r14.getInt(r10);	 Catch:{ SQLiteException -> 0x0091 }
        r3 = java.lang.Integer.valueOf(r1);	 Catch:{ SQLiteException -> 0x0091 }
        r3 = r0.get(r3);	 Catch:{ SQLiteException -> 0x0091 }
        r3 = (java.util.List) r3;	 Catch:{ SQLiteException -> 0x0091 }
        if (r3 != 0) goto L_0x006f;
    L_0x0063:
        r3 = new java.util.ArrayList;	 Catch:{ SQLiteException -> 0x0091 }
        r3.<init>();	 Catch:{ SQLiteException -> 0x0091 }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ SQLiteException -> 0x0091 }
        r0.put(r1, r3);	 Catch:{ SQLiteException -> 0x0091 }
    L_0x006f:
        r3.add(r2);	 Catch:{ SQLiteException -> 0x0091 }
        goto L_0x0085;
    L_0x0073:
        r1 = move-exception;
        r2 = r12.mo3172r();	 Catch:{ SQLiteException -> 0x0091 }
        r2 = r2.v_();	 Catch:{ SQLiteException -> 0x0091 }
        r3 = "Failed to merge filter. appId";
        r4 = com.google.android.gms.measurement.internal.zzap.m28525a(r13);	 Catch:{ SQLiteException -> 0x0091 }
        r2.m12356a(r3, r4, r1);	 Catch:{ SQLiteException -> 0x0091 }
    L_0x0085:
        r1 = r14.moveToNext();	 Catch:{ SQLiteException -> 0x0091 }
        if (r1 != 0) goto L_0x0042;
    L_0x008b:
        if (r14 == 0) goto L_0x0090;
    L_0x008d:
        r14.close();
    L_0x0090:
        return r0;
    L_0x0091:
        r0 = move-exception;
        goto L_0x0098;
    L_0x0093:
        r13 = move-exception;
        r14 = r9;
        goto L_0x00b0;
    L_0x0096:
        r0 = move-exception;
        r14 = r9;
    L_0x0098:
        r1 = r12.mo3172r();	 Catch:{ all -> 0x00af }
        r1 = r1.v_();	 Catch:{ all -> 0x00af }
        r2 = "Database error querying filters. appId";
        r13 = com.google.android.gms.measurement.internal.zzap.m28525a(r13);	 Catch:{ all -> 0x00af }
        r1.m12356a(r2, r13, r0);	 Catch:{ all -> 0x00af }
        if (r14 == 0) goto L_0x00ae;
    L_0x00ab:
        r14.close();
    L_0x00ae:
        return r9;
    L_0x00af:
        r13 = move-exception;
    L_0x00b0:
        if (r14 == 0) goto L_0x00b5;
    L_0x00b2:
        r14.close();
    L_0x00b5:
        throw r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ct.f(java.lang.String, java.lang.String):java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.zzfv>>");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: g */
    final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.zzfy>> m29438g(java.lang.String r13, java.lang.String r14) {
        /*
        r12 = this;
        r12.m28438k();
        r12.mo4395d();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r13);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r14);
        r0 = new android.support.v4.f.a;
        r0.<init>();
        r1 = r12.m29442y();
        r9 = 0;
        r2 = "property_filters";
        r3 = "audience_id";
        r4 = "data";
        r3 = new java.lang.String[]{r3, r4};	 Catch:{ SQLiteException -> 0x0096, all -> 0x0093 }
        r4 = "app_id=? AND property_name=?";
        r5 = 2;
        r5 = new java.lang.String[r5];	 Catch:{ SQLiteException -> 0x0096, all -> 0x0093 }
        r10 = 0;
        r5[r10] = r13;	 Catch:{ SQLiteException -> 0x0096, all -> 0x0093 }
        r11 = 1;
        r5[r11] = r14;	 Catch:{ SQLiteException -> 0x0096, all -> 0x0093 }
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r14 = r1.query(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ SQLiteException -> 0x0096, all -> 0x0093 }
        r1 = r14.moveToFirst();	 Catch:{ SQLiteException -> 0x0091 }
        if (r1 != 0) goto L_0x0042;
    L_0x0038:
        r0 = java.util.Collections.emptyMap();	 Catch:{ SQLiteException -> 0x0091 }
        if (r14 == 0) goto L_0x0041;
    L_0x003e:
        r14.close();
    L_0x0041:
        return r0;
    L_0x0042:
        r1 = r14.getBlob(r11);	 Catch:{ SQLiteException -> 0x0091 }
        r2 = r1.length;	 Catch:{ SQLiteException -> 0x0091 }
        r1 = com.google.android.gms.internal.measurement.zzyx.m12125a(r1, r10, r2);	 Catch:{ SQLiteException -> 0x0091 }
        r2 = new com.google.android.gms.internal.measurement.zzfy;	 Catch:{ SQLiteException -> 0x0091 }
        r2.<init>();	 Catch:{ SQLiteException -> 0x0091 }
        r2.mo4347a(r1);	 Catch:{ IOException -> 0x0073 }
        r1 = r14.getInt(r10);	 Catch:{ SQLiteException -> 0x0091 }
        r3 = java.lang.Integer.valueOf(r1);	 Catch:{ SQLiteException -> 0x0091 }
        r3 = r0.get(r3);	 Catch:{ SQLiteException -> 0x0091 }
        r3 = (java.util.List) r3;	 Catch:{ SQLiteException -> 0x0091 }
        if (r3 != 0) goto L_0x006f;
    L_0x0063:
        r3 = new java.util.ArrayList;	 Catch:{ SQLiteException -> 0x0091 }
        r3.<init>();	 Catch:{ SQLiteException -> 0x0091 }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ SQLiteException -> 0x0091 }
        r0.put(r1, r3);	 Catch:{ SQLiteException -> 0x0091 }
    L_0x006f:
        r3.add(r2);	 Catch:{ SQLiteException -> 0x0091 }
        goto L_0x0085;
    L_0x0073:
        r1 = move-exception;
        r2 = r12.mo3172r();	 Catch:{ SQLiteException -> 0x0091 }
        r2 = r2.v_();	 Catch:{ SQLiteException -> 0x0091 }
        r3 = "Failed to merge filter";
        r4 = com.google.android.gms.measurement.internal.zzap.m28525a(r13);	 Catch:{ SQLiteException -> 0x0091 }
        r2.m12356a(r3, r4, r1);	 Catch:{ SQLiteException -> 0x0091 }
    L_0x0085:
        r1 = r14.moveToNext();	 Catch:{ SQLiteException -> 0x0091 }
        if (r1 != 0) goto L_0x0042;
    L_0x008b:
        if (r14 == 0) goto L_0x0090;
    L_0x008d:
        r14.close();
    L_0x0090:
        return r0;
    L_0x0091:
        r0 = move-exception;
        goto L_0x0098;
    L_0x0093:
        r13 = move-exception;
        r14 = r9;
        goto L_0x00b0;
    L_0x0096:
        r0 = move-exception;
        r14 = r9;
    L_0x0098:
        r1 = r12.mo3172r();	 Catch:{ all -> 0x00af }
        r1 = r1.v_();	 Catch:{ all -> 0x00af }
        r2 = "Database error querying filters. appId";
        r13 = com.google.android.gms.measurement.internal.zzap.m28525a(r13);	 Catch:{ all -> 0x00af }
        r1.m12356a(r2, r13, r0);	 Catch:{ all -> 0x00af }
        if (r14 == 0) goto L_0x00ae;
    L_0x00ab:
        r14.close();
    L_0x00ae:
        return r9;
    L_0x00af:
        r13 = move-exception;
    L_0x00b0:
        if (r14 == 0) goto L_0x00b5;
    L_0x00b2:
        r14.close();
    L_0x00b5:
        throw r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ct.g(java.lang.String, java.lang.String):java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.zzfy>>");
    }

    /* renamed from: a */
    private final boolean m29398a(String str, List<Integer> list) {
        Preconditions.checkNotEmpty(str);
        m28438k();
        mo4395d();
        SQLiteDatabase y = m29442y();
        try {
            if (m29399b("select count(1) from audience_filter_values where app_id=?", new String[]{str}) <= ((long) Math.max(0, Math.min(2000, mo4400t().m27340b(str, zzaf.f10699N))))) {
                return false;
            }
            Iterable arrayList = new ArrayList();
            int i = 0;
            while (i < list.size()) {
                Integer num = (Integer) list.get(i);
                if (num != null) {
                    if (num instanceof Integer) {
                        arrayList.add(Integer.toString(num.intValue()));
                        i++;
                    }
                }
                return false;
            }
            list = TextUtils.join(",", arrayList);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(list).length() + 2);
            stringBuilder.append("(");
            stringBuilder.append(list);
            stringBuilder.append(")");
            list = stringBuilder.toString();
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(list).length() + 140);
            stringBuilder2.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            stringBuilder2.append(list);
            stringBuilder2.append(" order by rowid desc limit -1 offset ?)");
            return y.delete("audience_filter_values", stringBuilder2.toString(), new String[]{str, Integer.toString(r2)}) > null;
        } catch (List<Integer> list2) {
            mo3172r().v_().m12356a("Database error querying filters. appId", zzap.m28525a(str), list2);
            return false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: e */
    final java.util.Map<java.lang.Integer, com.google.android.gms.internal.measurement.zzgj> m29433e(java.lang.String r12) {
        /*
        r11 = this;
        r11.m28438k();
        r11.mo4395d();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r12);
        r0 = r11.m29442y();
        r8 = 0;
        r1 = "audience_filter_values";
        r2 = "audience_id";
        r3 = "current_results";
        r2 = new java.lang.String[]{r2, r3};	 Catch:{ SQLiteException -> 0x007c, all -> 0x0079 }
        r3 = "app_id=?";
        r9 = 1;
        r4 = new java.lang.String[r9];	 Catch:{ SQLiteException -> 0x007c, all -> 0x0079 }
        r10 = 0;
        r4[r10] = r12;	 Catch:{ SQLiteException -> 0x007c, all -> 0x0079 }
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r0 = r0.query(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ SQLiteException -> 0x007c, all -> 0x0079 }
        r1 = r0.moveToFirst();	 Catch:{ SQLiteException -> 0x0077 }
        if (r1 != 0) goto L_0x0033;
    L_0x002d:
        if (r0 == 0) goto L_0x0032;
    L_0x002f:
        r0.close();
    L_0x0032:
        return r8;
    L_0x0033:
        r1 = new android.support.v4.f.a;	 Catch:{ SQLiteException -> 0x0077 }
        r1.<init>();	 Catch:{ SQLiteException -> 0x0077 }
    L_0x0038:
        r2 = r0.getInt(r10);	 Catch:{ SQLiteException -> 0x0077 }
        r3 = r0.getBlob(r9);	 Catch:{ SQLiteException -> 0x0077 }
        r4 = r3.length;	 Catch:{ SQLiteException -> 0x0077 }
        r3 = com.google.android.gms.internal.measurement.zzyx.m12125a(r3, r10, r4);	 Catch:{ SQLiteException -> 0x0077 }
        r4 = new com.google.android.gms.internal.measurement.zzgj;	 Catch:{ SQLiteException -> 0x0077 }
        r4.<init>();	 Catch:{ SQLiteException -> 0x0077 }
        r4.mo4347a(r3);	 Catch:{ IOException -> 0x0055 }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ SQLiteException -> 0x0077 }
        r1.put(r2, r4);	 Catch:{ SQLiteException -> 0x0077 }
        goto L_0x006b;
    L_0x0055:
        r3 = move-exception;
        r4 = r11.mo3172r();	 Catch:{ SQLiteException -> 0x0077 }
        r4 = r4.v_();	 Catch:{ SQLiteException -> 0x0077 }
        r5 = "Failed to merge filter results. appId, audienceId, error";
        r6 = com.google.android.gms.measurement.internal.zzap.m28525a(r12);	 Catch:{ SQLiteException -> 0x0077 }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ SQLiteException -> 0x0077 }
        r4.m12357a(r5, r6, r2, r3);	 Catch:{ SQLiteException -> 0x0077 }
    L_0x006b:
        r2 = r0.moveToNext();	 Catch:{ SQLiteException -> 0x0077 }
        if (r2 != 0) goto L_0x0038;
    L_0x0071:
        if (r0 == 0) goto L_0x0076;
    L_0x0073:
        r0.close();
    L_0x0076:
        return r1;
    L_0x0077:
        r1 = move-exception;
        goto L_0x007e;
    L_0x0079:
        r12 = move-exception;
        r0 = r8;
        goto L_0x0096;
    L_0x007c:
        r1 = move-exception;
        r0 = r8;
    L_0x007e:
        r2 = r11.mo3172r();	 Catch:{ all -> 0x0095 }
        r2 = r2.v_();	 Catch:{ all -> 0x0095 }
        r3 = "Database error querying filter results. appId";
        r12 = com.google.android.gms.measurement.internal.zzap.m28525a(r12);	 Catch:{ all -> 0x0095 }
        r2.m12356a(r3, r12, r1);	 Catch:{ all -> 0x0095 }
        if (r0 == 0) goto L_0x0094;
    L_0x0091:
        r0.close();
    L_0x0094:
        return r8;
    L_0x0095:
        r12 = move-exception;
    L_0x0096:
        if (r0 == 0) goto L_0x009b;
    L_0x0098:
        r0.close();
    L_0x009b:
        throw r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ct.e(java.lang.String):java.util.Map<java.lang.Integer, com.google.android.gms.internal.measurement.zzgj>");
    }

    /* renamed from: a */
    private static void m29395a(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    @VisibleForTesting
    /* renamed from: a */
    private final Object m29394a(Cursor cursor, int i) {
        int type = cursor.getType(i);
        switch (type) {
            case 0:
                mo3172r().v_().m12354a("Loaded invalid null value from database");
                return null;
            case 1:
                return Long.valueOf(cursor.getLong(i));
            case 2:
                return Double.valueOf(cursor.getDouble(i));
            case 3:
                return cursor.getString(i);
            case 4:
                mo3172r().v_().m12354a("Loaded invalid blob type value, ignoring it");
                return null;
            default:
                mo3172r().v_().m12355a("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
        }
    }

    /* renamed from: C */
    public final long m29402C() {
        return m29392a("select max(bundle_end_timestamp) from queue", null, 0);
    }

    @VisibleForTesting
    /* renamed from: h */
    protected final long m29439h(String str, String str2) {
        Object e;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        mo4395d();
        m28438k();
        SQLiteDatabase y = m29442y();
        y.beginTransaction();
        long a;
        try {
            ContentValues contentValues;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 32);
            stringBuilder.append("select ");
            stringBuilder.append(str2);
            stringBuilder.append(" from app2 where app_id=?");
            a = m29392a(stringBuilder.toString(), new String[]{str}, -1);
            if (a == -1) {
                contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("first_open_count", Integer.valueOf(0));
                contentValues.put("previous_install_count", Integer.valueOf(0));
                if (y.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                    mo3172r().v_().m12356a("Failed to insert column (got -1). appId", zzap.m28525a(str), str2);
                    y.endTransaction();
                    return -1;
                }
                a = 0;
            }
            try {
                contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put(str2, Long.valueOf(1 + a));
                if (((long) y.update("app2", contentValues, "app_id = ?", new String[]{str})) == 0) {
                    mo3172r().v_().m12356a("Failed to update column (got 0). appId", zzap.m28525a(str), str2);
                    y.endTransaction();
                    return -1;
                }
                y.setTransactionSuccessful();
                y.endTransaction();
                return a;
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    mo3172r().v_().m12357a("Error inserting column. appId", zzap.m28525a(str), str2, e);
                    return a;
                } finally {
                    y.endTransaction();
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            a = 0;
            mo3172r().v_().m12357a("Error inserting column. appId", zzap.m28525a(str), str2, e);
            return a;
        }
    }

    /* renamed from: D */
    public final long m29403D() {
        return m29392a("select max(timestamp) from raw_events", null, 0);
    }

    /* renamed from: a */
    public final long m29407a(zzgi zzgi) {
        mo4395d();
        m28438k();
        Preconditions.checkNotNull(zzgi);
        Preconditions.checkNotEmpty(zzgi.f20627o);
        try {
            long j;
            Object obj = new byte[zzgi.m12203e()];
            zzyy a = zzyy.m12153a(obj, 0, obj.length);
            zzgi.mo3160a(a);
            a.m12164a();
            an g = mo4964g();
            Preconditions.checkNotNull(obj);
            g.mo4398p().mo4395d();
            MessageDigest i = zzfk.m28609i();
            if (i == null) {
                g.mo3172r().v_().m12354a("Failed to get MD5");
                j = 0;
            } else {
                j = zzfk.m28587a(i.digest(obj));
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzgi.f20627o);
            contentValues.put("metadata_fingerprint", Long.valueOf(j));
            contentValues.put("metadata", obj);
            try {
                m29442y().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
                return j;
            } catch (SQLiteException e) {
                mo3172r().v_().m12356a("Error storing raw event metadata. appId", zzap.m28525a(zzgi.f20627o), e);
                throw e;
            }
        } catch (IOException e2) {
            mo3172r().v_().m12356a("Data loss. Failed to serialize event metadata. appId", zzap.m28525a(zzgi.f20627o), e2);
            throw e2;
        }
    }

    /* renamed from: E */
    public final boolean m29404E() {
        return m29399b("select count(1) > 0 from raw_events", null) != 0;
    }

    /* renamed from: F */
    public final boolean m29405F() {
        return m29399b("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    /* renamed from: f */
    public final long m29435f(String str) {
        Preconditions.checkNotEmpty(str);
        return m29392a("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    /* renamed from: a */
    public final String m29411a(long j) {
        Object e;
        Throwable th;
        mo4395d();
        m28438k();
        try {
            j = m29442y().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(j)});
            try {
                if (j.moveToFirst()) {
                    String string = j.getString(0);
                    if (j != null) {
                        j.close();
                    }
                    return string;
                }
                mo3172r().m28555x().m12354a("No expired configs for apps with pending events");
                if (j != null) {
                    j.close();
                }
                return null;
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    mo3172r().v_().m12355a("Error selecting expired configs", e);
                    if (j != null) {
                        j.close();
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    if (j != null) {
                        j.close();
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            j = 0;
            mo3172r().v_().m12355a("Error selecting expired configs", e);
            if (j != null) {
                j.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            j = 0;
            if (j != null) {
                j.close();
            }
            throw th;
        }
    }

    /* renamed from: G */
    public final long m29406G() {
        Object obj;
        Throwable th;
        Cursor cursor = null;
        try {
            Cursor rawQuery = m29442y().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
            try {
                if (rawQuery.moveToFirst()) {
                    long j = rawQuery.getLong(0);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return j;
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return -1;
            } catch (SQLiteException e) {
                Cursor cursor2 = rawQuery;
                obj = e;
                cursor = cursor2;
                try {
                    mo3172r().v_().m12355a("Error querying raw events", obj);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return -1;
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                cursor = rawQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            obj = e2;
            mo3172r().v_().m12355a("Error querying raw events", obj);
            if (cursor != null) {
                cursor.close();
            }
            return -1;
        }
    }

    /* renamed from: a */
    public final Pair<zzgf, Long> m29408a(String str, Long l) {
        Cursor rawQuery;
        mo4395d();
        m28438k();
        try {
            rawQuery = m29442y().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, String.valueOf(l)});
            try {
                if (rawQuery.moveToFirst()) {
                    byte[] blob = rawQuery.getBlob(0);
                    Long valueOf = Long.valueOf(rawQuery.getLong(1));
                    zzyx a = zzyx.m12125a(blob, 0, blob.length);
                    zzzg zzgf = new zzgf();
                    try {
                        zzgf.mo4347a(a);
                        str = Pair.create(zzgf, valueOf);
                        if (rawQuery != null) {
                            rawQuery.close();
                        }
                        return str;
                    } catch (IOException e) {
                        mo3172r().v_().m12357a("Failed to merge main event. appId, eventId", zzap.m28525a(str), l, e);
                        if (rawQuery != null) {
                            rawQuery.close();
                        }
                        return null;
                    }
                }
                mo3172r().m28555x().m12354a("Main event not found");
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return null;
            } catch (SQLiteException e2) {
                str = e2;
                try {
                    mo3172r().v_().m12355a("Error selecting main event", str);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return null;
                } catch (Throwable th) {
                    str = th;
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    throw str;
                }
            }
        } catch (SQLiteException e3) {
            str = e3;
            rawQuery = null;
            mo3172r().v_().m12355a("Error selecting main event", str);
            if (rawQuery != null) {
                rawQuery.close();
            }
            return null;
        } catch (Throwable th2) {
            str = th2;
            rawQuery = null;
            if (rawQuery != null) {
                rawQuery.close();
            }
            throw str;
        }
    }

    /* renamed from: a */
    public final boolean m29424a(String str, Long l, long j, zzgf zzgf) {
        mo4395d();
        m28438k();
        Preconditions.checkNotNull(zzgf);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l);
        try {
            byte[] bArr = new byte[zzgf.m12203e()];
            zzyy a = zzyy.m12153a(bArr, 0, bArr.length);
            zzgf.mo3160a(a);
            a.m12164a();
            mo3172r().m28555x().m12356a("Saving complex main event, appId, data size", mo4397o().m28503a(str), Integer.valueOf(bArr.length));
            zzgf = new ContentValues();
            zzgf.put("app_id", str);
            zzgf.put("event_id", l);
            zzgf.put("children_to_process", Long.valueOf(j));
            zzgf.put("main_event", bArr);
            try {
                if (m29442y().insertWithOnConflict("main_event_params", null, zzgf, 5) != -1) {
                    return true;
                }
                mo3172r().v_().m12355a("Failed to insert complex main event (got -1). appId", zzap.m28525a(str));
                return false;
            } catch (Long l2) {
                mo3172r().v_().m12356a("Error storing complex main event. appId", zzap.m28525a(str), l2);
                return false;
            }
        } catch (long j2) {
            mo3172r().v_().m12357a("Data loss. Failed to serialize event params/data. appId, eventId", zzap.m28525a(str), l2, j2);
            return false;
        }
    }

    /* renamed from: a */
    public final boolean m29423a(zzy zzy, long j, boolean z) {
        mo4395d();
        m28438k();
        Preconditions.checkNotNull(zzy);
        Preconditions.checkNotEmpty(zzy.f10791a);
        zzzg zzgf = new zzgf();
        zzgf.f20590d = Long.valueOf(zzy.f10794d);
        zzgf.f20587a = new zzgg[zzy.f10795e.m27301a()];
        Iterator it = zzy.f10795e.iterator();
        int i = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            zzgg zzgg = new zzgg();
            int i2 = i + 1;
            zzgf.f20587a[i] = zzgg;
            zzgg.f20593a = str;
            mo4964g().m29779a(zzgg, zzy.f10795e.m27302a(str));
            i = i2;
        }
        try {
            byte[] bArr = new byte[zzgf.m12203e()];
            zzyy a = zzyy.m12153a(bArr, 0, bArr.length);
            zzgf.mo3160a(a);
            a.m12164a();
            mo3172r().m28555x().m12356a("Saving event, name, data size", mo4397o().m28503a(zzy.f10792b), Integer.valueOf(bArr.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzy.f10791a);
            contentValues.put("name", zzy.f10792b);
            contentValues.put("timestamp", Long.valueOf(zzy.f10793c));
            contentValues.put("metadata_fingerprint", Long.valueOf(j));
            contentValues.put("data", bArr);
            contentValues.put("realtime", Integer.valueOf(z));
            try {
                if (m29442y().insert("raw_events", false, contentValues) != -1) {
                    return true;
                }
                mo3172r().v_().m12355a("Failed to insert raw event (got -1). appId", zzap.m28525a(zzy.f10791a));
                return false;
            } catch (long j2) {
                mo3172r().v_().m12356a("Error storing raw event. appId", zzap.m28525a(zzy.f10791a), j2);
                return false;
            }
        } catch (long j22) {
            mo3172r().v_().m12356a("Data loss. Failed to serialize event params/data. appId", zzap.m28525a(zzy.f10791a), j22);
            return false;
        }
    }

    /* renamed from: N */
    private final boolean m29391N() {
        return mo3170n().getDatabasePath("google_app_measurement.db").exists();
    }
}
