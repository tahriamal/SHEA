package com.inria.ecsa.validation;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class CopyFile {
	
	public static void main (String[] args) {
		String fmPath = "SecurityApp.xmi";
		String fmdesitination = "App.xmi";
		File fmSource = new File(fmPath);
		File destination = new File(fmdesitination);
		copyFile(fmSource, destination);
	
	}
	
	
	public static boolean copyFile( File source, File destination ){ //Methode permettant la copie d'un fichier 
		boolean resultat = false; 

		// Declaration des flux 
		java.io.FileInputStream sourceFile=null; 
		java.io.FileOutputStream destinationFile=null; 
		try { 
		// Création du fichier : 
		destination.createNewFile(); 
		// Ouverture des flux 
		sourceFile = new java.io.FileInputStream(source); 
		destinationFile = new java.io.FileOutputStream(destination); 
		// Lecture par segment de 0.5Mo 
		byte buffer[]=new byte[512*1024]; 
		int nbLecture; 
		while( (nbLecture = sourceFile.read(buffer)) != -1 ) { 
		destinationFile.write(buffer, 0, nbLecture); 
		} 

		// Copie réussie 
		resultat = true; 
		} catch( java.io.FileNotFoundException f ) { 
		} catch( java.io.IOException e ) { 
		} finally { 
		// Quoi qu'il arrive, on ferme les flux 
		try { 
		sourceFile.close(); 
		} catch(Exception e) { } 
		try { 
		destinationFile.close(); 
		} catch(Exception e) { } 
		} 
		return( resultat ); 
		}
	
}
