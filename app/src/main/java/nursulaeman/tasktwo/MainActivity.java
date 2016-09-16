package nursulaeman.tasktwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.my_image_view);

        String url1 = "https://blog.wgs.co.id/wp-content/uploads/2015/12/Logo-Green-Grey.png";

        Glide.with(this)
                .load(url1)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView);

    }
}
