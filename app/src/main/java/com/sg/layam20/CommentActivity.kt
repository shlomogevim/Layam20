package com.sg.layam20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_comment.*

class CommentActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comment)
        val index=intent.getIntExtra(MAD_INDEX,0)
        val txt:String=getComment(index)
        etComentActivity.setText(txt)
    }

    private fun getComment(index: Int): String {
        var txt=""
        when(index) {
            1 -> txt=text1()
            2 -> txt=text2()
            3 -> txt=text3()
            4 -> txt=text4()
            5 -> txt=text5()
            6 -> txt=text6()
            7 -> txt=text7()
            8 -> txt=text8()
            9 -> txt=text9()
            10 -> txt=text10()
            11 -> txt=text11()
            12 -> txt=text12()
            13 -> txt=text13()
            else -> txt=text0()
        }


       return txt
    }

    private fun text0(): String {
        var txt=""


        return txt
    }

    private fun text1(): String {
        var txt=""
        txt="\n"+"החוף קרוי על שם און ברזילי" +
                "\n"+ "חברנו הטוב וגולש אגדי" +
                "\n"+ "שנפטר ב 2020."+
                "\n"+ "--------------"+
                "\n"+ "--------------"+
                "\n"+ "--------------"+
                "\n"+  "המד ממוקם על הסוכה של המציל" +
                "\n"+  "הידוע יותר בשם:" +
                "\n"+ "\"הבית של ננו\""
        return txt
    }
    private fun text2(): String {
        var txt=""
        txt="\n"+"המד ממקום על השובר בשווי ציון."


        return txt
    }
    private fun text3()=
        "\n"+"המד ממקום על הגדר של" +
                "\n"+ "מלון חוף התמרים. " +
                "\n"+ "נמל הבית של יוסי דיין"+
                "\n"+ "וקבוצת הוואסאפ:"+
                "\n"+ "\"חולי רוח\""
    private fun text4()=
        "\n"+"המד ממקום על המכון" +
                "\n"+ "לחקר הימים והאגמים בשיקמונה. "

    private fun text5()=
        "\n"+"המד ממקום על הכנסיה" +
                "\n"+ "בין המכון לדשא בבת גלים. "

    private fun text6()=
        "\n"+"המד ממקום בחוף נירוונה" +
                "\n"+ "דרומית לחוף דדו."
    private fun text7()=
        "\n"+"באמת לא מכיר את המד הזה"

    private fun text8()=
        "\n"+"המד ממקום בשדות ים" +
                "\n"+ "ליד החנות פריגל של מתי."
    private fun text9()=
        "\n"+"לא מכיר את המד הזה"
    private fun text10()=
        "\n"+"אילת"
    private fun text11()=
        "\n"+"המד ממוקם על מסעדת מגדלנה"+
                "\n"+ "צומת מגדל" +
                "\n"+ "כשני קילומטר צפונית מהמשאבות."
    private fun text12()=
        "\n"+"המד ממוקם על מצוף בתוך הכנרת"+
                "\n"+ "כקילומטר מזרחית לאתר ספיר" +
                "\n"+ "וכמאתיים מטר מהחוף"+
                "\n"+ "נותן אידקציה טובה לרוח בגינו."
    private fun text13()=
        "\n"+"המד ממוקם על קצה המזח"+
                "\n"+ "בגן הלאומי כפר נחום" +
                "\n"+ "נותן אידקציה טובה לרוח בחורשה."

}