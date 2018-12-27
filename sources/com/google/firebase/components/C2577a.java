package com.google.firebase.components;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@KeepForSdk
/* renamed from: com.google.firebase.components.a */
public final class C2577a<T> {
    /* renamed from: a */
    private final Set<Class<? super T>> f10957a;
    /* renamed from: b */
    private final Set<C2581e> f10958b;
    /* renamed from: c */
    private final int f10959c;
    /* renamed from: d */
    private final C2579c<T> f10960d;
    /* renamed from: e */
    private final Set<Class<?>> f10961e;

    /* renamed from: com.google.firebase.components.a$1 */
    public static /* synthetic */ class C25751<T> {
        /* renamed from: a */
        private final T f10950a;
        /* renamed from: b */
        private final C2582i<T> f10951b;

        /* renamed from: a */
        public static C25751<Context> m12617a(Context context) {
            return new C25751(context, new C4189h());
        }

        private C25751(T t, C2582i<T> c2582i) {
            this.f10950a = t;
            this.f10951b = c2582i;
        }

        /* renamed from: a */
        public List<C2580d> m12621a() {
            return C25751.m12620b(this.f10951b.mo3313a(this.f10950a));
        }

        /* renamed from: b */
        private static List<C2580d> m12620b(List<String> list) {
            List<C2580d> arrayList = new ArrayList();
            for (String cls : list) {
                try {
                    Class cls2 = Class.forName(cls);
                    if (C2580d.class.isAssignableFrom(cls2)) {
                        arrayList.add((C2580d) cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } else {
                        Log.w("ComponentDiscovery", String.format("Class %s is not an instance of %s", new Object[]{cls, "com.google.firebase.components.ComponentRegistrar"}));
                    }
                } catch (Throwable e) {
                    Log.w("ComponentDiscovery", String.format("Class %s is not an found.", new Object[]{cls}), e);
                } catch (Throwable e2) {
                    Log.w("ComponentDiscovery", String.format("Could not instantiate %s.", new Object[]{cls}), e2);
                } catch (Throwable e22) {
                    Log.w("ComponentDiscovery", String.format("Could not instantiate %s.", new Object[]{cls}), e22);
                } catch (Throwable e222) {
                    Log.w("ComponentDiscovery", String.format("Could not instantiate %s", new Object[]{cls}), e222);
                } catch (Throwable e2222) {
                    Log.w("ComponentDiscovery", String.format("Could not instantiate %s", new Object[]{cls}), e2222);
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        static List<C2577a<?>> m12618a(List<C2577a<?>> list) {
            Map hashMap = new HashMap(list.size());
            for (C2577a c2577a : list) {
                C2583k c2583k = new C2583k(c2577a);
                for (Class put : c2577a.m12632a()) {
                    if (hashMap.put(put, c2583k) != null) {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{(Class) r2.next()}));
                    }
                }
            }
            for (C2583k c2583k2 : hashMap.values()) {
                for (C2581e c2581e : c2583k2.m12648b().m12633b()) {
                    if (c2581e.m12644c()) {
                        C2583k c2583k3 = (C2583k) hashMap.get(c2581e.m12642a());
                        if (c2583k3 != null) {
                            c2583k2.m12647a(c2583k3);
                            c2583k3.m12649b(c2583k2);
                        }
                    }
                }
            }
            Set<C2583k> hashSet = new HashSet(hashMap.values());
            Set a = C25751.m12619a((Set) hashSet);
            List<C2577a<?>> arrayList = new ArrayList();
            while (!a.isEmpty()) {
                c2583k = (C2583k) a.iterator().next();
                a.remove(c2583k);
                arrayList.add(c2583k.m12648b());
                for (C2583k c2583k4 : c2583k.m12646a()) {
                    c2583k4.m12650c(c2583k);
                    if (c2583k4.m12651c()) {
                        a.add(c2583k4);
                    }
                }
            }
            if (arrayList.size() == list.size()) {
                Collections.reverse(arrayList);
                return arrayList;
            }
            list = new ArrayList();
            for (C2583k c2583k5 : hashSet) {
                if (!(c2583k5.m12651c() || c2583k5.m12652d())) {
                    list.add(c2583k5.m12648b());
                }
            }
            throw new DependencyCycleException(list);
        }

        /* renamed from: a */
        private static Set<C2583k> m12619a(Set<C2583k> set) {
            Set<C2583k> hashSet = new HashSet();
            for (C2583k c2583k : set) {
                if (c2583k.m12651c()) {
                    hashSet.add(c2583k);
                }
            }
            return hashSet;
        }
    }

    @KeepForSdk
    /* renamed from: com.google.firebase.components.a$a */
    public static class C2576a<T> {
        /* renamed from: a */
        private final Set<Class<? super T>> f10952a;
        /* renamed from: b */
        private final Set<C2581e> f10953b;
        /* renamed from: c */
        private int f10954c;
        /* renamed from: d */
        private C2579c<T> f10955d;
        /* renamed from: e */
        private Set<Class<?>> f10956e;

        private C2576a(Class<T> cls, Class<? super T>... clsArr) {
            this.f10952a = new HashSet();
            this.f10953b = new HashSet();
            int i = 0;
            this.f10954c = 0;
            this.f10956e = new HashSet();
            Preconditions.checkNotNull(cls, "Null interface");
            this.f10952a.add(cls);
            cls = clsArr.length;
            while (i < cls) {
                Preconditions.checkNotNull(clsArr[i], "Null interface");
                i++;
            }
            Collections.addAll(this.f10952a, clsArr);
        }

        @KeepForSdk
        /* renamed from: a */
        public C2576a<T> m12625a(C2581e c2581e) {
            Preconditions.checkNotNull(c2581e, "Null dependency");
            Preconditions.checkArgument(this.f10952a.contains(c2581e.m12642a()) ^ 1, "Components are not allowed to depend on interfaces they themselves provide.");
            this.f10953b.add(c2581e);
            return this;
        }

        @KeepForSdk
        /* renamed from: a */
        public C2576a<T> m12623a() {
            return m12622a(1);
        }

        @KeepForSdk
        /* renamed from: b */
        public C2576a<T> m12626b() {
            return m12622a(2);
        }

        /* renamed from: a */
        private C2576a<T> m12622a(int i) {
            Preconditions.checkState(this.f10954c == 0, "Instantiation type has already been set.");
            this.f10954c = i;
            return this;
        }

        @KeepForSdk
        /* renamed from: a */
        public C2576a<T> m12624a(C2579c<T> c2579c) {
            this.f10955d = (C2579c) Preconditions.checkNotNull(c2579c, "Null factory");
            return this;
        }

        @KeepForSdk
        /* renamed from: c */
        public C2577a<T> m12627c() {
            Preconditions.checkState(this.f10955d != null, "Missing required property: factory.");
            return new C2577a(new HashSet(this.f10952a), new HashSet(this.f10953b), this.f10954c, this.f10955d, this.f10956e);
        }
    }

    /* renamed from: a */
    static /* synthetic */ Object m12631a(Object obj) {
        return obj;
    }

    private C2577a(Set<Class<? super T>> set, Set<C2581e> set2, int i, C2579c<T> c2579c, Set<Class<?>> set3) {
        this.f10957a = Collections.unmodifiableSet(set);
        this.f10958b = Collections.unmodifiableSet(set2);
        this.f10959c = i;
        this.f10960d = c2579c;
        this.f10961e = Collections.unmodifiableSet(set3);
    }

    /* renamed from: a */
    public final Set<Class<? super T>> m12632a() {
        return this.f10957a;
    }

    /* renamed from: b */
    public final Set<C2581e> m12633b() {
        return this.f10958b;
    }

    /* renamed from: c */
    public final C2579c<T> m12634c() {
        return this.f10960d;
    }

    /* renamed from: d */
    public final Set<Class<?>> m12635d() {
        return this.f10961e;
    }

    /* renamed from: e */
    public final boolean m12636e() {
        return this.f10959c == 1;
    }

    /* renamed from: f */
    public final boolean m12637f() {
        return this.f10959c == 2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Component<");
        stringBuilder.append(Arrays.toString(this.f10957a.toArray()));
        stringBuilder.append(">{");
        stringBuilder.append(this.f10959c);
        stringBuilder.append(", deps=");
        stringBuilder.append(Arrays.toString(this.f10958b.toArray()));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    @KeepForSdk
    /* renamed from: a */
    public static <T> C2576a<T> m12628a(Class<T> cls) {
        return new C2576a(cls, new Class[0]);
    }

    @KeepForSdk
    /* renamed from: a */
    public static <T> C2576a<T> m12629a(Class<T> cls, Class<? super T>... clsArr) {
        return new C2576a(cls, clsArr);
    }

    @KeepForSdk
    @SafeVarargs
    /* renamed from: a */
    public static <T> C2577a<T> m12630a(T t, Class<T> cls, Class<? super T>... clsArr) {
        return C2577a.m12629a(cls, clsArr).m12624a(C4188g.m23030a((Object) t)).m12627c();
    }
}
