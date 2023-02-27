package com.socialquantum.acityi.qpoaosj

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Toast
import com.socialquantum.acityi.R
import com.socialquantum.acityi.databinding.ActivityYwoqoosixzBinding
import com.socialquantum.acityi.kicuvh.Dwpqposixcs
import com.socialquantum.acityi.vccvcd.Juoqoiishuxzc
import kotlin.random.Random

class Ywoqoosixz : AppCompatActivity() {
    var cxuhuxcv: Int? = 0
    private var idijijsuhuxhchuzhucgy: CountDownTimer? = null
    private var sppwopwoksodjixzchuhux = false
    private lateinit var iocxokov : SharedPreferences
    private lateinit var icjvjijixvhuuhgygsd : SharedPreferences
    private lateinit var ncnjxjvuhusdij : ActivityYwoqoosixzBinding
    private var pwpppapasokxijczji = 5
    val bhbhcvxjidshuvhu = listOf(
        1.4,
        1.6,
        1.8,
        0.9,
        2.3,
        2.8,
        2.5,
        1.2,
        1.8,
        3.5,
        4.0,
        4.8,
    )
    private var ywuwiioq : Animation? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ncnjxjvuhusdij = ActivityYwoqoosixzBinding.inflate(layoutInflater)
        setContentView(ncnjxjvuhusdij.root)
        ywuwiioq = AnimationUtils.loadAnimation(applicationContext, R.anim.hjdiwiwusudw)
        iocxokov = getSharedPreferences("VODO_BALANCE", MODE_PRIVATE)
        cxuhuxcv = iocxokov.getInt(Dwpqposixcs.jidfjidfjiij.toString(), 1000)
        icjvjijixvhuuhgygsd = getSharedPreferences("win_res_vodo", Context.MODE_PRIVATE)
        ncnjxjvuhusdij.kodfkoko.text = cxuhuxcv.toString()
        ncnjxjvuhusdij.cnkxckvijhdhsgyygf.text = pwpppapasokxijczji.toString()
        eoowksjijdiaji()
        ncnjxjvuhusdij.imageView4.setOnClickListener {
            startActivity(Intent(this,Juoqoiishuxzc::class.java))
        }
        ncnjxjvuhusdij.fiifjdkokoasdko.setOnClickListener {
            if(cxuhuxcv!= 0){
                if(pwpppapasokxijczji<=cxuhuxcv!!){
                    cxuhuxcv = cxuhuxcv!!.minus(pwpppapasokxijczji)
                    ncnjxjvuhusdij.kodfkoko.text = cxuhuxcv.toString()
                    iocxokov.edit().putInt(Dwpqposixcs.jidfjidfjiij.toString(), cxuhuxcv!!).apply()

                    if(cxuhuxcv!!<0){
                        cxuhuxcv = 0
                        ncnjxjvuhusdij.kodfkoko.text = cxuhuxcv.toString()
                        iocxokov.edit().putInt(Dwpqposixcs.jidfjidfjiij.toString(), cxuhuxcv!!).apply()
                    }
                    swiiwosdkaoijxcjzuhczx()
                } else {
                    Toast.makeText(this, "Your balance is lower thant bet", Toast.LENGTH_SHORT).show()
                    pwpppapasokxijczji = 5
                    ncnjxjvuhusdij.cnkxckvijhdhsgyygf.text = pwpppapasokxijczji.toString()
                }

            } else {
                Toast.makeText(this, "Your balance is 0", Toast.LENGTH_SHORT).show()
            }
        }
    }


    private fun swiiwosdkaoijxcjzuhczx() = with(ncnjxjvuhusdij){
        var fopelwp = 0
        idijijsuhuxhchuzhucgy?.cancel()

        idijijsuhuxhchuzhucgy = object : CountDownTimer(10000, 500) {
            override fun onTick(millisUntilFinished: Long) {
                sppwopwoksodjixzchuhux = true
                fopelwp++
                fiifjdkokoasdko.isClickable = false
                fiifjdkokoasdko.alpha = 0.7f
                oxzkokozxc.isClickable = false
                lclkmvxjiuh.isClickable = false

                if(fopelwp>6) fopelwp = 0
                imVodoIt1.startAnimation(ywuwiioq)
                imVodoIt2.startAnimation(ywuwiioq)
                imVodoIt3.startAnimation(ywuwiioq)
                imVodoIt4.startAnimation(ywuwiioq)
                imVodoIt5.startAnimation(ywuwiioq)
                imVodoIt6.startAnimation(ywuwiioq)
                imVodoIt1.setImageResource(Dwpqposixcs.dokokskookxijjiczhuhuzxch[fopelwp])
                imVodoIt2.setImageResource(Dwpqposixcs.dokokskookxijjiczhuhuzxch[fopelwp])
                imVodoIt3.setImageResource(Dwpqposixcs.dokokskookxijjiczhuhuzxch[fopelwp])
                imVodoIt4.setImageResource(Dwpqposixcs.dokokskookxijjiczhuhuzxch[fopelwp])
                imVodoIt5.setImageResource(Dwpqposixcs.dokokskookxijjiczhuhuzxch[fopelwp])
                imVodoIt6.setImageResource(Dwpqposixcs.dokokskookxijjiczhuhuzxch[fopelwp])



            }

            override fun onFinish() {
                imVodoIt1.clearAnimation()
                imVodoIt2.clearAnimation()
                imVodoIt3.clearAnimation()
                imVodoIt4.clearAnimation()
                imVodoIt5.clearAnimation()
                imVodoIt6.clearAnimation()
                sppwopwoksodjixzchuhux = false
                fiifjdkokoasdko.isClickable = true
                fiifjdkokoasdko.alpha = 1.0f
                lclkmvxjiuh.isClickable = true
                oxzkokozxc.isClickable = true
                bvjcijchujifddssd()
            }

        }.start()
    }


    private fun eoowksjijdiaji() = with(ncnjxjvuhusdij){
        lclkmvxjiuh.setOnClickListener {
            if(cxuhuxcv!! > pwpppapasokxijczji){
                pwpppapasokxijczji +=5
                cnkxckvijhdhsgyygf.text = pwpppapasokxijczji.toString()
                if(pwpppapasokxijczji >= 200){
                    pwpppapasokxijczji = 5
                    cnkxckvijhdhsgyygf.text = pwpppapasokxijczji.toString()
                }
            } else {
                pwpppapasokxijczji = cxuhuxcv!!
                cnkxckvijhdhsgyygf.text = pwpppapasokxijczji.toString()
            }
        }

        oxzkokozxc.setOnClickListener {
            if(cxuhuxcv!! >= 5 ){
                if(pwpppapasokxijczji!=0){
                    pwpppapasokxijczji -=5
                    cnkxckvijhdhsgyygf.text = pwpppapasokxijczji.toString()
                } else {
                    pwpppapasokxijczji = 0
                    Toast.makeText(this@Ywoqoosixz, "Count set low", Toast.LENGTH_SHORT).show()
                }

            }
        }

    }


    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this, Juoqoiishuxzc::class.java))
    }

    private fun bvjcijchujifddssd() = with(ncnjxjvuhusdij){
        val ggdidsj = bhbhcvxjidshuvhu[Random.nextInt(12)]
        val sidjwjijidwjihusad = Dwpqposixcs.dokokskookxijjiczhuhuzxch[Random.nextInt(7)]
        val cioxjji = Dwpqposixcs.dokokskookxijjiczhuhuzxch[Random.nextInt(7)]
        val apasokaskokojixczygyxc = Dwpqposixcs.dokokskookxijjiczhuhuzxch[Random.nextInt(7)]
        val mmmcxncvjnuuchvhudsygvgysdvsd = Dwpqposixcs.dokokskookxijjiczhuhuzxch[Random.nextInt(7)]
        val eopwkos = Dwpqposixcs.dokokskookxijjiczhuhuzxch[Random.nextInt(7)]
        val uusijixzkoczkxo = Dwpqposixcs.dokokskookxijjiczhuhuzxch[Random.nextInt(7)]



        imVodoIt1.setImageResource(sidjwjijidwjihusad)
        imVodoIt2.setImageResource(cioxjji)
        imVodoIt3.setImageResource(mmmcxncvjnuuchvhudsygvgysdvsd)
        imVodoIt4.setImageResource(apasokaskokojixczygyxc)
        imVodoIt5.setImageResource(eopwkos)
        imVodoIt6.setImageResource(uusijixzkoczkxo)
        val bvuvcijjijijijif = icjvjijixvhuuhgygsd.getInt("win_res_vodo",0)
        val woksokadko = bvuvcijjijijijif + pwpppapasokxijczji * ggdidsj
        icjvjijixvhuuhgygsd.edit().putInt("win_res_vodo",woksokadko.toInt()).apply()
        cxuhuxcv = cxuhuxcv!!.plus(woksokadko.toInt())
        iocxokov.edit().putInt(Dwpqposixcs.jidfjidfjiij.toString(), cxuhuxcv!!).apply()

        ncnjxjvuhusdij.kodfkoko.text = cxuhuxcv.toString()
    }





    override fun onDestroy() {
        super.onDestroy()
        idijijsuhuxhchuzhucgy?.cancel()
    }
}