package com.karumi.dexter;

import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;
import java.util.List;

final class MultiplePermissionListenerThreadDecorator implements MultiplePermissionsListener {
    private final MultiplePermissionsListener listener;
    private final Thread thread;

    MultiplePermissionListenerThreadDecorator(MultiplePermissionsListener multiplePermissionsListener, Thread thread) {
        this.thread = thread;
        this.listener = multiplePermissionsListener;
    }

    public void onPermissionsChecked(final MultiplePermissionsReport multiplePermissionsReport) {
        this.thread.execute(new Runnable() {
            public void run() {
                MultiplePermissionListenerThreadDecorator.this.listener.onPermissionsChecked(multiplePermissionsReport);
            }
        });
    }

    public void onPermissionRationaleShouldBeShown(final List<PermissionRequest> list, final PermissionToken permissionToken) {
        this.thread.execute(new Runnable() {
            public void run() {
                MultiplePermissionListenerThreadDecorator.this.listener.onPermissionRationaleShouldBeShown(list, permissionToken);
            }
        });
    }
}
