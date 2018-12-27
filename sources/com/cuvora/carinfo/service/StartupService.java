package com.cuvora.carinfo.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import android.preference.PreferenceManager;
import com.cuvora.carinfo.helpers.C1545h;
import com.cuvora.carinfo.helpers.C3688b;
import com.cuvora.carinfo.loaders.C1578n;
import com.cuvora.carinfo.loaders.C1579s;
import com.cuvora.carinfo.models.GarageResult;
import com.cuvora.carinfo.models.Response;
import com.cuvora.carinfo.models.VehicleSearchResult;
import io.branch.referral.Branch;
import java.util.List;

public class StartupService extends Service {
    /* renamed from: a */
    private SharedPreferences f4806a;

    public int onStartCommand(Intent intent, int i, int i2) {
        this.f4806a = PreferenceManager.getDefaultSharedPreferences(this);
        m6107a();
        return super.onStartCommand(intent, i, i2);
    }

    /* renamed from: a */
    private void m6107a() {
        new C1578n(this, this) {
            /* renamed from: a */
            final /* synthetic */ StartupService f14936a;

            protected /* synthetic */ void onPostExecute(Object obj) {
                m18543a((Response) obj);
            }

            /* renamed from: a */
            protected void m18543a(Response response) {
                super.onPostExecute(response);
                if (response != null && (response instanceof GarageResult)) {
                    GarageResult garageResult = (GarageResult) response;
                    this.f14936a.m6108a(garageResult);
                    this.f14936a.m6110b(garageResult);
                }
            }
        }.execute(new Void[0]);
    }

    /* renamed from: a */
    private void m6108a(GarageResult garageResult) {
        for (VehicleSearchResult a : garageResult.getVehicleSearchResultList()) {
            C3688b.m18507a((Context) this).m18509a(a);
        }
    }

    /* renamed from: b */
    private void m6110b(GarageResult garageResult) {
        if (!this.f4806a.getBoolean("KEY_RECENT_SEARCH_MIGRATED", false)) {
            try {
                List query = C3688b.m18507a((Context) this).m18508a().queryBuilder().orderBy("search_date", false).query();
                if (query != null) {
                    for (int i = 0; i < query.size(); i++) {
                        VehicleSearchResult vehicleSearchResult = (VehicleSearchResult) query.get(i);
                        if (C1545h.m5871a(vehicleSearchResult.getJsonString()) == null) {
                            C3688b.m18507a((Context) this).m18510a(vehicleSearchResult.getVehicleNum());
                        } else if (!garageResult.getVehicleNumbers().contains(vehicleSearchResult.getVehicleNum())) {
                            garageResult.getVehicleNumbers().add(vehicleSearchResult.getVehicleNum());
                        }
                    }
                    new C1579s(this, this, false, garageResult) {
                        /* renamed from: a */
                        final /* synthetic */ StartupService f14937a;

                        protected /* synthetic */ void onPostExecute(Object obj) {
                            mo1198a((GarageResult) obj);
                        }

                        /* renamed from: a */
                        protected void mo1198a(GarageResult garageResult) {
                            super.onPostExecute(garageResult);
                            if (garageResult != null) {
                                if (garageResult.getUserId() != null) {
                                    Branch.m23406b().m23451a(garageResult.getUserId());
                                }
                                PreferenceManager.getDefaultSharedPreferences(this.f14937a).edit().putBoolean("KEY_RECENT_SEARCH_MIGRATED", true).apply();
                            }
                        }
                    }.execute(new Void[0]);
                } else {
                    this.f4806a.edit().putBoolean("KEY_RECENT_SEARCH_MIGRATED", true).apply();
                }
            } catch (GarageResult garageResult2) {
                garageResult2.printStackTrace();
            }
        }
    }

    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
