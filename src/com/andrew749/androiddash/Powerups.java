package com.andrew749.androiddash;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Powerups {
	protected static int poweruplevel = 1;
	public static int powerupx, powerupy;
	private Paint poweruppaint;

	public Powerups(Context context) {
		poweruppaint.setColor(Color.MAGENTA);
	}

	public void drawpowerupring(Canvas canvas) {
		canvas.drawCircle(powerupx, powerupy, 20, poweruppaint);
	}

	public static int getpowerupx() {
		return powerupx;
	}

	public static int getpowerupy() {
		return powerupy;
	}
}
