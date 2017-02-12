package nyc.c4q.ashiquechowdhury.finalexam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import nyc.c4q.ashiquechowdhury.finalexam.numberrecycler.NumberAdapter;

/**
 * Created by ashiquechowdhury on 2/12/17.
 */

public class SettingActivity extends AppCompatActivity {
    private RecyclerView numberRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        numberRecycler = (RecyclerView) findViewById(R.id.number_recycler);
        numberRecycler.setLayoutManager(new LinearLayoutManager(this));
        numberRecycler.setAdapter(new NumberAdapter());

    }
}
