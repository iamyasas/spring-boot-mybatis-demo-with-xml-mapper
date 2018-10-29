package com.iamyasas.springbootmybatisdemo.models;

public class OrganizationUnit {
	private int id;
	private String name;
	private int parent;
	private HeadEmployee head;
	private OrganizationUnit[] childUnitis;
	private HeadEmployee[] leafUnits;
	
	public OrganizationUnit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrganizationUnit(int id, String name, int parent, HeadEmployee head, OrganizationUnit[] childUnitis,
			HeadEmployee[] leafUnits) {
		super();
		this.id = id;
		this.name = name;
		this.parent = parent;
		this.head = head;
		this.childUnitis = childUnitis;
		this.leafUnits = leafUnits;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getParent() {
		return parent;
	}

	public void setParent(int parent) {
		this.parent = parent;
	}

	public HeadEmployee getHead() {
		return head;
	}

	public void setHead(HeadEmployee head) {
		this.head = head;
	}

	public OrganizationUnit[] getChildUnitis() {
		return childUnitis;
	}

	public void setChildUnitis(OrganizationUnit[] childUnitis) {
		this.childUnitis = childUnitis;
	}

	public HeadEmployee[] getLeafUnits() {
		return leafUnits;
	}

	public void setLeafUnits(HeadEmployee[] leafUnits) {
		this.leafUnits = leafUnits;
	}
	
	
}
