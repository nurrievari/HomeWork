package ml.bimdev.homework1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        findViewById(R.id.button).setOnClickListener(v -> {
            Intent intent = new Intent(this, FourthActivity.class);
            startActivity(intent);
        });
    }
}
