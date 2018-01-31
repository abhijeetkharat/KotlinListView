package com.abhi.kotlinlistview

/**
 * Created by abhijeet on 31/1/18.
 */
class EmployeeModel {

    var name: String =""
    var empNo: String=""

    constructor(){ }

    constructor( name:String,empNo:String){
        this.name=name
        this.empNo=empNo
    }

}