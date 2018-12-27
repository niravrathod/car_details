package com.j256.ormlite.dao;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class LruObjectCache implements ObjectCache {
    private final int capacity;
    private final ConcurrentHashMap<Class<?>, Map<Object, Object>> classMaps = new ConcurrentHashMap();

    private static class LimitedLinkedHashMap<K, V> extends LinkedHashMap<K, V> {
        private static final long serialVersionUID = -4566528080395573236L;
        private final int capacity;

        public LimitedLinkedHashMap(int i) {
            super(i, 0.75f, true);
            this.capacity = i;
        }

        protected boolean removeEldestEntry(Entry<K, V> entry) {
            return size() > this.capacity ? true : null;
        }
    }

    public LruObjectCache(int i) {
        this.capacity = i;
    }

    public synchronized <T> void registerClass(Class<T> cls) {
        if (((Map) this.classMaps.get(cls)) == null) {
            this.classMaps.put(cls, Collections.synchronizedMap(new LimitedLinkedHashMap(this.capacity)));
        }
    }

    public <T, ID> T get(Class<T> cls, ID id) {
        cls = getMapForClass(cls);
        if (cls == null) {
            return null;
        }
        return cls.get(id);
    }

    public <T, ID> void put(Class<T> cls, ID id, T t) {
        cls = getMapForClass(cls);
        if (cls != null) {
            cls.put(id, t);
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
        id = cls.remove(id);
        if (id == null) {
            return null;
        }
        cls.put(id2, id);
        return id;
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

    private Map<Object, Object> getMapForClass(Class<?> cls) {
        Map map = (Map) this.classMaps.get(cls);
        return map == null ? null : map;
    }
}
