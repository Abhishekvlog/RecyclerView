package com.example.recyclerviewwe;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.recyclerview.widget.RecyclerView;

public class StudentViewHolder extends RecyclerView.ViewHolder {
    private TextView mTvName;
    private TextView mTvAge;
    private TextView mTvRllNo;

    public StudentViewHolder(@NonNull  View itemView) {
        super(itemView);
        initViews();
    }

    private void initViews() {
        mTvName = itemView.findViewById(R.id.tvName);
        mTvAge = itemView.findViewById(R.id.tvAge);
        mTvRllNo = itemView.findViewById(R.id.tvRollNo);
    }
    public void setData(Student student){
        mTvName.setText(student.getName());
        mTvAge.setText(student.getAge()+"");
        mTvRllNo.setText(student.getRoll_no());
    }
}
