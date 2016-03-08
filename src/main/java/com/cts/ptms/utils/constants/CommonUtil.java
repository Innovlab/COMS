package com.cts.ptms.utils.constants;

import com.itextpdf.text.pdf.PdfWriter;
import java.io.*;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;

import org.apache.commons.codec.binary.Base64;

public class CommonUtil {
	
	
	
	public static void converImgToPdf(String fileName,String encodedImgStr) {
		
		Document document = new Document();
		byte[] decodedBytes = Base64.decodeBase64(encodedImgStr);
	    
	    try {
	      FileOutputStream fos = new FileOutputStream(fileName);
	      PdfWriter writer = PdfWriter.getInstance(document, fos);
	      
	      writer.open();
	      document.open();
	      document.add(Image.getInstance(decodedBytes));
	      document.close();
	      writer.close();
	    }
	    catch (Exception e) {
	      e.printStackTrace();
	    }
		
	}
	
	
	
	
	
	public static void convertBase64ToPdf(String fileName,String encodedPdfStr) {
		
		
		
		FileOutputStream fop=null;
		byte[] decodedBytes = null;
		
		try {	
			decodedBytes =Base64.decodeBase64(encodedPdfStr);
			File file = new File(fileName);;
			fop = new FileOutputStream(file);
			fop.write(decodedBytes);
			fop.flush();
			fop.close();
			
		} catch (IOException e) {			
			e.printStackTrace();
		} 
        

	}

}
