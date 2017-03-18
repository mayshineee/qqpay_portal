package com.common.util;
/**
 * 校验日期
 * @author zjx
 *
 */
public class CheckDateUtil {
	/**
	 * 检查两个日期条件是否符合;
	 * 
	 * @param selectStartYear
	 * @param selectStartMonth
	 * @param selectStartDay
	 * @param selectEndYear
	 * @param selectEndMonth
	 * @param selectEndDay
	 * @return
	 */
	public static boolean checkDate(int selectStartYear, int selectStartMonth, int selectStartDay, int selectEndYear,
			int selectEndMonth, int selectEndDay) {
		if (selectEndYear > selectStartYear) {
			return checkDate(selectStartYear, selectStartMonth, selectStartDay)
					&& checkDate(selectEndYear, selectEndMonth, selectEndDay);
		} else if (selectEndYear == selectStartYear) {
			if (selectEndMonth > selectStartMonth) {
				return checkDate(selectStartYear, selectStartMonth, selectStartDay)
						&& checkDate(selectEndYear, selectEndMonth, selectEndDay);
			} else if (selectEndMonth == selectStartMonth) {
				if (selectEndDay > selectStartDay) {
					return checkDate(selectStartYear, selectStartMonth, selectStartDay)
							&& checkDate(selectEndYear, selectEndMonth, selectEndDay);
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	private static boolean checkDate(int year, int month, int day) {
		switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if(day > 0 && day <32){
				return true;
			}else{
				return false;
			}
		case 4:
		case 6:
		case 9:
		case 11:
			if(day > 0 && day <31){
				return true;
			}else{
				return false;
			}
		case 2:
			if((year % 4 ==0 && year % 100 != 0) || year % 400 == 0){
				if(day > 0 && day <30){
					return true;
				}else{
					return false;
				}
			}else{
				if(day > 0 && day < 29){
					return true;
				}else{
					return false;
				}
			}
		default:
			return false;
		}
		
	}
}
