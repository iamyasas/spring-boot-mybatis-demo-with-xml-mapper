package com.iamyasas.springbootmybatisdemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iamyasas.springbootmybatisdemo.mappers.OrgHierarchyMapper;
import com.iamyasas.springbootmybatisdemo.models.HeadEmployee;
import com.iamyasas.springbootmybatisdemo.models.OrganizationUnit;

@Service
public class OrgHierarchyService {
	
	@Autowired
	private OrgHierarchyMapper orgHierarchyMapper;
	
	public OrganizationUnit getOrgHierarchy(int orgID) {
		OrganizationUnit headUnit = orgHierarchyMapper.getHeadUnit(orgID);
		OrganizationUnit[] childUnitis = orgHierarchyMapper.getChildUnits(orgID);
		HeadEmployee[] headEmployees = orgHierarchyMapper.getLeafUnits(orgID);
		
		headUnit.setChildUnitis(childUnitis);
		headUnit.setLeafUnits(headEmployees);
		return headUnit;
	}
}
