package io.branch.referral;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.WindowManager.LayoutParams;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;

/* renamed from: io.branch.referral.a */
public class C2727a extends Dialog {
    /* renamed from: a */
    private boolean f11497a;
    /* renamed from: b */
    private final boolean f11498b;

    /* renamed from: io.branch.referral.a$1 */
    class C27191 implements OnKeyListener {
        /* renamed from: a */
        final /* synthetic */ C2727a f11491a;

        C27191(C2727a c2727a) {
            this.f11491a = c2727a;
        }

        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i == 4) {
                this.f11491a.m13209c();
            }
            return true;
        }
    }

    /* renamed from: io.branch.referral.a$2 */
    class C27202 implements AnimationListener {
        /* renamed from: a */
        final /* synthetic */ C2727a f11492a;

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }

        C27202(C2727a c2727a) {
            this.f11492a = c2727a;
        }

        public void onAnimationEnd(Animation animation) {
            this.f11492a.dismiss();
        }
    }

    public C2727a(Context context, boolean z) {
        super(context);
        this.f11497a = false;
        this.f11498b = z;
        m13206a(context);
    }

    public C2727a(Context context, int i) {
        super(context, i);
        this.f11497a = false;
        this.f11498b = false;
        m13206a(context);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f11498b != null) {
            bundle = getWindow().getAttributes();
            bundle.width = -1;
            getWindow().setAttributes(bundle);
        }
    }

    public void show() {
        m13208b();
    }

    public void cancel() {
        m13209c();
    }

    public void setContentView(int i) {
        m13210a();
        super.setContentView(i);
    }

    /* renamed from: a */
    private void m13206a(Context context) {
        m13210a();
        setOnKeyListener(new C27191(this));
    }

    /* renamed from: a */
    public void m13210a() {
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().addFlags(2);
        getWindow().addFlags(1024);
        LayoutParams layoutParams = new LayoutParams();
        layoutParams.copyFrom(getWindow().getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.gravity = 80;
        layoutParams.dimAmount = 0.8f;
        getWindow().setAttributes(layoutParams);
        getWindow().setWindowAnimations(17432578);
        setCanceledOnTouchOutside(true);
    }

    /* renamed from: b */
    private void m13208b() {
        Animation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(500);
        translateAnimation.setInterpolator(new AccelerateInterpolator());
        ((ViewGroup) getWindow().getDecorView()).getChildAt(0).startAnimation(translateAnimation);
        super.show();
    }

    /* renamed from: c */
    private void m13209c() {
        if (!this.f11497a) {
            this.f11497a = true;
            Animation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
            translateAnimation.setDuration(500);
            translateAnimation.setInterpolator(new DecelerateInterpolator());
            ((ViewGroup) getWindow().getDecorView()).getChildAt(0).startAnimation(translateAnimation);
            translateAnimation.setAnimationListener(new C27202(this));
        }
    }
}
