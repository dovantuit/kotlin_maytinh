package com.example.maytinh

import kotlinx.android.synthetic.main.activity_main.*
import net.objecthunter.exp4j.Expression
import net.objecthunter.exp4j.ExpressionBuilder

class TinhToanSo {

    fun tinhtoan(bieuthuc: String ) : Any {

        val expression = ExpressionBuilder(bieuthuc).build()
        val result = expression.evaluate()
        val resultInt = result.toInt()
        val longResult = result.toLong()
        // check kỉêu dữ liệu của kết quả để trả lại đúng kỉêu
//        if (result == longResult.toDouble()){
//            return longResult.toDouble()
//        }
//        else
//            return longResult.toString()
        return resultInt.toString()
    }

}