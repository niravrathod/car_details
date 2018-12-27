package android.arch.lifecycle;

import android.arch.lifecycle.Lifecycle.Event;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: android.arch.lifecycle.a */
class C0018a {
    /* renamed from: a */
    static C0018a f45a = new C0018a();
    /* renamed from: b */
    private final Map<Class, C0016a> f46b = new HashMap();
    /* renamed from: c */
    private final Map<Class, Boolean> f47c = new HashMap();

    /* renamed from: android.arch.lifecycle.a$a */
    static class C0016a {
        /* renamed from: a */
        final Map<Event, List<C0017b>> f41a = new HashMap();
        /* renamed from: b */
        final Map<C0017b, Event> f42b;

        C0016a(Map<C0017b, Event> map) {
            this.f42b = map;
            map = map.entrySet().iterator();
            while (map.hasNext()) {
                Entry entry = (Entry) map.next();
                Event event = (Event) entry.getValue();
                List list = (List) this.f41a.get(event);
                if (list == null) {
                    list = new ArrayList();
                    this.f41a.put(event, list);
                }
                list.add(entry.getKey());
            }
        }

        /* renamed from: a */
        void m49a(C0023f c0023f, Event event, Object obj) {
            C0016a.m48a((List) this.f41a.get(event), c0023f, event, obj);
            C0016a.m48a((List) this.f41a.get(Event.ON_ANY), c0023f, event, obj);
        }

        /* renamed from: a */
        private static void m48a(List<C0017b> list, C0023f c0023f, Event event, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((C0017b) list.get(size)).m50a(c0023f, event, obj);
                }
            }
        }
    }

    /* renamed from: android.arch.lifecycle.a$b */
    static class C0017b {
        /* renamed from: a */
        final int f43a;
        /* renamed from: b */
        final Method f44b;

        C0017b(int i, Method method) {
            this.f43a = i;
            this.f44b = method;
            this.f44b.setAccessible(true);
        }

        /* renamed from: a */
        void m50a(C0023f c0023f, Event event, Object obj) {
            try {
                switch (this.f43a) {
                    case 0:
                        this.f44b.invoke(obj, new Object[0]);
                        return;
                    case 1:
                        this.f44b.invoke(obj, new Object[]{c0023f});
                        return;
                    case 2:
                        this.f44b.invoke(obj, new Object[]{c0023f, event});
                        return;
                    default:
                        return;
                }
            } catch (C0023f c0023f2) {
                throw new RuntimeException("Failed to call observer method", c0023f2.getCause());
            } catch (C0023f c0023f22) {
                throw new RuntimeException(c0023f22);
            }
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    C0017b c0017b = (C0017b) obj;
                    if (this.f43a != c0017b.f43a || this.f44b.getName().equals(c0017b.f44b.getName()) == null) {
                        z = false;
                    }
                    return z;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f43a * 31) + this.f44b.getName().hashCode();
        }
    }

    C0018a() {
    }

    /* renamed from: a */
    boolean m54a(Class cls) {
        if (this.f47c.containsKey(cls)) {
            return ((Boolean) this.f47c.get(cls)).booleanValue();
        }
        Method[] c = m53c(cls);
        for (Method annotation : c) {
            if (((C0029m) annotation.getAnnotation(C0029m.class)) != null) {
                m51a(cls, c);
                return true;
            }
        }
        this.f47c.put(cls, Boolean.valueOf(false));
        return false;
    }

    /* renamed from: c */
    private Method[] m53c(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (Class cls2) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", cls2);
        }
    }

    /* renamed from: b */
    C0016a m55b(Class cls) {
        C0016a c0016a = (C0016a) this.f46b.get(cls);
        if (c0016a != null) {
            return c0016a;
        }
        return m51a(cls, null);
    }

    /* renamed from: a */
    private void m52a(Map<C0017b, Event> map, C0017b c0017b, Event event, Class cls) {
        Event event2 = (Event) map.get(c0017b);
        if (event2 != null) {
            if (event != event2) {
                map = c0017b.f44b;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Method ");
                stringBuilder.append(map.getName());
                stringBuilder.append(" in ");
                stringBuilder.append(cls.getName());
                stringBuilder.append(" already declared with different @OnLifecycleEvent value: previous value ");
                stringBuilder.append(event2);
                stringBuilder.append(", new value ");
                stringBuilder.append(event);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        if (event2 == null) {
            map.put(c0017b, event);
        }
    }

    /* renamed from: a */
    private C0016a m51a(Class cls, Method[] methodArr) {
        Class superclass = cls.getSuperclass();
        Map hashMap = new HashMap();
        if (superclass != null) {
            C0016a b = m55b(superclass);
            if (b != null) {
                hashMap.putAll(b.f42b);
            }
        }
        for (Class b2 : cls.getInterfaces()) {
            for (Entry entry : m55b(b2).f42b.entrySet()) {
                m52a(hashMap, (C0017b) entry.getKey(), (Event) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m53c(cls);
        }
        boolean z = false;
        for (Method method : r13) {
            C0029m c0029m = (C0029m) method.getAnnotation(C0029m.class);
            if (c0029m != null) {
                int i;
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(C0023f.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                Event a = c0029m.m73a();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(Event.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (a == Event.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m52a(hashMap, new C0017b(i, method), a, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        methodArr = new C0016a(hashMap);
        this.f46b.put(cls, methodArr);
        this.f47c.put(cls, Boolean.valueOf(z));
        return methodArr;
    }
}
