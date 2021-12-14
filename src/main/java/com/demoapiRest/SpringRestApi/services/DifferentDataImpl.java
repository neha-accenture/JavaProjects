package com.demoapiRest.SpringRestApi.services;

import org.springframework.stereotype.Service;

import com.google.gson.*;
import com.demoapiRest.SpringRestApi.entity.Student;

@Service
public class DifferentDataImpl implements DifferentDataInput {

	@Override
	public Object dataToPost(Object data) {
		System.out.println("hello class"+data.getClass().cast(data));
//		System.out.println("::::::::"+Student.class.cast(data));
		GsonBuilder gBuilder = new GsonBuilder();
		gBuilder.setPrettyPrinting();
		Gson gson = gBuilder.create();
		String empdata = gson.toJson(data);
		System.out.print("empdata:::::"+empdata);
		return empdata;
	}

}
