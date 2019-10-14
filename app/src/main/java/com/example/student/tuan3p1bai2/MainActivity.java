package com.example.student.tuan3p1bai2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button showmenucontext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showmenucontext=(Button)findViewById(R.id.buttonshow);
        registerForContextMenu(showmenucontext);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu_context,menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int id=item.getItemId();
        switch (id){
            case R.id.itemRed:
                showmenucontext.setTextColor(getResources().getColor(R.color.colorRed));
                break;
            case R.id.itemGreen:
                showmenucontext.setTextColor(getResources().getColor(R.color.colorGreen));
                break;
            case R.id.itemBule:
                showmenucontext.setTextColor(getResources().getColor(R.color.colorBlue));
                break;
            default:
                showmenucontext.setTextColor(getResources().getColor(R.color.colorRed));
                break;
        }
        return super.onContextItemSelected(item);
    }
}
