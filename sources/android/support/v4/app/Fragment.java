package android.support.v4.app;

import android.animation.Animator;
import android.app.Activity;
import android.arch.lifecycle.C0023f;
import android.arch.lifecycle.C0038s;
import android.arch.lifecycle.C3004g;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.p017f.C0418d;
import android.support.v4.p017f.C0433m;
import android.support.v4.view.C0545d;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class Fragment implements C0023f, ComponentCallbacks, OnCreateContextMenuListener {
    static final int ACTIVITY_CREATED = 2;
    static final int CREATED = 1;
    static final int INITIALIZING = 0;
    static final int RESUMED = 5;
    static final int STARTED = 4;
    static final int STOPPED = 3;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    private static final C0433m<String, Class<?>> sClassMap = new C0433m();
    boolean mAdded;
    C0310a mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mCalled;
    C3112m mChildFragmentManager;
    C0346n mChildNonConfig;
    ViewGroup mContainer;
    int mContainerId;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    C3112m mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    C3107k mHost;
    boolean mInLayout;
    int mIndex = -1;
    View mInnerView;
    boolean mIsCreated;
    boolean mIsNewlyAdded;
    LayoutInflater mLayoutInflater;
    C3004g mLifecycleRegistry = new C3004g(this);
    LoaderManagerImpl mLoaderManager;
    boolean mMenuVisible = true;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    float mPostponedAlpha;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetaining;
    Bundle mSavedFragmentState;
    Boolean mSavedUserVisibleHint;
    SparseArray<Parcelable> mSavedViewState;
    int mState = 0;
    String mTag;
    Fragment mTarget;
    int mTargetIndex = -1;
    int mTargetRequestCode;
    boolean mUserVisibleHint = true;
    View mView;
    C0038s mViewModelStore;
    String mWho;

    /* renamed from: android.support.v4.app.Fragment$1 */
    class C03081 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ Fragment f1065a;

        C03081(Fragment fragment) {
            this.f1065a = fragment;
        }

        public void run() {
            this.f1065a.callStartTransitionListener();
        }
    }

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exception) {
            super(str, exception);
        }
    }

    public static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new C03091();
        /* renamed from: a */
        final Bundle f1066a;

        /* renamed from: android.support.v4.app.Fragment$SavedState$1 */
        static class C03091 implements Creator<SavedState> {
            C03091() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m1107a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m1108a(i);
            }

            /* renamed from: a */
            public SavedState m1107a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState[] m1108a(int i) {
                return new SavedState[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        SavedState(Bundle bundle) {
            this.f1066a = bundle;
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            this.f1066a = parcel.readBundle();
            if (classLoader != null && this.f1066a != null) {
                this.f1066a.setClassLoader(classLoader);
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f1066a);
        }
    }

    /* renamed from: android.support.v4.app.Fragment$a */
    static class C0310a {
        /* renamed from: a */
        View f1067a;
        /* renamed from: b */
        Animator f1068b;
        /* renamed from: c */
        int f1069c;
        /* renamed from: d */
        int f1070d;
        /* renamed from: e */
        int f1071e;
        /* renamed from: f */
        int f1072f;
        /* renamed from: g */
        ac f1073g = null;
        /* renamed from: h */
        ac f1074h = null;
        /* renamed from: i */
        boolean f1075i;
        /* renamed from: j */
        C0311b f1076j;
        /* renamed from: k */
        boolean f1077k;
        /* renamed from: l */
        private Object f1078l = null;
        /* renamed from: m */
        private Object f1079m = Fragment.USE_DEFAULT_TRANSITION;
        /* renamed from: n */
        private Object f1080n = null;
        /* renamed from: o */
        private Object f1081o = Fragment.USE_DEFAULT_TRANSITION;
        /* renamed from: p */
        private Object f1082p = null;
        /* renamed from: q */
        private Object f1083q = Fragment.USE_DEFAULT_TRANSITION;
        /* renamed from: r */
        private Boolean f1084r;
        /* renamed from: s */
        private Boolean f1085s;

        C0310a() {
        }
    }

    /* renamed from: android.support.v4.app.Fragment$b */
    interface C0311b {
        /* renamed from: a */
        void mo286a();

        /* renamed from: b */
        void mo287b();
    }

    /* renamed from: android.support.v4.app.Fragment$2 */
    class C31012 extends C0329i {
        /* renamed from: a */
        final /* synthetic */ Fragment f13105a;

        C31012(Fragment fragment) {
            this.f13105a = fragment;
        }

        /* renamed from: a */
        public View mo259a(int i) {
            if (this.f13105a.mView != null) {
                return this.f13105a.mView.findViewById(i);
            }
            throw new IllegalStateException("Fragment does not have a view");
        }

        /* renamed from: a */
        public boolean mo260a() {
            return this.f13105a.mView != null;
        }

        /* renamed from: a */
        public Fragment mo258a(Context context, String str, Bundle bundle) {
            return this.f13105a.mHost.mo258a(context, str, bundle);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttachFragment(Fragment fragment) {
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void onDestroyOptionsMenu() {
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public C0038s getViewModelStore() {
        if (getContext() != null) {
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new C0038s();
            }
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        StringBuilder stringBuilder;
        try {
            Class cls = (Class) sClassMap.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                sClassMap.put(str, cls);
            }
            Fragment fragment = (Fragment) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (Context context2) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to instantiate fragment ");
            stringBuilder.append(str);
            stringBuilder.append(": make sure class name exists, is public, and has an");
            stringBuilder.append(" empty constructor that is public");
            throw new InstantiationException(stringBuilder.toString(), context2);
        } catch (Context context22) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to instantiate fragment ");
            stringBuilder.append(str);
            stringBuilder.append(": make sure class name exists, is public, and has an");
            stringBuilder.append(" empty constructor that is public");
            throw new InstantiationException(stringBuilder.toString(), context22);
        } catch (Context context222) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to instantiate fragment ");
            stringBuilder.append(str);
            stringBuilder.append(": make sure class name exists, is public, and has an");
            stringBuilder.append(" empty constructor that is public");
            throw new InstantiationException(stringBuilder.toString(), context222);
        } catch (Context context2222) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to instantiate fragment ");
            stringBuilder.append(str);
            stringBuilder.append(": could not find Fragment constructor");
            throw new InstantiationException(stringBuilder.toString(), context2222);
        } catch (Context context22222) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to instantiate fragment ");
            stringBuilder.append(str);
            stringBuilder.append(": calling Fragment constructor caused an exception");
            throw new InstantiationException(stringBuilder.toString(), context22222);
        }
    }

    static boolean isSupportFragmentClass(android.content.Context r1, java.lang.String r2) {
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
        r0 = sClassMap;	 Catch:{ ClassNotFoundException -> 0x001e }
        r0 = r0.get(r2);	 Catch:{ ClassNotFoundException -> 0x001e }
        r0 = (java.lang.Class) r0;	 Catch:{ ClassNotFoundException -> 0x001e }
        if (r0 != 0) goto L_0x0017;	 Catch:{ ClassNotFoundException -> 0x001e }
    L_0x000a:
        r1 = r1.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x001e }
        r0 = r1.loadClass(r2);	 Catch:{ ClassNotFoundException -> 0x001e }
        r1 = sClassMap;	 Catch:{ ClassNotFoundException -> 0x001e }
        r1.put(r2, r0);	 Catch:{ ClassNotFoundException -> 0x001e }
    L_0x0017:
        r1 = android.support.v4.app.Fragment.class;	 Catch:{ ClassNotFoundException -> 0x001e }
        r1 = r1.isAssignableFrom(r0);	 Catch:{ ClassNotFoundException -> 0x001e }
        return r1;
    L_0x001e:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.Fragment.isSupportFragmentClass(android.content.Context, java.lang.String):boolean");
    }

    final void restoreViewState(Bundle bundle) {
        if (this.mSavedViewState != null) {
            this.mInnerView.restoreHierarchyState(this.mSavedViewState);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append(this);
            stringBuilder.append(" did not call through to super.onViewStateRestored()");
            throw new SuperNotCalledException(stringBuilder.toString());
        }
    }

    final void setIndex(int i, Fragment fragment) {
        this.mIndex = i;
        if (fragment != null) {
            i = new StringBuilder();
            i.append(fragment.mWho);
            i.append(":");
            i.append(this.mIndex);
            this.mWho = i.toString();
            return;
        }
        i = new StringBuilder();
        i.append("android:fragment:");
        i.append(this.mIndex);
        this.mWho = i.toString();
    }

    final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        C0418d.m1535a(this, stringBuilder);
        if (this.mIndex >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.mIndex);
        }
        if (this.mFragmentId != 0) {
            stringBuilder.append(" id=0x");
            stringBuilder.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.mTag);
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final String getTag() {
        return this.mTag;
    }

    public void setArguments(Bundle bundle) {
        if (this.mIndex >= 0) {
            if (isStateSaved()) {
                throw new IllegalStateException("Fragment already active and state has been saved");
            }
        }
        this.mArguments = bundle;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final boolean isStateSaved() {
        if (this.mFragmentManager == null) {
            return false;
        }
        return this.mFragmentManager.mo307i();
    }

    public void setInitialSavedState(SavedState savedState) {
        if (this.mIndex < 0) {
            savedState = (savedState == null || savedState.f1066a == null) ? null : savedState.f1066a;
            this.mSavedFragmentState = savedState;
            return;
        }
        throw new IllegalStateException("Fragment already active");
    }

    public void setTargetFragment(Fragment fragment, int i) {
        C0334l fragmentManager = getFragmentManager();
        C0334l fragmentManager2 = fragment != null ? fragment.getFragmentManager() : null;
        if (!(fragmentManager == null || fragmentManager2 == null)) {
            if (fragmentManager != fragmentManager2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Fragment ");
                stringBuilder.append(fragment);
                stringBuilder.append(" must share the same FragmentManager to be set as a target fragment");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        Fragment fragment2 = fragment;
        while (fragment2 != null) {
            if (fragment2 != this) {
                fragment2 = fragment2.getTargetFragment();
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Setting ");
                stringBuilder.append(fragment);
                stringBuilder.append(" as the target of ");
                stringBuilder.append(this);
                stringBuilder.append(" would create a target cycle");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        this.mTarget = fragment;
        this.mTargetRequestCode = i;
    }

    public final Fragment getTargetFragment() {
        return this.mTarget;
    }

    public final int getTargetRequestCode() {
        return this.mTargetRequestCode;
    }

    public Context getContext() {
        return this.mHost == null ? null : this.mHost.m15390i();
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" not attached to a context.");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final FragmentActivity getActivity() {
        return this.mHost == null ? null : (FragmentActivity) this.mHost.m15389h();
    }

    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" not attached to an activity.");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final Object getHost() {
        return this.mHost == null ? null : this.mHost.mo3751g();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" not attached to a host.");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public final C0334l getFragmentManager() {
        return this.mFragmentManager;
    }

    public final C0334l requireFragmentManager() {
        C0334l fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            return fragmentManager;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" not associated with a fragment manager.");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final C0334l getChildFragmentManager() {
        if (this.mChildFragmentManager == null) {
            instantiateChildFragmentManager();
            if (this.mState >= 5) {
                this.mChildFragmentManager.m15519u();
            } else if (this.mState >= 4) {
                this.mChildFragmentManager.m15518t();
            } else if (this.mState >= 2) {
                this.mChildFragmentManager.m15517s();
            } else if (this.mState >= 1) {
                this.mChildFragmentManager.m15516r();
            }
        }
        return this.mChildFragmentManager;
    }

    C0334l peekChildFragmentManager() {
        return this.mChildFragmentManager;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isResumed() {
        return this.mState >= 5;
    }

    public final boolean isVisible() {
        return (!isAdded() || isHidden() || this.mView == null || this.mView.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public final boolean isHidden() {
        return this.mHidden;
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final boolean isMenuVisible() {
        return this.mMenuVisible;
    }

    public void setRetainInstance(boolean z) {
        this.mRetainInstance = z;
    }

    public final boolean getRetainInstance() {
        return this.mRetainInstance;
    }

    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (isAdded() && !isHidden()) {
                this.mHost.mo3748d();
            }
        }
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.mo3748d();
            }
        }
    }

    public void setUserVisibleHint(boolean z) {
        if (!this.mUserVisibleHint && z && this.mState < 4 && this.mFragmentManager != null && isAdded()) {
            this.mFragmentManager.m15466b(this);
        }
        this.mUserVisibleHint = z;
        z = this.mState < 4 && !z;
        this.mDeferStart = z;
        if (this.mSavedFragmentState) {
            this.mSavedUserVisibleHint = Boolean.valueOf(this.mUserVisibleHint);
        }
    }

    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public C0363u getLoaderManager() {
        if (this.mLoaderManager != null) {
            return this.mLoaderManager;
        }
        this.mLoaderManager = new LoaderManagerImpl(this, getViewModelStore());
        return this.mLoaderManager;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        if (this.mHost != null) {
            this.mHost.mo3740a(this, intent, -1, bundle);
            return;
        }
        bundle = new StringBuilder();
        bundle.append("Fragment ");
        bundle.append(this);
        bundle.append(" not attached to Activity");
        throw new IllegalStateException(bundle.toString());
    }

    public void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (this.mHost != null) {
            this.mHost.mo3740a(this, intent, i, bundle);
            return;
        }
        i = new StringBuilder();
        i.append("Fragment ");
        i.append(this);
        i.append(" not attached to Activity");
        throw new IllegalStateException(i.toString());
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (this.mHost != null) {
            r9.mHost.mo3741a(this, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" not attached to Activity");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final void requestPermissions(String[] strArr, int i) {
        if (this.mHost != null) {
            this.mHost.mo3742a(this, strArr, i);
            return;
        }
        i = new StringBuilder();
        i.append("Fragment ");
        i.append(this);
        i.append(" not attached to Activity");
        throw new IllegalStateException(i.toString());
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        return this.mHost != null ? this.mHost.mo3745a(str) : null;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public final LayoutInflater getLayoutInflater() {
        if (this.mLayoutInflater == null) {
            return performGetLayoutInflater(null);
        }
        return this.mLayoutInflater;
    }

    LayoutInflater performGetLayoutInflater(Bundle bundle) {
        this.mLayoutInflater = onGetLayoutInflater(bundle);
        return this.mLayoutInflater;
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        if (this.mHost != null) {
            bundle = this.mHost.mo3746b();
            getChildFragmentManager();
            C0545d.m2041b(bundle, this.mChildFragmentManager.m15435B());
            return bundle;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        Activity h = this.mHost == null ? null : this.mHost.m15389h();
        if (h != null) {
            this.mCalled = false;
            onInflate(h, attributeSet, bundle);
        }
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        Activity h = this.mHost == null ? null : this.mHost.m15389h();
        if (h != null) {
            this.mCalled = false;
            onAttach(h);
        }
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        if (this.mChildFragmentManager != null && this.mChildFragmentManager.m15481c(1) == null) {
            this.mChildFragmentManager.m15516r();
        }
    }

    void restoreChildFragmentState(Bundle bundle) {
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            if (parcelable != null) {
                if (this.mChildFragmentManager == null) {
                    instantiateChildFragmentManager();
                }
                this.mChildFragmentManager.m15448a(parcelable, this.mChildNonConfig);
                this.mChildNonConfig = null;
                this.mChildFragmentManager.m15516r();
            }
        }
    }

    public View getView() {
        return this.mView;
    }

    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDestroy() {
        this.mCalled = true;
        if (this.mViewModelStore != null && !this.mHost.f13142d.f13183s) {
            this.mViewModelStore.m95a();
        }
    }

    void initState() {
        this.mIndex = -1;
        this.mWho = null;
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = null;
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
        this.mRetaining = false;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        getActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    public void setEnterSharedElementCallback(ac acVar) {
        ensureAnimationInfo().f1073g = acVar;
    }

    public void setExitSharedElementCallback(ac acVar) {
        ensureAnimationInfo().f1074h = acVar;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().f1078l = obj;
    }

    public Object getEnterTransition() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        return this.mAnimationInfo.f1078l;
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().f1079m = obj;
    }

    public Object getReturnTransition() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        Object enterTransition;
        if (this.mAnimationInfo.f1079m == USE_DEFAULT_TRANSITION) {
            enterTransition = getEnterTransition();
        } else {
            enterTransition = this.mAnimationInfo.f1079m;
        }
        return enterTransition;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().f1080n = obj;
    }

    public Object getExitTransition() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        return this.mAnimationInfo.f1080n;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().f1081o = obj;
    }

    public Object getReenterTransition() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        Object exitTransition;
        if (this.mAnimationInfo.f1081o == USE_DEFAULT_TRANSITION) {
            exitTransition = getExitTransition();
        } else {
            exitTransition = this.mAnimationInfo.f1081o;
        }
        return exitTransition;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().f1082p = obj;
    }

    public Object getSharedElementEnterTransition() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        return this.mAnimationInfo.f1082p;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().f1083q = obj;
    }

    public Object getSharedElementReturnTransition() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        Object sharedElementEnterTransition;
        if (this.mAnimationInfo.f1083q == USE_DEFAULT_TRANSITION) {
            sharedElementEnterTransition = getSharedElementEnterTransition();
        } else {
            sharedElementEnterTransition = this.mAnimationInfo.f1083q;
        }
        return sharedElementEnterTransition;
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().f1085s = Boolean.valueOf(z);
    }

    public boolean getAllowEnterTransitionOverlap() {
        if (this.mAnimationInfo != null) {
            if (this.mAnimationInfo.f1085s != null) {
                return this.mAnimationInfo.f1085s.booleanValue();
            }
        }
        return true;
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().f1084r = Boolean.valueOf(z);
    }

    public boolean getAllowReturnTransitionOverlap() {
        if (this.mAnimationInfo != null) {
            if (this.mAnimationInfo.f1084r != null) {
                return this.mAnimationInfo.f1084r.booleanValue();
            }
        }
        return true;
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f1075i = true;
    }

    public void startPostponedEnterTransition() {
        if (this.mFragmentManager != null) {
            if (this.mFragmentManager.f13178m != null) {
                if (Looper.myLooper() != this.mFragmentManager.f13178m.m15391j().getLooper()) {
                    this.mFragmentManager.f13178m.m15391j().postAtFrontOfQueue(new C03081(this));
                    return;
                } else {
                    callStartTransitionListener();
                    return;
                }
            }
        }
        ensureAnimationInfo().f1075i = false;
    }

    private void callStartTransitionListener() {
        C0311b c0311b;
        if (this.mAnimationInfo == null) {
            c0311b = null;
        } else {
            this.mAnimationInfo.f1075i = false;
            c0311b = this.mAnimationInfo.f1076j;
            this.mAnimationInfo.f1076j = null;
        }
        if (c0311b != null) {
            c0311b.mo286a();
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mIndex=");
        printWriter.print(this.mIndex);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mRetaining=");
        printWriter.print(this.mRetaining);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mTarget != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.mTarget);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        if (getNextAnim() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(getNextAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (this.mInnerView != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(getStateAfterAnimating());
        }
        if (this.mLoaderManager != null) {
            printWriter.print(str);
            printWriter.println("Loader Manager:");
            LoaderManagerImpl loaderManagerImpl = this.mLoaderManager;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("  ");
            loaderManagerImpl.mo266a(stringBuilder.toString(), fileDescriptor, printWriter, strArr);
        }
        if (this.mChildFragmentManager != null) {
            printWriter.print(str);
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Child ");
            stringBuilder2.append(this.mChildFragmentManager);
            stringBuilder2.append(":");
            printWriter.println(stringBuilder2.toString());
            C3112m c3112m = this.mChildFragmentManager;
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("  ");
            c3112m.mo297a(stringBuilder.toString(), fileDescriptor, printWriter, strArr);
        }
    }

    Fragment findFragmentByWho(String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        return this.mChildFragmentManager != null ? this.mChildFragmentManager.m15464b(str) : null;
    }

    void instantiateChildFragmentManager() {
        if (this.mHost != null) {
            this.mChildFragmentManager = new C3112m();
            this.mChildFragmentManager.m15454a(this.mHost, new C31012(this), this);
            return;
        }
        throw new IllegalStateException("Fragment has not been attached yet.");
    }

    void performCreate(Bundle bundle) {
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.m15515q();
        }
        this.mState = 1;
        this.mCalled = false;
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled != null) {
            this.mLifecycleRegistry.m14718a(Event.ON_CREATE);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" did not call through to super.onCreate()");
        throw new SuperNotCalledException(stringBuilder.toString());
    }

    View performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.m15515q();
        }
        this.mPerformedCreateView = true;
        return onCreateView(layoutInflater, viewGroup, bundle);
    }

    void performActivityCreated(Bundle bundle) {
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.m15515q();
        }
        this.mState = 2;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append(this);
            stringBuilder.append(" did not call through to super.onActivityCreated()");
            throw new SuperNotCalledException(stringBuilder.toString());
        } else if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.m15517s();
        }
    }

    void performStart() {
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.m15515q();
            this.mChildFragmentManager.m15504k();
        }
        this.mState = 4;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.m15518t();
            }
            this.mLifecycleRegistry.m14718a(Event.ON_START);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" did not call through to super.onStart()");
        throw new SuperNotCalledException(stringBuilder.toString());
    }

    void performResume() {
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.m15515q();
            this.mChildFragmentManager.m15504k();
        }
        this.mState = 5;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.m15519u();
                this.mChildFragmentManager.m15504k();
            }
            this.mLifecycleRegistry.m14718a(Event.ON_RESUME);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" did not call through to super.onResume()");
        throw new SuperNotCalledException(stringBuilder.toString());
    }

    void noteStateNotSaved() {
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.m15515q();
        }
    }

    void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.m15459a(z);
        }
    }

    void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.m15474b(z);
        }
    }

    void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.m15446a(configuration);
        }
    }

    void performLowMemory() {
        onLowMemory();
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.m15434A();
        }
    }

    boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onCreateOptionsMenu(menu, menuInflater);
        }
        return this.mChildFragmentManager != null ? z | this.mChildFragmentManager.m15461a(menu, menuInflater) : z;
    }

    boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onPrepareOptionsMenu(menu);
        }
        return this.mChildFragmentManager != null ? z | this.mChildFragmentManager.m15460a(menu) : z;
    }

    boolean performOptionsItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
                return true;
            }
            if (!(this.mChildFragmentManager == null || this.mChildFragmentManager.m15462a(menuItem) == null)) {
                return true;
            }
        }
        return null;
    }

    boolean performContextItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            if (onContextItemSelected(menuItem)) {
                return true;
            }
            if (!(this.mChildFragmentManager == null || this.mChildFragmentManager.m15476b(menuItem) == null)) {
                return true;
            }
        }
        return null;
    }

    void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.m15473b(menu);
            }
        }
    }

    void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        if (this.mChildFragmentManager != null) {
            Parcelable p = this.mChildFragmentManager.m15513p();
            if (p != null) {
                bundle.putParcelable("android:support:fragments", p);
            }
        }
    }

    void performPause() {
        this.mLifecycleRegistry.m14718a(Event.ON_PAUSE);
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.m15520v();
        }
        this.mState = 4;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append(this);
            stringBuilder.append(" did not call through to super.onPause()");
            throw new SuperNotCalledException(stringBuilder.toString());
        }
    }

    void performStop() {
        this.mLifecycleRegistry.m14718a(Event.ON_STOP);
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.m15521w();
        }
        this.mState = 3;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append(this);
            stringBuilder.append(" did not call through to super.onStop()");
            throw new SuperNotCalledException(stringBuilder.toString());
        }
    }

    void performReallyStop() {
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.m15522x();
        }
        this.mState = 2;
    }

    void performDestroyView() {
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.m15523y();
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            if (this.mLoaderManager != null) {
                this.mLoaderManager.m15329a();
            }
            this.mPerformedCreateView = false;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" did not call through to super.onDestroyView()");
        throw new SuperNotCalledException(stringBuilder.toString());
    }

    void performDestroy() {
        this.mLifecycleRegistry.m14718a(Event.ON_DESTROY);
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.m15524z();
        }
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            this.mChildFragmentManager = null;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" did not call through to super.onDestroy()");
        throw new SuperNotCalledException(stringBuilder.toString());
    }

    void performDetach() {
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        StringBuilder stringBuilder;
        if (!this.mCalled) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append(this);
            stringBuilder.append(" did not call through to super.onDetach()");
            throw new SuperNotCalledException(stringBuilder.toString());
        } else if (this.mChildFragmentManager == null) {
        } else {
            if (this.mRetaining) {
                this.mChildFragmentManager.m15524z();
                this.mChildFragmentManager = null;
                return;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Child FragmentManager of ");
            stringBuilder.append(this);
            stringBuilder.append(" was not ");
            stringBuilder.append(" destroyed and this fragment is not retaining instance");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    void setOnStartEnterTransitionListener(C0311b c0311b) {
        ensureAnimationInfo();
        if (c0311b != this.mAnimationInfo.f1076j) {
            if (c0311b != null) {
                if (this.mAnimationInfo.f1076j != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Trying to set a replacement startPostponedEnterTransition on ");
                    stringBuilder.append(this);
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
            if (this.mAnimationInfo.f1075i) {
                this.mAnimationInfo.f1076j = c0311b;
            }
            if (c0311b != null) {
                c0311b.mo287b();
            }
        }
    }

    private C0310a ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new C0310a();
        }
        return this.mAnimationInfo;
    }

    int getNextAnim() {
        if (this.mAnimationInfo == null) {
            return 0;
        }
        return this.mAnimationInfo.f1070d;
    }

    void setNextAnim(int i) {
        if (this.mAnimationInfo != null || i != 0) {
            ensureAnimationInfo().f1070d = i;
        }
    }

    int getNextTransition() {
        if (this.mAnimationInfo == null) {
            return 0;
        }
        return this.mAnimationInfo.f1071e;
    }

    void setNextTransition(int i, int i2) {
        if (this.mAnimationInfo != null || i != 0 || i2 != 0) {
            ensureAnimationInfo();
            this.mAnimationInfo.f1071e = i;
            this.mAnimationInfo.f1072f = i2;
        }
    }

    int getNextTransitionStyle() {
        if (this.mAnimationInfo == null) {
            return 0;
        }
        return this.mAnimationInfo.f1072f;
    }

    ac getEnterTransitionCallback() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        return this.mAnimationInfo.f1073g;
    }

    ac getExitTransitionCallback() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        return this.mAnimationInfo.f1074h;
    }

    View getAnimatingAway() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        return this.mAnimationInfo.f1067a;
    }

    void setAnimatingAway(View view) {
        ensureAnimationInfo().f1067a = view;
    }

    void setAnimator(Animator animator) {
        ensureAnimationInfo().f1068b = animator;
    }

    Animator getAnimator() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        return this.mAnimationInfo.f1068b;
    }

    int getStateAfterAnimating() {
        if (this.mAnimationInfo == null) {
            return 0;
        }
        return this.mAnimationInfo.f1069c;
    }

    void setStateAfterAnimating(int i) {
        ensureAnimationInfo().f1069c = i;
    }

    boolean isPostponed() {
        if (this.mAnimationInfo == null) {
            return false;
        }
        return this.mAnimationInfo.f1075i;
    }

    boolean isHideReplaced() {
        if (this.mAnimationInfo == null) {
            return false;
        }
        return this.mAnimationInfo.f1077k;
    }

    void setHideReplaced(boolean z) {
        ensureAnimationInfo().f1077k = z;
    }
}
