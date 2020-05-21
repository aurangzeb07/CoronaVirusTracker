package com.example.covid_19tracker;

import androidx.annotation.NonNull;

import java.util.List;

public class Response{
	private List<StatewiseItem> statewise;

	public Response(List<StatewiseItem> statewise) {
		this.statewise = statewise;
	}

	public List<StatewiseItem> getStatewise(){
		return statewise;
	}

	@Override
	public String toString() {
		return "Response{"  +
				"statewise="  +  statewise  +
				'}';
	}
}