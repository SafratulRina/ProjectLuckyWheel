package com.example.projekluckywheel;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataMember {
    private static final String TABLE_MEMBER = "member";
    private static final String KEY_ID = "id";
    public static final String KEY_SLOT = "slot";
    public static final String KEY_NAMA = "nama";
    public static final String KEY_LUNAS = "lunas";

    private SQLiteDatabase database;
    private DatabaseHelper dbhelper;

    public DataMember(Context context){
        dbhelper = new DatabaseHelper(context);
    }

    public void open() throws SQLException {
        database = dbhelper.getWritableDatabase();
    }

    public void close(){
        dbhelper.close();
    }

    public void addMember(Member member){
        ContentValues values = new ContentValues();
        values.put(KEY_SLOT, member.get_slot());
        values.put(KEY_NAMA, member.get_nama());
        values.put(KEY_LUNAS, member.get_lunas());

        //inserting row
        database.insert(TABLE_MEMBER, null, values);
    }

    public List<Member> getAllMember(){
        List<Member> listMember = new ArrayList<Member>();

        //select all data mahasiswa
        String allMember = "SELECT * FROM " + TABLE_MEMBER;
        Cursor cursor = database.rawQuery(allMember, null);

        //looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Member member = new Member();
                member.set_id(Integer.parseInt(cursor.getString(0)));
                member.set_slot(cursor.getString(1));
                member.set_nama(cursor.getString(2));
                member.set_lunas(cursor.getString(3));

                //adding mahasiswa to the list
                listMember.add(member);
            } while (cursor.moveToNext());
        }

        cursor.close();
        return listMember;
    }

    public void deleteOne(String id) {
        String queryString = "DELETE FROM " + TABLE_MEMBER + " WHERE " + KEY_ID + " = "+ id;
        database.execSQL(queryString);
    }

    public void updateOne(String id, String new_slot, String new_nama, String new_lunas){
        database = dbhelper.getWritableDatabase();
        String queryString = "UPDATE " + TABLE_MEMBER +
                " SET "
                + KEY_SLOT + " = '" + new_slot +"',"
                + KEY_NAMA + " = '" + new_nama + "',"
                + KEY_LUNAS + " = '" + new_lunas+
                "' WHERE " + KEY_ID + " = " +id;

        database.execSQL(queryString);

    }

}
