package android.example.takehome07_qianc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MonsterAdapter extends RecyclerView.Adapter<MonsterViewHolder> {
    private List<Monster> monsters;
    private Context context;

    public MonsterAdapter(List<Monster> monsters, Context context) {
        this.monsters = monsters;
        this.context = context;
    }

    public MonsterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_person, parent, false);
        return new MonsterViewHolder(view, context);
    }

    public void onBindViewHolder(MonsterViewHolder holder, int position) {
        Monster monster = monsters.get(position);
        holder.MonsterName.setText(monster.name);
        holder.MonsterInfo.setText(monster.info);
        holder.MonsterPhoto.setImageResource(monster.photoId);
    }

    public int getItemCount() {
        return monsters.size();
    }
}
