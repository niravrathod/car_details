package com.j256.ormlite.stmt.query;

import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.stmt.ArgumentHolder;
import java.util.List;

interface Comparison extends Clause {
    void appendOperation(StringBuilder stringBuilder);

    void appendValue(DatabaseType databaseType, StringBuilder stringBuilder, List<ArgumentHolder> list);

    String getColumnName();
}
