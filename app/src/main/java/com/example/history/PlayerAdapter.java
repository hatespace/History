package com.example.history;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.SearchView;
import android.widget.TextView;

import java.util.List;

public class PlayerAdapter extends ArrayAdapter<Player> {
    private int resourceId;
    // 构造函数
    public PlayerAdapter(Context context,         // context上下文
                         int textViewResourceId,  // 子项布局的id
                         List<Player> objects){    // 数据链表
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }

    // 重写getView
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // 获取当前项的Fruit实例
        Player player = getItem(position);
        View view;
        ViewHolder viewHolder;

        if (convertView == null){
            // inflate出子项布局，实例化其中的图片控件和文本控件
            view = LayoutInflater.from(getContext()).inflate(resourceId, null);

            viewHolder = new ViewHolder();
            // 通过id得到文本空间实例
            viewHolder.playerName = (TextView) view.findViewById(R.id.name);
            // 缓存图片控件和文本控件的实例
            view.setTag(viewHolder);
        }else{
            view = convertView;
            // 取出缓存
            viewHolder = (ViewHolder) view.getTag();
        }

        // 直接使用缓存中的图片控件和文本控件的实例
        // 文本控件设置文本内容
        viewHolder.playerName.setText(player.getName());

        return view;
    }

    // 内部类
    class ViewHolder{
        TextView playerName;
    }
}
