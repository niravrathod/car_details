package com.cuvora.carinfo.views;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.inputmethod.InputMethodManager;

public class ClearableEditText extends AppCompatEditText {
    /* renamed from: a */
    private C1629a f18972a;
    /* renamed from: b */
    private Drawable f18973b;
    /* renamed from: c */
    private C1630b f18974c;

    /* renamed from: com.cuvora.carinfo.views.ClearableEditText$a */
    public interface C1629a {
        /* renamed from: a */
        boolean m6221a(ClearableEditText clearableEditText, MotionEvent motionEvent, Drawable drawable);
    }

    /* renamed from: com.cuvora.carinfo.views.ClearableEditText$b */
    public interface C1630b {
        /* renamed from: a */
        void m6222a();
    }

    public ClearableEditText(Context context) {
        this(context, null);
    }

    public ClearableEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setFocusable(true);
        getCompoundDrawables();
        m25231a();
    }

    /* renamed from: a */
    private void m25231a() {
        this.f18973b = getResources().getDrawable(2131165344);
        this.f18973b.setBounds(0, 0, this.f18973b.getIntrinsicWidth(), this.f18973b.getIntrinsicHeight());
        Drawable[] compoundDrawables = getCompoundDrawables();
        setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], getText().toString().equals("") ? null : this.f18973b, compoundDrawables[3]);
    }

    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        setCompoundDrawables(null, null, getText().toString().equals("") != null ? null : this.f18973b, null);
    }

    public void setTouchListener(C1629a c1629a) {
        this.f18972a = c1629a;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f18972a != null) {
            this.f18972a.m6221a(this, motionEvent, this.f18973b);
            return true;
        } else if (getCompoundDrawables()[2] == null) {
            return super.onTouchEvent(motionEvent);
        } else {
            if (motionEvent.getAction() != 1) {
                return super.onTouchEvent(motionEvent);
            }
            if (motionEvent.getX() <= ((float) ((getWidth() - getPaddingRight()) - this.f18973b.getIntrinsicWidth()))) {
                return super.onTouchEvent(motionEvent);
            }
            setText("");
            setCompoundDrawables(null, null, null, null);
            if (this.f18974c != null) {
                this.f18974c.m6222a();
            }
            return null;
        }
    }

    protected void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z) {
            ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 2);
        }
    }

    public void setOnTextClearedListener(C1630b c1630b) {
        this.f18974c = c1630b;
    }
}
