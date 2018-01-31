package com.abhi.kotlinlistview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    val mListItems=ArrayList<EmployeeModel> ()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initListView();
    }

    private fun initListView() {
        val listView=findViewById<ListView>(R.id.listView);
        initEmployeeList();
        val listAdapter= EmployeeListAdapter(this,mListItems)
        listView.adapter=listAdapter;
    }

    private fun initEmployeeList(){
        for(i in 1 until 100){
            var empName="Employee-"+i
            var empNo="SCT 00"+i
            val emp=EmployeeModel(empName,empNo)
            mListItems.add(emp)
        }
    }

}
