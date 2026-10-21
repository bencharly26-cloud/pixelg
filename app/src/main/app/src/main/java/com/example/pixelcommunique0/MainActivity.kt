package com.example.pixelcommunique0

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.JavascriptInterface
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val webView = WebView(this)
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        webView.addJavascriptInterface(WebAppInterface(), "Android")
        webView.webViewClient = WebViewClient()
        webView.loadUrl("file:///android_asset/index.html")
        setContentView(webView)
    }

    class WebAppInterface {
        @JavascriptInterface
        fun sendMessage(message: String) {
            // Logique Bluetooth à brancher ici plus tard
        }
    }
}
```[cite: 4]

4. Clique sur le gros bouton vert en bas pour valider (**Valider les modifications**).

Dès que tu as cliqué sur valider, va tout de suite dans ton onglet **Actes** (Actions) en haut de la page : le robot aura relancé la machine tout seul. Dis-moi dès que tu vois le cercle jaune ou le crochet vert 🟢 !
