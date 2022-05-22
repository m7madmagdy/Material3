package com.example.learn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.learn.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.facebook.setOnClickListener {
            startActivity(Intent(this, WebActivity::class.java))
        }

        binding.explicit.setOnClickListener {
            intent = Intent(this, ExplicitActivity::class.java)
            intent.putExtra("id",10)
            intent.putExtra("name","Mohamed Magdy")
            startActivity(intent)
        }
    }
}