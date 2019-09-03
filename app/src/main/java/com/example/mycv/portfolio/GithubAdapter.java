package com.example.mycv.portfolio;

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

public class GithubAdapter extends RecyclerView.Adapter<GithubAdapter.GithubHolder> {

    ArrayList<GithubModel>githubModels;

    @NonNull
    @Override
    public GithubHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_github,parent,false);
        return new GithubHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GithubHolder holder, int position) {
        holder.bindItem(githubModels.get(position));
    }

    @Override
    public int getItemCount() {
        return githubModels.size();
    }

    public void setGithubModels(ArrayList<GithubModel> githubModels) {
        this.githubModels = githubModels;
    }

    class GithubHolder extends RecyclerView.ViewHolder {

        TextView txtNameRepo,txtCreatedAt,txtLanguageRepo;
        Button btnGoToWeb;

        GithubHolder(@NonNull View itemView) {
            super(itemView);

            txtNameRepo = itemView.findViewById(R.id.name_repo_github);
            txtCreatedAt = itemView.findViewById(R.id.created_at_repo);
            txtLanguageRepo = itemView.findViewById(R.id.language_repo);
            btnGoToWeb = itemView.findViewById(R.id.btn_go_to_web);

        }
        private void bindItem(final GithubModel githubModel){

            txtNameRepo.setText(githubModel.getNameRepo());
            txtCreatedAt.setText(githubModel.getCreatedAtRepo());
            txtLanguageRepo.setText(githubModel.getLanguageRepo());

            btnGoToWeb.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent();
                    i.setPackage("com.android.chrome");
                    i.setAction(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(githubModel.getLinkGithub()));
                    v.getContext().startActivity(i);
                }
            });
        }
    }
}
