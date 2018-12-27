package android.support.v7.view.menu;

import android.content.Context;
import android.support.v7.view.menu.C0728o.C0727a;
import android.support.v7.view.menu.C0730p.C0729a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.b */
public abstract class C3220b implements C0728o {
    /* renamed from: a */
    protected Context f13549a;
    /* renamed from: b */
    protected Context f13550b;
    /* renamed from: c */
    protected C3224h f13551c;
    /* renamed from: d */
    protected LayoutInflater f13552d;
    /* renamed from: e */
    protected LayoutInflater f13553e;
    /* renamed from: f */
    protected C0730p f13554f;
    /* renamed from: g */
    private C0727a f13555g;
    /* renamed from: h */
    private int f13556h;
    /* renamed from: i */
    private int f13557i;
    /* renamed from: j */
    private int f13558j;

    /* renamed from: a */
    public abstract void mo3845a(C3227j c3227j, C0729a c0729a);

    /* renamed from: a */
    public boolean mo80a() {
        return false;
    }

    /* renamed from: a */
    public boolean mo3846a(int i, C3227j c3227j) {
        return true;
    }

    /* renamed from: a */
    public boolean mo81a(C3224h c3224h, C3227j c3227j) {
        return false;
    }

    /* renamed from: b */
    public boolean mo84b(C3224h c3224h, C3227j c3227j) {
        return false;
    }

    public C3220b(Context context, int i, int i2) {
        this.f13549a = context;
        this.f13552d = LayoutInflater.from(context);
        this.f13556h = i;
        this.f13557i = i2;
    }

    /* renamed from: a */
    public void mo75a(Context context, C3224h c3224h) {
        this.f13550b = context;
        this.f13553e = LayoutInflater.from(this.f13550b);
        this.f13551c = c3224h;
    }

    /* renamed from: a */
    public C0730p mo3843a(ViewGroup viewGroup) {
        if (this.f13554f == null) {
            this.f13554f = (C0730p) this.f13552d.inflate(this.f13556h, viewGroup, false);
            this.f13554f.mo74a(this.f13551c);
            mo79a(true);
        }
        return this.f13554f;
    }

    /* renamed from: a */
    public void mo79a(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f13554f;
        if (viewGroup != null) {
            int i = 0;
            if (this.f13551c != null) {
                this.f13551c.m16178j();
                ArrayList i2 = this.f13551c.m16177i();
                int size = i2.size();
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    C3227j c3227j = (C3227j) i2.get(i4);
                    if (mo3846a(i3, c3227j)) {
                        View childAt = viewGroup.getChildAt(i3);
                        C3227j itemData = childAt instanceof C0729a ? ((C0729a) childAt).getItemData() : null;
                        View a = mo3844a(c3227j, childAt, viewGroup);
                        if (c3227j != itemData) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            m16095a(a, i3);
                        }
                        i3++;
                    }
                }
                i = i3;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo3847a(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    protected void m16095a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f13554f).addView(view, i);
    }

    /* renamed from: a */
    protected boolean mo3847a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: a */
    public void mo78a(C0727a c0727a) {
        this.f13555g = c0727a;
    }

    /* renamed from: d */
    public C0727a m16105d() {
        return this.f13555g;
    }

    /* renamed from: b */
    public C0729a m16103b(ViewGroup viewGroup) {
        return (C0729a) this.f13552d.inflate(this.f13557i, viewGroup, false);
    }

    /* renamed from: a */
    public View mo3844a(C3227j c3227j, View view, ViewGroup viewGroup) {
        C0729a c0729a;
        if (view instanceof C0729a) {
            c0729a = (C0729a) view;
        } else {
            c0729a = m16103b(viewGroup);
        }
        mo3845a(c3227j, c0729a);
        return (View) c0729a;
    }

    /* renamed from: a */
    public void mo77a(C3224h c3224h, boolean z) {
        if (this.f13555g != null) {
            this.f13555g.mo490a(c3224h, z);
        }
    }

    /* renamed from: a */
    public boolean mo82a(C4465u c4465u) {
        return this.f13555g != null ? this.f13555g.mo491a(c4465u) : null;
    }

    /* renamed from: b */
    public int mo83b() {
        return this.f13558j;
    }

    /* renamed from: a */
    public void m16090a(int i) {
        this.f13558j = i;
    }
}
