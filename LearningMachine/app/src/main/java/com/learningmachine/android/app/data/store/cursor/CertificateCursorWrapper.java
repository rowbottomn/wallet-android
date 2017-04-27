package com.learningmachine.android.app.data.store.cursor;

import android.database.Cursor;
import android.database.CursorWrapper;

import com.learningmachine.android.app.data.model.Certificate;
import com.learningmachine.android.app.data.store.LMDatabaseHelper;

public class CertificateCursorWrapper extends CursorWrapper {

    public CertificateCursorWrapper(Cursor cursor) {
        super(cursor);
    }

    public Certificate getCertificate() {
        String name = getString(getColumnIndex(LMDatabaseHelper.Column.Certificate.NAME));
        String description = getString(getColumnIndex(LMDatabaseHelper.Column.Certificate.DESCRIPTION));

        return new Certificate(name, description);
    }
}
