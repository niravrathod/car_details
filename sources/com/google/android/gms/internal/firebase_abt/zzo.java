package com.google.android.gms.internal.firebase_abt;

public final class zzo extends zzd<zzo> {
    /* renamed from: c */
    public String f20489c;
    /* renamed from: d */
    public String f20490d;
    /* renamed from: e */
    public long f20491e;
    /* renamed from: f */
    public String f20492f;
    /* renamed from: g */
    public long f20493g;
    /* renamed from: h */
    public long f20494h;
    /* renamed from: i */
    public int f20495i;
    /* renamed from: j */
    public zzn[] f20496j;
    /* renamed from: k */
    private String f20497k;
    /* renamed from: l */
    private String f20498l;
    /* renamed from: m */
    private String f20499m;
    /* renamed from: n */
    private String f20500n;
    /* renamed from: o */
    private String f20501o;

    public zzo() {
        this.f20489c = "";
        this.f20490d = "";
        this.f20491e = 0;
        this.f20492f = "";
        this.f20493g = 0;
        this.f20494h = 0;
        this.f20497k = "";
        this.f20498l = "";
        this.f20499m = "";
        this.f20500n = "";
        this.f20501o = "";
        this.f20495i = 0;
        this.f20496j = zzn.m27060b();
        this.a = null;
        this.b = -1;
    }

    /* renamed from: a */
    public final /* synthetic */ zzj mo4338a(zza zza) {
        while (true) {
            int a = zza.m11457a();
            switch (a) {
                case 0:
                    return this;
                case 10:
                    this.f20489c = zza.m11465d();
                    break;
                case 18:
                    this.f20490d = zza.m11465d();
                    break;
                case 24:
                    this.f20491e = zza.m11461b();
                    break;
                case 34:
                    this.f20492f = zza.m11465d();
                    break;
                case 40:
                    this.f20493g = zza.m11461b();
                    break;
                case 48:
                    this.f20494h = zza.m11461b();
                    break;
                case 58:
                    this.f20497k = zza.m11465d();
                    break;
                case 66:
                    this.f20498l = zza.m11465d();
                    break;
                case 74:
                    this.f20499m = zza.m11465d();
                    break;
                case 82:
                    this.f20500n = zza.m11465d();
                    break;
                case 90:
                    this.f20501o = zza.m11465d();
                    break;
                case 96:
                    this.f20495i = zza.m11464c();
                    break;
                case 106:
                    a = zzm.m11487a(zza, 106);
                    int length = this.f20496j == null ? 0 : this.f20496j.length;
                    Object obj = new zzn[(a + length)];
                    if (length != 0) {
                        System.arraycopy(this.f20496j, 0, obj, 0, length);
                    }
                    while (length < obj.length - 1) {
                        obj[length] = new zzn();
                        zza.m11459a(obj[length]);
                        zza.m11457a();
                        length++;
                    }
                    obj[length] = new zzn();
                    zza.m11459a(obj[length]);
                    this.f20496j = obj;
                    break;
                default:
                    if (super.m22155a(zza, a)) {
                        break;
                    }
                    return this;
            }
        }
    }
}
