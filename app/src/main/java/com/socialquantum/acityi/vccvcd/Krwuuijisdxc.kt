package com.socialquantum.acityi.vccvcd

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.socialquantum.acityi.databinding.ActivityKrwuuijisdxcBinding
import com.socialquantum.acityi.kicuvh.Dwpqposixcs

class Krwuuijisdxc : AppCompatActivity() {
    private lateinit var sjidiwjjijisdo : SharedPreferences
    private lateinit var chvuhchxv : ActivityKrwuuijisdxcBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        chvuhchxv = ActivityKrwuuijisdxcBinding.inflate(layoutInflater)
        setContentView(chvuhchxv.root)
        sjidiwjjijisdo = getSharedPreferences("VODO_BALANCE", MODE_PRIVATE)
        bcuhxgyd()
    }



    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this, Juoqoiishuxzc::class.java))
    }


    private fun bcuhxgyd() = with(chvuhchxv){
        sdjiwji.setOnClickListener {
            sjidiwjjijisdo.edit().putInt(Dwpqposixcs.jidfjidfjiij.toString(),1000).apply()
            Snackbar.make(chvuhchxv.root,"Your balance refresh to default", Snackbar.LENGTH_SHORT).show()
        }

        goofokodjisji.setOnClickListener {
            startActivity(Intent(this@Krwuuijisdxc,Juoqoiishuxzc::class.java))
        }


        jijsjidok.setOnClickListener {
            val currblnce = sjidiwjjijisdo.getInt(Dwpqposixcs.jidfjidfjiij.toString(),1000)
            if(currblnce<=500){
                Snackbar.make(chvuhchxv.root,"Your balance is already low", Snackbar.LENGTH_SHORT).show()
            } else {
                val ckkxmvuijufhd = currblnce - 500
                sjidiwjjijisdo.edit().putInt(Dwpqposixcs.jidfjidfjiij.toString(),ckkxmvuijufhd).apply()
                Snackbar.make(chvuhchxv.root,"To current balance -500 points", Snackbar.LENGTH_SHORT).show()
            }


        }

    }


}