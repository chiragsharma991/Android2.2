package udaan.mobilestyx.com.android22;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner=(Spinner)findViewById(R.id.spinner);

       String xx= spinner.getSelectedItem().toString();

        Log.e("tag","spinner"+xx);


    }
}
