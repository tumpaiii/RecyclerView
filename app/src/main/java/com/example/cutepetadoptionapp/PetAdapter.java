package com.example.cutepetadoptionapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PetAdapter extends RecyclerView.Adapter<PetAdapter.PetViewHolder> {
    private List<Pet> petList;

    public PetAdapter(List<Pet> petList) {
        this.petList = petList;
    }

    @NonNull
    @Override
    public PetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.pet_item, parent, false);
        return new PetViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PetViewHolder holder, int position) {
        Pet pet = petList.get(position);
        holder.petName.setText(pet.getName());
        holder.petDescription.setText(pet.getDescription());
        holder.petPersonality.setText(pet.getPersonality());
        holder.petImage.setImageResource(pet.getImageResource());
    }

    @Override
    public int getItemCount() {
        return petList.size();
    }

    public static class PetViewHolder extends RecyclerView.ViewHolder {
        public TextView petName, petDescription, petPersonality;
        public ImageView petImage;

        public PetViewHolder(View itemView) {
            super(itemView);
            petName = itemView.findViewById(R.id.pet_name);
            petDescription = itemView.findViewById(R.id.pet_description);
            petPersonality = itemView.findViewById(R.id.pet_personality);
            petImage = itemView.findViewById(R.id.pet_image);
        }
    }
}

