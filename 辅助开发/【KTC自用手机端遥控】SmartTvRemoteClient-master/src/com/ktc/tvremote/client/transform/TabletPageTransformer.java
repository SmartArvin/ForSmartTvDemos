package com.ktc.tvremote.client.transform;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.View;

/**
 * @author Arvin
 * @version v1.0
 * @since 2017.5.4
 */

public class TabletPageTransformer extends BGAPageTransformer {

	private static final Matrix OFFSET_MATRIX = new Matrix();
	private static final Camera OFFSET_CAMERA = new Camera();
	private static final float[] OFFSET_TEMP_FLOAT = new float[2];

	@Override
	public void handleInvisiblePage(View view, float position) {
		handleTransform(view, position);
	}

	@Override
	public void handleLeftPage(View view, float position) {
		handleTransform(view, position);
	}

	@Override
	public void handleRightPage(View view, float position) {
		handleTransform(view, position);
	}
	
	protected void handleTransform(View view, float position) {
		final float rotation = (position < 0 ? 30f : -30f) * Math.abs(position);

		ViewHelper.setTranslationX(view,getOffsetXForRotation(rotation, view.getWidth(), view.getHeight()));
        ViewHelper.setPivotX(view,view.getWidth() * 0.5f);
        ViewHelper.setPivotY(view,0);
        ViewHelper.setRotationY(view,rotation);
	}
	
	protected static final float getOffsetXForRotation(float degrees, int width, int height) {
		OFFSET_MATRIX.reset();
		OFFSET_CAMERA.save();
		OFFSET_CAMERA.rotateY(Math.abs(degrees));
		OFFSET_CAMERA.getMatrix(OFFSET_MATRIX);
		OFFSET_CAMERA.restore();

		OFFSET_MATRIX.preTranslate(-width * 0.5f, -height * 0.5f);
		OFFSET_MATRIX.postTranslate(width * 0.5f, height * 0.5f);
		OFFSET_TEMP_FLOAT[0] = width;
		OFFSET_TEMP_FLOAT[1] = height;
		OFFSET_MATRIX.mapPoints(OFFSET_TEMP_FLOAT);
		return (width - OFFSET_TEMP_FLOAT[0]) * (degrees > 0.0f ? 1.0f : -1.0f);
	}

}
