package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v4.app.j */
public class C0330j {
    /* renamed from: a */
    private final C3107k<?> f1152a;

    /* renamed from: a */
    public static C0330j m1175a(C3107k<?> c3107k) {
        return new C0330j(c3107k);
    }

    private C0330j(C3107k<?> c3107k) {
        this.f1152a = c3107k;
    }

    /* renamed from: a */
    public C0334l m1177a() {
        return this.f1152a.m15392k();
    }

    /* renamed from: a */
    public Fragment m1176a(String str) {
        return this.f1152a.f13142d.m15464b(str);
    }

    /* renamed from: a */
    public void m1181a(Fragment fragment) {
        this.f1152a.f13142d.m15454a(this.f1152a, this.f1152a, fragment);
    }

    /* renamed from: a */
    public View m1178a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f1152a.f13142d.onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: b */
    public void m1186b() {
        this.f1152a.f13142d.m15515q();
    }

    /* renamed from: c */
    public Parcelable m1190c() {
        return this.f1152a.f13142d.m15513p();
    }

    /* renamed from: a */
    public void m1180a(Parcelable parcelable, C0346n c0346n) {
        this.f1152a.f13142d.m15448a(parcelable, c0346n);
    }

    /* renamed from: d */
    public C0346n m1191d() {
        return this.f1152a.f13142d.m15509n();
    }

    /* renamed from: e */
    public void m1192e() {
        this.f1152a.f13142d.m15516r();
    }

    /* renamed from: f */
    public void m1193f() {
        this.f1152a.f13142d.m15517s();
    }

    /* renamed from: g */
    public void m1194g() {
        this.f1152a.f13142d.m15518t();
    }

    /* renamed from: h */
    public void m1195h() {
        this.f1152a.f13142d.m15519u();
    }

    /* renamed from: i */
    public void m1196i() {
        this.f1152a.f13142d.m15520v();
    }

    /* renamed from: j */
    public void m1197j() {
        this.f1152a.f13142d.m15521w();
    }

    /* renamed from: k */
    public void m1198k() {
        this.f1152a.f13142d.m15522x();
    }

    /* renamed from: l */
    public void m1199l() {
        this.f1152a.f13142d.m15524z();
    }

    /* renamed from: a */
    public void m1182a(boolean z) {
        this.f1152a.f13142d.m15459a(z);
    }

    /* renamed from: b */
    public void m1188b(boolean z) {
        this.f1152a.f13142d.m15474b(z);
    }

    /* renamed from: a */
    public void m1179a(Configuration configuration) {
        this.f1152a.f13142d.m15446a(configuration);
    }

    /* renamed from: m */
    public void m1200m() {
        this.f1152a.f13142d.m15434A();
    }

    /* renamed from: a */
    public boolean m1184a(Menu menu, MenuInflater menuInflater) {
        return this.f1152a.f13142d.m15461a(menu, menuInflater);
    }

    /* renamed from: a */
    public boolean m1183a(Menu menu) {
        return this.f1152a.f13142d.m15460a(menu);
    }

    /* renamed from: a */
    public boolean m1185a(MenuItem menuItem) {
        return this.f1152a.f13142d.m15462a(menuItem);
    }

    /* renamed from: b */
    public boolean m1189b(MenuItem menuItem) {
        return this.f1152a.f13142d.m15476b(menuItem);
    }

    /* renamed from: b */
    public void m1187b(Menu menu) {
        this.f1152a.f13142d.m15473b(menu);
    }

    /* renamed from: n */
    public boolean m1201n() {
        return this.f1152a.f13142d.m15504k();
    }
}
