package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

@zzaer
public final class zzahs extends zzahz {
    /* renamed from: a */
    private final String f19845a;
    /* renamed from: b */
    private final int f19846b;

    public zzahs(String str, int i) {
        this.f19845a = str;
        this.f19846b = i;
    }

    /* renamed from: a */
    public final String mo2243a() {
        return this.f19845a;
    }

    /* renamed from: b */
    public final int mo2244b() {
        return this.f19846b;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof zzahs) {
                zzahs zzahs = (zzahs) obj;
                if (!Objects.equal(this.f19845a, zzahs.f19845a) || Objects.equal(Integer.valueOf(this.f19846b), Integer.valueOf(zzahs.f19846b)) == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
