package devs.mulham.raee.sample

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.text.format.DateFormat
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import devs.mulham.horizontalcalendar.HorizontalCalendar
import devs.mulham.horizontalcalendar.HorizontalCalendarView
import devs.mulham.horizontalcalendar.utils.HorizontalCalendarListener
import java.util.*

class MainActivityKt : AppCompatActivity() {

    private var horizontalCalendar: HorizontalCalendar? = null

    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        /* start 2 months ago from now */
        val startDate = Calendar.getInstance()
//        startDate.add(Calendar.MONTH, -2)

        /* end after 2 months from now */
        val endDate = Calendar.getInstance()
        endDate.add(Calendar.MONTH, 2)

        // Default Date set to Today.
        val defaultSelectedDate = Calendar.getInstance()
        horizontalCalendar = HorizontalCalendar.Builder(this, findViewById<HorizontalCalendarView>(R.id.calendarView))
            .range(startDate, endDate)
            .datesNumberOnScreen(7)
            .range(startDate, endDate)
            .configure()
            .formatTopText("EEE")
            .formatMiddleText("dd")
            .formatBottomText("MMM")
            .showTopText(true)
            .showBottomText(true)
            .showBottomIndicator(false)
            .dateBackground(ContextCompat.getDrawable(this, R.drawable.sample_background))
            .selectedDateBackground(ContextCompat.getDrawable(this, R.drawable.sample_selected_background))
            .textColor(Color.parseColor("#14212A"), Color.WHITE)
            .colorTextMiddle(Color.parseColor("#14212A"), Color.WHITE)
//            .fontTopText(Typeface.createFromAsset(assets, getString(R.string.font_sourcesans_pro_regular)))
            .end()
            .defaultSelectedDate(defaultSelectedDate)
            .build()
        Log.i("Default Date", DateFormat.format("EEE, MMM d, yyyy", defaultSelectedDate).toString())
        horizontalCalendar!!.calendarListener = object : HorizontalCalendarListener() {
            override fun onDateSelected(date: Calendar, position: Int) {
                val selectedDateStr = DateFormat.format("EEE, MMM d, yyyy", date).toString()
                Toast.makeText(this@MainActivityKt, "$selectedDateStr selected! new kt" , Toast.LENGTH_SHORT).show()
                Log.i("onDateSelected", "$selectedDateStr - Position news kt" +
                        " = $position")
            }

            override fun onDateLongClicked(date: Calendar?, position: Int): Boolean {
                val selectedDateStr = DateFormat.format("EEE, MMM d, yyyy", date).toString()
                Toast.makeText(this@MainActivityKt, "$selectedDateStr selected! new kt" , Toast.LENGTH_SHORT).show()
                return super.onDateLongClicked(date, position)
            }
        }
        val fab: FloatingActionButton = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener { horizontalCalendar!!.goToday(false) }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId
        return if (id == R.id.action_settings) {
            true
        } else super.onOptionsItemSelected(item)
    }
}