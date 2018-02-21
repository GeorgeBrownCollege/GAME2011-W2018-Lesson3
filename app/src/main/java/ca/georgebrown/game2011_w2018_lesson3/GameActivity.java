package ca.georgebrown.game2011_w2018_lesson3;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Color;
import android.util.Log;

public class GameActivity extends AppCompatActivity implements View.OnTouchListener {
    // game variables
    private ImageView _ourView;
    private Bitmap _ourBitmap;
    private Canvas _ourCanvas;
    private Paint _paint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        // this thing doesn't work yet
        this._ourView = (ImageView)findViewById(R.id.canvasContainer);

        this._ourBitmap = Bitmap.createBitmap(320, 480, Bitmap.Config.ARGB_8888);
        this._ourCanvas = new Canvas(this._ourBitmap);

        this._paint = new Paint();

        //this._ourCanvas.drawPoint(200, 200,this._paint);
        this._ourCanvas.drawColor(Color.RED);

        //Change the color of the virtual paint brush
        this._paint.setColor(Color.argb(255, 255, 255, 255));

        //Now draw a load of stuff on our canvas
        this._ourCanvas.drawText("Score: 42 Lives: 3 Hi: 97", 10, 10, this._paint);
        this._ourCanvas.drawLine(10, 50, 200, 50, this._paint);
        this._ourCanvas.drawCircle(110, 160, 100, this._paint);

        this._paint.setColor(Color.argb(255, 0, 255, 0));
        this._ourCanvas.drawRect(50, 50, 200, 200, this._paint);

        //Now put the canvas in the frame
        this._ourView.setImageBitmap(this._ourBitmap);

    }


    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int eventAction = motionEvent.getAction();

        float x = motionEvent.getX();
        float y = motionEvent.getY();

        // put your code in here to handle the event
        switch (eventAction) {
            case MotionEvent.ACTION_DOWN:
                Log.d("MyApp", "action_down X: " + x + " Y: " + y);
                break;
            case MotionEvent.ACTION_UP:
                Log.d("MyApp", "action_up X: " + x + " Y: " + y);
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d("MyApp", "action_move X: " + x + " Y: " + y);
                break;
        }



        return false;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }
}
