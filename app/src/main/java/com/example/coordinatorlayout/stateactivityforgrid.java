package com.example.coordinatorlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.appbar.CollapsingToolbarLayout;

import java.util.ArrayList;

public class stateactivityforgrid extends AppCompatActivity implements adaptercity.ItemClickListener  {
adaptercity adaptercity;
ArrayList<datamodel>arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_stateactivityforgrid);
        final Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout collapsingToolbar = findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle("Select your state");

        ArrayList<datamodel>arrayList=new ArrayList<>();
        arrayList.add(new datamodel(R.drawable.delhi1,"Andhra Pradesh"));
        arrayList.add(new datamodel(R.drawable.jk,"Arunachal Pradesh"));
        arrayList.add(new datamodel(R.drawable.tamil," Assam"));
        arrayList.add(new datamodel(R.drawable.goa," Andaman and Nicobar Islands"));
        arrayList.add(new datamodel(R.drawable.bihar," Bihar "));
        arrayList.add(new datamodel(R.drawable.punjab,"Chandigarh"));
        arrayList.add(new datamodel(R.drawable.jhar,"Chhattisgarh"));
        arrayList.add(new datamodel(R.drawable.delhi1,"Delhi"));
        arrayList.add(new datamodel(R.drawable.surat," Dadra and Nagar Haveli "));
        arrayList.add(new datamodel(R.drawable.jk,"Daman and Diu"));
        arrayList.add(new datamodel(R.drawable.goa," Goa"));
        arrayList.add(new datamodel(R.drawable.raj,"Gujarat"));
        arrayList.add(new datamodel(R.drawable.har,"Haryana"));
        arrayList.add(new datamodel(R.drawable.delhi1," Himachal Pradesh"));
        arrayList.add(new datamodel(R.drawable.jk,"Jammu & Kashmir"));
        arrayList.add(new datamodel(R.drawable.jhar,"Jharkhand"));
        arrayList.add(new datamodel(R.drawable.karnat,"Karnataka "));
        arrayList.add(new datamodel(R.drawable.goa,"Lakshadweep"));
        arrayList.add(new datamodel(R.drawable.madh,"Madhya Pradesh"));
        arrayList.add(new datamodel(R.drawable.megh," Maharashtra"));
        arrayList.add(new datamodel(R.drawable.tamil," Manipur"));
        arrayList.add(new datamodel(R.drawable.jk,"Meghalaya"));
        arrayList.add(new datamodel(R.drawable.megh," Mizoram "));
        arrayList.add(new datamodel(R.drawable.delhi1," Nagaland"));
        arrayList.add(new datamodel(R.drawable.har,"Odisha"));
        arrayList.add(new datamodel(R.drawable.punjab,"Punjab"));
        arrayList.add(new datamodel(R.drawable.goa,"Puducherry"));
        arrayList.add(new datamodel(R.drawable.raj," Rajasthan"));
        arrayList.add(new datamodel(R.drawable.jk," Sikkim"));
        arrayList.add(new datamodel(R.drawable.megh," Tamil Nadu"));
        arrayList.add(new datamodel(R.drawable.karnat,"Telangana "));
        arrayList.add(new datamodel(R.drawable.tamil,"Tripura"));
        arrayList.add(new datamodel(R.drawable.jk," Uttarakhand"));
        arrayList.add(new datamodel(R.drawable.bihar,"Uttar Pradesh "));
        arrayList.add(new datamodel(R.drawable.goa,"West Bengal "));






        RecyclerView recyclerViewm = findViewById(R.id.rvcityztaad);
        recyclerViewm.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false) {
            @Override
            public boolean checkLayoutParams(RecyclerView.LayoutParams lp) {

                // force height of viewHolder here, this will override layout_height from xml
                return true;
            }
        });
        adaptercity = new adaptercity(stateactivityforgrid
                .this, arrayList);

        recyclerViewm.setAdapter(adaptercity);

    }

    @Override
    public void onItemClick(View view, int position) {

    }
}
