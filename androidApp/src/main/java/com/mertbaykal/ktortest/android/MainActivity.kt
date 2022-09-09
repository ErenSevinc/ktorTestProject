package com.mertbaykal.ktortest.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.mertbaykal.ktortest.CommonViewModel

class MainActivity : AppCompatActivity() {

    val viewModel: CommonViewModel by lazy {
        ViewModelProvider(this)[CommonViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)

    }
}
