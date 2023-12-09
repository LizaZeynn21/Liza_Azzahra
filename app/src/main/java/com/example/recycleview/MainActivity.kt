package com.example.tugas_hadiah_modul

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.R
import com.example.recycleview.Resep
import com.example.recycleview.ResepAdapter

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resepList = listOf<Resep>(
            Resep(
                R.drawable.nasigoreng,
                "Nasi Goreng Kampung",
                "Nasi goreng adalah makanan berupa nasi yang digoreng dan dicampur dalam minyak goreng, margarin atau mentega. Biasanya ditambah kecap manis, bawang merah, bawang putih, asam jawa, lada dan bahan lainnya"
            ),

            Resep(
                R.drawable.miegoreng,
                "Mie Goreng",
                "Mi goreng berarti \"mi yang digoreng\" adalah hidangan mie yang dimasak dengan digoreng tumis khas Indonesia. Mi goreng juga populer dan juga digemari di Malaysia, dan Singapura."
            ),

            Resep(
                R.drawable.banglades,
                "Mie Banglades",
                "Mie Bangladesh adalah berupa olahan Indomie nyemek yang popouler di warung kopi alias warkop kota Medan. Namun, meski namanya mengandung unsur negara Bangladesh, tapi mie ini bukan berasal dari sana, melainkan dimasak menggunakan bumbu Aceh."
            ),

            Resep(
                R.drawable.rendang,
                "Rendang",
                "Rendang adalah salah satu masakan tradisional Minangkabau yang menggunakan daging dan santan kelapa sebagai bahan utama dengan kandungan bumbu yang kaya akan rempah-rempah."
            ),

            Resep(
                R.drawable.sotomedan,
                "Soto Medan",
                "Dalam satu sajian soto kita mendapatkan bihun, buncis, potongan ayam atau sapi cincang, telur rebus, tomat, bawang goreng, daun bawang, daun seledri dan kerupuk merah sebagai lauknya. Tidak lengkap rasanya jika anda berlibur kemedan tanpa menyantap salah satu hidangan khas kota medan ini."
            ),

            Resep(
                R.drawable.miesop,
                "Mi Sop",
                "Mie Sop ini merupakan makanan yang sangat populer bagi masyarakat Medan. Makanan ini berupa mi yang diberi kuah sop nikmat yang banyak diburu oleh masyarakat di sana maupun oleh wisatawan yang berkunjung ke Medan."
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_resep)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ResepAdapter(this,resepList){

        }
    }
}