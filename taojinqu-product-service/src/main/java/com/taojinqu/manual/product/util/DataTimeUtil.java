package com.taojinqu.manual.product.util;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DataTimeUtil {

	public final static String YYYYMMDDTZ = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

	public final static TimeZone TIMEZONE_UTC = TimeZone.getTimeZone("GMT+0");

	public static Date getNowUTC() {
		Calendar calendar1 = Calendar.getInstance();
		calendar1.setTimeZone(TIMEZONE_UTC);
		return calendar1.getTime();
	}

	public static Date getUTCDate(String dateformat, String datestr, TimeZone timeZone) throws ParseException {
		DateFormat sdf = new SimpleDateFormat(dateformat);
		sdf.setTimeZone(timeZone);
		return sdf.parse(datestr);
	}

	/**
	 * Date转换成Timestamp
	 * 
	 * @param date
	 * @return
	 */
	public static Timestamp parseDate2Timestamp(Date date) {
		return new Timestamp(date.getTime());
	}
}
