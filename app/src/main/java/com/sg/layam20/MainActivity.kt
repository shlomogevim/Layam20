package com.sg.layam20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() ,OnMadItemClickListener {

lateinit var madList:ArrayList<Mad>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        madList= ArrayList()
        addMads()
        madRecycler.layoutManager=LinearLayoutManager(this)
        madRecycler.addItemDecoration(DividerItemDecoration(this,1))
        madRecycler.adapter=MadAdapter(madList,this)
    }

    private fun addMads() {
        madList.add(Mad("בצת","https://www.windguru.cz/station/1011",R.drawable.b1))
        madList.add(Mad("שבי ציון","https://www.windguru.cz/station/2049",R.drawable.b2))
        madList.add(Mad("ארגמן-עכו","https://www.windguru.cz/station/2050",R.drawable.b3))
        madList.add(Mad("כנסיה-בת גלים","https://www.windguru.cz/station/1112",R.drawable.b4))
        madList.add(Mad("-חוף דדו-נירוונה","https://www.windguru.cz/station/468",R.drawable.b5))
        madList.add(Mad("משאבות-כנרת","https://www.windguru.cz/station/973",R.drawable.b6))
        madList.add(Mad("כפר נחום-כנרת","https://www.windguru.cz/station/1206",R.drawable.b7))




     /*


        mas1.add(Mad("מגדל-כנרת","https://www.windguru.cz/station/1909"))
        mas1.add(Mad("שיקמונה-מכון","https://isramar.ocean.org.il/isramar2009/Haifa/"))
        mas1.add(Mad("שדות ים-פריגל","https://wind.co.il/%d7%9e%d7%96%d7%92-%d7%90%d7%95%d7%99%d7%a8/%d7%a9%d7%99%d7%93%d7%95%d7%a8-%d7%97%d7%99/"))
        mas1.add(Mad("קרית ים-הורוביץ","http://www.surfo.co.il/%D7%9E%D7%96%D7%92-%D7%90%D7%95%D7%95%D7%99%D7%A8"))
        mas1.add(Mad("אילת-מרכז גלישה","http://surfcenter.co.il/%D7%9E%D7%93-%D7%A8%D7%95%D7%97/#cam"))
        mas1.add(Mad("אילת-ניטור לאומי","http://www.meteo-tech.co.il/eilat-yam/eilat_he.asp"))
*/
    }

    override fun onItemClick(item: Mad, position: Int) {
       val intent=Intent(this,MadDetailActivity::class.java)
        intent.putExtra(MAD_NAME,item.name)
        intent.putExtra(MAD_ADRESS,item.address)
        startActivity(intent)
    }
}