package fathurrohman.cv.kurirgobang;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DetailPemesan extends AppCompatActivity {

    Button scan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pemesan);

        scan = findViewById(R.id.btnScan);
        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent scan = new Intent(DetailPemesan.this, Scan.class);
                startActivity(scan);
            }
        });
    }
}
