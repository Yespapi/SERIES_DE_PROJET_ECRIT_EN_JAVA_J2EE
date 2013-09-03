 package com.senegal.explorer.uar;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.net.*;
import java.util.ArrayList;
/***
 * 
 * @author Aly BA 
 * class d'interface Graphique
 * 
 *
 */

public class Interface extends JFrame implements ActionListener {
	
	//Balises DOM (fichier xml chargé)
	private static final long serialVersionUID = 12345L;
	public ArrayList<String> titre = new ArrayList<String>();
	public ArrayList<String> descriptions = new ArrayList<String>();
	public ArrayList<String> liens = new ArrayList<String>();
	public ArrayList<Integer> prix = new ArrayList<Integer>();
	public ArrayList<Number> importance = new ArrayList<Number>();
	
	//Eléments graphique
	public JList list;
	public JComboBox combo;
	public JTextArea textArea = new JTextArea();
	public JLabel prixLabel = new JLabel();
	public JLabel importanceLabel = new JLabel();
	public JScrollPane textScroller;
	
	/**
	 * Constructeur de la classe interface
	 * Construction principale de l'interface graphique
	 */
	public Interface()
	{
		super("Visiter Le SENEGAL(Mon petit pays ensoleillé d'Afrique de l'ouest) | Explorer SENEGAL(My little sunny countries in West Africa)");
		setExtendedState(JFrame.MAXIMIZED_BOTH);; //On donne une taille à notre fenêtre
		setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
		setLayout(new FlowLayout());
		//Charge le liens donnée par note application extérieur au projet, fournit comme un service
		chargeDonnee("http://localhost:8080/charge_donnee/data.jsp");
		
		//Initialisation de nos éléments graphique
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		add(panel);
		JPanel labelPanel = new JPanel();
		labelPanel.setLayout(new BoxLayout(labelPanel, BoxLayout.LINE_AXIS));
		labelPanel.add(prixLabel);
		labelPanel.add(Box.createRigidArea(new Dimension(80,50)));
		labelPanel.add(importanceLabel);
		labelPanel.add(Box.createRigidArea(new Dimension(80,50)));
		prixLabel.setText("Price / Prix : € 0");
		importanceLabel.setText("Importance: 5 /5");
		combo = new JComboBox(titre.toArray());
		combo.addActionListener(this);
		panel.add(combo);
		panel.add(Box.createRigidArea(new Dimension(30,15)));
		textScroller = new JScrollPane(textArea, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		textArea.setLineWrap(true);
		textArea.setRows(10);
		textArea.setWrapStyleWord(true);
		panel.add(textScroller);
		panel.add(Box.createRigidArea(new Dimension(30,15)));
		panel.add(labelPanel);
		JButton btn = new JButton("Cliquer Ici pour plus d'informations | Click Here for more informations!");
		btn.addActionListener(this);
		btn.setActionCommand("click");
		labelPanel.add(btn);
		combo.setSelectedIndex(0);
		
		
		
	}
// Controle le comportement et évenements de l'utilisateur du visiteur
	public void actionPerformed(ActionEvent e) {
		int i = combo.getSelectedIndex();
		
		if(e.getActionCommand().equals("click")) {
			try {
				java.awt.Desktop.getDesktop().browse(new URI(liens.get(i)));
			}
			catch(Exception ex) {
				System.out.println("error loading url");
			}
		}
		
		textArea.setText(descriptions.get(i));
		prixLabel.setText("Weekly price | Prix Moyen à la semaine :"  + prix.get(i)+" "+"€");
		importanceLabel.setText("Degres d'Importance | Degrees of Significance: " + importance.get(i) + "/5");
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				textScroller.getVerticalScrollBar().setValue(0);
			}
				
		});
		
		
    }
	/***
	 * Permet la manipulation DOM de notre fichier xml
	 * recupère les contenus du fichier suivant la structure balistique
	 * @param xmlURL
	 */
	public void chargeDonnee(String xmlURL)
	{
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(new URL(xmlURL).openStream());
			doc.getDocumentElement().normalize();
	 
			NodeList nodes = doc.getElementsByTagName("sites");
			
			for (int i = 0; i < nodes.getLength(); i++) {
	 
			   Node n = nodes.item(i);
			   if (n.getNodeType() == Node.ELEMENT_NODE) {
	 
			      Element e = (Element) n;

			      titre.add(getTagValue("sitesTitle", e));
			      descriptions.add(getTagValue("description", e));
			      liens.add(getTagValue("liens", e).replaceAll("\\s+", ""));
			      prix.add(Integer.parseInt(getTagValue("prix", e)));
			      importance.add(Integer.parseInt(getTagValue("importance", e)));
			   }
			}
			
			
		  } catch (Exception e) {
			e.printStackTrace();
		  }
	}
	/***
	 * Manipulation dom
	 * @param sTag
	 * @param eElement
	 * @return le contenu d'une balise (tag)
	 */
private static String getTagValue(String sTag, Element eElement) {
		NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();
	 
	        Node nValue = (Node) nlList.item(0);
	 
		return nValue.getNodeValue();
	 }
	
}
