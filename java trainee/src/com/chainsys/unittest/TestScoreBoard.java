package com.chainsys.unittest;

import com.chainsys.classandmethods.TtwentyScoreBoard;

public class TestScoreBoard {

	

		public static void testRCBMatch()
		{
			TtwentyScoreBoard sb= new TtwentyScoreBoard(180);
			System.out.println("Target : "+sb.getTarget());
			System.out.println("Max Overs : "+TtwentyScoreBoard.maxOvers);
			sb.setCurrentScore(70);
			sb.setCompleted_overs(10);
			System.out.println("CurrentScore is : "+sb.getCurrentScore());
			//System.out.println("Current Score is :"+sb.setCurrentScore());
			System.out.println("Overs Completed : "+sb.getCompleted_overs());
			System.out.println("CureentRR :"+sb.getCurrentRunRate());
			System.out.println("RequiredRR : "+sb.getRequiredRunRate());
			
		}

}