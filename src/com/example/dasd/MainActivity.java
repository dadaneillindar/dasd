package com.example.dasd;

import android.app.Activity;
import android.app.Service;
import android.os.Bundle;
import android.os.Vibrator;

public class MainActivity extends Activity {
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        
        
        
       
        // 震動物件
        Vibrator vVi = (Vibrator)this.getApplication().getSystemService(Service.VIBRATOR_SERVICE);
       
        // 震動 0.5 秒
        vVi.vibrate( 50000 );
       
        // 震動 0.2 秒, 0.2 秒, 1 秒 (重複次數為不重複)
        //vVi.vibrate( new long[]{200, 200, 1000}, -1 );
    }
}