package com.j256.ormlite.misc;

import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.support.DatabaseConnection;
import java.sql.Savepoint;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public class TransactionManager {
    private static final String SAVE_POINT_PREFIX = "ORMLITE";
    private static final Logger logger = LoggerFactory.getLogger(TransactionManager.class);
    private static AtomicInteger savePointCounter = new AtomicInteger();
    private ConnectionSource connectionSource;

    public TransactionManager(ConnectionSource connectionSource) {
        this.connectionSource = connectionSource;
        initialize();
    }

    public void initialize() {
        if (this.connectionSource == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dataSource was not set on ");
            stringBuilder.append(getClass().getSimpleName());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public <T> T callInTransaction(Callable<T> callable) {
        return callInTransaction(this.connectionSource, callable);
    }

    public static <T> T callInTransaction(ConnectionSource connectionSource, Callable<T> callable) {
        DatabaseConnection readWriteConnection = connectionSource.getReadWriteConnection();
        try {
            callable = callInTransaction(readWriteConnection, connectionSource.saveSpecialConnection(readWriteConnection), connectionSource.getDatabaseType(), callable);
            return callable;
        } finally {
            connectionSource.clearSpecialConnection(readWriteConnection);
            connectionSource.releaseConnection(readWriteConnection);
        }
    }

    public static <T> T callInTransaction(DatabaseConnection databaseConnection, DatabaseType databaseType, Callable<T> callable) {
        return callInTransaction(databaseConnection, false, databaseType, callable);
    }

    public static <T> T callInTransaction(com.j256.ormlite.support.DatabaseConnection r4, boolean r5, com.j256.ormlite.db.DatabaseType r6, java.util.concurrent.Callable<T> r7) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r0 = 0;
        r1 = 1;
        r2 = 0;
        if (r5 != 0) goto L_0x0011;
    L_0x0005:
        r5 = r6.isNestedSavePointsSupported();	 Catch:{ all -> 0x000e }
        if (r5 == 0) goto L_0x000c;	 Catch:{ all -> 0x000e }
    L_0x000b:
        goto L_0x0011;	 Catch:{ all -> 0x000e }
    L_0x000c:
        r5 = 0;	 Catch:{ all -> 0x000e }
        goto L_0x005a;	 Catch:{ all -> 0x000e }
    L_0x000e:
        r5 = move-exception;	 Catch:{ all -> 0x000e }
        goto L_0x0098;	 Catch:{ all -> 0x000e }
    L_0x0011:
        r5 = r4.isAutoCommitSupported();	 Catch:{ all -> 0x000e }
        if (r5 == 0) goto L_0x0028;	 Catch:{ all -> 0x000e }
    L_0x0017:
        r5 = r4.isAutoCommit();	 Catch:{ all -> 0x000e }
        if (r5 == 0) goto L_0x0027;
    L_0x001d:
        r4.setAutoCommit(r2);	 Catch:{ all -> 0x0070 }
        r6 = logger;	 Catch:{ all -> 0x0070 }
        r0 = "had to set auto-commit to false";	 Catch:{ all -> 0x0070 }
        r6.debug(r0);	 Catch:{ all -> 0x0070 }
    L_0x0027:
        r2 = r5;
    L_0x0028:
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x000e }
        r5.<init>();	 Catch:{ all -> 0x000e }
        r6 = "ORMLITE";	 Catch:{ all -> 0x000e }
        r5.append(r6);	 Catch:{ all -> 0x000e }
        r6 = savePointCounter;	 Catch:{ all -> 0x000e }
        r6 = r6.incrementAndGet();	 Catch:{ all -> 0x000e }
        r5.append(r6);	 Catch:{ all -> 0x000e }
        r5 = r5.toString();	 Catch:{ all -> 0x000e }
        r0 = r4.setSavePoint(r5);	 Catch:{ all -> 0x000e }
        if (r0 != 0) goto L_0x004d;	 Catch:{ all -> 0x000e }
    L_0x0045:
        r5 = logger;	 Catch:{ all -> 0x000e }
        r6 = "started savePoint transaction";	 Catch:{ all -> 0x000e }
        r5.debug(r6);	 Catch:{ all -> 0x000e }
        goto L_0x0058;	 Catch:{ all -> 0x000e }
    L_0x004d:
        r5 = logger;	 Catch:{ all -> 0x000e }
        r6 = "started savePoint transaction {}";	 Catch:{ all -> 0x000e }
        r3 = r0.getSavepointName();	 Catch:{ all -> 0x000e }
        r5.debug(r6, r3);	 Catch:{ all -> 0x000e }
    L_0x0058:
        r5 = r2;
        r2 = 1;
    L_0x005a:
        r6 = r7.call();	 Catch:{ SQLException -> 0x0089, Exception -> 0x0074 }
        if (r2 == 0) goto L_0x0063;	 Catch:{ SQLException -> 0x0089, Exception -> 0x0074 }
    L_0x0060:
        commit(r4, r0);	 Catch:{ SQLException -> 0x0089, Exception -> 0x0074 }
    L_0x0063:
        if (r5 == 0) goto L_0x006f;
    L_0x0065:
        r4.setAutoCommit(r1);
        r4 = logger;
        r5 = "restored auto-commit to true";
        r4.debug(r5);
    L_0x006f:
        return r6;
    L_0x0070:
        r6 = move-exception;
        r2 = r5;
        r5 = r6;
        goto L_0x0098;
    L_0x0074:
        r6 = move-exception;
        if (r2 == 0) goto L_0x0082;
    L_0x0077:
        rollBack(r4, r0);	 Catch:{ SQLException -> 0x007b }
        goto L_0x0082;
    L_0x007b:
        r7 = logger;	 Catch:{ all -> 0x0070 }
        r0 = "after commit exception, rolling back to save-point also threw exception";	 Catch:{ all -> 0x0070 }
        r7.error(r6, r0);	 Catch:{ all -> 0x0070 }
    L_0x0082:
        r7 = "Transaction callable threw non-SQL exception";	 Catch:{ all -> 0x0070 }
        r6 = com.j256.ormlite.misc.SqlExceptionUtil.create(r7, r6);	 Catch:{ all -> 0x0070 }
        throw r6;	 Catch:{ all -> 0x0070 }
    L_0x0089:
        r6 = move-exception;
        if (r2 == 0) goto L_0x0097;
    L_0x008c:
        rollBack(r4, r0);	 Catch:{ SQLException -> 0x0090 }
        goto L_0x0097;
    L_0x0090:
        r7 = logger;	 Catch:{ all -> 0x0070 }
        r0 = "after commit exception, rolling back to save-point also threw exception";	 Catch:{ all -> 0x0070 }
        r7.error(r6, r0);	 Catch:{ all -> 0x0070 }
    L_0x0097:
        throw r6;	 Catch:{ all -> 0x0070 }
    L_0x0098:
        if (r2 == 0) goto L_0x00a4;
    L_0x009a:
        r4.setAutoCommit(r1);
        r4 = logger;
        r6 = "restored auto-commit to true";
        r4.debug(r6);
    L_0x00a4:
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.misc.TransactionManager.callInTransaction(com.j256.ormlite.support.DatabaseConnection, boolean, com.j256.ormlite.db.DatabaseType, java.util.concurrent.Callable):T");
    }

    public void setConnectionSource(ConnectionSource connectionSource) {
        this.connectionSource = connectionSource;
    }

    private static void commit(DatabaseConnection databaseConnection, Savepoint savepoint) {
        Object savepointName = savepoint == null ? null : savepoint.getSavepointName();
        databaseConnection.commit(savepoint);
        if (savepointName == null) {
            logger.debug("committed savePoint transaction");
        } else {
            logger.debug("committed savePoint transaction {}", savepointName);
        }
    }

    private static void rollBack(DatabaseConnection databaseConnection, Savepoint savepoint) {
        Object savepointName = savepoint == null ? null : savepoint.getSavepointName();
        databaseConnection.rollback(savepoint);
        if (savepointName == null) {
            logger.debug("rolled back savePoint transaction");
        } else {
            logger.debug("rolled back savePoint transaction {}", savepointName);
        }
    }
}
