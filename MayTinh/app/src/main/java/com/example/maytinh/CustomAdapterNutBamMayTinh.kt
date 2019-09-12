package com.example.maytinh

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text
//import android.support.v7.app.AlertDialog

class CustomAdapterNutBamMayTinh constructor(var context: Context, var mangnutbam : ArrayList<NutBam>) : BaseAdapter() {
    class ViewHolder(row: View){
        var mTextView: TextView
        var mImageView: ImageView

        init {
            mTextView  = row.findViewById(R.id.tv_nutbam) as TextView
            mImageView = row.findViewById(R.id.iv_hinh) as ImageView
        }
    }
    override fun getView(position: Int, convertview: View?, p2: ViewGroup?): View {

        if(position == 0 || position == 1 || position == 2 || position == 3 || position == 7 || position == 11 || position == 15 || position == 18 || position == 19  )
        {
            var view: View?
            var viewholder: ViewHolder
            if(convertview == null){
                var layoutinflater : LayoutInflater = LayoutInflater.from(context)
                view = layoutinflater.inflate(R.layout.dong_nutbam_function,null)
                viewholder = ViewHolder(view)
                view.tag = viewholder

            }else{
                view = convertview
                viewholder = convertview.tag as ViewHolder
            }

            var nutbam : NutBam = getItem(position) as NutBam
            viewholder.mTextView.text = nutbam.ten
            viewholder.mImageView.setImageResource(nutbam.hinhanh)
            return view as View
        }
        else
        {
            var view: View?
            var viewholder: ViewHolder
            if(convertview == null){
                var layoutinflater : LayoutInflater = LayoutInflater.from(context)
                view = layoutinflater.inflate(R.layout.dong_nutbam,null)
                viewholder = ViewHolder(view)
                view.tag = viewholder

            }else{
                view = convertview
                viewholder = convertview.tag as ViewHolder
            }

            var nutbam : NutBam = getItem(position) as NutBam
            viewholder.mTextView.text = nutbam.ten
            viewholder.mImageView.setImageResource(nutbam.hinhanh)
            return view as View
        }
    }

    override fun getItem(position: Int): Any {
        return mangnutbam.get(position)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
//        return if (this.mangnutbam != null) this.mangnutbam.size else 0

        return mangnutbam.size
    }
}