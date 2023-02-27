package com.socialquantum.acityi.kicuvh
import androidx.navigation.fragment.findNavController
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named
import android.view.ViewGroup
import com.socialquantum.acityi.R
import com.socialquantum.acityi.zasadw.Saoixjuhcygysd.doxoxopcovk


class Eqokskosdxmkc : Fragment() {
    val nncjvuhfdkofdo: SharedPreferences by inject(named("SharedPreferences"))

    val xpzxo by activityViewModel<Grpepposkixjc>(named("MainModel"))
    private lateinit var jvuuhgygygycx: Context

    lateinit var eppowkosijxjc: String


    override fun onAttach(context: Context) {
        super.onAttach(context)
        jvuuhgygygycx = context
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.xpspodehudfe, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val ucicxockvk = nncjvuhfdkofdo.getString(doxoxopcovk, null)
        val gowowpwp = nncjvuhfdkofdo.getString("appCamp", null)

        if (ucicxockvk=="1" &&gowowpwp == null) {
            xpzxo.bjvijbjijibuhuhfhuuhd(jvuuhgygygycx)
            xpzxo.wppaoksijxu.observe(viewLifecycleOwner) {
                if (it != null) {
                    eppowkosijxjc = it.toString()
                    nncjvuhfdkofdo.edit().putString("appCamp", eppowkosijxjc).apply()
                    findNavController().navigate(R.id.xpppwposijdws)
                }
            }
        } else {
            findNavController().navigate(R.id.xpppwposijdws)
        }
    }







}