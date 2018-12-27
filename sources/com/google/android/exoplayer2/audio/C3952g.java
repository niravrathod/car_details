package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor.UnhandledFormatException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.exoplayer2.audio.g */
final class C3952g implements AudioProcessor {
    /* renamed from: b */
    private int f15719b = -1;
    /* renamed from: c */
    private int f15720c = -1;
    /* renamed from: d */
    private int f15721d = 0;
    /* renamed from: e */
    private ByteBuffer f15722e = a;
    /* renamed from: f */
    private ByteBuffer f15723f = a;
    /* renamed from: g */
    private boolean f15724g;

    /* renamed from: c */
    public int mo1534c() {
        return 2;
    }

    /* renamed from: a */
    public boolean mo1532a(int i, int i2, int i3) {
        if (!(i3 == 3 || i3 == 2 || i3 == Integer.MIN_VALUE)) {
            if (i3 != 1073741824) {
                throw new UnhandledFormatException(i, i2, i3);
            }
        }
        if (this.f15719b == i && this.f15720c == i2 && this.f15721d == i3) {
            return false;
        }
        this.f15719b = i;
        this.f15720c = i2;
        this.f15721d = i3;
        if (i3 == 2) {
            this.f15722e = a;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo1531a() {
        return (this.f15721d == 0 || this.f15721d == 2) ? false : true;
    }

    /* renamed from: b */
    public int mo1533b() {
        return this.f15720c;
    }

    /* renamed from: a */
    public void mo1530a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.f15721d;
        if (i2 == Integer.MIN_VALUE) {
            i = (i / 3) * 2;
        } else if (i2 == 3) {
            i *= 2;
        } else if (i2 == 1073741824) {
            i /= 2;
        } else {
            throw new IllegalStateException();
        }
        if (this.f15722e.capacity() < i) {
            this.f15722e = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f15722e.clear();
        }
        i = this.f15721d;
        if (i == Integer.MIN_VALUE) {
            while (position < limit) {
                this.f15722e.put(byteBuffer.get(position + 1));
                this.f15722e.put(byteBuffer.get(position + 2));
                position += 3;
            }
        } else if (i == 3) {
            while (position < limit) {
                this.f15722e.put((byte) 0);
                this.f15722e.put((byte) ((byteBuffer.get(position) & 255) - 128));
                position++;
            }
        } else if (i == 1073741824) {
            while (position < limit) {
                this.f15722e.put(byteBuffer.get(position + 2));
                this.f15722e.put(byteBuffer.get(position + 3));
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        this.f15722e.flip();
        this.f15723f = this.f15722e;
    }

    /* renamed from: d */
    public void mo1535d() {
        this.f15724g = true;
    }

    /* renamed from: e */
    public ByteBuffer mo1536e() {
        ByteBuffer byteBuffer = this.f15723f;
        this.f15723f = a;
        return byteBuffer;
    }

    /* renamed from: f */
    public boolean mo1537f() {
        return this.f15724g && this.f15723f == a;
    }

    /* renamed from: g */
    public void mo1538g() {
        this.f15723f = a;
        this.f15724g = false;
    }

    /* renamed from: h */
    public void mo1539h() {
        mo1538g();
        this.f15722e = a;
        this.f15719b = -1;
        this.f15720c = -1;
        this.f15721d = 0;
    }
}
