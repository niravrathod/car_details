package android.support.v7.view;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window.Callback;
import android.view.WindowManager.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* renamed from: android.support.v7.view.i */
public class C0714i implements Callback {
    /* renamed from: e */
    final Callback f2301e;

    public C0714i(Callback callback) {
        if (callback != null) {
            this.f2301e = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f2301e.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f2301e.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f2301e.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f2301e.dispatchTrackballEvent(motionEvent);
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f2301e.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f2301e.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public View onCreatePanelView(int i) {
        return this.f2301e.onCreatePanelView(i);
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f2301e.onCreatePanelMenu(i, menu);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f2301e.onPreparePanel(i, view, menu);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.f2301e.onMenuOpened(i, menu);
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f2301e.onMenuItemSelected(i, menuItem);
    }

    public void onWindowAttributesChanged(LayoutParams layoutParams) {
        this.f2301e.onWindowAttributesChanged(layoutParams);
    }

    public void onContentChanged() {
        this.f2301e.onContentChanged();
    }

    public void onWindowFocusChanged(boolean z) {
        this.f2301e.onWindowFocusChanged(z);
    }

    public void onAttachedToWindow() {
        this.f2301e.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        this.f2301e.onDetachedFromWindow();
    }

    public void onPanelClosed(int i, Menu menu) {
        this.f2301e.onPanelClosed(i, menu);
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f2301e.onSearchRequested(searchEvent);
    }

    public boolean onSearchRequested() {
        return this.f2301e.onSearchRequested();
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f2301e.onWindowStartingActionMode(callback);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.f2301e.onWindowStartingActionMode(callback, i);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f2301e.onActionModeStarted(actionMode);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f2301e.onActionModeFinished(actionMode);
    }

    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        this.f2301e.onProvideKeyboardShortcuts(list, menu, i);
    }

    public void onPointerCaptureChanged(boolean z) {
        this.f2301e.onPointerCaptureChanged(z);
    }
}
