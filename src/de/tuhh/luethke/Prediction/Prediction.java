package de.tuhh.luethke.Prediction;

import org.ejml.simple.SimpleMatrix;

public class Prediction {
	public double latitude;
	public double longitude;
	public double marginalProbability;
	public double probability;
	public double widerProbability;
	public double acurracy;
	/*public SimpleMatrix closestMean;
	public SimpleMatrix priorClosestMean;*/
	public Prediction(double latitude, double longitude, double marginalProbability, double probability, double widerProbability, double acurracy) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
		this.marginalProbability = marginalProbability;
		this.probability = probability;
		this.widerProbability = widerProbability;
		this.acurracy = acurracy;
		/*this.closestMean = closestMean;
		this.priorClosestMean = priorClosestMean;*/
	}
	
}