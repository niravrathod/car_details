package com.google.gson.internal;

import com.google.gson.C2631g;
import com.google.gson.JsonIOException;
import com.google.gson.internal.p143a.C2638b;
import com.google.gson.p141b.C2624a;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* renamed from: com.google.gson.internal.b */
public final class C2640b {
    /* renamed from: a */
    private final Map<Type, C2631g<?>> f11160a;
    /* renamed from: b */
    private final C2638b f11161b = C2638b.m12928a();

    /* renamed from: com.google.gson.internal.b$2 */
    class C42192 implements C2649d<T> {
        /* renamed from: a */
        final /* synthetic */ C2640b f17793a;

        C42192(C2640b c2640b) {
            this.f17793a = c2640b;
        }

        /* renamed from: a */
        public T mo3341a() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: com.google.gson.internal.b$3 */
    class C42203 implements C2649d<T> {
        /* renamed from: a */
        final /* synthetic */ C2640b f17794a;

        C42203(C2640b c2640b) {
            this.f17794a = c2640b;
        }

        /* renamed from: a */
        public T mo3341a() {
            return new TreeMap();
        }
    }

    /* renamed from: com.google.gson.internal.b$4 */
    class C42214 implements C2649d<T> {
        /* renamed from: a */
        final /* synthetic */ C2640b f17795a;

        C42214(C2640b c2640b) {
            this.f17795a = c2640b;
        }

        /* renamed from: a */
        public T mo3341a() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: com.google.gson.internal.b$5 */
    class C42225 implements C2649d<T> {
        /* renamed from: a */
        final /* synthetic */ C2640b f17796a;

        C42225(C2640b c2640b) {
            this.f17796a = c2640b;
        }

        /* renamed from: a */
        public T mo3341a() {
            return new LinkedTreeMap();
        }
    }

    /* renamed from: com.google.gson.internal.b$9 */
    class C42269 implements C2649d<T> {
        /* renamed from: a */
        final /* synthetic */ C2640b f17806a;

        C42269(C2640b c2640b) {
            this.f17806a = c2640b;
        }

        /* renamed from: a */
        public T mo3341a() {
            return new TreeSet();
        }
    }

    public C2640b(Map<Type, C2631g<?>> map) {
        this.f11160a = map;
    }

    /* renamed from: a */
    public <T> C2649d<T> m12935a(C2624a<T> c2624a) {
        final Type type = c2624a.getType();
        Class rawType = c2624a.getRawType();
        final C2631g c2631g = (C2631g) this.f11160a.get(type);
        if (c2631g != null) {
            return new C2649d<T>(this) {
                /* renamed from: c */
                final /* synthetic */ C2640b f17792c;

                /* renamed from: a */
                public T mo3341a() {
                    return c2631g.m12892a(type);
                }
            };
        }
        c2631g = (C2631g) this.f11160a.get(rawType);
        if (c2631g != null) {
            return new C2649d<T>(this) {
                /* renamed from: c */
                final /* synthetic */ C2640b f17803c;

                /* renamed from: a */
                public T mo3341a() {
                    return c2631g.m12892a(type);
                }
            };
        }
        C2649d<T> a = m12932a(rawType);
        if (a != null) {
            return a;
        }
        a = m12933a(type, rawType);
        if (a != null) {
            return a;
        }
        return m12934b(type, rawType);
    }

    /* renamed from: a */
    private <T> com.google.gson.internal.C2649d<T> m12932a(java.lang.Class<? super T> r2) {
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
        r1 = this;
        r0 = 0;
        r0 = new java.lang.Class[r0];	 Catch:{ NoSuchMethodException -> 0x0018 }
        r2 = r2.getDeclaredConstructor(r0);	 Catch:{ NoSuchMethodException -> 0x0018 }
        r0 = r2.isAccessible();	 Catch:{ NoSuchMethodException -> 0x0018 }
        if (r0 != 0) goto L_0x0012;	 Catch:{ NoSuchMethodException -> 0x0018 }
    L_0x000d:
        r0 = r1.f11161b;	 Catch:{ NoSuchMethodException -> 0x0018 }
        r0.mo3340a(r2);	 Catch:{ NoSuchMethodException -> 0x0018 }
    L_0x0012:
        r0 = new com.google.gson.internal.b$8;	 Catch:{ NoSuchMethodException -> 0x0018 }
        r0.<init>(r1, r2);	 Catch:{ NoSuchMethodException -> 0x0018 }
        return r0;
    L_0x0018:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.b.a(java.lang.Class):com.google.gson.internal.d<T>");
    }

    /* renamed from: a */
    private <T> C2649d<T> m12933a(final Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new C42269(this);
            }
            if (EnumSet.class.isAssignableFrom(cls)) {
                return new C2649d<T>(this) {
                    /* renamed from: b */
                    final /* synthetic */ C2640b f17785b;

                    /* renamed from: a */
                    public T mo3341a() {
                        if (type instanceof ParameterizedType) {
                            Type type = ((ParameterizedType) type).getActualTypeArguments()[0];
                            if (type instanceof Class) {
                                return EnumSet.noneOf((Class) type);
                            }
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Invalid EnumSet type: ");
                            stringBuilder.append(type.toString());
                            throw new JsonIOException(stringBuilder.toString());
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Invalid EnumSet type: ");
                        stringBuilder.append(type.toString());
                        throw new JsonIOException(stringBuilder.toString());
                    }
                };
            }
            if (Set.class.isAssignableFrom(cls) != null) {
                return new C2649d<T>(this) {
                    /* renamed from: a */
                    final /* synthetic */ C2640b f17786a;

                    {
                        this.f17786a = r1;
                    }

                    /* renamed from: a */
                    public T mo3341a() {
                        return new LinkedHashSet();
                    }
                };
            }
            if (Queue.class.isAssignableFrom(cls) != null) {
                return new C2649d<T>(this) {
                    /* renamed from: a */
                    final /* synthetic */ C2640b f17787a;

                    {
                        this.f17787a = r1;
                    }

                    /* renamed from: a */
                    public T mo3341a() {
                        return new ArrayDeque();
                    }
                };
            }
            return new C2649d<T>(this) {
                /* renamed from: a */
                final /* synthetic */ C2640b f17788a;

                {
                    this.f17788a = r1;
                }

                /* renamed from: a */
                public T mo3341a() {
                    return new ArrayList();
                }
            };
        } else if (!Map.class.isAssignableFrom(cls)) {
            return null;
        } else {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                return new C2649d<T>(this) {
                    /* renamed from: a */
                    final /* synthetic */ C2640b f17789a;

                    {
                        this.f17789a = r1;
                    }

                    /* renamed from: a */
                    public T mo3341a() {
                        return new ConcurrentSkipListMap();
                    }
                };
            }
            if (ConcurrentMap.class.isAssignableFrom(cls)) {
                return new C42192(this);
            }
            if (SortedMap.class.isAssignableFrom(cls) != null) {
                return new C42203(this);
            }
            if ((type instanceof ParameterizedType) == null || String.class.isAssignableFrom(C2624a.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType()) != null) {
                return new C42225(this);
            }
            return new C42214(this);
        }
    }

    /* renamed from: b */
    private <T> C2649d<T> m12934b(final Type type, final Class<? super T> cls) {
        return new C2649d<T>(this) {
            /* renamed from: c */
            final /* synthetic */ C2640b f17799c;
            /* renamed from: d */
            private final C2655h f17800d = C2655h.m12957a();

            /* renamed from: a */
            public T mo3341a() {
                try {
                    return this.f17800d.mo3376a(cls);
                } catch (Throwable e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unable to invoke no-args constructor for ");
                    stringBuilder.append(type);
                    stringBuilder.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
                    throw new RuntimeException(stringBuilder.toString(), e);
                }
            }
        };
    }

    public String toString() {
        return this.f11160a.toString();
    }
}
