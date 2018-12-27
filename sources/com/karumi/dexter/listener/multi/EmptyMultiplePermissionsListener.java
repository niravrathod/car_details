package com.karumi.dexter.listener.multi;

import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionRequest;
import java.util.List;

public class EmptyMultiplePermissionsListener implements MultiplePermissionsListener {
    public void onPermissionRationaleShouldBeShown(List<PermissionRequest> list, PermissionToken permissionToken) {
    }

    public void onPermissionsChecked(MultiplePermissionsReport multiplePermissionsReport) {
    }
}
