package com.example.kotlin_lab

import android.app.TabActivity
import android.content.Intent
import android.os.Bundle
import android.widget.TabHost.TabSpec


class MainActivity : TabActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        val res = resources
        val tab1Indicator = res.getString(R.string.tab1_indicator)
        val tab2Indicator = res.getString(R.string.tab2_indicator)
        val tab3Indicator = res.getString(R.string.tab3_indicator)
        val tabHost = getTabHost()
        var spec: TabSpec?
        var intent: Intent
        intent = Intent().setClass(this, StudentsActivity::class.java)
        spec = tabHost.newTabSpec("students").setIndicator(tab1Indicator)
            .setContent(intent)
        tabHost.addTab(spec)
        intent = Intent().setClass(this, TeachersActivity::class.java)
        spec = tabHost.newTabSpec("teachers").setIndicator(tab2Indicator)
            .setContent(intent)
        tabHost.addTab(spec)
        intent = Intent().setClass(this, ClassesActivity::class.java)
        spec = tabHost.newTabSpec("class").setIndicator(tab3Indicator)
            .setContent(intent)
        tabHost.addTab(spec)
        tabHost.setCurrentTab(1)
    }
}
