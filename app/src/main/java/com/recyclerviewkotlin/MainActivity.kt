package com.recyclerviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object { val INTENT_PARCELABLE = "Intent_Data"}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.de_gea,
                "David De Gea",
                "De gea adalah kiper dari Manchester United hingga sekarang dan merupakan" +
                        "kiper terbaik di dunia"
            ),
            Superhero(
                R.drawable.messi,
                "Lionel Messi",
                "Messi merupakan pemain yang berkebangsaan Argentina dan ia membela" +
                        "timnas Argentina saat piala dunia dan berhasil membawa argentina juara"
            ),
            Superhero(
                R.drawable.neymar,
                "Neymar da Silva Santos Junior",
                "Neymar da Silva Santos Junior atau biasa dipanggil neymar ini lahir di Brazil" +
                        "dan sekarang bermain untuk tim PSG atau Paris Saint German dengan bayaran yang fantastis"
            ),
            Superhero(
                R.drawable.rashford,
                "Marcus Rashford",
                "Pemain dari inggris yang satu ini memiliki kelincahan dan ketepatan operan bola yang bagus," +
                        "ia merupakan pemain Manchester United yang diasuh oleh Jose Maurinho"
            ),
            Superhero(
                R.drawable.salah,
                "Mohammed Salah",
                "Salah merupakan bintang dari Liverpool dan telah memiliki banyak penghargaan" +
                        "sepanjang karirnya sebagai pemain sepak bola professional.Selama hidupnya ia" +
                        " pernah memasuki club-club besar seperti AS Roma,Chelsea,dan sekarang Liverpool" +
                        "Dia adalah salah satu pemain sepakbola terhebat di dunia"
            ),
            Superhero(
                R.drawable.van_dijk,
                "Virgil Van Dijk",
                "Virgil adalah pemain berkebangsaan Belanda yang bermain untuk club Liverpool" +
                        ".Van Dijk adalah pemain bertubuh besar tinggi yang bermain sebagai back tengah " +
                        "dan merupakan center back terbaik "
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rvHero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this,superheroList){
            val intent = Intent(this,DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE,it)
            startActivity(intent)

        }
    }
}