package ee.juliagrents.drawprimitives;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Julia@Igor on 22.04.2015.
 */
public class DrawLineActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DrawLine line = new DrawLine(this);
        setContentView(line);
    }


}