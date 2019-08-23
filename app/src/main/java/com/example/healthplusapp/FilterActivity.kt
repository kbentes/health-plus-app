package com.example.healthplusapp

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import com.example.healthplusapp.`object`.Clinic
import com.example.healthplusapp.adapter.FilterAdapter
import com.example.healthplusapp.repository.directory.ClinicRepository
import com.github.kittinunf.fuel.httpGet
import kotlinx.android.synthetic.main.filter_activity.*
import kotlin.collections.ArrayList
import com.github.kittinunf.fuel.httpGet
import com.github.kittinunf.result.Result;

class FilterActivity : AppCompatActivity() {

    private lateinit var placeArrayList: ArrayList<Clinic>
    private lateinit var mAdapter: FilterAdapter
    internal var numberOfColumns = 2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.filter_activity)

        initData()

        initUI()

        initDataBinding()

        initActions()
    }

    //region Init Functions
    private fun initData() {
        placeArrayList = ClinicRepository.clinicList
    }

    private fun initUI() {

        mAdapter = FilterAdapter(placeArrayList)

        // get RecyclerView and bind
        recyclerView.layoutManager = GridLayoutManager(this, numberOfColumns)
        recyclerView.itemAnimator = DefaultItemAnimator()

        val searchEditText = findViewById<EditText>(R.id.searchEditText)
        searchEditText.isFocusable = false

        val btnAbertoAgora = findViewById<Button>(R.id.btnAbertoAgora)
        btnAbertoAgora.setOnClickListener { Toast.makeText(applicationContext, "Clicou em aberto agora", Toast.LENGTH_SHORT).show() }

        val btnFavorito = findViewById<Button>(R.id.btnFavorito)
        btnFavorito.setOnClickListener { Toast.makeText(applicationContext, "Clicou em favoritos", Toast.LENGTH_SHORT).show() }

    }

    private fun initDataBinding() {
        recyclerView.adapter = mAdapter
    }

    private fun initActions() {

        mAdapter.setOnItemClickListener(object : FilterAdapter.OnItemClickListener{
            override fun onItemClick(view: View, obj: Clinic, position: Int) {
                Toast.makeText(this@FilterActivity, "Clicou em : " + obj.name, Toast.LENGTH_LONG).show()
            }
        })
    }

    //endregion
}
