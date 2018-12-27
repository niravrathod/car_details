package com.google.android.exoplayer2.extractor.p130e;

import android.util.SparseArray;
import com.google.android.exoplayer2.extractor.C2261h;
import com.google.android.exoplayer2.p126c.C2175k;
import com.google.android.exoplayer2.p126c.C2183q;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.extractor.e.v */
public interface C2255v {

    /* renamed from: com.google.android.exoplayer2.extractor.e.v$a */
    public static final class C2251a {
        /* renamed from: a */
        public final String f7150a;
        /* renamed from: b */
        public final int f7151b;
        /* renamed from: c */
        public final byte[] f7152c;

        public C2251a(String str, int i, byte[] bArr) {
            this.f7150a = str;
            this.f7151b = i;
            this.f7152c = bArr;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.e.v$b */
    public static final class C2252b {
        /* renamed from: a */
        public final int f7153a;
        /* renamed from: b */
        public final String f7154b;
        /* renamed from: c */
        public final List<C2251a> f7155c;
        /* renamed from: d */
        public final byte[] f7156d;

        public C2252b(int i, String str, List<C2251a> list, byte[] bArr) {
            this.f7153a = i;
            this.f7154b = str;
            if (list == null) {
                i = Collections.emptyList();
            } else {
                i = Collections.unmodifiableList(list);
            }
            this.f7155c = i;
            this.f7156d = bArr;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.e.v$c */
    public interface C2253c {
        /* renamed from: a */
        SparseArray<C2255v> mo1613a();

        /* renamed from: a */
        C2255v mo1614a(int i, C2252b c2252b);
    }

    /* renamed from: com.google.android.exoplayer2.extractor.e.v$d */
    public static final class C2254d {
        /* renamed from: a */
        private final String f7157a;
        /* renamed from: b */
        private final int f7158b;
        /* renamed from: c */
        private final int f7159c;
        /* renamed from: d */
        private int f7160d;
        /* renamed from: e */
        private String f7161e;

        public C2254d(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        public C2254d(int i, int i2, int i3) {
            if (i != Integer.MIN_VALUE) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(i);
                stringBuilder.append("/");
                i = stringBuilder.toString();
            } else {
                i = "";
            }
            this.f7157a = i;
            this.f7158b = i2;
            this.f7159c = i3;
            this.f7160d = Integer.MIN_VALUE;
        }

        /* renamed from: a */
        public void m8283a() {
            this.f7160d = this.f7160d == Integer.MIN_VALUE ? this.f7158b : this.f7160d + this.f7159c;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f7157a);
            stringBuilder.append(this.f7160d);
            this.f7161e = stringBuilder.toString();
        }

        /* renamed from: b */
        public int m8284b() {
            m8282d();
            return this.f7160d;
        }

        /* renamed from: c */
        public String m8285c() {
            m8282d();
            return this.f7161e;
        }

        /* renamed from: d */
        private void m8282d() {
            if (this.f7160d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }
    }

    /* renamed from: a */
    void mo1615a();

    /* renamed from: a */
    void mo1616a(C2175k c2175k, boolean z);

    /* renamed from: a */
    void mo1617a(C2183q c2183q, C2261h c2261h, C2254d c2254d);
}
