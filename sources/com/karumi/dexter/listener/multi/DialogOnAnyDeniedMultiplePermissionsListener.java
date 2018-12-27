package com.karumi.dexter.listener.multi;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.drawable.Drawable;
import com.karumi.dexter.MultiplePermissionsReport;

public class DialogOnAnyDeniedMultiplePermissionsListener extends EmptyMultiplePermissionsListener {
    private final Context context;
    private final Drawable icon;
    private final String message;
    private final String positiveButtonText;
    private final String title;

    /* renamed from: com.karumi.dexter.listener.multi.DialogOnAnyDeniedMultiplePermissionsListener$1 */
    class C26801 implements OnClickListener {
        C26801() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public static class Builder {
        private String buttonText;
        private final Context context;
        private Drawable icon;
        private String message;
        private String title;

        private Builder(Context context) {
            this.context = context;
        }

        public static Builder withContext(Context context) {
            return new Builder(context);
        }

        public Builder withTitle(String str) {
            this.title = str;
            return this;
        }

        public Builder withTitle(int i) {
            this.title = this.context.getString(i);
            return this;
        }

        public Builder withMessage(String str) {
            this.message = str;
            return this;
        }

        public Builder withMessage(int i) {
            this.message = this.context.getString(i);
            return this;
        }

        public Builder withButtonText(String str) {
            this.buttonText = str;
            return this;
        }

        public Builder withButtonText(int i) {
            this.buttonText = this.context.getString(i);
            return this;
        }

        public Builder withIcon(Drawable drawable) {
            this.icon = drawable;
            return this;
        }

        public Builder withIcon(int i) {
            this.icon = this.context.getResources().getDrawable(i);
            return this;
        }

        public DialogOnAnyDeniedMultiplePermissionsListener build() {
            return new DialogOnAnyDeniedMultiplePermissionsListener(this.context, this.title == null ? "" : this.title, this.message == null ? "" : this.message, this.buttonText == null ? "" : this.buttonText, this.icon);
        }
    }

    private DialogOnAnyDeniedMultiplePermissionsListener(Context context, String str, String str2, String str3, Drawable drawable) {
        this.context = context;
        this.title = str;
        this.message = str2;
        this.positiveButtonText = str3;
        this.icon = drawable;
    }

    public void onPermissionsChecked(MultiplePermissionsReport multiplePermissionsReport) {
        super.onPermissionsChecked(multiplePermissionsReport);
        if (multiplePermissionsReport.areAllPermissionsGranted() == null) {
            showDialog();
        }
    }

    private void showDialog() {
        new android.app.AlertDialog.Builder(this.context).setTitle(this.title).setMessage(this.message).setPositiveButton(this.positiveButtonText, new C26801()).setIcon(this.icon).show();
    }
}
