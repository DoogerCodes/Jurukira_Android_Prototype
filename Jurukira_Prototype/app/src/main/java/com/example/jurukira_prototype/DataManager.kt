package com.example.jurukira_prototype

object DataManager{

    val company1 = CompanyModel("Map72", arrayOf( EntryModel("Electric_0"), EntryModel("Water_Bill_0")))
    val company2 = CompanyModel("Map73", arrayOf(EntryModel("Electric_1"), EntryModel("Water_Bill_1")))
    val company3 = CompanyModel("Map74", arrayOf(EntryModel("Electric_2"), EntryModel("Water_Bill_2")))
    val company4 = CompanyModel("Map75", arrayOf(EntryModel("Electric_3"), EntryModel("Water_Bill_3")))
    val listOf_Company: Array<CompanyModel> = arrayOf(company1, company2, company3, company4)

    fun getCompanyList(): Array<CompanyModel>{
        return listOf_Company
    }

    fun getCompanyTitles(): List<String>{
        return listOf(company1.title, company2.title, company3.title, company4.title)
    }
}