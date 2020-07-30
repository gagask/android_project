package com.example.myapplication

import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button

class OnClickButtonTrainingListener(val action: MainActivity): View.OnClickListener{

    override fun onClick(v: View?) {
        action.setContentView(R.layout.activity_notmain)
    }
}

class OnItemSpinnerSelected(val ButtonTraining: Button): AdapterView.OnItemSelectedListener{
    override fun onNothingSelected(parent: AdapterView<*>?) {

    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        if(position != 0)
            ButtonTraining.isEnabled = true
    }

}