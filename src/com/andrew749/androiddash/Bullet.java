package com.andrew749.androiddash;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Bullet {
	Paint bulletpaint = new Paint();
	private int bulletspeed = 20;
	static int bulletx = 10;
	static int bulletpower=5;
	static int ycoordinate;
	public Bullet(Context context,int power, int ycoordinate) {
		bulletpower=power;
		bulletpaint.setColor(Color.RED);
	}

	public void firebullet(Canvas canvas) {
		canvas.drawCircle(bulletx, ycoordinate, bulletpower, bulletpaint);
		bulletx += bulletspeed;
		
	}

	public static int bulletxcoordinate() {
		int x = bulletx;
		return x;
	}

	public static int bulletycoordinate() {
		int y = ycoordinate;
		return y;
	}
}
