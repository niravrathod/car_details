package com.j256.ormlite.android;

import android.database.Cursor;
import com.j256.ormlite.dao.ObjectCache;
import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.db.SqliteAndroidDatabaseType;
import com.j256.ormlite.support.DatabaseResults;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AndroidDatabaseResults implements DatabaseResults {
    private static final int MIN_NUM_COLUMN_NAMES_MAP = 8;
    private static final DatabaseType databaseType = new SqliteAndroidDatabaseType();
    private final Map<String, Integer> columnNameMap;
    private final String[] columnNames;
    private final Cursor cursor;
    private final ObjectCache objectCache;

    public AndroidDatabaseResults(Cursor cursor, ObjectCache objectCache) {
        this.cursor = cursor;
        this.columnNames = cursor.getColumnNames();
        if (this.columnNames.length >= 8) {
            this.columnNameMap = new HashMap();
            for (cursor = null; cursor < this.columnNames.length; cursor++) {
                this.columnNameMap.put(this.columnNames[cursor], Integer.valueOf(cursor));
            }
        } else {
            this.columnNameMap = null;
        }
        this.objectCache = objectCache;
    }

    @Deprecated
    public AndroidDatabaseResults(Cursor cursor, boolean z, ObjectCache objectCache) {
        this(cursor, objectCache);
    }

    public int getColumnCount() {
        return this.cursor.getColumnCount();
    }

    public String[] getColumnNames() {
        int columnCount = getColumnCount();
        String[] strArr = new String[columnCount];
        for (int i = 0; i < columnCount; i++) {
            strArr[i] = this.cursor.getColumnName(i);
        }
        return strArr;
    }

    public boolean first() {
        return this.cursor.moveToFirst();
    }

    public boolean next() {
        return this.cursor.moveToNext();
    }

    public boolean last() {
        return this.cursor.moveToLast();
    }

    public boolean previous() {
        return this.cursor.moveToPrevious();
    }

    public boolean moveRelative(int i) {
        return this.cursor.move(i);
    }

    public boolean moveAbsolute(int i) {
        return this.cursor.moveToPosition(i);
    }

    public int getCount() {
        return this.cursor.getCount();
    }

    public int getPosition() {
        return this.cursor.getPosition();
    }

    public int findColumn(String str) {
        int lookupColumn = lookupColumn(str);
        if (lookupColumn >= 0) {
            return lookupColumn;
        }
        StringBuilder stringBuilder = new StringBuilder(str.length() + 4);
        databaseType.appendEscapedEntityName(stringBuilder, str);
        lookupColumn = lookupColumn(stringBuilder.toString());
        if (lookupColumn >= 0) {
            return lookupColumn;
        }
        String[] columnNames = this.cursor.getColumnNames();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Unknown field '");
        stringBuilder2.append(str);
        stringBuilder2.append("' from the Android sqlite cursor, not in:");
        stringBuilder2.append(Arrays.toString(columnNames));
        throw new SQLException(stringBuilder2.toString());
    }

    public String getString(int i) {
        return this.cursor.getString(i);
    }

    public boolean getBoolean(int i) {
        if (!this.cursor.isNull(i)) {
            if (this.cursor.getShort(i) != 0) {
                return true;
            }
        }
        return false;
    }

    public char getChar(int i) {
        String string = this.cursor.getString(i);
        if (string != null) {
            if (string.length() != 0) {
                if (string.length() == 1) {
                    return string.charAt(0);
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("More than 1 character stored in database column: ");
                stringBuilder.append(i);
                throw new SQLException(stringBuilder.toString());
            }
        }
        return '\u0000';
    }

    public byte getByte(int i) {
        return (byte) getShort(i);
    }

    public byte[] getBytes(int i) {
        return this.cursor.getBlob(i);
    }

    public short getShort(int i) {
        return this.cursor.getShort(i);
    }

    public int getInt(int i) {
        return this.cursor.getInt(i);
    }

    public long getLong(int i) {
        return this.cursor.getLong(i);
    }

    public float getFloat(int i) {
        return this.cursor.getFloat(i);
    }

    public double getDouble(int i) {
        return this.cursor.getDouble(i);
    }

    public Timestamp getTimestamp(int i) {
        throw new SQLException("Android does not support timestamp.  Use JAVA_DATE_LONG or JAVA_DATE_STRING types");
    }

    public InputStream getBlobStream(int i) {
        return new ByteArrayInputStream(this.cursor.getBlob(i));
    }

    public BigDecimal getBigDecimal(int i) {
        throw new SQLException("Android does not support BigDecimal type.  Use BIG_DECIMAL or BIG_DECIMAL_STRING types");
    }

    public boolean wasNull(int i) {
        return this.cursor.isNull(i);
    }

    public ObjectCache getObjectCache() {
        return this.objectCache;
    }

    public void close() {
        this.cursor.close();
    }

    public void closeQuietly() {
        close();
    }

    public Cursor getRawCursor() {
        return this.cursor;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append("@");
        stringBuilder.append(Integer.toHexString(super.hashCode()));
        return stringBuilder.toString();
    }

    private int lookupColumn(String str) {
        if (this.columnNameMap == null) {
            for (int i = 0; i < this.columnNames.length; i++) {
                if (this.columnNames[i].equals(str)) {
                    return i;
                }
            }
            return -1;
        }
        Integer num = (Integer) this.columnNameMap.get(str);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }
}
