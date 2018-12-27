package android.arch.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.arch.lifecycle.Lifecycle.Event;
import android.os.Bundle;

/* renamed from: android.arch.lifecycle.o */
public class C0032o extends Fragment {
    /* renamed from: a */
    private C0031a f57a;

    /* renamed from: android.arch.lifecycle.o$a */
    interface C0031a {
        /* renamed from: a */
        void mo20a();

        /* renamed from: b */
        void mo21b();

        /* renamed from: c */
        void mo22c();
    }

    /* renamed from: a */
    public static void m77a(Activity activity) {
        activity = activity.getFragmentManager();
        if (activity.findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            activity.beginTransaction().add(new C0032o(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            activity.executePendingTransactions();
        }
    }

    /* renamed from: b */
    static C0032o m79b(Activity activity) {
        return (C0032o) activity.getFragmentManager().findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag");
    }

    /* renamed from: b */
    private void m80b(C0031a c0031a) {
        if (c0031a != null) {
            c0031a.mo20a();
        }
    }

    /* renamed from: c */
    private void m81c(C0031a c0031a) {
        if (c0031a != null) {
            c0031a.mo21b();
        }
    }

    /* renamed from: d */
    private void m82d(C0031a c0031a) {
        if (c0031a != null) {
            c0031a.mo22c();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m80b(this.f57a);
        m78a(Event.ON_CREATE);
    }

    public void onStart() {
        super.onStart();
        m81c(this.f57a);
        m78a(Event.ON_START);
    }

    public void onResume() {
        super.onResume();
        m82d(this.f57a);
        m78a(Event.ON_RESUME);
    }

    public void onPause() {
        super.onPause();
        m78a(Event.ON_PAUSE);
    }

    public void onStop() {
        super.onStop();
        m78a(Event.ON_STOP);
    }

    public void onDestroy() {
        super.onDestroy();
        m78a(Event.ON_DESTROY);
        this.f57a = null;
    }

    /* renamed from: a */
    private void m78a(Event event) {
        Activity activity = getActivity();
        if (activity instanceof C3005h) {
            ((C3005h) activity).m14722a().m14718a(event);
            return;
        }
        if (activity instanceof C0023f) {
            Lifecycle lifecycle = ((C0023f) activity).getLifecycle();
            if (lifecycle instanceof C3004g) {
                ((C3004g) lifecycle).m14718a(event);
            }
        }
    }

    /* renamed from: a */
    void m83a(C0031a c0031a) {
        this.f57a = c0031a;
    }
}
