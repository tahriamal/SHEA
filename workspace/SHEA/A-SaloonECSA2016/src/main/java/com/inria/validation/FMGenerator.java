/*
 * FMGenerator.java
 *
 * v1.0
 *
 * 2014-02-20
 * 
 * Copyright Inria - Université de Lille 1
 */

package com.inria.validation;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.chocosolver.solver.Solver;

//import choco.kernel.model.Model;
//import fr.inria.saloon.solver.CSPBuilder;
//import fr.inria.saloon.solver.CSPSolver;

public class FMGenerator {

	private static boolean verbose = false;
	
	//private static final String fmPath = "/Users/clement/Thesis/development/workspace/Saloon/src/main/resources/model/validation/fm";
	private static final String fmPath = "C:/validation/fm/";
	
	private static int nbFMToGenerate = 100;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Solver solver;
		List<Integer> xmiToCSPTime = new ArrayList<Integer>();
		List<Integer> totalSolveTime = new ArrayList<Integer>();
		
		for (int i = 0; i < nbFMToGenerate ; i++) {
			
			File f;
			f = new File(fmPath + i + ".xmi");
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}

//			System.out.println("fm"+i);
//			if (verbose) System.out.print("Generating random FM");	
			RandomFMBuilder fmBuilder = new RandomFMBuilder();
			RandomFM fm = fmBuilder.generateRandomFM();
//			if (verbose) System.out.print(" with " + fm.getNbFeatures() + " features");
//			if (verbose) System.out.println("... Done");
			
//			if (verbose) System.out.print("Writing FM to XMI");
			XMIFileWriter xmiFileWriter = new XMIFileWriter(fm);
			xmiFileWriter.writeToFile(f);
//			if (verbose) System.out.println("... Done");
			
//			if (verbose) System.out.print("Converting XMI to CSP");
//			CSPBuilder builder = new CSPBuilder(f);
//			long startTime = System.currentTimeMillis();
//			Model modelToSolve = builder.buildCSPModel();
//			long xmiTime   = System.currentTimeMillis();
//			long xmiTotalTime = xmiTime - startTime;
//			if (verbose) System.out.println("... Done");
			
//			System.out.println("Time to write xmi into CSP: " + xmiTotalTime + "ms");
//			System.out.println(xmiTotalTime);
//			System.out.println();
			
//			if (verbose) System.out.println("Trying to solve CSP model");
//			solver = new CSPSolver(modelToSolve);
//			solver.solve();
////			solver.giveNbSolutions();
////			if (verbose) System.out.println("... Done");
//			long endTime   = System.currentTimeMillis();
//			long totalTime = endTime - startTime;
//			
//			xmiToCSPTime.add((int) xmiTotalTime);			
//			totalSolveTime.add((int) totalTime);
//			
//			System.out.println("Total time: " + totalTime + "ms, time to write xmi into CSP: " + xmiTotalTime + "ms");
//			System.out.println();
		} 		
		
//		int averageTotal = 0;
//		int averageXMIToCSP = 0;
//		for (int j = 0; j < nbFMToGenerate; j++) {
////			System.out.println(xmiToCSPTime.get(j));
//			averageTotal = averageTotal + totalSolveTime.get(j);
//			averageXMIToCSP = averageXMIToCSP + xmiToCSPTime.get(j);
//		}
//		System.out.println("Average Total time: " + averageTotal/nbFMToGenerate + "ms"); 
//		System.out.println("Average time to write xmi into CSP: " + averageXMIToCSP/nbFMToGenerate + "ms");
	}

}
