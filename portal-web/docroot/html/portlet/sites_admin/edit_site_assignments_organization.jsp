<%--
/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
--%>

<%@ include file="/html/portlet/sites_admin/init.jsp" %>

<%
Group group = (Group)request.getAttribute("edit_site_assignments.jsp-group");

if (group.isOrganization()) {
	Organization organization = OrganizationLocalServiceUtil.getOrganization(group.getOrganizationId());

	int organizationUsersCount = UserLocalServiceUtil.getOrganizationUsersCount(organization.getOrganizationId());

	List<Role> roles = new ArrayList<Role>();

	roles.add(RoleLocalServiceUtil.getRole(group.getCompanyId(), RoleConstants.ORGANIZATION_USER));
	roles.add(RoleLocalServiceUtil.getRole(group.getCompanyId(), RoleConstants.ORGANIZATION_ADMINISTRATOR));
	roles.add(RoleLocalServiceUtil.getRole(group.getCompanyId(), RoleConstants.ORGANIZATION_OWNER));
%>

	<aui:input name="tabs1" type="hidden" value="organizations" />

	<liferay-ui:search-container>

		<liferay-ui:search-container-results
				results="<%= roles %>"
				total="<%= roles.size() %>"
		/>

		<liferay-ui:search-container-row
			className="com.liferay.portal.model.Role"
			escapedModel="<%= true %>"
			keyProperty="roleId"
			modelVar="role"
		>
			<liferay-ui:search-container-column-text
				buffer="buffer"
				name="users"
			>

				<%
				LinkedHashMap userParams = new LinkedHashMap();

				userParams.put("usersOrgs", new Long(organization.getOrganizationId()));

				if (!role.getName().equals(RoleConstants.ORGANIZATION_USER)) {
					userParams.put("userGroupRole", new Long[] {new Long(group.getGroupId()), new Long(role.getRoleId())});
				}

				List<User> orgUsers = UserLocalServiceUtil.search(company.getCompanyId(), null, WorkflowConstants.STATUS_ANY, userParams, 0, 5, UsersAdminUtil.getUserOrderByComparator("firstName", "desc"));
				int orgUsersCount = UserLocalServiceUtil.searchCount(company.getCompanyId(), null, WorkflowConstants.STATUS_ANY, userParams);

				for (User orgUser : orgUsers) {
					buffer.append(orgUser.getFullName());
					buffer.append(StringPool.COMMA_AND_SPACE);
				}

				if (buffer.length() > 2) {
					buffer.delete(buffer.length() - 2, buffer.length());
				}

				if (orgUsersCount > 5) {
					buffer.append(StringPool.SPACE);
					buffer.append(LanguageUtil.format(pageContext, "and-x-more", (orgUsersCount - 5)));
				}
				%>

			</liferay-ui:search-container-column-text>

			<liferay-ui:search-container-column-text
				name="organization-role"
				property="name"
			/>

			<liferay-ui:search-container-column-text
				buffer="buffer"
				name="site-roles"
			>

				<%
				Role linkedRole = RoleLocalServiceUtil.getRole(group.getCompanyId(), RoleConstants.SITE_MEMBER);

				buffer.append(linkedRole.getTitle(user.getLocale()));

				if (role.getName().equals(RoleConstants.ORGANIZATION_ADMINISTRATOR)) {
					linkedRole = RoleLocalServiceUtil.getRole(group.getCompanyId(), RoleConstants.SITE_ADMINISTRATOR);

					buffer.append(StringPool.COMMA_AND_SPACE);
					buffer.append(linkedRole.getTitle(user.getLocale()));
				}
				else if (role.getName().equals(RoleConstants.ORGANIZATION_OWNER)) {
					linkedRole = RoleLocalServiceUtil.getRole(group.getCompanyId(), RoleConstants.SITE_OWNER);

					buffer.append(StringPool.COMMA_AND_SPACE);
					buffer.append(linkedRole.getTitle(user.getLocale()));
				}
				%>

			</liferay-ui:search-container-column-text>

		</liferay-ui:search-container-row>

		<liferay-ui:panel collapsible='<%= true %>' extended="<%= false %>" persistState="<%= true %>" title='<%= LanguageUtil.format(pageContext, "users-that-belong-to-x-x", new String[]{organization.getName(), String.valueOf(organizationUsersCount)}) %>'>
			<div class="portlet-msg-info">
				<liferay-ui:message key="this-site-belongs-to-x-which-is-an-organization-of-type-x" arguments="<%= new String[]{organization.getName(), LanguageUtil.get(pageContext, organization.getType())} %>" />
			</div>

			<liferay-ui:search-iterator paginate='<%= false %>' />
		</liferay-ui:panel>

	</liferay-ui:search-container>

<%
}
%>