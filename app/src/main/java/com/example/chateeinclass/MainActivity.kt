package com.example.chateeinclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // write a message to Database
        val database = FirebaseDatabase.getInstance();
        val myRef = database.getReference("message");
        myRef.setValue("Hello World!");
    }
}
