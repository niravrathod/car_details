package com.karumi.dexter;

import android.app.Activity;
import android.content.Context;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;
import com.karumi.dexter.listener.single.PermissionListener;
import java.util.Arrays;
import java.util.Collection;

public final class Dexter {
    private static DexterInstance instance;

    public static void initialize(Context context) {
        if (instance == null) {
            instance = new DexterInstance(context, new AndroidPermissionService(), new IntentProvider());
        }
    }

    public static void checkPermissionOnSameThread(PermissionListener permissionListener, String str) {
        checkInstanceNotNull();
        instance.checkPermission(permissionListener, str, ThreadFactory.makeSameThread());
    }

    public static void checkPermission(PermissionListener permissionListener, String str) {
        checkInstanceNotNull();
        instance.checkPermission(permissionListener, str, ThreadFactory.makeMainThread());
    }

    public static void checkPermissionsOnSameThread(MultiplePermissionsListener multiplePermissionsListener, String... strArr) {
        checkInstanceNotNull();
        instance.checkPermissions(multiplePermissionsListener, Arrays.asList(strArr), ThreadFactory.makeSameThread());
    }

    public static void checkPermissions(MultiplePermissionsListener multiplePermissionsListener, String... strArr) {
        checkInstanceNotNull();
        instance.checkPermissions(multiplePermissionsListener, Arrays.asList(strArr), ThreadFactory.makeMainThread());
    }

    public static void checkPermissions(MultiplePermissionsListener multiplePermissionsListener, Collection<String> collection) {
        checkInstanceNotNull();
        instance.checkPermissions(multiplePermissionsListener, collection, ThreadFactory.makeMainThread());
    }

    public static boolean isRequestOngoing() {
        checkInstanceNotNull();
        return instance.isRequestOngoing();
    }

    public static void continuePendingRequestsIfPossible(MultiplePermissionsListener multiplePermissionsListener) {
        checkInstanceNotNull();
        instance.continuePendingRequestsIfPossible(multiplePermissionsListener, ThreadFactory.makeMainThread());
    }

    public static void continuePendingRequestIfPossible(PermissionListener permissionListener) {
        checkInstanceNotNull();
        instance.continuePendingRequestIfPossible(permissionListener, ThreadFactory.makeMainThread());
    }

    private static void checkInstanceNotNull() {
        if (instance == null) {
            throw new NullPointerException("context == null \n Must call \"initialize\" on Dexter");
        }
    }

    static void onActivityReady(Activity activity) {
        instance.onActivityReady(activity);
    }

    static void onPermissionsRequested(Collection<String> collection, Collection<String> collection2) {
        instance.onPermissionRequestGranted(collection);
        instance.onPermissionRequestDenied(collection2);
    }
}
