package com.example.covid_19tracker;

public class StatewiseItem{
	private String statenotes;
	private String recovered;
	private String deltadeaths;
	private String deltarecovered;
	private String active;
	private String deltaconfirmed;
	private String state;
	private String statecode;
	private String confirmed;
	private String deaths;
	private String lastupdatedtime;

	public String getStatenotes(){
		return statenotes;
	}

	public String getRecovered(){
		return recovered;
	}

	public String getDeltadeaths(){
		return deltadeaths;
	}

	public String getDeltarecovered(){
		return deltarecovered;
	}

	public String getActive(){
		return active;
	}

	public String getDeltaconfirmed(){
		return deltaconfirmed;
	}

	public String getState(){
		return state;
	}

	public String getStatecode(){
		return statecode;
	}

	public String getConfirmed(){
		return confirmed;
	}

	public String getDeaths(){
		return deaths;
	}

	public String getLastupdatedtime(){
		return lastupdatedtime;
	}
}
