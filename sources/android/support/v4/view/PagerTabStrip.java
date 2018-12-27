package android.support.v4.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.content.C0389b;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewConfiguration;

public class PagerTabStrip extends PagerTitleStrip {
    /* renamed from: g */
    private int f13293g;
    /* renamed from: h */
    private int f13294h;
    /* renamed from: i */
    private int f13295i;
    /* renamed from: j */
    private int f13296j;
    /* renamed from: k */
    private int f13297k;
    /* renamed from: l */
    private int f13298l;
    /* renamed from: m */
    private final Paint f13299m;
    /* renamed from: n */
    private final Rect f13300n;
    /* renamed from: o */
    private int f13301o;
    /* renamed from: p */
    private boolean f13302p;
    /* renamed from: q */
    private boolean f13303q;
    /* renamed from: r */
    private int f13304r;
    /* renamed from: s */
    private boolean f13305s;
    /* renamed from: t */
    private float f13306t;
    /* renamed from: u */
    private float f13307u;
    /* renamed from: v */
    private int f13308v;

    /* renamed from: android.support.v4.view.PagerTabStrip$1 */
    class C05111 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ PagerTabStrip f1616a;

        C05111(PagerTabStrip pagerTabStrip) {
            this.f1616a = pagerTabStrip;
        }

        public void onClick(View view) {
            this.f1616a.a.setCurrentItem(this.f1616a.a.getCurrentItem() - 1);
        }
    }

    /* renamed from: android.support.v4.view.PagerTabStrip$2 */
    class C05122 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ PagerTabStrip f1617a;

        C05122(PagerTabStrip pagerTabStrip) {
            this.f1617a = pagerTabStrip;
        }

        public void onClick(View view) {
            this.f1617a.a.setCurrentItem(this.f1617a.a.getCurrentItem() + 1);
        }
    }

    public PagerTabStrip(Context context) {
        this(context, null);
    }

    public PagerTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13299m = new Paint();
        this.f13300n = new Rect();
        this.f13301o = 255;
        this.f13302p = false;
        this.f13303q = false;
        this.f13293g = this.f;
        this.f13299m.setColor(this.f13293g);
        float f = context.getResources().getDisplayMetrics().density;
        this.f13294h = (int) ((3.0f * f) + 0.5f);
        this.f13295i = (int) ((6.0f * f) + 0.5f);
        this.f13296j = (int) (64.0f * f);
        this.f13298l = (int) ((16.0f * f) + 0.5f);
        this.f13304r = (int) ((1.0f * f) + 0.5f);
        this.f13297k = (int) ((f * 32.0f) + 0.5f);
        this.f13308v = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.b.setFocusable(true);
        this.b.setOnClickListener(new C05111(this));
        this.d.setFocusable(true);
        this.d.setOnClickListener(new C05122(this));
        if (getBackground() == null) {
            this.f13302p = true;
        }
    }

    public void setTabIndicatorColor(int i) {
        this.f13293g = i;
        this.f13299m.setColor(this.f13293g);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i) {
        setTabIndicatorColor(C0389b.m1438c(getContext(), i));
    }

    public int getTabIndicatorColor() {
        return this.f13293g;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        if (i4 < this.f13295i) {
            i4 = this.f13295i;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setTextSpacing(int i) {
        if (i < this.f13296j) {
            i = this.f13296j;
        }
        super.setTextSpacing(i);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (!this.f13303q) {
            this.f13302p = drawable == null ? true : null;
        }
    }

    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        if (!this.f13303q) {
            this.f13302p = (i & -16777216) == 0 ? 1 : 0;
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (!this.f13303q) {
            this.f13302p = i == 0 ? 1 : 0;
        }
    }

    public void setDrawFullUnderline(boolean z) {
        this.f13302p = z;
        this.f13303q = true;
        invalidate();
    }

    public boolean getDrawFullUnderline() {
        return this.f13302p;
    }

    int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f13297k);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f13305s) {
            return false;
        }
        float x = motionEvent.getX();
        motionEvent = motionEvent.getY();
        switch (action) {
            case 0:
                this.f13306t = x;
                this.f13307u = motionEvent;
                this.f13305s = false;
                break;
            case 1:
                if (x >= ((float) (this.c.getLeft() - this.f13298l))) {
                    if (x > ((float) (this.c.getRight() + this.f13298l))) {
                        this.a.setCurrentItem(this.a.getCurrentItem() + 1);
                        break;
                    }
                }
                this.a.setCurrentItem(this.a.getCurrentItem() - 1);
                break;
                break;
            case 2:
                if (Math.abs(x - this.f13306t) > ((float) this.f13308v) || Math.abs(motionEvent - this.f13307u) > ((float) this.f13308v)) {
                    this.f13305s = true;
                    break;
                }
            default:
                break;
        }
        return true;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.c.getLeft() - this.f13298l;
        int right = this.c.getRight() + this.f13298l;
        int i = height - this.f13294h;
        this.f13299m.setColor((this.f13301o << 24) | (this.f13293g & 16777215));
        float f = (float) height;
        canvas.drawRect((float) left, (float) i, (float) right, f, this.f13299m);
        if (this.f13302p) {
            this.f13299m.setColor(-16777216 | (this.f13293g & 16777215));
            canvas.drawRect((float) getPaddingLeft(), (float) (height - this.f13304r), (float) (getWidth() - getPaddingRight()), f, this.f13299m);
        }
    }

    /* renamed from: a */
    void mo436a(int i, float f, boolean z) {
        Rect rect = this.f13300n;
        int height = getHeight();
        int i2 = height - this.f13294h;
        rect.set(this.c.getLeft() - this.f13298l, i2, this.c.getRight() + this.f13298l, height);
        super.mo436a(i, f, z);
        this.f13301o = (int) ((Math.abs(f - 1056964608) * 1073741824) * 1132396544);
        rect.union(this.c.getLeft() - this.f13298l, i2, this.c.getRight() + this.f13298l, height);
        invalidate(rect);
    }
}
