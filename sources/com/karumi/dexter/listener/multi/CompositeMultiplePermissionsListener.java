package com.karumi.dexter.listener.multi;

import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionRequest;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CompositeMultiplePermissionsListener implements MultiplePermissionsListener {
    private final Collection<MultiplePermissionsListener> listeners;

    public CompositeMultiplePermissionsListener(MultiplePermissionsListener... multiplePermissionsListenerArr) {
        this(Arrays.asList(multiplePermissionsListenerArr));
    }

    public CompositeMultiplePermissionsListener(Collection<MultiplePermissionsListener> collection) {
        this.listeners = collection;
    }

    public void onPermissionsChecked(MultiplePermissionsReport multiplePermissionsReport) {
        for (MultiplePermissionsListener onPermissionsChecked : this.listeners) {
            onPermissionsChecked.onPermissionsChecked(multiplePermissionsReport);
        }
    }

    public void onPermissionRationaleShouldBeShown(List<PermissionRequest> list, PermissionToken permissionToken) {
        for (MultiplePermissionsListener onPermissionRationaleShouldBeShown : this.listeners) {
            onPermissionRationaleShouldBeShown.onPermissionRationaleShouldBeShown(list, permissionToken);
        }
    }
}
