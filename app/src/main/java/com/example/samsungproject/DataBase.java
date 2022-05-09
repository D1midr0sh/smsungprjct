package com.example.samsungproject;

import android.provider.BaseColumns;

public final class DataBase {

    private DataBase() {}

    public static class FeedEntry implements BaseColumns {
        public static final String TABLE_NAME = "entry";
        public static final String COLUMN_NAME_ASTRO = "Астрономия";
        public static final String COLUMN_NAME_ENGLISH = "Английский язык";
        public static final String COLUMN_NAME_BIO = "Биология";
        public static final String COLUMN_NAME_GEO = "География";
        public static final String COLUMN_NAME_INF = "Информатика";
        public static final String COLUMN_NAME_MHK = "Искусство(МХК)";
        public static final String COLUMN_NAME_SPAN = "Испанский язык";
        public static final String COLUMN_NAME_HIS = "История";
        public static final String COLUMN_NAME_ITAL = "Итальянский язык";
        public static final String COLUMN_NAME_CHIN = "Китайский язык";
        public static final String COLUMN_NAME_LIT = "Литература";
        public static final String COLUMN_NAME_MATH = "Математика";
        public static final String COLUMN_NAME_DEU = "Немецкий язык";
        public static final String COLUMN_NAME_OBCH = "Обществознание";
        public static final String COLUMN_NAME_LOY = "Право";
        public static final String COLUMN_NAME_RUS = "Русский язык";
        public static final String COLUMN_NAME_PHY = "Физика";
        public static final String COLUMN_NAME_CHEM = "Химия";
        public static final String COLUMN_NAME_ECO = "Экология";
        public static final String COLUMN_NAME_ECON = "Экономика";
    }
    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + FeedEntry.TABLE_NAME + " (" +
                    FeedEntry._ID + " INTEGER PRIMARY KEY," +
                    FeedEntry.COLUMN_NAME_ASTRO + " TEXT," +
                    FeedEntry.COLUMN_NAME_ENGLISH + " TEXT," +
                    FeedEntry.COLUMN_NAME_BIO + " TEXT," +
                    FeedEntry.COLUMN_NAME_GEO + " TEXT," +
                    FeedEntry.COLUMN_NAME_INF + " TEXT," +
                    FeedEntry.COLUMN_NAME_MHK + " TEXT," +
                    FeedEntry.COLUMN_NAME_SPAN + " TEXT," +
                    FeedEntry.COLUMN_NAME_HIS + " TEXT," +
                    FeedEntry.COLUMN_NAME_ITAL + " TEXT," +
                    FeedEntry.COLUMN_NAME_CHIN + " TEXT," +
                    FeedEntry.COLUMN_NAME_LIT + " TEXT," +
                    FeedEntry.COLUMN_NAME_MATH + " TEXT," +
                    FeedEntry.COLUMN_NAME_DEU + " TEXT," +
                    FeedEntry.COLUMN_NAME_OBCH + " TEXT," +
                    FeedEntry.COLUMN_NAME_LOY + " TEXT," +
                    FeedEntry.COLUMN_NAME_RUS + " TEXT," +
                    FeedEntry.COLUMN_NAME_PHY + " TEXT," +
                    FeedEntry.COLUMN_NAME_CHEM + " TEXT," +
                    FeedEntry.COLUMN_NAME_ECO + " TEXT," +
                    FeedEntry.COLUMN_NAME_ECON + " TEXT)";

    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + FeedEntry.TABLE_NAME;
}