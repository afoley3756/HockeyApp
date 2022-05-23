
package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SponsorsScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sponsors_screen)

        val sponsorBack = findViewById<Button>(R.id.fromSponsor) // Declares the button variable

        sponsorBack.setOnClickListener {
            val buttonFunct = Intent(
                this,
                HomeScreen::class.java
            ) //this code sets the button on the opening loading screen to open to the home screen of the app.
            startActivity(buttonFunct) // This code tells the button to execute the above code

        }
    }



}