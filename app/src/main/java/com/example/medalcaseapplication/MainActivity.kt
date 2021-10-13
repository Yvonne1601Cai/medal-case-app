package com.example.medalcaseapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataSet = arrayOf(AchievementsSection("Personal Records", personalRecords(resources)),
                                AchievementsSection("Virtual Races", virtualRaces(resources))
                            )

        val achievementsSectionAdapter = AchievementsSectionAdapter(dataSet)
        val recyclerView: RecyclerView = findViewById(R.id.achievements_list_recyclerView)
        recyclerView.adapter = achievementsSectionAdapter

    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_settings -> {
            // User chose the "Settings" item, show the app settings UI...
            val toast = Toast.makeText(applicationContext, "settings clicked", Toast.LENGTH_LONG)
            toast.show()
            true
        }
        else -> {
            // If we got here, the user's action was not recognized.
            // Invoke the superclass to handle it.
            super.onOptionsItemSelected(item)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        getMenuInflater().inflate(R.menu.action_bar_menu, menu);
        return super.onCreateOptionsMenu(menu)
    }
}