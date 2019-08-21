package com.example.parking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private val myParking: ArrayList<Slot> = ArrayList<Slot>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Slot1: Button = findViewById(R.id.slot1)
        val Slot2: Button = findViewById(R.id.slot2)
        val Slot3: Button = findViewById(R.id.slot3)

        for(i in 0..2){
            myParking.add( i, Slot("", "", ""))
        }

        findViewById<Button>(R.id.slot1).setOnClickListener {
            click()
        }

        findViewById<Button>(R.id.slot2).setOnClickListener {
            click2()
        }

        findViewById<Button>(R.id.slot3).setOnClickListener {
            click3()
        }
    }

    fun click() {
        val slot1 = findViewById<Button>(R.id.slot1)

        val aplate = findViewById<EditText>(R.id.plate)
        val aname = findViewById<EditText>(R.id.name)
        val abrand = findViewById<EditText>(R.id.brand)

        var id = aplate.text
        var name = aname.text
        var brand = abrand.text
        findViewById<Button>(R.id.updatebtn).setOnClickListener {
            myParking.add( 0, Slot(id.toString(), brand.toString(), name.toString()))
            slot1.setText(myParking.get(0).plate).toString()
            Log.d("register", myParking.get(0).plate).toString()
        }

    }

    fun click2() {
        val slot2 = findViewById<Button>(R.id.slot2)

        val aplate = findViewById<EditText>(R.id.plate)
        val aname = findViewById<EditText>(R.id.name)
        val abrand = findViewById<EditText>(R.id.brand)

        var id = aplate.text
        var name = aname.text
        var brand = abrand.text
        findViewById<Button>(R.id.updatebtn).setOnClickListener {
            myParking.add(1, Slot(id.toString(), brand.toString(), name.toString()))
            slot2.setText(myParking.get(1).plate).toString()
        }

    }

    fun click3() {
        val slot3 = findViewById<Button>(R.id.slot3)

        val aplate = findViewById<EditText>(R.id.plate)
        val aname = findViewById<EditText>(R.id.name)
        val abrand = findViewById<EditText>(R.id.brand)

        var id = aplate.text
        var name = aname.text
        var brand = abrand.text
        findViewById<Button>(R.id.updatebtn).setOnClickListener {
            myParking.add(2, Slot(id.toString(), brand.toString(), name.toString()))
            slot3.setText(myParking.get(2).plate).toString()
        }

    }


}

