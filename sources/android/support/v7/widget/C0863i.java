package android.support.v7.widget;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* renamed from: android.support.v7.widget.i */
class C0863i {
    /* renamed from: a */
    static InputConnection m3695a(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (view = view.getParent(); view instanceof View; view = view.getParent()) {
                if (view instanceof bh) {
                    editorInfo.hintText = ((bh) view).getHint();
                    break;
                }
            }
        }
        return inputConnection;
    }
}
