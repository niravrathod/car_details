package android.support.v4.view;

import android.os.Build.VERSION;
import android.support.p005a.C0066a.C0064a;
import android.view.ViewGroup;

/* renamed from: android.support.v4.view.t */
public final class C0563t {
    /* renamed from: a */
    static final C0562c f1776a;

    /* renamed from: android.support.v4.view.t$c */
    static class C0562c {
        C0562c() {
        }

        /* renamed from: a */
        public boolean mo3782a(ViewGroup viewGroup) {
            Boolean bool = (Boolean) viewGroup.getTag(C0064a.tag_transition_group);
            if ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null) {
                if (C0560r.m2202n(viewGroup) == null) {
                    return null;
                }
            }
            return true;
        }
    }

    /* renamed from: android.support.v4.view.t$a */
    static class C3170a extends C0562c {
        C3170a() {
        }
    }

    /* renamed from: android.support.v4.view.t$b */
    static class C4443b extends C3170a {
        C4443b() {
        }

        /* renamed from: a */
        public boolean mo3782a(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }
    }

    static {
        if (VERSION.SDK_INT >= 21) {
            f1776a = new C4443b();
        } else if (VERSION.SDK_INT >= 18) {
            f1776a = new C3170a();
        } else {
            f1776a = new C0562c();
        }
    }

    /* renamed from: a */
    public static boolean m2219a(ViewGroup viewGroup) {
        return f1776a.mo3782a(viewGroup);
    }
}
