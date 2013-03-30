package com.andrew749.androiddash;

import java.util.Random;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Asteroid {
	Random random = new Random();
	int screenx, screeny;
	private static int xcoordinate;
	private static int ycoordinate;
	public int asteroidspeed=30;
	public static int asteroidhealth=100;
	private static Paint asteroidpaint = new Paint();

	public Asteroid(Context context) {
		GameScreen game = new GameScreen(context);
		screenx = game.screenx;
		screeny = game.screeny;
	}

	public void drawasteroid(Canvas canvas) {
		asteroidpaint.setColor(Color.DKGRAY);
		canvas.drawCircle(xcoordinate, ycoordinate, 20, asteroidpaint);
	}
	public void destroyasteroid(){
		//need to add code to destroy asteroid
	}
	public static boolean isHitAsteroid(int x, int y){
		if (x<=xcoordinate+10&&x>=xcoordinate-10){
			if(y<=ycoordinate+10&&y>=ycoordinate-10){
			return true;
			}
			else return false;
		}
		else{
			return false;
		}
		
	}

	private void generatexcoordinate() {
		xcoordinate = random.nextInt(screenx);
	}

	private void generateycoordinate() {
		ycoordinate = random.nextInt(screeny);

	}

	// returns x coordinate
	public int asteroidxcoordinate() {
		return xcoordinate;
	};

	// returns y coordinate
	public int asteroidycoordinate() {
		return ycoordinate;
	};
}
