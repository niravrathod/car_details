package com.google.android.exoplayer2.p124a;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.exoplayer2.a.e */
public class C3946e extends C2123a {
    /* renamed from: a */
    public final C2126b f15687a = new C2126b();
    /* renamed from: b */
    public ByteBuffer f15688b;
    /* renamed from: c */
    public long f15689c;
    /* renamed from: d */
    private final int f15690d;

    /* renamed from: e */
    public static C3946e m19604e() {
        return new C3946e(0);
    }

    public C3946e(int i) {
        this.f15690d = i;
    }

    /* renamed from: e */
    public void m19607e(int i) {
        if (this.f15688b == null) {
            this.f15688b = m19605f(i);
            return;
        }
        int capacity = this.f15688b.capacity();
        int position = this.f15688b.position();
        i += position;
        if (capacity < i) {
            i = m19605f(i);
            if (position > 0) {
                this.f15688b.position(0);
                this.f15688b.limit(position);
                i.put(this.f15688b);
            }
            this.f15688b = i;
        }
    }

    /* renamed from: f */
    public final boolean m19608f() {
        return this.f15688b == null && this.f15690d == 0;
    }

    /* renamed from: g */
    public final boolean m19609g() {
        return m7764d(1073741824);
    }

    /* renamed from: h */
    public final void m19610h() {
        this.f15688b.flip();
    }

    /* renamed from: a */
    public void mo1520a() {
        super.mo1520a();
        if (this.f15688b != null) {
            this.f15688b.clear();
        }
    }

    /* renamed from: f */
    private ByteBuffer m19605f(int i) {
        if (this.f15690d == 1) {
            return ByteBuffer.allocate(i);
        }
        if (this.f15690d == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        int capacity = this.f15688b == null ? 0 : this.f15688b.capacity();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Buffer too small (");
        stringBuilder.append(capacity);
        stringBuilder.append(" < ");
        stringBuilder.append(i);
        stringBuilder.append(")");
        throw new IllegalStateException(stringBuilder.toString());
    }
}
