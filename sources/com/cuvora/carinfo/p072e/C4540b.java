package com.cuvora.carinfo.p072e;

import android.support.v7.widget.AppCompatTextView;
import android.view.ViewGroup;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.p071d.C3666b;

/* renamed from: com.cuvora.carinfo.e.b */
public class C4540b extends C3666b {
    public C4540b(ViewGroup viewGroup) {
        super(viewGroup, (int) R.layout.row_garage_header);
    }

    /* renamed from: a */
    public void m25040a(String str, boolean z) {
        ((AppCompatTextView) this.a.findViewById(R.id.tv_text)).setText(str);
        ((AppCompatTextView) this.a.findViewById(R.id.tv_text)).setVisibility(z ? false : true);
    }
}
