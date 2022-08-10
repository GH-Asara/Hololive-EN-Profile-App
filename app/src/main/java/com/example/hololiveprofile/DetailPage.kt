package com.example.hololiveprofile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.ImageView
import android.widget.TextView

class DetailPage : AppCompatActivity() {
    companion object {
        const val EXTRA_NAME = "extra_name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_page)

        val imgProfilePicture : ImageView = findViewById(R.id.imgProfilePicture)
        val txtDescription : TextView = findViewById(R.id.txtDescription)
        val txtBasicDetail : TextView = findViewById(R.id.txtBasicDetail)
        val txtPersonalDetail : TextView = findViewById(R.id.txtPersonalDetail)
        val txtMediaDetail : TextView = findViewById(R.id.txtMediaDetail)

        when(intent.getStringExtra(EXTRA_NAME)){
            "Mori Calliope" -> {
                imgProfilePicture.setImageResource(R.drawable.mori_calliope)
                txtDescription.setText(R.string.description_calliope)
                txtBasicDetail.setText(R.string.basic_calliope)
                txtPersonalDetail.setText(R.string.personal_calliope)
                txtMediaDetail.setText(R.string.media_calliope)
            }
        }

        txtBasicDetail.movementMethod = LinkMovementMethod.getInstance()
        txtPersonalDetail.movementMethod = LinkMovementMethod.getInstance()
        txtMediaDetail.movementMethod = LinkMovementMethod.getInstance()
    }
}