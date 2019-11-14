package tr.com.mertkolgu.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imageView = findViewById(R.id.imageView);
        TextView landmarkNameText = findViewById(R.id.textLandmarkName);
        TextView countryNameText = findViewById(R.id.textCountryName);

        // intent ile diğer activity üzerinden gelen verileri alıyoruz
        Intent intent = getIntent();

        String landmarName = intent.getStringExtra("name");
        landmarkNameText.setText(landmarName);

        String countryName = intent.getStringExtra("country");
        countryNameText.setText(countryName);

        Singleton singleton = Singleton.getInstance();
        imageView.setImageBitmap(singleton.getChosenImage());
    }
}
