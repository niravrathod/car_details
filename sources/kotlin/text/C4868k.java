package kotlin.text;

import kotlin.jvm.internal.C2885g;
import kotlin.jvm.p154a.C2878b;

/* renamed from: kotlin.text.k */
class C4868k extends C4839j {
    /* renamed from: a */
    public static final <T> void m29804a(Appendable appendable, T t, C2878b<? super T, ? extends CharSequence> c2878b) {
        C2885g.m13910b(appendable, "$receiver");
        if (c2878b != null) {
            appendable.append((CharSequence) c2878b.mo3931a(t));
            return;
        }
        if ((t != null ? t instanceof CharSequence : true) != null) {
            appendable.append((CharSequence) t);
        } else if ((t instanceof Character) != null) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }
}
