package com.barranquero.managecalls.adapter;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import com.barranquero.managecalls.R;

/**
 * Created by usuario on 10/02/17
 * ManageCalls
 */

public class CallAdapter extends CursorAdapter {
    Context context;

    public CallAdapter(Context context) {
        super(context, null, 1);
        this.context = context;
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_call, parent, false);

        CallHolder holder = new CallHolder();
        holder.txvCaller = (TextView)view.findViewById(R.id.txvCaller);
        holder.txvCallTime = (TextView)view.findViewById(R.id.txvCallTime);
        view.setTag(holder);

        return view;
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        CallHolder holder = (CallHolder)view.getTag();

        holder.txvCaller.setText(cursor.getString(0));
        holder.txvCallTime.setText(cursor.getString(1));
    }

    class CallHolder {
        TextView txvCaller, txvCallTime;
    }
}
