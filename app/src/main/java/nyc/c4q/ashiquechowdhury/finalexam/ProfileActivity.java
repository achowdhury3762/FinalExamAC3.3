package nyc.c4q.ashiquechowdhury.finalexam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.ashiquechowdhury.finalexam.navdrawerrecycler.NothingAdapter;
import nyc.c4q.ashiquechowdhury.finalexam.util.NavRow;

/**
 * Created by ashiquechowdhury on 2/12/17.
 */
public class ProfileActivity extends AppCompatActivity implements ClickListener{
    private RecyclerView mDrawerRecyclerView;
    private List<NavRow> rowList;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        mDrawerRecyclerView = (RecyclerView) findViewById(R.id.nav_drawer_recycler);
        mDrawerRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        setUpRowList();
        mDrawerRecyclerView.setAdapter(new NothingAdapter(rowList, this));
    }

    private void setUpRowList() {
        rowList = new ArrayList<>();
        rowList.add(new NavRow(R.drawable.ic_favorite_black_24dp, "Heart"));
        rowList.add(new NavRow(R.drawable.ic_mail_outline_black_24dp, "Message"));
        rowList.add(new NavRow(R.drawable.ic_star_black_24dp, "Settings"));
        rowList.add(new NavRow(R.drawable.ic_cancel_black_24dp, "Logout"));
    }

    @Override
    public void onClickHeart(String message) {
        showClickedToast(message);
    }

    @Override
    public void onClickSettings(String message) {
        showClickedToast(message);
        Intent intent = new Intent(this, SettingActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClickMessage(String message) {
        showClickedToast(message);
    }

    @Override
    public void onClickLogout(String message) {
        showClickedToast(message);
        finish();
    }

    private void showClickedToast(String message) {
        Toast.makeText(this,
                "Selected " + message + " Activity",
                Toast.LENGTH_SHORT).show();
    }

    public void onClickMessage(View view){
        onClickMessage("Message");
    }

    public void onClickLogout(View view){
        onClickLogout("Logout");
    }

    public void onClickHeart(View view){
        onClickHeart("Heart");
    }

    public void onClickSettings(View view){
        onClickSettings("Settings");
    }
}
