package com.example.dasd;

import android.app.Activity;
import android.app.Service;
import android.os.Bundle;
import android.os.Vibrator;

public class MainActivity extends Activity {
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        
        
        
       
        // �_�ʪ���
        Vibrator vVi = (Vibrator)this.getApplication().getSystemService(Service.VIBRATOR_SERVICE);
       
        // �_�� 0.5 ��
        vVi.vibrate( 50000 );
       
        // �_�� 0.2 ��, 0.2 ��, 1 �� (���Ʀ��Ƭ�������)
        //vVi.vibrate( new long[]{200, 200, 1000}, -1 );
    }
}