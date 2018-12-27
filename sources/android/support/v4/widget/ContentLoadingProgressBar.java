package android.support.v4.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class ContentLoadingProgressBar extends ProgressBar {
    /* renamed from: a */
    long f1791a;
    /* renamed from: b */
    boolean f1792b;
    /* renamed from: c */
    boolean f1793c;
    /* renamed from: d */
    boolean f1794d;
    /* renamed from: e */
    private final Runnable f1795e;
    /* renamed from: f */
    private final Runnable f1796f;

    /* renamed from: android.support.v4.widget.ContentLoadingProgressBar$1 */
    class C05721 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ContentLoadingProgressBar f1789a;

        C05721(ContentLoadingProgressBar contentLoadingProgressBar) {
            this.f1789a = contentLoadingProgressBar;
        }

        public void run() {
            this.f1789a.f1792b = false;
            this.f1789a.f1791a = -1;
            this.f1789a.setVisibility(8);
        }
    }

    /* renamed from: android.support.v4.widget.ContentLoadingProgressBar$2 */
    class C05732 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ContentLoadingProgressBar f1790a;

        C05732(ContentLoadingProgressBar contentLoadingProgressBar) {
            this.f1790a = contentLoadingProgressBar;
        }

        public void run() {
            this.f1790a.f1793c = false;
            if (!this.f1790a.f1794d) {
                this.f1790a.f1791a = System.currentTimeMillis();
                this.f1790a.setVisibility(0);
            }
        }
    }

    public ContentLoadingProgressBar(Context context) {
        this(context, null);
    }

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1791a = -1;
        this.f1792b = false;
        this.f1793c = false;
        this.f1794d = false;
        this.f1795e = new C05721(this);
        this.f1796f = new C05732(this);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m2259a();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2259a();
    }

    /* renamed from: a */
    private void m2259a() {
        removeCallbacks(this.f1795e);
        removeCallbacks(this.f1796f);
    }
}
