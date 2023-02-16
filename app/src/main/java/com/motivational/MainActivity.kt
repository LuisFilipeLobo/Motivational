package com.motivational

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.motivational.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Expandir o layout para ter acesso aos elementos de interface no código
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        // Esconder support action bar
        supportActionBar?.hide()

        binding.buttonNewPhrase.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        if (view.id == R.id.button_new_phrase) {
            TODO("Falta implementar")
        }
    }

}