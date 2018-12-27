package kotlin.jvm.internal;

import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;

/* renamed from: kotlin.jvm.internal.g */
public class C2885g {
    /* renamed from: a */
    public static int m13903a(int i, int i2) {
        return i < i2 ? -1 : i == i2 ? 0 : 1;
    }

    private C2885g() {
    }

    /* renamed from: a */
    public static void m13906a() {
        throw ((KotlinNullPointerException) C2885g.m13904a(new KotlinNullPointerException()));
    }

    /* renamed from: a */
    public static void m13908a(String str) {
        throw ((UninitializedPropertyAccessException) C2885g.m13904a(new UninitializedPropertyAccessException(str)));
    }

    /* renamed from: b */
    public static void m13911b(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("lateinit property ");
        stringBuilder.append(str);
        stringBuilder.append(" has not been initialized");
        C2885g.m13908a(stringBuilder.toString());
    }

    /* renamed from: a */
    public static void m13907a(Object obj, String str) {
        if (obj == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" must not be null");
            throw ((IllegalStateException) C2885g.m13904a(new IllegalStateException(stringBuilder.toString())));
        }
    }

    /* renamed from: b */
    public static void m13910b(Object obj, String str) {
        if (obj == null) {
            C2885g.m13912c(str);
        }
    }

    /* renamed from: c */
    private static void m13912c(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Parameter specified as non-null is null: method ");
        stringBuilder.append(className);
        stringBuilder.append(".");
        stringBuilder.append(methodName);
        stringBuilder.append(", parameter ");
        stringBuilder.append(str);
        throw ((IllegalArgumentException) C2885g.m13904a(new IllegalArgumentException(stringBuilder.toString())));
    }

    /* renamed from: a */
    public static boolean m13909a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null ? true : null;
        } else {
            return obj.equals(obj2);
        }
    }

    /* renamed from: a */
    private static <T extends Throwable> T m13904a(T t) {
        return C2885g.m13905a((Throwable) t, C2885g.class.getName());
    }

    /* renamed from: a */
    static <T extends Throwable> T m13905a(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        str = Arrays.asList(stackTrace).subList(i + 1, length);
        t.setStackTrace((StackTraceElement[]) str.toArray(new StackTraceElement[str.size()]));
        return t;
    }
}
