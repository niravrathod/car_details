package com.karumi.dexter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.EmptyMultiplePermissionsListener;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;
import com.karumi.dexter.listener.single.PermissionListener;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;

final class DexterInstance {
    private static final MultiplePermissionsListener EMPTY_LISTENER = new EmptyMultiplePermissionsListener();
    private static final int PERMISSIONS_REQUEST_CODE = 42;
    private Activity activity;
    private final AndroidPermissionService androidPermissionService;
    private final Context context;
    private final IntentProvider intentProvider;
    private final AtomicBoolean isRequestingPermission;
    private MultiplePermissionsListener listener = EMPTY_LISTENER;
    private final MultiplePermissionsReport multiplePermissionsReport;
    private final Collection<String> pendingPermissions;
    private final Object pendingPermissionsMutex = new Object();
    private final AtomicBoolean rationaleAccepted;

    private final class PermissionStates {
        private final Collection<String> deniedPermissions;
        private final Collection<String> grantedPermissions;

        private PermissionStates() {
            this.deniedPermissions = new LinkedList();
            this.grantedPermissions = new LinkedList();
        }

        private void addDeniedPermission(String str) {
            this.deniedPermissions.add(str);
        }

        private void addGrantedPermission(String str) {
            this.grantedPermissions.add(str);
        }

        private Collection<String> getDeniedPermissions() {
            return this.deniedPermissions;
        }

        private Collection<String> getGrantedPermissions() {
            return this.grantedPermissions;
        }
    }

    DexterInstance(Context context, AndroidPermissionService androidPermissionService, IntentProvider intentProvider) {
        this.context = context.getApplicationContext();
        this.androidPermissionService = androidPermissionService;
        this.intentProvider = intentProvider;
        this.pendingPermissions = new TreeSet();
        this.multiplePermissionsReport = new MultiplePermissionsReport();
        this.isRequestingPermission = new AtomicBoolean();
        this.rationaleAccepted = new AtomicBoolean();
    }

    void checkPermission(PermissionListener permissionListener, String str, Thread thread) {
        checkSinglePermission(permissionListener, str, thread);
    }

    void checkPermissions(MultiplePermissionsListener multiplePermissionsListener, Collection<String> collection, Thread thread) {
        checkMultiplePermissions(multiplePermissionsListener, collection, thread);
    }

    void continuePendingRequestIfPossible(PermissionListener permissionListener, Thread thread) {
        continuePendingRequestsIfPossible(new MultiplePermissionsListenerToPermissionListenerAdapter(permissionListener), thread);
    }

    void continuePendingRequestsIfPossible(MultiplePermissionsListener multiplePermissionsListener, Thread thread) {
        if (!this.pendingPermissions.isEmpty()) {
            this.listener = new MultiplePermissionListenerThreadDecorator(multiplePermissionsListener, thread);
            if (this.rationaleAccepted.get() == null) {
                onActivityReady(this.activity);
            }
        }
    }

    void onActivityReady(Activity activity) {
        this.activity = activity;
        synchronized (this.pendingPermissionsMutex) {
            activity = activity != null ? getPermissionStates(this.pendingPermissions) : null;
        }
        if (activity != null) {
            handleDeniedPermissions(activity.getDeniedPermissions());
            updatePermissionsAsGranted(activity.getGrantedPermissions());
        }
    }

    void onPermissionRequestGranted(Collection<String> collection) {
        updatePermissionsAsGranted(collection);
    }

    void onPermissionRequestDenied(Collection<String> collection) {
        updatePermissionsAsDenied(collection);
    }

    void onContinuePermissionRequest() {
        this.rationaleAccepted.set(true);
        requestPermissionsToSystem(this.pendingPermissions);
    }

    void onCancelPermissionRequest() {
        this.rationaleAccepted.set(false);
        updatePermissionsAsDenied(this.pendingPermissions);
    }

    boolean isRequestOngoing() {
        return this.isRequestingPermission.get();
    }

    void requestPermissionsToSystem(Collection<String> collection) {
        this.androidPermissionService.requestPermissions(this.activity, (String[]) collection.toArray(new String[collection.size()]), 42);
    }

    private PermissionStates getPermissionStates(Collection<String> collection) {
        PermissionStates permissionStates = new PermissionStates();
        for (String str : collection) {
            if (checkSelfPermission(this.activity, str) != -1) {
                permissionStates.addGrantedPermission(str);
            } else {
                permissionStates.addDeniedPermission(str);
            }
        }
        return permissionStates;
    }

    private int checkSelfPermission(android.app.Activity r2, java.lang.String r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r1 = this;
        r0 = r1.androidPermissionService;	 Catch:{ RuntimeException -> 0x0007 }
        r2 = r0.checkSelfPermission(r2, r3);	 Catch:{ RuntimeException -> 0x0007 }
        return r2;
    L_0x0007:
        r2 = -1;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.karumi.dexter.DexterInstance.checkSelfPermission(android.app.Activity, java.lang.String):int");
    }

    private void startTransparentActivityIfNeeded() {
        Intent intent = this.intentProvider.get(this.context, DexterActivity.class);
        intent.addFlags(268435456);
        this.context.startActivity(intent);
    }

    private void handleDeniedPermissions(Collection<String> collection) {
        if (!collection.isEmpty()) {
            List linkedList = new LinkedList();
            for (String str : collection) {
                if (this.androidPermissionService.shouldShowRequestPermissionRationale(this.activity, str)) {
                    linkedList.add(new PermissionRequest(str));
                }
            }
            if (linkedList.isEmpty()) {
                requestPermissionsToSystem(collection);
            } else if (this.rationaleAccepted.get() == null) {
                this.listener.onPermissionRationaleShouldBeShown(linkedList, new PermissionRationaleToken(this));
            }
        }
    }

    private void updatePermissionsAsGranted(Collection<String> collection) {
        for (String from : collection) {
            this.multiplePermissionsReport.addGrantedPermissionResponse(PermissionGrantedResponse.from(from));
        }
        onPermissionsChecked(collection);
    }

    private void updatePermissionsAsDenied(Collection<String> collection) {
        for (String str : collection) {
            this.multiplePermissionsReport.addDeniedPermissionResponse(PermissionDeniedResponse.from(str, this.androidPermissionService.shouldShowRequestPermissionRationale(this.activity, str) ^ 1));
        }
        onPermissionsChecked(collection);
    }

    private void onPermissionsChecked(Collection<String> collection) {
        if (!this.pendingPermissions.isEmpty()) {
            synchronized (this.pendingPermissionsMutex) {
                this.pendingPermissions.removeAll(collection);
                if (this.pendingPermissions.isEmpty() != null) {
                    this.activity.finish();
                    this.activity = null;
                    this.isRequestingPermission.set(false);
                    this.rationaleAccepted.set(false);
                    collection = this.listener;
                    this.listener = EMPTY_LISTENER;
                    collection.onPermissionsChecked(this.multiplePermissionsReport);
                }
            }
        }
    }

    private void checkNoDexterRequestOngoing() {
        if (this.isRequestingPermission.getAndSet(true)) {
            throw new IllegalStateException("Only one Dexter request at a time is allowed");
        }
    }

    private void checkRequestSomePermission(Collection<String> collection) {
        if (collection.isEmpty() != null) {
            throw new IllegalStateException("Dexter has to be called with at least one permission");
        }
    }

    private void checkSinglePermission(PermissionListener permissionListener, String str, Thread thread) {
        checkMultiplePermissions(new MultiplePermissionsListenerToPermissionListenerAdapter(permissionListener), Collections.singleton(str), thread);
    }

    private void checkMultiplePermissions(MultiplePermissionsListener multiplePermissionsListener, Collection<String> collection, Thread thread) {
        checkNoDexterRequestOngoing();
        checkRequestSomePermission(collection);
        this.pendingPermissions.clear();
        this.pendingPermissions.addAll(collection);
        this.multiplePermissionsReport.clear();
        this.listener = new MultiplePermissionListenerThreadDecorator(multiplePermissionsListener, thread);
        startTransparentActivityIfNeeded();
        thread.loop();
    }
}
