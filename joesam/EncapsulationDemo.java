package com.joesam;

//Binding the data member and member function
public class EncapsulationDemo {
	
	private int eid;
	private String name;
	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		
		EncapsulationDemo obj=new EncapsulationDemo();
		obj.setEid(101);
		obj.setName("Jomon");
		System.out.println("EID: "+obj.getEid());
		System.out.println("Name: "+obj.getName());
	}

}
