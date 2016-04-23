package stjonesestuary.controller;

import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

import stjonesestuary.model.screenitems.ScreenItem;
import stjonesestuary.model.screenitems.recyclegamescreenitems.Arrow;
import stjonesestuary.view.gameviews.MainGameView;
import stjonesestuary.view.gameviews.RecycleGameView;
import stjonesestuary.view.gameviews.SeedlingGameView;
//import testswing.Main.DrawPanel;

public class RecycleGameController extends JFrame implements MouseListener, MouseMotionListener,ActionListener{//implements MouseListener, MouseMotionListener{
	public RecycleGameView view;
	public JFrame window;
	private boolean finished = false;
	private ArrayList<ScreenItem> screenitems;
	private BufferedImage backgroundImage;
	
	
	// added
	private CardLayout cardlayout = new CardLayout();
	private JPanel cardHolder = new JPanel(cardlayout);
	JPanel cards;
	
//	public RecycleGameController(JFrame window){
//		this.window = window;
//
//	}
	
	
	public RecycleGameController(){
//		JLabel cardLabel1 = new JLabel("Recycling Game", SwingConstants.CENTER);
//		cardHolder.add(cardLabel1, "recycle");
//        setLayout(new BorderLayout());
//        add(cardHolder, BorderLayout.CENTER);
//
//        setSize(810, 510); //Set the size of the JFrame
//        setTitle("Estuary Game"); //Put Title on top of JFrame

        // ADDED
        try {
            backgroundImage = ImageIO.read(new File("imageBank/RecycleGame/recycleGameBackGround.png"));
        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
//        
//        cards = new JPanel(new CardLayout());
//        add(cards, BorderLayout.SOUTH);
//        getContentPane().add(cards); 
//        cards.setVisible(true);
//        
//        setVisible(true); //Make JFrame visible
        repaint();
	}
	
	
    public void paint(Graphics g) {
    	super.paint(g);
    	//Graphics2D g2d = (Graphics2D) g.create();
        g.drawImage(backgroundImage, 0, 0, this.getWidth(), this.getHeight(), null);
    }
	
	



	public void run(){ //throws InterruptedException{
        view = new RecycleGameView(window);
        window.setLayout(new BorderLayout());
	    //window.setContentPane(new JLabel(new ImageIcon("imageBank/RecycleGame/recycleGameBackGround.png")));
        //window.getContentPane().add(BorderLayout.CENTER, view);
        window.setVisible(true);
        Thread maybe = new Thread(){
        	public void run(){
        		while(true){
        			try{
        				onTick();
        				Thread.sleep(10);
        			}catch(Exception e){}
        		}
        	}
        };
        maybe.start();
        	
   }

	public void onTick(){
	    //window.setContentPane(new JLabel(new ImageIcon("imageBank/RecycleGame/recycleGameBackGround.png")));
		view.x++;
		//System.out.println(view.x);
		window.validate();
		window.repaint();
		window.setVisible(true);
	}
	/*
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
*/


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
