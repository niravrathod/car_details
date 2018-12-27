package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v4.view.C0560r;
import android.support.v7.app.ActionBar.C0638a;
import android.support.v7.view.C0714i;
import android.support.v7.view.menu.C0728o.C0727a;
import android.support.v7.view.menu.C3224h;
import android.support.v7.view.menu.C3224h.C0723a;
import android.support.v7.widget.C0874w;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.Toolbar.C0829b;
import android.support.v7.widget.az;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window.Callback;
import java.util.ArrayList;

/* renamed from: android.support.v7.app.l */
class C3208l extends ActionBar {
    /* renamed from: a */
    C0874w f13441a;
    /* renamed from: b */
    boolean f13442b;
    /* renamed from: c */
    Callback f13443c;
    /* renamed from: d */
    private boolean f13444d;
    /* renamed from: e */
    private boolean f13445e;
    /* renamed from: f */
    private ArrayList<C0638a> f13446f = new ArrayList();
    /* renamed from: g */
    private final Runnable f13447g = new C06681(this);
    /* renamed from: h */
    private final C0829b f13448h = new C32042(this);

    /* renamed from: android.support.v7.app.l$1 */
    class C06681 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C3208l f2167a;

        C06681(C3208l c3208l) {
            this.f2167a = c3208l;
        }

        public void run() {
            this.f2167a.m15973i();
        }
    }

    /* renamed from: android.support.v7.app.l$2 */
    class C32042 implements C0829b {
        /* renamed from: a */
        final /* synthetic */ C3208l f13436a;

        C32042(C3208l c3208l) {
            this.f13436a = c3208l;
        }

        /* renamed from: a */
        public boolean mo524a(MenuItem menuItem) {
            return this.f13436a.f13443c.onMenuItemSelected(0, menuItem);
        }
    }

    /* renamed from: android.support.v7.app.l$a */
    private final class C3205a implements C0727a {
        /* renamed from: a */
        final /* synthetic */ C3208l f13437a;
        /* renamed from: b */
        private boolean f13438b;

        C3205a(C3208l c3208l) {
            this.f13437a = c3208l;
        }

        /* renamed from: a */
        public boolean mo491a(C3224h c3224h) {
            if (this.f13437a.f13443c == null) {
                return null;
            }
            this.f13437a.f13443c.onMenuOpened(108, c3224h);
            return true;
        }

        /* renamed from: a */
        public void mo490a(C3224h c3224h, boolean z) {
            if (!this.f13438b) {
                this.f13438b = true;
                this.f13437a.f13441a.mo818n();
                if (this.f13437a.f13443c) {
                    this.f13437a.f13443c.onPanelClosed(108, c3224h);
                }
                this.f13438b = null;
            }
        }
    }

    /* renamed from: android.support.v7.app.l$b */
    private final class C3206b implements C0723a {
        /* renamed from: a */
        final /* synthetic */ C3208l f13439a;

        /* renamed from: a */
        public boolean mo102a(C3224h c3224h, MenuItem menuItem) {
            return false;
        }

        C3206b(C3208l c3208l) {
            this.f13439a = c3208l;
        }

        /* renamed from: a */
        public void mo101a(C3224h c3224h) {
            if (this.f13439a.f13443c == null) {
                return;
            }
            if (this.f13439a.f13441a.mo813i()) {
                this.f13439a.f13443c.onPanelClosed(108, c3224h);
            } else if (this.f13439a.f13443c.onPreparePanel(0, null, c3224h)) {
                this.f13439a.f13443c.onMenuOpened(108, c3224h);
            }
        }
    }

    /* renamed from: android.support.v7.app.l$c */
    private class C3207c extends C0714i {
        /* renamed from: a */
        final /* synthetic */ C3208l f13440a;

        public C3207c(C3208l c3208l, Callback callback) {
            this.f13440a = c3208l;
            super(callback);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            i = super.onPreparePanel(i, view, menu);
            if (i != 0 && this.f13440a.f13442b == null) {
                this.f13440a.f13441a.mo817m();
                this.f13440a.f13442b = true;
            }
            return i;
        }

        public View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(this.f13440a.f13441a.mo799b());
            }
            return super.onCreatePanelView(i);
        }
    }

    /* renamed from: d */
    public void mo541d(boolean z) {
    }

    /* renamed from: f */
    public void mo544f(boolean z) {
    }

    /* renamed from: g */
    public void mo547g(boolean z) {
    }

    /* renamed from: i */
    void m15973i() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x002f in list [B:13:0x002c]
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:43)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:60)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r5 = this;
        r0 = r5.m15947j();
        r1 = r0 instanceof android.support.v7.view.menu.C3224h;
        r2 = 0;
        if (r1 == 0) goto L_0x000d;
    L_0x0009:
        r1 = r0;
        r1 = (android.support.v7.view.menu.C3224h) r1;
        goto L_0x000e;
    L_0x000d:
        r1 = r2;
    L_0x000e:
        if (r1 == 0) goto L_0x0013;
    L_0x0010:
        r1.m16175g();
    L_0x0013:
        r0.clear();	 Catch:{ all -> 0x0030 }
        r3 = r5.f13443c;	 Catch:{ all -> 0x0030 }
        r4 = 0;	 Catch:{ all -> 0x0030 }
        r3 = r3.onCreatePanelMenu(r4, r0);	 Catch:{ all -> 0x0030 }
        if (r3 == 0) goto L_0x0027;	 Catch:{ all -> 0x0030 }
    L_0x001f:
        r3 = r5.f13443c;	 Catch:{ all -> 0x0030 }
        r2 = r3.onPreparePanel(r4, r2, r0);	 Catch:{ all -> 0x0030 }
        if (r2 != 0) goto L_0x002a;	 Catch:{ all -> 0x0030 }
    L_0x0027:
        r0.clear();	 Catch:{ all -> 0x0030 }
    L_0x002a:
        if (r1 == 0) goto L_0x002f;
    L_0x002c:
        r1.m16176h();
    L_0x002f:
        return;
    L_0x0030:
        r0 = move-exception;
        if (r1 == 0) goto L_0x0036;
    L_0x0033:
        r1.m16176h();
    L_0x0036:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.l.i():void");
    }

    C3208l(Toolbar toolbar, CharSequence charSequence, Callback callback) {
        this.f13441a = new az(toolbar, false);
        this.f13443c = new C3207c(this, callback);
        this.f13441a.mo796a(this.f13443c);
        toolbar.setOnMenuItemClickListener(this.f13448h);
        this.f13441a.mo797a(charSequence);
    }

    /* renamed from: h */
    public Callback m15971h() {
        return this.f13443c;
    }

    /* renamed from: a */
    public void mo527a(float f) {
        C0560r.m2166a(this.f13441a.mo790a(), f);
    }

    /* renamed from: b */
    public Context mo535b() {
        return this.f13441a.mo799b();
    }

    /* renamed from: a */
    public void mo530a(Drawable drawable) {
        this.f13441a.mo801b(drawable);
    }

    /* renamed from: b */
    public void mo536b(int i) {
        this.f13441a.mo807d(i);
    }

    /* renamed from: a */
    public void mo529a(Configuration configuration) {
        super.mo529a(configuration);
    }

    /* renamed from: a */
    public void mo531a(CharSequence charSequence) {
        this.f13441a.mo802b(charSequence);
    }

    /* renamed from: a */
    public void mo528a(int i) {
        this.f13441a.mo802b(i != 0 ? this.f13441a.mo799b().getText(i) : 0);
    }

    /* renamed from: b */
    public void mo537b(CharSequence charSequence) {
        this.f13441a.mo797a(charSequence);
    }

    /* renamed from: a */
    public void m15951a(int i, int i2) {
        this.f13441a.mo804c((i & i2) | ((i2 ^ -1) & this.f13441a.mo819o()));
    }

    /* renamed from: a */
    public void mo532a(boolean z) {
        m15951a(z ? true : false, 2);
    }

    /* renamed from: b */
    public void mo538b(boolean z) {
        m15951a(z ? true : false, 4);
    }

    /* renamed from: c */
    public void mo539c(boolean z) {
        m15951a(z ? true : false, 8);
    }

    /* renamed from: a */
    public int mo526a() {
        return this.f13441a.mo819o();
    }

    /* renamed from: c */
    public boolean mo540c() {
        return this.f13441a.mo815k();
    }

    /* renamed from: d */
    public boolean mo542d() {
        return this.f13441a.mo816l();
    }

    /* renamed from: e */
    public boolean mo543e() {
        this.f13441a.mo790a().removeCallbacks(this.f13447g);
        C0560r.m2178a(this.f13441a.mo790a(), this.f13447g);
        return true;
    }

    /* renamed from: f */
    public boolean mo545f() {
        if (!this.f13441a.mo805c()) {
            return false;
        }
        this.f13441a.mo806d();
        return true;
    }

    /* renamed from: a */
    public boolean mo534a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo540c();
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo533a(int i, KeyEvent keyEvent) {
        Menu j = m15947j();
        if (j == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        j.setQwertyMode(z);
        return j.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: g */
    void mo546g() {
        this.f13441a.mo790a().removeCallbacks(this.f13447g);
    }

    /* renamed from: h */
    public void mo548h(boolean z) {
        if (z != this.f13445e) {
            this.f13445e = z;
            int size = this.f13446f.size();
            for (int i = 0; i < size; i++) {
                ((C0638a) this.f13446f.get(i)).m2536a(z);
            }
        }
    }

    /* renamed from: j */
    private Menu m15947j() {
        if (!this.f13444d) {
            this.f13441a.mo793a(new C3205a(this), new C3206b(this));
            this.f13444d = true;
        }
        return this.f13441a.mo821q();
    }
}
