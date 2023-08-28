package com.muharremtopakkaya.kotlinlearn

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import com.muharremtopakkaya.kotlinlearn.databinding.ActivityCalculatorBinding

class Calculator : AppCompatActivity() {

    private lateinit var binding: ActivityCalculatorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)
      
    }

    private fun performOperation(operation: (Int, Int) -> Int) {
        val number1 = binding.editText.text.toString().toIntOrNull()
        val number2 = binding.editText2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null) {
            binding.resultText.text = "Error!"
        } else {
            val result = operation(number1, number2)
            binding.resultText.text = "Result: $result"
        }
    }

    fun mySum(view: View) = performOperation { a, b -> a + b }

    fun mySub(view: View) = performOperation { a, b -> a - b }

    fun myMultiply(view: View) = performOperation { a, b -> a * b }

    fun myDiv(view: View) {
        val number2 = binding.editText2.text.toString().toIntOrNull()

        if (number2 == 0) {
            binding.resultText.text = "Error: Division by zero!"
            return
        }

        performOperation { a, b -> a / b }
    }

}
