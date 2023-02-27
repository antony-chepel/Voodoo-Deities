package com.socialquantum.acityi.vccvcd
import com.socialquantum.acityi.zasadw.Saoixjuhcygysd.uhhuxc
import com.socialquantum.acityi.zasadw.Saoixjuhcygysd.ujchuvhu
import com.socialquantum.acityi.zasadw.Saoixjuhcygysd.vkkcioxokviduh
import com.socialquantum.acityi.zasadw.Saoixjuhcygysd.wpppwppspd
import com.socialquantum.acityi.qpoaosj.Zaoowiwjsuhxc
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named
import com.socialquantum.acityi.zasadw.Saoixjuhcygysd.palpspplok
import com.socialquantum.acityi.zasadw.Saoixjuhcygysd.pelpwlplwpe
import android.content.Context
import android.content.Intent
import com.socialquantum.acityi.zasadw.Saoixjuhcygysd.lsodpwokkojisuhhuxcgy
import com.socialquantum.acityi.zasadw.Saoixjuhcygysd.nncnjvijuhf
import android.content.SharedPreferences
import android.os.Build
import com.socialquantum.acityi.zasadw.Saoixjuhcygysd.bhxbhchshuhdhudf
import com.socialquantum.acityi.zasadw.Saoixjuhcygysd.doxoxopcovk
import com.socialquantum.acityi.zasadw.Saoixjuhcygysd.gcbbvbduijd
import android.os.Bundle
import com.socialquantum.acityi.zasadw.Saoixjuhcygysd.gcvyidjfkokookdsifj
import com.socialquantum.acityi.zasadw.Saoixjuhcygysd.hsuidiwkokoskod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import com.socialquantum.acityi.zasadw.Saoixjuhcygysd.jcjvnkdokfokkojidshufygy
import com.socialquantum.acityi.zasadw.Saoixjuhcygysd.owiwjiwokoksokdijxuch

import android.view.View
import com.socialquantum.acityi.zasadw.Saoixjuhcygysd.qplpqplwokkosokd
import com.socialquantum.acityi.zasadw.Saoixjuhcygysd.relplpepwoksokdaoijxcji
import android.view.ViewGroup
import com.appsflyer.AppsFlyerLib
import com.socialquantum.acityi.R

class Dapzpzoxixuhsd : Fragment() {
    private lateinit var vofofifjgfuh: Context
    val usijsjidwhu: SharedPreferences by inject(named("SharedPreferences"))


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.jjvnnvjcuh, container, false)
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        vofofifjgfuh = context
    }

    override fun onStart() {
        super.onStart()
        val hbxhbc = "com.socialquantum.acityi"
        val xoozixj = Build.VERSION.RELEASE
        val woksjiadjihuxc = usijsjidwhu.getString("appCamp", null)
        val oosospsox = usijsjidwhu.getString("mainId", null)

        val aopaaaposo = usijsjidwhu.getString(wpppwppspd, null)
        val uxhckkoxkozckos = Intent(activity, Zaoowiwjsuhxc::class.java)
        val uicocov = usijsjidwhu.getString(vkkcioxokviduh, null)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)
        val fije = usijsjidwhu.getString("deepSt", null)

        val ejiosoaokd = usijsjidwhu.getString(uhhuxc, null)
        val ncnjcjicjvduvhfh = AppsFlyerLib.getInstance().getAppsFlyerUID(vofofifjgfuh)
        val fokd = usijsjidwhu.getString(nncnjvijuhf, null)

        val okokejiijshuhuxgycgy: String? = usijsjidwhu.getString(qplpqplwokkosokd, null)
        usijsjidwhu.edit().putString(owiwjiwokoksokdijxuch, ncnjcjicjvduvhfh).apply()
        val bchijd = usijsjidwhu.getString(doxoxopcovk, null)
        val siowokkosjidhuxcgy = Intent(activity, Juoqoiishuxzc::class.java)



        val hcbjvjnduhfhijgijjiijfd = "$fokd$palpspplok$woksjiadjihuxc&$bhxbhchshuhdhudf$ncnjcjicjvduvhfh&$hsuidiwkokoskod$oosospsox&$lsodpwokkojisuhhuxcgy$hbxhbc&$ujchuvhu$xoozixj&$relplpepwoksokdaoijxcji$gcbbvbduijd"
        val ysyg = "$fokd$bhxbhchshuhdhudf$aopaaaposo&$hsuidiwkokoskod$okokejiijshuhuxgycgy&$lsodpwokkojisuhhuxcgy$hbxhbc&$ujchuvhu$xoozixj&$relplpepwoksokdaoijxcji$gcbbvbduijd"
        val iixoxkcscuuhdhu = "$fokd$palpspplok$fije&$bhxbhchshuhdhudf$ncnjcjicjvduvhfh&$hsuidiwkokoskod$oosospsox&$lsodpwokkojisuhhuxcgy$hbxhbc&$ujchuvhu$xoozixj&$relplpepwoksokdaoijxcji$gcvyidjfkokookdsifj"
        val gxcftt = "$fokd$palpspplok$fije&$bhxbhchshuhdhudf$aopaaaposo&$hsuidiwkokoskod$okokejiijshuhuxgycgy&$lsodpwokkojisuhhuxcgy$hbxhbc&$ujchuvhu$xoozixj&$relplpepwoksokdaoijxcji$gcvyidjfkokookdsifj"

        when(bchijd) {
            "1" ->
                if(woksjiadjihuxc!!.contains(pelpwlplwpe)) {
                    usijsjidwhu.edit().putString(jcjvnkdokfokkojidshufygy, hcbjvjnduhfhijgijjiijfd).apply()
                    usijsjidwhu.edit().putString("WebInt", "campaign").apply()
                    startActivity(uxhckkoxkozckos)
                    activity?.finish()
                } else if (fije!=null||ejiosoaokd!!.contains(uicocov.toString())) {
                    usijsjidwhu.edit().putString(jcjvnkdokfokkojidshufygy, iixoxkcscuuhdhu).apply()
                    usijsjidwhu.edit().putString("WebInt", "deepLink").apply()
                    startActivity(uxhckkoxkozckos)
                    activity?.finish()
                } else {
                    startActivity(siowokkosjidhuxcgy)
                    activity?.finish()
                }
            "0" ->
                if(fije!=null) {
                    usijsjidwhu.edit().putString(jcjvnkdokfokkojidshufygy, gxcftt).apply()
                    usijsjidwhu.edit().putString("WebInt", "deepLinkNOApps").apply()
                    startActivity(uxhckkoxkozckos)
                    activity?.finish()
                } else if (ejiosoaokd!!.contains(uicocov.toString())) {
                    usijsjidwhu.edit().putString(jcjvnkdokfokkojidshufygy, ysyg).apply()
                    usijsjidwhu.edit().putString("WebInt", "geo").apply()
                    startActivity(uxhckkoxkozckos)
                    activity?.finish()
                } else {
                    startActivity(siowokkosjidhuxcgy)
                    activity?.finish()
                }
        }
    }







}
