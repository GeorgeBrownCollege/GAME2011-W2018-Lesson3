package ca.georgebrown.game2011_w2018_lesson3;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.graphics.Canvas;
import android.graphics.Paint;

public class GameActivity extends AppCompatActivity implements View.OnTouchListener {
    // game variables
    private ImageView _ourView;
    private Bitmap _ourBitmap;
    private Canvas _ourCanvas;
    private Paint _paint;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // this thing doesn't work yet

        this._ourView = (ImageView)findViewById(R.id.canvasContainer);



        this._ourBitmap = Bitmap.createBitmap(300, 600, Bitmap.Config.ARGB_8888);
        this._ourCanvas = new Canvas(this._ourBitmap);
        this._paint = new Paint();

        //this._ourCanvas.drawPoint(200, 200,this._paint);
        this._ourCanvas.drawColor(0x99009999);

        setContentView(R.layout.activity_game);
    }


    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int eventAction = motionEvent.getAction();

        float x = motionEvent.getX();
        float y = motionEvent.getY();

        // put your code in here to handle the event
        switch (eventAction) {
            case MotionEvent.ACTION_DOWN:
                break;
            case MotionEvent.ACTION_UP:
                break;
            case MotionEvent.ACTION_MOVE:
                break;
        }



        return false;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }
}
