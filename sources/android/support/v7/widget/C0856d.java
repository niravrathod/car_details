package android.support.v7.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: android.support.v7.widget.d */
class C0856d extends DataSetObservable {
    /* renamed from: a */
    static final String f2895a = "d";
    /* renamed from: e */
    private static final Object f2896e = new Object();
    /* renamed from: f */
    private static final Map<String, C0856d> f2897f = new HashMap();
    /* renamed from: b */
    final Context f2898b;
    /* renamed from: c */
    final String f2899c;
    /* renamed from: d */
    boolean f2900d;
    /* renamed from: g */
    private final Object f2901g;
    /* renamed from: h */
    private final List<C0851a> f2902h;
    /* renamed from: i */
    private final List<C0853c> f2903i;
    /* renamed from: j */
    private Intent f2904j;
    /* renamed from: k */
    private C0852b f2905k;
    /* renamed from: l */
    private int f2906l;
    /* renamed from: m */
    private boolean f2907m;
    /* renamed from: n */
    private boolean f2908n;
    /* renamed from: o */
    private boolean f2909o;
    /* renamed from: p */
    private C0854d f2910p;

    /* renamed from: android.support.v7.widget.d$a */
    public static final class C0851a implements Comparable<C0851a> {
        /* renamed from: a */
        public final ResolveInfo f2889a;
        /* renamed from: b */
        public float f2890b;

        public /* synthetic */ int compareTo(Object obj) {
            return m3617a((C0851a) obj);
        }

        public C0851a(ResolveInfo resolveInfo) {
            this.f2889a = resolveInfo;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f2890b) + 31;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return Float.floatToIntBits(this.f2890b) == Float.floatToIntBits(((C0851a) obj).f2890b);
        }

        /* renamed from: a */
        public int m3617a(C0851a c0851a) {
            return Float.floatToIntBits(c0851a.f2890b) - Float.floatToIntBits(this.f2890b);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append("resolveInfo:");
            stringBuilder.append(this.f2889a.toString());
            stringBuilder.append("; weight:");
            stringBuilder.append(new BigDecimal((double) this.f2890b));
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    /* renamed from: android.support.v7.widget.d$b */
    public interface C0852b {
        /* renamed from: a */
        void m3618a(Intent intent, List<C0851a> list, List<C0853c> list2);
    }

    /* renamed from: android.support.v7.widget.d$c */
    public static final class C0853c {
        /* renamed from: a */
        public final ComponentName f2891a;
        /* renamed from: b */
        public final long f2892b;
        /* renamed from: c */
        public final float f2893c;

        public C0853c(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public C0853c(ComponentName componentName, long j, float f) {
            this.f2891a = componentName;
            this.f2892b = j;
            this.f2893c = f;
        }

        public int hashCode() {
            return (((((this.f2891a == null ? 0 : this.f2891a.hashCode()) + 31) * 31) + ((int) (this.f2892b ^ (this.f2892b >>> 32)))) * 31) + Float.floatToIntBits(this.f2893c);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0853c c0853c = (C0853c) obj;
            if (this.f2891a == null) {
                if (c0853c.f2891a != null) {
                    return false;
                }
            } else if (!this.f2891a.equals(c0853c.f2891a)) {
                return false;
            }
            return this.f2892b == c0853c.f2892b && Float.floatToIntBits(this.f2893c) == Float.floatToIntBits(c0853c.f2893c);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append("; activity:");
            stringBuilder.append(this.f2891a);
            stringBuilder.append("; time:");
            stringBuilder.append(this.f2892b);
            stringBuilder.append("; weight:");
            stringBuilder.append(new BigDecimal((double) this.f2893c));
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    /* renamed from: android.support.v7.widget.d$d */
    public interface C0854d {
        /* renamed from: a */
        boolean m3619a(C0856d c0856d, Intent intent);
    }

    /* renamed from: android.support.v7.widget.d$e */
    private final class C0855e extends AsyncTask<Object, Void, Void> {
        /* renamed from: a */
        final /* synthetic */ C0856d f2894a;

        public /* synthetic */ Object doInBackground(Object[] objArr) {
            return m3620a(objArr);
        }

        C0855e(C0856d c0856d) {
            this.f2894a = c0856d;
        }

        /* renamed from: a */
        public java.lang.Void m3620a(java.lang.Object... r12) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r11 = this;
            r0 = 0;
            r1 = r12[r0];
            r1 = (java.util.List) r1;
            r2 = 1;
            r12 = r12[r2];
            r12 = (java.lang.String) r12;
            r3 = 0;
            r4 = r11.f2894a;	 Catch:{ FileNotFoundException -> 0x00e8 }
            r4 = r4.f2898b;	 Catch:{ FileNotFoundException -> 0x00e8 }
            r4 = r4.openFileOutput(r12, r0);	 Catch:{ FileNotFoundException -> 0x00e8 }
            r12 = android.util.Xml.newSerializer();
            r12.setOutput(r4, r3);	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r5 = "UTF-8";	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r6 = java.lang.Boolean.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r12.startDocument(r5, r6);	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r5 = "historical-records";	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r12.startTag(r3, r5);	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r5 = r1.size();	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r6 = 0;	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
        L_0x002d:
            if (r6 >= r5) goto L_0x0063;	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
        L_0x002f:
            r7 = r1.remove(r0);	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r7 = (android.support.v7.widget.C0856d.C0853c) r7;	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r8 = "historical-record";	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r12.startTag(r3, r8);	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r8 = "activity";	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r9 = r7.f2891a;	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r9 = r9.flattenToString();	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r12.attribute(r3, r8, r9);	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r8 = "time";	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r9 = r7.f2892b;	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r9 = java.lang.String.valueOf(r9);	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r12.attribute(r3, r8, r9);	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r8 = "weight";	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r7 = r7.f2893c;	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r7 = java.lang.String.valueOf(r7);	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r12.attribute(r3, r8, r7);	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r7 = "historical-record";	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r12.endTag(r3, r7);	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r6 = r6 + 1;	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            goto L_0x002d;	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
        L_0x0063:
            r0 = "historical-records";	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r12.endTag(r3, r0);	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r12.endDocument();	 Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
            r12 = r11.f2894a;
            r12.f2900d = r2;
            if (r4 == 0) goto L_0x00dd;
        L_0x0071:
            r4.close();	 Catch:{ IOException -> 0x00dd }
            goto L_0x00dd;
        L_0x0075:
            r12 = move-exception;
            goto L_0x00de;
        L_0x0077:
            r12 = move-exception;
            r0 = android.support.v7.widget.C0856d.f2895a;	 Catch:{ all -> 0x0075 }
            r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0075 }
            r1.<init>();	 Catch:{ all -> 0x0075 }
            r5 = "Error writing historical record file: ";	 Catch:{ all -> 0x0075 }
            r1.append(r5);	 Catch:{ all -> 0x0075 }
            r5 = r11.f2894a;	 Catch:{ all -> 0x0075 }
            r5 = r5.f2899c;	 Catch:{ all -> 0x0075 }
            r1.append(r5);	 Catch:{ all -> 0x0075 }
            r1 = r1.toString();	 Catch:{ all -> 0x0075 }
            android.util.Log.e(r0, r1, r12);	 Catch:{ all -> 0x0075 }
            r12 = r11.f2894a;
            r12.f2900d = r2;
            if (r4 == 0) goto L_0x00dd;
        L_0x0098:
            goto L_0x0071;
        L_0x0099:
            r12 = move-exception;
            r0 = android.support.v7.widget.C0856d.f2895a;	 Catch:{ all -> 0x0075 }
            r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0075 }
            r1.<init>();	 Catch:{ all -> 0x0075 }
            r5 = "Error writing historical record file: ";	 Catch:{ all -> 0x0075 }
            r1.append(r5);	 Catch:{ all -> 0x0075 }
            r5 = r11.f2894a;	 Catch:{ all -> 0x0075 }
            r5 = r5.f2899c;	 Catch:{ all -> 0x0075 }
            r1.append(r5);	 Catch:{ all -> 0x0075 }
            r1 = r1.toString();	 Catch:{ all -> 0x0075 }
            android.util.Log.e(r0, r1, r12);	 Catch:{ all -> 0x0075 }
            r12 = r11.f2894a;
            r12.f2900d = r2;
            if (r4 == 0) goto L_0x00dd;
        L_0x00ba:
            goto L_0x0071;
        L_0x00bb:
            r12 = move-exception;
            r0 = android.support.v7.widget.C0856d.f2895a;	 Catch:{ all -> 0x0075 }
            r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0075 }
            r1.<init>();	 Catch:{ all -> 0x0075 }
            r5 = "Error writing historical record file: ";	 Catch:{ all -> 0x0075 }
            r1.append(r5);	 Catch:{ all -> 0x0075 }
            r5 = r11.f2894a;	 Catch:{ all -> 0x0075 }
            r5 = r5.f2899c;	 Catch:{ all -> 0x0075 }
            r1.append(r5);	 Catch:{ all -> 0x0075 }
            r1 = r1.toString();	 Catch:{ all -> 0x0075 }
            android.util.Log.e(r0, r1, r12);	 Catch:{ all -> 0x0075 }
            r12 = r11.f2894a;
            r12.f2900d = r2;
            if (r4 == 0) goto L_0x00dd;
        L_0x00dc:
            goto L_0x0071;
        L_0x00dd:
            return r3;
        L_0x00de:
            r0 = r11.f2894a;
            r0.f2900d = r2;
            if (r4 == 0) goto L_0x00e7;
        L_0x00e4:
            r4.close();	 Catch:{ IOException -> 0x00e7 }
        L_0x00e7:
            throw r12;
        L_0x00e8:
            r0 = move-exception;
            r1 = android.support.v7.widget.C0856d.f2895a;
            r2 = new java.lang.StringBuilder;
            r2.<init>();
            r4 = "Error writing historical record file: ";
            r2.append(r4);
            r2.append(r12);
            r12 = r2.toString();
            android.util.Log.e(r1, r12, r0);
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.d.e.a(java.lang.Object[]):java.lang.Void");
        }
    }

    /* renamed from: a */
    public int m3629a() {
        int size;
        synchronized (this.f2901g) {
            m3623e();
            size = this.f2902h.size();
        }
        return size;
    }

    /* renamed from: a */
    public ResolveInfo m3631a(int i) {
        synchronized (this.f2901g) {
            m3623e();
            i = ((C0851a) this.f2902h.get(i)).f2889a;
        }
        return i;
    }

    /* renamed from: a */
    public int m3630a(ResolveInfo resolveInfo) {
        synchronized (this.f2901g) {
            m3623e();
            List list = this.f2902h;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((C0851a) list.get(i)).f2889a == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: b */
    public Intent m3632b(int i) {
        synchronized (this.f2901g) {
            if (this.f2904j == null) {
                return null;
            }
            m3623e();
            C0851a c0851a = (C0851a) this.f2902h.get(i);
            ComponentName componentName = new ComponentName(c0851a.f2889a.activityInfo.packageName, c0851a.f2889a.activityInfo.name);
            i = new Intent(this.f2904j);
            i.setComponent(componentName);
            if (this.f2910p != null) {
                if (this.f2910p.m3619a(this, new Intent(i))) {
                    return null;
                }
            }
            m3621a(new C0853c(componentName, System.currentTimeMillis(), 1.0f));
            return i;
        }
    }

    /* renamed from: b */
    public ResolveInfo m3633b() {
        synchronized (this.f2901g) {
            m3623e();
            if (this.f2902h.isEmpty()) {
                return null;
            }
            ResolveInfo resolveInfo = ((C0851a) this.f2902h.get(0)).f2889a;
            return resolveInfo;
        }
    }

    /* renamed from: c */
    public void m3635c(int i) {
        synchronized (this.f2901g) {
            m3623e();
            C0851a c0851a = (C0851a) this.f2902h.get(i);
            C0851a c0851a2 = (C0851a) this.f2902h.get(0);
            m3621a(new C0853c(new ComponentName(c0851a.f2889a.activityInfo.packageName, c0851a.f2889a.activityInfo.name), System.currentTimeMillis(), c0851a2 != null ? (c0851a2.f2890b - c0851a.f2890b) + 5.0f : 1.0f));
        }
    }

    /* renamed from: d */
    private void m3622d() {
        if (!this.f2907m) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        } else if (this.f2908n) {
            this.f2908n = false;
            if (!TextUtils.isEmpty(this.f2899c)) {
                new C0855e(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[]{new ArrayList(this.f2903i), this.f2899c});
            }
        }
    }

    /* renamed from: c */
    public int m3634c() {
        int size;
        synchronized (this.f2901g) {
            m3623e();
            size = this.f2903i.size();
        }
        return size;
    }

    /* renamed from: e */
    private void m3623e() {
        int g = m3625g() | m3626h();
        m3627i();
        if (g != 0) {
            m3624f();
            notifyChanged();
        }
    }

    /* renamed from: f */
    private boolean m3624f() {
        if (this.f2905k == null || this.f2904j == null || this.f2902h.isEmpty() || this.f2903i.isEmpty()) {
            return false;
        }
        this.f2905k.m3618a(this.f2904j, this.f2902h, Collections.unmodifiableList(this.f2903i));
        return true;
    }

    /* renamed from: g */
    private boolean m3625g() {
        int i = 0;
        if (!this.f2909o || this.f2904j == null) {
            return false;
        }
        this.f2909o = false;
        this.f2902h.clear();
        List queryIntentActivities = this.f2898b.getPackageManager().queryIntentActivities(this.f2904j, 0);
        int size = queryIntentActivities.size();
        while (i < size) {
            this.f2902h.add(new C0851a((ResolveInfo) queryIntentActivities.get(i)));
            i++;
        }
        return true;
    }

    /* renamed from: h */
    private boolean m3626h() {
        if (!this.f2900d || !this.f2908n || TextUtils.isEmpty(this.f2899c)) {
            return false;
        }
        this.f2900d = false;
        this.f2907m = true;
        m3628j();
        return true;
    }

    /* renamed from: a */
    private boolean m3621a(C0853c c0853c) {
        c0853c = this.f2903i.add(c0853c);
        if (c0853c != null) {
            this.f2908n = true;
            m3627i();
            m3622d();
            m3624f();
            notifyChanged();
        }
        return c0853c;
    }

    /* renamed from: i */
    private void m3627i() {
        int size = this.f2903i.size() - this.f2906l;
        if (size > 0) {
            this.f2908n = true;
            for (int i = 0; i < size; i++) {
                C0853c c0853c = (C0853c) this.f2903i.remove(0);
            }
        }
    }

    /* renamed from: j */
    private void m3628j() {
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
        r9 = this;
        r0 = r9.f2898b;	 Catch:{ FileNotFoundException -> 0x00c4 }
        r1 = r9.f2899c;	 Catch:{ FileNotFoundException -> 0x00c4 }
        r0 = r0.openFileInput(r1);	 Catch:{ FileNotFoundException -> 0x00c4 }
        r1 = android.util.Xml.newPullParser();	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r2 = "UTF-8";	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r1.setInput(r0, r2);	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r2 = 0;	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
    L_0x0012:
        r3 = 1;	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        if (r2 == r3) goto L_0x001d;	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
    L_0x0015:
        r4 = 2;	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        if (r2 == r4) goto L_0x001d;	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
    L_0x0018:
        r2 = r1.next();	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        goto L_0x0012;	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
    L_0x001d:
        r2 = "historical-records";	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r4 = r1.getName();	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r2 = r2.equals(r4);	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        if (r2 == 0) goto L_0x007a;	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
    L_0x0029:
        r2 = r9.f2903i;	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r2.clear();	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
    L_0x002e:
        r4 = r1.next();	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        if (r4 != r3) goto L_0x003b;
    L_0x0034:
        if (r0 == 0) goto L_0x00bd;
    L_0x0036:
        r0.close();	 Catch:{ IOException -> 0x00bd }
        goto L_0x00bd;
    L_0x003b:
        r5 = 3;
        if (r4 == r5) goto L_0x002e;
    L_0x003e:
        r5 = 4;
        if (r4 != r5) goto L_0x0042;
    L_0x0041:
        goto L_0x002e;
    L_0x0042:
        r4 = r1.getName();	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r5 = "historical-record";	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r4 = r5.equals(r4);	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        if (r4 == 0) goto L_0x0072;	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
    L_0x004e:
        r4 = "activity";	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r5 = 0;	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r4 = r1.getAttributeValue(r5, r4);	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r6 = "time";	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r6 = r1.getAttributeValue(r5, r6);	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r6 = java.lang.Long.parseLong(r6);	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r8 = "weight";	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r5 = r1.getAttributeValue(r5, r8);	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r5 = java.lang.Float.parseFloat(r5);	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r8 = new android.support.v7.widget.d$c;	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r8.<init>(r4, r6, r5);	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r2.add(r8);	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        goto L_0x002e;	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
    L_0x0072:
        r1 = new org.xmlpull.v1.XmlPullParserException;	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r2 = "Share records file not well-formed.";	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r1.<init>(r2);	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        throw r1;	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
    L_0x007a:
        r1 = new org.xmlpull.v1.XmlPullParserException;	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r2 = "Share records file does not start with historical-records tag.";	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        r1.<init>(r2);	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        throw r1;	 Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
    L_0x0082:
        r1 = move-exception;
        goto L_0x00be;
    L_0x0084:
        r1 = move-exception;
        r2 = f2895a;	 Catch:{ all -> 0x0082 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0082 }
        r3.<init>();	 Catch:{ all -> 0x0082 }
        r4 = "Error reading historical recrod file: ";	 Catch:{ all -> 0x0082 }
        r3.append(r4);	 Catch:{ all -> 0x0082 }
        r4 = r9.f2899c;	 Catch:{ all -> 0x0082 }
        r3.append(r4);	 Catch:{ all -> 0x0082 }
        r3 = r3.toString();	 Catch:{ all -> 0x0082 }
        android.util.Log.e(r2, r3, r1);	 Catch:{ all -> 0x0082 }
        if (r0 == 0) goto L_0x00bd;	 Catch:{ all -> 0x0082 }
    L_0x009f:
        goto L_0x0036;	 Catch:{ all -> 0x0082 }
    L_0x00a0:
        r1 = move-exception;	 Catch:{ all -> 0x0082 }
        r2 = f2895a;	 Catch:{ all -> 0x0082 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0082 }
        r3.<init>();	 Catch:{ all -> 0x0082 }
        r4 = "Error reading historical recrod file: ";	 Catch:{ all -> 0x0082 }
        r3.append(r4);	 Catch:{ all -> 0x0082 }
        r4 = r9.f2899c;	 Catch:{ all -> 0x0082 }
        r3.append(r4);	 Catch:{ all -> 0x0082 }
        r3 = r3.toString();	 Catch:{ all -> 0x0082 }
        android.util.Log.e(r2, r3, r1);	 Catch:{ all -> 0x0082 }
        if (r0 == 0) goto L_0x00bd;
    L_0x00bb:
        goto L_0x0036;
    L_0x00bd:
        return;
    L_0x00be:
        if (r0 == 0) goto L_0x00c3;
    L_0x00c0:
        r0.close();	 Catch:{ IOException -> 0x00c3 }
    L_0x00c3:
        throw r1;
    L_0x00c4:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.d.j():void");
    }
}
