package com.example.android.musicapp;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

/**
 * Created by Shinam on 03/05/2017.
 */

public class BaseActivity extends AppCompatActivity {

    private String mSentence = "";

    public void setSentence(String sentence) {
        mSentence = sentence;
    }

    private static final int Explain = Menu.FIRST;
    private PopupWindow popupWindow;
    private LayoutInflater layoutInflater;
    private LinearLayout activity_main;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, Explain, 0, "Explanation");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case Explain:
                explain();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void explain() {
        activity_main = (LinearLayout) findViewById(R.id.activity_main);
        layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        ViewGroup container = (ViewGroup) layoutInflater.inflate(R.layout.popwindows, null);
        popupWindow = new PopupWindow(container, ActionBar.LayoutParams.MATCH_PARENT, 500, true);
        popupWindow.showAtLocation(activity_main, Gravity.CENTER, 0, 0);
        TextView win = (TextView) popupWindow.getContentView().findViewById(R.id.text);
        win.setText(mSentence);

        container.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                popupWindow.dismiss();
                return true;
            }
        });
    }
}
