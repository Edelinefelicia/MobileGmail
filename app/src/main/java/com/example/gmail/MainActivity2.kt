package com.example.gmail

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.gmail.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            val pengirim = intent.getStringExtra("pengirim")
            val title = intent.getStringExtra("title")
            val isipesan = intent.getStringExtra("isipesan")
            val tanggal = intent.getStringExtra("tanggal")
            binding.tanggal.text = tanggal
            binding.namapengirim.text = pengirim
            binding.title.text = title
            binding.txtPesan.text = isipesan
            imageback.setOnClickListener{
                val intent = Intent(this@MainActivity2, MainActivity::class.java)
                startActivity(intent)
            }

        }
    }
}