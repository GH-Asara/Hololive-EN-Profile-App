package com.example.hololiveprofile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvHololive: RecyclerView
    private var list: ArrayList<Hololive> = arrayListOf()
    private var title: String = "Hololive EN Profile App"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)

        rvHololive = findViewById(R.id.rv_hololive)
        rvHololive.setHasFixedSize(true)

        list.addAll(HololiveData.listData)
        showRecyclerCardView()
    }

    private fun showRecyclerCardView() {
        rvHololive.layoutManager = LinearLayoutManager(this)
        val cardViewHeroAdapter = CardViewAdapterHololive(list)
        rvHololive.adapter = cardViewHeroAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_favorite -> {
            val moveIntent = Intent(this@MainActivity, AboutPage::class.java)
            startActivity(moveIntent)
            true
        }
        else -> {super.onOptionsItemSelected(item)}
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }
}