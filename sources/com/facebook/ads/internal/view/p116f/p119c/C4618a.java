package com.facebook.ads.internal.view.p116f.p119c;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Transformation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import com.facebook.ads.internal.p101q.p103b.C1940b;
import com.facebook.ads.internal.p101q.p103b.C1941c;
import com.facebook.ads.internal.p101q.p104c.C1952g;
import com.facebook.ads.internal.view.p116f.p117a.C3858c;

/* renamed from: com.facebook.ads.internal.view.f.c.a */
public class C4618a extends C3858c {
    /* renamed from: a */
    private final C2049a f19180a;

    /* renamed from: com.facebook.ads.internal.view.f.c.a$a */
    public static class C2049a extends RelativeLayout {
        /* renamed from: a */
        private final String f6339a;
        /* renamed from: b */
        private final String f6340b;
        /* renamed from: c */
        private final String f6341c;
        /* renamed from: d */
        private final DisplayMetrics f6342d;
        /* renamed from: e */
        private ImageView f6343e;
        /* renamed from: f */
        private TextView f6344f;
        /* renamed from: g */
        private boolean f6345g = false;

        /* renamed from: com.facebook.ads.internal.view.f.c.a$a$1 */
        class C20441 implements OnTouchListener {
            /* renamed from: a */
            final /* synthetic */ C2049a f6330a;

            C20441(C2049a c2049a) {
                this.f6330a = c2049a;
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                if (!this.f6330a.f6345g) {
                    this.f6330a.m7615d();
                } else if (!TextUtils.isEmpty(this.f6330a.f6340b)) {
                    C1952g.m7374a(new C1952g(), this.f6330a.getContext(), Uri.parse(this.f6330a.f6340b), this.f6330a.f6341c);
                }
                return true;
            }
        }

        public C2049a(Context context, String str, String str2, float[] fArr, String str3) {
            super(context);
            this.f6339a = str;
            this.f6340b = str2;
            this.f6341c = str3;
            this.f6342d = context.getResources().getDisplayMetrics();
            Drawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-16777216);
            gradientDrawable.setAlpha(178);
            gradientDrawable.setCornerRadii(new float[]{fArr[0] * this.f6342d.density, fArr[0] * this.f6342d.density, fArr[1] * this.f6342d.density, fArr[1] * this.f6342d.density, fArr[2] * this.f6342d.density, fArr[2] * this.f6342d.density, fArr[3] * this.f6342d.density, fArr[3] * this.f6342d.density});
            C1936w.m7329a((View) this, gradientDrawable);
            m7608a();
            m7612b();
            m7614c();
            setMinimumWidth(Math.round(this.f6342d.density * 20.0f));
            setMinimumHeight(Math.round(this.f6342d.density * 18.0f));
        }

        /* renamed from: a */
        private void m7608a() {
            setOnTouchListener(new C20441(this));
        }

        /* renamed from: b */
        private void m7612b() {
            this.f6343e = new ImageView(getContext());
            this.f6343e.setImageBitmap(C1941c.m7340a(C1940b.IC_AD_CHOICES));
            addView(this.f6343e);
            LayoutParams layoutParams = new RelativeLayout.LayoutParams(Math.round(this.f6342d.density * 16.0f), Math.round(this.f6342d.density * 16.0f));
            layoutParams.addRule(9);
            layoutParams.addRule(15, -1);
            layoutParams.setMargins(Math.round(this.f6342d.density * 4.0f), Math.round(this.f6342d.density * 2.0f), Math.round(this.f6342d.density * 2.0f), Math.round(this.f6342d.density * 2.0f));
            this.f6343e.setLayoutParams(layoutParams);
        }

        /* renamed from: c */
        private void m7614c() {
            this.f6344f = new TextView(getContext());
            addView(this.f6344f);
            LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.width = 0;
            layoutParams.leftMargin = (int) (this.f6342d.density * 20.0f);
            layoutParams.addRule(9);
            layoutParams.addRule(15, -1);
            this.f6344f.setLayoutParams(layoutParams);
            this.f6344f.setSingleLine();
            this.f6344f.setText(this.f6339a);
            this.f6344f.setTextSize(10.0f);
            this.f6344f.setTextColor(-4341303);
        }

        /* renamed from: d */
        private void m7615d() {
            Paint paint = new Paint();
            paint.setTextSize(this.f6344f.getTextSize());
            int round = Math.round(paint.measureText(this.f6339a) + (this.f6342d.density * 4.0f));
            final int width = getWidth();
            round += width;
            this.f6345g = true;
            Animation c20452 = new Animation(this) {
                /* renamed from: c */
                final /* synthetic */ C2049a f6333c;

                protected void applyTransformation(float f, Transformation transformation) {
                    int i = (int) (((float) width) + (((float) (round - width)) * f));
                    this.f6333c.getLayoutParams().width = i;
                    this.f6333c.requestLayout();
                    this.f6333c.f6344f.getLayoutParams().width = i - width;
                    this.f6333c.f6344f.requestLayout();
                }

                public boolean willChangeBounds() {
                    return true;
                }
            };
            c20452.setAnimationListener(new AnimationListener(this) {
                /* renamed from: c */
                final /* synthetic */ C2049a f6338c;

                /* renamed from: com.facebook.ads.internal.view.f.c.a$a$3$1 */
                class C20471 implements Runnable {
                    /* renamed from: a */
                    final /* synthetic */ C20483 f6335a;

                    /* renamed from: com.facebook.ads.internal.view.f.c.a$a$3$1$1 */
                    class C20461 extends Animation {
                        /* renamed from: a */
                        final /* synthetic */ C20471 f6334a;

                        C20461(C20471 c20471) {
                            this.f6334a = c20471;
                        }

                        protected void applyTransformation(float f, Transformation transformation) {
                            int i = (int) (((float) round) + (((float) (width - round)) * f));
                            this.f6334a.f6335a.f6338c.getLayoutParams().width = i;
                            this.f6334a.f6335a.f6338c.requestLayout();
                            this.f6334a.f6335a.f6338c.f6344f.getLayoutParams().width = i - width;
                            this.f6334a.f6335a.f6338c.f6344f.requestLayout();
                        }

                        public boolean willChangeBounds() {
                            return true;
                        }
                    }

                    C20471(C20483 c20483) {
                        this.f6335a = c20483;
                    }

                    public void run() {
                        if (this.f6335a.f6338c.f6345g) {
                            this.f6335a.f6338c.f6345g = false;
                            Animation c20461 = new C20461(this);
                            c20461.setDuration(300);
                            c20461.setFillAfter(true);
                            this.f6335a.f6338c.startAnimation(c20461);
                        }
                    }
                }

                public void onAnimationEnd(Animation animation) {
                    new Handler().postDelayed(new C20471(this), 3000);
                }

                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationStart(Animation animation) {
                }
            });
            c20452.setDuration(300);
            c20452.setFillAfter(true);
            startAnimation(c20452);
        }
    }

    public C4618a(Context context, String str, String str2, float[] fArr) {
        super(context);
        this.f19180a = new C2049a(context, "AdChoices", str, fArr, str2);
        addView(this.f19180a);
    }
}
