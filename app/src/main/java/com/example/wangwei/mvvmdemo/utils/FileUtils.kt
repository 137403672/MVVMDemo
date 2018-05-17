package com.example.wangwei.mvvmdemo.utils;

import android.content.Context;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

class FileUtils {
	companion object {
		fun getAssetString(context : Context , assetName:String ):String {
			try {
				var inputStream = context.getAssets().open(assetName);
				return convertStreamToString(inputStream);
			} catch (e : Exception ) {
				e.printStackTrace();
			}
			return "";
		}
		fun convertStreamToString(inputStream:InputStream): String{
			try {
				if (inputStream != null) {
					var sb =  StringBuilder();
					var line:String?=null ;
					var reader =  BufferedReader(
							InputStreamReader(inputStream, "UTF-8"));
//				while ((line = reader.readLine())!=null) {
					while ((reader.readLine().apply { line=this })!=null) {
						sb.append(line);
					}
					return sb.toString();
				}
			} catch (e:Exception ) {
				e.printStackTrace();
			} finally {
				try {
					if (inputStream != null)
						inputStream.close();
				} catch (e:IOException ) {
					e.printStackTrace();
				}
			}
			return "";
		}
	}






	
}
