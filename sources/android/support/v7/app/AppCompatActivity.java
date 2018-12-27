package android.support.v7.app;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.C0364v;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ad;
import android.support.v4.app.ad.C0322a;
import android.support.v7.app.C3199a.C0657a;
import android.support.v7.app.C3199a.C0658b;
import android.support.v7.view.C0706b;
import android.support.v7.view.C0706b.C0705a;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.bd;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

public class AppCompatActivity extends FragmentActivity implements C0322a, C0658b, C0662d {
    /* renamed from: n */
    private C0663e f21671n;
    /* renamed from: o */
    private int f21672o = 0;
    /* renamed from: p */
    private Resources f21673p;

    /* renamed from: a */
    public C0706b mo521a(C0705a c0705a) {
        return null;
    }

    /* renamed from: a */
    public void mo522a(C0706b c0706b) {
    }

    /* renamed from: b */
    public void m29820b(ad adVar) {
    }

    /* renamed from: b */
    public void mo523b(C0706b c0706b) {
    }

    @Deprecated
    /* renamed from: j */
    public void m29824j() {
    }

    protected void onCreate(Bundle bundle) {
        C0663e k = m29825k();
        k.mo3814i();
        k.mo3800a(bundle);
        if (k.mo520j() && this.f21672o != 0) {
            if (VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.f21672o, false);
            } else {
                setTheme(this.f21672o);
            }
        }
        super.onCreate(bundle);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        this.f21672o = i;
    }

    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m29825k().mo3807b(bundle);
    }

    /* renamed from: h */
    public ActionBar mo4973h() {
        return m29825k().mo512a();
    }

    /* renamed from: a */
    public void m29816a(Toolbar toolbar) {
        m29825k().mo3801a(toolbar);
    }

    public MenuInflater getMenuInflater() {
        return m29825k().mo514b();
    }

    public void setContentView(int i) {
        m29825k().mo3806b(i);
    }

    public void setContentView(View view) {
        m29825k().mo3802a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        m29825k().mo3803a(view, layoutParams);
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        m29825k().mo3808b(view, layoutParams);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m29825k().mo3799a(configuration);
        if (this.f21673p != null) {
            this.f21673p.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    protected void onPostResume() {
        super.onPostResume();
        m29825k().mo3812e();
    }

    protected void onStart() {
        super.onStart();
        m29825k().mo515c();
    }

    protected void onStop() {
        super.onStop();
        m29825k().mo517d();
    }

    public <T extends View> T findViewById(int i) {
        return m29825k().mo3797a(i);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem) != 0) {
            return true;
        }
        i = mo4973h();
        return (menuItem.getItemId() != 16908332 || i == 0 || (i.mo526a() & 4) == 0) ? false : mo5016i();
    }

    protected void onDestroy() {
        super.onDestroy();
        m29825k().mo518g();
    }

    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m29825k().mo513a(charSequence);
    }

    public void d_() {
        m29825k().mo3813f();
    }

    public void invalidateOptionsMenu() {
        m29825k().mo3813f();
    }

    /* renamed from: a */
    public void m29814a(ad adVar) {
        adVar.m1159a((Activity) this);
    }

    /* renamed from: i */
    public boolean mo5016i() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = r2.mo4970a();
        if (r0 == 0) goto L_0x0026;
    L_0x0006:
        r1 = r2.m29817a(r0);
        if (r1 == 0) goto L_0x0021;
    L_0x000c:
        r0 = android.support.v4.app.ad.m1156a(r2);
        r2.m29814a(r0);
        r2.m29820b(r0);
        r0.m1164b();
        android.support.v4.app.C3104a.m15334a(r2);	 Catch:{ IllegalStateException -> 0x001d }
        goto L_0x0024;
    L_0x001d:
        r2.finish();
        goto L_0x0024;
    L_0x0021:
        r2.m29819b(r0);
    L_0x0024:
        r0 = 1;
        return r0;
    L_0x0026:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatActivity.i():boolean");
    }

    /* renamed from: a */
    public Intent mo4970a() {
        return C0364v.m1326a(this);
    }

    /* renamed from: a */
    public boolean m29817a(Intent intent) {
        return C0364v.m1328a((Activity) this, intent);
    }

    /* renamed from: b */
    public void m29819b(Intent intent) {
        C0364v.m1331b((Activity) this, intent);
    }

    public void onContentChanged() {
        m29824j();
    }

    /* renamed from: b */
    public C0657a mo4971b() {
        return m29825k().mo519h();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m29825k().mo516c(bundle);
    }

    /* renamed from: k */
    public C0663e m29825k() {
        if (this.f21671n == null) {
            this.f21671n = C0663e.m2650a((Activity) this, (C0662d) this);
        }
        return this.f21671n;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar h = mo4973h();
        if (keyCode == 82 && h != null && h.mo534a(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public Resources getResources() {
        if (this.f21673p == null && bd.m3576a()) {
            this.f21673p = new bd(this, super.getResources());
        }
        return this.f21673p == null ? super.getResources() : this.f21673p;
    }

    /* renamed from: a */
    private boolean m29811a(int i, KeyEvent keyEvent) {
        if (VERSION.SDK_INT < 26 && keyEvent.isCtrlPressed() == 0 && KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) == 0 && keyEvent.getRepeatCount() == 0 && KeyEvent.isModifierKey(keyEvent.getKeyCode()) == 0) {
            i = getWindow();
            if (!(i == 0 || i.getDecorView() == null || i.getDecorView().dispatchKeyShortcutEvent(keyEvent) == 0)) {
                return true;
            }
        }
        return false;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (m29811a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void openOptionsMenu() {
        ActionBar h = mo4973h();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (h == null || !h.mo540c()) {
            super.openOptionsMenu();
        }
    }

    public void closeOptionsMenu() {
        ActionBar h = mo4973h();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (h == null || !h.mo542d()) {
            super.closeOptionsMenu();
        }
    }
}
