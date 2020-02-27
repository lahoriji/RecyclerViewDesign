package com.example.recyclerviewdesign;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.provider.Settings;
        import android.webkit.WebChromeClient;
        import android.webkit.WebSettings;
        import android.webkit.WebView;
        import android.webkit.WebViewClient;
        import android.widget.Toast;

public class view extends AppCompatActivity {
  WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        webView  = findViewById(R.id.web);
        Intent it = getIntent();
        webView.loadUrl(it.getStringExtra("url"));
        webView.setWebViewClient(new WebViewClient());
        WebSettings  webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);


    }
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack();
        }else{
            super.onBackPressed();
        }
    }
}
