package com.example.assignment62

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var total0: TextView = findViewById(R.id.totalcredits)
        var gpa: TextView = findViewById(R.id.gpa)
        var s1: EditText =findViewById(R.id.subject1)
        var s2: EditText =findViewById(R.id.subject2)
        var s3: EditText =findViewById(R.id.subject3)
        var s4: EditText =findViewById(R.id.subject4)
        var s5: EditText =findViewById(R.id.subject5)
        var c1: EditText =findViewById(R.id.credit1)
        var c2: EditText =findViewById(R.id.credit2)
        var c3: EditText =findViewById(R.id.credit3)
        var c4: EditText =findViewById(R.id.credit4)
        var c5: EditText =findViewById(R.id.credit5)
        var p1: EditText =findViewById(R.id.point1)
        var p2: EditText =findViewById(R.id.point2)
        var p3: EditText =findViewById(R.id.point3)
        var p4: EditText =findViewById(R.id.point4)
        var p5: EditText =findViewById(R.id.point5)
        var btnok: Button =findViewById(R.id.ok)
        var btnclear: Button =findViewById(R.id.clear)
        btnok.setOnClickListener(){
            var s1 = s1.text.toString()
            var s2 = s2.text.toString()
            var s3 = s3.text.toString()
            var s4 = s4.text.toString()
            var s5 = s5.text.toString()
            var c1 = c1.text.toString()
            var c2 = c2.text.toString()
            var c3 = c3.text.toString()
            var c4 = c4.text.toString()
            var c5 = c5.text.toString()
            var p1 = p1.text.toString()
            var p2 = p2.text.toString()
            var p3 = p3.text.toString()
            var p4 = p4.text.toString()
            var p5 = p5.text.toString()
            var total1 = 0.00
            var total2 = 0.00
            var total3 = 0.00
            var total4 = 0.00
            var total5 = 0.00
            var total = 0.000
            var totalcru =0.00
            if(s1 == "" || s2 == "" || s3 == "" || s4 == "" || s5 == "" ||
                c1 == "" || c2 == "" || c3 == "" || c4 == "" || c5 == "" ||
                p1 == "" || p2 == "" || p3 == "" || p4 == "" || p5 == ""  ){
                val toast = Toast.makeText(applicationContext, "กรุณาใส่ข้อมูลให้ครบ", Toast.LENGTH_LONG)
                toast.show()
            }
            else{
                total1=c1.toDouble()*p1.toDouble()
                total2=c2.toDouble()*p2.toDouble()
                total3=c3.toDouble()*p3.toDouble()
                total4=c4.toDouble()*p4.toDouble()
                total5=c5.toDouble()*p5.toDouble()
                totalcru =c1.toDouble()+c2.toDouble()+c3.toDouble()+c4.toDouble()+c5.toDouble()
                    total = (total1+total2+total3+total4+total5)/totalcru
                total0.setText(totalcru.toString())
                gpa.setText(total.toString())
            }
        }
        btnclear.setOnClickListener(){
             total0.setText("")
             gpa.setText("")
             s1.setText("")
             s2.setText("")
             s3.setText("")
             s4.setText("")
             s5.setText("")
             c1.setText("")
             c2.setText("")
             c3.setText("")
             c4.setText("")
             c5.setText("")
             p1.setText("")
             p2.setText("")
             p3.setText("")
             p4.setText("")
             p5.setText("")
        }
    }
}