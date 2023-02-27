package com.socialquantum.acityi
import com.socialquantum.acityi.kicuvh.Grpepposkixjc
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    val dijisjijsij by viewModel<Grpepposkixjc>(named("MainModel"))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dijisjijsij.xzooxzisjdhush(this)
    }
}