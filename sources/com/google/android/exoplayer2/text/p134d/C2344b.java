package com.google.android.exoplayer2.text.p134d;

import android.text.SpannableStringBuilder;
import com.google.android.exoplayer2.p126c.C2163a;
import com.google.android.exoplayer2.text.C2333a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: com.google.android.exoplayer2.text.d.b */
final class C2344b {
    /* renamed from: a */
    public final String f7423a;
    /* renamed from: b */
    public final String f7424b;
    /* renamed from: c */
    public final boolean f7425c;
    /* renamed from: d */
    public final long f7426d;
    /* renamed from: e */
    public final long f7427e;
    /* renamed from: f */
    public final C2347e f7428f;
    /* renamed from: g */
    public final String f7429g;
    /* renamed from: h */
    private final String[] f7430h;
    /* renamed from: i */
    private final HashMap<String, Integer> f7431i;
    /* renamed from: j */
    private final HashMap<String, Integer> f7432j;
    /* renamed from: k */
    private List<C2344b> f7433k;

    /* renamed from: a */
    public static C2344b m8548a(String str) {
        return new C2344b(null, C2346d.m8561a(str), -9223372036854775807L, -9223372036854775807L, null, null, "");
    }

    /* renamed from: a */
    public static C2344b m8549a(String str, long j, long j2, C2347e c2347e, String[] strArr, String str2) {
        return new C2344b(str, null, j, j2, c2347e, strArr, str2);
    }

    private C2344b(String str, String str2, long j, long j2, C2347e c2347e, String[] strArr, String str3) {
        this.f7423a = str;
        this.f7424b = str2;
        this.f7428f = c2347e;
        this.f7430h = strArr;
        this.f7425c = str2 != null ? true : null;
        this.f7426d = j;
        this.f7427e = j2;
        this.f7429g = (String) C2163a.m7914a((Object) str3);
        this.f7431i = new HashMap();
        this.f7432j = new HashMap();
    }

    /* renamed from: a */
    public boolean m8558a(long j) {
        return (!(this.f7426d == -9223372036854775807L && this.f7427e == -9223372036854775807L) && ((this.f7426d > j || this.f7427e != -9223372036854775807L) && ((this.f7426d != -9223372036854775807L || j >= this.f7427e) && (this.f7426d > j || j >= this.f7427e)))) ? 0 : 1;
    }

    /* renamed from: a */
    public void m8557a(C2344b c2344b) {
        if (this.f7433k == null) {
            this.f7433k = new ArrayList();
        }
        this.f7433k.add(c2344b);
    }

    /* renamed from: a */
    public C2344b m8555a(int i) {
        if (this.f7433k != null) {
            return (C2344b) this.f7433k.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: a */
    public int m8554a() {
        return this.f7433k == null ? 0 : this.f7433k.size();
    }

    /* renamed from: b */
    public long[] m8559b() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        m8553a(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            int i2 = i + 1;
            jArr[i] = ((Long) it.next()).longValue();
            i = i2;
        }
        return jArr;
    }

    /* renamed from: a */
    private void m8553a(TreeSet<Long> treeSet, boolean z) {
        boolean equals = "p".equals(this.f7423a);
        if (z || equals) {
            if (this.f7426d != -9223372036854775807L) {
                treeSet.add(Long.valueOf(this.f7426d));
            }
            if (this.f7427e != -9223372036854775807L) {
                treeSet.add(Long.valueOf(this.f7427e));
            }
        }
        if (this.f7433k != null) {
            for (int i = 0; i < this.f7433k.size(); i++) {
                boolean z2;
                C2344b c2344b = (C2344b) this.f7433k.get(i);
                if (!z) {
                    if (!equals) {
                        z2 = false;
                        c2344b.m8553a((TreeSet) treeSet, z2);
                    }
                }
                z2 = true;
                c2344b.m8553a((TreeSet) treeSet, z2);
            }
        }
    }

    /* renamed from: a */
    public List<C2333a> m8556a(long j, Map<String, C2347e> map, Map<String, C2345c> map2) {
        Map treeMap = new TreeMap();
        m8550a(j, false, this.f7429g, treeMap);
        m8552a((Map) map, treeMap);
        j = new ArrayList();
        for (Entry entry : treeMap.entrySet()) {
            C2345c c2345c = (C2345c) map2.get(entry.getKey());
            j.add(new C2333a(m8546a((SpannableStringBuilder) entry.getValue()), null, c2345c.f7436c, c2345c.f7437d, c2345c.f7438e, c2345c.f7435b, Integer.MIN_VALUE, c2345c.f7439f));
        }
        return j;
    }

    /* renamed from: a */
    private void m8550a(long j, boolean z, String str, Map<String, SpannableStringBuilder> map) {
        this.f7431i.clear();
        this.f7432j.clear();
        String str2 = this.f7429g;
        if (!"".equals(str2)) {
            str = str2;
        }
        if (this.f7425c && z) {
            C2344b.m8547a(str, (Map) map).append(this.f7424b);
        } else if ("br".equals(this.f7423a) && z) {
            C2344b.m8547a(str, (Map) map).append('\n');
        } else if (!"metadata".equals(this.f7423a)) {
            if (m8558a(j)) {
                boolean equals = "p".equals(this.f7423a);
                for (Entry entry : map.entrySet()) {
                    this.f7431i.put(entry.getKey(), Integer.valueOf(((SpannableStringBuilder) entry.getValue()).length()));
                }
                for (int i = 0; i < m8554a(); i++) {
                    boolean z2;
                    C2344b a = m8555a(i);
                    if (!z) {
                        if (!equals) {
                            z2 = false;
                            a.m8550a(j, z2, str, (Map) map);
                        }
                    }
                    z2 = true;
                    a.m8550a(j, z2, str, (Map) map);
                }
                if (equals) {
                    C2346d.m8562a(C2344b.m8547a(str, (Map) map));
                }
                for (Entry entry2 : map.entrySet()) {
                    this.f7432j.put(entry2.getKey(), Integer.valueOf(((SpannableStringBuilder) entry2.getValue()).length()));
                }
            }
        }
    }

    /* renamed from: a */
    private static SpannableStringBuilder m8547a(String str, Map<String, SpannableStringBuilder> map) {
        if (!map.containsKey(str)) {
            map.put(str, new SpannableStringBuilder());
        }
        return (SpannableStringBuilder) map.get(str);
    }

    /* renamed from: a */
    private void m8552a(Map<String, C2347e> map, Map<String, SpannableStringBuilder> map2) {
        for (Entry entry : this.f7432j.entrySet()) {
            String str = (String) entry.getKey();
            m8551a((Map) map, (SpannableStringBuilder) map2.get(str), this.f7431i.containsKey(str) ? ((Integer) this.f7431i.get(str)).intValue() : 0, ((Integer) entry.getValue()).intValue());
            for (int i = 0; i < m8554a(); i++) {
                m8555a(i).m8552a((Map) map, (Map) map2);
            }
        }
    }

    /* renamed from: a */
    private void m8551a(Map<String, C2347e> map, SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        if (i != i2) {
            map = C2346d.m8560a(this.f7428f, this.f7430h, map);
            if (map != null) {
                C2346d.m8563a(spannableStringBuilder, i, i2, map);
            }
        }
    }

    /* renamed from: a */
    private SpannableStringBuilder m8546a(SpannableStringBuilder spannableStringBuilder) {
        int i;
        int i2 = 0;
        int length = spannableStringBuilder.length();
        for (i = 0; i < length; i++) {
            if (spannableStringBuilder.charAt(i) == ' ') {
                int i3 = i + 1;
                int i4 = i3;
                while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                    i4++;
                }
                i4 -= i3;
                if (i4 > 0) {
                    spannableStringBuilder.delete(i, i + i4);
                    length -= i4;
                }
            }
        }
        if (length > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
            length--;
        }
        i = 0;
        while (true) {
            i3 = length - 1;
            if (i >= i3) {
                break;
            }
            if (spannableStringBuilder.charAt(i) == '\n') {
                i3 = i + 1;
                if (spannableStringBuilder.charAt(i3) == ' ') {
                    spannableStringBuilder.delete(i3, i + 2);
                    length--;
                }
            }
            i++;
        }
        if (length > 0 && spannableStringBuilder.charAt(i3) == ' ') {
            spannableStringBuilder.delete(i3, length);
            length--;
        }
        while (true) {
            i = length - 1;
            if (i2 >= i) {
                break;
            }
            if (spannableStringBuilder.charAt(i2) == ' ') {
                i = i2 + 1;
                if (spannableStringBuilder.charAt(i) == '\n') {
                    spannableStringBuilder.delete(i2, i);
                    length--;
                }
            }
            i2++;
        }
        if (length > 0 && spannableStringBuilder.charAt(i) == '\n') {
            spannableStringBuilder.delete(i, length);
        }
        return spannableStringBuilder;
    }
}
