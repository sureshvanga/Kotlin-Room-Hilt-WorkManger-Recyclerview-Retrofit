package com.demo.suresh.db;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.demo.suresh.model.Owner;
import com.demo.suresh.model.RepositoryData;
import com.demo.suresh.model.TypeConverterOwner;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDao_Impl implements AppDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<RepositoryData> __insertionAdapterOfRepositoryData;

  private final TypeConverterOwner __typeConverterOwner = new TypeConverterOwner();

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllRecords;

  public AppDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRepositoryData = new EntityInsertionAdapter<RepositoryData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `repositories` (`id`,`name`,`description`,`owner`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RepositoryData value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        final String _tmp;
        _tmp = __typeConverterOwner.someObjectListToString(value.getOwner());
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp);
        }
      }
    };
    this.__preparedStmtOfDeleteAllRecords = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM repositories";
        return _query;
      }
    };
  }

  @Override
  public void insertRecords(final RepositoryData repositoryData) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfRepositoryData.insert(repositoryData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAllRecords() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllRecords.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllRecords.release(_stmt);
    }
  }

  @Override
  public LiveData<List<RepositoryData>> getAllRecords() {
    final String _sql = "SELECT * FROM repositories";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"repositories"}, false, new Callable<List<RepositoryData>>() {
      @Override
      public List<RepositoryData> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfOwner = CursorUtil.getColumnIndexOrThrow(_cursor, "owner");
          final List<RepositoryData> _result = new ArrayList<RepositoryData>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final RepositoryData _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final Owner _tmpOwner;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfOwner);
            _tmpOwner = __typeConverterOwner.stringToSomeObjectList(_tmp);
            _item = new RepositoryData(_tmpId,_tmpName,_tmpDescription,_tmpOwner);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
