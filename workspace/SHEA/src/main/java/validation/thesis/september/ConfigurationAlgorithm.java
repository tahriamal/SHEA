package validation.thesis.september;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;
public class ConfigurationAlgorithm {
	static List<String> list = new ArrayList<String>();

    public static void main(String[] args) throws ParserConfigurationException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder;
        Document doc = null;
        try {
            builder = factory.newDocumentBuilder();
            doc = builder.parse("AppSecurity.xml");

            // Create XPathFactory object
            XPathFactory xpathFactory = XPathFactory.newInstance();

            // Create XPath object
            XPath xpath = xpathFactory.newXPath();
           // String name = getFeatureName(doc, xpath);
          //  System.out.println("Employee Name with ID 4: " + name);
          
            //create XPathExpression object
           // String expression = "//subFeatures[@name='MotionDetection']/subFeatures";
            // cettte expression est fausse String expression2 ="//@subFeatures.0/@subFeatures.1/@variants.0";
            
            String expression = "//subFeatures[position()=1]/subFeatures[position()=2]/variants[position()=1]";
            String expression2 = "//subFeatures[@xsi:type=\"featuremodel:Alternative\"]";
            //            XPathExpression expr = xpath.compile(expression);
//            //evaluate expression result on XML document
//            NodeList nodes = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
//            for (int i = 0; i < nodes.getLength(); i++){
//                list.add(nodes.item(i).getNodeValue());
//            System.out.println(nodes.item(i).getNodeValue());}
            Node node = (Node) xpath.compile(expression2).evaluate(doc, XPathConstants.NODE);
            if(null != node) {
            	Element ement = (Element) node;
    			System.out.println(ement.getAttribute("name"));
            	//System.out.println();
            NodeList nodeList = node.getChildNodes();
            	for (int i = 0;null!=nodeList && i < nodeList.getLength(); i++) {
            		Node nod = nodeList.item(i);
            		if(nod.getNodeType() == Node.ELEMENT_NODE){
            			Element eElement = (Element) nod;
            			System.out.println(eElement.getAttribute("name")); }
            			// + " : " + nod.getFirstChild().getNodeValue()); 
            	}
            }
} 
        //catch (ParserConfigurationException | SAXException | IOException e) 
        catch (IOException e ){
    e.printStackTrace();
} catch (XPathExpressionException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}


private static List<String> getFeatureName(Document doc, XPath xpath) {

List<String> list = new ArrayList<String>();
try {
    //create XPathExpression object
    XPathExpression expr =
        xpath.compile("/FeatureModel/rootFeature[0]/subFeatures[1]");
    //evaluate expression result on XML document
    NodeList nodes = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
    for (int i = 0; i < nodes.getLength(); i++){
        list.add(nodes.item(i).getNodeValue());
    System.out.println(nodes.item(i).getNodeValue());}
} catch (XPathExpressionException e) {
    e.printStackTrace();
}
return list;
}
}