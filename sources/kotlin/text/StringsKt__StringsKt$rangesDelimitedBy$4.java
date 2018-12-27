package kotlin.text;

import java.util.List;
import kotlin.C2859a;
import kotlin.Pair;
import kotlin.jvm.internal.C2885g;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p154a.C2879c;

final class StringsKt__StringsKt$rangesDelimitedBy$4 extends Lambda implements C2879c<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {
    final /* synthetic */ List $delimitersList;
    final /* synthetic */ boolean $ignoreCase;

    StringsKt__StringsKt$rangesDelimitedBy$4(List list, boolean z) {
        this.$delimitersList = list;
        this.$ignoreCase = z;
        super(2);
    }

    /* renamed from: a */
    public /* synthetic */ Object mo4541a(Object obj, Object obj2) {
        return m27471a((CharSequence) obj, ((Number) obj2).intValue());
    }

    /* renamed from: a */
    public final Pair<Integer, Integer> m27471a(CharSequence charSequence, int i) {
        C2885g.m13910b(charSequence, "$receiver");
        charSequence = C4886o.m30240b(charSequence, this.$delimitersList, i, this.$ignoreCase, false);
        return charSequence != null ? C2859a.m13873a(charSequence.m13866a(), Integer.valueOf(((String) charSequence.m13867b()).length())) : null;
    }
}
