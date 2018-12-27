package android.support.constraint;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.support.constraint.C0093b.C0092b;
import android.support.constraint.ConstraintLayout.LayoutParams;
import android.util.AttributeSet;
import android.view.View;

public class Placeholder extends View {
    /* renamed from: a */
    private int f229a = -1;
    /* renamed from: b */
    private View f230b = null;
    /* renamed from: c */
    private int f231c = 4;

    public Placeholder(Context context) {
        super(context);
        m218a(null);
    }

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m218a(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m218a(attributeSet);
    }

    /* renamed from: a */
    private void m218a(AttributeSet attributeSet) {
        super.setVisibility(this.f231c);
        this.f229a = -1;
        if (attributeSet != null) {
            attributeSet = getContext().obtainStyledAttributes(attributeSet, C0092b.ConstraintLayout_placeholder);
            int indexCount = attributeSet.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = attributeSet.getIndex(i);
                if (index == C0092b.ConstraintLayout_placeholder_content) {
                    this.f229a = attributeSet.getResourceId(index, this.f229a);
                } else if (index == C0092b.ConstraintLayout_placeholder_emptyVisibility) {
                    this.f231c = attributeSet.getInt(index, this.f231c);
                }
            }
        }
    }

    public void setEmptyVisibility(int i) {
        this.f231c = i;
    }

    public int getEmptyVisibility() {
        return this.f231c;
    }

    public View getContent() {
        return this.f230b;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Align.LEFT);
            String str = "?";
            paint.getTextBounds(str, 0, str.length(), rect);
            canvas.drawText(str, ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    /* renamed from: a */
    public void m219a(ConstraintLayout constraintLayout) {
        if (this.f229a == -1 && !isInEditMode()) {
            setVisibility(this.f231c);
        }
        this.f230b = constraintLayout.findViewById(this.f229a);
        if (this.f230b != null) {
            ((LayoutParams) this.f230b.getLayoutParams()).aa = true;
            this.f230b.setVisibility(0);
            setVisibility(0);
        }
    }

    public void setContentId(int i) {
        if (this.f229a != i) {
            if (this.f230b != null) {
                this.f230b.setVisibility(0);
                ((LayoutParams) this.f230b.getLayoutParams()).aa = false;
                this.f230b = null;
            }
            this.f229a = i;
            if (i != -1) {
                i = ((View) getParent()).findViewById(i);
                if (i != 0) {
                    i.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: b */
    public void m220b(ConstraintLayout constraintLayout) {
        if (this.f230b != null) {
            LayoutParams layoutParams = (LayoutParams) getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) this.f230b.getLayoutParams();
            layoutParams2.al.m357e(0);
            layoutParams.al.m369j(layoutParams2.al.m380p());
            layoutParams.al.m371k(layoutParams2.al.m384r());
            layoutParams2.al.m357e(8);
        }
    }
}
