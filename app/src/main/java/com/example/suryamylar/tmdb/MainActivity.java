package com.example.suryamylar.tmdb;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


import java.lang.reflect.AccessibleObject;


public class MainActivity extends Activity {

    public static String query =  "/movie/popular?";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View frag= this.findViewById(R.id.fragment);
        final SearchView search =(SearchView) this.findViewById(R.id.searchView);
        final TextView app_title=(TextView) this.findViewById(R.id.app_title);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //app_title.setEnabled(false);
                app_title.setText("   ");
            }
        });



        search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                MainActivity.query = "/search/movie?query="+query;
                Fragment newFragment = new MainFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment, newFragment);
                transaction.commit();
                app_title.setText(query);
                app_title.setEnabled(true);
               search.onActionViewCollapsed();
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
