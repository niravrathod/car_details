package android.support.transition;

import android.support.v4.p017f.C3131a;
import android.support.v4.view.C0560r;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class ae {
    /* renamed from: a */
    private static Transition f988a = new AutoTransition();
    /* renamed from: b */
    private static ThreadLocal<WeakReference<C3131a<ViewGroup, ArrayList<Transition>>>> f989b = new ThreadLocal();
    /* renamed from: c */
    private static ArrayList<ViewGroup> f990c = new ArrayList();

    /* renamed from: android.support.transition.ae$a */
    private static class C0266a implements OnAttachStateChangeListener, OnPreDrawListener {
        /* renamed from: a */
        Transition f986a;
        /* renamed from: b */
        ViewGroup f987b;

        public void onViewAttachedToWindow(View view) {
        }

        C0266a(Transition transition, ViewGroup viewGroup) {
            this.f986a = transition;
            this.f987b = viewGroup;
        }

        /* renamed from: a */
        private void m971a() {
            this.f987b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f987b.removeOnAttachStateChangeListener(this);
        }

        public void onViewDetachedFromWindow(View view) {
            m971a();
            ae.f990c.remove(this.f987b);
            ArrayList arrayList = (ArrayList) ae.m972a().get(this.f987b);
            if (arrayList != null && arrayList.size() > 0) {
                view = arrayList.iterator();
                while (view.hasNext()) {
                    ((Transition) view.next()).mo213f(this.f987b);
                }
            }
            this.f986a.m945b(true);
        }

        public boolean onPreDraw() {
            m971a();
            if (!ae.f990c.remove(this.f987b)) {
                return true;
            }
            final C3131a a = ae.m972a();
            ArrayList arrayList = (ArrayList) a.get(this.f987b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                a.put(this.f987b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f986a);
            this.f986a.mo199a(new ad(this) {
                /* renamed from: b */
                final /* synthetic */ C0266a f18399b;

                /* renamed from: a */
                public void mo175a(Transition transition) {
                    ((ArrayList) a.get(this.f18399b.f987b)).remove(transition);
                }
            });
            this.f986a.m936a(this.f987b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).mo213f(this.f987b);
                }
            }
            this.f986a.m934a(this.f987b);
            return true;
        }
    }

    /* renamed from: a */
    static C3131a<ViewGroup, ArrayList<Transition>> m972a() {
        WeakReference weakReference = (WeakReference) f989b.get();
        if (weakReference == null || weakReference.get() == null) {
            WeakReference weakReference2 = new WeakReference(new C3131a());
            f989b.set(weakReference2);
            weakReference = weakReference2;
        }
        return (C3131a) weakReference.get();
    }

    /* renamed from: b */
    private static void m975b(ViewGroup viewGroup, Transition transition) {
        if (transition != null && viewGroup != null) {
            Object c0266a = new C0266a(transition, viewGroup);
            viewGroup.addOnAttachStateChangeListener(c0266a);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(c0266a);
        }
    }

    /* renamed from: c */
    private static void m976c(ViewGroup viewGroup, Transition transition) {
        ArrayList arrayList = (ArrayList) m972a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).mo212e(viewGroup);
            }
        }
        if (transition != null) {
            transition.m936a(viewGroup, true);
        }
        viewGroup = aa.m968a(viewGroup);
        if (viewGroup != null) {
            viewGroup.m970a();
        }
    }

    /* renamed from: a */
    public static void m973a(ViewGroup viewGroup, Transition transition) {
        if (!f990c.contains(viewGroup) && C0560r.m2212x(viewGroup)) {
            f990c.add(viewGroup);
            if (transition == null) {
                transition = f988a;
            }
            transition = transition.mo214n();
            m976c(viewGroup, transition);
            aa.m969a(viewGroup, null);
            m975b(viewGroup, transition);
        }
    }
}
