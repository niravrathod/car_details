package com.google.firebase.iid;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.C2572b;
import java.io.IOException;
import java.util.concurrent.Executor;

final class aq implements C2588b {
    /* renamed from: a */
    private final C2572b f17735a;
    /* renamed from: b */
    private final C2599o f17736b;
    /* renamed from: c */
    private final C2602u f17737c;
    /* renamed from: d */
    private final Executor f17738d;

    aq(C2572b c2572b, C2599o c2599o, Executor executor) {
        this(c2572b, c2599o, executor, new C2602u(c2572b.m12607a(), c2599o));
    }

    /* renamed from: a */
    public final boolean mo3323a() {
        return true;
    }

    private aq(C2572b c2572b, C2599o c2599o, Executor executor, C2602u c2602u) {
        this.f17735a = c2572b;
        this.f17736b = c2599o;
        this.f17737c = c2602u;
        this.f17738d = executor;
    }

    /* renamed from: b */
    public final boolean mo3325b() {
        return this.f17736b.m12758a() != 0;
    }

    /* renamed from: a */
    public final Task<Void> mo3320a(String str, String str2) {
        return Tasks.m12422a((Object) null);
    }

    /* renamed from: a */
    public final Task<String> mo3322a(String str, String str2, String str3, String str4) {
        return m23057b(m23054a(str, str3, str4, new Bundle()));
    }

    /* renamed from: a */
    public final Task<Void> mo3321a(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String str4 = "gcm.topic";
        String valueOf = String.valueOf("/topics/");
        String valueOf2 = String.valueOf(str3);
        bundle.putString(str4, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        str4 = String.valueOf("/topics/");
        str3 = String.valueOf(str3);
        return m23053a(m23057b(m23054a(str, str2, str3.length() != 0 ? str4.concat(str3) : new String(str4), bundle)));
    }

    /* renamed from: b */
    public final Task<Void> mo3324b(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String str4 = "gcm.topic";
        String valueOf = String.valueOf("/topics/");
        String valueOf2 = String.valueOf(str3);
        bundle.putString(str4, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        bundle.putString("delete", "1");
        str4 = String.valueOf("/topics/");
        str3 = String.valueOf(str3);
        return m23053a(m23057b(m23054a(str, str2, str3.length() != 0 ? str4.concat(str3) : new String(str4), bundle)));
    }

    /* renamed from: a */
    private final Task<Bundle> m23054a(String str, String str2, String str3, Bundle bundle) {
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.f17735a.m12610c().m12615a());
        bundle.putString("gmsv", Integer.toString(this.f17736b.m12761d()));
        bundle.putString("osv", Integer.toString(VERSION.SDK_INT));
        bundle.putString("app_ver", this.f17736b.m12759b());
        bundle.putString("app_ver_name", this.f17736b.m12760c());
        bundle.putString("cliv", "fiid-12451000");
        str = new TaskCompletionSource();
        this.f17738d.execute(new ar(this, bundle, str));
        return str.m12417a();
    }

    /* renamed from: a */
    private static String m23055a(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            string = bundle.getString("unregistered");
            if (string != null) {
                return string;
            }
            string = bundle.getString("error");
            if ("RST".equals(string)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string != null) {
                throw new IOException(string);
            } else {
                bundle = String.valueOf(bundle);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(bundle).length() + 21);
                stringBuilder.append("Unexpected response: ");
                stringBuilder.append(bundle);
                Log.w("FirebaseInstanceId", stringBuilder.toString(), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    /* renamed from: a */
    private final <T> Task<Void> m23053a(Task<T> task) {
        return task.mo3208a(ai.m12701a(), new as(this));
    }

    /* renamed from: b */
    private final Task<String> m23057b(Task<Bundle> task) {
        return task.mo3208a(this.f17738d, new at(this));
    }

    /* renamed from: a */
    final /* synthetic */ void m23061a(Bundle bundle, TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.m12419a(this.f17737c.m12772a(bundle));
        } catch (Exception e) {
            taskCompletionSource.m12418a(e);
        }
    }
}
