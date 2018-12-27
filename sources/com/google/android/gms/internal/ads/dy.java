package com.google.android.gms.internal.ads;

final class dy implements zzy {
    /* renamed from: a */
    private final /* synthetic */ String f16460a;
    /* renamed from: b */
    private final /* synthetic */ ea f16461b;

    dy(zzamz zzamz, String str, ea eaVar) {
        this.f16460a = str;
        this.f16461b = eaVar;
    }

    /* renamed from: a */
    public final void mo1945a(zzae zzae) {
        String str = this.f16460a;
        zzae = zzae.toString();
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 21) + String.valueOf(zzae).length());
        stringBuilder.append("Failed to load URL: ");
        stringBuilder.append(str);
        stringBuilder.append("\n");
        stringBuilder.append(zzae);
        zzaok.m10007e(stringBuilder.toString());
        this.f16461b.mo4156a(null);
    }
}
