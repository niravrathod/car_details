package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import javax.annotation.Nullable;
import okhttp3.internal.C2933c;

/* renamed from: okhttp3.s */
public final class C2981s {
    /* renamed from: a */
    private final String[] f12601a;

    /* renamed from: okhttp3.s$a */
    public static final class C2980a {
        /* renamed from: a */
        final List<String> f12600a = new ArrayList(20);

        /* renamed from: a */
        C2980a m14537a(String str) {
            int indexOf = str.indexOf(":", 1);
            if (indexOf != -1) {
                return m14541b(str.substring(0, indexOf), str.substring(indexOf + 1));
            }
            if (str.startsWith(":")) {
                return m14541b("", str.substring(1));
            }
            return m14541b("", str);
        }

        /* renamed from: a */
        public C2980a m14538a(String str, String str2) {
            m14536d(str, str2);
            return m14541b(str, str2);
        }

        /* renamed from: b */
        C2980a m14541b(String str, String str2) {
            this.f12600a.add(str);
            this.f12600a.add(str2.trim());
            return this;
        }

        /* renamed from: b */
        public C2980a m14540b(String str) {
            int i = 0;
            while (i < this.f12600a.size()) {
                if (str.equalsIgnoreCase((String) this.f12600a.get(i))) {
                    this.f12600a.remove(i);
                    this.f12600a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* renamed from: c */
        public C2980a m14543c(String str, String str2) {
            m14536d(str, str2);
            m14540b(str);
            m14541b(str, str2);
            return this;
        }

        /* renamed from: d */
        private void m14536d(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str.isEmpty()) {
                throw new IllegalArgumentException("name is empty");
            } else {
                int i;
                char charAt;
                int length = str.length();
                for (i = 0; i < length; i++) {
                    charAt = str.charAt(i);
                    if (charAt <= ' ' || charAt >= '') {
                        throw new IllegalArgumentException(C2933c.m14186a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                    }
                }
                if (str2 != null) {
                    length = str2.length();
                    i = 0;
                    while (i < length) {
                        charAt = str2.charAt(i);
                        if ((charAt > '\u001f' || charAt == '\t') && charAt < '') {
                            i++;
                        } else {
                            throw new IllegalArgumentException(C2933c.m14186a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str, str2));
                        }
                    }
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("value for name ");
                stringBuilder.append(str);
                stringBuilder.append(" == null");
                throw new NullPointerException(stringBuilder.toString());
            }
        }

        /* renamed from: c */
        public String m14542c(String str) {
            for (int size = this.f12600a.size() - 2; size >= 0; size -= 2) {
                if (str.equalsIgnoreCase((String) this.f12600a.get(size))) {
                    return (String) this.f12600a.get(size + 1);
                }
            }
            return null;
        }

        /* renamed from: a */
        public C2981s m14539a() {
            return new C2981s(this);
        }
    }

    C2981s(C2980a c2980a) {
        this.f12601a = (String[]) c2980a.f12600a.toArray(new String[c2980a.f12600a.size()]);
    }

    private C2981s(String[] strArr) {
        this.f12601a = strArr;
    }

    @Nullable
    /* renamed from: a */
    public String m14548a(String str) {
        return C2981s.m14544a(this.f12601a, str);
    }

    /* renamed from: a */
    public int m14546a() {
        return this.f12601a.length / 2;
    }

    /* renamed from: a */
    public String m14547a(int i) {
        return this.f12601a[i * 2];
    }

    /* renamed from: b */
    public String m14549b(int i) {
        return this.f12601a[(i * 2) + 1];
    }

    /* renamed from: b */
    public Set<String> m14551b() {
        Set treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int a = m14546a();
        for (int i = 0; i < a; i++) {
            treeSet.add(m14547a(i));
        }
        return Collections.unmodifiableSet(treeSet);
    }

    /* renamed from: b */
    public List<String> m14550b(String str) {
        int a = m14546a();
        List list = null;
        for (int i = 0; i < a; i++) {
            if (str.equalsIgnoreCase(m14547a(i))) {
                if (list == null) {
                    list = new ArrayList(2);
                }
                list.add(m14549b(i));
            }
        }
        if (list != null) {
            return Collections.unmodifiableList(list);
        }
        return Collections.emptyList();
    }

    /* renamed from: c */
    public C2980a m14552c() {
        C2980a c2980a = new C2980a();
        Collections.addAll(c2980a.f12600a, this.f12601a);
        return c2980a;
    }

    public boolean equals(@Nullable Object obj) {
        return (!(obj instanceof C2981s) || Arrays.equals(((C2981s) obj).f12601a, this.f12601a) == null) ? null : true;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f12601a);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int a = m14546a();
        for (int i = 0; i < a; i++) {
            stringBuilder.append(m14547a(i));
            stringBuilder.append(": ");
            stringBuilder.append(m14549b(i));
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private static String m14544a(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C2981s m14545a(String... strArr) {
        if (strArr == null) {
            throw new NullPointerException("namesAndValues == null");
        } else if (strArr.length % 2 == 0) {
            strArr = (String[]) strArr.clone();
            int i = 0;
            while (i < strArr.length) {
                if (strArr[i] != null) {
                    strArr[i] = strArr[i].trim();
                    i++;
                } else {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
            }
            i = 0;
            while (i < strArr.length) {
                String str = strArr[i];
                String str2 = strArr[i + 1];
                if (str.length() != 0 && str.indexOf(0) == -1 && str2.indexOf(0) == -1) {
                    i += 2;
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unexpected header: ");
                    stringBuilder.append(str);
                    stringBuilder.append(": ");
                    stringBuilder.append(str2);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            return new C2981s(strArr);
        } else {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
    }
}
