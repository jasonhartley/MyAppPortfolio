package us.jasonh.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private Toast mAppToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }

    public void showToast(View view) {
        if (mAppToast != null) {
            mAppToast.cancel();
        }

        Button button = (Button) view;
        String message = "This button will launch " + button.getText();
        mAppToast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        mAppToast.show();

//        Toast.makeText(getApplicationContext(), "This button will launch " + button.getText(),
//                Toast.LENGTH_SHORT).show();
    }}
