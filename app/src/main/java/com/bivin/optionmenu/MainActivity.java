package com.bivin.optionmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menures,menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.profiel){
            Intent intent=new Intent(getApplicationContext(),ActivityProfile.class);
            startActivity(intent);
        }
        if(id==R.id.settings){
            Intent intent=new Intent(getApplicationContext(),ActivitySettings.class);
            startActivity(intent);
        }
        if(id==R.id.Messages){
            Intent intent=new Intent(getApplicationContext(),ActivityMessage.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

}
