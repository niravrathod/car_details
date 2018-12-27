package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.support.v4.app.C0334l;
import android.support.v4.app.C4432h;
import com.google.android.gms.common.internal.Preconditions;

public class SupportErrorDialogFragment extends C4432h {
    private Dialog mDialog = null;
    private OnCancelListener zaan = null;

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.mDialog == null) {
            setShowsDialog(null);
        }
        return this.mDialog;
    }

    public void onCancel(DialogInterface dialogInterface) {
        if (this.zaan != null) {
            this.zaan.onCancel(dialogInterface);
        }
    }

    public static SupportErrorDialogFragment newInstance(Dialog dialog) {
        return newInstance(dialog, null);
    }

    public static SupportErrorDialogFragment newInstance(Dialog dialog, OnCancelListener onCancelListener) {
        SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
        dialog = (Dialog) Preconditions.checkNotNull(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        supportErrorDialogFragment.mDialog = dialog;
        if (onCancelListener != null) {
            supportErrorDialogFragment.zaan = onCancelListener;
        }
        return supportErrorDialogFragment;
    }

    public void show(C0334l c0334l, String str) {
        super.show(c0334l, str);
    }
}
