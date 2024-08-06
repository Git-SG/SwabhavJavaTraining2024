package com.aurionpro.facade.test;

import com.aurionpro.facade.model.DVDPlayer;
import com.aurionpro.facade.model.Remote;
import com.aurionpro.facade.model.SoundSystem;
import com.aurionpro.facade.model.Projector;

public class MovieTest {
	public static void main(String[] args) {
		Remote remote = new Remote(new DVDPlayer(), new Projector(), new SoundSystem(5));
		
		remote.stopMovie();
		remote.startMovie();
		remote.stopMovie();
	}

}
