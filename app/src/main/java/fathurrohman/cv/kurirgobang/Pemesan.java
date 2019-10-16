package fathurrohman.cv.kurirgobang;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Objects;

import fathurrohman.cv.kurirgobang.Adapter.CustomAdapter;

public class Pemesan extends AppCompatActivity {

    RecyclerView recyclerView;
    CustomAdapter adapter;
    private ArrayList<CustomPesan> listContentArr = new ArrayList<>();
    private Context context = Pemesan.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemesan);
        if (ContextCompat.checkSelfPermission(Objects.requireNonNull(context), Manifest.permission.CAMERA)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.CAMERA}, 50);
        }
        recyclerView = findViewById(R.id.rvPemesan);


        listContentArr.add(new CustomPesan("rafli", "di proses", "klahang"));
        listContentArr.add(new CustomPesan("fathur", "di proses", "klahang"));
        listContentArr.add(new CustomPesan("firdaus", "di proses", "klahang"));
        listContentArr.add(new CustomPesan("rohman", "di proses", "klahang"));

        recyclerView.setLayoutManager(new LinearLayoutManager(context, RecyclerView.VERTICAL, false));
        adapter = new CustomAdapter(context, listContentArr);
        recyclerView.setAdapter(adapter);

    }
}
