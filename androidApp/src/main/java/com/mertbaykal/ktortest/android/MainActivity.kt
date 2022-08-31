package com.mertbaykal.ktortest.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mertbaykal.ktortest.Greeting
import android.widget.TextView
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    val mainScope = MainScope()
    val greeting = Greeting()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)

        mainScope.launch {
            kotlin.runCatching {
                tv.text = "Loading..."
                greeting.getPopularMovies()
            }
                .onSuccess {
                    tv.text = it
                }
                .onFailure { tv.text = "Error: ${it.localizedMessage}" }
        }
    }
}
