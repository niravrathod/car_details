package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.C0324b;
import android.support.v4.content.C0389b;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.navigation.C0909m.C0906a;
import androidx.navigation.C0909m.C0907b;
import androidx.navigation.C0913o.C0912b;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@C0907b(a = "activity")
/* renamed from: androidx.navigation.b */
public class C3275b extends C0909m<C3273a> {
    /* renamed from: a */
    private Context f13990a;
    /* renamed from: b */
    private Activity f13991b;

    /* renamed from: androidx.navigation.b$a */
    public static class C3273a extends C0900g {
        /* renamed from: a */
        private Intent f13987a;
        /* renamed from: b */
        private String f13988b;

        public C3273a(C0909m<? extends C3273a> c0909m) {
            super(c0909m);
        }

        /* renamed from: a */
        public void mo852a(Context context, AttributeSet attributeSet) {
            super.mo852a(context, attributeSet);
            attributeSet = context.getResources().obtainAttributes(attributeSet, C0912b.ActivityNavigator);
            String string = attributeSet.getString(C0912b.ActivityNavigator_android_name);
            if (string != null) {
                m16889a(new ComponentName(context, C0900g.m3911a(context, string, Activity.class)));
            }
            m16891a(attributeSet.getString(C0912b.ActivityNavigator_action));
            context = attributeSet.getString(C0912b.ActivityNavigator_data);
            if (context != null) {
                m16890a(Uri.parse(context));
            }
            m16893b(attributeSet.getString(C0912b.ActivityNavigator_dataPattern));
            attributeSet.recycle();
        }

        /* renamed from: a */
        public Intent m16888a() {
            return this.f13987a;
        }

        /* renamed from: a */
        public C3273a m16889a(ComponentName componentName) {
            if (this.f13987a == null) {
                this.f13987a = new Intent();
            }
            this.f13987a.setComponent(componentName);
            return this;
        }

        /* renamed from: a */
        public C3273a m16891a(String str) {
            if (this.f13987a == null) {
                this.f13987a = new Intent();
            }
            this.f13987a.setAction(str);
            return this;
        }

        /* renamed from: a */
        public C3273a m16890a(Uri uri) {
            if (this.f13987a == null) {
                this.f13987a = new Intent();
            }
            this.f13987a.setData(uri);
            return this;
        }

        /* renamed from: b */
        public C3273a m16893b(String str) {
            this.f13988b = str;
            return this;
        }

        /* renamed from: b */
        public String m16894b() {
            return this.f13988b;
        }
    }

    /* renamed from: androidx.navigation.b$b */
    public static class C3274b implements C0906a {
        /* renamed from: a */
        private final C0324b f13989a;

        /* renamed from: a */
        C0324b m16895a() {
            return this.f13989a;
        }
    }

    /* renamed from: c */
    public /* synthetic */ C0900g mo855c() {
        return m16896a();
    }

    public C3275b(Context context) {
        this.f13990a = context;
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                this.f13991b = (Activity) context;
                return;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
    }

    /* renamed from: a */
    public C3273a m16896a() {
        return new C3273a(this);
    }

    /* renamed from: b */
    public boolean mo854b() {
        int i = 0;
        if (this.f13991b == null) {
            return false;
        }
        Intent intent = this.f13991b.getIntent();
        if (intent != null) {
            i = intent.getIntExtra("android-support-navigation:ActivityNavigator:source", 0);
        }
        this.f13991b.finish();
        m3963a(i, 2);
        return true;
    }

    /* renamed from: a */
    public void m16897a(C3273a c3273a, Bundle bundle, C0904k c0904k, C0906a c0906a) {
        if (c3273a.m16888a() != null) {
            Intent intent = new Intent(c3273a.m16888a());
            if (bundle != null) {
                intent.putExtras(bundle);
                Object b = c3273a.m16894b();
                if (!TextUtils.isEmpty(b)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(b);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle.containsKey(group)) {
                            matcher.appendReplacement(stringBuffer, "");
                            stringBuffer.append(Uri.encode(bundle.getString(group)));
                        } else {
                            c0904k = new StringBuilder();
                            c0904k.append("Could not find ");
                            c0904k.append(group);
                            c0904k.append(" in ");
                            c0904k.append(bundle);
                            c0904k.append(" to fill data pattern ");
                            c0904k.append(b);
                            throw new IllegalArgumentException(c0904k.toString());
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    intent.setData(Uri.parse(stringBuffer.toString()));
                }
            }
            if (!(c0904k == null || c0904k.m3949c() == null)) {
                intent.addFlags(32768);
            }
            if (c0904k != null && c0904k.m3948b() != null && VERSION.SDK_INT >= 21) {
                intent.addFlags(524288);
            } else if ((this.f13990a instanceof Activity) == null) {
                intent.addFlags(268435456);
            }
            if (!(c0904k == null || c0904k.m3947a() == null)) {
                intent.addFlags(536870912);
            }
            if (this.f13991b != null) {
                bundle = this.f13991b.getIntent();
                if (bundle != null) {
                    bundle = bundle.getIntExtra("android-support-navigation:ActivityNavigator:current", 0);
                    if (bundle != null) {
                        intent.putExtra("android-support-navigation:ActivityNavigator:source", bundle);
                    }
                }
            }
            c3273a = c3273a.m3923d();
            intent.putExtra("android-support-navigation:ActivityNavigator:current", c3273a);
            C0904k.m3945a(intent, c0904k);
            if (!(c0904k == null || this.f13991b == null)) {
                bundle = c0904k.m3952f();
                c0904k = c0904k.m3953g();
                if (!(bundle == -1 && c0904k == -1)) {
                    if (bundle == -1) {
                        bundle = null;
                    }
                    if (c0904k == -1) {
                        c0904k = null;
                    }
                    this.f13991b.overridePendingTransition(bundle, c0904k);
                }
            }
            if ((c0906a instanceof C3274b) != null) {
                C0389b.m1431a((Context) this.f13990a, intent, (Bundle) ((C3274b) c0906a).m16895a().m1165a());
            } else {
                this.f13990a.startActivity(intent);
            }
            m3963a(c3273a, 0);
            return;
        }
        c0904k = new StringBuilder();
        c0904k.append("Destination ");
        c0904k.append(c3273a.m3923d());
        c0904k.append(" does not have an Intent set.");
        throw new IllegalStateException(c0904k.toString());
    }
}
