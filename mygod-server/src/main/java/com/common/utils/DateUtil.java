package com.common.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2019/12/30.
 */
public class DateUtil {

    public static void main(String[] args) {
        //默认输出格式
        Date date=new Date();

//        dateUtil(date); //基本日期格式

        dateUtil2(date);
    }

    public static void dateUtil(Date date){
        System.out.println(date);//Fri Oct 27 16:56:37 CST 2017
        //日期格式化显示，首先定义格式
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyyMMdd");//显示20171027格式
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd");//显示2017-10-27格式
        SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//显示2017-10-27 10:00:00格式
        SimpleDateFormat sdf4=new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");//显示2017年10月27日10时00分00秒格式
        //将格式应用于日期
        System.out.println(sdf1.format(date));//20171027
        System.out.println(sdf2.format(date));//2017-10-27
        System.out.println(sdf3.format(date));//2017-10-27 17:11:13
        System.out.println(sdf4.format(date));//2017年10月27日17时11分13秒
    }

    public static void dateUtil2(Date d){
        String s;

        /** Date类的格式: Sat Apr 16 13:17:29 CST 2006 */
        System.out.println(d);

        System.out.println("******************************************");

        /** getDateInstance() */
        /** 输出格式: 2006-4-16 */
        s = DateFormat.getDateInstance().format(d);
        System.out.println(s);

        /** 输出格式: 2006-4-16 */
        s = DateFormat.getDateInstance(DateFormat.DEFAULT).format(d);
        System.out.println(s);

        /** 输出格式: 2006年4月16日 星期六 */
        s = DateFormat.getDateInstance(DateFormat.FULL).format(d);
        System.out.println(s);

        /** 输出格式: 2006-4-16 */
        s = DateFormat.getDateInstance(DateFormat.MEDIUM).format(d);
        System.out.println(s);

        /** 输出格式: 06-4-16 */
        s = DateFormat.getDateInstance(DateFormat.SHORT).format(d);
        System.out.println(s);

        /** 输出格式: 2006-01-01 00:00:00 */
        DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        s = format1.format(new Date());
        System.out.println(s);

        /** 输出格式: 2006-01-01 01:00:00 */
        System.out.println((new SimpleDateFormat("yyyy-MM-dd hh:mm:ss")).format(new Date()));


        /** 输出格式: 2006-01-01 13:00:00 */
        System.out.println((new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(new Date()));

        /** 输出格式: 20060101000000***/
        java.text.DateFormat format2 = new SimpleDateFormat("yyyyMMddhhmmss");
        s = format2.format(new Date());
        System.out.println(s);
    }


}
