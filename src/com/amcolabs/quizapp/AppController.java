package com.amcolabs.quizapp;

import java.util.Stack;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

public abstract class AppController {
	
	protected QuizApp quizApp;
	public AppController(QuizApp quizApp) {
		this.quizApp = quizApp;
	}
	public Context getContext() {
		return quizApp.getContext();
	}

	
	public void insertScreen(Screen newScreen){
    	quizApp.animateScreenIn(newScreen);//do into animation
	}
	public abstract void onDestroy();
	
	public boolean onBackPressed(){
		return false;
	}
	
	public void clearScreen() {
		quizApp.animateScreenRemove();
	}

	public void beforeScreenRemove(Screen screen){
		
	}

	
}