package com.karumi.dexter.listener.multi;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.support.design.widget.Snackbar.C3054a;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.karumi.dexter.MultiplePermissionsReport;

public class SnackbarOnAnyDeniedMultiplePermissionsListener extends EmptyMultiplePermissionsListener {
    private final String buttonText;
    private final OnClickListener onButtonClickListener;
    private final ViewGroup rootView;
    private final C3054a snackbarCallback;
    private final String text;

    public static class Builder {
        private String buttonText;
        private OnClickListener onClickListener;
        private final ViewGroup rootView;
        private C3054a snackbarCallback;
        private final String text;

        /* renamed from: com.karumi.dexter.listener.multi.SnackbarOnAnyDeniedMultiplePermissionsListener$Builder$1 */
        class C26821 implements OnClickListener {
            C26821() {
            }

            public void onClick(View view) {
                view = Builder.this.rootView.getContext();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("package:");
                stringBuilder.append(view.getPackageName());
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse(stringBuilder.toString()));
                intent.addCategory("android.intent.category.DEFAULT");
                intent.setFlags(268435456);
                view.startActivity(intent);
            }
        }

        private Builder(ViewGroup viewGroup, String str) {
            this.rootView = viewGroup;
            this.text = str;
        }

        public static Builder with(ViewGroup viewGroup, String str) {
            return new Builder(viewGroup, str);
        }

        public static Builder with(ViewGroup viewGroup, int i) {
            return with(viewGroup, viewGroup.getContext().getString(i));
        }

        public Builder withButton(String str, OnClickListener onClickListener) {
            this.buttonText = str;
            this.onClickListener = onClickListener;
            return this;
        }

        public Builder withButton(int i, OnClickListener onClickListener) {
            return withButton(this.rootView.getContext().getString(i), onClickListener);
        }

        public Builder withOpenSettingsButton(String str) {
            this.buttonText = str;
            this.onClickListener = new C26821();
            return this;
        }

        public Builder withOpenSettingsButton(int i) {
            return withOpenSettingsButton(this.rootView.getContext().getString(i));
        }

        public Builder withCallback(C3054a c3054a) {
            this.snackbarCallback = c3054a;
            return this;
        }

        public SnackbarOnAnyDeniedMultiplePermissionsListener build() {
            return new SnackbarOnAnyDeniedMultiplePermissionsListener(this.rootView, this.text, this.buttonText, this.onClickListener, this.snackbarCallback);
        }
    }

    private SnackbarOnAnyDeniedMultiplePermissionsListener(ViewGroup viewGroup, String str, String str2, OnClickListener onClickListener, C3054a c3054a) {
        this.rootView = viewGroup;
        this.text = str;
        this.buttonText = str2;
        this.onButtonClickListener = onClickListener;
        this.snackbarCallback = c3054a;
    }

    public void onPermissionsChecked(MultiplePermissionsReport multiplePermissionsReport) {
        super.onPermissionsChecked(multiplePermissionsReport);
        if (multiplePermissionsReport.areAllPermissionsGranted() == null) {
            showSnackbar();
        }
    }

    private void showSnackbar() {
        Snackbar a = Snackbar.m14993a(this.rootView, this.text, 0);
        if (!(this.buttonText == null || this.onButtonClickListener == null)) {
            a.m14997a(this.buttonText, this.onButtonClickListener);
        }
        if (this.snackbarCallback != null) {
            a.m14995a(this.snackbarCallback);
        }
        a.m683a();
    }
}
