package com.cuvora.carinfo.p075g;

import android.support.v7.widget.RecyclerView.C0798v;
import android.view.ViewGroup;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.helpers.C1541e;
import com.cuvora.carinfo.models.homepage.Element;
import com.cuvora.carinfo.models.homepage.Section;
import com.cuvora.carinfo.models.homepage.SectionTypeEnum;
import com.cuvora.carinfo.p071d.C1474d;
import com.cuvora.carinfo.p071d.C3665a;
import com.cuvora.carinfo.p071d.C3666b;
import com.cuvora.carinfo.p076h.C1530a;
import com.cuvora.carinfo.views.C1686a;

/* renamed from: com.cuvora.carinfo.g.h */
public class C4560h extends C3665a<Section, C1524f, C3666b> implements C1530a<Section, Element> {
    /* renamed from: b */
    public /* synthetic */ C0798v mo96b(ViewGroup viewGroup, int i) {
        return m25115a(viewGroup, i);
    }

    /* renamed from: b */
    public /* synthetic */ void mo1190b(Object obj) {
        m25119a((Section) obj);
    }

    public C4560h(C1474d<Section> c1474d, C1524f c1524f) {
        super(c1474d, c1524f);
    }

    /* renamed from: a */
    public C3666b m25115a(ViewGroup viewGroup, int i) {
        switch (SectionTypeEnum.getSectionTypeFromItemType(i)) {
            case GRID:
                return new C4558e(viewGroup);
            case NEWS:
                return new C4559g(viewGroup);
            case TRENDING:
                return new C4559g(viewGroup);
            case VIDEOS:
                return new C4559g(viewGroup);
            case FUEL_PRICES:
                return new C4557d(viewGroup);
            case BANNER:
                return new C4559g(viewGroup);
            case BANNER_AD:
                return new C4554a(viewGroup);
            case CROSS_SELL:
                return new C4559g(viewGroup);
            case RATING_POPUP:
                return new C4555b(this, viewGroup, C1686a.m6364a(viewGroup.getContext(), Integer.valueOf(viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.dp8)))) {
                    /* renamed from: o */
                    final /* synthetic */ C4560h f21052o;
                };
            case CARS_RAIL:
                return new C4559g(viewGroup);
            case UNOMER:
                if (C1541e.m5856c("unomer") != 0) {
                    return new C4561i(viewGroup);
                }
                return new C4556c(viewGroup);
            default:
                return new C4556c(viewGroup);
        }
    }

    /* renamed from: a */
    public void m25117a(C3666b c3666b, int i) {
        if ((c3666b instanceof C4558e) != 0) {
            ((C4558e) c3666b).m25110a((Section) this.a.mo4633e(c3666b.m3286e()), this);
        } else if ((c3666b instanceof C4559g) != 0) {
            ((C4559g) c3666b).m25114a(c3666b.a.getContext(), (Section) this.a.mo4633e(c3666b.m3286e()), this);
        } else if ((c3666b instanceof C4557d) != 0) {
            ((C4557d) c3666b).m25108a((Section) this.a.mo4633e(c3666b.m3286e()));
        } else if ((c3666b instanceof C4561i) != 0) {
            if (C1541e.m5856c("unomer") != 0) {
                ((C4561i) c3666b).m25131a((Section) this.a.mo4633e(c3666b.m3286e()));
            }
        } else if ((c3666b instanceof C4554a) != 0) {
            ((C4554a) c3666b).mo1439y();
        }
    }

    /* renamed from: a */
    public void m25119a(Section section) {
        ((C1524f) this.b).mo1200a(section);
    }

    /* renamed from: a */
    public void m25118a(Element element) {
        ((C1524f) this.b).mo1199a(element);
    }
}
