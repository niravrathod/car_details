package android.support.v4.app;

import android.app.RemoteInput;
import android.app.RemoteInput.Builder;
import android.os.Bundle;
import java.util.Set;

public final class ab {
    /* renamed from: a */
    private final String f1132a;
    /* renamed from: b */
    private final CharSequence f1133b;
    /* renamed from: c */
    private final CharSequence[] f1134c;
    /* renamed from: d */
    private final boolean f1135d;
    /* renamed from: e */
    private final Bundle f1136e;
    /* renamed from: f */
    private final Set<String> f1137f;

    /* renamed from: a */
    public String m1146a() {
        return this.f1132a;
    }

    /* renamed from: b */
    public CharSequence m1147b() {
        return this.f1133b;
    }

    /* renamed from: c */
    public CharSequence[] m1148c() {
        return this.f1134c;
    }

    /* renamed from: d */
    public Set<String> m1149d() {
        return this.f1137f;
    }

    /* renamed from: e */
    public boolean m1150e() {
        return this.f1135d;
    }

    /* renamed from: f */
    public Bundle m1151f() {
        return this.f1136e;
    }

    /* renamed from: a */
    static RemoteInput[] m1145a(ab[] abVarArr) {
        if (abVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[abVarArr.length];
        for (int i = 0; i < abVarArr.length; i++) {
            remoteInputArr[i] = m1144a(abVarArr[i]);
        }
        return remoteInputArr;
    }

    /* renamed from: a */
    static RemoteInput m1144a(ab abVar) {
        return new Builder(abVar.m1146a()).setLabel(abVar.m1147b()).setChoices(abVar.m1148c()).setAllowFreeFormInput(abVar.m1150e()).addExtras(abVar.m1151f()).build();
    }
}
