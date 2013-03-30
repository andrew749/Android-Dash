package com.andrew749.androiddash;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class AndroidDash extends Activity {
GameScreen game;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        game=new GameScreen(getApplicationContext());
        Button button=(Button)findViewById(R.id.playbutton);
        button.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				setContentView(game);
			}
		});

    }

   
}
