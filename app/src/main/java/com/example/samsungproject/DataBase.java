package com.example.samsungproject;

import android.provider.BaseColumns;

public final class DataBase {

    private DataBase() {}

    public static class FeedEntry implements BaseColumns {
        public static final String TABLE_NAME = "Olymp";
        public static final String COLUMN_NAME_ASTRO = "astro";
        public static final String COLUMN_NAME_ENGLISH = "english";
        public static final String COLUMN_NAME_BIO = "bio";
        public static final String COLUMN_NAME_GEO = "geo";
        public static final String COLUMN_NAME_INF = "inf";
        public static final String COLUMN_NAME_MHK = "mhk";
        public static final String COLUMN_NAME_SPAN = "span";
        public static final String COLUMN_NAME_HIS = "his";
        public static final String COLUMN_NAME_ITAL = "ital";
        public static final String COLUMN_NAME_CHIN = "chin";
        public static final String COLUMN_NAME_LIT = "lit";
        public static final String COLUMN_NAME_MATH = "math";
        public static final String COLUMN_NAME_DEU = "deu";
        public static final String COLUMN_NAME_OBCH = "obch";
        public static final String COLUMN_NAME_LOY = "loy";
        public static final String COLUMN_NAME_RUS = "rus";
        public static final String COLUMN_NAME_PHY = "phy";
        public static final String COLUMN_NAME_CHEM = "chem";
        public static final String COLUMN_NAME_ECO = "eco";
        public static final String COLUMN_NAME_ECON = "econ";
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