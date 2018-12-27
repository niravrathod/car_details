package com.karumi.dexter;

final class PermissionRationaleToken implements PermissionToken {
    private final DexterInstance dexterInstance;
    private boolean isTokenResolved = false;

    public PermissionRationaleToken(DexterInstance dexterInstance) {
        this.dexterInstance = dexterInstance;
    }

    public void continuePermissionRequest() {
        if (!this.isTokenResolved) {
            this.dexterInstance.onContinuePermissionRequest();
            this.isTokenResolved = true;
        }
    }

    public void cancelPermissionRequest() {
        if (!this.isTokenResolved) {
            this.dexterInstance.onCancelPermissionRequest();
            this.isTokenResolved = true;
        }
    }
}
