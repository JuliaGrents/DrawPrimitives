package ee.juliagrents.drawprimitives;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by Julia@Igor on 22.04.2015.
 */
public class DrawCanvas extends View {

    protected Paint mPaint = new Paint();

    public DrawCanvas(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas mCanvas) {
        super.onDraw(mCanvas);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.YELLOW);
        mCanvas.drawPaint(mPaint);


    }


}