package android.support.v4.app;

import android.arch.lifecycle.C0038s;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.State;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.support.v4.app.C3104a.C0319a;
import android.support.v4.app.C3104a.C0320b;
import android.support.v4.app.C3104a.C0321c;
import android.support.v4.p017f.C0434n;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class FragmentActivity extends C4759f implements C0319a, C0321c {
    /* renamed from: c */
    final Handler f21460c = new C03121(this);
    /* renamed from: d */
    final C0330j f21461d = C0330j.m1175a(new C4429a(this));
    /* renamed from: e */
    C0363u f21462e;
    /* renamed from: f */
    boolean f21463f;
    /* renamed from: g */
    boolean f21464g;
    /* renamed from: h */
    boolean f21465h = true;
    /* renamed from: i */
    boolean f21466i = true;
    /* renamed from: j */
    boolean f21467j;
    /* renamed from: k */
    boolean f21468k;
    /* renamed from: l */
    int f21469l;
    /* renamed from: m */
    C0434n<String> f21470m;
    /* renamed from: n */
    private C0038s f21471n;

    /* renamed from: android.support.v4.app.FragmentActivity$1 */
    class C03121 extends Handler {
        /* renamed from: a */
        final /* synthetic */ FragmentActivity f1086a;

        C03121(FragmentActivity fragmentActivity) {
            this.f1086a = fragmentActivity;
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    if (this.f1086a.f21465h != null) {
                        this.f1086a.m28704a(false);
                        return;
                    }
                    return;
                case 2:
                    this.f1086a.b_();
                    this.f1086a.f21461d.m1201n();
                    return;
                default:
                    super.handleMessage(message);
                    return;
            }
        }
    }

    /* renamed from: android.support.v4.app.FragmentActivity$b */
    static final class C0313b {
        /* renamed from: a */
        Object f1087a;
        /* renamed from: b */
        C0038s f1088b;
        /* renamed from: c */
        C0346n f1089c;

        C0313b() {
        }
    }

    /* renamed from: android.support.v4.app.FragmentActivity$a */
    class C4429a extends C3107k<FragmentActivity> {
        /* renamed from: a */
        final /* synthetic */ FragmentActivity f18408a;

        /* renamed from: g */
        public /* synthetic */ Object mo3751g() {
            return m24239c();
        }

        public C4429a(FragmentActivity fragmentActivity) {
            this.f18408a = fragmentActivity;
            super(fragmentActivity);
        }

        /* renamed from: a */
        public void mo3743a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            this.f18408a.dump(str, fileDescriptor, printWriter, strArr);
        }

        /* renamed from: a */
        public boolean mo3744a(Fragment fragment) {
            return this.f18408a.isFinishing() ^ 1;
        }

        /* renamed from: b */
        public LayoutInflater mo3746b() {
            return this.f18408a.getLayoutInflater().cloneInContext(this.f18408a);
        }

        /* renamed from: c */
        public FragmentActivity m24239c() {
            return this.f18408a;
        }

        /* renamed from: d */
        public void mo3748d() {
            this.f18408a.d_();
        }

        /* renamed from: a */
        public void mo3740a(Fragment fragment, Intent intent, int i, Bundle bundle) {
            this.f18408a.m28701a(fragment, intent, i, bundle);
        }

        /* renamed from: a */
        public void mo3741a(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
            this.f18408a.m28702a(fragment, intentSender, i, intent, i2, i3, i4, bundle);
        }

        /* renamed from: a */
        public void mo3742a(Fragment fragment, String[] strArr, int i) {
            this.f18408a.m28703a(fragment, strArr, i);
        }

        /* renamed from: a */
        public boolean mo3745a(String str) {
            return C3104a.m15338a(this.f18408a, str);
        }

        /* renamed from: e */
        public boolean mo3749e() {
            return this.f18408a.getWindow() != null;
        }

        /* renamed from: f */
        public int mo3750f() {
            Window window = this.f18408a.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        /* renamed from: b */
        public void mo3747b(Fragment fragment) {
            this.f18408a.m28700a(fragment);
        }

        /* renamed from: a */
        public View mo259a(int i) {
            return this.f18408a.findViewById(i);
        }

        /* renamed from: a */
        public boolean mo260a() {
            Window window = this.f18408a.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }
    }

    /* renamed from: a */
    public void m28700a(Fragment fragment) {
    }

    public Object c_() {
        return null;
    }

    public /* bridge */ /* synthetic */ View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(view, str, context, attributeSet);
    }

    public /* bridge */ /* synthetic */ View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(str, context, attributeSet);
    }

    public /* bridge */ /* synthetic */ void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    public /* bridge */ /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        this.f21461d.m1186b();
        int i3 = i >> 16;
        if (i3 != 0) {
            i3--;
            String str = (String) this.f21470m.m1590a(i3);
            this.f21470m.m1596c(i3);
            if (str == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment a = this.f21461d.m1176a(str);
            if (a == null) {
                i2 = new StringBuilder();
                i2.append("Activity result no fragment exists for who: ");
                i2.append(str);
                Log.w("FragmentActivity", i2.toString());
            } else {
                a.onActivityResult(i & 65535, i2, intent);
            }
            return;
        }
        C0320b a2 = C3104a.m15332a();
        if (a2 == null || !a2.m1139a(this, i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        C0334l a = this.f21461d.m1177a();
        boolean i = a.mo307i();
        if (!i || VERSION.SDK_INT > 25) {
            if (i || !a.mo302d()) {
                super.onBackPressed();
            }
        }
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.f21461d.m1182a(z);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.f21461d.m1188b(z);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f21461d.m1186b();
        this.f21461d.m1179a(configuration);
    }

    public C0038s a_() {
        if (getApplication() != null) {
            if (this.f21471n == null) {
                this.f21471n = new C0038s();
            }
            return this.f21471n;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public Lifecycle getLifecycle() {
        return super.getLifecycle();
    }

    protected void onCreate(Bundle bundle) {
        C0346n c0346n = null;
        this.f21461d.m1181a(null);
        super.onCreate(bundle);
        C0313b c0313b = (C0313b) getLastNonConfigurationInstance();
        if (c0313b != null) {
            this.f21471n = c0313b.f1088b;
        }
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            C0330j c0330j = this.f21461d;
            if (c0313b != null) {
                c0346n = c0313b.f1089c;
            }
            c0330j.m1180a(parcelable, c0346n);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f21469l = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                bundle = bundle.getStringArray("android:support:request_fragment_who");
                if (!(intArray == null || bundle == null)) {
                    if (intArray.length == bundle.length) {
                        this.f21470m = new C0434n(intArray.length);
                        for (int i = 0; i < intArray.length; i++) {
                            this.f21470m.m1594b(intArray[i], bundle[i]);
                        }
                    }
                }
                Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
            }
        }
        if (this.f21470m == null) {
            this.f21470m = new C0434n();
            this.f21469l = 0;
        }
        this.f21461d.m1192e();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            return super.onCreatePanelMenu(i, menu) | this.f21461d.m1184a(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i, menu);
    }

    /* renamed from: a */
    final View mo4886a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f21461d.m1178a(view, str, context, attributeSet);
    }

    protected void onDestroy() {
        super.onDestroy();
        m28704a(false);
        if (!(this.f21471n == null || this.f21467j)) {
            this.f21471n.m95a();
        }
        this.f21461d.m1199l();
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f21461d.m1200m();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f21461d.m1185a(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.f21461d.m1189b(menuItem);
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f21461d.m1187b(menu);
        }
        super.onPanelClosed(i, menu);
    }

    protected void onPause() {
        super.onPause();
        this.f21464g = false;
        if (this.f21460c.hasMessages(2)) {
            this.f21460c.removeMessages(2);
            b_();
        }
        this.f21461d.m1196i();
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f21461d.m1186b();
    }

    public void onStateNotSaved() {
        this.f21461d.m1186b();
    }

    protected void onResume() {
        super.onResume();
        this.f21460c.sendEmptyMessage(2);
        this.f21464g = true;
        this.f21461d.m1201n();
    }

    protected void onPostResume() {
        super.onPostResume();
        this.f21460c.removeMessages(2);
        b_();
        this.f21461d.m1201n();
    }

    protected void b_() {
        this.f21461d.m1195h();
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0 || menu == null) {
            return super.onPreparePanel(i, view, menu);
        }
        return m28705a(view, menu) | this.f21461d.m1183a(menu);
    }

    /* renamed from: a */
    protected boolean m28705a(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public final Object onRetainNonConfigurationInstance() {
        if (this.f21465h) {
            m28704a(true);
        }
        Object c_ = c_();
        C0346n d = this.f21461d.m1191d();
        if (d == null && this.f21471n == null && c_ == null) {
            return null;
        }
        C0313b c0313b = new C0313b();
        c0313b.f1087a = c_;
        c0313b.f1088b = this.f21471n;
        c0313b.f1089c = d;
        return c0313b;
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mo4973h();
        Parcelable c = this.f21461d.m1190c();
        if (c != null) {
            bundle.putParcelable("android:support:fragments", c);
        }
        if (this.f21470m.m1592b() > 0) {
            bundle.putInt("android:support:next_request_index", this.f21469l);
            int[] iArr = new int[this.f21470m.m1592b()];
            String[] strArr = new String[this.f21470m.m1592b()];
            for (int i = 0; i < this.f21470m.m1592b(); i++) {
                iArr[i] = this.f21470m.m1599e(i);
                strArr[i] = (String) this.f21470m.m1600f(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    protected void onStart() {
        super.onStart();
        this.f21465h = false;
        this.f21466i = false;
        this.f21460c.removeMessages(1);
        if (!this.f21463f) {
            this.f21463f = true;
            this.f21461d.m1193f();
        }
        this.f21461d.m1186b();
        this.f21461d.m1201n();
        this.f21461d.m1194g();
    }

    protected void onStop() {
        super.onStop();
        this.f21465h = true;
        mo4973h();
        this.f21460c.sendEmptyMessage(1);
        this.f21461d.m1197j();
    }

    @Deprecated
    public void d_() {
        invalidateOptionsMenu();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("  ");
        String stringBuilder2 = stringBuilder.toString();
        printWriter.print(stringBuilder2);
        printWriter.print("mCreated=");
        printWriter.print(this.f21463f);
        printWriter.print("mResumed=");
        printWriter.print(this.f21464g);
        printWriter.print(" mStopped=");
        printWriter.print(this.f21465h);
        printWriter.print(" mReallyStopped=");
        printWriter.println(this.f21466i);
        if (this.f21462e != null) {
            this.f21462e.mo266a(stringBuilder2, fileDescriptor, printWriter, strArr);
        }
        this.f21461d.m1177a().mo297a(str, fileDescriptor, printWriter, strArr);
    }

    /* renamed from: a */
    void m28704a(boolean z) {
        if (!this.f21466i) {
            this.f21466i = true;
            this.f21467j = z;
            this.f21460c.removeMessages(1);
            m28706e();
        }
    }

    /* renamed from: e */
    void m28706e() {
        this.f21461d.m1198k();
    }

    /* renamed from: f */
    public C0334l m28707f() {
        return this.f21461d.m1177a();
    }

    /* renamed from: g */
    public C0363u m28708g() {
        if (this.f21462e != null) {
            return this.f21462e;
        }
        this.f21462e = new LoaderManagerImpl(this, a_());
        return this.f21462e;
    }

    public void startActivityForResult(Intent intent, int i) {
        if (!(this.b || i == -1)) {
            C4431e.m24254b(i);
        }
        super.startActivityForResult(intent, i);
    }

    /* renamed from: a */
    public final void mo4887a(int i) {
        if (!this.f21468k && i != -1) {
            C4431e.m24254b(i);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f21461d.m1186b();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            i2--;
            String str = (String) this.f21470m.m1590a(i2);
            this.f21470m.m1596c(i2);
            if (str == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment a = this.f21461d.m1176a(str);
            if (a == null) {
                strArr = new StringBuilder();
                strArr.append("Activity result no fragment exists for who: ");
                strArr.append(str);
                Log.w("FragmentActivity", strArr.toString());
            } else {
                a.onRequestPermissionsResult(i & 65535, strArr, iArr);
            }
        }
    }

    /* renamed from: a */
    public void m28701a(Fragment fragment, Intent intent, int i, Bundle bundle) {
        this.b = true;
        if (i == -1) {
            try {
                C3104a.m15335a(this, intent, -1, bundle);
            } finally {
                this.b = false;
            }
        } else {
            C4431e.m24254b(i);
            C3104a.m15335a(this, intent, ((m28696b(fragment) + 1) << 16) + (i & 65535), bundle);
            this.b = false;
        }
    }

    /* renamed from: a */
    public void m28702a(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        int i5 = i;
        this.a = true;
        if (i5 == -1) {
            try {
                C3104a.m15336a(this, intentSender, i, intent, i2, i3, i4, bundle);
            } finally {
                r9.a = false;
            }
        } else {
            C4431e.m24254b(i);
            C3104a.m15336a(this, intentSender, ((m28696b(fragment) + 1) << 16) + (i5 & 65535), intent, i2, i3, i4, bundle);
            r9.a = false;
        }
    }

    /* renamed from: b */
    private int m28696b(Fragment fragment) {
        if (this.f21470m.m1592b() < 65534) {
            while (this.f21470m.m1601g(this.f21469l) >= 0) {
                this.f21469l = (this.f21469l + 1) % 65534;
            }
            int i = this.f21469l;
            this.f21470m.m1594b(i, fragment.mWho);
            this.f21469l = (this.f21469l + 1) % 65534;
            return i;
        }
        throw new IllegalStateException("Too many pending Fragment activity results.");
    }

    /* renamed from: a */
    void m28703a(Fragment fragment, String[] strArr, int i) {
        if (i == -1) {
            C3104a.m15337a(this, strArr, i);
            return;
        }
        C4431e.m24254b(i);
        try {
            this.f21468k = true;
            C3104a.m15337a(this, strArr, ((m28696b(fragment) + 1) << 16) + (i & 65535));
        } finally {
            this.f21468k = false;
        }
    }

    /* renamed from: h */
    private void mo4973h() {
        do {
        } while (m28695a(m28707f(), State.CREATED));
    }

    /* renamed from: a */
    private static boolean m28695a(C0334l c0334l, State state) {
        boolean z = false;
        for (Fragment fragment : c0334l.mo304f()) {
            if (fragment != null) {
                if (fragment.getLifecycle().mo15a().m22a(State.STARTED)) {
                    fragment.mLifecycleRegistry.m14719a(state);
                    z = true;
                }
                C0334l peekChildFragmentManager = fragment.peekChildFragmentManager();
                if (peekChildFragmentManager != null) {
                    z |= m28695a(peekChildFragmentManager, state);
                }
            }
        }
        return z;
    }
}
