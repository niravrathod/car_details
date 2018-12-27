package com.cuvora.carinfo.p075g;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.helpers.C1556n;
import com.cuvora.carinfo.helpers.C1556n.C1554a;
import com.cuvora.carinfo.helpers.C1562q;
import com.cuvora.carinfo.models.homepage.Element;
import com.cuvora.carinfo.models.homepage.Section;
import com.cuvora.carinfo.p069a.C3616a;
import com.cuvora.carinfo.p069a.C3623f;
import com.cuvora.carinfo.p069a.C3635l;
import com.cuvora.carinfo.p069a.C3637m;
import com.cuvora.carinfo.p069a.C3641p;
import com.cuvora.carinfo.p069a.C3647t;
import com.cuvora.carinfo.p069a.C3649u;
import com.cuvora.carinfo.p071d.C3666b;
import com.cuvora.carinfo.p076h.C1530a;
import java.util.List;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.cuvora.carinfo.g.g */
public class C4559g extends C3666b {
    /* renamed from: o */
    private Context f18906o;
    /* renamed from: p */
    private TextView f18907p;
    /* renamed from: q */
    private AppCompatImageView f18908q;
    /* renamed from: r */
    private Button f18909r;
    /* renamed from: s */
    private RecyclerView f18910s;
    /* renamed from: t */
    private List<Element> f18911t;
    /* renamed from: u */
    private Section f18912u;
    /* renamed from: v */
    private C1530a<Section, Element> f18913v;

    public C4559g(ViewGroup viewGroup) {
        super(viewGroup, (int) R.layout.layout_horizontal_scroll_container);
        m25112a(this.a);
    }

    /* renamed from: a */
    public void m25114a(Context context, final Section section, final C1530a<Section, Element> c1530a) {
        this.f18906o = context;
        this.f18913v = c1530a;
        this.f18912u = section;
        this.f18911t = section.getElements();
        if (section.isHeader() != null) {
            this.f18907p.setVisibility(0);
            this.f18907p.setText(section.getTitle());
            if (C1562q.m5947b(section.getHeaderIconUrl()) == null) {
                this.f18908q.setVisibility(0);
                this.f18908q.setImageURI(Uri.parse(section.getHeaderIconUrl()));
            }
        }
        if (section.isViewAllEnabled() != null) {
            this.f18909r.setVisibility(0);
        }
        m25113y();
        C1556n.m5930a(this.f18910s).m5935a(new C1554a(this) {
            /* renamed from: b */
            final /* synthetic */ C4559g f14897b;

            /* renamed from: a */
            public void mo1201a(RecyclerView recyclerView, int i, View view) {
                if (c1530a != null) {
                    c1530a.mo1189a(this.f14897b.f18911t.get(i));
                }
            }
        });
        this.f18909r.setOnClickListener(new OnClickListener(this) {
            /* renamed from: c */
            final /* synthetic */ C4559g f4519c;

            public void onClick(View view) {
                if (c1530a != null) {
                    c1530a.mo1190b(section);
                }
            }
        });
    }

    /* renamed from: y */
    private void m25113y() {
        this.f18910s.setHasFixedSize(true);
        this.f18910s.setNestedScrollingEnabled(false);
        this.f18910s.setLayoutManager(new LinearLayoutManager(this.f18906o, 0, false));
        switch (this.f18912u.getType()) {
            case NEWS:
                this.f18910s.setAdapter(new C3641p(this.f18906o, this.f18911t));
                return;
            case FEATURE_RAIL:
                this.f18910s.setAdapter(new C3637m(this.f18911t));
                return;
            case VIDEOS:
                this.f18910s.setAdapter(new C3649u(this.f18906o, this.f18911t));
                return;
            case TRENDING:
                this.f18910s.setAdapter(new C3647t(this.f18906o, this.f18911t));
                return;
            case BANNER:
                this.f18910s.setAdapter(new C3616a(this.f18906o, this.f18912u));
                return;
            case CROSS_SELL:
                this.f18910s.setAdapter(new C3635l(this.f18906o, this.f18912u));
                return;
            case CARS_RAIL:
                this.f18910s.setAdapter(new C3623f(this.f18906o, this.f18912u));
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private void m25112a(View view) {
        this.f18907p = (TextView) view.findViewById(R.id.tv_heading);
        this.f18909r = (Button) view.findViewById(R.id.btn_view_all);
        this.f18910s = (RecyclerView) view.findViewById(R.id.rv_data);
        this.f18908q = (AppCompatImageView) view.findViewById(R.id.iv_header_icon);
    }
}
