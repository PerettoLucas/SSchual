package net.tfobz.xmlparser;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.stream.XMLStreamException;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.Color;

public class GUI extends JFrame
{

	private JPanel contentPane;
	private ArrayList<RssReader> rssReaderList = new ArrayList<>();
	private RssReader reader ;
	private String url;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					GUI frame=new GUI();
					frame.setVisible(true);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,759,500);
		contentPane=new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setEditable(false);
		editorPane.setBounds(12, 12, 735, 411);
		contentPane.add(editorPane);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBackground(Color.LIGHT_GRAY);
		btnUpdate.setBounds(633, 438, 114, 25);
		contentPane.add(btnUpdate);
		
		JButton btnDisactivateScheduler = new JButton("Disactivate Scheduler");
		btnDisactivateScheduler.setBackground(Color.LIGHT_GRAY);
		btnDisactivateScheduler.setBounds(430, 438, 191, 25);
		contentPane.add(btnDisactivateScheduler);
		
		JButton btnAddUrl = new JButton("Add URL ...");
		btnAddUrl.setBackground(Color.LIGHT_GRAY);
		btnAddUrl.setBounds(304, 438, 114, 25);
		contentPane.add(btnAddUrl);
		setLocationRelativeTo(null);
		setResizable(false);
		
		btnAddUrl.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				url = JOptionPane.showInputDialog("Geben sie die URL ein : ");
				
				//TODO If einbauen
				
				rssReaderList.add(new RssReader(url));
				
				
			}
		});
		
		btnUpdate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String text_to_show;
				
				for (RssReader rssReader : rssReaderList) 
				{
					
					
				}
				
				editorPane.setText(reader.getNewest());				
				
			}
		});
	}
}

//TODO ScrollPane hinzufügen


/*
 * 	https://www.suedtirolnews.it/feed
 * 
 * 
 * 
 * 
 * 
 */