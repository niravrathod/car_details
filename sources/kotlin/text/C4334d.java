package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2885g;
import kotlin.jvm.p154a.C2879c;
import kotlin.p151b.C4324c;
import kotlin.p151b.C4739g;
import kotlin.p153d.C2873a;

/* renamed from: kotlin.text.d */
final class C4334d implements C2873a<C4324c> {
    /* renamed from: a */
    private final CharSequence f18072a;
    /* renamed from: b */
    private final int f18073b;
    /* renamed from: c */
    private final int f18074c;
    /* renamed from: d */
    private final C2879c<CharSequence, Integer, Pair<Integer, Integer>> f18075d;

    /* renamed from: kotlin.text.d$a */
    public static final class C2892a implements Iterator<C4324c> {
        /* renamed from: a */
        final /* synthetic */ C4334d f12096a;
        /* renamed from: b */
        private int f12097b = -1;
        /* renamed from: c */
        private int f12098c;
        /* renamed from: d */
        private int f12099d;
        /* renamed from: e */
        private C4324c f12100e;
        /* renamed from: f */
        private int f12101f;

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        C2892a(C4334d c4334d) {
            this.f12096a = c4334d;
            this.f12098c = C4739g.m27461a(c4334d.f18073b, 0, c4334d.f18072a.length());
            this.f12099d = this.f12098c;
        }

        public /* synthetic */ Object next() {
            return m13924a();
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: b */
        private final void m13923b() {
            /*
            r6 = this;
            r0 = r6.f12099d;
            r1 = 0;
            if (r0 >= 0) goto L_0x000e;
        L_0x0005:
            r6.f12097b = r1;
            r0 = 0;
            r0 = (kotlin.p151b.C4324c) r0;
            r6.f12100e = r0;
            goto L_0x00a4;
        L_0x000e:
            r0 = r6.f12096a;
            r0 = r0.f18074c;
            r2 = -1;
            r3 = 1;
            if (r0 <= 0) goto L_0x0027;
        L_0x0018:
            r0 = r6.f12101f;
            r0 = r0 + r3;
            r6.f12101f = r0;
            r0 = r6.f12101f;
            r4 = r6.f12096a;
            r4 = r4.f18074c;
            if (r0 >= r4) goto L_0x0035;
        L_0x0027:
            r0 = r6.f12099d;
            r4 = r6.f12096a;
            r4 = r4.f18072a;
            r4 = r4.length();
            if (r0 <= r4) goto L_0x004b;
        L_0x0035:
            r0 = r6.f12098c;
            r1 = new kotlin.b.c;
            r4 = r6.f12096a;
            r4 = r4.f18072a;
            r4 = kotlin.text.C4886o.m30241c(r4);
            r1.<init>(r0, r4);
            r6.f12100e = r1;
            r6.f12099d = r2;
            goto L_0x00a2;
        L_0x004b:
            r0 = r6.f12096a;
            r0 = r0.f18075d;
            r4 = r6.f12096a;
            r4 = r4.f18072a;
            r5 = r6.f12099d;
            r5 = java.lang.Integer.valueOf(r5);
            r0 = r0.mo4541a(r4, r5);
            r0 = (kotlin.Pair) r0;
            if (r0 != 0) goto L_0x007b;
        L_0x0065:
            r0 = r6.f12098c;
            r1 = new kotlin.b.c;
            r4 = r6.f12096a;
            r4 = r4.f18072a;
            r4 = kotlin.text.C4886o.m30241c(r4);
            r1.<init>(r0, r4);
            r6.f12100e = r1;
            r6.f12099d = r2;
            goto L_0x00a2;
        L_0x007b:
            r2 = r0.m13868c();
            r2 = (java.lang.Number) r2;
            r2 = r2.intValue();
            r0 = r0.m13869d();
            r0 = (java.lang.Number) r0;
            r0 = r0.intValue();
            r4 = r6.f12098c;
            r4 = kotlin.p151b.C4739g.m27463b(r4, r2);
            r6.f12100e = r4;
            r2 = r2 + r0;
            r6.f12098c = r2;
            r2 = r6.f12098c;
            if (r0 != 0) goto L_0x009f;
        L_0x009e:
            r1 = 1;
        L_0x009f:
            r2 = r2 + r1;
            r6.f12099d = r2;
        L_0x00a2:
            r6.f12097b = r3;
        L_0x00a4:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.d.a.b():void");
        }

        /* renamed from: a */
        public C4324c m13924a() {
            if (this.f12097b == -1) {
                m13923b();
            }
            if (this.f12097b != 0) {
                C4324c c4324c = this.f12100e;
                if (c4324c != null) {
                    this.f12100e = (C4324c) null;
                    this.f12097b = -1;
                    return c4324c;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.ranges.IntRange");
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f12097b == -1) {
                m13923b();
            }
            return this.f12097b == 1;
        }
    }

    public C4334d(CharSequence charSequence, int i, int i2, C2879c<? super CharSequence, ? super Integer, Pair<Integer, Integer>> c2879c) {
        C2885g.m13910b(charSequence, "input");
        C2885g.m13910b(c2879c, "getNextMatch");
        this.f18072a = charSequence;
        this.f18073b = i;
        this.f18074c = i2;
        this.f18075d = c2879c;
    }

    /* renamed from: a */
    public Iterator<C4324c> mo3605a() {
        return new C2892a(this);
    }
}
