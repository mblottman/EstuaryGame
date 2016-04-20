package stjonesestuary.controller;

import java.awt.BorderLayout;
import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

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

public class RecycleGameController {//implements MouseListener, MouseMotionListener{
	public RecycleGameView view;
	public JFrame window;
	private boolean finished = false;
	private ArrayList<ScreenItem> screenitems;
	
	public RecycleGameController(JFrame window){
		this.window = window;

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
		System.out.println(view.x);
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
}
