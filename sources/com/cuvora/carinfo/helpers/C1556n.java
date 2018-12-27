package com.cuvora.carinfo.helpers;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0784j;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import com.cuvora.carinfo.R;

/* renamed from: com.cuvora.carinfo.helpers.n */
public class C1556n {
    /* renamed from: a */
    private final RecyclerView f4691a;
    /* renamed from: b */
    private C1554a f4692b;
    /* renamed from: c */
    private C1555b f4693c;
    /* renamed from: d */
    private OnClickListener f4694d = new C15521(this);
    /* renamed from: e */
    private OnLongClickListener f4695e = new C15532(this);
    /* renamed from: f */
    private C0784j f4696f = new C36973(this);

    /* renamed from: com.cuvora.carinfo.helpers.n$1 */
    class C15521 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1556n f4689a;

        C15521(C1556n c1556n) {
            this.f4689a = c1556n;
        }

        public void onClick(View view) {
            if (this.f4689a.f4692b != null) {
                int e = this.f4689a.f4691a.m24651b(view).m3286e();
                if (e != -1) {
                    this.f4689a.f4692b.mo1201a(this.f4689a.f4691a, e, view);
                }
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.helpers.n$2 */
    class C15532 implements OnLongClickListener {
        /* renamed from: a */
        final /* synthetic */ C1556n f4690a;

        C15532(C1556n c1556n) {
            this.f4690a = c1556n;
        }

        public boolean onLongClick(View view) {
            if (this.f4690a.f4693c == null) {
                return false;
            }
            int e = this.f4690a.f4691a.m24651b(view).m3286e();
            if (e == -1) {
                return false;
            }
            return this.f4690a.f4693c.m5928a(this.f4690a.f4691a, e, view);
        }
    }

    /* renamed from: com.cuvora.carinfo.helpers.n$a */
    public interface C1554a {
        /* renamed from: a */
        void mo1201a(RecyclerView recyclerView, int i, View view);
    }

    /* renamed from: com.cuvora.carinfo.helpers.n$b */
    public interface C1555b {
        /* renamed from: a */
        boolean m5928a(RecyclerView recyclerView, int i, View view);
    }

    /* renamed from: com.cuvora.carinfo.helpers.n$3 */
    class C36973 implements C0784j {
        /* renamed from: a */
        final /* synthetic */ C1556n f14921a;

        /* renamed from: b */
        public void mo1225b(View view) {
        }

        C36973(C1556n c1556n) {
            this.f14921a = c1556n;
        }

        /* renamed from: a */
        public void mo1224a(View view) {
            if (this.f14921a.f4692b != null) {
                view.setOnClickListener(this.f14921a.f4694d);
            }
            if (this.f14921a.f4693c != null) {
                view.setOnLongClickListener(this.f14921a.f4695e);
            }
        }
    }

    private C1556n(RecyclerView recyclerView) {
        this.f4691a = recyclerView;
        this.f4691a.setTag(R.id.item_click_support, this);
        this.f4691a.m24637a(this.f4696f);
    }

    /* renamed from: a */
    public static C1556n m5930a(RecyclerView recyclerView) {
        C1556n c1556n = (C1556n) recyclerView.getTag(R.id.item_click_support);
        return c1556n == null ? new C1556n(recyclerView) : c1556n;
    }

    /* renamed from: a */
    public C1556n m5935a(C1554a c1554a) {
        this.f4692b = c1554a;
        return this;
    }
}
