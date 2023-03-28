package com.api.auto.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileUtils {
	//Đường dẫn đến properties files trong folder configuration
	private static String CONFIG_PATH = "./configuration/configs.properties";
	private static String TOKEN_PATH = "./configuration/token.properties";
	//1. Lấy ra giá trị proterty từ config file bất kỳ theo "key"
	public static String getProperty (String key) {
		Properties properties = new Properties();
		String value = null;
		FileInputStream fileInputStream = null;
		//bắt exception
		try {
			fileInputStream = new FileInputStream (CONFIG_PATH);
			properties.load(fileInputStream);
			value = properties.getProperty(key);
			return value;
		} catch (Exception ex) {
			System.out.println("Xảy ra lỗi khi đọc giá trị của "+key);
			ex.printStackTrace();
		} finally {
			//luôn nhảy vào đây dù có xảy ra exception hay không
			//thực hiện đóng luồng đọc
			if (fileInputStream !=null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return value;
	}
	//2. Save token vào file token.properties với key là "token"
	public static void saveToken (String key, String value) {
		//khai báo properties, biến cần thiết
		Properties properties = new Properties();
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream (TOKEN_PATH);
			properties.setProperty(key, value);
			properties.store(fileOutputStream, value);
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			//luôn nhảy vào đây dù có xảy ra exception hay không
			//thực hiện đóng luồng đọc
			if (fileOutputStream !=null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	//3. Lấy ra token
	public static String getToken(String token) {
		//Khai báo properties, biến, value
		Properties properties = new Properties();
		FileInputStream fileInputStream = null;
		String value = null;
		//bắt exception
		try {
			fileInputStream = new FileInputStream(TOKEN_PATH);
			properties.load(fileInputStream);
			value = properties.getProperty(token);
			return value;
		} catch (Exception ex) {
			System.out.println("Xảy ra lỗi khi đọc giá trị của "+token);
			ex.printStackTrace();
		} finally {
			//luôn nhảy vào đây dù có xảy ra exception hay không
			//thực hiện đóng luồng đọc
			if (fileInputStream !=null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return value;
	}
}
