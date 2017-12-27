package mtrzepacz.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;


public class TwoStringItem extends AppCompatActivity {

    private ListView listView;
    ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_string_item);
        listView = (ListView) findViewById(R.id.ListView3);

        HashMap<String,String> testMap = new HashMap<String,String>();
     /*   testMap.put("Line1","Hi");
        testMap.put("Line2","Guys");
        list.add(testMap);

        testMap = new HashMap<String,String>();
        testMap.put("Line1","SUP");
        testMap.put("Line2","BOI");
        list.add(testMap); */
       for(int i = 0 ; i < 20 ; i++)
       {
           testMap = new HashMap<String,String>();
           testMap.put("Line1",i+" Main Value");
           testMap.put("Line2",i+" Sub Value");
           list.add(testMap);
       }
        String[] from =  {"Line1", "Line2"};
        int[] to = {android.R.id.text1, android.R.id.text2};

        SimpleAdapter simpleAdapter = new SimpleAdapter(this,list,android.R.layout.simple_list_item_2, from, to);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                HashMap o =  (HashMap) listView.getItemAtPosition(position);
                String string =  o.get("Line1") + "\n" + o.get("Line2");
                Toast.makeText(getApplicationContext(),string,Toast.LENGTH_SHORT).show();
            }
        });
        listView.setAdapter(simpleAdapter);






    }
}
