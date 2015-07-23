package com.mcwilliams.sample_cake_picker;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by joshuamcwilliams on 7/23/15.
 */
public class FullViewPicker extends AppCompatActivity {
    List<Variance> varianceList = new ArrayList<>();
    LinearLayout base;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.full_picker_view);

        varianceList = home.getVariances();
        base = (LinearLayout) findViewById(R.id.llScrollChild);

        createFullViewUi();
    }

    public void createFullViewUi (){
        for(Variance variance: varianceList){
//            LinearLayout llVariance = new LinearLayout(this);
//
            TextView varianceLabel = new TextView(this);
            varianceLabel.setText(variance.getVarianceName());
            varianceLabel.setPadding(20,40,0,0);
            varianceLabel.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
            base.addView(varianceLabel);

            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(this);
            horizontalScrollView.setHorizontalScrollBarEnabled(false);
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(LinearLayout.HORIZONTAL);

            for(Options options: variance.getVarianceOptions()) {

                final ImageView imageView = new ImageView(this);

                DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
                int width = displayMetrics.widthPixels/4;
                int height = displayMetrics.heightPixels/5;
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(width, height);
                imageView.setLayoutParams(params);
                imageView.setPadding(40, 40, 40, 40);
                imageView.setTag(options.getOptionName());
                Picasso.with(this).load(options.getOptionImage()).memoryPolicy(MemoryPolicy.NO_CACHE).into(imageView);

                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        imageView.setColorFilter(Color.argb(100, 136, 136, 136));
                        Toast.makeText(getBaseContext(), v.getTag().toString(), Toast.LENGTH_SHORT).show();
                    }
                });

                linearLayout.addView(imageView);
            }

            horizontalScrollView.addView(linearLayout);
            base.addView(horizontalScrollView);
        }




    }
}
