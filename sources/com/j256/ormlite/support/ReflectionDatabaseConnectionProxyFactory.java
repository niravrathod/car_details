package com.j256.ormlite.support;

import com.j256.ormlite.misc.SqlExceptionUtil;
import java.lang.reflect.Constructor;

public class ReflectionDatabaseConnectionProxyFactory implements DatabaseConnectionProxyFactory {
    private final Constructor<? extends DatabaseConnection> constructor;
    private final Class<? extends DatabaseConnection> proxyClass;

    public ReflectionDatabaseConnectionProxyFactory(java.lang.Class<? extends com.j256.ormlite.support.DatabaseConnection> r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r3.<init>();
        r3.proxyClass = r4;
        r0 = 1;
        r0 = new java.lang.Class[r0];	 Catch:{ Exception -> 0x0014 }
        r1 = 0;	 Catch:{ Exception -> 0x0014 }
        r2 = com.j256.ormlite.support.DatabaseConnection.class;	 Catch:{ Exception -> 0x0014 }
        r0[r1] = r2;	 Catch:{ Exception -> 0x0014 }
        r0 = r4.getConstructor(r0);	 Catch:{ Exception -> 0x0014 }
        r3.constructor = r0;	 Catch:{ Exception -> 0x0014 }
        return;
    L_0x0014:
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Could not find constructor with DatabaseConnection argument in ";
        r1.append(r2);
        r1.append(r4);
        r4 = r1.toString();
        r0.<init>(r4);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.support.ReflectionDatabaseConnectionProxyFactory.<init>(java.lang.Class):void");
    }

    public DatabaseConnection createProxy(DatabaseConnection databaseConnection) {
        try {
            return (DatabaseConnection) this.constructor.newInstance(new Object[]{databaseConnection});
        } catch (DatabaseConnection databaseConnection2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not create a new instance of ");
            stringBuilder.append(this.proxyClass);
            throw SqlExceptionUtil.create(stringBuilder.toString(), databaseConnection2);
        }
    }
}
