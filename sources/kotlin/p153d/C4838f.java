package kotlin.p153d;

import java.util.Iterator;
import kotlin.jvm.internal.C2885g;
import kotlin.jvm.p154a.C2878b;
import kotlin.text.C4868k;

/* renamed from: kotlin.d.f */
class C4838f extends C4742e {

    /* renamed from: kotlin.d.f$a */
    public static final class C2875a implements Iterable<T> {
        /* renamed from: a */
        final /* synthetic */ C2873a f12084a;

        public C2875a(C2873a c2873a) {
            this.f12084a = c2873a;
        }

        public Iterator<T> iterator() {
            return this.f12084a.mo3605a();
        }
    }

    /* renamed from: a */
    public static final <T, R> C2873a<R> m28686a(C2873a<? extends T> c2873a, C2878b<? super T, ? extends R> c2878b) {
        C2885g.m13910b(c2873a, "$receiver");
        C2885g.m13910b(c2878b, "transform");
        return new C4331g(c2873a, c2878b);
    }

    /* renamed from: a */
    public static final <T, A extends Appendable> A m28682a(C2873a<? extends T> c2873a, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C2878b<? super T, ? extends CharSequence> c2878b) {
        C2885g.m13910b(c2873a, "$receiver");
        C2885g.m13910b(a, "buffer");
        C2885g.m13910b(charSequence, "separator");
        C2885g.m13910b(charSequence2, "prefix");
        C2885g.m13910b(charSequence3, "postfix");
        C2885g.m13910b(charSequence4, "truncated");
        a.append(charSequence2);
        c2873a = c2873a.mo3605a();
        charSequence2 = null;
        while (c2873a.hasNext()) {
            Object next = c2873a.next();
            charSequence2++;
            if (charSequence2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && charSequence2 > i) {
                break;
            }
            C4868k.m29804a(a, next, c2878b);
        }
        if (i >= 0 && r5 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ String m28685a(C2873a c2873a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C2878b c2878b, int i2, Object obj) {
        if ((i2 & 1) != null) {
            charSequence = ", ";
        }
        if ((i2 & 2) != null) {
            charSequence2 = "";
        }
        CharSequence charSequence5 = charSequence2;
        if ((i2 & 4) != null) {
            charSequence3 = "";
        }
        CharSequence charSequence6 = charSequence3;
        int i3 = (i2 & 8) != null ? -1 : i;
        if ((i2 & 16) != null) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != null) {
            c2878b = (C2878b) null;
        }
        return C4838f.m28684a(c2873a, charSequence, charSequence5, charSequence6, i3, charSequence7, c2878b);
    }

    /* renamed from: a */
    public static final <T> String m28684a(C2873a<? extends T> c2873a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C2878b<? super T, ? extends CharSequence> c2878b) {
        C2885g.m13910b(c2873a, "$receiver");
        C2885g.m13910b(charSequence, "separator");
        C2885g.m13910b(charSequence2, "prefix");
        C2885g.m13910b(charSequence3, "postfix");
        C2885g.m13910b(charSequence4, "truncated");
        Object stringBuilder = ((StringBuilder) C4838f.m28682a(c2873a, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, c2878b)).toString();
        C2885g.m13907a(stringBuilder, "joinTo(StringBuilder(), …ed, transform).toString()");
        return stringBuilder;
    }

    /* renamed from: a */
    public static final <T> Iterable<T> m28683a(C2873a<? extends T> c2873a) {
        C2885g.m13910b(c2873a, "$receiver");
        return new C2875a(c2873a);
    }
}
