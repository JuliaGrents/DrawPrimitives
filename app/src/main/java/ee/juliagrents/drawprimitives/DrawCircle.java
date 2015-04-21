package ee.juliagrents.drawprimitives;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;

/**
 * Created by Julia@Igor on 22.04.2015.
 */
public class DrawCircle extends DrawCanvas {
    public DrawCircle(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas mCanvas) {
        super.onDraw(mCanvas);
        mPaint.setColor(Color.RED);
        mCanvas.drawCircle(20, 20, 50, mPaint);
    }

}
