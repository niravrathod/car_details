package com.j256.ormlite.dao;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ReferenceObjectCache implements ObjectCache {
    private final ConcurrentHashMap<Class<?>, Map<Object, Reference<Object>>> classMaps = new ConcurrentHashMap();
    private final boolean useWeak;

    public ReferenceObjectCache(boolean z) {
        this.useWeak = z;
    }

    public static ReferenceObjectCache makeWeakCache() {
        return new ReferenceObjectCache(true);
    }

    public static ReferenceObjectCache makeSoftCache() {
        return new ReferenceObjectCache(false);
    }

    public synchronized <T> void registerClass(Class<T> cls) {
        if (((Map) this.classMaps.get(cls)) == null) {
            this.classMaps.put(cls, new ConcurrentHashMap());
        }
    }

    public <T, ID> T get(Class<T> cls, ID id) {
        cls = getMapForClass(cls);
        if (cls == null) {
            return null;
        }
        Reference reference = (Reference) cls.get(id);
        if (reference == null) {
            return null;
        }
        T t = reference.get();
        if (t != null) {
            return t;
        }
        cls.remove(id);
        return null;
    }

    public <T, ID> void put(Class<T> cls, ID id, T t) {
        cls = getMapForClass(cls);
        if (cls == null) {
            return;
        }
        if (this.useWeak) {
            cls.put(id, new WeakReference(t));
        } else {
            cls.put(id, new SoftReference(t));
        }
    }

    public <T> void clear(Class<T> cls) {
        cls = getMapForClass(cls);
        if (cls != null) {
            cls.clear();
        }
    }

    public void clearAll() {
        for (Map clear : this.classMaps.values()) {
            clear.clear();
        }
    }

    public <T, ID> void remove(Class<T> cls, ID id) {
        cls = getMapForClass(cls);
        if (cls != null) {
            cls.remove(id);
        }
    }

    public <T, ID> T updateId(Class<T> cls, ID id, ID id2) {
        cls = getMapForClass(cls);
        if (cls == null) {
            return null;
        }
        Reference reference = (Reference) cls.remove(id);
        if (reference == null) {
            return null;
        }
        cls.put(id2, reference);
        return reference.get();
    }

    public <T> int size(Class<T> cls) {
        cls = getMapForClass(cls);
        if (cls == null) {
            return null;
        }
        return cls.size();
    }

    public int sizeAll() {
        int i = 0;
        for (Map size : this.classMaps.values()) {
            i += size.size();
        }
        return i;
    }

    public <T> void cleanNullReferences(Class<T> cls) {
        cls = getMapForClass(cls);
        if (cls != null) {
            cleanMap(cls);
        }
    }

    public <T> void cleanNullReferencesAll() {
        for (Map cleanMap : this.classMaps.values()) {
            cleanMap(cleanMap);
        }
    }

    private void cleanMap(Map<Object, Reference<Object>> map) {
        map = map.entrySet().iterator();
        while (map.hasNext()) {
            if (((Reference) ((Entry) map.next()).getValue()).get() == null) {
                map.remove();
            }
        }
    }

    private Map<Object, Reference<Object>> getMapForClass(Class<?> cls) {
        Map map = (Map) this.classMaps.get(cls);
        return map == null ? null : map;
    }
}
