package com.example.maytinh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*
//import kotlinx.android.synthetic.main.activity_second.tv_noidung

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // nhan du lieu truyen tu intent

        val intent = intent
//        val hoten : String = intent.getStringExtra("data")
//        val so : Int = intent.getIntExtra("data", 0)
//        val mangso : IntArray = intent.getIntArrayExtra("data")
//        txtNoiDung.text = mangso[0].toString()

        val hs: HocSinh = intent.getSerializableExtra("data") as HocSinh
        tv_noidung.text = hs.diachi +"-"+ hs.hoten


        // xu ly back home

        btn_back.setOnClickListener{
            val intent: Intent = Intent(this@SecondActivity, MainActivity::class.java)
//            intent.putExtra("data","do van tu")
//            val arrayNumber:  IntArray = intArrayOf(123,456,789)
//            intent.putExtra("data", arrayNumber)

            startActivity(intent)
//
        }
    }
}
