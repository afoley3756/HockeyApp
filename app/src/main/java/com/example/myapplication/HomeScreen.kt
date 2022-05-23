package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        val button = findViewById<Button>(R.id.toSchedule) // Declares the button variable

        button.setOnClickListener {
            val buttonFunct = Intent(
                this,
                ScheduleScreen::class.java
            ) //this code sets the button on the opening loading screen to open to the home screen of the app.
            startActivity(buttonFunct) // This code tells the button to execute the above code
        }

        val rosterButton = findViewById<Button>(R.id.toRoster) // Declares the button variable

        rosterButton.setOnClickListener {
            val buttonFunct = Intent(
                this,
                rosterScreen::class.java
            ) //this code sets the button on the opening loading screen to open to the home screen of the app.
            startActivity(buttonFunct) // This code tells the button to execute the above code
        }

        val sponsorButton = findViewById<Button>(R.id.toSponsors) // Declares the button variable

        sponsorButton.setOnClickListener {
            val buttonFunct = Intent(
                this,
                SponsorsScreen::class.java
            ) //this code sets the button on the opening loading screen to open to the home screen of the app.
            startActivity(buttonFunct) // This code tells the button to execute the above code

        }
    }
}