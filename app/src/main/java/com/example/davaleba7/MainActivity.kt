package com.example.davaleba7

import android.os.Bundle
import android.text.InputType
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.davaleba7.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button.setOnClickListener {
            check()
        }
    }

    private fun check() {
        val isChecked = binding.checkbox.isChecked
        val et = EditText(this)
        when (isChecked) {
            true -> {
                et.inputType = InputType.TYPE_CLASS_NUMBER
            }
            false -> {
                et.inputType = InputType.TYPE_CLASS_TEXT
            }
        }
        binding.field.addView(et)
    }

}





