package bagusandinata.bottomnavigation;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    BottomNavigationView bottomNavigationView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigation_id);
        textView = findViewById(R.id.text_id);

        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        switch (id){
            case R.id.recents_id:
                textView.setText(getResources().getText(R.string.recents));
                return true;
            case R.id.favorite_id:
                textView.setText(getResources().getText(R.string.favorites));
                return true;
            case R.id.nearby_id:
                textView.setText(getResources().getText(R.string.near_by));
                return true;
        }
        return false;
    }
}
