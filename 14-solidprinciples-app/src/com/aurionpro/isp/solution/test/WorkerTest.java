package com.aurionpro.isp.solution.test;

import com.aurionpro.isp.solution.model.IWorker;
import com.aurionpro.isp.solution.model.Labour;
import com.aurionpro.isp.solution.model.Robot;

public class WorkerTest {
	public static void main(String[] args) {
		Labour labour = new Labour();
		Robot robot = new Robot();
		
		labour.start();
		labour.stop();
		labour.eat();
		labour.rest();
		
		robot.start();
		robot.stop();
	}

}
