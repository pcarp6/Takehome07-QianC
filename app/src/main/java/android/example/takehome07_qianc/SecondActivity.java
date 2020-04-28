package android.example.takehome07_qianc;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setTitle("Second Activity");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.second_menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.share:
                Toast.makeText(this, "Your file is shared", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.save:
                Toast.makeText(this,"Your file is saved", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.recycle_view:
                Intent intentRecycleView = new Intent(this, RecycleViewActivity.class);
                startActivity(intentRecycleView);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
