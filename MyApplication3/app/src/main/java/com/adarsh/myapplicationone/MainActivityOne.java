package com.adarsh.myapplicationone;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Toast;

        import static android.widget.Toast.LENGTH_SHORT;


public class MainActivityOne extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

    } public void ClickButton(View v){
            Toast.makeText(this, "SUBMIT", LENGTH_SHORT).show();
        startActivity(new Intent(this, SecondActivity.class));
        try{
Thread th=new Thread(new Runnable() {
    @Override
    public void run() {
        int j = 0;
        for (; ; ) {
            System.out.println("Running Threadj" + (j++));
        }
    }
});
        th.start();
    }catch (Exception e)
    {
        e.printStackTrace();
    }
}
public void Next(View v)
{
    System.out.println("Running"+(i++));
}
}
