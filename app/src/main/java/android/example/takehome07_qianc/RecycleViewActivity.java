package android.example.takehome07_qianc;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecycleViewActivity extends AppCompatActivity {
    private List<Monster> monsters;
    private MonsterAdapter monstersAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        setTitle("Monster List");

        initialData();

        RecyclerView recycleView = findViewById(R.id.recycle_view);
        recycleView.setHasFixedSize(true);
        recycleView.setLayoutManager(new LinearLayoutManager(this));
        monstersAdapter = new MonsterAdapter(monsters, this);
        recycleView.setAdapter(monstersAdapter);
    }

    private void initialData() {
        monsters = new ArrayList<>();
        monsters.add(new Monster("Green Snail", "HP:13", R.drawable.blue));
        monsters.add(new Monster("Blue Snail", "HP:22", R.drawable.green));
        monsters.add(new Monster("Red Snail", "HP:30", R.drawable.red));
        monsters.add(new Monster("Yellow Mushroom", "HP:44", R.drawable.mushroom));
        monsters.add(new Monster("Slime", "HP:38", R.drawable.slime));
    }


    public Monster getRandomMonster() {
        int num = (int) (Math.random() * 5);
        if (num == 0)
            return new Monster("Green Snail", "HP:13", R.drawable.green);
        else if (num == 1) {
            return new Monster("Blue Snail", "HP:22", R.drawable.blue);
        } else if (num == 2) {
            return new Monster("Red Snail", "HP:30", R.drawable.red);
        } else if (num == 3) {
            return new Monster("Yellow Mushroom", "HP:44", R.drawable.mushroom);
        } else {
            return new Monster("Slime", "HP:38", R.drawable.slime);
        }
    }


    public void addMonster(View view) {
        monsters.add(getRandomMonster());
        monstersAdapter.notifyDataSetChanged();
    }
}
