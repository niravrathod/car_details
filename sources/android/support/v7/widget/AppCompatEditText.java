package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.view.C0557q;
import android.support.v7.p020a.C0637a.C0627a;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;

public class AppCompatEditText extends EditText implements C0557q {
    /* renamed from: a */
    private final C0859f f13717a;
    /* renamed from: b */
    private final C0866m f13718b;

    public AppCompatEditText(Context context) {
        this(context, null);
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0627a.editTextStyle);
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(av.m3538a(context), attributeSet, i);
        this.f13717a = new C0859f(this);
        this.f13717a.m3652a(attributeSet, i);
        this.f13718b = C0866m.m3712a((TextView) this);
        this.f13718b.mo831a(attributeSet, i);
        this.f13718b.mo830a();
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f13717a != null) {
            this.f13717a.m3648a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f13717a != null) {
            this.f13717a.m3651a(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f13717a != null) {
            this.f13717a.m3649a(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.f13717a != null ? this.f13717a.m3647a() : null;
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f13717a != null) {
            this.f13717a.m3650a(mode);
        }
    }

    public Mode getSupportBackgroundTintMode() {
        return this.f13717a != null ? this.f13717a.m3653b() : null;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f13717a != null) {
            this.f13717a.m3655c();
        }
        if (this.f13718b != null) {
            this.f13718b.mo830a();
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f13718b != null) {
            this.f13718b.m3721a(context, i);
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0863i.m3695a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }
}
