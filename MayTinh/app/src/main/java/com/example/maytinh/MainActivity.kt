package com.example.maytinh

import android.content.Intent
import android.os.AsyncTask
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.dong_nutbam.*
class MainActivity : AppCompatActivity() {
    var arrayNut : ArrayList<NutBam> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        settingBanDau()
        TinhToan()
    }

    fun settingBanDau(){
        arrayNut.add(NutBam("C",R.drawable.images))
        arrayNut.add(NutBam("(",R.drawable.images))
        arrayNut.add(NutBam(")",R.drawable.images))
        arrayNut.add(NutBam("/",R.drawable.images))
        arrayNut.add(NutBam("7",R.drawable.images))
        arrayNut.add(NutBam("8",R.drawable.images))
        arrayNut.add(NutBam("9",R.drawable.images))
        arrayNut.add(NutBam("*",R.drawable.images))
        arrayNut.add(NutBam("4",R.drawable.images))
        arrayNut.add(NutBam("5",R.drawable.images))
        arrayNut.add(NutBam("6",R.drawable.images))
        arrayNut.add(NutBam("-",R.drawable.images))
        arrayNut.add(NutBam("1",R.drawable.images))
        arrayNut.add(NutBam("2",R.drawable.images))
        arrayNut.add(NutBam("3",R.drawable.images))
        arrayNut.add(NutBam("+",R.drawable.images))
        arrayNut.add(NutBam("0",R.drawable.images))
        arrayNut.add(NutBam(".",R.drawable.images))
        arrayNut.add(NutBam("=",R.drawable.images))
        arrayNut.add(NutBam("<",R.drawable.images))

    }

    fun TinhToan(){
        gridview_nutbam.adapter = CustomAdapterNutBamMayTinh(this@MainActivity, arrayNut)
        gridview_nutbam.setOnItemClickListener { adapterView, view, i, l ->
            if(arrayNut[i].ten.toString() == "C"){
                tv_noidung.text = ""
            } else if(arrayNut[i].ten.toString() == "<"){
                val string  = tv_noidung.text.toString()
                if(string.isNotEmpty()){
                    tv_noidung.text = string.substring(0,string.length - 1)
                }
            } else if(arrayNut[i].ten.toString() == "=" ){
                try {
                    // xử lí tính toán
                    var ketqua = TinhToanSo()
                    var res = ketqua.tinhtoan(tv_noidung.text.toString())
                    tv_noidung.text = res.toString()

                } catch (e: Exception) {
//                Log.d("Exception", " message : " + e.message)
                    tv_noidung.text = e.message
                }
            } else{
                tv_noidung.append(arrayNut[i].ten.toString())
            }
        }
    }


    // chuyen man hinh

//        btn_xuly.setOnClickListener{
//            tv_noidung.text = "next page goooooooooo!"
//            Toast.makeText(this@MainActivity, tv_noidung.text, Toast.LENGTH_LONG).show()
//            val intent: Intent = Intent(this@MainActivity, SecondActivity::class.java)
////            intent.putExtra("data","do van tu")
////            val arrayNumber:  IntArray = intArrayOf(123,456,789)
////            intent.putExtra("data", arrayNumber)
//
//
//            val hocSinh: HocSinh = HocSinh("do van tu", 2000, "ho chi minh")
//            intent.putExtra("data", hocSinh)
//            startActivity(intent)
//
////            // xu ly ben duoi
////            btnXuly.setOnClickListener{
////                XuLyCongViec().execute()
////            }
//        }

    /*
    inner class XuLyCongViec : AsyncTask<Void, String, String>(){
        override fun onPreExecute() {
            super.onPreExecute()
            txtNoiDung.text = "bat dau thuc hien\n"
        }
        override fun doInBackground(vararg p0: Void?): String {
            return  "ket thuc cong viec "
        }


        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)

            txtNoiDung.append(result)
        }
    }
    */

}