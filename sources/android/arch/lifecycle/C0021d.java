package android.arch.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.Lifecycle.State;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.C0334l;
import android.support.v4.app.C0334l.C0332b;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: android.arch.lifecycle.d */
class C0021d {
    /* renamed from: a */
    private static AtomicBoolean f48a = new AtomicBoolean(false);

    /* renamed from: android.arch.lifecycle.d$b */
    static class C3002b extends C0019b {
        /* renamed from: a */
        private final C3003c f12712a = new C3003c();

        C3002b() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if ((activity instanceof FragmentActivity) != null) {
                ((FragmentActivity) activity).m28707f().mo295a(this.f12712a, true);
            }
            C0032o.m77a(activity);
        }

        public void onActivityStopped(Activity activity) {
            if (activity instanceof FragmentActivity) {
                C0021d.m63b((FragmentActivity) activity, State.CREATED);
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            if ((activity instanceof FragmentActivity) != null) {
                C0021d.m63b((FragmentActivity) activity, State.CREATED);
            }
        }
    }

    /* renamed from: android.arch.lifecycle.d$c */
    static class C3003c extends C0332b {
        C3003c() {
        }

        /* renamed from: a */
        public void mo13a(C0334l c0334l, Fragment fragment, Bundle bundle) {
            C0021d.m62b(fragment, Event.ON_CREATE);
            if ((fragment instanceof C3005h) != null && fragment.getChildFragmentManager().mo291a("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragment.getChildFragmentManager().mo292a().mo271a(new C4397a(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").mo278c();
            }
        }

        /* renamed from: a */
        public void mo12a(C0334l c0334l, Fragment fragment) {
            C0021d.m62b(fragment, Event.ON_START);
        }

        /* renamed from: b */
        public void mo14b(C0334l c0334l, Fragment fragment) {
            C0021d.m62b(fragment, Event.ON_RESUME);
        }
    }

    /* renamed from: android.arch.lifecycle.d$a */
    public static class C4397a extends Fragment {
        public void onPause() {
            super.onPause();
            m24005a(Event.ON_PAUSE);
        }

        public void onStop() {
            super.onStop();
            m24005a(Event.ON_STOP);
        }

        public void onDestroy() {
            super.onDestroy();
            m24005a(Event.ON_DESTROY);
        }

        /* renamed from: a */
        protected void m24005a(Event event) {
            C0021d.m62b(getParentFragment(), event);
        }
    }

    /* renamed from: a */
    static void m57a(Context context) {
        if (!f48a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C3002b());
        }
    }

    /* renamed from: a */
    private static void m60a(C0334l c0334l, State state) {
        C0334l<Object> f = c0334l.mo304f();
        if (f != null) {
            for (Object obj : f) {
                if (obj != null) {
                    C0021d.m61a(obj, state);
                    if (obj.isAdded()) {
                        C0021d.m60a(obj.getChildFragmentManager(), state);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m61a(Object obj, State state) {
        if (obj instanceof C3005h) {
            ((C3005h) obj).m14722a().m14719a(state);
        }
    }

    /* renamed from: b */
    private static void m63b(FragmentActivity fragmentActivity, State state) {
        C0021d.m61a((Object) fragmentActivity, state);
        C0021d.m60a(fragmentActivity.m28707f(), state);
    }

    /* renamed from: b */
    private static void m62b(Fragment fragment, Event event) {
        if (fragment instanceof C3005h) {
            ((C3005h) fragment).m14722a().m14718a(event);
        }
    }
}
