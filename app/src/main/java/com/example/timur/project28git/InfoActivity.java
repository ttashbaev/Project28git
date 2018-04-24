package com.example.timur.project28git;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * Created by Timur on 24.04.2018.
 */

public class InfoActivity extends AppCompatActivity implements OnClickListener{
    private Button btnShow;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        btnShow = findViewById(R.id.btnShow);
        btnShow.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        AlertDialog mDialog = new AlertDialog.Builder(this)
                .setMessage("Clicked")
                .setCancelable(true)
                .setPositiveButton("Click me", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                })
                .create();

        mDialog.show();
    }
}
