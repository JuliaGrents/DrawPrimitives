package ee.juliagrents.drawprimitives;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Julia@Igor on 22.04.2015.
 */

public class DrawCircleActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DrawCircle circle = new DrawCircle(this);
        setContentView(circle);
    }


}
