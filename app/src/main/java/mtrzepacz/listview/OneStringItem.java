package mtrzepacz.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class OneStringItem extends AppCompatActivity {

    private ListView listView;
    private ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_string_item);
        listView = (ListView) findViewById(R.id.ListView1);

        ArrayList testList = new ArrayList<String>();
        for(int i = 0 ; i < 20 ; i++)
            testList.add(i,i + " Item");

        adapter = new ArrayAdapter<String>(this,R.layout.list_view_item_one_string_item,testList);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object o = listView.getItemAtPosition(position);
                String string = (String)o;
                Toast.makeText(getApplicationContext(),string,Toast.LENGTH_SHORT).show();
            }
        });
        listView.setAdapter(adapter);
    }
}
