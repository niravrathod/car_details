package com.cuvora.carinfo.fragment;

import android.os.Bundle;
import android.support.v4.app.C4432h;
import android.support.v7.widget.AppCompatImageView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.cuvora.carinfo.C1491f.C1487a;
import com.cuvora.carinfo.R;
import java.util.HashMap;
import kotlin.jvm.internal.C2885g;

/* renamed from: com.cuvora.carinfo.fragment.g */
public final class C4803g extends C4432h {
    /* renamed from: a */
    public static final C1500a f21025a = new C1500a();
    /* renamed from: b */
    private int f21026b = 1;
    /* renamed from: c */
    private int f21027c = R.style.MyDialog;
    /* renamed from: d */
    private HashMap f21028d;

    /* renamed from: com.cuvora.carinfo.fragment.g$a */
    public static final class C1500a {
        private C1500a() {
        }

        /* renamed from: a */
        public final C4803g m5737a() {
            Bundle bundle = new Bundle();
            C4803g c4803g = new C4803g();
            c4803g.setArguments(bundle);
            return c4803g;
        }
    }

    /* renamed from: com.cuvora.carinfo.fragment.g$b */
    static final class C1501b implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C4803g f4488a;

        C1501b(C4803g c4803g) {
            this.f4488a = c4803g;
        }

        public final void onClick(View view) {
            this.f4488a.dismiss();
        }
    }

    /* renamed from: a */
    public View m27790a(int i) {
        if (this.f21028d == null) {
            this.f21028d = new HashMap();
        }
        View view = (View) this.f21028d.get(Integer.valueOf(i));
        if (view == null) {
            view = getView();
            if (view == null) {
                return null;
            }
            view = view.findViewById(i);
            this.f21028d.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void m27791a() {
        if (this.f21028d != null) {
            this.f21028d.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m27791a();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(this.f21026b, this.f21027c);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C2885g.m13910b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.layout_licence_help, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C2885g.m13910b(view, "view");
        super.onViewCreated(view, bundle);
        ((AppCompatImageView) m27790a(C1487a.ivCancel)).setOnClickListener((OnClickListener) new C1501b(this));
    }
}
