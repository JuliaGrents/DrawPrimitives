package ee.juliagrents.drawprimitives;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;

/**
 * Created by Julia@Igor on 22.04.2015.
 */
public class DrawLine extends DrawCanvas {
    public DrawLine(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas mCanvas) {
        super.onDraw(mCanvas);
        mPaint.setColor(Color.BLACK);
        mCanvas.drawLine(100,100,500,50, mPaint);
    }

}
