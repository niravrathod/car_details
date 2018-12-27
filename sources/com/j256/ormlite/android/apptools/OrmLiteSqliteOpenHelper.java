package com.j256.ormlite.android.apptools;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import com.j256.ormlite.android.AndroidConnectionSource;
import com.j256.ormlite.android.AndroidDatabaseConnection;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.support.DatabaseConnection;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public abstract class OrmLiteSqliteOpenHelper extends SQLiteOpenHelper {
    protected static Logger logger = LoggerFactory.getLogger(OrmLiteSqliteOpenHelper.class);
    protected boolean cancelQueriesEnabled;
    protected AndroidConnectionSource connectionSource;
    private volatile boolean isOpen;

    public abstract void onCreate(SQLiteDatabase sQLiteDatabase, ConnectionSource connectionSource);

    public abstract void onUpgrade(SQLiteDatabase sQLiteDatabase, ConnectionSource connectionSource, int i, int i2);

    public OrmLiteSqliteOpenHelper(Context context, String str, CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
        this.connectionSource = new AndroidConnectionSource((SQLiteOpenHelper) this);
        this.isOpen = true;
        logger.trace("{}: constructed connectionSource {}", (Object) this, this.connectionSource);
    }

    public OrmLiteSqliteOpenHelper(Context context, String str, CursorFactory cursorFactory, int i, int i2) {
        this(context, str, cursorFactory, i, openFileId(context, i2));
    }

    public OrmLiteSqliteOpenHelper(Context context, String str, CursorFactory cursorFactory, int i, File file) {
        this(context, str, cursorFactory, i, openFile(file));
    }

    public OrmLiteSqliteOpenHelper(android.content.Context r1, java.lang.String r2, android.database.sqlite.SQLiteDatabase.CursorFactory r3, int r4, java.io.InputStream r5) {
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
        r0 = this;
        r0.<init>(r1, r2, r3, r4);
        r1 = new com.j256.ormlite.android.AndroidConnectionSource;
        r1.<init>(r0);
        r0.connectionSource = r1;
        r1 = 1;
        r0.isOpen = r1;
        if (r5 != 0) goto L_0x0010;
    L_0x000f:
        return;
    L_0x0010:
        r1 = new java.io.BufferedReader;	 Catch:{ SQLException -> 0x0029 }
        r2 = new java.io.InputStreamReader;	 Catch:{ SQLException -> 0x0029 }
        r2.<init>(r5);	 Catch:{ SQLException -> 0x0029 }
        r3 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;	 Catch:{ SQLException -> 0x0029 }
        r1.<init>(r2, r3);	 Catch:{ SQLException -> 0x0029 }
        r1 = com.j256.ormlite.table.DatabaseTableConfigLoader.loadDatabaseConfigFromReader(r1);	 Catch:{ SQLException -> 0x0029 }
        com.j256.ormlite.dao.DaoManager.addCachedDatabaseConfigs(r1);	 Catch:{ SQLException -> 0x0029 }
        r5.close();	 Catch:{ IOException -> 0x0026 }
    L_0x0026:
        return;
    L_0x0027:
        r1 = move-exception;
        goto L_0x0032;
    L_0x0029:
        r1 = move-exception;
        r2 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0027 }
        r3 = "Could not load object config file";	 Catch:{ all -> 0x0027 }
        r2.<init>(r3, r1);	 Catch:{ all -> 0x0027 }
        throw r2;	 Catch:{ all -> 0x0027 }
    L_0x0032:
        r5.close();	 Catch:{ IOException -> 0x0035 }
    L_0x0035:
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper.<init>(android.content.Context, java.lang.String, android.database.sqlite.SQLiteDatabase$CursorFactory, int, java.io.InputStream):void");
    }

    public ConnectionSource getConnectionSource() {
        if (!this.isOpen) {
            logger.warn(new IllegalStateException(), "Getting connectionSource was called after closed");
        }
        return this.connectionSource;
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        ConnectionSource connectionSource = getConnectionSource();
        DatabaseConnection specialConnection = connectionSource.getSpecialConnection();
        boolean z = true;
        if (specialConnection == null) {
            specialConnection = new AndroidDatabaseConnection(sQLiteDatabase, true, this.cancelQueriesEnabled);
            try {
                connectionSource.saveSpecialConnection(specialConnection);
            } catch (SQLiteDatabase sQLiteDatabase2) {
                throw new IllegalStateException("Could not save special connection", sQLiteDatabase2);
            }
        }
        z = false;
        try {
            onCreate(sQLiteDatabase2, connectionSource);
        } finally {
            if (z) {
                connectionSource.clearSpecialConnection(specialConnection);
            }
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        ConnectionSource connectionSource = getConnectionSource();
        DatabaseConnection specialConnection = connectionSource.getSpecialConnection();
        boolean z = true;
        if (specialConnection == null) {
            specialConnection = new AndroidDatabaseConnection(sQLiteDatabase, true, this.cancelQueriesEnabled);
            try {
                connectionSource.saveSpecialConnection(specialConnection);
            } catch (SQLiteDatabase sQLiteDatabase2) {
                throw new IllegalStateException("Could not save special connection", sQLiteDatabase2);
            }
        }
        z = false;
        try {
            onUpgrade(sQLiteDatabase2, connectionSource, i, i2);
        } finally {
            if (z) {
                connectionSource.clearSpecialConnection(specialConnection);
            }
        }
    }

    public void close() {
        super.close();
        this.connectionSource.close();
        this.isOpen = false;
    }

    public boolean isOpen() {
        return this.isOpen;
    }

    public <D extends Dao<T, ?>, T> D getDao(Class<T> cls) {
        return DaoManager.createDao(getConnectionSource(), (Class) cls);
    }

    public <D extends RuntimeExceptionDao<T, ?>, T> D getRuntimeExceptionDao(Class<T> cls) {
        try {
            return new RuntimeExceptionDao(getDao(cls));
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not create RuntimeExcepitionDao for class ");
            stringBuilder.append(cls);
            throw new RuntimeException(stringBuilder.toString(), e);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append("@");
        stringBuilder.append(Integer.toHexString(super.hashCode()));
        return stringBuilder.toString();
    }

    private static InputStream openFileId(Context context, int i) {
        context = context.getResources().openRawResource(i);
        if (context != null) {
            return context;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Could not find object config file with id ");
        stringBuilder.append(i);
        throw new IllegalStateException(stringBuilder.toString());
    }

    private static InputStream openFile(File file) {
        if (file == null) {
            return null;
        }
        try {
            return new FileInputStream(file);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not open config file ");
            stringBuilder.append(file);
            throw new IllegalArgumentException(stringBuilder.toString(), e);
        }
    }
}
