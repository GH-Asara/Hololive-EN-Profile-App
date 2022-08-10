package com.example.hololiveprofile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView

class DetailPage : AppCompatActivity() {
    companion object {
        const val EXTRA_NAME = "extra_name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_page)
        val extra = intent.getStringExtra(EXTRA_NAME)
        var name = ""
        if (extra != null) {
            name = if(extra.takeLast(1) == "s" || extra.takeLast(1) == "S"){
                "$extra'"
            } else{
                "$extra's"
            }
        }
        setActionBarTitle("$name Details")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val imgProfilePicture : ImageView = findViewById(R.id.imgProfilePicture)
        val txtName : TextView = findViewById(R.id.txtName)
        val txtDescription : TextView = findViewById(R.id.txtDescription)
        val txtBasicDetail : TextView = findViewById(R.id.txtBasicDetail)
        val txtPersonalDetail : TextView = findViewById(R.id.txtPersonalDetail)
        val txtMediaDetail : TextView = findViewById(R.id.txtMediaDetail)

        when(intent.getStringExtra(EXTRA_NAME)){
            "Mori Calliope" -> {
                imgProfilePicture.setImageResource(R.drawable.mori_calliope)
                txtName.setText(R.string.name_calliope)
                txtDescription.setText(R.string.description_calliope)
                txtBasicDetail.setText(R.string.basic_calliope)
                txtPersonalDetail.setText(R.string.personal_calliope)
                txtMediaDetail.setText(R.string.media_calliope)
            }
            "Takanashi Kiara" -> {
                imgProfilePicture.setImageResource(R.drawable.takanashi_kiara)
                txtName.setText(R.string.name_takanashi)
                txtDescription.setText(R.string.description_takanashi)
                txtBasicDetail.setText(R.string.basic_takanashi)
                txtPersonalDetail.setText(R.string.personal_takanashi)
                txtMediaDetail.setText(R.string.media_takanashi)
            }
            "Ninomae Ina'nis" -> {
                imgProfilePicture.setImageResource(R.drawable.ninomae_inanis)
                txtName.setText(R.string.name_ninomae)
                txtDescription.setText(R.string.description_ninomae)
                txtBasicDetail.setText(R.string.basic_ninomae)
                txtPersonalDetail.setText(R.string.personal_ninomae)
                txtMediaDetail.setText(R.string.media_ninomae)
            }
            "Gawr Gura" -> {
                imgProfilePicture.setImageResource(R.drawable.gawr_gura)
                txtName.setText(R.string.name_gawr)
                txtDescription.setText(R.string.description_gawr)
                txtBasicDetail.setText(R.string.basic_gawr)
                txtPersonalDetail.setText(R.string.personal_gawr)
                txtMediaDetail.setText(R.string.media_gawr)
            }
            "Watson Amelia" -> {
                imgProfilePicture.setImageResource(R.drawable.watson_amelia)
                txtName.setText(R.string.name_watson)
                txtDescription.setText(R.string.description_watson)
                txtBasicDetail.setText(R.string.basic_watson)
                txtPersonalDetail.setText(R.string.personal_watson)
                txtMediaDetail.setText(R.string.media_watson)
            }
            "IRyS" -> {
                imgProfilePicture.setImageResource(R.drawable.irys)
                txtName.setText(R.string.name_irys)
                txtDescription.setText(R.string.description_irys)
                txtBasicDetail.setText(R.string.basic_irys)
                txtPersonalDetail.setText(R.string.personal_irys)
                txtMediaDetail.setText(R.string.media_irys)
            }
            "Ceres Fauna" -> {
                imgProfilePicture.setImageResource(R.drawable.ceres_fauna)
                txtName.setText(R.string.name_ceres)
                txtDescription.setText(R.string.description_ceres)
                txtBasicDetail.setText(R.string.basic_ceres)
                txtPersonalDetail.setText(R.string.personal_ceres)
                txtMediaDetail.setText(R.string.media_ceres)
            }
            "Ouro Kronii" -> {
                imgProfilePicture.setImageResource(R.drawable.ouro_kronii)
                txtName.setText(R.string.name_ouro)
                txtDescription.setText(R.string.description_ouro)
                txtBasicDetail.setText(R.string.basic_ouro)
                txtPersonalDetail.setText(R.string.personal_ouro)
                txtMediaDetail.setText(R.string.media_ouro)
            }
            "Nanashi Mumei" -> {
                imgProfilePicture.setImageResource(R.drawable.nanashi_mumei)
                txtName.setText(R.string.name_nanashi)
                txtDescription.setText(R.string.description_nanashi)
                txtBasicDetail.setText(R.string.basic_nanashi)
                txtPersonalDetail.setText(R.string.personal_nanashi)
                txtMediaDetail.setText(R.string.media_nanashi)
            }
            "Hakos Baelz" -> {
                imgProfilePicture.setImageResource(R.drawable.hakos_baelz)
                txtName.setText(R.string.name_hakos)
                txtDescription.setText(R.string.description_hakos)
                txtBasicDetail.setText(R.string.basic_hakos)
                txtPersonalDetail.setText(R.string.personal_hakos)
                txtMediaDetail.setText(R.string.media_hakos)
            }
            "Tsukumo Sana" -> {
                imgProfilePicture.setImageResource(R.drawable.tsukumo_sana)
                txtName.setText(R.string.name_tsukumo)
                txtDescription.setText(R.string.description_tsukumo)
                txtBasicDetail.setText(R.string.basic_tsukumo)
                txtPersonalDetail.setText(R.string.personal_tsukumo)
                txtMediaDetail.setText(R.string.media_tsukumo)
            }
            "Omegaα" -> {
                imgProfilePicture.setImageResource(R.drawable.omegaalpha)
                txtName.setText(R.string.name_omega)
                txtDescription.setText(R.string.description_omega)
                txtBasicDetail.setText(R.string.basic_omega)
                txtPersonalDetail.setText(R.string.personal_omega)
                txtMediaDetail.setText(R.string.media_omega)
            }
            "Motoaki Tanigo" -> {
                imgProfilePicture.setImageResource(R.drawable.motoaki_tanigo)
                txtName.setText(R.string.name_motoaki)
                txtDescription.setText(R.string.description_motoaki)
                txtBasicDetail.setText(R.string.basic_motoaki)
                txtPersonalDetail.setText(R.string.personal_motoaki)
                txtMediaDetail.setText(R.string.media_motoaki)
            }
            "Yuujin A" -> {
                imgProfilePicture.setImageResource(R.drawable.a_chan)
                txtName.setText(R.string.name_yuujin)
                txtDescription.setText(R.string.description_yuujin)
                txtBasicDetail.setText(R.string.basic_yuujin)
                txtPersonalDetail.setText(R.string.personal_yuujin)
                txtMediaDetail.setText(R.string.media_yuujin)
            }
            "Harusaki Nodoka" -> {
                imgProfilePicture.setImageResource(R.drawable.harusaki_nodoka)
                txtName.setText(R.string.name_harusaki)
                txtDescription.setText(R.string.description_harusaki)
                txtBasicDetail.setText(R.string.basic_harusaki)
                txtPersonalDetail.setText(R.string.personal_harusaki)
                txtMediaDetail.setText(R.string.media_harusaki)                
            }
        }

        txtBasicDetail.movementMethod = LinkMovementMethod.getInstance()
        txtPersonalDetail.movementMethod = LinkMovementMethod.getInstance()
        txtMediaDetail.movementMethod = LinkMovementMethod.getInstance()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                this.finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }
}