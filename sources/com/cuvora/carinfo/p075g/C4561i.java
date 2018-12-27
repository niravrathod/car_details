package com.cuvora.carinfo.p075g;

import android.app.Activity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.helpers.C1540d;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.helpers.p077a.C1532a;
import com.cuvora.carinfo.models.homepage.Element;
import com.cuvora.carinfo.models.homepage.Section;
import com.cuvora.carinfo.p071d.C3666b;
import com.cuvora.carinfo.views.AsyncImageView;
import com.unomer.sdk.C2690a;
import com.unomer.sdk.C2691b;

/* renamed from: com.cuvora.carinfo.g.i */
public class C4561i extends C3666b {
    /* renamed from: o */
    private AsyncImageView f18914o = ((AsyncImageView) this.a.findViewById(R.id.iv_logo));
    /* renamed from: p */
    private C2690a f18915p = C1532a.m5780a((Activity) this.a.getContext(), this.f18918s);
    /* renamed from: q */
    private boolean f18916q;
    /* renamed from: r */
    private CardView f18917r = ((CardView) this.a.findViewById(R.id.cv_survey));
    /* renamed from: s */
    private C2691b f18918s = new C36802(this);

    /* renamed from: com.cuvora.carinfo.g.i$1 */
    class C15281 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C4561i f4522a;

        C15281(C4561i c4561i) {
            this.f4522a = c4561i;
        }

        public void onClick(View view) {
            if (this.f4522a.f18916q != null) {
                this.f4522a.f18915p.m13002b();
                this.f4522a.f18916q = false;
                return;
            }
            this.f4522a.f18915p.m12999a();
        }
    }

    /* renamed from: com.cuvora.carinfo.g.i$2 */
    class C36802 implements C2691b {
        /* renamed from: a */
        final /* synthetic */ C4561i f14898a;

        /* renamed from: a */
        public void mo1202a() {
        }

        /* renamed from: b */
        public void mo1207b(int i, String str, String str2, boolean z) {
        }

        C36802(C4561i c4561i) {
            this.f14898a = c4561i;
        }

        /* renamed from: a */
        public void mo1205a(boolean z, int i, String str, int i2) {
            this.f14898a.f18917r.setVisibility(0);
            this.f14898a.f18914o.setVisibility(0);
            this.f14898a.f18916q = 1;
            C1540d.m5840l("fetch success");
        }

        /* renamed from: a */
        public void mo1204a(String str) {
            this.f14898a.f18917r.setVisibility(8);
            this.f14898a.f18914o.setVisibility(8);
        }

        /* renamed from: b */
        public void mo1206b() {
            this.f14898a.f18917r.setVisibility(8);
            this.f14898a.f18914o.setVisibility(8);
        }

        /* renamed from: c */
        public void mo1208c() {
            this.f14898a.f18917r.setVisibility(8);
            this.f14898a.f18914o.setVisibility(8);
            this.f14898a.f18915p.m12999a();
            C1540d.m5840l("closed");
        }

        /* renamed from: a */
        public void mo1203a(int i, String str, String str2, boolean z) {
            this.f14898a.f18917r.setVisibility(8);
            this.f14898a.f18914o.setVisibility(8);
            this.f14898a.f18915p.m12999a();
            C1532a.m5781a((Activity) this.f14898a.n, "Congratulations!", "You have earned Paytm money. Thank you for taking the survey.");
            C1540d.m5840l("upload completed");
        }

        /* renamed from: d */
        public void mo1210d() {
            this.f14898a.f18917r.setVisibility(8);
            this.f14898a.f18914o.setVisibility(8);
            this.f14898a.f18915p.m12999a();
            C1540d.m5840l("upload failed");
            C1532a.m5781a((Activity) this.f14898a.n, "Survey Failed!", "Sorry! Your survey couldn't be uploaded, Please try again later.");
        }

        /* renamed from: c */
        public void mo1209c(int i, String str, String str2, boolean z) {
            this.f14898a.f18917r.setVisibility(8);
            this.f14898a.f18914o.setVisibility(8);
            this.f14898a.f18915p.m12999a();
            C1540d.m5840l("disqualified");
            C1532a.m5781a((Activity) this.f14898a.n, "Disqualified!", "You didn't qualify to this survey. You may take other surveys in the future to earn money.");
        }
    }

    public C4561i(ViewGroup viewGroup) {
        super(viewGroup, (int) R.layout.view_unomer);
    }

    /* renamed from: a */
    public void m25131a(Section section) {
        if (section.getElements() != null && !section.getElements().isEmpty()) {
            Element element = (Element) section.getElements().get(0);
            if (!(element == null || element.getContent().getImageUrl() == null)) {
                LayoutParams layoutParams = this.f18914o.getLayoutParams();
                layoutParams.width = C1570t.m6029n(this.a.getContext())[0];
                double d = (double) layoutParams.width;
                double doubleValue = section.getAspectRatio() != null ? section.getAspectRatio().doubleValue() : 2.5d;
                Double.isNaN(d);
                layoutParams.height = (int) (d / doubleValue);
                this.f18914o.setLayoutParams(layoutParams);
                this.f18914o.setImageUrl(element.getContent().getImageUrl());
            }
            if (this.f18916q == null) {
                this.f18917r.setVisibility(8);
                this.f18914o.setVisibility(8);
            }
            this.a.setOnClickListener(new C15281(this));
        }
    }
}
