package com.iamyasas.springbootmybatisdemo.mappers;

import org.apache.ibatis.annotations.Mapper;

import com.iamyasas.springbootmybatisdemo.models.HeadEmployee;
import com.iamyasas.springbootmybatisdemo.models.OrganizationUnit;

@Mapper
public interface OrgHierarchyMapper {

	public OrganizationUnit getHeadUnit(int orgID);

	public OrganizationUnit[] getChildUnits(int orgID);

	public HeadEmployee[] getLeafUnits(int orgID);

}
