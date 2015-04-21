package ee.juliagrents.drawprimitives;

import android.app.Activity;
import android.os.Bundle;


public class DrawRectActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DrawRect rect = new DrawRect(this);
        setContentView(rect);
    }


}
