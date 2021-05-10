package com.sg.layam20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_mad_detail.*

class MadDetailActivity : AppCompatActivity() {

    lateinit var madName: String
    lateinit var madAdress: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mad_detail)
        madName = intent.getStringExtra(MAD_NAME)
        madAdress = intent.getStringExtra(MAD_ADRESS)
        showMad()
    }

    private fun showMad() {
        madName_id.text = madName
        webView.loadUrl(madAdress)

        webView.settings.javaScriptEnabled = true
        webView.settings.builtInZoomControls=true
        webView.webViewClient = WebViewClient()


       /* val webViewSettings = webView.settings
        webViewSettings.javaScriptEnabled = true
        webViewSettings.builtInZoomControls = true
        webView.webViewClient = object : WebViewClient() {
            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)
            }
        }*/
    }
}


