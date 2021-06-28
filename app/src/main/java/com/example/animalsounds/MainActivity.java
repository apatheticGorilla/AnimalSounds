package com.example.animalsounds;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
	ImageView bear, chicken, cow, elephant, horse, monke, pig, tiger;
	MediaPlayer player;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		bear = findViewById(R.id.bear);
		chicken = findViewById(R.id.chicken);
		cow = findViewById(R.id.cow);
		elephant = findViewById(R.id.elephant);
		horse = findViewById(R.id.horse);
		monke = findViewById(R.id.monkey);
		pig = findViewById(R.id.pig);
		tiger = findViewById(R.id.tiger);
		
	}
	
	public void onClick(View view) throws IOException {
		String animal = getResources().getResourceEntryName(view.getId());
		//player.setDataSource("res\\raw\\" + animal + ".mp3");
		player = MediaPlayer.create(this, getResources().getIdentifier(animal,"raw",getPackageName()));
		player.start();
	}
}