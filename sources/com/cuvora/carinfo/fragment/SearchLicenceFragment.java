package com.cuvora.carinfo.fragment;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.text.InputFilter;
import android.text.InputFilter.AllCaps;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;
import com.cuvora.carinfo.C1459a;
import com.cuvora.carinfo.C1491f.C1487a;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.helpers.C1570t;
import java.util.HashMap;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.C4329j;
import kotlin.jvm.internal.C2885g;
import kotlin.text.C4883n;
import kotlin.text.C4886o;

public final class SearchLicenceFragment extends C4548a implements OnClickListener {
    /* renamed from: a */
    private C1492a f21003a;
    /* renamed from: b */
    private DatePickerDialog f21004b;
    /* renamed from: c */
    private List<String> f21005c = C4329j.m23707a((Object[]) new String[]{"JAN", "FEB", "MAR", "APR", "MAY", "JUNE", "JULY", "AUG", "SEPT", "OCT", "NOV", "DEC"});
    /* renamed from: d */
    private final OnDateSetListener f21006d = new C1493b(this);
    /* renamed from: e */
    private HashMap f21007e;

    /* renamed from: com.cuvora.carinfo.fragment.SearchLicenceFragment$a */
    public interface C1492a {
        /* renamed from: a */
        void mo5027a(String str, String str2);
    }

    /* renamed from: com.cuvora.carinfo.fragment.SearchLicenceFragment$b */
    public static final class C1493b implements OnDateSetListener {
        /* renamed from: a */
        final /* synthetic */ SearchLicenceFragment f4484a;

        C1493b(SearchLicenceFragment searchLicenceFragment) {
            this.f4484a = searchLicenceFragment;
        }

        public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
            int i4 = i2;
            C2885g.m13910b(datePicker, "view");
            ((AppCompatEditText) this.f4484a.mo4624a(C1487a.etDob)).setText("");
            String valueOf = String.valueOf(i4 + 1);
            if (valueOf.length() == 1) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append('0');
                stringBuilder.append(valueOf);
                stringBuilder.toString();
            }
            valueOf = String.valueOf(i3);
            if (valueOf.length() == 1) {
                stringBuilder = new StringBuilder();
                stringBuilder.append('0');
                stringBuilder.append(valueOf);
                valueOf = stringBuilder.toString();
            }
            String str = valueOf;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("");
            stringBuilder2.append(i);
            ((AppCompatEditText) r0.f4484a.mo4624a(C1487a.etDob)).append(C4883n.m30193a(C4883n.m30193a(C4883n.m30193a(C1570t.m6018f().getDobUiFormat(), "yyyy", stringBuilder2.toString(), false, 4, null), "mm", (String) r0.f4484a.m27767b().get(i4), false, 4, null), "dd", str, false, 4, null));
        }
    }

    /* renamed from: a */
    public View mo4624a(int i) {
        if (this.f21007e == null) {
            this.f21007e = new HashMap();
        }
        View view = (View) this.f21007e.get(Integer.valueOf(i));
        if (view == null) {
            view = getView();
            if (view == null) {
                return null;
            }
            view = view.findViewById(i);
            this.f21007e.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo4625a() {
        if (this.f21007e != null) {
            this.f21007e.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo4625a();
    }

    /* renamed from: b */
    public final List<String> m27767b() {
        return this.f21005c;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C2885g.m13910b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_search_licence, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C2885g.m13910b(view, "view");
        super.onViewCreated(view, bundle);
        m27762c();
        Object obj = (EditText) mo4624a(C1487a.etDlNumber);
        C2885g.m13907a(obj, "etDlNumber");
        obj.setFilters((InputFilter[]) new AllCaps[]{new AllCaps()});
        obj = (AppCompatEditText) mo4624a(C1487a.etDob);
        C2885g.m13907a(obj, "etDob");
        obj.setFilters((InputFilter[]) new AllCaps[]{new AllCaps()});
        if ((getActivity() instanceof C1492a) != null) {
            view = getActivity();
            if (view != null) {
                this.f21003a = (C1492a) view;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.cuvora.carinfo.fragment.SearchLicenceFragment.Callbacks");
            }
        }
        m27763d();
    }

    /* renamed from: c */
    private final void m27762c() {
        String a = C1459a.f4442a.m5707a();
        if (a != null) {
            ((EditText) mo4624a(C1487a.etDlNumber)).setText("");
            ((EditText) mo4624a(C1487a.etDlNumber)).append(a);
        }
        a = C1459a.f4442a.m5709b();
        if (a != null) {
            ((AppCompatEditText) mo4624a(C1487a.etDob)).setText("");
            ((AppCompatEditText) mo4624a(C1487a.etDob)).append(a);
        }
    }

    /* renamed from: d */
    private final void m27763d() {
        OnClickListener onClickListener = this;
        ((AppCompatTextView) mo4624a(C1487a.btn)).setOnClickListener(onClickListener);
        ((AppCompatEditText) mo4624a(C1487a.etDob)).setOnClickListener(onClickListener);
        ((EditText) mo4624a(C1487a.etDlNumber)).setOnClickListener(onClickListener);
        ((AppCompatImageView) mo4624a(C1487a.ivInfo)).setOnClickListener(onClickListener);
    }

    public void onClick(android.view.View r18) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r17 = this;
        r0 = r17;
        r1 = "v";
        r2 = r18;
        kotlin.jvm.internal.C2885g.m13910b(r2, r1);
        r1 = r18.getId();
        r2 = 2131230785; // 0x7f080041 float:1.8077633E38 double:1.052967914E-314;
        r3 = 0;
        r4 = 1;
        if (r1 == r2) goto L_0x015e;
    L_0x0014:
        r2 = 2131230889; // 0x7f0800a9 float:1.8077844E38 double:1.0529679656E-314;
        if (r1 == r2) goto L_0x0031;
    L_0x0019:
        r2 = 2131230949; // 0x7f0800e5 float:1.8077965E38 double:1.0529679953E-314;
        if (r1 == r2) goto L_0x0020;
    L_0x001e:
        goto L_0x031e;
    L_0x0020:
        r1 = com.cuvora.carinfo.fragment.C4803g.f21025a;
        r1 = r1.m5737a();
        r2 = r17.getChildFragmentManager();
        r3 = "LicenceHelp";
        r1.show(r2, r3);
        goto L_0x031e;
    L_0x0031:
        r1 = java.util.Calendar.getInstance();
        r1 = r1.get(r4);
        r2 = java.util.Calendar.getInstance();
        r5 = 2;
        r2 = r2.get(r5);
        r5 = java.util.Calendar.getInstance();
        r6 = 5;
        r5 = r5.get(r6);
        r6 = com.cuvora.carinfo.C1491f.C1487a.etDob;	 Catch:{ Exception -> 0x012e }
        r6 = r0.mo4624a(r6);	 Catch:{ Exception -> 0x012e }
        r6 = (android.support.v7.widget.AppCompatEditText) r6;	 Catch:{ Exception -> 0x012e }
        r7 = "etDob";	 Catch:{ Exception -> 0x012e }
        kotlin.jvm.internal.C2885g.m13907a(r6, r7);	 Catch:{ Exception -> 0x012e }
        r6 = r6.getText();	 Catch:{ Exception -> 0x012e }
        r6 = r6.toString();	 Catch:{ Exception -> 0x012e }
        if (r6 == 0) goto L_0x0126;	 Catch:{ Exception -> 0x012e }
    L_0x0062:
        r6 = (java.lang.CharSequence) r6;	 Catch:{ Exception -> 0x012e }
        r6 = kotlin.text.C4886o.m30224a(r6);	 Catch:{ Exception -> 0x012e }
        r6 = r6.toString();	 Catch:{ Exception -> 0x012e }
        r6 = (java.lang.CharSequence) r6;	 Catch:{ Exception -> 0x012e }
        r6 = r6.length();	 Catch:{ Exception -> 0x012e }
        if (r6 <= 0) goto L_0x0076;	 Catch:{ Exception -> 0x012e }
    L_0x0074:
        r6 = 1;	 Catch:{ Exception -> 0x012e }
        goto L_0x0077;	 Catch:{ Exception -> 0x012e }
    L_0x0076:
        r6 = 0;	 Catch:{ Exception -> 0x012e }
    L_0x0077:
        if (r6 == 0) goto L_0x012e;	 Catch:{ Exception -> 0x012e }
    L_0x0079:
        r6 = com.cuvora.carinfo.C1491f.C1487a.etDob;	 Catch:{ Exception -> 0x012e }
        r6 = r0.mo4624a(r6);	 Catch:{ Exception -> 0x012e }
        r6 = (android.support.v7.widget.AppCompatEditText) r6;	 Catch:{ Exception -> 0x012e }
        r7 = "etDob";	 Catch:{ Exception -> 0x012e }
        kotlin.jvm.internal.C2885g.m13907a(r6, r7);	 Catch:{ Exception -> 0x012e }
        r6 = r6.getText();	 Catch:{ Exception -> 0x012e }
        r6 = r6.toString();	 Catch:{ Exception -> 0x012e }
        if (r6 == 0) goto L_0x011e;	 Catch:{ Exception -> 0x012e }
    L_0x0090:
        r6 = (java.lang.CharSequence) r6;	 Catch:{ Exception -> 0x012e }
        r6 = kotlin.text.C4886o.m30224a(r6);	 Catch:{ Exception -> 0x012e }
        r6 = r6.toString();	 Catch:{ Exception -> 0x012e }
        r7 = r6;	 Catch:{ Exception -> 0x012e }
        r7 = (java.lang.CharSequence) r7;	 Catch:{ Exception -> 0x012e }
        r8 = new java.lang.String[r4];	 Catch:{ Exception -> 0x012e }
        r6 = com.cuvora.carinfo.helpers.C1570t.m6018f();	 Catch:{ Exception -> 0x012e }
        r6 = r6.getDobUiSep();	 Catch:{ Exception -> 0x012e }
        r8[r3] = r6;	 Catch:{ Exception -> 0x012e }
        r9 = 0;	 Catch:{ Exception -> 0x012e }
        r10 = 0;	 Catch:{ Exception -> 0x012e }
        r11 = 6;	 Catch:{ Exception -> 0x012e }
        r12 = 0;	 Catch:{ Exception -> 0x012e }
        r6 = kotlin.text.C4886o.m30239b(r7, r8, r9, r10, r11, r12);	 Catch:{ Exception -> 0x012e }
        r7 = com.cuvora.carinfo.helpers.C1570t.m6018f();	 Catch:{ Exception -> 0x012e }
        r7 = r7.getDobUiFormat();	 Catch:{ Exception -> 0x012e }
        r8 = r7;	 Catch:{ Exception -> 0x012e }
        r8 = (java.lang.CharSequence) r8;	 Catch:{ Exception -> 0x012e }
        r9 = new java.lang.String[r4];	 Catch:{ Exception -> 0x012e }
        r7 = com.cuvora.carinfo.helpers.C1570t.m6018f();	 Catch:{ Exception -> 0x012e }
        r7 = r7.getDobUiSep();	 Catch:{ Exception -> 0x012e }
        r9[r3] = r7;	 Catch:{ Exception -> 0x012e }
        r10 = 0;	 Catch:{ Exception -> 0x012e }
        r11 = 0;	 Catch:{ Exception -> 0x012e }
        r12 = 6;	 Catch:{ Exception -> 0x012e }
        r13 = 0;	 Catch:{ Exception -> 0x012e }
        r7 = kotlin.text.C4886o.m30239b(r8, r9, r10, r11, r12, r13);	 Catch:{ Exception -> 0x012e }
        r7 = (java.lang.Iterable) r7;	 Catch:{ Exception -> 0x012e }
        r7 = r7.iterator();	 Catch:{ Exception -> 0x012e }
    L_0x00d6:
        r8 = r7.hasNext();	 Catch:{ Exception -> 0x012e }
        if (r8 == 0) goto L_0x012e;	 Catch:{ Exception -> 0x012e }
    L_0x00dc:
        r8 = r7.next();	 Catch:{ Exception -> 0x012e }
        r8 = (java.lang.String) r8;	 Catch:{ Exception -> 0x012e }
        r9 = "yyyy";	 Catch:{ Exception -> 0x012e }
        r9 = kotlin.text.C4883n.m30195a(r8, r9, r4);	 Catch:{ Exception -> 0x012e }
        if (r9 == 0) goto L_0x00f5;	 Catch:{ Exception -> 0x012e }
    L_0x00ea:
        r9 = r6.get(r3);	 Catch:{ Exception -> 0x012e }
        r9 = (java.lang.String) r9;	 Catch:{ Exception -> 0x012e }
        r9 = java.lang.Integer.parseInt(r9);	 Catch:{ Exception -> 0x012e }
        r1 = r9;	 Catch:{ Exception -> 0x012e }
    L_0x00f5:
        r9 = "mm";	 Catch:{ Exception -> 0x012e }
        r9 = kotlin.text.C4883n.m30195a(r8, r9, r4);	 Catch:{ Exception -> 0x012e }
        if (r9 == 0) goto L_0x0108;	 Catch:{ Exception -> 0x012e }
    L_0x00fd:
        r9 = r0.f21005c;	 Catch:{ Exception -> 0x012e }
        r10 = r6.get(r3);	 Catch:{ Exception -> 0x012e }
        r9 = r9.indexOf(r10);	 Catch:{ Exception -> 0x012e }
        r2 = r9;	 Catch:{ Exception -> 0x012e }
    L_0x0108:
        r9 = "dd";	 Catch:{ Exception -> 0x012e }
        r8 = kotlin.text.C4883n.m30195a(r8, r9, r4);	 Catch:{ Exception -> 0x012e }
        if (r8 == 0) goto L_0x011b;	 Catch:{ Exception -> 0x012e }
    L_0x0110:
        r8 = r6.get(r3);	 Catch:{ Exception -> 0x012e }
        r8 = (java.lang.String) r8;	 Catch:{ Exception -> 0x012e }
        r8 = java.lang.Integer.parseInt(r8);	 Catch:{ Exception -> 0x012e }
        r5 = r8;	 Catch:{ Exception -> 0x012e }
    L_0x011b:
        r3 = r3 + 1;	 Catch:{ Exception -> 0x012e }
        goto L_0x00d6;	 Catch:{ Exception -> 0x012e }
    L_0x011e:
        r3 = new kotlin.TypeCastException;	 Catch:{ Exception -> 0x012e }
        r4 = "null cannot be cast to non-null type kotlin.CharSequence";	 Catch:{ Exception -> 0x012e }
        r3.<init>(r4);	 Catch:{ Exception -> 0x012e }
        throw r3;	 Catch:{ Exception -> 0x012e }
    L_0x0126:
        r3 = new kotlin.TypeCastException;	 Catch:{ Exception -> 0x012e }
        r4 = "null cannot be cast to non-null type kotlin.CharSequence";	 Catch:{ Exception -> 0x012e }
        r3.<init>(r4);	 Catch:{ Exception -> 0x012e }
        throw r3;	 Catch:{ Exception -> 0x012e }
    L_0x012e:
        r9 = r1;
        r10 = r2;
        r11 = r5;
        r1 = new android.app.DatePickerDialog;
        r7 = r17.getContext();
        r8 = r0.f21006d;
        r6 = r1;
        r6.<init>(r7, r8, r9, r10, r11);
        r0.f21004b = r1;
        r1 = r0.f21004b;
        if (r1 == 0) goto L_0x0155;
    L_0x0143:
        r1 = r1.getDatePicker();
        if (r1 == 0) goto L_0x0155;
    L_0x0149:
        r2 = java.lang.System.currentTimeMillis();
        r4 = com.cuvora.carinfo.helpers.C1570t.m6020g();
        r2 = r2 - r4;
        r1.setMaxDate(r2);
    L_0x0155:
        r1 = r0.f21004b;
        if (r1 == 0) goto L_0x031e;
    L_0x0159:
        r1.show();
        goto L_0x031e;
    L_0x015e:
        r1 = r17.m27764e();
        if (r1 == 0) goto L_0x031e;
    L_0x0164:
        r1 = r17.getContext();	 Catch:{ Exception -> 0x0193 }
        r2 = 0;	 Catch:{ Exception -> 0x0193 }
        if (r1 == 0) goto L_0x0172;	 Catch:{ Exception -> 0x0193 }
    L_0x016b:
        r5 = "input_method";	 Catch:{ Exception -> 0x0193 }
        r1 = r1.getSystemService(r5);	 Catch:{ Exception -> 0x0193 }
        goto L_0x0173;	 Catch:{ Exception -> 0x0193 }
    L_0x0172:
        r1 = r2;	 Catch:{ Exception -> 0x0193 }
    L_0x0173:
        if (r1 == 0) goto L_0x018b;	 Catch:{ Exception -> 0x0193 }
    L_0x0175:
        r1 = (android.view.inputmethod.InputMethodManager) r1;	 Catch:{ Exception -> 0x0193 }
        r5 = r17.getActivity();	 Catch:{ Exception -> 0x0193 }
        if (r5 == 0) goto L_0x0187;	 Catch:{ Exception -> 0x0193 }
    L_0x017d:
        r5 = r5.getCurrentFocus();	 Catch:{ Exception -> 0x0193 }
        if (r5 == 0) goto L_0x0187;	 Catch:{ Exception -> 0x0193 }
    L_0x0183:
        r2 = r5.getWindowToken();	 Catch:{ Exception -> 0x0193 }
    L_0x0187:
        r1.hideSoftInputFromWindow(r2, r3);	 Catch:{ Exception -> 0x0193 }
        goto L_0x0193;	 Catch:{ Exception -> 0x0193 }
    L_0x018b:
        r1 = new kotlin.TypeCastException;	 Catch:{ Exception -> 0x0193 }
        r2 = "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager";	 Catch:{ Exception -> 0x0193 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x0193 }
        throw r1;	 Catch:{ Exception -> 0x0193 }
    L_0x0193:
        r1 = com.cuvora.carinfo.C1491f.C1487a.etDob;
        r1 = r0.mo4624a(r1);
        r1 = (android.support.v7.widget.AppCompatEditText) r1;
        r2 = "etDob";
        kotlin.jvm.internal.C2885g.m13907a(r1, r2);
        r1 = r1.getText();
        r1 = r1.toString();
        if (r1 == 0) goto L_0x0316;
    L_0x01aa:
        r1 = (java.lang.CharSequence) r1;
        r1 = kotlin.text.C4886o.m30224a(r1);
        r1 = r1.toString();
        r5 = r1;
        r5 = (java.lang.CharSequence) r5;
        r6 = new java.lang.String[r4];
        r1 = com.cuvora.carinfo.helpers.C1570t.m6018f();
        r1 = r1.getDobUiSep();
        r6[r3] = r1;
        r7 = 0;
        r8 = 0;
        r9 = 6;
        r10 = 0;
        r1 = kotlin.text.C4886o.m30239b(r5, r6, r7, r8, r9, r10);
        r2 = com.cuvora.carinfo.helpers.C1570t.m6018f();
        r2 = r2.getDobUiFormat();
        r5 = r2;
        r5 = (java.lang.CharSequence) r5;
        r6 = new java.lang.String[r4];
        r2 = com.cuvora.carinfo.helpers.C1570t.m6018f();
        r2 = r2.getDobUiSep();
        r6[r3] = r2;
        r2 = kotlin.text.C4886o.m30239b(r5, r6, r7, r8, r9, r10);
        r2 = (java.lang.Iterable) r2;
        r2 = r2.iterator();
        r5 = 0;
        r6 = 0;
        r7 = 0;
    L_0x01ef:
        r8 = r2.hasNext();
        if (r8 == 0) goto L_0x0234;
    L_0x01f5:
        r8 = r2.next();
        r8 = (java.lang.String) r8;
        r9 = "yyyy";
        r9 = kotlin.text.C4883n.m30195a(r8, r9, r4);
        if (r9 == 0) goto L_0x020d;
    L_0x0203:
        r7 = r1.get(r5);
        r7 = (java.lang.String) r7;
        r7 = java.lang.Integer.parseInt(r7);
    L_0x020d:
        r9 = "mm";
        r9 = kotlin.text.C4883n.m30195a(r8, r9, r4);
        if (r9 == 0) goto L_0x021f;
    L_0x0215:
        r3 = r0.f21005c;
        r9 = r1.get(r5);
        r3 = r3.indexOf(r9);
    L_0x021f:
        r9 = "dd";
        r8 = kotlin.text.C4883n.m30195a(r8, r9, r4);
        if (r8 == 0) goto L_0x0231;
    L_0x0227:
        r6 = r1.get(r5);
        r6 = (java.lang.String) r6;
        r6 = java.lang.Integer.parseInt(r6);
    L_0x0231:
        r5 = r5 + 1;
        goto L_0x01ef;
    L_0x0234:
        r3 = r3 + r4;
        r1 = java.lang.String.valueOf(r3);
        r2 = r1.length();
        r3 = 48;
        if (r2 != r4) goto L_0x0250;
    L_0x0241:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r2.append(r3);
        r2.append(r1);
        r1 = r2.toString();
    L_0x0250:
        r10 = r1;
        r1 = java.lang.String.valueOf(r6);
        r2 = r1.length();
        if (r2 != r4) goto L_0x026a;
    L_0x025b:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r2.append(r3);
        r2.append(r1);
        r1 = r2.toString();
    L_0x026a:
        r2 = com.cuvora.carinfo.helpers.C1570t.m6018f();
        r11 = r2.getDob();
        r12 = "yyyy";
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "";
        r2.append(r3);
        r2.append(r7);
        r13 = r2.toString();
        r14 = 0;
        r15 = 4;
        r16 = 0;
        r8 = kotlin.text.C4883n.m30193a(r11, r12, r13, r14, r15, r16);
        r9 = "mm";
        r11 = 0;
        r12 = 4;
        r13 = 0;
        r11 = kotlin.text.C4883n.m30193a(r8, r9, r10, r11, r12, r13);
        r12 = "dd";
        r13 = r1;
        r1 = kotlin.text.C4883n.m30193a(r11, r12, r13, r14, r15, r16);
        r2 = com.cuvora.carinfo.C1459a.f4442a;
        r3 = com.cuvora.carinfo.C1491f.C1487a.etDlNumber;
        r3 = r0.mo4624a(r3);
        r3 = (android.widget.EditText) r3;
        r4 = "etDlNumber";
        kotlin.jvm.internal.C2885g.m13907a(r3, r4);
        r3 = r3.getText();
        r3 = r3.toString();
        if (r3 == 0) goto L_0x030e;
    L_0x02b6:
        r3 = (java.lang.CharSequence) r3;
        r3 = kotlin.text.C4886o.m30224a(r3);
        r3 = r3.toString();
        r2.m5708a(r3);
        r2 = com.cuvora.carinfo.C1459a.f4442a;
        r3 = com.cuvora.carinfo.C1491f.C1487a.etDob;
        r3 = r0.mo4624a(r3);
        r3 = (android.support.v7.widget.AppCompatEditText) r3;
        r4 = "etDob";
        kotlin.jvm.internal.C2885g.m13907a(r3, r4);
        r3 = r3.getText();
        r3 = r3.toString();
        if (r3 == 0) goto L_0x0306;
    L_0x02dc:
        r3 = (java.lang.CharSequence) r3;
        r3 = kotlin.text.C4886o.m30224a(r3);
        r3 = r3.toString();
        r2.m5710b(r3);
        r2 = r0.f21003a;
        if (r2 == 0) goto L_0x031e;
    L_0x02ed:
        r3 = com.cuvora.carinfo.C1491f.C1487a.etDlNumber;
        r3 = r0.mo4624a(r3);
        r3 = (android.widget.EditText) r3;
        r4 = "etDlNumber";
        kotlin.jvm.internal.C2885g.m13907a(r3, r4);
        r3 = r3.getText();
        r3 = r3.toString();
        r2.mo5027a(r3, r1);
        goto L_0x031e;
    L_0x0306:
        r1 = new kotlin.TypeCastException;
        r2 = "null cannot be cast to non-null type kotlin.CharSequence";
        r1.<init>(r2);
        throw r1;
    L_0x030e:
        r1 = new kotlin.TypeCastException;
        r2 = "null cannot be cast to non-null type kotlin.CharSequence";
        r1.<init>(r2);
        throw r1;
    L_0x0316:
        r1 = new kotlin.TypeCastException;
        r2 = "null cannot be cast to non-null type kotlin.CharSequence";
        r1.<init>(r2);
        throw r1;
    L_0x031e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cuvora.carinfo.fragment.SearchLicenceFragment.onClick(android.view.View):void");
    }

    /* renamed from: e */
    private final boolean m27764e() {
        Object obj = (EditText) mo4624a(C1487a.etDlNumber);
        C2885g.m13907a(obj, "etDlNumber");
        String obj2 = obj.getText().toString();
        if (obj2 != null) {
            if ((((CharSequence) C4886o.m30224a((CharSequence) obj2).toString()).length() > 0 ? 1 : null) != null) {
                obj = (AppCompatEditText) mo4624a(C1487a.etDob);
                C2885g.m13907a(obj, "etDob");
                obj2 = obj.getText().toString();
                if (obj2 != null) {
                    if ((((CharSequence) C4886o.m30224a((CharSequence) obj2).toString()).length() > 0 ? 1 : null) != null) {
                        return true;
                    }
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            Toast.makeText(getContext(), "Please provide valid DL number and Date of birth", 0).show();
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }
}
