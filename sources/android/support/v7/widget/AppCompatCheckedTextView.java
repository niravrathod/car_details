package android.support.v7.widget;

import android.content.Context;
import android.support.v7.p022c.p023a.C0680b;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;

public class AppCompatCheckedTextView extends CheckedTextView {
    /* renamed from: a */
    private static final int[] f2383a = new int[]{16843016};
    /* renamed from: b */
    private final C0866m f2384b;

    public AppCompatCheckedTextView(Context context) {
        this(context, null);
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i) {
        super(av.m3538a(context), attributeSet, i);
        this.f2384b = C0866m.m3712a((TextView) this);
        this.f2384b.mo831a(attributeSet, i);
        this.f2384b.mo830a();
        context = ay.m3543a(getContext(), attributeSet, f2383a, i, 0);
        setCheckMarkDrawable(context.m3547a(0));
        context.m3548a();
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C0680b.m2703b(getContext(), i));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f2384b != null) {
            this.f2384b.m3721a(context, i);
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f2384b != null) {
            this.f2384b.mo830a();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0863i.m3695a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }
}
