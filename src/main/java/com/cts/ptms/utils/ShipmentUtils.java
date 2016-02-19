package com.cts.ptms.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class ShipmentUtils {

	public static String getCarrierFromRequest(String xmlRequest) {
		
		return null;
	}

	public static String getRequestXml(File file) {
		String requestXMl="";
		try {
			requestXMl = FileUtils.readFileToString(file);
		} catch (IOException e) {			
			e.printStackTrace();
		}
		return requestXMl;
	}

}
