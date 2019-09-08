package com.example.mycv.appsinfo;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mycv.R;

import java.util.ArrayList;

public class AllFeatureAdapter extends RecyclerView.Adapter<AllFeatureAdapter.AllFeatureHolder> {

    private ArrayList<AllFeatureModel>allFeatureModels;

    @NonNull
    @Override
    public AllFeatureHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_all_feature,parent,false);
        return new AllFeatureHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AllFeatureHolder holder, int position) {
        holder.bindItem(allFeatureModels.get(position));
    }

    @Override
    public int getItemCount() {
        return allFeatureModels.size();
    }

    public void setAllFeatureModels(ArrayList<AllFeatureModel> allFeatureModels) {
        this.allFeatureModels = allFeatureModels;
    }

    class AllFeatureHolder extends RecyclerView.ViewHolder {
        TextView title,desc;
        Button btnDoc;

        AllFeatureHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title_feature);
            desc = itemView.findViewById(R.id.desc_feature);
            btnDoc = itemView.findViewById(R.id.btn_dcm_feature);
        }

        void bindItem(final AllFeatureModel allFeatureModel){
            title.setText(allFeatureModel.getTitle());
            desc.setText(allFeatureModel.getDesc());
            btnDoc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.setPackage("com.android.chrome");
                    intent.setData(Uri.parse(allFeatureModel.getLink()));
                    v.getContext().startActivity(intent);
                }
            });
        }
    }
}
