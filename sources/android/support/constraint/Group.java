package android.support.constraint;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.constraint.ConstraintLayout.LayoutParams;
import android.util.AttributeSet;
import android.view.View;

public class Group extends ConstraintHelper {
    public Group(Context context) {
        super(context);
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    protected void mo28a(AttributeSet attributeSet) {
        super.mo28a(attributeSet);
        this.e = null;
    }

    /* renamed from: a */
    public void mo29a(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i = 0; i < this.b; i++) {
            View a = constraintLayout.m212a(this.a[i]);
            if (a != null) {
                a.setVisibility(visibility);
                if (elevation > 0.0f && VERSION.SDK_INT >= 21) {
                    a.setElevation(elevation);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo30b(ConstraintLayout constraintLayout) {
        LayoutParams layoutParams = (LayoutParams) getLayoutParams();
        layoutParams.al.m369j(0);
        layoutParams.al.m371k(0);
    }
}
