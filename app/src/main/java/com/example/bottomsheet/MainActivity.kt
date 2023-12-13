package com.example.bottomsheet

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val show = findViewById<Button>(R.id.sumbit)

        show.setOnClickListener {

            val bottomsheetDailog = BottomSheetDialog(this)
            val layout = LayoutInflater.from(this).inflate(R.layout.buttomsheet,null,false)
            val hello = layout.findViewById<TextView>(R.id.heloo)
            bottomsheetDailog.setContentView(layout)
            bottomsheetDailog.show()
            hello.setOnClickListener {
                Toast.makeText(this, "kare", Toast.LENGTH_SHORT).show()
            }


        }
    }
}