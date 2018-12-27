package com.cuvora.carinfo.helpers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.cuvora.carinfo.models.VehicleSearchResult;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/* renamed from: com.cuvora.carinfo.helpers.b */
public class C3688b extends OrmLiteSqliteOpenHelper {
    /* renamed from: a */
    private static String f14910a = "b";
    /* renamed from: d */
    private static C3688b f14911d;
    /* renamed from: b */
    private Context f14912b;
    /* renamed from: c */
    private Dao<VehicleSearchResult, String> f14913c = null;

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, ConnectionSource connectionSource, int i, int i2) {
    }

    public C3688b(Context context) {
        super(context, "vehicleInfoDb.db", null, 1);
        this.f14912b = context;
    }

    /* renamed from: a */
    public static C3688b m18507a(Context context) {
        if (f14911d == null) {
            f14911d = new C3688b(context.getApplicationContext());
        }
        return f14911d;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase, ConnectionSource connectionSource) {
        try {
            TableUtils.createTable(connectionSource, VehicleSearchResult.class);
        } catch (SQLiteDatabase sQLiteDatabase2) {
            sQLiteDatabase2.printStackTrace();
            throw new RuntimeException(sQLiteDatabase2);
        }
    }

    /* renamed from: a */
    public Dao<VehicleSearchResult, String> m18508a() {
        try {
            if (this.f14913c == null) {
                this.f14913c = getDao(VehicleSearchResult.class);
            }
            return this.f14913c;
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
    }

    /* renamed from: b */
    public List<VehicleSearchResult> m18511b() {
        try {
            return m18508a().queryBuilder().orderBy("search_date", false).query();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public void m18510a(String str) {
        try {
            m18508a().deleteById(str);
        } catch (String str2) {
            str2.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m18509a(VehicleSearchResult vehicleSearchResult) {
        try {
            vehicleSearchResult.setSearchDate(new Date());
            m18508a().createOrUpdate(vehicleSearchResult);
        } catch (VehicleSearchResult vehicleSearchResult2) {
            vehicleSearchResult2.printStackTrace();
        }
    }
}
