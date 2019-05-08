package com.example.jurukira_prototype

class CompanyModel (val title: String, val entryModels : Array<EntryModel>){

    fun getCompanyTitle(): String{
        return title
    }

    fun returnEntries(): Array<EntryModel> {
        return entryModels
    }


}