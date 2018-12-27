package com.karumi.dexter.listener;

public final class PermissionGrantedResponse {
    private final PermissionRequest requestedPermission;

    public PermissionGrantedResponse(PermissionRequest permissionRequest) {
        this.requestedPermission = permissionRequest;
    }

    public static PermissionGrantedResponse from(String str) {
        return new PermissionGrantedResponse(new PermissionRequest(str));
    }

    public PermissionRequest getRequestedPermission() {
        return this.requestedPermission;
    }

    public String getPermissionName() {
        return this.requestedPermission.getName();
    }
}
