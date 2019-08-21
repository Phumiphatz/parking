package com.example.parking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val slot1: Button = findViewById(R.id.slot1)
        val slot2: Button = findViewById(R.id.slot2)
        val slot3: Button = findViewById(R.id.slot3)

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

        val plate = findViewById<EditText>(R.id.plate)
        val name = findViewById<EditText>(R.id.name)
        val brand = findViewById<EditText>(R.id.brand)

        var id = plate.text
        var name = name.text
        var brand = brand.text
        findViewById<Button>(R.id.updatebtn).setOnClickListener {
            myParking.add( 0, Slot(id.toString(), brand.toString(), name.toString()))
            slot1.setText(myParking.get(0).register).toString()
            Log.d("register", myParking.get(0).register).toString()
        }

    }

    fun click2() {
        val slot2 = findViewById<Button>(R.id.slot2)

        val plate  = findViewById<EditText>(R.id.plate)
        val name = findViewById<EditText>(R.id.name)
        val brand = findViewById<EditText>(R.id.brand)

        var id = plate.text
        var name = name.text
        var brand = brand.text
        findViewById<Button>(R.id.updatebtn).setOnClickListener {
            myParking.add(1, Slot(id.toString(), brand.toString(), name.toString()))
            slot2.setText(myParking.get(1).register).toString()
        }

    }

    fun click3() {
        val slot3 = findViewById<Button>(R.id.slot3)

        val plate  = findViewById<EditText>(R.id.plate)
        val name = findViewById<EditText>(R.id.name)
        val brand = findViewById<EditText>(R.id.brand))

        var id = plate.text
        var name = name.text
        var brand = brand.text
        findViewById<Button>(R.id.updatebtn).setOnClickListener {
            myParking.add(2, Slot(id.toString(), brand.toString(), name.toString()))
            slot3.setText(myParking.get(2).register).toString()
        }

    }


}
}
