package com.inria.ecsa.validation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.management.MalformedObjectNameException;
import javax.management.ObjectInstance;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class ConfigXmi {
	List myListElement;
	Document document;
	List <String> namelist = new ArrayList<String>();
	
	public static void main(String[] args) {
		String path = "AppSecurity.xmi" ;
		//create an instance
		ConfigXmi dpe = new ConfigXmi();
		dpe.parseXmlFile(path);
		//get each employee element and create a Employee object
		dpe.parseDocument();
	}
	//constractor
	public ConfigXmi(){
		//create a list to hold the employee objects
	}

	
		
		
		//Iterate through the list and print the data
		//printData();
	
	private void parseXmlFile(String path){
		//get the factory
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		
		try {
			
			//Using factory get an instance of document builder
			DocumentBuilder db = dbf.newDocumentBuilder();
			
			//parse using builder to get DOM representation of the XML file
			document = db.parse(path);
			

		}catch(ParserConfigurationException pce) {
			pce.printStackTrace();
		}catch(SAXException se) {
			se.printStackTrace();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	private void parseDocument(){
		//get the root elememt
		Element docEle = document.getDocumentElement();
		System.out.println("Root element :" + document.getDocumentElement().getNodeName());
		//getElementsByTag(docEle,"constraints");
		getFeatureNodeByName(docEle,"Recording");
	}
	
// 	NodeList nlconstraint = docEle.getElementsByTagName("constraints");
//		if(nlconstraint != null  && nlconstraint.getLength()>0) {
//			for(int j = 0 ; j < nlconstraint.getLength() ;j++) {
//				Node nNodej = nlconstraint.item(j);
//				if (nNodej.getNodeType() == Node.ELEMENT_NODE) {
//					Element eElement = (Element) nNodej;
//					
//					//System.out.println("Constraint : " + eElement.getAttribute("type"));
//					System.out.println("Constraint : " + eElement.getAttribute("xsi:type") 
//							+ " From "+eElement.getAttribute("from") + 
//							"To" + eElement.getAttribute("to") );
//			}
//			}
//		}
//		NodeList nl = docEle.getElementsByTagName("subFeatures");
//		
//		//get a nodelist of elements by tag name subfeatures
//		int position = 0 ;
//		if(nl != null && nl.getLength() > 0) {
//			for(int i = 0 ; i < nl.getLength() ;i++) {
//				Node nNode = nl.item(i);
//				NodeList childs = nNode.getChildNodes();
//				if(childs!= null && childs.getLength()> 0){
//				for(int p = 0 ; p < childs.getLength() ;p++) {
//						Node child = childs.item(p);
//						if(child.getNodeName().equals("subFeatures"))
//						System.out.println(child.hasChildNodes());
////						if (child.getNodeType() == Node.ELEMENT_NODE) {
////						Element elem = (Element) child;
////						elem.getElementsByTagName("subFeatures");
////						System.out.println("ChildName : "+ elem.getAttribute("name"));
////					} 
//						}
//				}
//				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
//					Element eElement = (Element) nNode;
//					System.out.println("SubFeatureName : "+ eElement.getAttribute("name"));}
//			}
//				// récupérer la liste d'attribute et ses valeurs respectives
//		NodeList valueAtt = docEle.getElementsByTagName("value");		
//			
//		for(int k = 0 ; k < valueAtt.getLength() ;k++) {
//			Node attNode = valueAtt.item(k);
//			Node attrib = attNode.getParentNode();
//			if (attNode.getNodeType() == Node.ELEMENT_NODE) {
//				Element eElement = (Element) attNode;
//				Element parent = (Element) attrib;
//				System.out.println("AttributeName : " + parent.getAttribute("name")
//						+ "value" + eElement.getAttribute("value"));}
//		}
//	}
//	 
//}
		
		
		// trouver les positions des features dans les expression de constraints type 
		//root/subFeatures
		
		//try {
					//if (eElement.hasChildNodes()) {
						 
//						//printNote(eElement.getChildNodes());
//						if (nNode.hasAttributes())
//						{
//							// get attributes names and values
//							NamedNodeMap nodeMap = nNode.getAttributes();
//				 
////							for (int l = 0; i < nodeMap.getLength(); l++) {
////				 
////								Node node = nodeMap.item(l);
////								//System.out.println("attr value : " + node.getNodeValue());
////								//System.out.println("Contenu 1ere balise dans balise1 :"+node.getFirstChild().getNodeValue());
////				 
////							}
//						}
//							NodeList attributes = eElement.getChildNodes() ;
//							if(eElement.getAttribute("name")== "Image") {
//								System.out.println("I found Image") ; }
							
//							Node nAtt = attributes.item(i);
//							NamedNodeMap nodeMap = nAtt. getAttributes();
//							//if(nAtt.getTextContent() == "Image"){
//							if(nAtt.getNodeValue()== "Image") 
							
								
					
					
//				catch (Exception e) {
//								System.out.println(e.getMessage());
//							    }
							
		
			
			
	/**
	 * Iterate through the list and print the 
	 * content to console
	 */
	private void getElementsByTag (Element element, String Tag){
		String attributetype = "";
		NodeList nodelist = element.getElementsByTagName(Tag);
		if (nodelist != null  && nodelist.getLength()>0){
			for(int j = 0 ; j < nodelist.getLength() ;j++) {
				Node node = nodelist.item(j);
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) node;
					if(eElement.hasAttributes()){
						
					for (int k=0; k<eElement.getAttributes().getLength(); k++){
						if(eElement.hasAttribute(attributetype)){//eElement.getAttributes().item(k);
					
					//switch(attributetype){
					
					//case "name": 
						System.out.println("name" + eElement.getAttribute("name"));
						
						namelist.add(eElement.getAttribute("name"));
					//case "xsi:type":
						System.out.println("xsi:type" + eElement.getAttribute("xsi:type"));
					//case "from": 
						System.out.println("from" + eElement.getAttribute("from")); 
					//case "fromAgain": 
						System.out.println("fromAgain" + eElement.getAttribute("fromAgain"));
					//case "to": 
						System.out.println("to" + eElement.getAttribute("to"));
					//case "cardinalityMin": 
						System.out.println("cardinalityMin" + eElement.getAttribute("cardinalityMin"));
					//case "cardinalityMax": 
						System.out.println("cardinalityMax"+ eElement.getAttribute("cardinalityMax"));
					//default : System.out.println("default");
					}
					}
					}
		
	}}
					}
						
	}
	private void getFeatureNodeByName(Element element, String featname){
		NodeList nodelist = element.getElementsByTagName("subFeatures");
		
		if (nodelist != null  && nodelist.getLength()>0){
			for(int j = 0 ; j < nodelist.getLength() ;j++) {
				Node node = nodelist.item(j);
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) node;
					if(eElement.hasAttribute("name")){
						namelist.add(eElement.getAttribute("name"));
						System.out.println(eElement.getAttribute("name"));
					}
					
	}
			}
		}
	}
	
	private List getDependency (Node node){
		Element docEle = document.getDocumentElement();
		NodeList nldependency = docEle.getElementsByTagName("constraints");
		
		return (List) nldependency;
	}
	
}
