package kotlin.text;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.collections.C4740e;
import kotlin.jvm.internal.C2885g;

public final class Regex implements Serializable {
    /* renamed from: a */
    public static final C2890a f12095a = new C2890a();
    private Set<? extends Object> _options;
    private final Pattern nativePattern;

    private static final class Serialized implements Serializable {
        /* renamed from: a */
        public static final C2889a f12094a = new C2889a();
        private static final long serialVersionUID = 0;
        private final int flags;
        private final String pattern;

        /* renamed from: kotlin.text.Regex$Serialized$a */
        public static final class C2889a {
            private C2889a() {
            }
        }

        public Serialized(String str, int i) {
            C2885g.m13910b(str, "pattern");
            this.pattern = str;
            this.flags = i;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.pattern, this.flags);
            C2885g.m13907a((Object) compile, "Pattern.compile(pattern, flags)");
            return new Regex(compile);
        }
    }

    /* renamed from: kotlin.text.Regex$a */
    public static final class C2890a {
        private C2890a() {
        }
    }

    public Regex(Pattern pattern) {
        C2885g.m13910b(pattern, "nativePattern");
        this.nativePattern = pattern;
    }

    public Regex(String str) {
        C2885g.m13910b(str, "pattern");
        Pattern compile = Pattern.compile(str);
        C2885g.m13907a((Object) compile, "Pattern.compile(pattern)");
        this(compile);
    }

    /* renamed from: a */
    public final boolean m13921a(CharSequence charSequence) {
        C2885g.m13910b(charSequence, "input");
        return this.nativePattern.matcher(charSequence).matches();
    }

    /* renamed from: a */
    public final List<String> m13920a(CharSequence charSequence, int i) {
        C2885g.m13910b(charSequence, "input");
        if ((i >= 0 ? 1 : null) != null) {
            Pattern pattern = this.nativePattern;
            if (i == 0) {
                i = -1;
            }
            Object split = pattern.split(charSequence, i);
            C2885g.m13907a(split, "nativePattern.split(inpu…imit == 0) -1 else limit)");
            return C4740e.m27466a(split);
        }
        charSequence = new StringBuilder();
        charSequence.append("Limit must be non-negative, but was ");
        charSequence.append(i);
        charSequence.append(46);
        throw ((Throwable) new IllegalArgumentException(charSequence.toString().toString()));
    }

    public String toString() {
        Object pattern = this.nativePattern.toString();
        C2885g.m13907a(pattern, "nativePattern.toString()");
        return pattern;
    }

    private final Object writeReplace() {
        Object pattern = this.nativePattern.pattern();
        C2885g.m13907a(pattern, "nativePattern.pattern()");
        return new Serialized(pattern, this.nativePattern.flags());
    }
}
