package com.socialquantum.acityi.zasadw
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject
import android.app.Application
import android.webkit.WebSettings
import android.webkit.WebView
import android.content.pm.PackageManager
import androidx.lifecycle.ViewModel





class Nkixuyctfrvdc(isjxhuzcs: Application): ViewModel() {
    val nncxivjduhdhuv = isjxhuzcs.packageManager

    fun hvhvbcijvckodkkf(wpllpqpl: String) {
        OneSignal.setExternalUserId(
            wpllpqpl,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(hchgcygvgygyddsijjds: JSONObject) {
                    try {
                        if (hchgcygvgygyddsijjds.has("push") && hchgcygvgygyddsijjds.getJSONObject("push").has("success")) {
                            val bmmcmcix = hchgcygvgygyddsijjds.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $bmmcmcix"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (hchgcygvgygyddsijjds.has("email") && hchgcygvgygyddsijjds.getJSONObject("email").has("success")) {
                            val zpsokkxijcxi =
                                hchgcygvgygyddsijjds.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $zpsokkxijcxi"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (hchgcygvgygyddsijjds.has("sms") && hchgcygvgygyddsijjds.getJSONObject("sms").has("success")) {
                            val tywuwusjisjidijsd = hchgcygvgygyddsijjds.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $tywuwusjisjidijsd"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }


    fun rpepwllpskoskodijijx(bcbcxjvijdji: WebView): WebSettings{
        val dppwpwo = bcbcxjvijdji.settings
        dppwpwo.allowFileAccess = true
        dppwpwo.pluginState = WebSettings.PluginState.ON
        dppwpwo.allowFileAccess = true
        dppwpwo.mediaPlaybackRequiresUserGesture = false
        dppwpwo.allowContentAccess = true
        dppwpwo.useWideViewPort = true

        dppwpwo.displayZoomControls = false
        dppwpwo.cacheMode = WebSettings.LOAD_DEFAULT
        dppwpwo.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        dppwpwo.domStorageEnabled = true
        dppwpwo.userAgentString = dppwpwo.userAgentString.replace("; wv", "")
        dppwpwo.setSupportZoom(true)

        dppwpwo.setSupportMultipleWindows(false)
        dppwpwo.builtInZoomControls = true
        dppwpwo.javaScriptEnabled = true

        dppwpwo.javaScriptCanOpenWindowsAutomatically = true
        dppwpwo.loadWithOverviewMode = true
        dppwpwo.allowContentAccess = true

        return dppwpwo
    }



    fun hhcuxjivjidj(deklwlp: String): Boolean {
        try {
            nncxivjduhdhuv.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)
            return true
        } catch (_: PackageManager.NameNotFoundException) {

        }
        return false
    }






}