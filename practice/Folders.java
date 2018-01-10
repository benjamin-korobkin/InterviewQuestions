package practice;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;

public class Folders 
{
	public static Collection<String> folderNames(String xml, char startingLetter) 
			throws Exception 
	{
		// list to store the right folders
		List<String> folders = new ArrayList<String>();

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(new ByteArrayInputStream(xml.getBytes()));
		// file has been parsed

		NodeList nl = doc.getElementsByTagName("folder");
		// gained a nodeList of all the nodes with the tag name "folder"

		for (int i = 0; i < nl.getLength(); i++) 
		{
			//NamedNodeMap nodeMap = nl.item(i).getAttributes();
			// Each nodeMap has a length of 1 in this case.
			// We're using nodeMap because we need the attribute
			// name/value of each node.
//			Node node = nodeMap.item(0);
//			String folderName = node.getNodeValue();
//			if (folderName.charAt(0) == startingLetter) folders.add(folderName);
		}

		return folders;

	// This link showed me how to do it:	http://www.mkyong.com/java/how-to-read-xml-file-in-java-dom-parser/
	}

	public static void main(String[] args) throws Exception 
	{
		String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + "<folder name=\"c\">"
				+ "<folder name=\"program files\">" + "<folder name=\"uninstall information\" />" + "</folder>"
				+ "<folder name=\"users\" />" + "</folder>";

		Collection<String> names = folderNames(xml, 'u');
		for (String name : names)
			System.out.println(name);
	}
}