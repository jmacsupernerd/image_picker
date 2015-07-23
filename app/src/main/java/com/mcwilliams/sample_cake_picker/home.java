package com.mcwilliams.sample_cake_picker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onFullView(View view){
        Intent intent = new Intent(this, FullViewPicker.class);
        startActivity(intent);
    }


    public static List<Variance> getVariances(){
        List<Variance> varianceList = new ArrayList<>();

        Options chocolate = new Options("Chocolate/White", "https://images.heb.com/is/image/HEBGrocery/android-product-list-high/cake-flavor-cfl00671.jpg");
        Options marble = new Options("Marble", "https://images.heb.com/is/image/HEBGrocery/android-product-list-high/cake-flavor-cfl00672.jpg");
        Options strawberry = new Options("Strawberry", "https://images.heb.com/is/image/HEBGrocery/android-product-list-high/cake-flavor-cfl00680.jpg");
        Options white = new Options("White","https://images.heb.com/is/image/HEBGrocery/android-product-list-high/cake-flavor-cfl00683.jpg");
        Options yellow = new Options("Yellow","https://images.heb.com/is/image/HEBGrocery/android-product-list-high/cake-flavor-cfl00684.jpg");

        List<Options> cakeFlavorOptions = new ArrayList<>();
        cakeFlavorOptions.add(chocolate);
        cakeFlavorOptions.add(marble);
        cakeFlavorOptions.add(strawberry);
        cakeFlavorOptions.add(white);
        cakeFlavorOptions.add(yellow);

        Variance cakeFlavor = new Variance("Cake Flavor", cakeFlavorOptions);

        varianceList.add(cakeFlavor);

        Options none = new Options("None", "https://images.heb.com/is/image/HEBGrocery/android-product-list-xhigh/cake-filling-ft00708.jpg");
        Options lemon = new Options("Lemon", "https://images.heb.com/is/image/HEBGrocery/android-product-list-xhigh/cake-filling-ft00917.jpg");
        Options pineapple = new Options("Pineapple", "https://images.heb.com/is/image/HEBGrocery/android-product-list-xhigh/cake-filling-ft00919.jpg");
        Options vanilla = new Options("Vanilla","https://images.heb.com/is/image/HEBGrocery/android-product-list-xhigh/cake-filling-ft00923.jpg");
        Options raspberry = new Options("Raspberry","https://images.heb.com/is/image/HEBGrocery/android-product-list-xhigh/cake-filling-ft00924.jpg");
        Options strawberryFilling = new Options("Strawberry","https://images.heb.com/is/image/HEBGrocery/android-product-list-xhigh/cake-filling-ft00929.jpg");

        List<Options> cakeFillingOptions = new ArrayList<>();
        cakeFillingOptions.add(none);
        cakeFillingOptions.add(lemon);
        cakeFillingOptions.add(pineapple);
        cakeFillingOptions.add(vanilla);
        cakeFillingOptions.add(raspberry);
        cakeFillingOptions.add(strawberryFilling);

        Variance cakeFilling = new Variance("Cake Filling", cakeFillingOptions);

        varianceList.add(cakeFilling);

        Options buttercream = new Options("Buttercream", "https://images.heb.com/is/image/HEBGrocery/android-product-list-xhigh/cake-frosting-cfr00667.jpg");
        Options elite = new Options("Elite", "https://images.heb.com/is/image/HEBGrocery/android-product-list-xhigh/cake-frosting-cfr00668.jpg");
        Options buttercream1 = new Options("Buttercream", "https://images.heb.com/is/image/HEBGrocery/android-product-list-xhigh/cake-frosting-cfr00681.jpg");
        Options elite1 = new Options("Elite","https://images.heb.com/is/image/HEBGrocery/android-product-list-xhigh/cake-frosting-cfr00682.jpg");

        List<Options> cakeFrostingOptions = new ArrayList<>();
        cakeFrostingOptions.add(buttercream);
        cakeFrostingOptions.add(elite);
        cakeFrostingOptions.add(buttercream1);
        cakeFrostingOptions.add(elite1);

        Variance cakeFrosting = new Variance("Cake Frosting", cakeFrostingOptions);

        varianceList.add(cakeFrosting);

        Options icingWhite = new Options("","https://images.heb.com/is/image/HEBGrocery/android-product-list-xhigh/cake-top-trim-c00577.jpg");
        Options icingBrown = new Options("","https://images.heb.com/is/image/HEBGrocery/android-product-list-xhigh/cake-top-trim-c00661.jpg");
        Options icingYellow = new Options("","https://images.heb.com/is/image/HEBGrocery/android-product-list-xhigh/cake-top-trim-c00664.jpg");
        Options icingBlue = new Options("","https://images.heb.com/is/image/HEBGrocery/android-product-list-xhigh/cake-top-trim-c00674.jpg");
        Options icingOrange = new Options("","https://images.heb.com/is/image/HEBGrocery/android-product-list-xhigh/cake-top-trim-c00677.jpg");
        Options icingPink = new Options("","https://images.heb.com/is/image/HEBGrocery/android-product-list-xhigh/cake-top-trim-c00685.jpg");
        Options icingGreen = new Options("","https://images.heb.com/is/image/HEBGrocery/android-product-list-xhigh/cake-top-trim-c00697.jpg");
        Options icingRed = new Options("","https://images.heb.com/is/image/HEBGrocery/android-product-list-xhigh/cake-top-trim-c00700.jpg");
        Options icingPurple = new Options("","https://images.heb.com/is/image/HEBGrocery/android-product-list-xhigh/cake-bottom-trim-c00710.jpg");

        List<Options> cakeIcingOptions = new ArrayList<>();
        cakeIcingOptions.add(icingWhite);
        cakeIcingOptions.add(icingBrown);
        cakeIcingOptions.add(icingYellow);
        cakeIcingOptions.add(icingBlue);
        cakeIcingOptions.add(icingOrange);
        cakeIcingOptions.add(icingPink);
        cakeIcingOptions.add(icingGreen);
        cakeIcingOptions.add(icingRed);
        cakeIcingOptions.add(icingPurple);

        Variance cakeTopTrim = new Variance("Cake Top Trim", cakeIcingOptions);
        Variance cakeBottomTrim = new Variance("Cake Bottom Trim", cakeIcingOptions);
        Variance cakeTextColor = new Variance("Cake Text Color", cakeIcingOptions);

        varianceList.add(cakeTopTrim);
        varianceList.add(cakeBottomTrim);
        varianceList.add(cakeTextColor);

        return varianceList;
    }
}
