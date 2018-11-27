package com.tongji.lisa1225.calendartest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.prolificinteractive.materialcalendarview.*;

import com.github.tibolte.agendacalendarview.AgendaCalendarView;
import com.github.tibolte.agendacalendarview.CalendarManager;
import com.github.tibolte.agendacalendarview.CalendarPickerController;
import com.github.tibolte.agendacalendarview.models.BaseCalendarEvent;
import com.github.tibolte.agendacalendarview.models.CalendarEvent;
import com.github.tibolte.agendacalendarview.models.DayItem;
import com.github.tibolte.agendacalendarview.models.WeekItem;


import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.*;
import android.util.Log;
import android.support.annotation.*;

import java.util.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import butterknife.*;

public class MainActivity extends AppCompatActivity {
    //@BindView(R.id.imcv_tem_mater_calendar_week)
    //MaterialCalendarView imcvTemMaterCalendarWeek=findViewById(R.id.calendarView);

    //MaterialCalendarView imcvTemMaterCalendarWeek=findViewById(R.id.imcv_tem_mater_calendar_week);
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //MaterialCalendarView imcvTemMaterCalendarWeek=findViewById(R.id.imcv_tem_mater_calendar_week);
        MaterialCalendarView imcvTemMaterCalendarWeek=findViewById(R.id.liView);
        //imcvTemMaterCalendarWeek.state().edit() .setFirstDayOfWeek(Calendar.MONDAY) .setCalendarDisplayMode(CalendarMode.WEEKS) .commit();
        imcvTemMaterCalendarWeek.state().edit() .setFirstDayOfWeek(Calendar.MONDAY).commit();

        //imcvTemMaterCalendarWeek.setTopbarVisible(true);//隐藏标题栏和两边的箭头
        Calendar calendar = Calendar.getInstance();
        imcvTemMaterCalendarWeek.setSelectedDate(calendar.getTime());//当日选中
        // 设置选中日期颜色。
        imcvTemMaterCalendarWeek.setSelectionColor(getResources().getColor(R.color.ControlNormal));
        //设置日期选中时的点击事件。
        imcvTemMaterCalendarWeek.setOnDateChangedListener(new OnDateSelectedListener() {
            @Override
            public void onDateSelected(@NonNull MaterialCalendarView widget, @NonNull CalendarDay date, boolean selected) { //在这个方法中处理选中事件。
                // dealWithData(date);
            }
            });

    }
}
