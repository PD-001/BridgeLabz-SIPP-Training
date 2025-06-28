package com.workshops.cinematime;
import java.util.*;
public class CinemaTimeManager {
	private List<String> movieTitles;
	private List<String> showTimes;
	
	public CinemaTimeManager() {
		movieTitles=new ArrayList<>();
		showTimes=new ArrayList<>();
	}
	
	private boolean validTime(String sTime) throws InvalidTimeFormatException {
		try {
			String[] hr_min=sTime.split(":");
			
			if((Integer.parseInt(hr_min[0])>=0 && Integer.parseInt(hr_min[0])<24) && (Integer.parseInt(hr_min[1])>=0 && Integer.parseInt(hr_min[1])<60)) {
				return true;
			}
			return false;
		}
		catch(Exception E) {
			throw new InvalidTimeFormatException("InvalidTimeFormat");
		}
	}
	
	public void addMovie(String mTitle, String sTime) throws InvalidTimeFormatException {
		if(!validTime(sTime)) {
			throw new InvalidTimeFormatException("InvalidTimeFormat");
		}
		movieTitles.add(mTitle);
		showTimes.add(sTime);
	}
	
	public boolean searchMovies(String mName) {
		for(int i=0;i<movieTitles.size();i++) {
			if(movieTitles.get(i).toLowerCase().contains(mName.toLowerCase())) {
				System.out.println("Movies matching your search"+movieTitles.get(i));
				return true;
			}
		}
		System.out.println("Movie not found \n Movies Available:");
		displayAllMovies();
		return false;
	}
	public void displayAllMovies() {
		for(int i=0;i<movieTitles.size();i++) {
			System.out.println("Movie option "+(i+1)+ " is "+movieTitles.get(i)+" show time is "+showTimes.get(i));
		}
	}
	public String[][] generateReport() {
		String[][] report=new String[movieTitles.size()][2];
		for(int i=0;i<movieTitles.size();i++) {
			report[i][0]=movieTitles.get(i);
			report[i][1]=showTimes.get(i);
		}
		return report;
	}
}
