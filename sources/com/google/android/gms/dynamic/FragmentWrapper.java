package com.google.android.gms.dynamic;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IFragmentWrapper.Stub;

@SuppressLint({"NewApi"})
@KeepForSdk
public final class FragmentWrapper extends Stub {
    /* renamed from: a */
    private Fragment f19626a;

    @KeepForSdk
    /* renamed from: a */
    public static FragmentWrapper m25992a(Fragment fragment) {
        return fragment != null ? new FragmentWrapper(fragment) : null;
    }

    private FragmentWrapper(Fragment fragment) {
        this.f19626a = fragment;
    }

    /* renamed from: a */
    public final IObjectWrapper mo1896a() {
        return ObjectWrapper.m26019a(this.f19626a.getActivity());
    }

    /* renamed from: b */
    public final Bundle mo1901b() {
        return this.f19626a.getArguments();
    }

    /* renamed from: c */
    public final int mo1904c() {
        return this.f19626a.getId();
    }

    /* renamed from: d */
    public final IFragmentWrapper mo1906d() {
        return m25992a(this.f19626a.getParentFragment());
    }

    /* renamed from: e */
    public final IObjectWrapper mo1908e() {
        return ObjectWrapper.m26019a(this.f19626a.getResources());
    }

    /* renamed from: f */
    public final boolean mo1909f() {
        return this.f19626a.getRetainInstance();
    }

    /* renamed from: g */
    public final String mo1910g() {
        return this.f19626a.getTag();
    }

    /* renamed from: h */
    public final IFragmentWrapper mo1911h() {
        return m25992a(this.f19626a.getTargetFragment());
    }

    /* renamed from: i */
    public final int mo1912i() {
        return this.f19626a.getTargetRequestCode();
    }

    /* renamed from: j */
    public final boolean mo1913j() {
        return this.f19626a.getUserVisibleHint();
    }

    /* renamed from: k */
    public final IObjectWrapper mo1914k() {
        return ObjectWrapper.m26019a(this.f19626a.getView());
    }

    /* renamed from: l */
    public final boolean mo1915l() {
        return this.f19626a.isAdded();
    }

    /* renamed from: m */
    public final boolean mo1916m() {
        return this.f19626a.isDetached();
    }

    /* renamed from: n */
    public final boolean mo1917n() {
        return this.f19626a.isHidden();
    }

    /* renamed from: o */
    public final boolean mo1918o() {
        return this.f19626a.isInLayout();
    }

    /* renamed from: p */
    public final boolean mo1919p() {
        return this.f19626a.isRemoving();
    }

    /* renamed from: q */
    public final boolean mo1920q() {
        return this.f19626a.isResumed();
    }

    /* renamed from: r */
    public final boolean mo1921r() {
        return this.f19626a.isVisible();
    }

    /* renamed from: a */
    public final void mo1899a(IObjectWrapper iObjectWrapper) {
        this.f19626a.registerForContextMenu((View) ObjectWrapper.m26020a(iObjectWrapper));
    }

    /* renamed from: a */
    public final void mo1900a(boolean z) {
        this.f19626a.setHasOptionsMenu(z);
    }

    /* renamed from: b */
    public final void mo1903b(boolean z) {
        this.f19626a.setMenuVisibility(z);
    }

    /* renamed from: c */
    public final void mo1905c(boolean z) {
        this.f19626a.setRetainInstance(z);
    }

    /* renamed from: d */
    public final void mo1907d(boolean z) {
        this.f19626a.setUserVisibleHint(z);
    }

    /* renamed from: a */
    public final void mo1897a(Intent intent) {
        this.f19626a.startActivity(intent);
    }

    /* renamed from: a */
    public final void mo1898a(Intent intent, int i) {
        this.f19626a.startActivityForResult(intent, i);
    }

    /* renamed from: b */
    public final void mo1902b(IObjectWrapper iObjectWrapper) {
        this.f19626a.unregisterForContextMenu((View) ObjectWrapper.m26020a(iObjectWrapper));
    }
}
