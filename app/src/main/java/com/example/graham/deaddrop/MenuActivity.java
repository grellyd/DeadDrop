package com.example.graham.deaddrop;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;

import com.example.graham.deaddrop.CardView.CardViewActivity;


public class MenuActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu, menu);

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


    public void buttonNew_Click(View v)
    {
        Intent startCardViewActivity = new Intent(MenuActivity.this, CardViewActivity.class);
        startActivity(startCardViewActivity);
    }

    public void buttonEdit_Click()
    {
//        Intent startCardViewActivity = new Intent(MenuActivity.this, CardViewActivity.class);
//        startActivity(startCardViewActivity);
    }

    public void buttonRun_Click()
    {
//        Intent startCardViewActivity = new Intent(MenuActivity.this, CardViewActivity.class);
//        startActivity(startCardViewActivity);
    }

    public void buttonShare_Click()
    {
//        Intent startCardViewActivity = new Intent(MenuActivity.this, CardViewActivity.class);
//        startActivity(startCardViewActivity);
    }


//    final Button button = (Button) findViewById(R.id.button_id);
//    button.setOnClickListener(new View.OnClickListener() {
//        public void onClick(View v) {
//            // Perform action on click
//
//        }
//    });

            //Intent startCardViewActivity = new Intent(MenuActivity.this, CardViewActivity.class);
            //startActivity(startCardViewActivity);
}
