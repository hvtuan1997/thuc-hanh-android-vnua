package com.example.nd5_nd6_findviewbyid_view_basic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnDoiMau;
    TextView txvMauChu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControl();
    }

    private void addControl() {
        btnDoiMau = (Button) findViewById(R.id.btnDoiMau);
        txvMauChu = (TextView) findViewById(R.id.txvMauChu);
    }

    public void doiMau(View view) {
        txvMauChu.setTextColor(getResources().getColor(R.color.color_red));
    }
}