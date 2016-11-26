package com.example.cal.calchat.Utility;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Constants {

    //Firebase Constants
    public static final String KEY_MESSAGES = "messages";

    public static final DatabaseReference REF_ROOT = FirebaseDatabase.getInstance().getReference();
    public static final DatabaseReference REF_MESSAGES = REF_ROOT.child(KEY_MESSAGES);
}
