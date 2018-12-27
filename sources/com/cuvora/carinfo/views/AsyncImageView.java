package com.cuvora.carinfo.views;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.bumptech.glide.C1143c;
import com.bumptech.glide.load.C3500h;
import com.bumptech.glide.load.resource.bitmap.C4784s;
import com.bumptech.glide.request.C1313e;
import kotlin.jvm.internal.C2885g;

public final class AsyncImageView extends AppCompatImageView {
    public AsyncImageView(Context context, AttributeSet attributeSet) {
        C2885g.m13910b(context, "context");
        C2885g.m13910b(attributeSet, "attributeSet");
        super(context, attributeSet);
    }

    public final void setImageUrl(String str) {
        C1143c.m4771b(getContext()).m17286a(str).m4835a((ImageView) this);
    }

    public final void setImageUrl(String str, int i) {
        C1143c.m4771b(getContext()).m17286a(str).m4830a(new C1313e().m5307a(i).m5317b(i)).m4835a((ImageView) this);
    }

    public final void setImageUrlWithCircleTransform(String str, int i) {
        C1143c.m4771b(getContext()).m17286a(str).m4830a(new C1313e().m5328g().m5307a(i).m5317b(i)).m4835a((ImageView) this);
    }

    public final void setImageUrlWithRoundedCorner(String str, int i, int i2) {
        C1143c.m4771b(getContext()).m17286a(str).m4830a(new C1313e().m5312a((C3500h) new C4784s(i)).m5307a(i2).m5317b(i2)).m4835a((ImageView) this);
    }
}
