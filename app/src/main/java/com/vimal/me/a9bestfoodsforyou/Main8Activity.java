package com.vimal.me.a9bestfoodsforyou;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class Main8Activity extends AppCompatActivity {

    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

// Prepare the Interstitial Ad
        interstitial = new InterstitialAd(Main8Activity.this);
// Insert the Ad Unit ID
        interstitial.setAdUnitId(getString(R.string.interstitial_id));

        interstitial.loadAd(adRequest);
// Prepare an Interstitial Ad Listener
        interstitial.setAdListener(new AdListener() {
            public void onAdLoaded() {
                // Call displayInterstitial() function
                displayInterstitial();
            }
        });


        Button btnh = (Button) findViewById(R.id.btnh);
        Button btne = (Button) findViewById(R.id.btne);

        btne.setOnClickListener(new View.OnClickListener()

        {
            @Override

            public void onClick(View view) {
                Intent int8 = new Intent(Main8Activity.this, MainActivity.class);
                startActivity(int8);
            }
        });

        btnh.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Intent int9 = new Intent(Main8Activity.this, Mainhindi.class);
                startActivity(int9);
            }
        });

    }

    public void displayInterstitial() {
// If Ads are loaded, show Interstitial else show nothing.
        if (interstitial.isLoaded()) {
            interstitial.show();
        }
    }

}