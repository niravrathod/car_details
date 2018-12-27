package com.karumi.dexter.listener;

public final class PermissionRequest {
    private final String name;

    public PermissionRequest(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Permission name: ");
        stringBuilder.append(this.name);
        return stringBuilder.toString();
    }
}
