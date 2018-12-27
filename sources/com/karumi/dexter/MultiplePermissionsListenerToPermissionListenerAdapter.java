package com.karumi.dexter;

import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;
import com.karumi.dexter.listener.single.PermissionListener;
import java.util.List;

final class MultiplePermissionsListenerToPermissionListenerAdapter implements MultiplePermissionsListener {
    private final PermissionListener listener;

    public MultiplePermissionsListenerToPermissionListenerAdapter(PermissionListener permissionListener) {
        this.listener = permissionListener;
    }

    public void onPermissionsChecked(MultiplePermissionsReport multiplePermissionsReport) {
        List deniedPermissionResponses = multiplePermissionsReport.getDeniedPermissionResponses();
        multiplePermissionsReport = multiplePermissionsReport.getGrantedPermissionResponses();
        if (deniedPermissionResponses.isEmpty()) {
            this.listener.onPermissionGranted((PermissionGrantedResponse) multiplePermissionsReport.get(0));
            return;
        }
        this.listener.onPermissionDenied((PermissionDeniedResponse) deniedPermissionResponses.get(0));
    }

    public void onPermissionRationaleShouldBeShown(List<PermissionRequest> list, PermissionToken permissionToken) {
        this.listener.onPermissionRationaleShouldBeShown((PermissionRequest) list.get(0), permissionToken);
    }
}
