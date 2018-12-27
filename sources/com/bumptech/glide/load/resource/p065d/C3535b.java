package com.bumptech.glide.load.resource.p065d;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.bumptech.glide.load.engine.p060a.C1230b;
import com.bumptech.glide.load.engine.p060a.C1232e;
import com.bumptech.glide.p051b.C1129a.C1128a;

/* renamed from: com.bumptech.glide.load.resource.d.b */
public final class C3535b implements C1128a {
    /* renamed from: a */
    private final C1232e f14578a;
    /* renamed from: b */
    private final C1230b f14579b;

    public C3535b(C1232e c1232e, C1230b c1230b) {
        this.f14578a = c1232e;
        this.f14579b = c1230b;
    }

    /* renamed from: a */
    public Bitmap mo1065a(int i, int i2, Config config) {
        return this.f14578a.mo1006b(i, i2, config);
    }

    /* renamed from: a */
    public void mo1066a(Bitmap bitmap) {
        this.f14578a.mo1005a(bitmap);
    }

    /* renamed from: a */
    public byte[] mo1069a(int i) {
        if (this.f14579b == null) {
            return new byte[i];
        }
        return (byte[]) this.f14579b.mo1011a(i, byte[].class);
    }

    /* renamed from: a */
    public void mo1067a(byte[] bArr) {
        if (this.f14579b != null) {
            this.f14579b.mo1014a((Object) bArr);
        }
    }

    /* renamed from: b */
    public int[] mo1070b(int i) {
        if (this.f14579b == null) {
            return new int[i];
        }
        return (int[]) this.f14579b.mo1011a(i, int[].class);
    }

    /* renamed from: a */
    public void mo1068a(int[] iArr) {
        if (this.f14579b != null) {
            this.f14579b.mo1014a((Object) iArr);
        }
    }
}
