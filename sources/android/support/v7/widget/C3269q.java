package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;

/* renamed from: android.support.v7.widget.q */
class C3269q implements C0869t {
    /* renamed from: a */
    public void mo834a() {
    }

    C3269q() {
    }

    /* renamed from: a */
    public void mo836a(C0868s c0868s, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        c0868s.mo658a(new am(colorStateList, f));
        context = c0868s.mo662d();
        context.setClipToOutline(true);
        context.setElevation(f2);
        mo839b(c0868s, f3);
    }

    /* renamed from: a */
    public void mo835a(C0868s c0868s, float f) {
        m16852j(c0868s).m3495a(f);
    }

    /* renamed from: b */
    public void mo839b(C0868s c0868s, float f) {
        m16852j(c0868s).m3496a(f, c0868s.mo659a(), c0868s.mo660b());
        mo844f(c0868s);
    }

    /* renamed from: a */
    public float mo833a(C0868s c0868s) {
        return m16852j(c0868s).m3494a();
    }

    /* renamed from: b */
    public float mo838b(C0868s c0868s) {
        return mo842d(c0868s) * 2.0f;
    }

    /* renamed from: c */
    public float mo840c(C0868s c0868s) {
        return mo842d(c0868s) * 2.0f;
    }

    /* renamed from: d */
    public float mo842d(C0868s c0868s) {
        return m16852j(c0868s).m3498b();
    }

    /* renamed from: c */
    public void mo841c(C0868s c0868s, float f) {
        c0868s.mo662d().setElevation(f);
    }

    /* renamed from: e */
    public float mo843e(C0868s c0868s) {
        return c0868s.mo662d().getElevation();
    }

    /* renamed from: f */
    public void mo844f(C0868s c0868s) {
        if (c0868s.mo659a()) {
            float a = mo833a(c0868s);
            float d = mo842d(c0868s);
            int ceil = (int) Math.ceil((double) an.m3504b(a, d, c0868s.mo660b()));
            int ceil2 = (int) Math.ceil((double) an.m3501a(a, d, c0868s.mo660b()));
            c0868s.mo657a(ceil, ceil2, ceil, ceil2);
            return;
        }
        c0868s.mo657a(0, 0, 0, 0);
    }

    /* renamed from: g */
    public void mo845g(C0868s c0868s) {
        mo839b(c0868s, mo833a(c0868s));
    }

    /* renamed from: h */
    public void mo846h(C0868s c0868s) {
        mo839b(c0868s, mo833a(c0868s));
    }

    /* renamed from: a */
    public void mo837a(C0868s c0868s, ColorStateList colorStateList) {
        m16852j(c0868s).m3497a(colorStateList);
    }

    /* renamed from: i */
    public ColorStateList mo847i(C0868s c0868s) {
        return m16852j(c0868s).m3499c();
    }

    /* renamed from: j */
    private am m16852j(C0868s c0868s) {
        return (am) c0868s.mo661c();
    }
}
