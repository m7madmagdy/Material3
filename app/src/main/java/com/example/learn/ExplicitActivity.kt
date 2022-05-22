package com.example.learn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.learn.databinding.ActivityExplicitBinding

class ExplicitActivity : AppCompatActivity() {
    lateinit var binding: ActivityExplicitBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExplicitBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras

        val id = bundle?.get("id").toString()
        val name = bundle?.get("name").toString()

        binding.id.setText(id)
        binding.name.setText(name)

    }
}