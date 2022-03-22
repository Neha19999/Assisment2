package com.Neha.Design;

public class InvokerImplement {
     
	private ElectronicDevice bulb;
	private ElectronicDevice musicPlayer;
	
	//Constructor for this class
	
	public InvokerImplement()
	{
		bulb=new Bulb();
		musicPlayer=new MusicPlayer();
	}
	
	public void UseBulb()
	{
		bulb.switchOff();
		bulb.switchOn();
	}
	
	public void UseMusicSystem()
	{
		musicPlayer.switchOff();
		musicPlayer.switchOn();
	}
}
