package com.iamyasas.springbootmybatisdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iamyasas.springbootmybatisdemo.models.OrganizationUnit;
import com.iamyasas.springbootmybatisdemo.services.OrgHierarchyService;

@RestController
@RequestMapping("/orghierarchy")
public class OrgHierarchyController {
	
	@Autowired
	private OrgHierarchyService orgHierarchyService;
	
	@GetMapping("{orgID}")
	public OrganizationUnit getOrgHierarchy(@PathVariable int orgID) {
		return orgHierarchyService.getOrgHierarchy(orgID);
	}
}
