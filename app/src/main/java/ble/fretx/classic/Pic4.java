package ble.fretx.classic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Jamal on 9/23/2016.
 */
public class Pic4 extends AppCompatActivity {

    private Button s6f1;
    private Button s5f1;
    private Button s4f1;
    private Button s3f1;
    private Button s2f1;
    private Button s1f1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pic4);

        s6f1 = (Button)findViewById(R.id.s6f1);
        s5f1 = (Button)findViewById(R.id.s5f1);
        s4f1 = (Button)findViewById(R.id.s4f1);
        s3f1 = (Button)findViewById(R.id.s3f1);
        s2f1 = (Button)findViewById(R.id.s2f1);
        s1f1 = (Button)findViewById(R.id.s1f1);

    }

    public void s6f1 (View v) {
        byte[] array = new byte[]{6, 24, 25, 0};
        MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
    }

    public void s5f1 (View v) {
        byte[] array = new byte[]{5, 23, 24, 0};
        MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
    }

    public void s4f1 (View v) {
        byte[] array = new byte[]{4, 23, 32, 0};
        MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
    }

    public void s3f1 (View v) {
        byte[] array = new byte[]{3, 32, 31, 0};
        MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
    }

    public void s2f1 (View v) {
        byte[] array = new byte[]{1, 2, 3, 4, 25, 36, 0};
        MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
    }

    public void s1f1 (View v) {
        byte[] array = new byte[]{1, 2, 3, 24, 35, 0};
        MainActivity.mHandler.obtainMessage(BluetoothClass.ARDUINO, array).sendToTarget();
    }
}
