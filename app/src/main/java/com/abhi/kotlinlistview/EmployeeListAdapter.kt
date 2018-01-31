package com.abhi.kotlinlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

/**
 * Created by abhijeet on 31/1/18.
 */
class EmployeeListAdapter(private var mContext: Context, private var mListItems: ArrayList<EmployeeModel> ): BaseAdapter() {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view:View?
        val viewHolder:ViewHolder
        if(convertView==null){
            val inflater=mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view=inflater.inflate(R.layout.list_item,parent,false)
            viewHolder= ViewHolder(view)
            view?.tag=viewHolder

        }else{
            view=convertView
            viewHolder=view.tag as ViewHolder

        }
        viewHolder.txtName?.setText(mListItems.get(position).name)
        viewHolder.txtEmpId?.setText(mListItems.get(position).empNo)

         return view as View
    }


    private class ViewHolder(view: View?){
        var txtName:TextView?=null
        var txtEmpId:TextView?=null
        init {
            txtName=view?.findViewById<TextView>(R.id.txtName)
            txtEmpId=view?.findViewById<TextView>(R.id.txtEmpId)
        }

    }


    override fun getItem(position: Int): Any {

        return mListItems.get(position)
    }

    override fun getItemId(position: Int): Long {

        return position.toLong()
    }

    override fun getCount(): Int {

        return mListItems.count()
    }


}