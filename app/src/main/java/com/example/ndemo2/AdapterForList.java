package com.example.ndemo2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AdapterForList extends ArrayAdapter
{


    ArrayList arrayList;

    public AdapterForList(@NonNull Context context, int resource, @NonNull ArrayList objects) {
        super(context, resource, objects);

        arrayList=objects;

    }


    @Override
    public int getCount() {
        return super.getCount();
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater=(LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.single_item_ui,null);

        ImageView imageView=(ImageView) view.findViewById(R.id.ui_imageId);
        TextView textView=(TextView) view.findViewById(R.id.ui_nameId);


//        TextView inviteBtn, location, work, distance,  score_text, status, coffee,
//                bussenes, hobbies, spaceOne, spaceTwo, spaceThree;
//        ImageView score_image;
//
//
//        inviteBtn=view.findViewById(R.id.tv_inviId);
//      location= view.findViewById(R.id.ui_locatonId);
//       work= view.findViewById(R.id.ui_workId);
//        distance=view.findViewById(R.id.ui_distanceId);
//       score_image= view.findViewById(R.id.ui_score_profile_imageId);
//       score_text= view.findViewById(R.id.ui_score_profile_textId);
//       status= view.findViewById(R.id.ui_statusId);
//
//        coffee=view.findViewById(R.id.ui_action_coffeeId);
//       bussenes= view.findViewById(R.id.ui_action_bussenesId);
//        hobbies=view.findViewById(R.id.ui_action_hobbiesId);
//
//        spaceOne=view.findViewById(R.id.ui_space_oneId);
//        spaceTwo=view.findViewById(R.id.ui_space_twoId);
//        spaceThree=view.findViewById(R.id.ui_space_threeId);


       ClassForAddTwoItem classForAddTwoItem=(ClassForAddTwoItem) arrayList.get(position);

        imageView.setImageResource(classForAddTwoItem.getImage());
        textView.setText(classForAddTwoItem.getName());




        return view;
    }
}
