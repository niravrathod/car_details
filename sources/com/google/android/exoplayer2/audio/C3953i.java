package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor.UnhandledFormatException;
import com.google.android.exoplayer2.p126c.C2186s;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: com.google.android.exoplayer2.audio.i */
public final class C3953i implements AudioProcessor {
    /* renamed from: b */
    private int f15725b = -1;
    /* renamed from: c */
    private int f15726c = -1;
    /* renamed from: d */
    private C2149h f15727d;
    /* renamed from: e */
    private float f15728e = 1.0f;
    /* renamed from: f */
    private float f15729f = 1.0f;
    /* renamed from: g */
    private ByteBuffer f15730g = a;
    /* renamed from: h */
    private ShortBuffer f15731h = this.f15730g.asShortBuffer();
    /* renamed from: i */
    private ByteBuffer f15732i = a;
    /* renamed from: j */
    private long f15733j;
    /* renamed from: k */
    private long f15734k;
    /* renamed from: l */
    private boolean f15735l;

    /* renamed from: c */
    public int mo1534c() {
        return 2;
    }

    /* renamed from: a */
    public float m19660a(float f) {
        this.f15728e = C2186s.m8039a(f, 0.1f, 8.0f);
        return this.f15728e;
    }

    /* renamed from: b */
    public float m19664b(float f) {
        this.f15729f = C2186s.m8039a(f, 0.1f, 8.0f);
        return f;
    }

    /* renamed from: i */
    public long m19672i() {
        return this.f15733j;
    }

    /* renamed from: j */
    public long m19673j() {
        return this.f15734k;
    }

    /* renamed from: a */
    public boolean mo1532a(int i, int i2, int i3) {
        if (i3 != 2) {
            throw new UnhandledFormatException(i, i2, i3);
        } else if (this.f15726c == i && this.f15725b == i2) {
            return false;
        } else {
            this.f15726c = i;
            this.f15725b = i2;
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo1531a() {
        if (Math.abs(this.f15728e - 1.0f) < 0.01f) {
            if (Math.abs(this.f15729f - 1.0f) < 0.01f) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public int mo1533b() {
        return this.f15725b;
    }

    /* renamed from: a */
    public void mo1530a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f15733j += (long) remaining;
            this.f15727d.m7893a(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        byteBuffer = (this.f15727d.m7894b() * this.f15725b) * 2;
        if (byteBuffer > null) {
            if (this.f15730g.capacity() < byteBuffer) {
                this.f15730g = ByteBuffer.allocateDirect(byteBuffer).order(ByteOrder.nativeOrder());
                this.f15731h = this.f15730g.asShortBuffer();
            } else {
                this.f15730g.clear();
                this.f15731h.clear();
            }
            this.f15727d.m7896b(this.f15731h);
            this.f15734k += (long) byteBuffer;
            this.f15730g.limit(byteBuffer);
            this.f15732i = this.f15730g;
        }
    }

    /* renamed from: d */
    public void mo1535d() {
        this.f15727d.m7891a();
        this.f15735l = true;
    }

    /* renamed from: e */
    public ByteBuffer mo1536e() {
        ByteBuffer byteBuffer = this.f15732i;
        this.f15732i = a;
        return byteBuffer;
    }

    /* renamed from: f */
    public boolean mo1537f() {
        return this.f15735l && (this.f15727d == null || this.f15727d.m7894b() == 0);
    }

    /* renamed from: g */
    public void mo1538g() {
        this.f15727d = new C2149h(this.f15726c, this.f15725b);
        this.f15727d.m7892a(this.f15728e);
        this.f15727d.m7895b(this.f15729f);
        this.f15732i = a;
        this.f15733j = 0;
        this.f15734k = 0;
        this.f15735l = false;
    }

    /* renamed from: h */
    public void mo1539h() {
        this.f15727d = null;
        this.f15730g = a;
        this.f15731h = this.f15730g.asShortBuffer();
        this.f15732i = a;
        this.f15725b = -1;
        this.f15726c = -1;
        this.f15733j = 0;
        this.f15734k = 0;
        this.f15735l = false;
    }
}
