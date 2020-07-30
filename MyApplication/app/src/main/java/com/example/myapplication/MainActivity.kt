package com.example.myapplication

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initSpinner()
        initButtonTraining()
    }

    private fun initButtonTraining(){
        val buttonTraining = findViewById<Button>(R.id.buttonTraining)
        buttonTraining.setOnClickListener(OnClickButtonTrainingListener(this))
    }

    private fun initSpinner(){
        val spinner = findViewById<MySpinner>(R.id.spinner_my)
        val adapter = CustomAdapter(this, android.R.layout.simple_spinner_item, resources.getStringArray(R.array.training), 0)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter
        spinner.onItemSelectedListener = OnItemSpinnerSelected(buttonTraining)
    }

    private fun initButtonStatistic(){

    }


    class CustomAdapter(context: Context?, textViewResourceId: Int, objects: Array<String?>?, private val hidingItemIndex: Int) :
        ArrayAdapter<String?>(context!!, textViewResourceId, objects!!) {
        override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View? {
            var v: View? = null
            if (position == hidingItemIndex) {
                val tv = TextView(context)
                tv.visibility = View.GONE
                tv.height = 0
                v = tv
            } else {
                v = super.getDropDownView(position, null, parent)
            }
            return v
        }
    }
}
