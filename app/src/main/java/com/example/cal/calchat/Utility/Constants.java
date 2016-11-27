package com.example.cal.calchat.Utility;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class Constants {

    //Firebase Constants
    public static final String KEY_MESSAGES = "messages";
    public static final String KEY_PHOTOS = "chat_photos";

    public static DatabaseReference REF_ROOT = FirebaseDatabase.getInstance().getReference();
    public static DatabaseReference REF_MESSAGES = REF_ROOT.child(KEY_MESSAGES);

    public static StorageReference REF_STORAGE_ROOT = FirebaseStorage.getInstance().getReference();
    public static StorageReference REF_PHOTOS = REF_STORAGE_ROOT.child(KEY_PHOTOS);

    public static final String MAX_MSG_LENGTH_KEY = "max_msg_length";

}
