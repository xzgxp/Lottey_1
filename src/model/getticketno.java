// package model;
//
// import android.R.string;
// import android.util.Log;
//
// public class getticketno {
// public static int getxinjiangminute(String text, String texta) {
// int temp = 0;
// for (int i = 0; i < 96; i++) {
// if (text.equals(xinjiangticketplan.no[i])) {
// temp = i;
// }
// }
// if (temp < 95) {
// temp = temp + 1;
// } else {
// temp = 0;
// }
// String timeloc = xinjiangticketplan.time[temp];
// String t[] = timeloc.split(":");
// Log.e("qwertyuio", t[1]);
// String p[] = texta.split(":");
// int hour = 0, minute = 0;
// int hourp = 0, minutep = 0;
// boolean isNum = t[0].matches("[0-9]+");
// if (isNum) {
// hour = Integer.parseInt(t[0]);
// }
// boolean isNum1 = t[1].matches("[0-9]+");
// if (isNum1) {
// minute = Integer.parseInt(t[1]);
// }
// boolean isNum2 = p[0].matches("[0-9]+");
// if (isNum2) {
// hourp = Integer.parseInt(p[0]);
// }
// boolean isNum3 = p[1].matches("[0-9]+");
// if (isNum3) {
// minutep = Integer.parseInt(p[1]);
// }
// int resultmin = minute - minutep - 1;
// int symple = 0;
// if (resultmin < 0) {
// symple = -1;
// resultmin = resultmin + 60;
// }
// int resulthour = hour - hourp + symple;
// if (resulthour < 0) {
// resulthour = resulthour + 24;
// }
// resultmin = resultmin + resulthour * 60;
// return resultmin;
//
// }
//
// public static int getjiangximinute(String text, String texta) {
// int temp = 0;
// for (int i = 0; i < 83; i++) {
// if (text.equals(jiangxiticketplan.no[i])) {
// temp = i;
// }
// }
// if (temp < 82) {
// temp = temp + 1;
// } else {
// temp = 0;
// }
// String timeloc = jiangxiticketplan.time[temp];
// String t[] = timeloc.split(":");
// Log.e("qwertyuio", t[1]);
// String p[] = texta.split(":");
// int hour = 0, minute = 0;
// int hourp = 0, minutep = 0;
// boolean isNum = t[0].matches("[0-9]+");
// if (isNum) {
// hour = Integer.parseInt(t[0]);
// }
// boolean isNum1 = t[1].matches("[0-9]+");
// if (isNum1) {
// minute = Integer.parseInt(t[1]);
// }
// boolean isNum2 = p[0].matches("[0-9]+");
// if (isNum2) {
// hourp = Integer.parseInt(p[0]);
// }
// boolean isNum3 = p[1].matches("[0-9]+");
// if (isNum3) {
// minutep = Integer.parseInt(p[1]);
// }
// int resultmin = minute - minutep - 1;
// int symple = 0;
// if (resultmin < 0) {
// symple = -1;
// resultmin = resultmin + 60;
// }
// int resulthour = hour - hourp + symple;
// if (resulthour < 0) {
// resulthour = resulthour + 24;
// }
// resultmin = resultmin + resulthour * 60;
// return resultmin;
//
// }
//
//// public static int gettianjinminute(String text, String texta) {
//// int temp = 0;
//// for (int i = 0; i < 84; i++) {
//// if (text.equals(tianjinticketplan.no[i])) {
//// temp = i;
//// }
//// }
//// if (temp < 83) {
//// temp = temp + 1;
//// } else {
//// temp = 0;
//// }
//// String timeloc = tianjinticketplan.time[temp];
//// String t[] = timeloc.split(":");
//// Log.e("qwertyuio", t[1]);
//// String p[] = texta.split(":");
//// int hour = 0, minute = 0;
//// int hourp = 0, minutep = 0;
//// boolean isNum = t[0].matches("[0-9]+");
//// if (isNum) {
//// hour = Integer.parseInt(t[0]);
//// }
//// boolean isNum1 = t[1].matches("[0-9]+");
//// if (isNum1) {
//// minute = Integer.parseInt(t[1]);
//// }
//// boolean isNum2 = p[0].matches("[0-9]+");
//// if (isNum2) {
//// hourp = Integer.parseInt(p[0]);
//// }
//// boolean isNum3 = p[1].matches("[0-9]+");
//// if (isNum3) {
//// minutep = Integer.parseInt(p[1]);
//// }
//// int resultmin = minute - minutep - 1;
//// int symple = 0;
//// if (resultmin < 0) {
//// symple = -1;
//// resultmin = resultmin + 60;
//// }
//// int resulthour = hour - hourp + symple;
//// if (resulthour < 0) {
//// resulthour = resulthour + 24;
//// }
//// resultmin = resultmin + resulthour * 60;
//// return resultmin;
////
//// }
//
// public static int getchongqingminute(String text, String texta) {
// int temp = 0;
// for (int i = 0; i < 120; i++) {
// if (text.equals(chongqingticketplan.no[i])) {
// temp = i;
// }
// }
// if (temp < 119) {
// temp = temp + 1;
// } else {
// temp = 0;
// }
// String timeloc = chongqingticketplan.time[temp];
// String t[] = timeloc.split(":");
// Log.e("qwertyuio", t[1]);
// String p[] = texta.split(":");
// int hour = 0, minute = 0;
// int hourp = 0, minutep = 0;
// boolean isNum = t[0].matches("[0-9]+");
// if (isNum) {
// hour = Integer.parseInt(t[0]);
// }
// boolean isNum1 = t[1].matches("[0-9]+");
// if (isNum1) {
// minute = Integer.parseInt(t[1]);
// }
// boolean isNum2 = p[0].matches("[0-9]+");
// if (isNum2) {
// hourp = Integer.parseInt(p[0]);
// }
// boolean isNum3 = p[1].matches("[0-9]+");
// if (isNum3) {
// minutep = Integer.parseInt(p[1]);
// }
// int resultmin = minute - minutep - 1;
// int symple = 0;
// if (resultmin < 0) {
// symple = -1;
// resultmin = resultmin + 60;
// }
// int resulthour = hour - hourp + symple;
// if (resulthour < 0) {
// resulthour = resulthour + 24;
// }
// resultmin = resultmin + resulthour * 60;
// return resultmin;
//
// }
//
// public static String Changechongqing(String text) {
// // TODO Auto-generated method stub
// String t[] = text.split(":");
// Log.e("minute4", t[0]);
// Log.e("minute4", t[1]);
// String standard;
//
// int a = 0, b = 0;
// boolean isNum = t[0].matches("[0-9]+");
// if (isNum) {
// a = Integer.parseInt(t[0]);
// }
// boolean isNum1 = t[1].matches("[0-9]+");
// if (isNum1) {
// b = Integer.parseInt(t[1]);
// }
// if (a >= 2 & a < 10) {
// a = 1;
// b = 55;
// }
//
// else if (a == 10) {
// if (b < 10) {
// b = 0;
// } else if (b < 20) {
// b = 10;
// } else if (b < 30) {
// b = 20;
// } else if (b < 40) {
// b = 30;
// } else if (b < 50) {
// b = 40;
// } else if (b < 60) {
// b = 50;
// }
// } else if (a == 11) {
// if (b < 10) {
// b = 0;
// } else if (b < 20) {
// b = 10;
// } else if (b < 30) {
// b = 20;
// } else if (b < 40) {
// b = 30;
// } else if (b < 50) {
// b = 40;
// } else if (b < 60) {
// b = 50;
// }
// } else if (a == 12) {
// if (b < 10) {
// b = 0;
// } else if (b < 20) {
// b = 10;
// } else if (b < 30) {
// b = 20;
// } else if (b < 40) {
// b = 30;
// } else if (b < 50) {
// b = 40;
// } else if (b < 60) {
// b = 50;
// }
// } else if (a == 13) {
// if (b < 10) {
// b = 0;
// } else if (b < 20) {
// b = 10;
// } else if (b < 30) {
// b = 20;
// } else if (b < 40) {
// b = 30;
// } else if (b < 50) {
// b = 40;
// } else if (b < 60) {
// b = 50;
// }
// } else if (a == 14) {
// if (b < 10) {
// b = 0;
// } else if (b < 20) {
// b = 10;
// } else if (b < 30) {
// b = 20;
// } else if (b < 40) {
// b = 30;
// } else if (b < 50) {
// b = 40;
// } else if (b < 60) {
// b = 50;
// }
// } else if (a == 15) {
// if (b < 10) {
// b = 0;
// } else if (b < 20) {
// b = 10;
// } else if (b < 30) {
// b = 20;
// } else if (b < 40) {
// b = 30;
// } else if (b < 50) {
// b = 40;
// } else if (b < 60) {
// b = 50;
// }
// } else if (a == 16) {
// if (b < 10) {
// b = 0;
// } else if (b < 20) {
// b = 10;
// } else if (b < 30) {
// b = 20;
// } else if (b < 40) {
// b = 30;
// } else if (b < 50) {
// b = 40;
// } else if (b < 60) {
// b = 50;
// }
// } else if (a == 17) {
// if (b < 10) {
// b = 0;
// } else if (b < 20) {
// b = 10;
// } else if (b < 30) {
// b = 20;
// } else if (b < 40) {
// b = 30;
// } else if (b < 50) {
// b = 40;
// } else if (b < 60) {
// b = 50;
// }
// } else if (a == 18) {
// if (b < 10) {
// b = 0;
// } else if (b < 20) {
// b = 10;
// } else if (b < 30) {
// b = 20;
// } else if (b < 40) {
// b = 30;
// } else if (b < 50) {
// b = 40;
// } else if (b < 60) {
// b = 50;
// }
// } else if (a == 19) {
// if (b < 10) {
// b = 0;
// } else if (b < 20) {
// b = 10;
// } else if (b < 30) {
// b = 20;
// } else if (b < 40) {
// b = 30;
// } else if (b < 50) {
// b = 40;
// } else if (b < 60) {
// b = 50;
// }
// } else if (a == 20) {
// if (b < 10) {
// b = 0;
// } else if (b < 20) {
// b = 10;
// } else if (b < 30) {
// b = 20;
// } else if (b < 40) {
// b = 30;
// } else if (b < 50) {
// b = 40;
// } else if (b < 60) {
// b = 50;
// }
// } else if (a == 21) {
// if (b < 10) {
// b = 0;
// } else if (b < 20) {
// b = 10;
// } else if (b < 30) {
// b = 20;
// } else if (b < 40) {
// b = 30;
// } else if (b < 50) {
// b = 40;
// } else if (b < 60) {
// b = 50;
// }
// } else if (a == 22) {
// if (b < 5) {
// b = 0;
// } else if (b < 10) {
// b = 5;
// } else if (b < 15) {
// b = 10;
// } else if (b < 20) {
// b = 15;
// } else if (b < 25) {
// b = 20;
// } else if (b < 30) {
// b = 25;
// } else if (b < 35) {
// b = 30;
// } else if (b < 40) {
// b = 35;
// } else if (b < 45) {
// b = 40;
// } else if (b < 50) {
// b = 45;
// } else if (b < 55) {
// b = 50;
// } else if (b < 60) {
// b = 55;
// }
// } else if (a == 23) {
// if (b < 5) {
// b = 0;
// } else if (b < 10) {
// b = 5;
// } else if (b < 15) {
// b = 10;
// } else if (b < 20) {
// b = 15;
// } else if (b < 25) {
// b = 20;
// } else if (b < 30) {
// b = 25;
// } else if (b < 35) {
// b = 30;
// } else if (b < 40) {
// b = 35;
// } else if (b < 45) {
// b = 40;
// } else if (b < 50) {
// b = 45;
// } else if (b < 55) {
// b = 50;
// } else if (b < 60) {
// b = 55;
// }
// } else if (a == 0) {
// if (b < 5) {
// b = 0;
// } else if (b < 10) {
// b = 5;
// } else if (b < 15) {
// b = 10;
// } else if (b < 20) {
// b = 15;
// } else if (b < 25) {
// b = 20;
// } else if (b < 30) {
// b = 25;
// } else if (b < 35) {
// b = 30;
// } else if (b < 40) {
// b = 35;
// } else if (b < 45) {
// b = 40;
// } else if (b < 50) {
// b = 45;
// } else if (b < 55) {
// b = 50;
// } else if (b < 60) {
// b = 55;
// }
// } else if (a == 1) {
// if (b < 5) {
// b = 0;
// } else if (b < 10) {
// b = 5;
// } else if (b < 15) {
// b = 10;
// } else if (b < 20) {
// b = 15;
// } else if (b < 25) {
// b = 20;
// } else if (b < 30) {
// b = 25;
// } else if (b < 35) {
// b = 30;
// } else if (b < 40) {
// b = 35;
// } else if (b < 45) {
// b = 40;
// } else if (b < 50) {
// b = 45;
// } else if (b < 55) {
// b = 50;
// } else if (b < 60) {
// b = 55;
// }
// }
// String tempa = null;
// String tempb = null;
// if (a < 10) {
// tempa = "" + a;
// } else {
// tempa = "" + a;
// }
// if (b < 10) {
// tempb = "0" + b;
// } else {
// tempb = "" + b;
// }
// standard = tempa + ":" + tempb;
// return standard;
// }
//
// public static String Changejiangxi(String text) {
// // TODO Auto-generated method stub
// Log.e("minute4", "t[0]");
// String t[] = text.split(":");
// Log.e("minute4", t[0]);
// Log.e("minute4", t[1]);
// String standard = null;
//
// int a = 0, b = 0;
// boolean isNum = t[0].matches("[0-9]+");
// if (isNum) {
// a = Integer.parseInt(t[0]);
// }
// boolean isNum1 = t[1].matches("[0-9]+");
// if (isNum1) {
// b = Integer.parseInt(t[1]);
// }
// if (a < 9) {
// a = 23;
// b = 02;
// } else if (a == 9) {
// if (b < 10) {
// a = 23;
// b = 12;
// } else if (b < 20) {
// b = 10;
// } else if (b < 30) {
// b = 20;
// } else if (b < 40) {
// b = 30;
// } else if (b < 50) {
// b = 40;
// } else if (b < 60) {
// b = 50;
// }
// }
//
// else if (a == 10) {
//
// if (b < 1) {
// a = 9;
// b = 50;
// } else if (b < 11) {
// b = 1;
// } else if (b < 21) {
// b = 11;
// } else if (b < 31) {
// b = 21;
// } else if (b < 41) {
// b = 31;
// } else if (b < 51) {
// b = 41;
// } else if (b < 61) {
// b = 51;
// }
// } else if (a == 11) {
// if (b < 1) {
// a = 10;
// b = 51;
// } else if (b < 11) {
// b = 1;
// } else if (b < 22) {
// b = 11;
// } else if (b < 32) {
// b = 22;
// } else if (b < 42) {
// b = 32;
// } else if (b < 52) {
// b = 42;
// } else if (b < 60) {
// b = 52;
// }
// } else if (a == 12) {
// if (b < 2) {
// a = 11;
// b = 52;
// } else if (b < 12) {
// b = 2;
// } else if (b < 22) {
// b = 12;
// } else if (b < 32) {
// b = 22;
// } else if (b < 42) {
// b = 32;
// } else if (b < 53) {
// b = 42;
// } else if (b < 60) {
// b = 53;
// }
// } else if (a == 13) {
// if (b < 3) {
// a = 12;
// b = 53;
// } else if (b < 13) {
// b = 3;
// } else if (b < 23) {
// b = 13;
// } else if (b < 33) {
// b = 23;
// } else if (b < 43) {
// b = 33;
// } else if (b < 54) {
// b = 43;
// } else if (b < 60) {
// b = 54;
// }
// } else if (a == 14) {
// if (b < 4) {
// a = 13;
// b = 54;
// } else if (b < 14) {
// b = 4;
// } else if (b < 24) {
// b = 14;
// } else if (b < 34) {
// b = 24;
// } else if (b < 44) {
// b = 34;
// } else if (b < 54) {
// b = 44;
// } else if (b < 60) {
// b = 54;
// }
// } else if (a == 15) {
// if (b < 5) {
// a = 14;
// b = 54;
// } else if (b < 15) {
// b = 5;
// } else if (b < 25) {
// b = 15;
// } else if (b < 35) {
// b = 25;
// } else if (b < 45) {
// b = 35;
// } else if (b < 55) {
// b = 45;
// } else if (b < 65) {
// b = 55;
// }
// } else if (a == 16) {
// if (b < 5) {
// a = 15;
// b = 55;
// } else if (b < 16) {
// b = 5;
// } else if (b < 26) {
// b = 16;
// } else if (b < 36) {
// b = 26;
// } else if (b < 46) {
// b = 36;
// } else if (b < 56) {
// b = 46;
// } else if (b < 60) {
// b = 56;
// }
// } else if (a == 17) {
// if (b < 6) {
// a = 16;
// b = 56;
// } else if (b < 17) {
// b = 6;
// } else if (b < 27) {
// b = 17;
// } else if (b < 37) {
// b = 27;
// } else if (b < 47) {
// b = 37;
// } else if (b < 57) {
// b = 47;
// } else if (b < 67) {
// b = 57;
// }
// } else if (a == 18) {
// if (b < 7) {
// a = 17;
// b = 57;
// } else if (b < 18) {
// b = 7;
// } else if (b < 28) {
// b = 18;
// } else if (b < 38) {
// b = 28;
// } else if (b < 48) {
// b = 38;
// } else if (b < 58) {
// b = 48;
// } else if (b < 60) {
// b = 58;
// }
// } else if (a == 19) {
// if (b < 8) {
// a = 18;
// b = 58;
// } else if (b < 18) {
// b = 8;
// } else if (b < 28) {
// b = 18;
// } else if (b < 39) {
// b = 28;
// } else if (b < 49) {
// b = 39;
// } else if (b < 59) {
// b = 49;
// } else if (b < 60) {
// b = 59;
// }
// } else if (a == 20) {
// if (b < 9) {
// a = 19;
// b = 59;
// } else if (b < 19) {
// b = 9;
// } else if (b < 29) {
// b = 19;
// } else if (b < 39) {
// b = 29;
// } else if (b < 49) {
// b = 39;
// } else if (b < 59) {
// b = 49;
// } else if (b < 60) {
// b = 49;
// }
// } else if (a == 21) {
// if (b < 10) {
// b = 0;
// } else if (b < 20) {
// b = 10;
// } else if (b < 30) {
// b = 20;
// } else if (b < 40) {
// b = 30;
// } else if (b < 50) {
// b = 40;
// } else if (b < 60) {
// b = 50;
// }
// } else if (a == 22) {
// if (b < 11) {
// b = 0;
// } else if (b < 21) {
// b = 11;
// } else if (b < 31) {
// b = 21;
// } else if (b < 41) {
// b = 31;
// } else if (b < 51) {
// b = 41;
// } else if (b < 60) {
// b = 51;
// }
// } else if (a == 23) {
// if (b < 2) {
// a = 22;
// b = 51;
// } else {
// a = 23;
// b = 2;
// }
// }
// String tempa = null;
// String tempb = null;
// if (a < 10) {
// tempa = "" + a;
// } else {
// tempa = "" + a;
// }
// if (b < 10) {
// tempb = "0" + b;
// } else {
// tempb = "" + b;
// }
// standard = tempa + ":" + tempb;
// return standard;
// }
//
// // public static String Changetianjin(String text) {
// // // TODO Auto-generated method stub
// // String t[] = text.split(":");
// // Log.e("minute4", t[0]);
// // Log.e("minute4", t[1]);
// // String standard = null;
// //
// // int a = 0, b = 0;
// // boolean isNum = t[0].matches("[0-9]+");
// // if (isNum) {
// // a = Integer.parseInt(t[0]);
// // }
// // boolean isNum1 = t[1].matches("[0-9]+");
// // if (isNum1) {
// // b = Integer.parseInt(t[1]);
// // }
// // if (a < 9) {
// // a = 22;
// // b = 54;
// // } else if (a == 9) {
// // if (b < 10) {
// // b = 0;
// // } else if (b < 20) {
// // b = 10;
// // } else if (b < 30) {
// // b = 20;
// // } else if (b < 40) {
// // b = 30;
// // } else if (b < 50) {
// // b = 40;
// // } else if (b < 60) {
// // b = 50;
// // }
// // }
// //
// // else if (a == 10) {
// // if (b < 1) {
// // a = 9;
// // b = 50;
// // } else if (b < 11) {
// // b = 0;
// // } else if (b < 21) {
// // b = 11;
// // } else if (b < 31) {
// // b = 21;
// // } else if (b < 41) {
// // b = 31;
// // } else if (b < 51) {
// // b = 41;
// // } else if (b < 60) {
// // b = 51;
// // }
// // } else if (a == 11) {
// // if (b < 1) {
// // a = 10;
// // b = 51;
// // } else if (b < 11) {
// // b = 1;
// // } else if (b < 21) {
// // b = 11;
// // } else if (b < 31) {
// // b = 21;
// // } else if (b < 41) {
// // b = 31;
// // } else if (b < 51) {
// // b = 41;
// // } else if (b < 60) {
// // b = 51;
// // }
// // } else if (a == 12) {
// // if (b < 1) {
// // a = 11;
// // b = 51;
// // } else if (b < 11) {
// // b = 1;
// // } else if (b < 21) {
// // b = 11;
// // } else if (b < 32) {
// // b = 21;
// // } else if (b < 42) {
// // b = 32;
// // } else if (b < 52) {
// // b = 42;
// // } else if (b < 60) {
// // b = 52;
// // }
// // } else if (a == 13) {
// // if (b < 2) {
// // a = 12;
// // b = 52;
// // } else if (b < 12) {
// // b = 2;
// // } else if (b < 22) {
// // b = 12;
// // } else if (b < 32) {
// // b = 22;
// // } else if (b < 42) {
// // b = 32;
// // } else if (b < 52) {
// // b = 42;
// // } else if (b < 60) {
// // b = 52;
// // }
// // } else if (a == 14) {
// // if (b < 2) {
// // a = 13;
// // b = 52;
// // } else if (b < 12) {
// // b = 2;
// // } else if (b < 22) {
// // b = 12;
// // } else if (b < 32) {
// // b = 22;
// // } else if (b < 42) {
// // b = 32;
// // } else if (b < 52) {
// // b = 42;
// // } else if (b < 60) {
// // b = 52;
// // }
// // } else if (a == 15) {
// // if (b < 2) {
// // a = 14;
// // b = 52;
// // } else if (b < 12) {
// // b = 2;
// // } else if (b < 22) {
// // b = 12;
// // } else if (b < 32) {
// // b = 22;
// // } else if (b < 42) {
// // b = 32;
// // } else if (b < 52) {
// // b = 42;
// // } else if (b < 60) {
// // b = 52;
// // }
// // } else if (a == 16) {
// // if (b < 2) {
// // a = 15;
// // b = 52;
// // } else if (b < 12) {
// // b = 2;
// // } else if (b < 22) {
// // b = 12;
// // } else if (b < 32) {
// // b = 22;
// // } else if (b < 42) {
// // b = 32;
// // } else if (b < 52) {
// // b = 42;
// // } else if (b < 60) {
// // b = 52;
// // }
// // } else if (a == 17) {
// // if (b < 3) {
// // a = 16;
// // b = 52;
// // } else if (b < 13) {
// // b = 3;
// // } else if (b < 23) {
// // b = 13;
// // } else if (b < 33) {
// // b = 23;
// // } else if (b < 43) {
// // b = 33;
// // } else if (b < 53) {
// // b = 43;
// // } else if (b < 60) {
// // b = 53;
// // }
// // } else if (a == 18) {
// // if (b < 3) {
// // a = 17;
// // b = 53;
// // } else if (b < 13) {
// // b = 3;
// // } else if (b < 23) {
// // b = 13;
// // } else if (b < 33) {
// // b = 23;
// // } else if (b < 43) {
// // b = 33;
// // } else if (b < 53) {
// // b = 43;
// // } else if (b < 60) {
// // b = 53;
// // }
// // } else if (a == 19) {
// // if (b < 3) {
// // a = 18;
// // b = 53;
// // } else if (b < 13) {
// // b = 3;
// // } else if (b < 23) {
// // b = 13;
// // } else if (b < 33) {
// // b = 23;
// // } else if (b < 43) {
// // b = 33;
// // } else if (b < 53) {
// // b = 43;
// // } else if (b < 60) {
// // b = 53;
// // }
// // } else if (a == 20) {
// // if (b < 3) {
// // a = 19;
// // b = 53;
// // } else if (b < 13) {
// // b = 3;
// // } else if (b < 23) {
// // b = 13;
// // } else if (b < 33) {
// // b = 23;
// // } else if (b < 43) {
// // b = 33;
// // } else if (b < 54) {
// // b = 43;
// // } else if (b < 60) {
// // b = 54;
// // }
// // } else if (a == 21) {
// // if (b < 4) {
// // a = 20;
// // b = 54;
// // } else if (b < 14) {
// // b = 4;
// // } else if (b < 24) {
// // b = 14;
// // } else if (b < 34) {
// // b = 24;
// // } else if (b < 44) {
// // b = 34;
// // } else if (b < 54) {
// // b = 44;
// // } else if (b < 60) {
// // b = 54;
// // }
// // } else if (a == 22) {
// // if (b < 4) {
// // a = 21;
// // b = 54;
// // } else if (b < 14) {
// // b = 4;
// // } else if (b < 24) {
// // b = 14;
// // } else if (b < 34) {
// // b = 24;
// // } else if (b < 44) {
// // b = 34;
// // } else if (b < 54) {
// // b = 44;
// // } else if (b < 60) {
// // b = 54;
// // }
// // } else if (a == 23) {
// // a = 22;
// // b = 54;
// // }
// // String tempa = null;
// // String tempb = null;
// // if (a < 10) {
// // tempa = "" + a;
// // } else {
// // tempa = "" + a;
// // }
// // if (b < 10) {
// // tempb = "0" + b;
// // } else {
// // tempb = "" + b;
// // }
// // standard = tempa + ":" + tempb;
// // return standard;
// // }
//
// public static String Changexinjiang(String text) {
// // TODO Auto-generated method stub
// String t[] = text.split(":");
// Log.e("minute4", t[0]);
// Log.e("minute4", t[1]);
// String standard = null;
//
// int a = 0, b = 0;
// boolean isNum = t[0].matches("[0-9]+");
// if (isNum) {
// a = Integer.parseInt(t[0]);
// }
// boolean isNum1 = t[1].matches("[0-9]+");
// if (isNum1) {
// b = Integer.parseInt(t[1]);
// }
// if (a >= 2 & a < 10) {
// a = 1;
// b = 49;
// }
//
// else if (a == 10) {
// if (b < 9) {
// a = 10;
// b = 0;
// } else if (b < 19) {
// b = 9;
// } else if (b < 29) {
// b = 19;
// } else if (b < 39) {
// b = 29;
// } else if (b < 49) {
// b = 39;
// } else if (b < 59) {
// b = 49;
// } else if (b < 60) {
// b = 59;
// }
// } else if (a == 11) {
// if (b < 9) {
// a = 10;
// b = 59;
// } else if (b < 19) {
// b = 9;
// } else if (b < 29) {
// b = 19;
// } else if (b < 39) {
// b = 29;
// } else if (b < 49) {
// b = 39;
// } else if (b < 59) {
// b = 49;
// } else if (b < 60) {
// b = 59;
// }
// } else if (a == 12)
//
// {
// if (b < 9) {
// a = 11;
// b = 59;
// } else if (b < 19) {
// b = 9;
// } else if (b < 29) {
// b = 19;
// } else if (b < 39) {
// b = 29;
// } else if (b < 49) {
// b = 39;
// } else if (b < 59) {
// b = 49;
// } else if (b < 60) {
// b = 59;
// }
// } else if (a == 13)
//
// {
// if (b < 9) {
// a = 12;
// b = 59;
// } else if (b < 19) {
// b = 9;
// } else if (b < 29) {
// b = 19;
// } else if (b < 39) {
// b = 29;
// } else if (b < 49) {
// b = 39;
// } else if (b < 59) {
// b = 49;
// } else if (b < 69) {
// b = 59;
// }
// } else if (a == 14)
//
// {
// if (b < 9) {
// a = 13;
// b = 59;
// } else if (b < 19) {
// b = 9;
// } else if (b < 29) {
// b = 19;
// } else if (b < 39) {
// b = 29;
// } else if (b < 49) {
// b = 39;
// } else if (b < 59) {
// b = 49;
// } else if (b < 69) {
// b = 59;
// }
// } else if (a == 15)
//
// {
// if (b < 9) {
// a = 14;
// b = 59;
// } else if (b < 19) {
// b = 9;
// } else if (b < 29) {
// b = 19;
// } else if (b < 39) {
// b = 29;
// } else if (b < 49) {
// b = 39;
// } else if (b < 59) {
// b = 49;
// } else if (b < 69) {
// b = 59;
// }
// } else if (a == 16)
//
// {
// if (b < 9) {
// a = 15;
// b = 59;
// } else if (b < 19) {
// b = 9;
// } else if (b < 29) {
// b = 19;
// } else if (b < 39) {
// b = 29;
// } else if (b < 49) {
// b = 39;
// } else if (b < 59) {
// b = 49;
// } else if (b < 69) {
// b = 59;
// }
// } else if (a == 17)
//
// {
// if (b < 9) {
// a = 16;
// b = 59;
// } else if (b < 19) {
// b = 9;
// } else if (b < 29) {
// b = 19;
// } else if (b < 39) {
// b = 29;
// } else if (b < 49) {
// b = 39;
// } else if (b < 59) {
// b = 49;
// } else if (b < 69) {
// b = 59;
// }
// } else if (a == 18)
//
// {
// if (b < 9) {
// a = 17;
// b = 59;
// } else if (b < 19) {
// b = 9;
// } else if (b < 29) {
// b = 19;
// } else if (b < 39) {
// b = 29;
// } else if (b < 49) {
// b = 39;
// } else if (b < 59) {
// b = 49;
// } else if (b < 69) {
// b = 59;
// }
// } else if (a == 19)
//
// {
// if (b < 9) {
// a = 18;
// b = 59;
// } else if (b < 19) {
// b = 9;
// } else if (b < 29) {
// b = 19;
// } else if (b < 39) {
// b = 29;
// } else if (b < 49) {
// b = 39;
// } else if (b < 59) {
// b = 49;
// } else if (b < 69) {
// b = 59;
// }
// } else if (a == 20)
//
// {
// if (b < 9) {
// a = 19;
// b = 59;
// } else if (b < 19) {
// b = 9;
// } else if (b < 29) {
// b = 19;
// } else if (b < 39) {
// b = 29;
// } else if (b < 49) {
// b = 39;
// } else if (b < 59) {
// b = 49;
// } else if (b < 69) {
// b = 59;
// }
// } else if (a == 21)
//
// {
// if (b < 9) {
// a = 20;
// b = 59;
// } else if (b < 19) {
// b = 9;
// } else if (b < 29) {
// b = 19;
// } else if (b < 39) {
// b = 29;
// } else if (b < 49) {
// b = 39;
// } else if (b < 59) {
// b = 49;
// } else if (b < 69) {
// b = 59;
// }
// } else if (a == 22)
//
// {
// if (b < 9) {
// a = 21;
// b = 59;
// } else if (b < 19) {
// b = 9;
// } else if (b < 29) {
// b = 19;
// } else if (b < 39) {
// b = 29;
// } else if (b < 49) {
// b = 39;
// } else if (b < 59) {
// b = 49;
// } else if (b < 69) {
// b = 59;
// }
// } else if (a == 23)
//
// {
// if (b < 9) {
// a = 22;
// b = 59;
// } else if (b < 19) {
// b = 9;
// } else if (b < 29) {
// b = 19;
// } else if (b < 39) {
// b = 29;
// } else if (b < 49) {
// b = 39;
// } else if (b < 59) {
// b = 49;
// } else if (b < 69) {
// b = 59;
// }
// } else if (a == 0)
//
// {
// if (b < 9) {
// a = 23;
// b = 59;
// } else if (b < 19) {
// b = 9;
// } else if (b < 29) {
// b = 19;
// } else if (b < 39) {
// b = 29;
// } else if (b < 49) {
// b = 39;
// } else if (b < 59) {
// b = 49;
// } else if (b < 69) {
// b = 59;
// }
// } else if (a == 1)
//
// {
// if (b < 9) {
// a = 0;
// b = 59;
// } else if (b < 19) {
// b = 9;
// } else if (b < 29) {
// b = 19;
// } else if (b < 39) {
// b = 29;
// } else if (b < 49) {
// b = 39;
// } else if (b < 59) {
// b = 49;
// } else if (b < 69) {
// b = 49;
// }
// }
//
// String tempa = null;
// String tempb = null;
// if (a < 10)
//
// {
// tempa = "" + a;
// } else
//
// {
// tempa = "" + a;
// }
// if (b < 10)
//
// {
// tempb = "0" + b;
// } else
//
// {
// tempb = "" + b;
// }
// standard = tempa + ":" + tempb;
// return standard;
//
// }
//
// public static String getjiangxi(String text) {
// // TODO Auto-generated method stub
// int temp = 0;
// for (int i = 0; i < 83; i++) {
// String no = jiangxiticketplan.time[i];
// if (text.equals(no)) {
// temp = i;
// }
// }
// return jiangxiticketplan.no[temp];
// }
//
// public static String gettianjin(String text) {
// // TODO Auto-generated method stub
// int temp = 0;
// for (int i = 0; i < 84; i++) {
// String no = tianjinticketplan.time[i];
// if (text.equals(no)) {
// temp = i;
// }
// }
// return tianjinticketplan.no[temp];
// }
//
// public static String getxinjiang(String text) {
//
// // TODO Auto-generated method stub
// int temp = 0;
// for (int i = 0; i < 96; i++) {
// String no = xinjiangticketplan.time[i];
// if (text.equals(no)) {
// temp = i;
// Log.d("hj", "jjj");
// }
// }
// return xinjiangticketplan.no[temp];
// }
//
// public static String getchongqing(String text) {
// int temp = 0;
// for (int i = 0; i < 120; i++) {
// String no = chongqingticketplan.time[i];
// if (text.equals(no)) {
// temp = i;
// }
// }
// return chongqingticketplan.no[temp];
//
// }
// // public String getminute(String text) {
// // // TODO Auto-generated method stub
// //
// // String t[] = text.split(":");
// //
// // return t[1];
// // }
// //
// // public String gethour(String text) {
// // // TODO Auto-generated method stub
// // String t[] = text.split(":");
// //
// // return t[0];
// // }
// }
