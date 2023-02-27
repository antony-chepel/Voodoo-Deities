package com.socialquantum.acityi.zasadw
import android.view.View
import androidx.navigation.fragment.findNavController
import android.view.ViewGroup
import com.socialquantum.acityi.R
import com.socialquantum.acityi.zasadw.Saoixjuhcygysd.vkkcioxokviduh
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import com.socialquantum.acityi.kicuvh.Grpepposkixjc


class Reoiwkosiuhxczsc : Fragment() {
    lateinit var jcjxnvjnidj: String
    val sokwok by activityViewModel<Grpepposkixjc>(named("MainModel"))
    private lateinit var sijdhudwijsaidj: Context

    val jcvhuuhcijxjicvd: SharedPreferences by inject(named("SharedPreferences"))

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        sokwok.foorkokoke.observe(viewLifecycleOwner) {
            if (it!=null) {
                jcjxnvjnidj = it.hxzuijjicxjivhu
                jcvhuuhcijxjicvd.edit().putString(vkkcioxokviduh, jcjxnvjnidj).apply()
                findNavController().navigate(R.id.jowowisadx)
            }
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        sijdhudwijsaidj = context
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.forokkofijvuhb, container, false)
    }









}