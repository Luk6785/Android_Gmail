package com.example.android_gmail

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var lvgmail: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val countryList =
            arrayOf("India", "China", "australia", "Portugle", "America", "NewZealand")

        lvgmail = findViewById(R.id.simpleListView)

        // Tạo ArrayAdapter để kết nối danh sách dữ liệu với ListView
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, countryList)

        // Gán ArrayAdapter cho ListView
        lvgmail.adapter = adapter


    }

}