package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor.UnhandledFormatException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.audio.d */
final class C3950d implements AudioProcessor {
    /* renamed from: b */
    private int f15710b = -1;
    /* renamed from: c */
    private int f15711c = -1;
    /* renamed from: d */
    private int[] f15712d;
    /* renamed from: e */
    private boolean f15713e;
    /* renamed from: f */
    private int[] f15714f;
    /* renamed from: g */
    private ByteBuffer f15715g = a;
    /* renamed from: h */
    private ByteBuffer f15716h = a;
    /* renamed from: i */
    private boolean f15717i;

    /* renamed from: c */
    public int mo1534c() {
        return 2;
    }

    /* renamed from: a */
    public void m19637a(int[] iArr) {
        this.f15712d = iArr;
    }

    /* renamed from: a */
    public boolean mo1532a(int i, int i2, int i3) {
        boolean equals = Arrays.equals(this.f15712d, this.f15714f) ^ true;
        this.f15714f = this.f15712d;
        if (this.f15714f == null) {
            this.f15713e = false;
            return equals;
        } else if (i3 != 2) {
            throw new UnhandledFormatException(i, i2, i3);
        } else if (!equals && this.f15711c == i && this.f15710b == i2) {
            return false;
        } else {
            this.f15711c = i;
            this.f15710b = i2;
            this.f15713e = i2 != this.f15714f.length;
            int i4 = 0;
            while (i4 < this.f15714f.length) {
                int i5 = this.f15714f[i4];
                if (i5 < i2) {
                    this.f15713e = (i5 != i4 ? 1 : 0) | this.f15713e;
                    i4++;
                } else {
                    throw new UnhandledFormatException(i, i2, i3);
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo1531a() {
        return this.f15713e;
    }

    /* renamed from: b */
    public int mo1533b() {
        return this.f15714f == null ? this.f15710b : this.f15714f.length;
    }

    /* renamed from: a */
    public void mo1530a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = (((limit - position) / (this.f15710b * 2)) * this.f15714f.length) * 2;
        if (this.f15715g.capacity() < length) {
            this.f15715g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f15715g.clear();
        }
        while (position < limit) {
            for (int i : this.f15714f) {
                this.f15715g.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.f15710b * 2;
        }
        byteBuffer.position(limit);
        this.f15715g.flip();
        this.f15716h = this.f15715g;
    }

    /* renamed from: d */
    public void mo1535d() {
        this.f15717i = true;
    }

    /* renamed from: e */
    public ByteBuffer mo1536e() {
        ByteBuffer byteBuffer = this.f15716h;
        this.f15716h = a;
        return byteBuffer;
    }

    /* renamed from: f */
    public boolean mo1537f() {
        return this.f15717i && this.f15716h == a;
    }

    /* renamed from: g */
    public void mo1538g() {
        this.f15716h = a;
        this.f15717i = false;
    }

    /* renamed from: h */
    public void mo1539h() {
        mo1538g();
        this.f15715g = a;
        this.f15710b = -1;
        this.f15711c = -1;
        this.f15714f = null;
        this.f15713e = false;
    }
}
