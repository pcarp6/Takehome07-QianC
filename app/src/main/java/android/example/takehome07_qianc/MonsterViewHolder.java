package android.example.takehome07_qianc;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class MonsterViewHolder extends RecyclerView.ViewHolder {
    public CardView cardView;
    public TextView MonsterName;
    public TextView MonsterInfo;
    public ImageView MonsterPhoto;

    public MonsterViewHolder(View itemView, final Context context) {
        super(itemView);
        cardView = itemView.findViewById(R.id.card_view);
        MonsterName = itemView.findViewById(R.id.Monster_name);
        MonsterInfo = itemView.findViewById(R.id.Monster_info);
        MonsterPhoto = itemView.findViewById(R.id.Monster_photo);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(context, MonsterName.getText(), Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 1400);
                toast.show();
            }
        });
    }
}
