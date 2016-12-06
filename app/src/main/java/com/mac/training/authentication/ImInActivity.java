package com.mac.training.authentication;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.firebase.ui.auth.AuthUI;
import com.google.android.gms.tasks.OnCompleteListener;

import bolts.Task;

public class ImInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_im_in);
    }

    public void onSignOut(View view) {

            AuthUI.getInstance()
                    .signOut(this)

                    .addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull com.google.android.gms.tasks.Task<Void> task) {
                            // user is now signed out
                            startActivity(new Intent(ImInActivity.this, MainActivity.class));
                            finish();
                        }

                    });

    }
}
