package com.example.mobdev_assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button:Button=findViewById(R.id.Show);
        val result:TextView= findViewById(R.id.Zodiacs);

        var flag:String = "Air"

        val spinnnerVal:Spinner= findViewById(R.id.Select)

        var options= arrayOf("Air","Earth","Fire","Water")

        spinnnerVal.adapter=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options)

        button.setOnClickListener{view->
            if (flag == "Air"){
                result.text="\tGemini\n"+"\tLibra\n"+"\tAquarius";
            }
            else if (flag == "Earth"){
                result.text="\tTaurus\n"+"\tVirgo\n"+"\tCapricorn";
            }
            else if (flag == "Fire"){
                result.text="\tAries\n"+"\tLeo\n"+"\tSagittarius";
            }
            else if (flag == "Water"){
                result.text="\tCancer\n"+"\tPisces\n"+"\tScorpio";
            }
            else result.text=" "
        }

        spinnnerVal.onItemSelectedListener= object:AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag= options.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

    }

}