package com.example.businessdemo.util;

import org.apache.commons.lang.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtil {


    /**
     * 年月日时分秒
     */
    public static final String TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
    /**
     * 年月日
     */
    public static final String DATE_PATTERN_YYYYMMDD = "yyyyMMdd";
    /**
     * 年月日
     */
    public static final String DEFAULT_PATTERN = "yyyy-MM-dd";

    /**
     * 常用的格式化日期
     * 　Date　to String
     *
     * @param date Date
     * @return String
     */
    public static String formatDate(Date date) {
        if (date != null) {
            SimpleDateFormat formatter = new SimpleDateFormat(DEFAULT_PATTERN);
            return formatter.format(date);
        }
        return "";
    }

    public static String getDate(String param){
        String pattern = param;
        if(StringUtils.isBlank(pattern)){
            pattern = DATE_PATTERN_YYYYMMDD;
        }
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        return formatter.format(new Date());
    }

    public static java.sql.Timestamp parseTimestamp(String dateStr, String format) {
        Date date = parseDate(dateStr, format);
        if (date != null) {
            long t = date.getTime();
            return new java.sql.Timestamp(t);
        } else {
            return null;
        }
    }

    public static Date parseDate(String dateStr, String format) {
        Date date = null;
        try {
            java.text.DateFormat df = new SimpleDateFormat(format);
            if ((!"".equals(dateStr)) && (dateStr.length() < format.length())) {
                dateStr += format.substring(dateStr.length()).replaceAll("[YyMmDdHhSs]", "0");
            }
            date = df.parse(dateStr);
        } catch (Exception e) {
        }
        return date;
    }

    /**
     * 当前时间加月，返回一个新的日期
     *
     * @param month
     * @return
     */
    public static Date getDateByMonth(int month) {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH, month);
        return parseDate(formatDate(c.getTime()), DEFAULT_PATTERN);
    }

    /**
     * 通过时间判断两个时间的间隔天数
     *
     * @param startDate
     * @param endDate
     * @return
     */
    public static int differentDaysByMillisecond(Date startDate, Date endDate) {
        Date date1 = DateUtil.parseTimestamp(DateUtil.formatDate(startDate), DateUtil.DEFAULT_PATTERN);
        Date date2 = DateUtil.parseTimestamp(DateUtil.formatDate(endDate), DateUtil.DEFAULT_PATTERN);
        int days = (int) ((date2.getTime() - date1.getTime()) / (1000 * 3600 * 24));
        return days;
    }

    /**
     * 通过一个日期添加 n 年 得到一个新的日期
     *
     * @param date 日期
     * @param year 年
     * @return
     */
    public static Date addYear(Date date, int year) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        //把日期往后增加n年.整数往后推,负数往前移动
        calendar.add(Calendar.YEAR, year);
        return calendar.getTime();
    }

    /**
     * 判断一个时间是否在另外两个时间区间中
     * @param date
     * @param startTime
     * @param endTime
     * @return
     */
    public static boolean between(Date date, Date startTime, Date endTime){

        if(date.getTime() == startTime.getTime() ||
                date.getTime() == endTime.getTime()){
            return true;
        }

        Calendar dateCal = Calendar.getInstance();
        dateCal.setTime(date);

        Calendar startTimeCal = Calendar.getInstance();
        startTimeCal.setTime(startTime);

        Calendar endTimeCal = Calendar.getInstance();
        endTimeCal.setTime(endTime);

        if(dateCal.after(startTimeCal) && dateCal.before(endTimeCal)){
            return true;
        } else {
            return false;
        }
    }
}
