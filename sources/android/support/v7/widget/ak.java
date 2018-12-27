package android.support.v7.widget;

import android.os.Bundle;
import android.support.v4.view.C0536a;
import android.support.v4.view.p018a.C0532b;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public class ak extends C0536a {
    /* renamed from: a */
    final RecyclerView f13939a;
    /* renamed from: c */
    final C0536a f13940c = new C3258a(this);

    /* renamed from: android.support.v7.widget.ak$a */
    public static class C3258a extends C0536a {
        /* renamed from: a */
        final ak f13938a;

        public C3258a(ak akVar) {
            this.f13938a = akVar;
        }

        /* renamed from: a */
        public void mo87a(View view, C0532b c0532b) {
            super.mo87a(view, c0532b);
            if (!this.f13938a.m16727b() && this.f13938a.f13939a.getLayoutManager() != null) {
                this.f13938a.f13939a.getLayoutManager().m3069a(view, c0532b);
            }
        }

        /* renamed from: a */
        public boolean mo439a(View view, int i, Bundle bundle) {
            if (super.mo439a(view, i, bundle)) {
                return true;
            }
            return (this.f13938a.m16727b() || this.f13938a.f13939a.getLayoutManager() == null) ? null : this.f13938a.f13939a.getLayoutManager().m3084a(view, i, bundle);
        }
    }

    public ak(RecyclerView recyclerView) {
        this.f13939a = recyclerView;
    }

    /* renamed from: b */
    boolean m16727b() {
        return this.f13939a.m24707v();
    }

    /* renamed from: a */
    public boolean mo439a(View view, int i, Bundle bundle) {
        if (super.mo439a(view, i, bundle) != null) {
            return true;
        }
        return (m16727b() != null || this.f13939a.getLayoutManager() == null) ? null : this.f13939a.getLayoutManager().m3074a(i, bundle);
    }

    /* renamed from: a */
    public void mo87a(View view, C0532b c0532b) {
        super.mo87a(view, c0532b);
        c0532b.m1965b(RecyclerView.class.getName());
        if (m16727b() == null && this.f13939a.getLayoutManager() != null) {
            this.f13939a.getLayoutManager().m3048a(c0532b);
        }
    }

    /* renamed from: a */
    public void mo119a(View view, AccessibilityEvent accessibilityEvent) {
        super.mo119a(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if ((view instanceof RecyclerView) && !m16727b()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().mo675a(accessibilityEvent);
            }
        }
    }

    /* renamed from: c */
    public C0536a m16728c() {
        return this.f13940c;
    }
}
