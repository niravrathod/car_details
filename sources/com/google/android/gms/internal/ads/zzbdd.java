package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzbdd<MessageType extends zzbdd<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzbbl<MessageType, BuilderType> {
    private static Map<Object, zzbdd<?, ?>> zzdxu = new ConcurrentHashMap();
    protected zzbfv zzdxs = zzbfv.m10372a();
    private int zzdxt = -1;

    public enum zze {
        /* renamed from: a */
        public static final int f9166a = 1;
        /* renamed from: b */
        public static final int f9167b = 2;
        /* renamed from: c */
        public static final int f9168c = 3;
        /* renamed from: d */
        public static final int f9169d = 4;
        /* renamed from: e */
        public static final int f9170e = 5;
        /* renamed from: f */
        public static final int f9171f = 6;
        /* renamed from: g */
        public static final int f9172g = 7;
        /* renamed from: h */
        public static final int f9173h = 1;
        /* renamed from: i */
        public static final int f9174i = 2;
        /* renamed from: j */
        public static final int f9175j = 1;
        /* renamed from: k */
        public static final int f9176k = 2;
        /* renamed from: l */
        private static final /* synthetic */ int[] f9177l = new int[]{f9166a, f9167b, f9168c, f9169d, f9170e, f9171f, f9172g};
        /* renamed from: m */
        private static final /* synthetic */ int[] f9178m = new int[]{f9173h, f9174i};
        /* renamed from: n */
        private static final /* synthetic */ int[] f9179n = new int[]{f9175j, f9176k};

        /* renamed from: a */
        public static int[] m10324a() {
            return (int[]) f9177l.clone();
        }
    }

    public static class zzd<ContainingType extends zzbel, Type> extends zzbco<ContainingType, Type> {
    }

    public static class zzb<T extends zzbdd<T, ?>> extends zzbbn<T> {
        /* renamed from: a */
        private final T f20051a;

        public zzb(T t) {
            this.f20051a = t;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo4253a(zzbcf zzbcf, zzbcq zzbcq) {
            return zzbdd.m28344a(this.f20051a, zzbcf, zzbcq);
        }
    }

    public static abstract class zza<MessageType extends zzbdd<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzbbm<MessageType, BuilderType> {
        /* renamed from: a */
        protected MessageType f21364a;
        /* renamed from: b */
        private final MessageType f21365b;
        /* renamed from: c */
        private boolean f21366c = null;

        protected zza(MessageType messageType) {
            this.f21365b = messageType;
            this.f21364a = (zzbdd) messageType.mo4959a(zze.f9169d, null, null);
        }

        /* renamed from: b */
        protected final void m28335b() {
            if (this.f21366c) {
                zzbdd zzbdd = (zzbdd) this.f21364a.mo4959a(zze.f9169d, null, null);
                m28331a(zzbdd, this.f21364a);
                this.f21364a = zzbdd;
                this.f21366c = false;
            }
        }

        /* renamed from: k */
        public final boolean mo4805k() {
            return zzbdd.m28350a(this.f21364a, false);
        }

        /* renamed from: c */
        public MessageType m28336c() {
            if (this.f21366c) {
                return this.f21364a;
            }
            Object obj = this.f21364a;
            mh.m9048a().m9051a(obj).mo2116c(obj);
            this.f21366c = true;
            return this.f21364a;
        }

        /* renamed from: d */
        public final MessageType m28337d() {
            Object obj = (zzbdd) mo4803e();
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) obj.mo4959a(zze.f9166a, null, null)).byteValue();
            boolean z = true;
            if (byteValue != (byte) 1) {
                if (byteValue == (byte) 0) {
                    z = false;
                } else {
                    z = mh.m9048a().m9051a(obj).mo2117d(obj);
                    if (booleanValue) {
                        obj.mo4959a(zze.f9167b, z ? obj : null, null);
                    }
                }
            }
            if (z) {
                return obj;
            }
            throw new zzbft(obj);
        }

        /* renamed from: a */
        public final BuilderType m28334a(MessageType messageType) {
            m28335b();
            m28331a(this.f21364a, messageType);
            return this;
        }

        /* renamed from: a */
        private static void m28331a(MessageType messageType, MessageType messageType2) {
            mh.m9048a().m9051a((Object) messageType).mo2115b(messageType, messageType2);
        }

        /* renamed from: a */
        protected final /* synthetic */ zzbbm mo4801a(zzbbl zzbbl) {
            return m28334a((zzbdd) zzbbl);
        }

        /* renamed from: a */
        public final /* synthetic */ zzbbm mo4800a() {
            return (zza) clone();
        }

        /* renamed from: e */
        public /* synthetic */ zzbel mo4803e() {
            return m28336c();
        }

        /* renamed from: f */
        public /* synthetic */ zzbel mo4804f() {
            return m28337d();
        }

        /* renamed from: q */
        public final /* synthetic */ zzbel mo4806q() {
            return this.f21365b;
        }

        public /* synthetic */ Object clone() {
            zza zza = (zza) this.f21365b.mo4959a(zze.f9170e, null, null);
            zza.m28334a((zzbdd) mo4803e());
            return zza;
        }
    }

    public static abstract class zzc<MessageType extends zzc<MessageType, BuilderType>, BuilderType> extends zzbdd<MessageType, BuilderType> implements zzben {
        protected lb<Object> zzdxy = lb.m8996a();
    }

    /* renamed from: a */
    protected abstract Object mo4959a(int i, Object obj, Object obj2);

    public String toString() {
        return lz.m9040a(this, super.toString());
    }

    public int hashCode() {
        if (this.zzdst != 0) {
            return this.zzdst;
        }
        this.zzdst = mh.m9048a().m9051a((Object) this).mo2108a(this);
        return this.zzdst;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (((zzbdd) mo4959a(zze.f9171f, null, null)).getClass().isInstance(obj)) {
            return mh.m9048a().m9051a((Object) this).mo2113a((Object) this, (zzbdd) obj);
        }
        return null;
    }

    /* renamed from: k */
    public final boolean mo4805k() {
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) mo4959a(zze.f9166a, null, null)).byteValue();
        if (byteValue == (byte) 1) {
            return true;
        }
        if (byteValue == (byte) 0) {
            return false;
        }
        boolean d = mh.m9048a().m9051a((Object) this).mo2117d(this);
        if (booleanValue) {
            mo4959a(zze.f9167b, d ? this : null, null);
        }
        return d;
    }

    /* renamed from: j */
    final int mo4809j() {
        return this.zzdxt;
    }

    /* renamed from: a */
    final void mo4807a(int i) {
        this.zzdxt = i;
    }

    /* renamed from: a */
    public final void mo4808a(zzbck zzbck) {
        mh.m9048a().m9050a(getClass()).mo2111a((Object) this, kv.m20683a(zzbck));
    }

    /* renamed from: l */
    public final int mo4810l() {
        if (this.zzdxt == -1) {
            this.zzdxt = mh.m9048a().m9051a((Object) this).mo2114b(this);
        }
        return this.zzdxt;
    }

    /* renamed from: a */
    static <T extends zzbdd<?, ?>> T m28346a(Class<T> cls) {
        T t = (zzbdd) zzdxu.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (zzbdd) zzdxu.get(cls);
            } catch (Class<T> cls2) {
                throw new IllegalStateException("Class initialization cannot fail.", cls2);
            }
        }
        if (t != null) {
            return t;
        }
        String str = "Unable to get default instance for: ";
        cls2 = String.valueOf(cls2.getName());
        throw new IllegalStateException(cls2.length() != 0 ? str.concat(cls2) : new String(str));
    }

    /* renamed from: a */
    protected static <T extends zzbdd<?, ?>> void m28349a(Class<T> cls, T t) {
        zzdxu.put(cls, t);
    }

    /* renamed from: a */
    protected static Object m28347a(zzbel zzbel, String str, Object[] objArr) {
        return new mj(zzbel, str, objArr);
    }

    /* renamed from: a */
    static Object m28348a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (Method method2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", method2);
        } catch (Method method22) {
            method22 = method22.getCause();
            if ((method22 instanceof RuntimeException) != null) {
                throw ((RuntimeException) method22);
            } else if ((method22 instanceof Error) != null) {
                throw ((Error) method22);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", method22);
            }
        }
    }

    /* renamed from: a */
    protected static final <T extends zzbdd<T, ?>> boolean m28350a(T t, boolean z) {
        z = ((Byte) t.mo4959a(zze.f9166a, null, null)).byteValue();
        if (z) {
            return true;
        }
        if (z) {
            return mh.m9048a().m9051a((Object) t).mo2117d(t);
        }
        return null;
    }

    /* renamed from: m */
    protected static zzbdj m28352m() {
        return lh.m26075d();
    }

    /* renamed from: n */
    protected static <E> zzbdk<E> m28353n() {
        return mi.m26087d();
    }

    /* renamed from: a */
    static <T extends zzbdd<T, ?>> T m28344a(T t, zzbcf zzbcf, zzbcq zzbcq) {
        Object obj = (zzbdd) t.mo4959a(zze.f9169d, null, null);
        try {
            mh.m9048a().m9051a(obj).mo2110a(obj, ks.m20632a(zzbcf), zzbcq);
            mh.m9048a().m9051a(obj).mo2116c(obj);
            return obj;
        } catch (zzbcf zzbcf2) {
            if ((zzbcf2.getCause() instanceof zzbdl) != null) {
                throw ((zzbdl) zzbcf2.getCause());
            }
            throw new zzbdl(zzbcf2.getMessage()).m10349a(obj);
        } catch (T t2) {
            if ((t2.getCause() instanceof zzbdl) != null) {
                throw ((zzbdl) t2.getCause());
            }
            throw t2;
        }
    }

    /* renamed from: b */
    private static <T extends com.google.android.gms.internal.ads.zzbdd<T, ?>> T m28351b(T r6, byte[] r7) {
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
        r0 = com.google.android.gms.internal.ads.zzbdd.zze.f9169d;
        r1 = 0;
        r6 = r6.mo4959a(r0, r1, r1);
        r6 = (com.google.android.gms.internal.ads.zzbdd) r6;
        r0 = com.google.android.gms.internal.ads.mh.m9048a();	 Catch:{ IOException -> 0x003c, IndexOutOfBoundsException -> 0x0033 }
        r0 = r0.m9051a(r6);	 Catch:{ IOException -> 0x003c, IndexOutOfBoundsException -> 0x0033 }
        r3 = 0;	 Catch:{ IOException -> 0x003c, IndexOutOfBoundsException -> 0x0033 }
        r4 = r7.length;	 Catch:{ IOException -> 0x003c, IndexOutOfBoundsException -> 0x0033 }
        r5 = new com.google.android.gms.internal.ads.ki;	 Catch:{ IOException -> 0x003c, IndexOutOfBoundsException -> 0x0033 }
        r5.<init>();	 Catch:{ IOException -> 0x003c, IndexOutOfBoundsException -> 0x0033 }
        r1 = r6;	 Catch:{ IOException -> 0x003c, IndexOutOfBoundsException -> 0x0033 }
        r2 = r7;	 Catch:{ IOException -> 0x003c, IndexOutOfBoundsException -> 0x0033 }
        r0.mo2112a(r1, r2, r3, r4, r5);	 Catch:{ IOException -> 0x003c, IndexOutOfBoundsException -> 0x0033 }
        r7 = com.google.android.gms.internal.ads.mh.m9048a();	 Catch:{ IOException -> 0x003c, IndexOutOfBoundsException -> 0x0033 }
        r7 = r7.m9051a(r6);	 Catch:{ IOException -> 0x003c, IndexOutOfBoundsException -> 0x0033 }
        r7.mo2116c(r6);	 Catch:{ IOException -> 0x003c, IndexOutOfBoundsException -> 0x0033 }
        r7 = r6.zzdst;	 Catch:{ IOException -> 0x003c, IndexOutOfBoundsException -> 0x0033 }
        if (r7 != 0) goto L_0x002d;	 Catch:{ IOException -> 0x003c, IndexOutOfBoundsException -> 0x0033 }
    L_0x002c:
        return r6;	 Catch:{ IOException -> 0x003c, IndexOutOfBoundsException -> 0x0033 }
    L_0x002d:
        r7 = new java.lang.RuntimeException;	 Catch:{ IOException -> 0x003c, IndexOutOfBoundsException -> 0x0033 }
        r7.<init>();	 Catch:{ IOException -> 0x003c, IndexOutOfBoundsException -> 0x0033 }
        throw r7;	 Catch:{ IOException -> 0x003c, IndexOutOfBoundsException -> 0x0033 }
    L_0x0033:
        r7 = com.google.android.gms.internal.ads.zzbdl.m10340a();
        r6 = r7.m10349a(r6);
        throw r6;
    L_0x003c:
        r7 = move-exception;
        r0 = r7.getCause();
        r0 = r0 instanceof com.google.android.gms.internal.ads.zzbdl;
        if (r0 == 0) goto L_0x004c;
    L_0x0045:
        r6 = r7.getCause();
        r6 = (com.google.android.gms.internal.ads.zzbdl) r6;
        throw r6;
    L_0x004c:
        r0 = new com.google.android.gms.internal.ads.zzbdl;
        r7 = r7.getMessage();
        r0.<init>(r7);
        r6 = r0.m10349a(r6);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbdd.b(com.google.android.gms.internal.ads.zzbdd, byte[]):T");
    }

    /* renamed from: a */
    protected static <T extends zzbdd<T, ?>> T m28342a(T t, zzbbu zzbbu) {
        boolean booleanValue;
        byte byteValue;
        Object a = m28343a((zzbdd) t, zzbbu, zzbcq.m10311a());
        zzbbu = null;
        if (a != null) {
            boolean z;
            booleanValue = Boolean.TRUE.booleanValue();
            byteValue = ((Byte) a.mo4959a(zze.f9166a, null, null)).byteValue();
            if (byteValue == (byte) 1) {
                z = true;
            } else if (byteValue == (byte) 0) {
                z = false;
            } else {
                z = mh.m9048a().m9051a(a).mo2117d(a);
                if (booleanValue) {
                    a.mo4959a(zze.f9167b, z ? a : null, null);
                }
            }
            if (!z) {
                throw new zzbft(a).m10371a().m10349a(a);
            }
        }
        if (a != null) {
            booleanValue = Boolean.TRUE.booleanValue();
            byteValue = ((Byte) a.mo4959a(zze.f9166a, null, null)).byteValue();
            if (byteValue == (byte) 1) {
                zzbbu = true;
            } else if (byteValue != (byte) 0) {
                zzbbu = mh.m9048a().m9051a(a).mo2117d(a);
                if (booleanValue) {
                    a.mo4959a(zze.f9167b, zzbbu != null ? a : null, null);
                }
            }
            if (zzbbu == null) {
                throw new zzbft(a).m10371a().m10349a(a);
            }
        }
        return a;
    }

    /* renamed from: a */
    private static <T extends zzbdd<T, ?>> T m28343a(T t, zzbbu zzbbu, zzbcq zzbcq) {
        try {
            zzbcf e = zzbbu.mo4223e();
            t = m28344a((zzbdd) t, e, zzbcq);
            e.mo1975a((int) null);
            return t;
        } catch (zzbbu zzbbu2) {
            throw zzbbu2.m10349a(t);
        } catch (T t2) {
            throw t2;
        }
    }

    /* renamed from: a */
    protected static <T extends zzbdd<T, ?>> T m28345a(T t, byte[] bArr) {
        Object b = m28351b(t, bArr);
        if (b != null) {
            bArr = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) b.mo4959a(zze.f9166a, null, null)).byteValue();
            boolean z = true;
            if (byteValue != (byte) 1) {
                if (byteValue == (byte) 0) {
                    z = false;
                } else {
                    z = mh.m9048a().m9051a(b).mo2117d(b);
                    if (bArr != null) {
                        b.mo4959a(zze.f9167b, z ? b : null, null);
                    }
                }
            }
            if (!z) {
                throw new zzbft(b).m10371a().m10349a(b);
            }
        }
        return b;
    }

    /* renamed from: o */
    public final /* synthetic */ zzbem mo4811o() {
        zza zza = (zza) mo4959a(zze.f9170e, null, null);
        zza.m28334a(this);
        return zza;
    }

    /* renamed from: p */
    public final /* synthetic */ zzbem mo4812p() {
        return (zza) mo4959a(zze.f9170e, null, null);
    }

    /* renamed from: q */
    public final /* synthetic */ zzbel mo4806q() {
        return (zzbdd) mo4959a(zze.f9171f, null, null);
    }
}
