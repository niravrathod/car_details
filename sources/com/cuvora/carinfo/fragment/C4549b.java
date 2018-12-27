package com.cuvora.carinfo.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.cuvora.carinfo.models.homepage.TabContent;
import com.cuvora.carinfo.models.homepage.TabTypeEnum;
import java.util.HashMap;
import kotlin.jvm.internal.C2885g;

/* renamed from: com.cuvora.carinfo.fragment.b */
public abstract class C4549b extends Fragment {
    /* renamed from: a */
    public static final C1496a f18870a = new C1496a();
    /* renamed from: b */
    private TabContent f18871b;
    /* renamed from: c */
    private HashMap f18872c;

    /* renamed from: com.cuvora.carinfo.fragment.b$a */
    public static final class C1496a {
        private C1496a() {
        }

        /* renamed from: a */
        public final C4549b m5736a(TabContent tabContent, Bundle bundle) {
            C4549b c4805j;
            C2885g.m13910b(tabContent, "tabContent");
            TabTypeEnum type = tabContent.getType();
            if (type != null) {
                switch (C1497c.f4485a[type.ordinal()]) {
                    case 1:
                        c4805j = new C4805j();
                        break;
                    case 2:
                        c4805j = new C4804h();
                        break;
                    case 3:
                        c4805j = new C4801d();
                        break;
                    default:
                        break;
                }
            }
            c4805j = new C4801d();
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("tab_content", tabContent);
            bundle2.putBundle("tab_bundle", bundle);
            c4805j.setArguments(bundle2);
            return c4805j;
        }
    }

    /* renamed from: a */
    public View mo4626a(int i) {
        if (this.f18872c == null) {
            this.f18872c = new HashMap();
        }
        View view = (View) this.f18872c.get(Integer.valueOf(i));
        if (view == null) {
            view = getView();
            if (view == null) {
                return null;
            }
            view = view.findViewById(i);
            this.f18872c.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: c */
    public abstract void mo4628c();

    /* renamed from: d */
    public boolean mo4632d() {
        return false;
    }

    /* renamed from: e */
    public void mo4629e() {
        if (this.f18872c != null) {
            this.f18872c.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo4629e();
    }

    /* renamed from: a */
    public final TabContent m25062a() {
        return this.f18871b;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo4630b();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C2885g.m13910b(view, "view");
        super.onViewCreated(view, bundle);
        if (mo4634f() != null) {
            mo4628c();
        }
    }

    /* renamed from: b */
    public void mo4630b() {
        Bundle arguments = getArguments();
        Object obj = arguments != null ? arguments.get("tab_content") : null;
        if (!(obj instanceof TabContent)) {
            obj = null;
        }
        this.f18871b = (TabContent) obj;
    }

    /* renamed from: f */
    private final boolean mo4634f() {
        TabContent tabContent = this.f18871b;
        return tabContent != null ? tabContent.isShowBanner() : true;
    }
}
