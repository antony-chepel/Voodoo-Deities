package com.socialquantum.acityi.qpoaosj
import android.app.Application
import android.content.Context
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import com.socialquantum.acityi.kicuvh.hxjzcijvuhchv
import com.socialquantum.acityi.kicuvh.zpaooksoxjiuchsgycys
import com.socialquantum.acityi.zasadw.Saoixjuhcygysd.cjhvxnv
import com.socialquantum.acityi.zasadw.Saoixjuhcygysd.nncnvucgydjifjiigigfs
import com.socialquantum.acityi.zasadw.Saoixjuhcygysd.qplpqplwokkosokd
import com.socialquantum.acityi.zasadw.Saoixjuhcygysd.wpppwppspd

import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import java.util.*

class Kiwowksijxhuc: Application() {

    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(cjhvxnv)

        val uciicxo = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val wppwlqslsaokxc = getSharedPreferences("PREFS_NAME", 0)

        val bvjijiuhchx = MyTracker.getTrackerParams()
        val isuokwokowkkosjixhuc = MyTracker.getTrackerConfig()
        val fropepeppewlsad = MyTracker.getInstanceId(this)
        isuokwokowkkosjixhuc.isTrackingLaunchEnabled = true
        val bvjv = UUID.randomUUID().toString()

        if (wppwlqslsaokxc.getBoolean("my_first_time", true)) {
            bvjijiuhchx.setCustomUserId(bvjv)
            uciicxo.edit().putString(wpppwppspd, bvjv).apply()
            uciicxo.edit().putString(qplpqplwokkosokd, fropepeppewlsad).apply()
            wppwlqslsaokxc.edit().putBoolean("my_first_time", false).apply()
        } else {
            val bphlpflpdlpkodfk = uciicxo.getString(wpppwppspd, bvjv)
            bvjijiuhchx.setCustomUserId(bphlpflpdlpkodfk)
        }
        MyTracker.initTracker(nncnvucgydjifjiigigfs, this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@Kiwowksijxhuc)
            modules(
                listOf(
                    zpaooksoxjiuchsgycys, hxjzcijvuhchv
                )
            )
        }
    }
}