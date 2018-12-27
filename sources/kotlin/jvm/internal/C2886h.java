package kotlin.jvm.internal;

import kotlin.p152c.C4326b;
import kotlin.p152c.C4327d;

/* renamed from: kotlin.jvm.internal.h */
public class C2886h {
    /* renamed from: a */
    private static final C2887i f12091a;
    /* renamed from: b */
    private static final C4326b[] f12092b = new C4326b[0];

    static {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r0 = 0;
        r1 = "kotlin.reflect.jvm.internal.ReflectionFactoryImpl";	 Catch:{ ClassCastException -> 0x000f, ClassCastException -> 0x000f, ClassCastException -> 0x000f, ClassCastException -> 0x000f }
        r1 = java.lang.Class.forName(r1);	 Catch:{ ClassCastException -> 0x000f, ClassCastException -> 0x000f, ClassCastException -> 0x000f, ClassCastException -> 0x000f }
        r1 = r1.newInstance();	 Catch:{ ClassCastException -> 0x000f, ClassCastException -> 0x000f, ClassCastException -> 0x000f, ClassCastException -> 0x000f }
        r1 = (kotlin.jvm.internal.C2887i) r1;	 Catch:{ ClassCastException -> 0x000f, ClassCastException -> 0x000f, ClassCastException -> 0x000f, ClassCastException -> 0x000f }
        r0 = r1;
        goto L_0x0010;
    L_0x0010:
        if (r0 == 0) goto L_0x0013;
    L_0x0012:
        goto L_0x0018;
    L_0x0013:
        r0 = new kotlin.jvm.internal.i;
        r0.<init>();
    L_0x0018:
        f12091a = r0;
        r0 = 0;
        r0 = new kotlin.p152c.C4326b[r0];
        f12092b = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.h.<clinit>():void");
    }

    /* renamed from: a */
    public static C4326b m13914a(Class cls) {
        return f12091a.m13918a(cls);
    }

    /* renamed from: a */
    public static String m13913a(Lambda lambda) {
        return f12091a.m13917a(lambda);
    }

    /* renamed from: a */
    public static C4327d m13915a(FunctionReference functionReference) {
        return f12091a.m13919a(functionReference);
    }
}
