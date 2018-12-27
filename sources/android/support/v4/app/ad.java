package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.content.C0389b;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public final class ad implements Iterable<Intent> {
    /* renamed from: a */
    private static final C0323c f1139a;
    /* renamed from: b */
    private final ArrayList<Intent> f1140b = new ArrayList();
    /* renamed from: c */
    private final Context f1141c;

    /* renamed from: android.support.v4.app.ad$a */
    public interface C0322a {
        /* renamed from: a */
        Intent mo4970a();
    }

    /* renamed from: android.support.v4.app.ad$c */
    static class C0323c {
        C0323c() {
        }
    }

    /* renamed from: android.support.v4.app.ad$b */
    static class C3105b extends C0323c {
        C3105b() {
        }
    }

    static {
        if (VERSION.SDK_INT >= 16) {
            f1139a = new C3105b();
        } else {
            f1139a = new C0323c();
        }
    }

    private ad(Context context) {
        this.f1141c = context;
    }

    /* renamed from: a */
    public static ad m1156a(Context context) {
        return new ad(context);
    }

    /* renamed from: a */
    public ad m1161a(Intent intent) {
        this.f1140b.add(intent);
        return this;
    }

    /* renamed from: b */
    public ad m1163b(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f1141c.getPackageManager());
        }
        if (component != null) {
            m1160a(component);
        }
        m1161a(intent);
        return this;
    }

    /* renamed from: a */
    public ad m1159a(Activity activity) {
        Intent a = activity instanceof C0322a ? ((C0322a) activity).mo4970a() : null;
        if (a == null) {
            a = C0364v.m1326a(activity);
        }
        if (a != null) {
            ComponentName component = a.getComponent();
            if (component == null) {
                component = a.resolveActivity(this.f1141c.getPackageManager());
            }
            m1160a(component);
            m1161a(a);
        }
        return this;
    }

    /* renamed from: a */
    public ad m1160a(ComponentName componentName) {
        int size = this.f1140b.size();
        try {
            componentName = C0364v.m1327a(this.f1141c, componentName);
            while (componentName != null) {
                this.f1140b.add(size, componentName);
                componentName = C0364v.m1327a(this.f1141c, componentName.getComponent());
            }
            return this;
        } catch (ComponentName componentName2) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(componentName2);
        }
    }

    /* renamed from: a */
    public int m1157a() {
        return this.f1140b.size();
    }

    /* renamed from: a */
    public Intent m1158a(int i) {
        return (Intent) this.f1140b.get(i);
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f1140b.iterator();
    }

    /* renamed from: b */
    public void m1164b() {
        m1162a(null);
    }

    /* renamed from: a */
    public void m1162a(Bundle bundle) {
        if (this.f1140b.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f1140b.toArray(new Intent[this.f1140b.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (C0389b.m1432a(this.f1141c, intentArr, bundle) == null) {
            bundle = new Intent(intentArr[intentArr.length - 1]);
            bundle.addFlags(268435456);
            this.f1141c.startActivity(bundle);
        }
    }
}
