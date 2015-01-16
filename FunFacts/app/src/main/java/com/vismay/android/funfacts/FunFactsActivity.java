package com.vismay.android.funfacts;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class FunFactsActivity extends ActionBarActivity {

    private FactBook mFactBook = new FactBook();
    private Colors mColors = new Colors();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);
        final RelativeLayout mRelativeLayout = (RelativeLayout)findViewById(R.id.relativeLayout);
        final TextView facts_view = (TextView)findViewById(R.id.textView2);
        final Button showFactsButton = (Button)findViewById(R.id.button);
//        final ArrayList<String> factsArray = new ArrayList<String>();
//        factsArray.add("first tip1");
//        factsArray.add("first tip2");
//        factsArray.add("first tip3");
        //final Random randomGenerator = new Random();

//        final int[] int_array = {1,2,3,4,5,6,7,8,9};
//        final TextView orderly_view = (TextView)findViewById(R.id.textView3);
//        final TextView rev_view = (TextView)findViewById(R.id.textView4);
//        Button button2 = (Button) findViewById(R.id.button2);

//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                final int randomNum=randomGenerator.nextInt(3);
//
//
////                    orderly_view.setText("ENOUGH OF PLAYING");
//                  //  rev_view.setText("GO SLEEP!");
//
//                orderly_view.setText(int_array[randomNum]+"");
//                //rev_view.setText(int_array[int_array.length-i]+"");
//
//
//            }
//        });

        showFactsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                final int randomNum=randomGenerator.nextInt(3);
//                facts_view.setText(facts[randomNum]);
                facts_view.setText(mFactBook.getFacts());
                mRelativeLayout.setBackgroundColor(mColors.getColor());
                showFactsButton.setTextColor(mColors.getColor());


            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fun_facts, menu);
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
}
