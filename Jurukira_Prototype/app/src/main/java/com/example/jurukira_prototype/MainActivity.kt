package com.example.jurukira_prototype

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val companyList: Array<CompanyModel> = DataManager.getCompanyList()
        var entryList: Array<EntryModel>

//        for (x in companyList) {
//            println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")
//            println("${x.getCompanyTitle()}")
//            entryList = x.returnEntries()
//            for(y in entryList){
//                println("${y.getEntryTitle()}")
//            }
//        }
    }
}
