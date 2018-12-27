package android.support.v7.widget;

import android.content.Context;
import android.support.v7.p020a.C0637a.C0627a;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

public class AppCompatRatingBar extends RatingBar {
    /* renamed from: a */
    private final C0865k f2387a;

    public AppCompatRatingBar(Context context) {
        this(context, null);
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0627a.ratingBarStyle);
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2387a = new C0865k(this);
        this.f2387a.mo826a(attributeSet, i);
    }

    protected synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        i2 = this.f2387a.m3709a();
        if (i2 != 0) {
            setMeasuredDimension(View.resolveSizeAndState(i2.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
