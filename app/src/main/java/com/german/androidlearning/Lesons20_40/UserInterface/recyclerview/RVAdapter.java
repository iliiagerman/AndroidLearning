package com.german.androidlearning.Lesons20_40.UserInterface.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.german.androidlearning.R;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonViewHolder> {
    final List<Person> persons;

    public RVAdapter(List<Person> persons) {
        this.persons = persons;
    }

    public static class PersonViewHolder extends RecyclerView.ViewHolder {
        CardView cvRoot;
        TextView tvAccountItemName;
        TextView tvAccountItemAge;
        ImageView ivAccountItem;

        PersonViewHolder(View itemView) {
            super(itemView);
            cvRoot = itemView.findViewById(R.id.cvRoot);
            tvAccountItemName = itemView.findViewById(R.id.tvAccountItemName);
            tvAccountItemAge = itemView.findViewById(R.id.tvAccountItemAge);
            ivAccountItem = itemView.findViewById(R.id.ivAccountItem);
        }
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        final View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_account, viewGroup, false);
        return new PersonViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PersonViewHolder personViewHolder, int i) {
        personViewHolder.tvAccountItemName.setText(persons.get(i).name);
        personViewHolder.tvAccountItemAge.setText(persons.get(i).age);
        personViewHolder.ivAccountItem.setImageResource(persons.get(i).photoId);
    }

    @Override
    public int getItemCount() {
        return persons.size();
    }
}


