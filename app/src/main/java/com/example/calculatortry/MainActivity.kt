package com.example.calculatortry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculatortry.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

  private lateinit var binding: ActivityMainBinding

    private   var ans: Double  = 0.0
    private   var operationAns = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener{ tap1() }
        binding.button2.setOnClickListener{ tap2() }
        binding.button3.setOnClickListener{ tap3() }
        binding.button4.setOnClickListener{ tap4() }
        binding.button5.setOnClickListener{ tap5() }
        binding.button6.setOnClickListener{ tap6() }
        binding.button7.setOnClickListener{ tap7() }
        binding.button8.setOnClickListener{ tap8() }
        binding.button9.setOnClickListener{ tap9() }
        binding.button11.setOnClickListener{ tap0() }
        binding.button10.setOnClickListener{ tapplus() }
        binding.button12.setOnClickListener{ tapminus() }
        binding.button13.setOnClickListener{ tapmult() }
        binding.button15.setOnClickListener{ tapdiv() }

        binding.button17.setOnClickListener{ tapequals() }
        binding.button16.setOnClickListener{ tapC() }

        binding.button14.setOnClickListener{ tapdot() }
    }
    private  fun tap1()  {
        if (binding.textView.text == "0") {binding.textView.text = "1"}
       else {binding.textView.text = "" + binding.textView.text + "1"}
    }
    private fun tap2()  {
        if (binding.textView.text == "0") {binding.textView.text = "2"}
        else {binding.textView.text= "" + binding.textView.text + "2"}
    }
    private  fun tap3()  {
        if (binding.textView.text == "0") {binding.textView.text = "3"}
        else {binding.textView.text= "" + binding.textView.text+ "3"}
    }
    private  fun tap4()  {
        if (binding.textView.text == "0") {binding.textView.text = "4"}
        else {binding.textView.text= "" + binding.textView.text+ "4"}
    }
    private fun tap5()  {
        if (binding.textView.text == "0") {binding.textView.text = "5"}
        else {binding.textView.text= "" + binding.textView.text+ "5"}
    }
    private  fun tap6()  {
        if (binding.textView.text == "0") {binding.textView.text = "6"}
        else {binding.textView.text= "" + binding.textView.text+ "6"}
    }
    private  fun tap7()  {
        if (binding.textView.text == "0") {binding.textView.text = "7"}
        else {binding.textView.text= "" + binding.textView.text+ "7"}
    }
    private  fun tap8()  {
        if (binding.textView.text == "0") {binding.textView.text = "8"}
        else {binding.textView.text= "" + binding.textView.text+ "8"}
    }
    private  fun tap9()  {
        if (binding.textView.text == "0") {binding.textView.text = "9"}
        else {binding.textView.text= "" + binding.textView.text+ "9"}
    }
    private  fun tap0()  {
        if (binding.textView.text == "0") {binding.textView.text = "0"}
      //  else if (binding.textView.text == "0") {binding.textView.text = "0"}
        else {binding.textView.text= "" + binding.textView.text+ "0"}
    }
    private  fun tapplus()  {
        ans = binding.textView.text.toString().toDouble()
        binding.textView2.text = "ans = " + binding.textView.text
        binding.textView.text = "0"
        operationAns = 1
    }
    private fun tapminus()  {
        ans = binding.textView.text.toString().toDouble()
        binding.textView2.text = "ans = " + binding.textView.text
        binding.textView.text = "0"
        operationAns = 2
    }
    private  fun tapmult()  {
        ans = binding.textView.text.toString().toDouble()
        binding.textView2.text = "ans = " + binding.textView.text
        binding.textView.text = "0"
        operationAns = 3
    }
    private  fun tapdiv()  {
        ans = binding.textView.text.toString().toDouble()
        binding.textView2.text = "ans = " + binding.textView.text
        binding.textView.text = "0"
        operationAns = 4
    }
    private  fun tapdot()  {


        val result: Boolean = binding.textView.text.all() {
            it.isDigit()
        }

       if (result) {binding.textView.text= "" + binding.textView.text+ "."}


    }

    private fun tapequals()  {
        when (operationAns) {
          0 ->  binding.textView.text = "0.0"
          1 ->  binding.textView.text = (ans + binding.textView.text.toString().toDouble()).toString()
          2 ->  binding.textView.text = (ans - binding.textView.text.toString().toDouble()).toString()
          3 ->  binding.textView.text = (ans * binding.textView.text.toString().toDouble()).toString()
          4 ->  binding.textView.text = (ans / binding.textView.text.toString().toDouble()).toString()
        }
        if (binding.textView.text.toString().substringAfter(".") == "0") {binding.textView.text = binding.textView.text.dropLast(2)}
        binding.textView2.text = "ans = " + binding.textView.text
        ans = binding.textView.text.toString().toDouble()
        operationAns = 0
    }
    private fun tapC()  {

        binding.textView.text = "0"

        operationAns = 0
    }
}