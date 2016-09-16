package cn.edu.gdmec.d07150847.work2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Work2","onCreate方法被执行");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Work2","onStaar方法被执行");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Work2","onResume方法被执行");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Work2","onPasue方法被执行了");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Work2","onStop方法被执行了");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Work2","onRestart方法被执行");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Work2","onDestroy方法被执行");
    }
}
