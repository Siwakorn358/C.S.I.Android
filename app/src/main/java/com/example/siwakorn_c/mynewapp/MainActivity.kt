package com.example.siwakorn_c.mynewapp



import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("My-First-App");


        val visitor_checkin = findViewById<Button>(R.id.btn_visitor_check_in)
        val department_list = findViewById<Button>(R.id.btn_department_list)
        val employee_search = findViewById<Button>(R.id.btn_employee_Search)
        val company_info = findViewById<Button>(R.id.btn_company_info)
        visitor_checkin.setOnClickListener {
//            if () {
                visitor_checkin.setBackgroundResource(R.drawable.style_button_pressed)
                department_list.setBackgroundResource(R.drawable.style_button)
                employee_search.setBackgroundResource(R.drawable.style_button)
                company_info.setBackgroundResource(R.drawable.style_button)
                fragmentVisitor()
//            }
        }
        department_list.setOnClickListener {
            //            if () {
            visitor_checkin.setBackgroundResource(R.drawable.style_button)
            department_list.setBackgroundResource(R.drawable.style_button_pressed)
            employee_search.setBackgroundResource(R.drawable.style_button)
            company_info.setBackgroundResource(R.drawable.style_button)
            fragmentDepartmentList()
//            }
        }
        employee_search.setOnClickListener {
            //            if () {
            visitor_checkin.setBackgroundResource(R.drawable.style_button)
            department_list.setBackgroundResource(R.drawable.style_button)
            employee_search.setBackgroundResource(R.drawable.style_button_pressed)
            company_info.setBackgroundResource(R.drawable.style_button)
            fragmentEmployeeSearch()
//            }
        }
        company_info.setOnClickListener {
            //            if () {
            visitor_checkin.setBackgroundResource(R.drawable.style_button)
            department_list.setBackgroundResource(R.drawable.style_button)
            employee_search.setBackgroundResource(R.drawable.style_button)
            company_info.setBackgroundResource(R.drawable.style_button_pressed)
            fragmentCompanyInfo()
//            }
        }
    }

    fun fragmentVisitor(){
        val fragcheckin = Visitor_checkin()
        val manager = supportFragmentManager
//        Toast.makeText(this,"Button FragmentCheckin",Toast.LENGTH_LONG);
        val frag_transaction = manager.beginTransaction()
        frag_transaction.replace(R.id.fragmentdetail,fragcheckin)
//        frag_transaction.addToBackStack(null)
        frag_transaction.commit()
    }
    fun fragmentDepartmentList(){
        val fragdepartmentlist = Department_list()
        val manager = supportFragmentManager
//        Toast.makeText(this,"Button Fragmentdepartment",Toast.LENGTH_LONG);
        val frag_transaction = manager.beginTransaction()
        frag_transaction.replace(R.id.fragmentdetail,fragdepartmentlist)
//        frag_transaction.addToBackStack(null)
        frag_transaction.commit()
    }
    fun fragmentEmployeeSearch(){
        val fragemployeesearch = Employee_search()
        val manager = supportFragmentManager
//        Toast.makeText(this,"Button Fragmentdepartment",Toast.LENGTH_LONG);
        val frag_transaction = manager.beginTransaction()
        frag_transaction.replace(R.id.fragmentdetail,fragemployeesearch)
//        frag_transaction.addToBackStack(null)
        frag_transaction.commit()
    }
    fun fragmentCompanyInfo(){
        val fragcompanyinfo = Company_info()
        val manager = supportFragmentManager
        Toast.makeText(this,"Button Fragmentdepartment",Toast.LENGTH_LONG);
        val frag_transaction = manager.beginTransaction()
        frag_transaction.replace(R.id.fragmentdetail,fragcompanyinfo)
//        frag_transaction.addToBackStack(null)
        frag_transaction.commit()
    }

}





