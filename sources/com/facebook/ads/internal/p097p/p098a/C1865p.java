package com.facebook.ads.internal.p097p.p098a;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.facebook.ads.internal.p.a.p */
public class C1865p implements Map<String, String> {
    /* renamed from: a */
    private Map<String, String> f5707a = new HashMap();

    /* renamed from: a */
    public C1865p m7121a(Map<? extends String, ? extends String> map) {
        putAll(map);
        return this;
    }

    /* renamed from: a */
    public String m7122a() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : this.f5707a.keySet()) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append("&");
            }
            stringBuilder.append(str);
            String str2 = (String) this.f5707a.get(str2);
            if (str2 != null) {
                stringBuilder.append(SimpleComparison.EQUAL_TO_OPERATION);
                try {
                    stringBuilder.append(URLEncoder.encode(str2, "UTF-8"));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public String m7123a(Object obj) {
        return (String) this.f5707a.get(obj);
    }

    /* renamed from: a */
    public String m7124a(String str, String str2) {
        return (String) this.f5707a.put(str, str2);
    }

    /* renamed from: b */
    public String m7125b(Object obj) {
        return (String) this.f5707a.remove(obj);
    }

    /* renamed from: b */
    public byte[] m7126b() {
        try {
            return m7122a().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void clear() {
        this.f5707a.clear();
    }

    public boolean containsKey(Object obj) {
        return this.f5707a.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return this.f5707a.containsValue(obj);
    }

    public Set<Entry<String, String>> entrySet() {
        return this.f5707a.entrySet();
    }

    public /* synthetic */ Object get(Object obj) {
        return m7123a(obj);
    }

    public boolean isEmpty() {
        return this.f5707a.isEmpty();
    }

    public Set<String> keySet() {
        return this.f5707a.keySet();
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        return m7124a((String) obj, (String) obj2);
    }

    public void putAll(Map<? extends String, ? extends String> map) {
        this.f5707a.putAll(map);
    }

    public /* synthetic */ Object remove(Object obj) {
        return m7125b(obj);
    }

    public int size() {
        return this.f5707a.size();
    }

    public Collection<String> values() {
        return this.f5707a.values();
    }
}
