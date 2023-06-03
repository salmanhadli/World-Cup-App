package com.example.worldcupapp;

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

public class CustomAdapter extends ArrayAdapter<CountryModel> {
    Context context;
    private ArrayList<CountryModel> countriesData;

    public CustomAdapter(ArrayList<CountryModel> data, Context context) {
        super(context, R.layout.item_list_layout, data);
        this.countriesData = data;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        return super.getView(position, convertView, parent);

        // Get the data item for this position
        CountryModel dataModel = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder;
        final View result;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_list_layout, parent, false);
            viewHolder.countryName = (TextView) convertView.findViewById(R.id.countryName);
            viewHolder.cupWinsText = (TextView) convertView.findViewById(R.id.totalWins);
            viewHolder.flagImage = (ImageView) convertView.findViewById(R.id.countryFlag);

            result = convertView;
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        // Get the data from the Model Class
        viewHolder.countryName.setText(dataModel.getCountryName());
        viewHolder.cupWinsText.setText("" + dataModel.getCupWinCount());
        viewHolder.flagImage.setImageResource(dataModel.getCountryFlagImage());

        return convertView;
    }

    // View Lookup Cache
    private static class ViewHolder {
        TextView countryName, cupWinsText;
        ImageView flagImage;
    }
}
