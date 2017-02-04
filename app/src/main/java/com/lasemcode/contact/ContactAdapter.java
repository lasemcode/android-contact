package com.lasemcode.contact;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lasemcode on 04/02/17.
 */

public class ContactAdapter extends RecyclerView.Adapter<ViewHolder>{

    private Context context;
    private List<Contact> contacts = new ArrayList<>();

    public ContactAdapter(Context context) {
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.contact_adapter, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Contact c = contacts.get(position);

        holder.name.setText(c.getName());
        holder.number.setText(c.getNumber());

        if (c.getContactType() == Contact.ContactTypes.family){
            holder.icon.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_family_24dp));
        }else if (c.getContactType() == Contact.ContactTypes.friend){
            holder.icon.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_friend_24dp));
        }
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }


    public void addItems(List<Contact> contacts){
        this.contacts.addAll(contacts);
        notifyDataSetChanged();
    }

}

class ViewHolder extends RecyclerView.ViewHolder{

    ImageView icon;
    TextView name;
    TextView number;

    public ViewHolder(View itemView) {
        super(itemView);

        icon = (ImageView) itemView.findViewById(R.id.img_icon);
        name = (TextView) itemView.findViewById(R.id.text_name);
        number = (TextView) itemView.findViewById(R.id.text_number);
    }
}
