package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ĐOẠN CODE THÊM MỚI ĐỂ TEST COMMIT
        val testMessage = "Dang luyen tap git cho bai kiem tra Android"
        println(testMessage)
    }
    fun hamBoSungTest() {
        // Code bổ sung
    }
}