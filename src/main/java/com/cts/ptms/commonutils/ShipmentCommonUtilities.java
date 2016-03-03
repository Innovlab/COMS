/**
 * 
 */
package com.cts.ptms.commonutils;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Properties;

/**
 * Shipment common utility methods
 * @author 417765
 *
 */
public class ShipmentCommonUtilities {

	/**
	 * Public constructor
	 */
	public ShipmentCommonUtilities() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * This method contacts the service using url connection.
	 * 
	 * @param xmlInputString
	 * @param url
	 * @return String
	 * @throws Exception
	 */
	public static URLConnection contactService(String xmlInputString, URL url) throws Exception{		

		OutputStream outputStream = null;
		HttpURLConnection connection = null;
		try {

			connection = (HttpURLConnection) url.openConnection();
			System.out.println("Client established connection with " + url.toString());
			
			// Setup HTTP POST parameters
			connection.setDoOutput(true);
			connection.setDoInput(true);
			connection.setUseCaches(false);
			
			outputStream = connection.getOutputStream();		
			outputStream.write(xmlInputString.getBytes());
			outputStream.flush();
			outputStream.close();
			System.out.println("Http status = " + connection.getResponseCode() + " " + connection.getResponseMessage());
			
		} catch (Exception e) {
			System.out.println("Error sending data to server");
			e.printStackTrace();
			throw e;
		} finally {						
			if(outputStream != null){
				outputStream.close();
				outputStream = null;
			}
		}		
		return connection;
	}
	/**
	 * This method read all of the data from a URL connection to a String
	 * @param URLConnection
	 * @return String
	 * @throws Exception
	 */
	public static String readURLConnection(URLConnection uc) throws Exception {
		StringBuffer buffer = new StringBuffer();
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(uc.getInputStream()));
			int letter = 0;			
			//reader.readLine();
			while ((letter = reader.read()) != -1){
				buffer.append((char) letter);
			}
			reader.close();
		} catch (Exception e) {
			System.out.println("Could not read from URL: " + e.toString());
			throw e;
		} finally {
			if(reader != null){
				reader.close();
				reader = null;
			}
		}
		return buffer.toString();
	}
	
	/**
	 * This method takes the path of properties file and returns the properties object.
	 * @param path
	 * @return Properties
	 * @throws Exception
	 */
	public static Properties getProperties(String path) throws Exception {
		Properties  properties = null;
		try {
			InputStream inputStream = ShipmentCommonUtilities.class.getClassLoader().getResourceAsStream(path);
			properties = new Properties();
			properties.load(inputStream);

		} catch (IOException e) {
			System.out.println("Exception occured while loading the properties.."+e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception occured while loading the properties.."+e.getMessage());
		}
		return properties;
	}
	
	/**
	 * Utility for saving the base64 file into a folder.
	 * @param decoded
	 * @param trackingNumber
	 * @param pathToSave
	 * @param docType
	 * @throws IOException
	 */
  	public static void saveBase64DataToLocalFile(byte[] decoded, String trackingNumber, String pathToSave, String docType) 
  			throws IOException 
  	{
  		OutputStream out1 = null;
  		try {
  			StringBuilder stringBuilder = new StringBuilder();
  			stringBuilder.append(pathToSave).append("/").append(trackingNumber).append(".").append(docType);
  			//String filename = pathToSave +"/"+ trackingNumber+ShippingConstants.PDF_fILE;
			out1 = new BufferedOutputStream(new FileOutputStream(stringBuilder.toString()));
			out1.write(decoded);
  		} catch (FileNotFoundException e) {
  			System.out.println("Exception occured"+e.getMessage());
  		} catch (Exception e) {
  			System.out.println("Exception occured"+e.getMessage());
  		} finally {
			if (out1 != null) {
				out1.close();
			}
		}
	}
}
