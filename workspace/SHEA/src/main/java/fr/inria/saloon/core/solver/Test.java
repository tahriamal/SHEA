package fr.inria.saloon.core.solver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
public class Test {




	    public static void main( String[] args )
	    {	
	    	try{
	    		String data = "<nodeFeature name=\"HAB\"> <NodeAttributes> <value xsi:type=\"type:EnumListValue\"> "+
	"<values value=\"1000\" id=\"CPU\"/> <values value=\"1024\" id=\"RAM\"/> </value>"+
  "</NodeAttributes> <NodeCardinalities cardinalityMin=\"1\" cardinalityMax=\"1\"/> </nodeFeature>";
	    		
	    		File file =new File("App.xmi");
	    		
	    		//if file doesnt exists, then create it
	    		if(!file.exists()){
	    			file.createNewFile();
	    		}
//	    		RandomAccessFile raf = new RandomAccessFile(file,"rw");
//	    		//System.out.println(readFromRandomAccessFile(file, 1));
//	    		String l = raf.readLine();
//	    		long length = raf.length();
//	    		
//	    		System.out.println(length);
//	    		if(raf.toString().equals("</rootFeature>")){
//	    			
//	    			System.out.println("Found fin root");
	    		//true = append file
	    		FileWriter fileWritter = new FileWriter(file.getName(),true);
	    	        BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
	    	        bufferWritter.write(data);
	    	        bufferWritter.close(); 
	    	    
		        System.out.println("Done");
		        
	    	}catch(IOException e){
	    		e.printStackTrace();
	    	}
	    }
	    
	    public static String readFromRandomAccessFile(File file, int position) { 
	    	String record = null; 
	    	try { RandomAccessFile fileStore = new RandomAccessFile(file, "rw");
	   // moves file pointer to position specified
	    	fileStore.seek(position); 
	    	// reading String from 
	    	record = fileStore.readUTF(); 
	    	fileStore.close();
	    	} 
	    catch (IOException e) { e.printStackTrace(); } 
	    	return record;
	    }

	}
