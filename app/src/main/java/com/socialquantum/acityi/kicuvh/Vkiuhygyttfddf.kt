package com.socialquantum.acityi.kicuvh
import com.socialquantum.acityi.zasadw.Saoixjuhcygysd.nncnjvijuhf
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.socialquantum.acityi.R
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named
import android.content.Context
import com.socialquantum.acityi.zasadw.Saoixjuhcygysd.uhhuxc
import com.socialquantum.acityi.zasadw.Saoixjuhcygysd




class Vkiuhygyttfddf : Fragment() {
    lateinit var bcncnc: String
    private lateinit var uxczgygysgytff: Context

    val xjxuxicjix by activityViewModel<Grpepposkixjc>(named("MainModel"))
    val qopqokw: SharedPreferences by inject(named("SharedPreferences"))
    lateinit var wokkos: String

    lateinit var xhucuhsgyscgy: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.cozoixyuhsydgw, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        xjxuxicjix.spapsokxcji.observe(viewLifecycleOwner) {
            if (it != null) {
                val main = it.toString()
                qopqokw.edit().putString("mainId", main).apply()
            }
        }

        xjxuxicjix.fooovocijjc.observe(viewLifecycleOwner) {
            if (it != null) {

                wokkos = it.ocodjifie
                xhucuhsgyscgy = it.sijdjiwijdwhuhusydygds
                bcncnc = it.okeokwjisijd

                qopqokw.edit().putString(uhhuxc, wokkos).apply()
                qopqokw.edit().putString(Saoixjuhcygysd.doxoxopcovk, xhucuhsgyscgy).apply()
                qopqokw.edit().putString(nncnjvijuhf, bcncnc).apply()

                findNavController().navigate(R.id.ncjxuxcijdsdw)
            }
        }
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        uxczgygysgytff = context
    }




}