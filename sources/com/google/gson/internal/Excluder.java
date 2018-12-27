package com.google.gson.internal;

import com.google.gson.C2625b;
import com.google.gson.C2629e;
import com.google.gson.C2660q;
import com.google.gson.C2661r;
import com.google.gson.p140a.C2622d;
import com.google.gson.p140a.C2623e;
import com.google.gson.p141b.C2624a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.Collections;
import java.util.List;

public final class Excluder implements C2661r, Cloneable {
    /* renamed from: a */
    public static final Excluder f17772a = new Excluder();
    /* renamed from: b */
    private double f17773b = -1.0d;
    /* renamed from: c */
    private int f17774c = 136;
    /* renamed from: d */
    private boolean f17775d = true;
    /* renamed from: e */
    private boolean f17776e;
    /* renamed from: f */
    private List<C2625b> f17777f = Collections.emptyList();
    /* renamed from: g */
    private List<C2625b> f17778g = Collections.emptyList();

    protected /* synthetic */ Object clone() {
        return m23132a();
    }

    /* renamed from: a */
    protected Excluder m23132a() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public <T> C2660q<T> mo3339a(C2629e c2629e, C2624a<T> c2624a) {
        boolean z;
        boolean z2;
        final C2629e c2629e2;
        final C2624a<T> c2624a2;
        Class rawType = c2624a.getRawType();
        boolean a = m23127a(rawType);
        if (!a) {
            if (!m23129b(rawType, true)) {
                z = false;
                if (!a) {
                    if (m23129b(rawType, false)) {
                        z2 = false;
                        if (z && !z2) {
                            return null;
                        }
                        c2629e2 = c2629e;
                        c2624a2 = c2624a;
                        return new C2660q<T>(this) {
                            /* renamed from: e */
                            final /* synthetic */ Excluder f17770e;
                            /* renamed from: f */
                            private C2660q<T> f17771f;

                            /* renamed from: b */
                            public T mo3332b(JsonReader jsonReader) {
                                if (!z2) {
                                    return m23121b().mo3332b(jsonReader);
                                }
                                jsonReader.skipValue();
                                return null;
                            }

                            /* renamed from: a */
                            public void mo3331a(JsonWriter jsonWriter, T t) {
                                if (z) {
                                    jsonWriter.nullValue();
                                } else {
                                    m23121b().mo3331a(jsonWriter, t);
                                }
                            }

                            /* renamed from: b */
                            private C2660q<T> m23121b() {
                                C2660q<T> c2660q = this.f17771f;
                                if (c2660q != null) {
                                    return c2660q;
                                }
                                c2660q = c2629e2.m12874a(this.f17770e, c2624a2);
                                this.f17771f = c2660q;
                                return c2660q;
                            }
                        };
                    }
                }
                z2 = true;
                if (z) {
                }
                c2629e2 = c2629e;
                c2624a2 = c2624a;
                return /* anonymous class already generated */;
            }
        }
        z = true;
        if (a) {
            if (m23129b(rawType, false)) {
                z2 = false;
                if (z) {
                }
                c2629e2 = c2629e;
                c2624a2 = c2624a;
                return /* anonymous class already generated */;
            }
        }
        z2 = true;
        if (z) {
        }
        c2629e2 = c2629e;
        c2624a2 = c2624a;
        return /* anonymous class already generated */;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public boolean m23135a(java.lang.reflect.Field r7, boolean r8) {
        /* JADX: method processing error */
/*
Error: java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:410)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.fixIterableType(LoopRegionVisitor.java:308)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkIterableForEach(LoopRegionVisitor.java:249)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.processLoopRegion(LoopRegionVisitor.java:68)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.enterRegion(LoopRegionVisitor.java:52)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:56)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:18)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:46)
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
        r6 = this;
        r0 = r6.f17774c;
        r1 = r7.getModifiers();
        r0 = r0 & r1;
        r1 = 1;
        if (r0 == 0) goto L_0x000b;
    L_0x000a:
        return r1;
    L_0x000b:
        r2 = r6.f17773b;
        r4 = -4616189618054758400; // 0xbff0000000000000 float:0.0 double:-1.0;
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 == 0) goto L_0x002a;
    L_0x0013:
        r0 = com.google.gson.p140a.C2622d.class;
        r0 = r7.getAnnotation(r0);
        r0 = (com.google.gson.p140a.C2622d) r0;
        r2 = com.google.gson.p140a.C2623e.class;
        r2 = r7.getAnnotation(r2);
        r2 = (com.google.gson.p140a.C2623e) r2;
        r0 = r6.m23125a(r0, r2);
        if (r0 != 0) goto L_0x002a;
    L_0x0029:
        return r1;
    L_0x002a:
        r0 = r7.isSynthetic();
        if (r0 == 0) goto L_0x0031;
    L_0x0030:
        return r1;
    L_0x0031:
        r0 = r6.f17776e;
        if (r0 == 0) goto L_0x004f;
    L_0x0035:
        r0 = com.google.gson.p140a.C2619a.class;
        r0 = r7.getAnnotation(r0);
        r0 = (com.google.gson.p140a.C2619a) r0;
        if (r0 == 0) goto L_0x004e;
    L_0x003f:
        if (r8 == 0) goto L_0x0048;
    L_0x0041:
        r0 = r0.m12852a();
        if (r0 != 0) goto L_0x004f;
    L_0x0047:
        goto L_0x004e;
    L_0x0048:
        r0 = r0.m12853b();
        if (r0 != 0) goto L_0x004f;
    L_0x004e:
        return r1;
    L_0x004f:
        r0 = r6.f17775d;
        if (r0 != 0) goto L_0x005e;
    L_0x0053:
        r0 = r7.getType();
        r0 = r6.m23130c(r0);
        if (r0 == 0) goto L_0x005e;
    L_0x005d:
        return r1;
    L_0x005e:
        r0 = r7.getType();
        r0 = r6.m23128b(r0);
        if (r0 == 0) goto L_0x0069;
    L_0x0068:
        return r1;
    L_0x0069:
        if (r8 == 0) goto L_0x006e;
    L_0x006b:
        r8 = r6.f17777f;
        goto L_0x0070;
    L_0x006e:
        r8 = r6.f17778g;
    L_0x0070:
        r0 = r8.isEmpty();
        if (r0 != 0) goto L_0x0092;
    L_0x0076:
        r0 = new com.google.gson.c;
        r0.<init>(r7);
        r7 = r8.iterator();
    L_0x007f:
        r8 = r7.hasNext();
        if (r8 == 0) goto L_0x0092;
    L_0x0085:
        r8 = r7.next();
        r8 = (com.google.gson.C2625b) r8;
        r8 = r8.m12860a(r0);
        if (r8 == 0) goto L_0x007f;
    L_0x0091:
        return r1;
    L_0x0092:
        r7 = 0;
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.Excluder.a(java.lang.reflect.Field, boolean):boolean");
    }

    /* renamed from: a */
    private boolean m23127a(Class<?> cls) {
        if (this.f17773b != -1.0d && !m23125a((C2622d) cls.getAnnotation(C2622d.class), (C2623e) cls.getAnnotation(C2623e.class))) {
            return true;
        }
        if ((this.f17775d || !m23130c(cls)) && m23128b(cls) == null) {
            return null;
        }
        return true;
    }

    /* renamed from: a */
    public boolean m23134a(Class<?> cls, boolean z) {
        if (!m23127a((Class) cls)) {
            if (m23129b(cls, z) == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: b */
    private boolean m23129b(Class<?> cls, boolean z) {
        for (C2625b a : z ? this.f17777f : this.f17778g) {
            if (a.m12861a((Class) cls)) {
                return true;
            }
        }
        return null;
    }

    /* renamed from: b */
    private boolean m23128b(Class<?> cls) {
        return (Enum.class.isAssignableFrom(cls) || (!cls.isAnonymousClass() && cls.isLocalClass() == null)) ? null : true;
    }

    /* renamed from: c */
    private boolean m23130c(Class<?> cls) {
        return (cls.isMemberClass() && m23131d(cls) == null) ? true : null;
    }

    /* renamed from: d */
    private boolean m23131d(Class<?> cls) {
        return (cls.getModifiers() & 8) != null ? true : null;
    }

    /* renamed from: a */
    private boolean m23125a(C2622d c2622d, C2623e c2623e) {
        return (m23124a(c2622d) == null || m23126a(c2623e) == null) ? null : true;
    }

    /* renamed from: a */
    private boolean m23124a(C2622d c2622d) {
        return (c2622d == null || c2622d.m12858a() <= this.f17773b) ? true : null;
    }

    /* renamed from: a */
    private boolean m23126a(C2623e c2623e) {
        return (c2623e == null || c2623e.m12859a() > this.f17773b) ? true : null;
    }
}
