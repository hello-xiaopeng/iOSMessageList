package com.kot32.iosmessagelist.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.kot32.iosmessagelist.R;
import com.kot32.iosmessagelist.util.DisplayUtil;

import java.util.List;

/**
 * Created by kot32 on 15/9/25.
 */
public class MessageAdapter extends SimpleBaseAdapter<String> {

    public MessageAdapter(Context context, List<String> data) {
        super(context, data);
    }

    @Override
    public int getItemResource() {
        return R.layout.message_item;
    }

    @Override
    public View getItemView(int position, View convertView, ViewHolder holder) {

        TextView textView = holder.getView(R.id.text);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(DisplayUtil.dip2px(context,300), ViewGroup.LayoutParams.WRAP_CONTENT);
        textView.setText(getItem(position)+"");

        if (position % 2 == 0) {
            textView.setBackgroundResource(R.drawable.others_message);
            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT,RelativeLayout.TRUE);
        } else {
            textView.setBackgroundResource(R.drawable.my_message);
            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT,RelativeLayout.TRUE);
        }
        textView.setLayoutParams(layoutParams);

        return convertView;
    }
}
