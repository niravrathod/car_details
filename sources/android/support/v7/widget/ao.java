package android.support.v7.widget;

class ao {
    /* renamed from: a */
    private int f2818a = 0;
    /* renamed from: b */
    private int f2819b = 0;
    /* renamed from: c */
    private int f2820c = Integer.MIN_VALUE;
    /* renamed from: d */
    private int f2821d = Integer.MIN_VALUE;
    /* renamed from: e */
    private int f2822e = 0;
    /* renamed from: f */
    private int f2823f = 0;
    /* renamed from: g */
    private boolean f2824g = false;
    /* renamed from: h */
    private boolean f2825h = false;

    ao() {
    }

    /* renamed from: a */
    public int m3521a() {
        return this.f2818a;
    }

    /* renamed from: b */
    public int m3524b() {
        return this.f2819b;
    }

    /* renamed from: c */
    public int m3526c() {
        return this.f2824g ? this.f2819b : this.f2818a;
    }

    /* renamed from: d */
    public int m3527d() {
        return this.f2824g ? this.f2818a : this.f2819b;
    }

    /* renamed from: a */
    public void m3522a(int i, int i2) {
        this.f2820c = i;
        this.f2821d = i2;
        this.f2825h = true;
        if (this.f2824g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f2818a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f2819b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f2818a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2819b = i2;
        }
    }

    /* renamed from: b */
    public void m3525b(int i, int i2) {
        this.f2825h = false;
        if (i != Integer.MIN_VALUE) {
            this.f2822e = i;
            this.f2818a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2823f = i2;
            this.f2819b = i2;
        }
    }

    /* renamed from: a */
    public void m3523a(boolean z) {
        if (z != this.f2824g) {
            this.f2824g = z;
            if (!this.f2825h) {
                this.f2818a = this.f2822e;
                this.f2819b = this.f2823f;
            } else if (z) {
                this.f2818a = !this.f2821d ? this.f2821d : this.f2822e;
                this.f2819b = !this.f2820c ? this.f2820c : this.f2823f;
            } else {
                this.f2818a = !this.f2820c ? this.f2820c : this.f2822e;
                this.f2819b = !this.f2821d ? this.f2821d : this.f2823f;
            }
        }
    }
}
