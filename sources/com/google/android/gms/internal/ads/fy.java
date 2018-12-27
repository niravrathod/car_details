package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;
import javax.annotation.concurrent.GuardedBy;

@zzaer
final class fy implements SensorEventListener {
    /* renamed from: a */
    private final SensorManager f8076a;
    /* renamed from: b */
    private final Object f8077b = new Object();
    /* renamed from: c */
    private final Display f8078c;
    /* renamed from: d */
    private final float[] f8079d = new float[9];
    /* renamed from: e */
    private final float[] f8080e = new float[9];
    @GuardedBy("mSensorThreadLock")
    /* renamed from: f */
    private float[] f8081f;
    /* renamed from: g */
    private Handler f8082g;
    /* renamed from: h */
    private ga f8083h;

    fy(Context context) {
        this.f8076a = (SensorManager) context.getSystemService("sensor");
        this.f8078c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* renamed from: a */
    final void m8931a() {
        if (this.f8082g == null) {
            Sensor defaultSensor = this.f8076a.getDefaultSensor(11);
            if (defaultSensor == null) {
                zzaok.m10003c("No Sensor of TYPE_ROTATION_VECTOR");
                return;
            }
            HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
            handlerThread.start();
            this.f8082g = new Handler(handlerThread.getLooper());
            if (!this.f8076a.registerListener(this, defaultSensor, 0, this.f8082g)) {
                zzaok.m10003c("SensorManager.registerListener failed.");
                m8934b();
            }
        }
    }

    /* renamed from: b */
    final void m8934b() {
        if (this.f8082g != null) {
            this.f8076a.unregisterListener(this);
            this.f8082g.post(new fz(this));
            this.f8082g = null;
        }
    }

    /* renamed from: a */
    final void m8932a(ga gaVar) {
        this.f8083h = gaVar;
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        sensorEvent = sensorEvent.values;
        if (sensorEvent[0] != 0.0f || sensorEvent[1] != 0.0f || sensorEvent[2] != 0.0f) {
            synchronized (this.f8077b) {
                if (this.f8081f == null) {
                    this.f8081f = new float[9];
                }
            }
            SensorManager.getRotationMatrixFromVector(this.f8079d, sensorEvent);
            switch (this.f8078c.getRotation()) {
                case 1:
                    SensorManager.remapCoordinateSystem(this.f8079d, 2, 129, this.f8080e);
                    break;
                case 2:
                    SensorManager.remapCoordinateSystem(this.f8079d, 129, 130, this.f8080e);
                    break;
                case 3:
                    SensorManager.remapCoordinateSystem(this.f8079d, 130, 1, this.f8080e);
                    break;
                default:
                    System.arraycopy(this.f8079d, 0, this.f8080e, 0, 9);
                    break;
            }
            m8930a(1, 3);
            m8930a(2, 6);
            m8930a(5, 7);
            synchronized (this.f8077b) {
                System.arraycopy(this.f8080e, 0, this.f8081f, 0, 9);
            }
            if (this.f8083h != null) {
                this.f8083h.mo2387a();
            }
        }
    }

    /* renamed from: a */
    final boolean m8933a(float[] fArr) {
        synchronized (this.f8077b) {
            if (this.f8081f == null) {
                return false;
            }
            System.arraycopy(this.f8081f, 0, fArr, 0, this.f8081f.length);
            return 1;
        }
    }

    /* renamed from: a */
    private final void m8930a(int i, int i2) {
        float f = this.f8080e[i];
        this.f8080e[i] = this.f8080e[i2];
        this.f8080e[i2] = f;
    }
}
