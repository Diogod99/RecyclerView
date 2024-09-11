package com.devspace.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val rvList = findViewById<RecyclerView>(R.id.rv_list)
        val adapter = ContactListAdapter()

        rvList.adapter = adapter
        rvList.layoutManager = LinearLayoutManager (this)

        adapter.submitList(contacts)
    }
}

val contacts = listOf(
    Contact(
        name = "Diogo",
        phone = "(351) 911168464",
        icon = R.drawable.sample2
    ),Contact(
        name = "Rita",
        phone = "(351) 963852741",
        icon = R.drawable.sample1
    ),Contact(
        name = "Duarte",
        phone = "(351) 961472583",
        icon = R.drawable.sample8
    ),Contact(
        name = "Vasco",
        phone = "(351) 915753258",
        icon = R.drawable.sample9
    ),Contact(
        name = "Francisco",
        phone = "(351) 968543217",
        icon = R.drawable.sample10
    ),Contact(
        name = "Maria",
        phone = "(351) 914785236",
        icon = R.drawable.sample3
    ),Contact(
        name = "Sofia",
        phone = "(351) 961236547",
        icon = R.drawable.sample4
    ),Contact(
        name = "Ines",
        phone = "(351) 937126842",
        icon = R.drawable.sample5
    ),Contact(
        name = "Leonor",
        phone = "(351) 91856324",
        icon = R.drawable.sample16
    ),Contact(
        name = "Ana Silva",
        phone = "(351) 912345678",
        icon = R.drawable.sample6
    ),Contact(
        name = "Carlos Oliveira",
        phone = "(351) 923456789",
        icon = R.drawable.sample7
    ), Contact(
        name = "Juliano Costa", "(351) 945678901", R.drawable.sample8
    )
)