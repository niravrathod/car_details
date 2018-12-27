package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.support.v7.p020a.C0637a.C0627a;
import android.util.AttributeSet;
import android.widget.SeekBar;

public class AppCompatSeekBar extends SeekBar {
    /* renamed from: a */
    private final C3265l f2388a;

    public AppCompatSeekBar(Context context) {
        this(context, null);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0627a.seekBarStyle);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2388a = new C3265l(this);
        this.f2388a.mo826a(attributeSet, i);
    }

    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2388a.m16842a(canvas);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f2388a.m16846c();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f2388a.mo827b();
    }
}
