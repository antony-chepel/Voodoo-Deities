package com.socialquantum.acityi.vccvcd

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.socialquantum.acityi.databinding.ActivityJuoqoiishuxzcBinding
import com.socialquantum.acityi.kicuvh.Dwpqposixcs
import com.socialquantum.acityi.qpoaosj.Ywoqoosixz

class Juoqoiishuxzc : AppCompatActivity() {
    private lateinit var sdijjia : SharedPreferences
    private lateinit var xijc : ActivityJuoqoiishuxzcBinding
    var sokdwkooksjidajihux: Int? = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        xijc = ActivityJuoqoiishuxzcBinding.inflate(layoutInflater)
        setContentView(xijc.root)
        sdijjia = getSharedPreferences("VODO_BALANCE", MODE_PRIVATE)
        sokdwkooksjidajihux = sdijjia.getInt(Dwpqposixcs.jidfjidfjiij.toString(), 1000)
        srwqqoiskajsd()
    }


    private fun srwqqoiskajsd() = with(xijc){
        chuxvjiji.setOnClickListener {
            finishAffinity()
        }

        oowpqpkos.setOnClickListener {
            startActivity(Intent(this@Juoqoiishuxzc,Krwuuijisdxc::class.java))
        }



        bvcikodkoifjjied.setOnClickListener {
            startActivity(Intent(this@Juoqoiishuxzc,Ywoqoosixz::class.java))
        }

        kodfkoko.text = sokdwkooksjidajihux.toString()

    }


    override fun onBackPressed() {
        super.onBackPressed()
        finishAffinity()
    }
}