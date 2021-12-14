package com.demoapiRest.SpringRestApi.entity;

public class Cars {
	private long model;
	private String modelName;
	private String cC;
	public Cars(long model, String modelName, String cC) {
		super();
		this.model = model;
		this.modelName = modelName;
		this.cC = cC;
	}
	public long getModel() {
		return model;
	}
	public void setModel(long model) {
		this.model = model;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getcC() {
		return cC;
	}
	public void setcC(String cC) {
		this.cC = cC;
	}
	@Override
	public String toString() {
		return "Cars [model=" + model + ", modelName=" + modelName + ", cC=" + cC + "]";
	}
	
	

}
