package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.C1280f;
import com.bumptech.glide.load.C3499g;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.C3490i;
import com.bumptech.glide.load.engine.p060a.C1230b;
import com.bumptech.glide.load.engine.p060a.C1232e;
import com.bumptech.glide.load.engine.p061b.C1248h;
import com.bumptech.glide.load.engine.p063d.C1259a;
import com.bumptech.glide.load.p057a.C3387k.C3386a;
import com.bumptech.glide.load.p059b.C1207o;
import com.bumptech.glide.load.p059b.C3401a.C3389b;
import com.bumptech.glide.load.p059b.C3401a.C3390c;
import com.bumptech.glide.load.p059b.C3407b.C3403a;
import com.bumptech.glide.load.p059b.C3407b.C3406d;
import com.bumptech.glide.load.p059b.C3408c;
import com.bumptech.glide.load.p059b.C3411d.C3410b;
import com.bumptech.glide.load.p059b.C3415e.C3414c;
import com.bumptech.glide.load.p059b.C3420f.C4513b;
import com.bumptech.glide.load.p059b.C3420f.C4514e;
import com.bumptech.glide.load.p059b.C3421g;
import com.bumptech.glide.load.p059b.C3427k.C3425a;
import com.bumptech.glide.load.p059b.C3436s.C3432a;
import com.bumptech.glide.load.p059b.C3436s.C3433b;
import com.bumptech.glide.load.p059b.C3436s.C3434c;
import com.bumptech.glide.load.p059b.C3436s.C3435d;
import com.bumptech.glide.load.p059b.C3437t;
import com.bumptech.glide.load.p059b.C3441u.C3438a;
import com.bumptech.glide.load.p059b.C3441u.C3439b;
import com.bumptech.glide.load.p059b.C3441u.C3440c;
import com.bumptech.glide.load.p059b.C3444v.C3442a;
import com.bumptech.glide.load.p059b.C3448w.C3445a;
import com.bumptech.glide.load.p059b.C3448w.C3446b;
import com.bumptech.glide.load.p059b.C3448w.C3447d;
import com.bumptech.glide.load.p059b.C3450x.C3449a;
import com.bumptech.glide.load.p059b.p164a.C3392a.C3391a;
import com.bumptech.glide.load.p059b.p164a.C3394b.C3393a;
import com.bumptech.glide.load.p059b.p164a.C3396c.C3395a;
import com.bumptech.glide.load.p059b.p164a.C3398d.C3397a;
import com.bumptech.glide.load.p059b.p164a.C3400e.C3399a;
import com.bumptech.glide.load.resource.bitmap.C1285k;
import com.bumptech.glide.load.resource.bitmap.C3514a;
import com.bumptech.glide.load.resource.bitmap.C3516f;
import com.bumptech.glide.load.resource.bitmap.C3519j;
import com.bumptech.glide.load.resource.bitmap.C3521n;
import com.bumptech.glide.load.resource.bitmap.C3523r;
import com.bumptech.glide.load.resource.bitmap.C3525t;
import com.bumptech.glide.load.resource.bitmap.C3527v;
import com.bumptech.glide.load.resource.bitmap.C3532w;
import com.bumptech.glide.load.resource.bitmap.C4518b;
import com.bumptech.glide.load.resource.bitmap.C4519c;
import com.bumptech.glide.load.resource.p064b.C3506d;
import com.bumptech.glide.load.resource.p064b.C3507e;
import com.bumptech.glide.load.resource.p065d.C3534a;
import com.bumptech.glide.load.resource.p065d.C3536c;
import com.bumptech.glide.load.resource.p065d.C3537h;
import com.bumptech.glide.load.resource.p065d.C3538j;
import com.bumptech.glide.load.resource.p065d.C4524d;
import com.bumptech.glide.load.resource.p066e.C1300e;
import com.bumptech.glide.load.resource.p066e.C3539a;
import com.bumptech.glide.load.resource.p066e.C3540b;
import com.bumptech.glide.load.resource.p066e.C3541c;
import com.bumptech.glide.load.resource.p066e.C3542d;
import com.bumptech.glide.load.resource.p165a.C3502a.C3501a;
import com.bumptech.glide.load.resource.p166c.C3533a;
import com.bumptech.glide.p051b.C1129a;
import com.bumptech.glide.p052c.C1134d;
import com.bumptech.glide.p052c.C1140l;
import com.bumptech.glide.p053d.C1145e;
import com.bumptech.glide.p053d.C3367c;
import com.bumptech.glide.p055g.C1178i;
import com.bumptech.glide.p055g.C1180j;
import com.bumptech.glide.request.C1313e;
import com.bumptech.glide.request.p067a.C1303e;
import com.bumptech.glide.request.p067a.C3545h;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bumptech.glide.c */
public class C1143c implements ComponentCallbacks2 {
    /* renamed from: a */
    private static volatile C1143c f3737a;
    /* renamed from: b */
    private static volatile boolean f3738b;
    /* renamed from: c */
    private final C3490i f3739c;
    /* renamed from: d */
    private final C1232e f3740d;
    /* renamed from: e */
    private final C1248h f3741e;
    /* renamed from: f */
    private final C1259a f3742f;
    /* renamed from: g */
    private final C1157e f3743g;
    /* renamed from: h */
    private final Registry f3744h;
    /* renamed from: i */
    private final C1230b f3745i;
    /* renamed from: j */
    private final C1140l f3746j;
    /* renamed from: k */
    private final C1134d f3747k;
    /* renamed from: l */
    private final List<C3377g> f3748l = new ArrayList();
    /* renamed from: m */
    private MemoryCategory f3749m = MemoryCategory.NORMAL;

    public void onConfigurationChanged(Configuration configuration) {
    }

    /* renamed from: a */
    public static C1143c m4768a(Context context) {
        if (f3737a == null) {
            synchronized (C1143c.class) {
                if (f3737a == null) {
                    C1143c.m4772c(context);
                }
            }
        }
        return f3737a;
    }

    /* renamed from: c */
    private static void m4772c(Context context) {
        if (f3738b) {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
        f3738b = true;
        C1143c.m4773d(context);
        f3738b = null;
    }

    /* renamed from: d */
    private static void m4773d(Context context) {
        C1143c.m4769a(context, new C1147d());
    }

    /* renamed from: a */
    private static void m4769a(Context context, C1147d c1147d) {
        context = context.getApplicationContext();
        C4779a i = C1143c.m4775i();
        List emptyList = Collections.emptyList();
        if (i == null || i.m24927c()) {
            emptyList = new C1145e(context).m4791a();
        }
        if (!(i == null || i.m27731a().isEmpty())) {
            Set a = i.m27731a();
            Iterator it = r1.iterator();
            while (it.hasNext()) {
                C3367c c3367c = (C3367c) it.next();
                if (a.contains(c3367c.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("AppGlideModule excludes manifest GlideModule: ");
                        stringBuilder.append(c3367c);
                        Log.d("Glide", stringBuilder.toString());
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            for (C3367c c3367c2 : r1) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Discovered GlideModule from manifest: ");
                stringBuilder2.append(c3367c2.getClass());
                Log.d("Glide", stringBuilder2.toString());
            }
        }
        c1147d.m4794a(i != null ? i.m27732b() : null);
        for (C3367c c3367c22 : r1) {
            c3367c22.mo3892a(context, c1147d);
        }
        if (i != null) {
            i.mo3892a(context, c1147d);
        }
        c1147d = c1147d.m4793a(context);
        for (C3367c a2 : r1) {
            a2.mo949a(context, c1147d, c1147d.f3744h);
        }
        if (i != null) {
            i.mo949a(context, c1147d, c1147d.f3744h);
        }
        context.registerComponentCallbacks(c1147d);
        f3737a = c1147d;
    }

    /* renamed from: i */
    private static com.bumptech.glide.C4779a m4775i() {
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
        r0 = "com.bumptech.glide.GeneratedAppGlideModuleImpl";	 Catch:{ ClassNotFoundException -> 0x002a, InstantiationException -> 0x0025, IllegalAccessException -> 0x0020, NoSuchMethodException -> 0x001b, InvocationTargetException -> 0x0016 }
        r0 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x002a, InstantiationException -> 0x0025, IllegalAccessException -> 0x0020, NoSuchMethodException -> 0x001b, InvocationTargetException -> 0x0016 }
        r1 = 0;	 Catch:{ ClassNotFoundException -> 0x002a, InstantiationException -> 0x0025, IllegalAccessException -> 0x0020, NoSuchMethodException -> 0x001b, InvocationTargetException -> 0x0016 }
        r2 = new java.lang.Class[r1];	 Catch:{ ClassNotFoundException -> 0x002a, InstantiationException -> 0x0025, IllegalAccessException -> 0x0020, NoSuchMethodException -> 0x001b, InvocationTargetException -> 0x0016 }
        r0 = r0.getDeclaredConstructor(r2);	 Catch:{ ClassNotFoundException -> 0x002a, InstantiationException -> 0x0025, IllegalAccessException -> 0x0020, NoSuchMethodException -> 0x001b, InvocationTargetException -> 0x0016 }
        r1 = new java.lang.Object[r1];	 Catch:{ ClassNotFoundException -> 0x002a, InstantiationException -> 0x0025, IllegalAccessException -> 0x0020, NoSuchMethodException -> 0x001b, InvocationTargetException -> 0x0016 }
        r0 = r0.newInstance(r1);	 Catch:{ ClassNotFoundException -> 0x002a, InstantiationException -> 0x0025, IllegalAccessException -> 0x0020, NoSuchMethodException -> 0x001b, InvocationTargetException -> 0x0016 }
        r0 = (com.bumptech.glide.C4779a) r0;	 Catch:{ ClassNotFoundException -> 0x002a, InstantiationException -> 0x0025, IllegalAccessException -> 0x0020, NoSuchMethodException -> 0x001b, InvocationTargetException -> 0x0016 }
        goto L_0x003c;
    L_0x0016:
        r0 = move-exception;
        com.bumptech.glide.C1143c.m4770a(r0);
        goto L_0x003b;
    L_0x001b:
        r0 = move-exception;
        com.bumptech.glide.C1143c.m4770a(r0);
        goto L_0x003b;
    L_0x0020:
        r0 = move-exception;
        com.bumptech.glide.C1143c.m4770a(r0);
        goto L_0x003b;
    L_0x0025:
        r0 = move-exception;
        com.bumptech.glide.C1143c.m4770a(r0);
        goto L_0x003b;
        r0 = "Glide";
        r1 = 5;
        r0 = android.util.Log.isLoggable(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x0034:
        r0 = "Glide";
        r1 = "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored";
        android.util.Log.w(r0, r1);
    L_0x003b:
        r0 = 0;
    L_0x003c:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.c.i():com.bumptech.glide.a");
    }

    /* renamed from: a */
    private static void m4770a(Exception exception) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exception);
    }

    C1143c(Context context, C3490i c3490i, C1248h c1248h, C1232e c1232e, C1230b c1230b, C1140l c1140l, C1134d c1134d, int i, C1313e c1313e, Map<Class<?>, C1181h<?, ?>> map) {
        Context context2 = context;
        C1248h c1248h2 = c1248h;
        C1232e c1232e2 = c1232e;
        C1230b c1230b2 = c1230b;
        this.f3739c = c3490i;
        this.f3740d = c1232e2;
        this.f3745i = c1230b2;
        this.f3741e = c1248h2;
        this.f3746j = c1140l;
        this.f3747k = c1134d;
        this.f3742f = new C1259a(c1248h2, c1232e2, (DecodeFormat) c1313e.m5333l().m17523a(C1285k.f4051a));
        Resources resources = context.getResources();
        this.f3744h = new Registry();
        if (VERSION.SDK_INT >= 27) {
            r0.f3744h.m4624a(new C3521n());
        }
        r0.f3744h.m4624a(new C3519j());
        C1285k c1285k = new C1285k(r0.f3744h.m4635a(), resources.getDisplayMetrics(), c1232e2, c1230b2);
        C1280f c3534a = new C3534a(context2, r0.f3744h.m4635a(), c1232e2, c1230b2);
        C1280f b = C3532w.m17877b(c1232e);
        C1280f c3516f = new C3516f(c1285k);
        C1280f c3525t = new C3525t(c1285k, c1230b2);
        C1280f c3506d = new C3506d(context2);
        C1207o c3434c = new C3434c(resources);
        C3435d c3435d = new C3435d(resources);
        C3433b c3433b = new C3433b(resources);
        C3432a c3432a = new C3432a(resources);
        C3499g c4519c = new C4519c(c1230b2);
        C3539a c3539a = new C3539a();
        C3542d c3542d = new C3542d();
        C1207o c1207o = c3433b;
        c1207o = c3435d;
        C1207o c1207o2 = c3432a;
        Context context3 = context;
        ContentResolver contentResolver = context.getContentResolver();
        C1300e c1300e = c3539a;
        C1300e c1300e2 = c3542d;
        r0.f3744h.m4626a(ByteBuffer.class, new C3408c()).m4626a(InputStream.class, new C3437t(c1230b2)).m4631a("Bitmap", ByteBuffer.class, Bitmap.class, c3516f).m4631a("Bitmap", InputStream.class, Bitmap.class, c3525t).m4631a("Bitmap", ParcelFileDescriptor.class, Bitmap.class, b).m4631a("Bitmap", AssetFileDescriptor.class, Bitmap.class, C3532w.m17875a(c1232e)).m4628a(Bitmap.class, Bitmap.class, C3442a.m17495a()).m4631a("Bitmap", Bitmap.class, Bitmap.class, new C3527v()).m4627a(Bitmap.class, c4519c).m4631a("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C3514a(resources, c3516f)).m4631a("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C3514a(resources, c3525t)).m4631a("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C3514a(resources, b)).m4627a(BitmapDrawable.class, new C4518b(c1232e2, c4519c)).m4631a("Gif", InputStream.class, C3536c.class, new C3538j(r0.f3744h.m4635a(), c3534a, c1230b2)).m4631a("Gif", ByteBuffer.class, C3536c.class, c3534a).m4627a(C3536c.class, new C4524d()).m4628a(C1129a.class, C1129a.class, C3442a.m17495a()).m4631a("Bitmap", C1129a.class, Bitmap.class, new C3537h(c1232e2)).m4629a(Uri.class, Drawable.class, c3506d).m4629a(Uri.class, Bitmap.class, new C3523r(c3506d, c1232e2)).m4625a(new C3501a()).m4628a(File.class, ByteBuffer.class, new C3410b()).m4628a(File.class, InputStream.class, new C4514e()).m4629a(File.class, File.class, new C3533a()).m4628a(File.class, ParcelFileDescriptor.class, new C4513b()).m4628a(File.class, File.class, C3442a.m17495a()).m4625a(new C3386a(c1230b2)).m4628a(Integer.TYPE, InputStream.class, c3434c).m4628a(Integer.TYPE, ParcelFileDescriptor.class, c1207o).m4628a(Integer.class, InputStream.class, c3434c).m4628a(Integer.class, ParcelFileDescriptor.class, c1207o).m4628a(Integer.class, Uri.class, c1207o).m4628a(Integer.TYPE, AssetFileDescriptor.class, c1207o2).m4628a(Integer.class, AssetFileDescriptor.class, c1207o2).m4628a(Integer.TYPE, Uri.class, c1207o).m4628a(String.class, InputStream.class, new C3414c()).m4628a(Uri.class, InputStream.class, new C3414c()).m4628a(String.class, InputStream.class, new C3440c()).m4628a(String.class, ParcelFileDescriptor.class, new C3439b()).m4628a(String.class, AssetFileDescriptor.class, new C3438a()).m4628a(Uri.class, InputStream.class, new C3393a()).m4628a(Uri.class, InputStream.class, new C3390c(context.getAssets())).m4628a(Uri.class, ParcelFileDescriptor.class, new C3389b(context.getAssets())).m4628a(Uri.class, InputStream.class, new C3395a(context3)).m4628a(Uri.class, InputStream.class, new C3397a(context3)).m4628a(Uri.class, InputStream.class, new C3447d(contentResolver)).m4628a(Uri.class, ParcelFileDescriptor.class, new C3446b(contentResolver)).m4628a(Uri.class, AssetFileDescriptor.class, new C3445a(contentResolver)).m4628a(Uri.class, InputStream.class, new C3449a()).m4628a(URL.class, InputStream.class, new C3399a()).m4628a(Uri.class, File.class, new C3425a(context3)).m4628a(C3421g.class, InputStream.class, new C3391a()).m4628a(byte[].class, ByteBuffer.class, new C3403a()).m4628a(byte[].class, InputStream.class, new C3406d()).m4628a(Uri.class, Uri.class, C3442a.m17495a()).m4628a(Drawable.class, Drawable.class, C3442a.m17495a()).m4629a(Drawable.class, Drawable.class, new C3507e()).m4630a(Bitmap.class, BitmapDrawable.class, new C3540b(resources)).m4630a(Bitmap.class, byte[].class, c1300e).m4630a(Drawable.class, byte[].class, new C3541c(c1232e2, c1300e, c1300e2)).m4630a(C3536c.class, byte[].class, c1300e2);
        r0.f3743g = new C1157e(context, c1230b, r0.f3744h, new C1303e(), c1313e, map, c3490i, i);
    }

    /* renamed from: a */
    public C1232e m4776a() {
        return this.f3740d;
    }

    /* renamed from: b */
    public C1230b m4780b() {
        return this.f3745i;
    }

    /* renamed from: c */
    public Context m4782c() {
        return this.f3743g.getBaseContext();
    }

    /* renamed from: d */
    C1134d m4783d() {
        return this.f3747k;
    }

    /* renamed from: e */
    C1157e m4784e() {
        return this.f3743g;
    }

    /* renamed from: f */
    public void m4785f() {
        C1180j.m4896a();
        this.f3741e.m5074a();
        this.f3740d.mo1003a();
        this.f3745i.mo1012a();
    }

    /* renamed from: a */
    public void m4777a(int i) {
        C1180j.m4896a();
        this.f3741e.mo1024a(i);
        this.f3740d.mo1004a(i);
        this.f3745i.mo1013a(i);
    }

    /* renamed from: g */
    public C1140l m4786g() {
        return this.f3746j;
    }

    /* renamed from: e */
    private static C1140l m4774e(Context context) {
        C1178i.m4881a((Object) context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return C1143c.m4768a(context).m4786g();
    }

    /* renamed from: b */
    public static C3377g m4771b(Context context) {
        return C1143c.m4774e(context).m4757a(context);
    }

    /* renamed from: h */
    public Registry m4787h() {
        return this.f3744h;
    }

    /* renamed from: a */
    boolean m4779a(C3545h<?> c3545h) {
        synchronized (this.f3748l) {
            for (C3377g b : this.f3748l) {
                if (b.m17293b((C3545h) c3545h)) {
                    return true;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    void m4778a(C3377g c3377g) {
        synchronized (this.f3748l) {
            if (this.f3748l.contains(c3377g)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            this.f3748l.add(c3377g);
        }
    }

    /* renamed from: b */
    void m4781b(C3377g c3377g) {
        synchronized (this.f3748l) {
            if (this.f3748l.contains(c3377g)) {
                this.f3748l.remove(c3377g);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    public void onTrimMemory(int i) {
        m4777a(i);
    }

    public void onLowMemory() {
        m4785f();
    }
}
