package com.example.jurukira_prototype

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.jurukira_prototype.dummy.DummyContent

class MainActivity : AppCompatActivity(), CompanyFragment.OnListFragmentInteractionListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onListFragmentInteraction(item: DummyContent.DummyItem?) {
        // TODO: Attach fragment_company to fragment_entry
        val placeholder = item.toString()

    }
}
