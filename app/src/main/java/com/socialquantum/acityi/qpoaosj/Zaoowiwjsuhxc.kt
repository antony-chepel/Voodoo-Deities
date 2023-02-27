package com.socialquantum.acityi.qpoaosj
import android.webkit.*
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.io.IOException
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import org.koin.core.qualifier.named
import java.io.File
import android.content.Intent
import java.text.SimpleDateFormat
import java.util.*
import android.net.Uri
import com.socialquantum.acityi.zasadw.Saoixjuhcygysd.owiwjiwokoksokdijxuch
import com.socialquantum.acityi.zasadw.Saoixjuhcygysd.wpppwppspd
import android.os.Looper
import android.provider.MediaStore
import com.socialquantum.acityi.zasadw.Saoixjuhcygysd.jcjvnkdokfokkojidshufygy
import android.os.Bundle
import android.os.Environment
import android.os.Handler
import android.util.Log
import android.widget.Toast
import com.socialquantum.acityi.zasadw.Nkixuyctfrvdc


class Zaoowiwjsuhxc : AppCompatActivity() {
    lateinit var delppldpl: WebView
    private var gijtijrij = false
    private var vokckkokocxjivji: ValueCallback<Array<Uri>>? = null
    private val sudijjis by viewModel<Nkixuyctfrvdc>(
        named("BeamModel")
    )
    var cuhvhu = ""
    private var apslplaps: String? = null
    private  val sokdokdowkijijsdji = 1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        delppldpl = WebView(this)
        setContentView(delppldpl)
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(delppldpl, true)
        sudijjis.rpepwllpskoskodijijx(delppldpl)

        delppldpl.webViewClient = Twowoooskoxkocjiz()
        delppldpl.webChromeClient = Twowkokskojixijczij()
        delppldpl.loadUrl(sijdwji())
    }


    inner class Twowkokskojixijczij : WebChromeClient() {

        override fun onShowFileChooser(
            dsfok: WebView?,
            uhxc: ValueCallback<Array<Uri>>?,
            sidokwokkods: FileChooserParams?
        ): Boolean {
            vokckkokocxjivji?.onReceiveValue(null)
            vokckkokocxjivji = uhxc
            var ncjxjnvhudji: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (ncjxjnvhudji!!.resolveActivity(packageManager) != null) {
                var fpelplpspl: File? = null
                try {
                    fpelplpspl = gpppcppvok()
                    ncjxjnvhudji.putExtra("PhotoPath", apslplaps)
                } catch (ex: IOException) {
                    Log.e("ErrorOccurred", "Unable to create Image File", ex)
                }

                if (fpelplpspl != null) {
                    apslplaps = "file:" + fpelplpspl.absolutePath
                    ncjxjnvhudji.putExtra(
                        MediaStore.EXTRA_OUTPUT,
                        Uri.fromFile(fpelplpspl)
                    )
                } else {
                    ncjxjnvhudji = null
                }
            }
            val cijvijhuhuxhuhu = Intent(Intent.ACTION_GET_CONTENT)
            cijvijhuhuxhuhu.addCategory(Intent.CATEGORY_OPENABLE)
            cijvijhuhuxhuhu.type = "image/*"
            val pqpqppow: Array<Intent?> = ncjxjnvhudji?.let { arrayOf(it) } ?: arrayOfNulls(0)
            val bbcvjvdokdov = Intent(Intent.ACTION_CHOOSER)
            bbcvjvdokdov.putExtra(Intent.EXTRA_INTENT, cijvijhuhuxhuhu)
            bbcvjvdokdov.putExtra(Intent.EXTRA_TITLE, "Image Chooser")
            bbcvjvdokdov.putExtra(Intent.EXTRA_INITIAL_INTENTS, pqpqppow)
            startActivityForResult(bbcvjvdokdov, sokdokdowkijijsdji)
            return true
        }

        fun gpppcppvok(): File? {
            val fkore = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            val eplwlpwlpskodkoixcj = "JPEG_" + fkore + "_"
            val ncnnvjijjidfhuhfud = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES
            )
            return File.createTempFile(
                eplwlpwlpskodkoixcj,
                ".jpg",
                ncnnvjijjidfhuhfud
            )
        }
    }


    fun gokorkekosd(cyvyxg: String?) {
        if (!cyvyxg!!.contains("t.me")) {

            if (cuhvhu == "") {
                cuhvhu = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    cyvyxg
                ).toString()

                val pwllplp = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
                val xicjzkokozxkojis = pwllplp.edit()
                xicjzkokozxkojis.putString("SAVED_URL", cyvyxg)
                xicjzkokozxkojis.apply()
            }
        }
    }




    override fun onActivityResult(hbvbhcjcijic: Int, wpqlpqpllslad: Int, cyxvhux: Intent?) {

        if (hbvbhcjcijic != sokdokdowkijijsdji || vokckkokocxjivji == null) {
            super.onActivityResult(hbvbhcjcijic, wpqlpqpllslad, cyxvhux)
            return
        }
        var sdjiisj: Array<Uri>? = null

        if (wpqlpqpllslad == RESULT_OK) {
            if (cyxvhux == null) {
                if (apslplaps != null) {
                    sdjiisj = arrayOf(Uri.parse(apslplaps))
                }
            } else {
                val xicijxjikxkcji = cyxvhux.dataString
                if (xicijxjikxkcji != null) {
                    sdjiisj = arrayOf(Uri.parse(xicijxjikxkcji))
                }
            }
        }
        vokckkokocxjivji!!.onReceiveValue(sdjiisj)
        vokckkokocxjivji = null
        return
    }

    inner class Twowoooskoxkocjiz: WebViewClient() {
        override fun shouldOverrideUrlLoading(view: WebView?, url: String): Boolean {
            try {
                if (URLUtil.isNetworkUrl(url)) {
                    return false
                }
                if (sudijjis.hhcuxjivjidj(url)) {

                    val bkovko = Intent(Intent.ACTION_VIEW)
                    bkovko.data = Uri.parse(url)
                    startActivity(bkovko)
                } else {

                    Toast.makeText(
                        applicationContext,
                        "Application is not installed",
                        Toast.LENGTH_LONG
                    ).show()
                    startActivity(
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                        )
                    )
                }
                return true
            } catch (e: Exception) {
                return false
            }
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            gokorkekosd(url)
        }


        override fun onReceivedError(
            view: WebView?,
            errorCode: Int,
            description: String?,
            failingUrl: String?
        ) {
            Toast.makeText(this@Zaoowiwjsuhxc, description, Toast.LENGTH_SHORT).show()
        }
    }

    private fun sijdwji(): String {

        val fokkocx = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
        val wijjisdkkokoxokco = getSharedPreferences("SHARED_PREF",
            Context.MODE_PRIVATE)
        val aplpspkoxo = wijjisdkkokoxokco.getString(wpppwppspd, null)
        val uxchjizixicj = wijjisdkkokoxokco.getString(owiwjiwokoksokdijxuch, null)
        val hcbbhvijd = wijjisdkkokoxokco.getString(jcjvnkdokfokkojidshufygy, null)





        when (wijjisdkkokoxokco.getString("WebInt", null)) {
            "campaign" -> {
                sudijjis.hvhvbcijvckodkkf(uxchjizixicj.toString())
            }
            "deepLink" -> {
                sudijjis.hvhvbcijvckodkkf(uxchjizixicj.toString())
            }
            "deepLinkNOApps" -> {
                sudijjis.hvhvbcijvckodkkf(aplpspkoxo.toString())
            }
            "geo" -> {
                sudijjis.hvhvbcijvckodkkf(aplpspkoxo.toString())
            }
        }
        return fokkocx.getString("SAVED_URL", hcbbhvijd).toString()
    }

    override fun onBackPressed() {

        if (delppldpl.canGoBack()) {
            if (gijtijrij) {
                delppldpl.stopLoading()
                delppldpl.loadUrl(cuhvhu)
            }
            this.gijtijrij = true
            delppldpl.goBack()
            Handler(Looper.getMainLooper()).postDelayed({
                gijtijrij = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }

}

