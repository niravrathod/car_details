package androidx.navigation.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.navigation.C0894d;
import androidx.navigation.C0905l;
import androidx.navigation.C0909m;
import androidx.navigation.fragment.C0899c.C0898a;
import androidx.navigation.fragment.C3280b.C3278a;

public class NavHostFragment extends Fragment {
    /* renamed from: a */
    private C0894d f18664a;
    /* renamed from: b */
    private boolean f18665b;

    /* renamed from: a */
    public static C0894d m24753a(Fragment fragment) {
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getParentFragment()) {
            if (fragment2 instanceof NavHostFragment) {
                return ((NavHostFragment) fragment2).m24754a();
            }
            Fragment h = fragment2.requireFragmentManager().mo306h();
            if (h instanceof NavHostFragment) {
                return ((NavHostFragment) h).m24754a();
            }
        }
        View view = fragment.getView();
        if (view != null) {
            return C0905l.m3957a(view);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(fragment);
        stringBuilder.append(" does not have a NavController set");
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: a */
    public C0894d m24754a() {
        if (this.f18664a != null) {
            return this.f18664a;
        }
        throw new IllegalStateException("NavController is not available before onCreate()");
    }

    /* renamed from: a */
    public void m24755a(int i) {
        if (this.f18664a == null) {
            Bundle arguments = getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putInt("android-support-nav:fragment:graphId", i);
            setArguments(arguments);
            return;
        }
        this.f18664a.m3887a(i);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (this.f18665b != null) {
            requireFragmentManager().mo292a().mo281d(this).mo278c();
        }
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.f18664a = new C0894d(requireContext());
        this.f18664a.m3898b().mo863a(m24756b());
        int i = 0;
        if (bundle != null) {
            bundle2 = bundle.getBundle("android-support-nav:fragment:navControllerState");
            if (bundle.getBoolean("android-support-nav:fragment:defaultHost", false) != null) {
                this.f18665b = true;
                requireFragmentManager().mo292a().mo281d(this).mo278c();
            }
        } else {
            bundle2 = null;
        }
        if (bundle2 != null) {
            this.f18664a.m3891a(bundle2);
            return;
        }
        bundle = getArguments();
        if (bundle != null) {
            i = bundle.getInt("android-support-nav:fragment:graphId");
        }
        if (i != 0) {
            this.f18664a.m3887a(i);
        } else {
            this.f18664a.m3901e();
        }
    }

    /* renamed from: b */
    protected C0909m<? extends C3278a> m24756b() {
        return new C3280b(requireContext(), getChildFragmentManager(), getId());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        viewGroup = new FrameLayout(layoutInflater.getContext());
        viewGroup.setId(getId());
        return viewGroup;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if ((view instanceof ViewGroup) != null) {
            if (view.getParent() != null) {
                view = (View) view.getParent();
            }
            C0905l.m3958a(view, this.f18664a);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("created host view ");
        stringBuilder.append(view);
        stringBuilder.append(" is not a ViewGroup");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(context, attributeSet, bundle);
        context = context.obtainStyledAttributes(attributeSet, C0898a.NavHostFragment);
        int resourceId = context.getResourceId(C0898a.NavHostFragment_navGraph, 0);
        bundle = context.getBoolean(C0898a.NavHostFragment_defaultNavHost, false);
        if (resourceId != null) {
            m24755a(resourceId);
        }
        if (bundle != null) {
            this.f18665b = true;
        }
        context.recycle();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle i = this.f18664a.m3905i();
        if (i != null) {
            bundle.putBundle("android-support-nav:fragment:navControllerState", i);
        }
        if (this.f18665b) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }
}
