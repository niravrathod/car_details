package android.support.v7.p029g;

/* renamed from: android.support.v7.g.b */
public class C3215b implements C0703d {
    /* renamed from: a */
    final C0703d f13492a;
    /* renamed from: b */
    int f13493b = 0;
    /* renamed from: c */
    int f13494c = -1;
    /* renamed from: d */
    int f13495d = -1;
    /* renamed from: e */
    Object f13496e = null;

    public C3215b(C0703d c0703d) {
        this.f13492a = c0703d;
    }

    /* renamed from: a */
    public void m16044a() {
        if (this.f13493b != 0) {
            switch (this.f13493b) {
                case 1:
                    this.f13492a.mo577a(this.f13494c, this.f13495d);
                    break;
                case 2:
                    this.f13492a.mo579b(this.f13494c, this.f13495d);
                    break;
                case 3:
                    this.f13492a.mo578a(this.f13494c, this.f13495d, this.f13496e);
                    break;
                default:
                    break;
            }
            this.f13496e = null;
            this.f13493b = 0;
        }
    }

    /* renamed from: a */
    public void mo577a(int i, int i2) {
        if (this.f13493b != 1 || i < this.f13494c || i > this.f13494c + this.f13495d) {
            m16044a();
            this.f13494c = i;
            this.f13495d = i2;
            this.f13493b = 1;
            return;
        }
        this.f13495d += i2;
        this.f13494c = Math.min(i, this.f13494c);
    }

    /* renamed from: b */
    public void mo579b(int i, int i2) {
        if (this.f13493b != 2 || this.f13494c < i || this.f13494c > i + i2) {
            m16044a();
            this.f13494c = i;
            this.f13495d = i2;
            this.f13493b = 2;
            return;
        }
        this.f13495d += i2;
        this.f13494c = i;
    }

    /* renamed from: c */
    public void mo580c(int i, int i2) {
        m16044a();
        this.f13492a.mo580c(i, i2);
    }

    /* renamed from: a */
    public void mo578a(int i, int i2, Object obj) {
        if (this.f13493b == 3 && i <= this.f13494c + this.f13495d) {
            int i3 = i + i2;
            if (i3 >= this.f13494c && this.f13496e == obj) {
                i2 = this.f13494c + this.f13495d;
                this.f13494c = Math.min(i, this.f13494c);
                this.f13495d = Math.max(i2, i3) - this.f13494c;
                return;
            }
        }
        m16044a();
        this.f13494c = i;
        this.f13495d = i2;
        this.f13496e = obj;
        this.f13493b = 3;
    }
}
