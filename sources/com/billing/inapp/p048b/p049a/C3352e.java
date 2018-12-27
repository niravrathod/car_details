package com.billing.inapp.p048b.p049a;

import android.support.v7.widget.RecyclerView.C0798v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.billing.inapp.C1118b.C1106b;

/* renamed from: com.billing.inapp.b.a.e */
public final class C3352e extends C0798v {
    /* renamed from: n */
    public TextView f14200n;
    /* renamed from: o */
    public TextView f14201o;
    /* renamed from: p */
    public TextView f14202p;
    /* renamed from: q */
    public Button f14203q;
    /* renamed from: r */
    public ImageView f14204r;

    /* renamed from: com.billing.inapp.b.a.e$a */
    public interface C1114a {
        /* renamed from: a */
        void mo929a(int i);
    }

    public C3352e(View view, final C1114a c1114a) {
        super(view);
        this.f14200n = (TextView) view.findViewById(C1106b.title);
        this.f14202p = (TextView) view.findViewById(C1106b.price);
        this.f14201o = (TextView) view.findViewById(C1106b.description);
        this.f14204r = (ImageView) view.findViewById(C1106b.sku_icon);
        this.f14203q = (Button) view.findViewById(C1106b.state_button);
        if (this.f14203q != null) {
            this.f14203q.setOnClickListener(new OnClickListener(this) {
                /* renamed from: b */
                final /* synthetic */ C3352e f3622b;

                public void onClick(View view) {
                    c1114a.mo929a(this.f3622b.m3286e());
                }
            });
        }
    }
}
