package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IFragmentWrapper.Stub;

@KeepForSdk
public final class SupportFragmentWrapper extends Stub {
    /* renamed from: a */
    private Fragment f19628a;

    @KeepForSdk
    /* renamed from: a */
    public static SupportFragmentWrapper m26021a(Fragment fragment) {
        return fragment != null ? new SupportFragmentWrapper(fragment) : null;
    }

    private SupportFragmentWrapper(Fragment fragment) {
        this.f19628a = fragment;
    }

    /* renamed from: a */
    public final IObjectWrapper mo1896a() {
        return ObjectWrapper.m26019a(this.f19628a.getActivity());
    }

    /* renamed from: b */
    public final Bundle mo1901b() {
        return this.f19628a.getArguments();
    }

    /* renamed from: c */
    public final int mo1904c() {
        return this.f19628a.getId();
    }

    /* renamed from: d */
    public final IFragmentWrapper mo1906d() {
        return m26021a(this.f19628a.getParentFragment());
    }

    /* renamed from: e */
    public final IObjectWrapper mo1908e() {
        return ObjectWrapper.m26019a(this.f19628a.getResources());
    }

    /* renamed from: f */
    public final boolean mo1909f() {
        return this.f19628a.getRetainInstance();
    }

    /* renamed from: g */
    public final String mo1910g() {
        return this.f19628a.getTag();
    }

    /* renamed from: h */
    public final IFragmentWrapper mo1911h() {
        return m26021a(this.f19628a.getTargetFragment());
    }

    /* renamed from: i */
    public final int mo1912i() {
        return this.f19628a.getTargetRequestCode();
    }

    /* renamed from: j */
    public final boolean mo1913j() {
        return this.f19628a.getUserVisibleHint();
    }

    /* renamed from: k */
    public final IObjectWrapper mo1914k() {
        return ObjectWrapper.m26019a(this.f19628a.getView());
    }

    /* renamed from: l */
    public final boolean mo1915l() {
        return this.f19628a.isAdded();
    }

    /* renamed from: m */
    public final boolean mo1916m() {
        return this.f19628a.isDetached();
    }

    /* renamed from: n */
    public final boolean mo1917n() {
        return this.f19628a.isHidden();
    }

    /* renamed from: o */
    public final boolean mo1918o() {
        return this.f19628a.isInLayout();
    }

    /* renamed from: p */
    public final boolean mo1919p() {
        return this.f19628a.isRemoving();
    }

    /* renamed from: q */
    public final boolean mo1920q() {
        return this.f19628a.isResumed();
    }

    /* renamed from: r */
    public final boolean mo1921r() {
        return this.f19628a.isVisible();
    }

    /* renamed from: a */
    public final void mo1899a(IObjectWrapper iObjectWrapper) {
        this.f19628a.registerForContextMenu((View) ObjectWrapper.m26020a(iObjectWrapper));
    }

    /* renamed from: a */
    public final void mo1900a(boolean z) {
        this.f19628a.setHasOptionsMenu(z);
    }

    /* renamed from: b */
    public final void mo1903b(boolean z) {
        this.f19628a.setMenuVisibility(z);
    }

    /* renamed from: c */
    public final void mo1905c(boolean z) {
        this.f19628a.setRetainInstance(z);
    }

    /* renamed from: d */
    public final void mo1907d(boolean z) {
        this.f19628a.setUserVisibleHint(z);
    }

    /* renamed from: a */
    public final void mo1897a(Intent intent) {
        this.f19628a.startActivity(intent);
    }

    /* renamed from: a */
    public final void mo1898a(Intent intent, int i) {
        this.f19628a.startActivityForResult(intent, i);
    }

    /* renamed from: b */
    public final void mo1902b(IObjectWrapper iObjectWrapper) {
        this.f19628a.unregisterForContextMenu((View) ObjectWrapper.m26020a(iObjectWrapper));
    }
}
