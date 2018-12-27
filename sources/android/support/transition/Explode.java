package android.support.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.support.transition.C0293y.C0292a;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

public class Explode extends Visibility {
    /* renamed from: g */
    private static final TimeInterpolator f18378g = new DecelerateInterpolator();
    /* renamed from: h */
    private static final TimeInterpolator f18379h = new AccelerateInterpolator();
    /* renamed from: i */
    private int[] f18380i;

    public Explode() {
        this.f18380i = new int[2];
        mo203a(new C4425e());
    }

    public Explode(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18380i = new int[2];
        mo203a((af) new C4425e());
    }

    /* renamed from: d */
    private void m24175d(ah ahVar) {
        View view = ahVar.f995b;
        view.getLocationOnScreen(this.f18380i);
        int i = this.f18380i[0];
        int i2 = this.f18380i[1];
        ahVar.f994a.put("android:explode:screenBounds", new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2));
    }

    /* renamed from: a */
    public void mo98a(ah ahVar) {
        super.mo98a(ahVar);
        m24175d(ahVar);
    }

    /* renamed from: b */
    public void mo99b(ah ahVar) {
        super.mo99b(ahVar);
        m24175d(ahVar);
    }

    /* renamed from: a */
    public Animator mo3734a(ViewGroup viewGroup, View view, ah ahVar, ah ahVar2) {
        if (ahVar2 == null) {
            return null;
        }
        Rect rect = (Rect) ahVar2.f994a.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        m24174a((View) viewGroup, rect, this.f18380i);
        return aj.m984a(view, ahVar2, rect.left, rect.top, translationX + ((float) this.f18380i[0]), translationY + ((float) this.f18380i[1]), translationX, translationY, f18378g);
    }

    /* renamed from: b */
    public Animator mo3735b(ViewGroup viewGroup, View view, ah ahVar, ah ahVar2) {
        if (ahVar == null) {
            return null;
        }
        float f;
        float f2;
        Rect rect = (Rect) ahVar.f994a.get("android:explode:screenBounds");
        int i = rect.left;
        int i2 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) ahVar.f995b.getTag(C0292a.transition_position);
        if (iArr != null) {
            f = ((float) (iArr[0] - rect.left)) + translationX;
            f2 = ((float) (iArr[1] - rect.top)) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f = translationX;
            f2 = translationY;
        }
        m24174a((View) viewGroup, rect, this.f18380i);
        return aj.m984a(view, ahVar, i, i2, translationX, translationY, f + ((float) this.f18380i[0]), f2 + ((float) this.f18380i[1]), f18379h);
    }

    /* renamed from: a */
    private void m24174a(View view, Rect rect, int[] iArr) {
        int width;
        int height;
        View view2 = view;
        view2.getLocationOnScreen(this.f18380i);
        int i = this.f18380i[0];
        int i2 = this.f18380i[1];
        Rect m = m962m();
        if (m == null) {
            width = ((view.getWidth() / 2) + i) + Math.round(view.getTranslationX());
            height = ((view.getHeight() / 2) + i2) + Math.round(view.getTranslationY());
        } else {
            int centerX = m.centerX();
            height = m.centerY();
            width = centerX;
        }
        float centerX2 = (float) (rect.centerX() - width);
        float centerY = (float) (rect.centerY() - height);
        if (centerX2 == 0.0f && centerY == 0.0f) {
            centerX2 = ((float) (Math.random() * 2.0d)) - 1.0f;
            centerY = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float a = m24172a(centerX2, centerY);
        centerX2 /= a;
        centerY /= a;
        float a2 = m24173a(view2, width - i, height - i2);
        iArr[0] = Math.round(centerX2 * a2);
        iArr[1] = Math.round(a2 * centerY);
    }

    /* renamed from: a */
    private static float m24173a(View view, int i, int i2) {
        return m24172a((float) Math.max(i, view.getWidth() - i), (float) Math.max(i2, view.getHeight() - i2));
    }

    /* renamed from: a */
    private static float m24172a(float f, float f2) {
        return (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
    }
}
