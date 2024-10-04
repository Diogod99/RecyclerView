package com.devspace.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ContactDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_detail)

        val tvName = findViewById<TextView>(R.id.tv_detail_name)
        val tvPhone = findViewById<TextView>(R.id.tv_detail_phone)
        val image = findViewById<ImageView>(R.id.iv_detail_image)
        val tvShare = findViewById<TextView>(R.id.tv_detail_shareContact)


        val name = intent.getStringExtra("name")
        val phone = intent.getStringExtra("phone")
        val icone = intent.getIntExtra("icone", R.drawable.sample1)

        tvName.text = name
        tvPhone.text = phone
        image.setImageResource(icone)

        tvShare.setOnClickListener {
            val sendIntent: Intent = Intent().apply{
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "$name $phone")
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, null)
            startActivity(shareIntent)

        }


    }
}