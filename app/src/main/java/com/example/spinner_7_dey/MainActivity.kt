package com.example.spinner_7_dey

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapter2 = SpinnerAdapter(
            context = this,
            list = listOf<String>(
                "مهدی","رضا"
            )
        )
        val spinner = findViewById<Spinner>(R.id.sn_menu_reportItem)
        spinner.apply {
            adapter = adapter2
            onItemSelectedListener = object : AdapterView.OnItemSelectedListener
            {
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long)
                {
                       Log.d("TAGU", "onItemSelected: position is $position")

                }

                override fun onNothingSelected(p0: AdapterView<*>?) {}
            }
        }

    }
}