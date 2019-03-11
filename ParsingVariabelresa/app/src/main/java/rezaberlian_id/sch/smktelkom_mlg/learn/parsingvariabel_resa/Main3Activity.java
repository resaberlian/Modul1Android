package rezaberlian_id.sch.smktelkom_mlg.learn.parsingvariabel_resa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    Thread threadMain;
    TextView txtTitle;
    private long ms = 0 ;
    private long splashTime = 3000;
    private boolean splashActive = true ;
    private boolean splashPause = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Thread th = new Thread(){
            public void run(){
                try
                {
                   while(splashActive && ms < splashTime){
                       if
                       (!splashPause){ ms = ms +100;
                   }
                   sleep(100);
                }
            }catch (Exception e){

                }
                finally {
                    Intent i = new Intent(Main3Activity.this, MainActivity.class);
                    startActivity(i);
                    }
                }
        };
        th.start();
    }
}
