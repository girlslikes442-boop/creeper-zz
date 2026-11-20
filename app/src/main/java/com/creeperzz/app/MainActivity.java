package com.creeperzz.app;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setStatusBarColor(android.graphics.Color.rgb(9,9,9));
        getWindow().setNavigationBarColor(android.graphics.Color.rgb(9,9,9));

        WebView web = new WebView(this);
        web.setBackgroundColor(android.graphics.Color.rgb(9,9,9));

        WebSettings settings = web.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(true);

        web.loadUrl("file:///android_asset/index.html");
        setContentView(web);
    }
}

