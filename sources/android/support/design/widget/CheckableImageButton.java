package android.support.design.widget;

import android.content.Context;
import android.support.v4.view.C0536a;
import android.support.v4.view.C0560r;
import android.support.v4.view.p018a.C0532b;
import android.support.v7.p020a.C0637a.C0627a;
import android.support.v7.widget.AppCompatImageButton;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;

public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    /* renamed from: a */
    private static final int[] f18335a = new int[]{16842912};
    /* renamed from: b */
    private boolean f18336b;

    /* renamed from: android.support.design.widget.CheckableImageButton$1 */
    class C30471 extends C0536a {
        /* renamed from: a */
        final /* synthetic */ CheckableImageButton f12877a;

        C30471(CheckableImageButton checkableImageButton) {
            this.f12877a = checkableImageButton;
        }

        /* renamed from: a */
        public void mo119a(View view, AccessibilityEvent accessibilityEvent) {
            super.mo119a(view, accessibilityEvent);
            accessibilityEvent.setChecked(this.f12877a.isChecked());
        }

        /* renamed from: a */
        public void mo87a(View view, C0532b c0532b) {
            super.mo87a(view, c0532b);
            c0532b.m1959a(true);
            c0532b.m1967b(this.f12877a.isChecked());
        }
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0627a.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0560r.m2175a((View) this, new C30471(this));
    }

    public void setChecked(boolean z) {
        if (this.f18336b != z) {
            this.f18336b = z;
            refreshDrawableState();
            sendAccessibilityEvent(true);
        }
    }

    public boolean isChecked() {
        return this.f18336b;
    }

    public void toggle() {
        setChecked(this.f18336b ^ 1);
    }

    public int[] onCreateDrawableState(int i) {
        if (this.f18336b) {
            return mergeDrawableStates(super.onCreateDrawableState(i + f18335a.length), f18335a);
        }
        return super.onCreateDrawableState(i);
    }
}
