package id.ac.poilnema.framelayout

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() implements View.onClickListener {
    ImageView imgApple, imgWatermelon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imgApple = findViewById(R.id.apple);
        imgWatermelon = findViewById(R.id.watermelon);
        imgApple.setOnClickListener(this);
        imgWatermelon.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.apple;
                imgApple.setVisibility(view.GONE);
                imgWatermelon.setVisibility(View.VISIBLE);
            case R.id.watermelon;
            imgWatermelon.setVisibility(view.GONE);
            imgApple.setVisibility(View.VISIBLE);
        }
    }
}