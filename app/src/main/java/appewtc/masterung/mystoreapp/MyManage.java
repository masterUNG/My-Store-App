package appewtc.masterung.mystoreapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by masterUNG on 5/29/16 AD.
 */
public class MyManage {

    //Explicit
    private MyOpenHelper myOpenHelper;
    private SQLiteDatabase sqLiteDatabase;

    public static final String user_table = "userTABLE";
    public static final String column_id = "_id";
    public static final String column_name = "Name";
    public static final String column_surname = "Surname";
    public static final String column_user = "User";
    public static final String column_password = "Password";

    public MyManage(Context context) {

        myOpenHelper = new MyOpenHelper(context);
        sqLiteDatabase = myOpenHelper.getWritableDatabase();

    }   // Constructor

    public long addUser(String strName,
                        String strSurname,
                        String strUser,
                        String strPassword) {

        ContentValues contentValues = new ContentValues();
        contentValues.put(column_name, strName);
        contentValues.put(column_surname, strSurname);
        contentValues.put(column_user, strUser);
        contentValues.put(column_password, strPassword);

        return sqLiteDatabase.insert(user_table, null, contentValues);
    }

}   // MyManage Class
