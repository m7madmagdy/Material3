package com.example.learn

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import com.example.learn.databinding.ActivityMainBinding
import com.example.learn.databinding.ActivityWebBinding

class WebActivity : AppCompatActivity() {
    lateinit var binding: ActivityWebBinding

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWebBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val webView = binding.webView

        webView.webViewClient = WebViewClient()

        webView.loadUrl("https://www.facebook.com/m7madmagdy99/")
        webView.settings.javaScriptEnabled = true
        webView.settings.setSupportZoom(true)


    }

    override fun onBackPressed() {
        val webView = binding.webView

        if (webView.canGoBack())
            webView.goBack()
        else
            super.onBackPressed()
    }
}