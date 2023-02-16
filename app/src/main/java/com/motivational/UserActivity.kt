package com.motivational

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.motivational.databinding.ActivityMainBinding

class UserActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        supportActionBar?.hide()

        // Botão
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}