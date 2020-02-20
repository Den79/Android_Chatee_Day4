package com.example.chateeinclass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_login.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // write a message to Database
        val database = FirebaseDatabase.getInstance();
        val myRef = database.getReference("message");
        myRef.setValue("Hello World!");

        // TYEST
        login_button.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}
