package android.support.v4.p015d;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.support.v4.content.p014a.C0383a;
import android.support.v4.p009a.C0306h;
import android.support.v4.p015d.C0410c.C0409a;
import android.support.v4.p017f.C0421g;
import android.support.v4.p017f.C0432l;
import android.support.v4.p017f.C0433m;
import com.j256.ormlite.field.FieldType;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: android.support.v4.d.b */
public class C0404b {
    /* renamed from: a */
    private static final C0421g<String, Typeface> f1372a = new C0421g(16);
    /* renamed from: b */
    private static final C0410c f1373b = new C0410c("fonts", 10, 10000);
    /* renamed from: c */
    private static final Object f1374c = new Object();
    /* renamed from: d */
    private static final C0433m<String, ArrayList<C0409a<C0403c>>> f1375d = new C0433m();
    /* renamed from: e */
    private static final Comparator<byte[]> f1376e = new C04004();

    /* renamed from: android.support.v4.d.b$4 */
    static class C04004 implements Comparator<byte[]> {
        C04004() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m1480a((byte[]) obj, (byte[]) obj2);
        }

        /* renamed from: a */
        public int m1480a(byte[] bArr, byte[] bArr2) {
            if (bArr.length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            for (int i = 0; i < bArr.length; i++) {
                if (bArr[i] != bArr2[i]) {
                    return bArr[i] - bArr2[i];
                }
            }
            return 0;
        }
    }

    /* renamed from: android.support.v4.d.b$a */
    public static class C0401a {
        /* renamed from: a */
        private final int f1363a;
        /* renamed from: b */
        private final C0402b[] f1364b;

        public C0401a(int i, C0402b[] c0402bArr) {
            this.f1363a = i;
            this.f1364b = c0402bArr;
        }

        /* renamed from: a */
        public int m1481a() {
            return this.f1363a;
        }

        /* renamed from: b */
        public C0402b[] m1482b() {
            return this.f1364b;
        }
    }

    /* renamed from: android.support.v4.d.b$b */
    public static class C0402b {
        /* renamed from: a */
        private final Uri f1365a;
        /* renamed from: b */
        private final int f1366b;
        /* renamed from: c */
        private final int f1367c;
        /* renamed from: d */
        private final boolean f1368d;
        /* renamed from: e */
        private final int f1369e;

        public C0402b(Uri uri, int i, int i2, boolean z, int i3) {
            this.f1365a = (Uri) C0432l.m1574a(uri);
            this.f1366b = i;
            this.f1367c = i2;
            this.f1368d = z;
            this.f1369e = i3;
        }

        /* renamed from: a */
        public Uri m1483a() {
            return this.f1365a;
        }

        /* renamed from: b */
        public int m1484b() {
            return this.f1366b;
        }

        /* renamed from: c */
        public int m1485c() {
            return this.f1367c;
        }

        /* renamed from: d */
        public boolean m1486d() {
            return this.f1368d;
        }

        /* renamed from: e */
        public int m1487e() {
            return this.f1369e;
        }
    }

    /* renamed from: android.support.v4.d.b$c */
    private static final class C0403c {
        /* renamed from: a */
        final Typeface f1370a;
        /* renamed from: b */
        final int f1371b;

        C0403c(Typeface typeface, int i) {
            this.f1370a = typeface;
            this.f1371b = i;
        }
    }

    /* renamed from: b */
    private static android.support.v4.p015d.C0404b.C0403c m1498b(android.content.Context r3, android.support.v4.p015d.C0398a r4, int r5) {
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
        r0 = 0;
        r4 = android.support.v4.p015d.C0404b.m1490a(r3, r0, r4);	 Catch:{ NameNotFoundException -> 0x002b }
        r1 = r4.m1481a();
        r2 = -3;
        if (r1 != 0) goto L_0x001d;
    L_0x000c:
        r4 = r4.m1482b();
        r3 = android.support.v4.p009a.C0304c.m1091a(r3, r0, r4, r5);
        r4 = new android.support.v4.d.b$c;
        if (r3 == 0) goto L_0x0019;
    L_0x0018:
        r2 = 0;
    L_0x0019:
        r4.<init>(r3, r2);
        return r4;
    L_0x001d:
        r3 = r4.m1481a();
        r4 = 1;
        if (r3 != r4) goto L_0x0025;
    L_0x0024:
        r2 = -2;
    L_0x0025:
        r3 = new android.support.v4.d.b$c;
        r3.<init>(r0, r2);
        return r3;
    L_0x002b:
        r3 = new android.support.v4.d.b$c;
        r4 = -1;
        r3.<init>(r0, r4);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.d.b.b(android.content.Context, android.support.v4.d.a, int):android.support.v4.d.b$c");
    }

    /* renamed from: a */
    public static android.graphics.Typeface m1489a(final android.content.Context r2, final android.support.v4.p015d.C0398a r3, final android.support.v4.content.p014a.C0387b.C0386a r4, final android.os.Handler r5, boolean r6, int r7, final int r8) {
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
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = r3.m1478f();
        r0.append(r1);
        r1 = "-";
        r0.append(r1);
        r0.append(r8);
        r0 = r0.toString();
        r1 = f1372a;
        r1 = r1.get(r0);
        r1 = (android.graphics.Typeface) r1;
        if (r1 == 0) goto L_0x0028;
    L_0x0022:
        if (r4 == 0) goto L_0x0027;
    L_0x0024:
        r4.mo829a(r1);
    L_0x0027:
        return r1;
    L_0x0028:
        if (r6 == 0) goto L_0x0045;
    L_0x002a:
        r1 = -1;
        if (r7 != r1) goto L_0x0045;
    L_0x002d:
        r2 = android.support.v4.p015d.C0404b.m1498b(r2, r3, r8);
        if (r4 == 0) goto L_0x0042;
    L_0x0033:
        r3 = r2.f1371b;
        if (r3 != 0) goto L_0x003d;
    L_0x0037:
        r3 = r2.f1370a;
        r4.m1415a(r3, r5);
        goto L_0x0042;
    L_0x003d:
        r3 = r2.f1371b;
        r4.m1413a(r3, r5);
    L_0x0042:
        r2 = r2.f1370a;
        return r2;
    L_0x0045:
        r1 = new android.support.v4.d.b$1;
        r1.<init>(r2, r3, r8, r0);
        r2 = 0;
        if (r6 == 0) goto L_0x0059;
    L_0x004d:
        r3 = f1373b;	 Catch:{ InterruptedException -> 0x0058 }
        r3 = r3.m1507a(r1, r7);	 Catch:{ InterruptedException -> 0x0058 }
        r3 = (android.support.v4.p015d.C0404b.C0403c) r3;	 Catch:{ InterruptedException -> 0x0058 }
        r3 = r3.f1370a;	 Catch:{ InterruptedException -> 0x0058 }
        return r3;
    L_0x0058:
        return r2;
    L_0x0059:
        if (r4 != 0) goto L_0x005d;
    L_0x005b:
        r3 = r2;
        goto L_0x0062;
    L_0x005d:
        r3 = new android.support.v4.d.b$2;
        r3.<init>(r4, r5);
    L_0x0062:
        r4 = f1374c;
        monitor-enter(r4);
        r5 = f1375d;	 Catch:{ all -> 0x0097 }
        r5 = r5.containsKey(r0);	 Catch:{ all -> 0x0097 }
        if (r5 == 0) goto L_0x007c;	 Catch:{ all -> 0x0097 }
    L_0x006d:
        if (r3 == 0) goto L_0x007a;	 Catch:{ all -> 0x0097 }
    L_0x006f:
        r5 = f1375d;	 Catch:{ all -> 0x0097 }
        r5 = r5.get(r0);	 Catch:{ all -> 0x0097 }
        r5 = (java.util.ArrayList) r5;	 Catch:{ all -> 0x0097 }
        r5.add(r3);	 Catch:{ all -> 0x0097 }
    L_0x007a:
        monitor-exit(r4);	 Catch:{ all -> 0x0097 }
        return r2;	 Catch:{ all -> 0x0097 }
    L_0x007c:
        if (r3 == 0) goto L_0x008b;	 Catch:{ all -> 0x0097 }
    L_0x007e:
        r5 = new java.util.ArrayList;	 Catch:{ all -> 0x0097 }
        r5.<init>();	 Catch:{ all -> 0x0097 }
        r5.add(r3);	 Catch:{ all -> 0x0097 }
        r3 = f1375d;	 Catch:{ all -> 0x0097 }
        r3.put(r0, r5);	 Catch:{ all -> 0x0097 }
    L_0x008b:
        monitor-exit(r4);	 Catch:{ all -> 0x0097 }
        r3 = f1373b;
        r4 = new android.support.v4.d.b$3;
        r4.<init>(r0);
        r3.m1508a(r1, r4);
        return r2;
    L_0x0097:
        r2 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0097 }
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.d.b.a(android.content.Context, android.support.v4.d.a, android.support.v4.content.a.b$a, android.os.Handler, boolean, int, int):android.graphics.Typeface");
    }

    /* renamed from: a */
    public static Map<Uri, ByteBuffer> m1495a(Context context, C0402b[] c0402bArr, CancellationSignal cancellationSignal) {
        Map hashMap = new HashMap();
        for (C0402b c0402b : c0402bArr) {
            if (c0402b.m1487e() == 0) {
                Uri a = c0402b.m1483a();
                if (!hashMap.containsKey(a)) {
                    hashMap.put(a, C0306h.m1099a(context, cancellationSignal, a));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public static C0401a m1490a(Context context, CancellationSignal cancellationSignal, C0398a c0398a) {
        ProviderInfo a = C0404b.m1488a(context.getPackageManager(), c0398a, context.getResources());
        if (a == null) {
            return new C0401a(1, null);
        }
        return new C0401a(null, C0404b.m1497a(context, c0398a, a.authority, cancellationSignal));
    }

    /* renamed from: a */
    public static ProviderInfo m1488a(PackageManager packageManager, C0398a c0398a, Resources resources) {
        String a = c0398a.m1473a();
        int i = 0;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(a, 0);
        if (resolveContentProvider == null) {
            c0398a = new StringBuilder();
            c0398a.append("No package found for authority: ");
            c0398a.append(a);
            throw new NameNotFoundException(c0398a.toString());
        } else if (resolveContentProvider.packageName.equals(c0398a.m1474b())) {
            List a2 = C0404b.m1494a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(a2, f1376e);
            c0398a = C0404b.m1493a(c0398a, resources);
            while (i < c0398a.size()) {
                List arrayList = new ArrayList((Collection) c0398a.get(i));
                Collections.sort(arrayList, f1376e);
                if (C0404b.m1496a(a2, arrayList) != null) {
                    return resolveContentProvider;
                }
                i++;
            }
            return null;
        } else {
            resources = new StringBuilder();
            resources.append("Found content provider ");
            resources.append(a);
            resources.append(", but package was not ");
            resources.append(c0398a.m1474b());
            throw new NameNotFoundException(resources.toString());
        }
    }

    /* renamed from: a */
    private static List<List<byte[]>> m1493a(C0398a c0398a, Resources resources) {
        if (c0398a.m1476d() != null) {
            return c0398a.m1476d();
        }
        return C0383a.m1406a(resources, c0398a.m1477e());
    }

    /* renamed from: a */
    private static boolean m1496a(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static List<byte[]> m1494a(Signature[] signatureArr) {
        List<byte[]> arrayList = new ArrayList();
        for (Signature toByteArray : signatureArr) {
            arrayList.add(toByteArray.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: a */
    static C0402b[] m1497a(Context context, C0398a c0398a, String str, CancellationSignal cancellationSignal) {
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        Uri build = new Builder().scheme("content").authority(str2).build();
        Uri build2 = new Builder().scheme("content").authority(str2).appendPath("file").build();
        Cursor cursor = null;
        try {
            Cursor query;
            if (VERSION.SDK_INT > 16) {
                query = context.getContentResolver().query(build, new String[]{FieldType.FOREIGN_ID_FIELD_SUFFIX, "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{c0398a.m1475c()}, null, cancellationSignal);
            } else {
                query = context.getContentResolver().query(build, new String[]{FieldType.FOREIGN_ID_FIELD_SUFFIX, "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{c0398a.m1475c()}, null);
            }
            cursor = query;
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex(FieldType.FOREIGN_ID_FIELD_SUFFIX);
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    Uri withAppendedId;
                    int i = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    int i2 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                    if (columnIndex3 == -1) {
                        withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                    } else {
                        withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    Uri uri = withAppendedId;
                    int i3 = columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400;
                    boolean z = columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1;
                    arrayList2.add(new C0402b(uri, i2, i3, z, i));
                }
                arrayList = arrayList2;
            }
            if (cursor != null) {
                cursor.close();
            }
            return (C0402b[]) arrayList.toArray(new C0402b[0]);
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}
