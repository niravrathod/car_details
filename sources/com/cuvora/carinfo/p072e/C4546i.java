package com.cuvora.carinfo.p072e;

import android.support.design.widget.TextInputEditText;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewGroup;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.fragment.C4804h;
import com.cuvora.carinfo.models.GarageResult;
import com.cuvora.carinfo.p071d.C3666b;

/* renamed from: com.cuvora.carinfo.e.i */
public class C4546i extends C3666b implements C1482g {
    /* renamed from: o */
    private TextInputEditText f18865o;
    /* renamed from: p */
    private TextInputEditText f18866p;
    /* renamed from: q */
    private TextInputEditText f18867q;

    protected C4546i(ViewGroup viewGroup) {
        super(viewGroup, (int) R.layout.view_garage_user_info);
    }

    /* renamed from: a */
    public void m25049a(final GarageResult garageResult, final C1475a c1475a) {
        this.f18866p = (TextInputEditText) this.a.findViewById(R.id.et_email);
        this.f18865o = (TextInputEditText) this.a.findViewById(R.id.et_name);
        this.f18867q = (TextInputEditText) this.a.findViewById(R.id.et_mobile);
        C4804h.f21029b.m5738a(this);
        this.f18865o.setText(garageResult.getName());
        this.f18866p.setText(garageResult.getEmail());
        this.f18867q.setText(garageResult.getMobileNumber());
        mo3926d();
        this.f18865o.addTextChangedListener(new TextWatcher(this) {
            /* renamed from: c */
            final /* synthetic */ C4546i f4475c;

            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (charSequence.toString().trim().equalsIgnoreCase(garageResult.getName() != 0 ? garageResult.getName().trim() : "") == null) {
                    c1475a.mo1195a((boolean) 1);
                } else {
                    c1475a.mo1195a((boolean) 0);
                }
            }
        });
        this.f18866p.addTextChangedListener(new TextWatcher(this) {
            /* renamed from: c */
            final /* synthetic */ C4546i f4478c;

            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (charSequence.toString().trim().equalsIgnoreCase(garageResult.getEmail() != 0 ? garageResult.getEmail().trim() : "") == null) {
                    c1475a.mo1195a((boolean) 1);
                } else {
                    c1475a.mo1195a((boolean) 0);
                }
            }
        });
        this.f18867q.addTextChangedListener(new TextWatcher(this) {
            /* renamed from: c */
            final /* synthetic */ C4546i f4481c;

            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (charSequence.toString().trim().equalsIgnoreCase(garageResult.getMobileNumber() != 0 ? garageResult.getMobileNumber().trim() : "") == null) {
                    c1475a.mo1195a((boolean) 1);
                } else {
                    c1475a.mo1195a((boolean) 0);
                }
            }
        });
    }

    public String f_() {
        return this.f18865o.getText().toString();
    }

    /* renamed from: b */
    public String mo3924b() {
        return this.f18866p.getText().toString();
    }

    /* renamed from: c */
    public String mo3925c() {
        return this.f18867q.getText().toString();
    }

    /* renamed from: d */
    public void mo3926d() {
        this.f18866p.clearFocus();
        this.f18865o.clearFocus();
        this.f18867q.clearFocus();
    }
}
