package com.j256.ormlite.field.types;

import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.field.SqlType;
import com.j256.ormlite.support.DatabaseResults;
import java.sql.SQLException;

public class CharacterObjectType extends BaseDataType {
    private static final CharacterObjectType singleTon = new CharacterObjectType();

    public static CharacterObjectType getSingleton() {
        return singleTon;
    }

    private CharacterObjectType() {
        super(SqlType.CHAR, new Class[]{Character.class});
    }

    protected CharacterObjectType(SqlType sqlType, Class<?>[] clsArr) {
        super(sqlType, clsArr);
    }

    public Object parseDefaultString(FieldType fieldType, String str) {
        if (str.length() == 1) {
            return Character.valueOf(str.charAt(null));
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Problems with field ");
        stringBuilder.append(fieldType);
        stringBuilder.append(", default string to long for Character: '");
        stringBuilder.append(str);
        stringBuilder.append("'");
        throw new SQLException(stringBuilder.toString());
    }

    public Object resultToSqlArg(FieldType fieldType, DatabaseResults databaseResults, int i) {
        return Character.valueOf(databaseResults.getChar(i));
    }
}
