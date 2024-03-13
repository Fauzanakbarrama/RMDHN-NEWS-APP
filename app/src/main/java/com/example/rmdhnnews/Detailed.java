package com.example.rmdhnnews;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.squareup.picasso.Picasso;

public class Detailed extends AppCompatActivity {

    TextView txTitle, txSource, txDate, txDesc;
    ImageView imageView;
    WebView wbView;
    ProgressBar pgBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        txTitle = findViewById(R.id.txtTitle);
        txSource = findViewById(R.id.txtSource);
        txDate = findViewById(R.id.txtDate);
        txDesc = findViewById(R.id.txtDesc);

        imageView = findViewById(R.id.imgItems);

        wbView = findViewById(R.id.webView);

        pgBar = findViewById(R.id.wbViewLoader);
        pgBar.setVisibility(View.VISIBLE);

        Intent a = getIntent();
        String title = a.getStringExtra("title");
        String source = a.getStringExtra("source");
        String date = a.getStringExtra("date");
        String desc = a.getStringExtra("desc");
        String imageUrl = a.getStringExtra("imageUrl");
        String url = a.getStringExtra("url");

        txTitle.setText(title);
        txSource.setText(source);
        txDate.setText(date);
        txDesc.setText(desc);

        Picasso.with(Detailed.this).load(imageUrl).into(imageView);

        wbView.getSettings().setDomStorageEnabled(true);
        wbView.getSettings().setJavaScriptEnabled(true);
        wbView.getSettings().setLoadsImagesAutomatically(true);
        wbView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wbView.setWebViewClient(new WebViewClient());
        wbView.loadUrl(url);

        if (wbView.isShown()){
            pgBar.setVisibility(View.VISIBLE);
        }
    }
}