package com.cuvora.carinfo.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
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
import com.cuvora.carinfo.p069a.C3643q;
import com.cuvora.carinfo.p069a.C3647t;
import com.cuvora.carinfo.p069a.C3649u;
import com.cuvora.carinfo.p076h.C1530a;
import java.util.List;

@SuppressLint({"ViewConstructor"})
public class HorizontalScrollCustomView extends HomePageBaseCustomView {
    /* renamed from: a */
    private Context f15001a;
    /* renamed from: b */
    private TextView f15002b;
    /* renamed from: c */
    private AppCompatImageView f15003c;
    /* renamed from: d */
    private Button f15004d;
    /* renamed from: e */
    private RecyclerView f15005e;
    /* renamed from: f */
    private List<Element> f15006f;
    /* renamed from: g */
    private Section f15007g;
    /* renamed from: h */
    private C1530a<Section, Element> f15008h;

    public HorizontalScrollCustomView(Context context, final Section section, final C1530a<Section, Element> c1530a) {
        super(context);
        this.f15001a = context;
        this.f15008h = c1530a;
        this.f15007g = section;
        this.f15006f = section.getElements();
        m18650a(inflate(context, R.layout.layout_horizontal_scroll_container, this));
        if (section.isHeader() != null) {
            this.f15002b.setVisibility(0);
            this.f15002b.setText(section.getTitle());
            if (C1562q.m5947b(section.getHeaderIconUrl()) == null) {
                this.f15003c.setVisibility(0);
                this.f15003c.setImageURI(Uri.parse(section.getHeaderIconUrl()));
            }
        }
        if (section.isViewAllEnabled() != null) {
            this.f15004d.setVisibility(0);
        }
        m18651b();
        C1556n.m5930a(this.f15005e).m5935a(new C1554a(this) {
            /* renamed from: b */
            final /* synthetic */ HorizontalScrollCustomView f15000b;

            /* renamed from: a */
            public void mo1201a(RecyclerView recyclerView, int i, View view) {
                if (c1530a != null) {
                    c1530a.mo1189a(this.f15000b.f15006f.get(i));
                }
            }
        });
        this.f15004d.setOnClickListener(new OnClickListener(this) {
            /* renamed from: c */
            final /* synthetic */ HorizontalScrollCustomView f4997c;

            public void onClick(View view) {
                if (c1530a != null) {
                    c1530a.mo1190b(section);
                }
            }
        });
    }

    /* renamed from: b */
    private void m18651b() {
        this.f15005e.setHasFixedSize(true);
        this.f15005e.setNestedScrollingEnabled(false);
        this.f15005e.setLayoutManager(new LinearLayoutManager(this.f15001a, 0, false));
        switch (this.f15007g.getType()) {
            case NEWS:
                this.f15005e.setAdapter(new C3641p(this.f15001a, this.f15006f));
                return;
            case FEATURE_RAIL:
                this.f15005e.setAdapter(new C3637m(this.f15006f));
                return;
            case RECENT_SEARCH:
                this.f15005e.setAdapter(new C3643q(this.f15006f));
                return;
            case VIDEOS:
                this.f15005e.setAdapter(new C3649u(this.f15001a, this.f15006f));
                return;
            case TRENDING:
                this.f15005e.setAdapter(new C3647t(this.f15001a, this.f15006f));
                return;
            case BANNER:
                this.f15005e.setAdapter(new C3616a(this.f15001a, this.f15007g));
                return;
            case CROSS_SELL:
                this.f15005e.setAdapter(new C3635l(this.f15001a, this.f15007g));
                return;
            case CARS_RAIL:
                this.f15005e.setAdapter(new C3623f(this.f15001a, this.f15007g));
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private void m18650a(View view) {
        this.f15002b = (TextView) view.findViewById(R.id.tv_heading);
        this.f15004d = (Button) view.findViewById(R.id.btn_view_all);
        this.f15005e = (RecyclerView) view.findViewById(R.id.rv_data);
        this.f15003c = (AppCompatImageView) view.findViewById(R.id.iv_header_icon);
    }

    public Section getSection() {
        return this.f15007g;
    }
}
