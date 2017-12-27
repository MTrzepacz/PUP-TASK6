package mtrzepacz.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonOneStringItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonOneStringItem = (Button) findViewById(R.id.button);
    }

    public void gotoOneStringListView(View v)
    {
        Intent intent = new Intent(this,OneStringList.class);
        startActivity(intent);
    }
}