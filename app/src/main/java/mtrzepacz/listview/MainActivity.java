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
        Intent intent = new Intent(this,OneStringItem.class);
        startActivity(intent);
    }

    public void gotoSimpleItemView(View v)
    {
        Intent intent = new Intent(this,SimpleItem.class);
        startActivity(intent);
    }

    public void gotoTwoStringListView(View v)
    {
        Intent intent = new Intent(this,TwoStringItem.class);
        startActivity(intent);
    }

    public void gotoCustomListView(View v)
    {
        Intent intent = new Intent(this,CustomItem.class);
        startActivity(intent);
    }


}
