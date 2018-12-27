package com.cuvora.carinfo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.support.v4.app.C0363u.C0362a;
import android.support.v4.content.C0392c;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.cuvora.carinfo.helpers.C1533a;
import com.cuvora.carinfo.helpers.C1540d;
import com.cuvora.carinfo.helpers.C1541e;
import com.cuvora.carinfo.helpers.C1547j;
import com.cuvora.carinfo.helpers.C1557o;
import com.cuvora.carinfo.helpers.C1562q;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.loaders.C4571o;
import com.cuvora.carinfo.loaders.C4573q;
import com.cuvora.carinfo.models.VehicleSearchResult;
import com.cuvora.carinfo.models.homepage.State;
import com.cuvora.carinfo.models.homepage.StateCityData;
import com.google.android.gms.ads.AdView;
import java.util.ArrayList;
import java.util.List;

public class ReverseSearchActivity extends AppCompatActivity {
    /* renamed from: n */
    private TextView f21773n;
    /* renamed from: o */
    private ListView f21774o;
    /* renamed from: p */
    private CardView f21775p;
    /* renamed from: q */
    private TextView f21776q;
    /* renamed from: r */
    private C1430a f21777r;
    /* renamed from: s */
    private ProgressBar f21778s;
    /* renamed from: t */
    private AdView f21779t;
    /* renamed from: u */
    private StateCityData f21780u;
    /* renamed from: v */
    private C0362a<StateCityData> f21781v = new C36002(this);
    /* renamed from: w */
    private Handler f21782w = new Handler(new C14293(this));
    /* renamed from: x */
    private C0362a<List<VehicleSearchResult>> f21783x = new C36014(this);

    /* renamed from: com.cuvora.carinfo.ReverseSearchActivity$1 */
    class C14281 implements TextWatcher {
        /* renamed from: a */
        final /* synthetic */ ReverseSearchActivity f4405a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        C14281(ReverseSearchActivity reverseSearchActivity) {
            this.f4405a = reverseSearchActivity;
        }

        public void afterTextChanged(Editable editable) {
            this.f4405a.f21782w.removeMessages(1);
            if (editable == null || editable.toString().length() < C1541e.m5855b("reverseSearchMinLength").intValue()) {
                this.f4405a.f21778s.setVisibility(8);
                this.f4405a.f21776q.setVisibility(8);
                this.f4405a.getLoaderManager().destroyLoader(1);
                this.f4405a.f21775p.setVisibility(8);
                return;
            }
            this.f4405a.m30014l();
        }
    }

    /* renamed from: com.cuvora.carinfo.ReverseSearchActivity$3 */
    class C14293 implements Callback {
        /* renamed from: a */
        final /* synthetic */ ReverseSearchActivity f4406a;

        C14293(ReverseSearchActivity reverseSearchActivity) {
            this.f4406a = reverseSearchActivity;
        }

        public boolean handleMessage(Message message) {
            if (this.f4406a.isFinishing()) {
                return null;
            }
            if (message.what == 1) {
                if (C1547j.m5914d(this.f4406a) == null) {
                    C1570t.m5978a(this.f4406a);
                    return true;
                } else if (!(this.f4406a.f21773n.getText() == null && C1562q.m5946a(this.f4406a.f21773n.getText().toString()) == null)) {
                    message = new Bundle();
                    message.putString("KEY_SEARCH_TEXT", this.f4406a.f21773n.getText().toString().trim());
                    this.f4406a.m28708g().mo264a(1, message, this.f4406a.f21783x).m1455m();
                }
            }
            return true;
        }
    }

    /* renamed from: com.cuvora.carinfo.ReverseSearchActivity$a */
    private class C1430a extends ArrayAdapter<VehicleSearchResult> {
        /* renamed from: a */
        final /* synthetic */ ReverseSearchActivity f4407a;
        /* renamed from: b */
        private List<State> f4408b;

        public boolean isEnabled(int i) {
            return true;
        }

        public C1430a(ReverseSearchActivity reverseSearchActivity, Context context, List<VehicleSearchResult> list) {
            this.f4407a = reverseSearchActivity;
            super(context, 0, list);
            if (reverseSearchActivity.f21780u != null) {
                this.f4408b = reverseSearchActivity.f21780u.getStates();
            }
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = LayoutInflater.from(this.f4407a).inflate(R.layout.row_name_auto_completer, null);
            }
            TextView textView = (TextView) view.findViewById(R.id.tv_name);
            TextView textView2 = (TextView) view.findViewById(R.id.tv_section_header);
            TextView textView3 = (TextView) view.findViewById(R.id.tv_detail_text);
            ImageView imageView = (ImageView) view.findViewById(R.id.iv_seen);
            VehicleSearchResult vehicleSearchResult = (VehicleSearchResult) getItem(i);
            textView.setText(vehicleSearchResult.getDisplayName());
            if (C1557o.m5937b(vehicleSearchResult)) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(4);
            }
            i = vehicleSearchResult.getVehicleNum();
            if (!C1562q.m5947b(i) && i.contains("*")) {
                CharSequence a = m5695a(i.substring(0, i.indexOf("*")));
                TextView textView4 = (TextView) view.findViewById(R.id.tv_state_name);
                if (C1562q.m5947b(a)) {
                    textView4.setText(i.substring(0, 2));
                } else {
                    textView4.setVisibility(0);
                    textView4.setText(a);
                }
            }
            textView.setVisibility(0);
            textView3.setVisibility(8);
            textView2.setVisibility(8);
            return view;
        }

        /* renamed from: a */
        public void m5696a(List<VehicleSearchResult> list) {
            for (VehicleSearchResult add : list) {
                add(add);
            }
            if (this.f4408b == null) {
                this.f4407a.f21780u = C1570t.m6028m(getContext());
                this.f4408b = this.f4407a.f21780u == null ? null : this.f4407a.f21780u.getStates();
            }
            notifyDataSetChanged();
        }

        /* renamed from: a */
        private String m5695a(String str) {
            if (this.f4408b != null) {
                if (!this.f4408b.isEmpty()) {
                    for (State state : this.f4408b) {
                        if (state.getCode().equalsIgnoreCase(str)) {
                            return state.getName();
                        }
                    }
                    return null;
                }
            }
            return null;
        }
    }

    /* renamed from: com.cuvora.carinfo.ReverseSearchActivity$2 */
    class C36002 implements C0362a<StateCityData> {
        /* renamed from: a */
        final /* synthetic */ ReverseSearchActivity f14768a;

        /* renamed from: a */
        public void mo1159a(C0392c<StateCityData> c0392c) {
        }

        C36002(ReverseSearchActivity reverseSearchActivity) {
            this.f14768a = reverseSearchActivity;
        }

        /* renamed from: a */
        public C0392c<StateCityData> mo1158a(int i, Bundle bundle) {
            return new C4573q(this.f14768a);
        }

        /* renamed from: a */
        public void m18209a(C0392c<StateCityData> c0392c, StateCityData stateCityData) {
            if (stateCityData != null) {
                this.f14768a.f21780u = stateCityData;
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.ReverseSearchActivity$4 */
    class C36014 implements C0362a<List<VehicleSearchResult>> {
        /* renamed from: a */
        final /* synthetic */ ReverseSearchActivity f14769a;

        /* renamed from: a */
        public void mo1159a(C0392c<List<VehicleSearchResult>> c0392c) {
        }

        C36014(ReverseSearchActivity reverseSearchActivity) {
            this.f14769a = reverseSearchActivity;
        }

        /* renamed from: a */
        public C0392c<List<VehicleSearchResult>> mo1158a(int i, Bundle bundle) {
            return new C4571o(this.f14769a, bundle.getString("KEY_SEARCH_TEXT"));
        }

        /* renamed from: a */
        public void m18214a(C0392c<List<VehicleSearchResult>> c0392c, List<VehicleSearchResult> list) {
            this.f14769a.f21778s.setVisibility(8);
            if (list != null) {
                this.f14769a.f21777r.clear();
                this.f14769a.f21777r.m5696a((List) list);
                if (this.f14769a.f21777r.isEmpty() != null) {
                    this.f14769a.f21776q.setVisibility(0);
                    this.f14769a.f21775p.setVisibility(8);
                } else {
                    this.f14769a.f21776q.setVisibility(8);
                    this.f14769a.f21775p.setVisibility(0);
                }
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_reverse_search);
        m29816a((Toolbar) findViewById(R.id.toolbar));
        mo4973h().mo538b(true);
        m30015m();
        this.f21777r = new C1430a(this, this, new ArrayList());
        this.f21774o.setAdapter(this.f21777r);
        this.f21774o.setOnItemClickListener(new -$$Lambda$ReverseSearchActivity$NYhjaXHh9ByoV6n4qBjReUa9nJM());
        this.f21773n.addTextChangedListener(new C14281(this));
        this.f21773n.setOnEditorActionListener(new -$$Lambda$ReverseSearchActivity$cZr7-OTJvRTYJWuP-bPfWVC7iHU());
        this.f21780u = C1570t.m6028m(this);
        if (this.f21780u == null) {
            m28708g().mo264a(2, null, this.f21781v).m1455m();
        }
        C1570t.m5979a((Activity) this, this.f21773n);
    }

    /* renamed from: a */
    private /* synthetic */ void m30003a(AdapterView adapterView, View view, int i, long j) {
        VehicleSearchResult vehicleSearchResult = (VehicleSearchResult) this.f21777r.getItem(i);
        C1557o.m5936a(vehicleSearchResult);
        C1570t.m6005c((Activity) this);
        m30004a(vehicleSearchResult);
        C1540d.m5844p();
    }

    /* renamed from: a */
    private /* synthetic */ boolean m30005a(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return null;
        }
        C1570t.m6005c((Activity) this);
        m30014l();
        return true;
    }

    /* renamed from: l */
    private void m30014l() {
        this.f21782w.removeMessages(1);
        this.f21778s.setVisibility(0);
        this.f21776q.setVisibility(8);
        this.f21782w.sendEmptyMessageDelayed(1, 600);
    }

    /* renamed from: a */
    private void m30004a(VehicleSearchResult vehicleSearchResult) {
        Intent intent = new Intent(this, VehicleInfoActivity.class);
        intent.putExtra("KEY_VEHICLE_INFO", vehicleSearchResult);
        startActivity(intent);
    }

    /* renamed from: m */
    private void m30015m() {
        this.f21773n = (TextView) findViewById(R.id.cet_search_text);
        this.f21776q = (TextView) findViewById(R.id.tv_no_results_found);
        this.f21774o = (ListView) findViewById(R.id.lv_auto_completer);
        this.f21778s = (ProgressBar) findViewById(R.id.progress_bar);
        this.f21775p = (CardView) findViewById(R.id.cv_list_container);
        this.f21779t = (AdView) findViewById(R.id.adView);
        C1533a.m5787a(this.f21779t, (Context) this);
    }

    public void onDestroy() {
        this.f21779t.destroy();
        super.onDestroy();
    }

    protected void onResume() {
        super.onResume();
        if (this.f21777r != null) {
            this.f21777r.notifyDataSetChanged();
        }
    }

    public void onStop() {
        super.onStop();
        this.f21782w.removeMessages(1);
    }
}
