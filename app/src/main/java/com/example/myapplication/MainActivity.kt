package com.example.myapplication


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button //imports the button classes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.openButton) // Declares the button variable

        button.setOnClickListener{
            val buttonFunct = Intent(this, HomeScreen::class.java) //this code sets the button on the opening loading screen to open to the home screen of the app.
            startActivity(buttonFunct) // This code tells the button to execute the above code
        }

    }
}