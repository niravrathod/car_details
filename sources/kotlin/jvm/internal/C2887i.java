package kotlin.jvm.internal;

import kotlin.p152c.C4326b;
import kotlin.p152c.C4327d;

/* renamed from: kotlin.jvm.internal.i */
public class C2887i {
    /* renamed from: a */
    public C4327d m13919a(FunctionReference functionReference) {
        return functionReference;
    }

    /* renamed from: a */
    public C4326b m13918a(Class cls) {
        return new C4743d(cls);
    }

    /* renamed from: a */
    public String m13917a(Lambda lambda) {
        return m13916a((FunctionBase) lambda);
    }

    /* renamed from: a */
    public String m13916a(FunctionBase functionBase) {
        functionBase = functionBase.getClass().getGenericInterfaces()[0].toString();
        return functionBase.startsWith("kotlin.jvm.functions.") ? functionBase.substring("kotlin.jvm.functions.".length()) : functionBase;
    }
}
