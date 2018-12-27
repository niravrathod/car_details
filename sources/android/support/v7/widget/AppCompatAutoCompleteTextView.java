package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.view.C0557q;
import android.support.v7.p020a.C0637a.C0627a;
import android.support.v7.p022c.p023a.C0680b;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class AppCompatAutoCompleteTextView extends AutoCompleteTextView implements C0557q {
    /* renamed from: a */
    private static final int[] f13711a = new int[]{16843126};
    /* renamed from: b */
    private final C0859f f13712b;
    /* renamed from: c */
    private final C0866m f13713c;

    public AppCompatAutoCompleteTextView(Context context) {
        this(context, null);
    }

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0627a.autoCompleteTextViewStyle);
    }

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(av.m3538a(context), attributeSet, i);
        context = ay.m3543a(getContext(), attributeSet, f13711a, i, 0);
        if (context.m3561g(0)) {
            setDropDownBackgroundDrawable(context.m3547a(0));
        }
        context.m3548a();
        this.f13712b = new C0859f(this);
        this.f13712b.m3652a(attributeSet, i);
        this.f13713c = C0866m.m3712a((TextView) this);
        this.f13713c.mo831a(attributeSet, i);
        this.f13713c.mo830a();
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0680b.m2703b(getContext(), i));
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f13712b != null) {
            this.f13712b.m3648a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f13712b != null) {
            this.f13712b.m3651a(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f13712b != null) {
            this.f13712b.m3649a(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.f13712b != null ? this.f13712b.m3647a() : null;
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f13712b != null) {
            this.f13712b.m3650a(mode);
        }
    }

    public Mode getSupportBackgroundTintMode() {
        return this.f13712b != null ? this.f13712b.m3653b() : null;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f13712b != null) {
            this.f13712b.m3655c();
        }
        if (this.f13713c != null) {
            this.f13713c.mo830a();
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f13713c != null) {
            this.f13713c.m3721a(context, i);
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0863i.m3695a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }
}
