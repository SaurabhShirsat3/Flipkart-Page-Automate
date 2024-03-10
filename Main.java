package com.flipkartMain;

import com.config.Config2;


public class Main extends Config2{

	public static void main(String[] args) {
		
		
			// TODO Auto-generated method stub
			
			Main obj = new Main();
		obj.browserSetting("https://www.flipkart.com/");
		
		obj.FlipkartAutomate();
		obj.addToCart();
		obj.PlaceOrder();
		obj.Login();
		
		}

	

}

