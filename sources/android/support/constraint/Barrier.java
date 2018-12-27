package android.support.constraint;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.constraint.C0093b.C0092b;
import android.support.constraint.solver.widgets.C4402b;
import android.util.AttributeSet;

public class Barrier extends ConstraintHelper {
    /* renamed from: f */
    private int f12751f;
    /* renamed from: g */
    private int f12752g;
    /* renamed from: h */
    private C4402b f12753h;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    public int getType() {
        return this.f12751f;
    }

    public void setType(int i) {
        this.f12751f = i;
        this.f12752g = i;
        if (VERSION.SDK_INT >= 17) {
            if ((1 == getResources().getConfiguration().getLayoutDirection() ? 1 : 0) != 0) {
                if (this.f12751f == 5) {
                    this.f12752g = 1;
                } else if (this.f12751f == 6) {
                    this.f12752g = 0;
                }
            } else if (this.f12751f == 5) {
                this.f12752g = 0;
            } else if (this.f12751f == 6) {
                this.f12752g = 1;
            }
        } else if (this.f12751f == 5) {
            this.f12752g = 0;
        } else if (this.f12751f == 6) {
            this.f12752g = 1;
        }
        this.f12753h.mo42a(this.f12752g);
    }

    /* renamed from: a */
    protected void mo28a(AttributeSet attributeSet) {
        super.mo28a(attributeSet);
        this.f12753h = new C4402b();
        if (attributeSet != null) {
            attributeSet = getContext().obtainStyledAttributes(attributeSet, C0092b.ConstraintLayout_Layout);
            int indexCount = attributeSet.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = attributeSet.getIndex(i);
                if (index == C0092b.ConstraintLayout_Layout_barrierDirection) {
                    setType(attributeSet.getInt(index, 0));
                } else if (index == C0092b.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f12753h.m24044a(attributeSet.getBoolean(index, true));
                }
            }
        }
        this.d = this.f12753h;
        m195a();
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f12753h.m24044a(z);
    }
}
