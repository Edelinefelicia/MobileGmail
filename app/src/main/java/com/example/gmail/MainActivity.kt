package com.example.gmail

import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gmail.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val adapterDisaster = GmailAdapter(generateDummy()) { pesan ->
            val pengirim = pesan.pengirimPesan
            val title = pesan.titlePesan
            val isipesan = pesan.isiPesan
            val tanggal = pesan.tanggalPesan

            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            intent.putExtra("pengirim", pengirim)
            intent.putExtra("title", title)
            intent.putExtra("isipesan", isipesan)
            intent.putExtra("tanggal", tanggal)
            startActivity(intent)
        }
        with(binding) {
            rvPesan.apply {
                adapter = adapterDisaster
                layoutManager = LinearLayoutManager(this@MainActivity)
            }
        }
    }
    fun generateDummy(): List<PesanGmailModel> {
        return listOf(
            PesanGmailModel(titlePesan= "Pemberitahuan, sarapan gratis akan segera di mulai !", pengirimPesan = "fefefufu", tanggalPesan = "20/10/2024", isiPesan = "Pemberitahuan: Sarapan gratis akan segera dimulai! Kami mengundang semua tamu untuk bergabung dan menikmati hidangan pagi yang telah disediakan. Silakan menuju area sarapan yang telah ditentukan, dan nikmati pilihan menu yang tersedia. Pastikan untuk datang tepat waktu agar dapat menikmati sarapan bersama. Selamat menikmati!"),
            PesanGmailModel(titlePesan= "Pemberitahuan, sarapan gratis akan segera di mulai !", pengirimPesan = "Ronaldo", tanggalPesan = "20/10/2024", isiPesan = "Pemberitahuan: Sarapan gratis akan segera dimulai! Kami mengundang semua tamu untuk bergabung dan menikmati hidangan pagi yang telah disediakan. Silakan menuju area sarapan yang telah ditentukan, dan nikmati pilihan menu yang tersedia. Pastikan untuk datang tepat waktu agar dapat menikmati sarapan bersama. Selamat menikmati!"),
            PesanGmailModel(titlePesan= "Pemberitahuan, sarapan gratis akan segera di mulai !", pengirimPesan = "Messi", tanggalPesan = "20/10/2024", isiPesan = "Pemberitahuan: Sarapan gratis akan segera dimulai! Kami mengundang semua tamu untuk bergabung dan menikmati hidangan pagi yang telah disediakan. Silakan menuju area sarapan yang telah ditentukan, dan nikmati pilihan menu yang tersedia. Pastikan untuk datang tepat waktu agar dapat menikmati sarapan bersama. Selamat menikmati!"),
            PesanGmailModel(titlePesan= "Pemberitahuan, sarapan gratis akan segera di mulai !", pengirimPesan = "PT NGANG NGONG IND", tanggalPesan = "20/10/2024", isiPesan = "Pemberitahuan: Sarapan gratis akan segera dimulai! Kami mengundang semua tamu untuk bergabung dan menikmati hidangan pagi yang telah disediakan. Silakan menuju area sarapan yang telah ditentukan, dan nikmati pilihan menu yang tersedia. Pastikan untuk datang tepat waktu agar dapat menikmati sarapan bersama. Selamat menikmati!"),
            PesanGmailModel(titlePesan= "Pemberitahuan, sarapan gratis akan segera di mulai !", pengirimPesan = "fufufafa", tanggalPesan = "20/10/2024", isiPesan = "Pemberitahuan: Sarapan gratis akan segera dimulai! Kami mengundang semua tamu untuk bergabung dan menikmati hidangan pagi yang telah disediakan. Silakan menuju area sarapan yang telah ditentukan, dan nikmati pilihan menu yang tersedia. Pastikan untuk datang tepat waktu agar dapat menikmati sarapan bersama. Selamat menikmati!"),
            PesanGmailModel(titlePesan= "Pemberitahuan, sarapan gratis akan segera di mulai !", pengirimPesan = "fufufafa", tanggalPesan = "20/10/2024", isiPesan = "Pemberitahuan: Sarapan gratis akan segera dimulai! Kami mengundang semua tamu untuk bergabung dan menikmati hidangan pagi yang telah disediakan. Silakan menuju area sarapan yang telah ditentukan, dan nikmati pilihan menu yang tersedia. Pastikan untuk datang tepat waktu agar dapat menikmati sarapan bersama. Selamat menikmati!"),
            PesanGmailModel(titlePesan= "Pemberitahuan, sarapan gratis akan segera di mulai !", pengirimPesan = "fufufafa", tanggalPesan = "20/10/2024", isiPesan = "Pemberitahuan: Sarapan gratis akan segera dimulai! Kami mengundang semua tamu untuk bergabung dan menikmati hidangan pagi yang telah disediakan. Silakan menuju area sarapan yang telah ditentukan, dan nikmati pilihan menu yang tersedia. Pastikan untuk datang tepat waktu agar dapat menikmati sarapan bersama. Selamat menikmati!"),
            PesanGmailModel(titlePesan= "Pemberitahuan, sarapan gratis akan segera di mulai !", pengirimPesan = "fufufafa", tanggalPesan = "20/10/2024", isiPesan = "Pemberitahuan: Sarapan gratis akan segera dimulai! Kami mengundang semua tamu untuk bergabung dan menikmati hidangan pagi yang telah disediakan. Silakan menuju area sarapan yang telah ditentukan, dan nikmati pilihan menu yang tersedia. Pastikan untuk datang tepat waktu agar dapat menikmati sarapan bersama. Selamat menikmati!"),
            )
    }
}