package com.example.empoweringthenationsapp

import android.content.Intent
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Contact : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        val contactPageButton = findViewById<Button>(R.id.backhomeButton)
        contactPageButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val contactEnrollButton = findViewById<Button>(R.id.contactEnroll)
        contactEnrollButton.setOnClickListener {
            val intent = Intent(this, CalculateTotalFees::class.java)
            startActivity(intent)
        }

        // WebView configurations
        val webView1 = findViewById<WebView>(R.id.webView1)
        val webView2 = findViewById<WebView>(R.id.webView2)
        val webView3 = findViewById<WebView>(R.id.webView3)

        setupWebView(webView1, "https://maps.google.com/?q=The+IIE's+Varsity+College+-+Pretoria")
        setupWebView(webView2, "https://maps.google.com/?q=The+IIE's+Varsity+College+-+Waterfall-Midrand")
        setupWebView(webView3, "https://maps.google.com/?q=The+IIE's+Varsity+College+-+Sandton")
    }

    private fun setupWebView(webView: WebView, url: String) {
        webView.webViewClient = WebViewClient()
        val settings: WebSettings = webView.settings
        settings.javaScriptEnabled = true
        webView.loadUrl(url)
    }
}
