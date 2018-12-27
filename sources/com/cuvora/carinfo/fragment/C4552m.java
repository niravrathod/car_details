package com.cuvora.carinfo.fragment;

import android.os.Bundle;
import android.support.v4.app.C0363u.C0362a;
import android.support.v4.app.Fragment;
import android.support.v4.content.C0392c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.helpers.C1533a;
import com.cuvora.carinfo.helpers.C1547j;
import com.cuvora.carinfo.helpers.C1551m;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.loaders.C4573q;
import com.cuvora.carinfo.models.homepage.City;
import com.cuvora.carinfo.models.homepage.State;
import com.cuvora.carinfo.models.homepage.StateCityData;
import com.google.android.gms.ads.AdView;
import java.util.List;
import java.util.Map;

/* renamed from: com.cuvora.carinfo.fragment.m */
public class C4552m extends Fragment {
    /* renamed from: a */
    public static final String f18877a = "m";
    /* renamed from: b */
    public static final String f18878b = C4552m.class.getCanonicalName();
    /* renamed from: c */
    private ExpandableListView f18879c;
    /* renamed from: d */
    private AdView f18880d;
    /* renamed from: e */
    private List<State> f18881e;
    /* renamed from: f */
    private Map<String, List<City>> f18882f;
    /* renamed from: g */
    private C1518b f18883g;
    /* renamed from: h */
    private C0362a<StateCityData> f18884h = new C36783(this);

    /* renamed from: com.cuvora.carinfo.fragment.m$1 */
    class C15151 implements OnGroupClickListener {
        /* renamed from: a */
        int f4504a = null;
        /* renamed from: b */
        final /* synthetic */ C4552m f4505b;

        C15151(C4552m c4552m) {
            this.f4505b = c4552m;
        }

        public boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
            expandableListView = Boolean.valueOf(this.f4505b.f18879c.isGroupExpanded(i) ^ 1);
            this.f4505b.f18879c.collapseGroup(this.f4504a);
            if (expandableListView.booleanValue() != null) {
                this.f4505b.f18879c.expandGroup(i);
                this.f4505b.f18879c.setSelectionFromTop(i, 0);
            }
            this.f4504a = i;
            return true;
        }
    }

    /* renamed from: com.cuvora.carinfo.fragment.m$2 */
    class C15162 implements OnChildClickListener {
        /* renamed from: a */
        final /* synthetic */ C4552m f4506a;

        C15162(C4552m c4552m) {
            this.f4506a = c4552m;
        }

        public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
            if (C1547j.m5914d(this.f4506a.getActivity()) == null) {
                C1570t.m5978a(this.f4506a.getActivity());
                return null;
            }
            if (this.f4506a.f18883g != null) {
                this.f4506a.f18883g.mo5025a((City) ((List) this.f4506a.f18882f.get(((State) this.f4506a.f18881e.get(i)).getId())).get(i2));
            }
            this.f4506a.m25075b();
            return true;
        }
    }

    /* renamed from: com.cuvora.carinfo.fragment.m$a */
    private class C1517a extends BaseExpandableListAdapter {
        /* renamed from: a */
        final /* synthetic */ C4552m f4507a;
        /* renamed from: b */
        private List<State> f4508b;
        /* renamed from: c */
        private Map<String, List<City>> f4509c;

        public long getChildId(int i, int i2) {
            return (long) i2;
        }

        public long getGroupId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return false;
        }

        public boolean isChildSelectable(int i, int i2) {
            return true;
        }

        public C1517a(C4552m c4552m, StateCityData stateCityData) {
            this.f4507a = c4552m;
            this.f4508b = stateCityData.getStates();
            this.f4509c = stateCityData.getCities();
        }

        public int getGroupCount() {
            return this.f4508b.size();
        }

        public int getChildrenCount(int i) {
            return ((List) this.f4509c.get(((State) this.f4508b.get(i)).getId())).size();
        }

        public Object getGroup(int i) {
            return this.f4508b.get(i);
        }

        public Object getChild(int i, int i2) {
            return ((List) this.f4509c.get(((State) this.f4508b.get(i)).getId())).get(i2);
        }

        public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_state, viewGroup, false);
            }
            ImageView imageView = (ImageView) view.findViewById(R.id.iv_arrow);
            ((TextView) view.findViewById(R.id.tv_state_name)).setText(((State) this.f4508b.get(i)).getName());
            if (z) {
                imageView.setImageResource(R.drawable.ic_arrow_up);
            } else {
                imageView.setImageResource(R.drawable.ic_arrow_down);
            }
            return view;
        }

        public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_city, viewGroup, false);
            }
            ((TextView) view.findViewById(true)).setText(((City) ((List) this.f4509c.get(((State) this.f4508b.get(i)).getId())).get(i2)).getName());
            return view;
        }
    }

    /* renamed from: com.cuvora.carinfo.fragment.m$b */
    public interface C1518b {
        /* renamed from: a */
        void mo5025a(City city);
    }

    /* renamed from: com.cuvora.carinfo.fragment.m$3 */
    class C36783 implements C0362a<StateCityData> {
        /* renamed from: a */
        final /* synthetic */ C4552m f14895a;

        /* renamed from: a */
        public void mo1159a(C0392c<StateCityData> c0392c) {
        }

        C36783(C4552m c4552m) {
            this.f14895a = c4552m;
        }

        /* renamed from: a */
        public C0392c<StateCityData> mo1158a(int i, Bundle bundle) {
            return new C4573q(this.f14895a.getContext());
        }

        /* renamed from: a */
        public void m18489a(C0392c<StateCityData> c0392c, StateCityData stateCityData) {
            C1551m.m5926b(this.f14895a.getActivity());
            if (stateCityData != null) {
                this.f14895a.m25073a(stateCityData);
            }
        }
    }

    /* renamed from: a */
    public static C4552m m25070a() {
        return new C4552m();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_select_state_city, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m25071a(view);
        StateCityData m = C1570t.m6028m(getActivity());
        if (m != null) {
            m25073a(m);
        } else {
            C1551m.m5924a(getActivity());
            getLoaderManager().mo264a(100, null, this.f18884h).m1455m();
        }
        this.f18879c.setOnGroupClickListener(new C15151(this));
        this.f18879c.setOnChildClickListener(new C15162(this));
    }

    /* renamed from: a */
    private void m25071a(View view) {
        this.f18879c = (ExpandableListView) view.findViewById(R.id.lv_states);
        this.f18880d = (AdView) view.findViewById(R.id.adView);
        C1533a.m5787a(this.f18880d, getActivity());
    }

    /* renamed from: b */
    private void m25075b() {
        if (getFragmentManager() != null) {
            getFragmentManager().mo301c();
        }
    }

    /* renamed from: a */
    private void m25073a(StateCityData stateCityData) {
        this.f18881e = stateCityData.getStates();
        this.f18882f = stateCityData.getCities();
        this.f18879c.setAdapter(new C1517a(this, stateCityData));
    }

    /* renamed from: a */
    public void m25079a(C1518b c1518b) {
        this.f18883g = c1518b;
    }

    public void onDestroy() {
        this.f18880d.destroy();
        super.onDestroy();
    }
}
