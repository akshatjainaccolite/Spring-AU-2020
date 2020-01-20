package assignment;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class Dom {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		 
		Document document = builder.parse(new File("books.xml"));
		document.getDocumentElement().normalize();
		Element root = document.getDocumentElement();
		System.out.println(root.getNodeName());
	
		NodeList nList = document.getElementsByTagName("book");
		 
		for (int temp = 0; temp < nList.getLength(); temp++)
		{
		 Node node = nList.item(temp);
		 System.out.println("");    
		 if (node.getNodeType() == Node.ELEMENT_NODE)
		 {
		    
		    Element eElement = (Element) node;
		    System.out.println("Book id : "    + eElement.getAttribute("id"));
		    System.out.println("Author : "  + eElement.getElementsByTagName("author").item(0).getTextContent());
		    System.out.println("Title : "  + eElement.getElementsByTagName("title").item(0).getTextContent());
		    System.out.println("Genre : "   + eElement.getElementsByTagName("genre").item(0).getTextContent());
		    System.out.println("Price : "    + eElement.getElementsByTagName("price").item(0).getTextContent());
		    System.out.println("Publish_date : "  + eElement.getElementsByTagName("publish_date").item(0).getTextContent());
		    System.out.println("Description : "   + eElement.getElementsByTagName("description").item(0).getTextContent());
		 }
		 
		 System.out.println(((root.getFirstChild().getNodeValue())));
		 
		 
		 System.out.println(((root.getLastChild().getNodeValue())));	 
		 /*Document.getDocumentElement() − Returns the root element of the document.

		 Node.getFirstChild() − Returns the first child of a given Node.

		 Node.getLastChild() − Returns the last child of a given Node.

		 Node.getNextSibling() − These methods return the next sibling of a given Node.

		 Node.getPreviousSibling() − These methods return the previous sibling of a given Node.

		 Node.getAttribute(attrName) − For a given Node, it returns the attribute with the requested name.*/
		}
		
	}
}
