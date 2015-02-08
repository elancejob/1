package com.testanimation.pageanimation;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.testanimation.pageanimation.animation.CardPageTransformer;
import com.testanimation.pageanimation.animation.CardTransformer;
import com.testanimation.pageanimation.animation.DepthPageTransformer;
import com.testanimation.pageanimation.animation.RotationTransformer;
import com.testanimation.pageanimation.animation.ZoomOutPageTransformer;


public class MainActivity extends ActionBarActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        PageAdapter pageAdapter = new PageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pageAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    AlertDialog levelDialog;
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Select Animation");

        builder.setSingleChoiceItems(getResources().getStringArray(R.array.animation), 0, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int item) {
                switch (item) {
                    case 0:
                        viewPager.setPageTransformer(true, null);
                        break;
                    case 1:
                        viewPager.setPageTransformer(true, new CardPageTransformer());
                        break;
                    case 2:
                        viewPager.setPageTransformer(true, new CardTransformer(1f));
                        break;
                    case 3:
                        viewPager.setPageTransformer(true, new CardTransformer(0.5f));
                        break;
                    case 4:
                        viewPager.setPageTransformer(true, new CardTransformer(0f));
                        break;
                    case 5:
                        viewPager.setPageTransformer(true, new RotationTransformer());
                        break;
                    case 6:
                        viewPager.setPageTransformer(true, new DepthPageTransformer());
                        break;
                    case 7:
                        viewPager.setPageTransformer(true, new ZoomOutPageTransformer());
                        break;
                    case 8:
                        viewPager.setPageTransformer(true, null);
                        break;
                    case 9:
                        viewPager.setPageTransformer(true, null);
                        break;
                    case 10:
                        viewPager.setPageTransformer(true, null);
                        break;
                    case 12:
                        viewPager.setPageTransformer(true, null);
                        break;
                    default:
                        viewPager.setPageTransformer(true, null);
                        break;

                }
                levelDialog.dismiss();
            }
        });

        builder.setNegativeButton(getString(R.string.cancel), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        levelDialog = builder.create();
        levelDialog.show();

        return super.onOptionsItemSelected(item);
    }

}
