package ee.juliagrents.drawprimitives;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;

public class DrawRect extends DrawCanvas {

    public DrawRect(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas mCanvas) {
        super.onDraw(mCanvas);
        mPaint.setColor(Color.GREEN);
        mCanvas.drawRect(10, 10, 200, 250, mPaint);
    }

}