package com.example.occuranceletterapp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calculate = findViewById(R.id.btn_calculate) as Button
        val insertedText = findViewById(R.id.insertText) as TextView
        val countResult = findViewById(R.id.counterId) as TextView

        calculate.setOnClickListener {
            val words = insertedText.text.toString().split("\\s".toRegex()).toTypedArray()
            countResult.text = words.filter { e -> e.contains("a|A".toRegex()) }.count().toString()
        }
    }
}