package com.example.bai_tap_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtNhapA, edtNhapB;
    Button btnTiepTuc, btnGiaiPT, btnThoat;
    TextView txvKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControl();
    }

    private void addControl() {
        edtNhapA = (EditText) findViewById(R.id.edtNhapA);
        edtNhapB = (EditText) findViewById(R.id.edtNhapB);
        btnTiepTuc = (Button) findViewById(R.id.btnTiepTuc);
        btnGiaiPT = (Button) findViewById(R.id.btnGiaiPT);
        btnThoat = (Button) findViewById(R.id.btnThoat);
        txvKetQua = (TextView) findViewById(R.id.txvKetQua);
    }

    public void tiepTuc(View view) {
        edtNhapA.setText("0");
        edtNhapB.setText("0");
    }

    public void giaiPhuongTrinh(View view) {
        // lay du lieu
        String A = edtNhapA.getText().toString();
        String B = edtNhapB.getText().toString();
        int soA = new Integer(A).intValue();
        int soB = new Integer(B).intValue();

        // Giai va bien luan
        //Toast.makeText(MainActivity.this,((-1.0*soB)/soA)+"",Toast.LENGTH_SHORT).show();

        if (soA != 0) {
            txvKetQua.setText("Phương trình có nghiệm duy nhất: " + ((-1.0 * soB) / soA));
        } else {
            if (soB == 0) {
                txvKetQua.setText("Phương trình có vô số nghiệm!");
            } else {
                txvKetQua.setText("Phương trình vô nghiệm!");
            }
        }
    }

    public void thoat(View view) {
        finish();
    }
}