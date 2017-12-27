package mtrzepacz.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class SimpleItem extends AppCompatActivity {

    private ListView listView;
    private ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_item);
        listView = (ListView) findViewById(R.id.ListView2);

        ArrayList testList = new ArrayList<String>();
        for(int i = 0 ; i < 20 ; i++)
            testList.add(i,i + " Item Other Style");

        adapter = new ArrayAdapter<String>(this,R.layout.list_view_item_simple_item,testList);

        listView.setAdapter(adapter);
    }
}
