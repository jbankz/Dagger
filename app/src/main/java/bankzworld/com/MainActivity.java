package bankzworld.com;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    SharedPreferences prefs;
    @Inject
    Context context;

    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ((DaggerApplication) getApplication()).getAppComponent().inject(this);

        mTextView = (TextView) findViewById(R.id.text);

        prefs.edit().putInt("n", 10).apply();

        // displays the stored value in the prefs
        mTextView.setText(String.valueOf(prefs.getInt("n", 0)));

    }

}
