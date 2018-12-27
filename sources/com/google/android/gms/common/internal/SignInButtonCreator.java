package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;

public final class SignInButtonCreator extends RemoteCreator<ISignInButtonCreator> {
    private static final SignInButtonCreator zape = new SignInButtonCreator();

    private SignInButtonCreator() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View createView(Context context, int i, int i2) {
        return zape.zaa(context, i, i2);
    }

    private final View zaa(Context context, int i, int i2) {
        try {
            SignInButtonConfig signInButtonConfig = new SignInButtonConfig(i, i2, null);
            return (View) ObjectWrapper.m26020a(((ISignInButtonCreator) getRemoteCreatorInstance(context)).newSignInButtonFromConfig(ObjectWrapper.m26019a((Object) context), signInButtonConfig));
        } catch (Context context2) {
            StringBuilder stringBuilder = new StringBuilder(64);
            stringBuilder.append("Could not get button with size ");
            stringBuilder.append(i);
            stringBuilder.append(" and color ");
            stringBuilder.append(i2);
            throw new RemoteCreatorException(stringBuilder.toString(), context2);
        }
    }

    public final ISignInButtonCreator getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        if (queryLocalInterface instanceof ISignInButtonCreator) {
            return (ISignInButtonCreator) queryLocalInterface;
        }
        return new zah(iBinder);
    }
}
