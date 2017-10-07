package utils;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import sweets.Sweets;

public class DOMXmlParser implements IGift{

public DOMXmlParser(String string) {
	}

public List<Sweets> getSweets() {
	System.out.println("\nStart parsing xml file");
	System.out.println("\nNY Gift from xml file:");
	
List<Sweets> gift = new ArrayList<Sweets>();
        
try {
Document doc = parseXML();
NodeList nList = doc.getElementsByTagName("Sweet");
for (int i = 0; i < nList.getLength(); i++) {
	Element e = (Element) nList.item(i);
    Element name = (Element) e.getElementsByTagName("name").item(0);
    Element weight = (Element) e.getElementsByTagName("weight").item(0);
    Element price = (Element) e.getElementsByTagName("price").item(0);
    System.out.println(String.format("'%s': %s, %s", name.getTextContent(), weight.getTextContent(), price.getTextContent()));
                }
        } catch (Exception e) {
            System.err.println("Failed to parse the file" + e.getMessage());
        }
        return gift;}

protected Document parseXML() {
        File xmlFile = new File("E:/java/Gifts.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        Document doc = null;
        try {
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return doc;
    }

}
