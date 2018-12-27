package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzvm<MessageType extends zzvm<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zztw<MessageType, BuilderType> {
    private static Map<Object, zzvm<?, ?>> zzbyo = new ConcurrentHashMap();
    protected zzyc zzbym = zzyc.m12111a();
    private int zzbyn = -1;

    public enum zze {
        /* renamed from: a */
        public static final int f10267a = 1;
        /* renamed from: b */
        public static final int f10268b = 2;
        /* renamed from: c */
        public static final int f10269c = 3;
        /* renamed from: d */
        public static final int f10270d = 4;
        /* renamed from: e */
        public static final int f10271e = 5;
        /* renamed from: f */
        public static final int f10272f = 6;
        /* renamed from: g */
        public static final int f10273g = 7;
        /* renamed from: h */
        public static final int f10274h = 1;
        /* renamed from: i */
        public static final int f10275i = 2;
        /* renamed from: j */
        public static final int f10276j = 1;
        /* renamed from: k */
        public static final int f10277k = 2;
        /* renamed from: l */
        private static final /* synthetic */ int[] f10278l = new int[]{f10267a, f10268b, f10269c, f10270d, f10271e, f10272f, f10273g};
        /* renamed from: m */
        private static final /* synthetic */ int[] f10279m = new int[]{f10274h, f10275i};
        /* renamed from: n */
        private static final /* synthetic */ int[] f10280n = new int[]{f10276j, f10277k};

        /* renamed from: a */
        public static int[] m12065a() {
            return (int[]) f10278l.clone();
        }
    }

    public static class zzd<ContainingType extends zzwt, Type> extends zzux<ContainingType, Type> {
    }

    public static class zzb<T extends zzvm<T, ?>> extends zzty<T> {
        /* renamed from: a */
        private final T f20667a;

        public zzb(T t) {
            this.f20667a = t;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo4387a(zzuo zzuo, zzuz zzuz) {
            return zzvm.m28420a(this.f20667a, zzuo, zzuz);
        }
    }

    public static abstract class zza<MessageType extends zzvm<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zztx<MessageType, BuilderType> {
        /* renamed from: a */
        private final MessageType f21376a;
        /* renamed from: b */
        private MessageType f21377b;
        /* renamed from: c */
        private boolean f21378c = null;

        protected zza(MessageType messageType) {
            this.f21376a = messageType;
            this.f21377b = (zzvm) messageType.mo4960a(zze.f10270d, null, null);
        }

        /* renamed from: e */
        public final boolean mo4830e() {
            return zzvm.m28425a(this.f21377b, false);
        }

        /* renamed from: b */
        public MessageType m28414b() {
            if (this.f21378c) {
                return this.f21377b;
            }
            Object obj = this.f21377b;
            cq.m11570a().m11573a(obj).mo3070c(obj);
            this.f21378c = true;
            return this.f21377b;
        }

        /* renamed from: c */
        public final MessageType m28415c() {
            Object obj = (zzvm) mo4829d();
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) obj.mo4960a(zze.f10267a, null, null)).byteValue();
            boolean z = true;
            if (byteValue != (byte) 1) {
                if (byteValue == (byte) 0) {
                    z = false;
                } else {
                    z = cq.m11570a().m11573a(obj).mo3071d(obj);
                    if (booleanValue) {
                        obj.mo4960a(zze.f10268b, z ? obj : null, null);
                    }
                }
            }
            if (z) {
                return obj;
            }
            throw new zzya(obj);
        }

        /* renamed from: a */
        public final BuilderType m28413a(MessageType messageType) {
            if (this.f21378c) {
                zzvm zzvm = (zzvm) this.f21377b.mo4960a(zze.f10270d, null, null);
                m28410a(zzvm, this.f21377b);
                this.f21377b = zzvm;
                this.f21378c = false;
            }
            m28410a(this.f21377b, messageType);
            return this;
        }

        /* renamed from: a */
        private static void m28410a(MessageType messageType, MessageType messageType2) {
            cq.m11570a().m11573a((Object) messageType).mo3069b(messageType, messageType2);
        }

        /* renamed from: a */
        protected final /* synthetic */ zztx mo4827a(zztw zztw) {
            return m28413a((zzvm) zztw);
        }

        /* renamed from: a */
        public final /* synthetic */ zztx mo4826a() {
            return (zza) clone();
        }

        /* renamed from: d */
        public /* synthetic */ zzwt mo4829d() {
            return m28414b();
        }

        /* renamed from: f */
        public /* synthetic */ zzwt mo4831f() {
            return m28415c();
        }

        /* renamed from: j */
        public final /* synthetic */ zzwt mo4832j() {
            return this.f21376a;
        }

        public /* synthetic */ Object clone() {
            zza zza = (zza) this.f21376a.mo4960a(zze.f10271e, null, null);
            zza.m28413a((zzvm) mo4829d());
            return zza;
        }
    }

    public static abstract class zzc<MessageType extends zzc<MessageType, BuilderType>, BuilderType> extends zzvm<MessageType, BuilderType> implements zzwv {
        protected bl<Object> zzbys = bl.m11518a();
    }

    /* renamed from: a */
    protected abstract Object mo4960a(int i, Object obj, Object obj2);

    public String toString() {
        return cj.m11562a(this, super.toString());
    }

    public int hashCode() {
        if (this.zzbtr != 0) {
            return this.zzbtr;
        }
        this.zzbtr = cq.m11570a().m11573a((Object) this).mo3063a(this);
        return this.zzbtr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (((zzvm) mo4960a(zze.f10272f, null, null)).getClass().isInstance(obj)) {
            return cq.m11570a().m11573a((Object) this).mo3067a((Object) this, (zzvm) obj);
        }
        return null;
    }

    /* renamed from: e */
    public final boolean mo4830e() {
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) mo4960a(zze.f10267a, null, null)).byteValue();
        if (byteValue == (byte) 1) {
            return true;
        }
        if (byteValue == (byte) 0) {
            return false;
        }
        boolean d = cq.m11570a().m11573a((Object) this).mo3071d(this);
        if (booleanValue) {
            mo4960a(zze.f10268b, d ? this : null, null);
        }
        return d;
    }

    /* renamed from: d */
    final int mo4835d() {
        return this.zzbyn;
    }

    /* renamed from: a */
    final void mo4833a(int i) {
        this.zzbyn = i;
    }

    /* renamed from: a */
    public final void mo4834a(zzut zzut) {
        cq.m11570a().m11572a(getClass()).mo3066a((Object) this, bf.m22263a(zzut));
    }

    /* renamed from: f */
    public final int mo4836f() {
        if (this.zzbyn == -1) {
            this.zzbyn = cq.m11570a().m11573a((Object) this).mo3068b(this);
        }
        return this.zzbyn;
    }

    /* renamed from: a */
    static <T extends zzvm<?, ?>> T m28421a(Class<T> cls) {
        T t = (zzvm) zzbyo.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (zzvm) zzbyo.get(cls);
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
    protected static <T extends zzvm<?, ?>> void m28424a(Class<T> cls, T t) {
        zzbyo.put(cls, t);
    }

    /* renamed from: a */
    protected static Object m28422a(zzwt zzwt, String str, Object[] objArr) {
        return new cs(zzwt, str, objArr);
    }

    /* renamed from: a */
    static Object m28423a(Method method, Object obj, Object... objArr) {
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
    protected static final <T extends zzvm<T, ?>> boolean m28425a(T t, boolean z) {
        z = ((Byte) t.mo4960a(zze.f10267a, null, null)).byteValue();
        if (z) {
            return true;
        }
        if (z) {
            return cq.m11570a().m11573a((Object) t).mo3071d(t);
        }
        return null;
    }

    /* renamed from: g */
    protected static <E> zzvs<E> m28426g() {
        return cr.m27090d();
    }

    /* renamed from: a */
    static <T extends zzvm<T, ?>> T m28420a(T t, zzuo zzuo, zzuz zzuz) {
        Object obj = (zzvm) t.mo4960a(zze.f10270d, null, null);
        try {
            cq.m11570a().m11573a(obj).mo3065a(obj, bc.m22212a(zzuo), zzuz);
            cq.m11570a().m11573a(obj).mo3070c(obj);
            return obj;
        } catch (zzuo zzuo2) {
            if ((zzuo2.getCause() instanceof zzvt) != null) {
                throw ((zzvt) zzuo2.getCause());
            }
            throw new zzvt(zzuo2.getMessage()).m12089a(obj);
        } catch (T t2) {
            if ((t2.getCause() instanceof zzvt) != null) {
                throw ((zzvt) t2.getCause());
            }
            throw t2;
        }
    }

    /* renamed from: h */
    public final /* synthetic */ zzwu mo4837h() {
        zza zza = (zza) mo4960a(zze.f10271e, null, null);
        zza.m28413a(this);
        return zza;
    }

    /* renamed from: i */
    public final /* synthetic */ zzwu mo4838i() {
        return (zza) mo4960a(zze.f10271e, null, null);
    }

    /* renamed from: j */
    public final /* synthetic */ zzwt mo4832j() {
        return (zzvm) mo4960a(zze.f10272f, null, null);
    }
}
