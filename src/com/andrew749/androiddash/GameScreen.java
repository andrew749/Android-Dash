package com.andrew749.androiddash;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class GameScreen extends View {

	protected final static int playerx = 10;
	public static int playery;
	protected static int screenx, screeny;
	public static float workingy;
	private static Paint paint;
	public static boolean fire = false;
	private static Bullet bullet;
	static int bulletx;
	static int bulletpower = 5;
	static int power = 0;
	final Canvas canvas = new Canvas();

	// when initialized gets the screen width and height to properly format the
	// game
	public GameScreen(Context context) {
		super(context);
		playery = 30;
		paint = new Paint();
		paint.setColor(Color.GREEN);
	}

	// possible thread to draw the background of the game
	public Runnable drawscene = new Runnable() {
		public void run() {

		}
	};

	// draws the game
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		screenx = getWidth();
		screeny = getHeight();
		bullet.firebullet(canvas);
		if (bulletx > screenx) {
			bulletx = 10;
		}
		drawplayer(canvas);
		invalidate();
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		if (event.getAction() == MotionEvent.ACTION_MOVE) {
			workingy = event.getY();
		} else if (event.getAction() == MotionEvent.ACTION_DOWN) {
			// power =(int)(event.getDownTime() / 1000);
			fire = true;
			bullet = new Bullet(null, bulletpower + power, playery);

		}

		return true;
	}

	private static void movetoy() {
		if (playery - workingy <= 10 && playery - workingy >= -10) {
		} else {
			if (playery < workingy) {
				playery += 10;

			} else if (playery > workingy) {
				playery -= 10;

			}
		}
	}

	private static void drawplayer(Canvas canvas) {
		movetoy();
		canvas.drawCircle(playerx, playery, 50, paint);
	}
}
