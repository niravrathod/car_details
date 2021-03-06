package com.j256.ormlite.android;

import com.j256.ormlite.logger.Log;
import com.j256.ormlite.logger.Log.Level;
import com.j256.ormlite.logger.LoggerFactory;

public class AndroidLog implements Log {
    private static final String ALL_LOGS_NAME = "ORMLite";
    private static final int MAX_TAG_LENGTH = 23;
    private static final int REFRESH_LEVEL_CACHE_EVERY = 200;
    private String className;
    private final boolean[] levelCache;
    private volatile int levelCacheC = 0;

    public AndroidLog(String str) {
        int i = 0;
        this.className = LoggerFactory.getSimpleClassName(str);
        str = this.className.length();
        if (str > 23) {
            this.className = this.className.substring(str - 23, str);
        }
        str = Level.values();
        int length = str.length;
        int i2 = 0;
        while (i < length) {
            int levelToAndroidLevel = levelToAndroidLevel(str[i]);
            if (levelToAndroidLevel > i2) {
                i2 = levelToAndroidLevel;
            }
            i++;
        }
        this.levelCache = new boolean[(i2 + 1)];
        refreshLevelCache();
    }

    public boolean isLevelEnabled(Level level) {
        int i = this.levelCacheC + 1;
        this.levelCacheC = i;
        if (i >= REFRESH_LEVEL_CACHE_EVERY) {
            refreshLevelCache();
            this.levelCacheC = 0;
        }
        level = levelToAndroidLevel(level);
        if (level < this.levelCache.length) {
            return this.levelCache[level];
        }
        return isLevelEnabledInternal(level);
    }

    public void log(Level level, String str) {
        switch (level) {
            case TRACE:
                android.util.Log.v(this.className, str);
                return;
            case DEBUG:
                android.util.Log.d(this.className, str);
                return;
            case INFO:
                android.util.Log.i(this.className, str);
                return;
            case WARNING:
                android.util.Log.w(this.className, str);
                return;
            case ERROR:
                android.util.Log.e(this.className, str);
                return;
            case FATAL:
                android.util.Log.e(this.className, str);
                return;
            default:
                android.util.Log.i(this.className, str);
                return;
        }
    }

    public void log(Level level, String str, Throwable th) {
        switch (level) {
            case TRACE:
                android.util.Log.v(this.className, str, th);
                return;
            case DEBUG:
                android.util.Log.d(this.className, str, th);
                return;
            case INFO:
                android.util.Log.i(this.className, str, th);
                return;
            case WARNING:
                android.util.Log.w(this.className, str, th);
                return;
            case ERROR:
                android.util.Log.e(this.className, str, th);
                return;
            case FATAL:
                android.util.Log.e(this.className, str, th);
                return;
            default:
                android.util.Log.i(this.className, str, th);
                return;
        }
    }

    private void refreshLevelCache() {
        for (Level levelToAndroidLevel : Level.values()) {
            int levelToAndroidLevel2 = levelToAndroidLevel(levelToAndroidLevel);
            if (levelToAndroidLevel2 < this.levelCache.length) {
                this.levelCache[levelToAndroidLevel2] = isLevelEnabledInternal(levelToAndroidLevel2);
            }
        }
    }

    private boolean isLevelEnabledInternal(int i) {
        if (!android.util.Log.isLoggable(this.className, i)) {
            if (android.util.Log.isLoggable(ALL_LOGS_NAME, i) == 0) {
                return false;
            }
        }
        return true;
    }

    private int levelToAndroidLevel(Level level) {
        switch (level) {
            case TRACE:
                return 2;
            case DEBUG:
                return 3;
            case INFO:
                return 4;
            case WARNING:
                return 5;
            case ERROR:
                return 6;
            case FATAL:
                return 6;
            default:
                return 4;
        }
    }
}
