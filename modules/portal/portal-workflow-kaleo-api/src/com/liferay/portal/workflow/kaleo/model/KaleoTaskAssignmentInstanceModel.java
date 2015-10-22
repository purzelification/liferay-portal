/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.portal.workflow.kaleo.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.model.PartitionedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the KaleoTaskAssignmentInstance service. Represents a row in the &quot;KaleoTaskAssignmentInstance&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoTaskAssignmentInstanceModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoTaskAssignmentInstanceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KaleoTaskAssignmentInstance
 * @see com.liferay.portal.workflow.kaleo.model.impl.KaleoTaskAssignmentInstanceImpl
 * @see com.liferay.portal.workflow.kaleo.model.impl.KaleoTaskAssignmentInstanceModelImpl
 * @generated
 */
@ProviderType
public interface KaleoTaskAssignmentInstanceModel extends BaseModel<KaleoTaskAssignmentInstance>,
	GroupedModel, PartitionedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a kaleo task assignment instance model instance should use the {@link KaleoTaskAssignmentInstance} interface instead.
	 */

	/**
	 * Returns the primary key of this kaleo task assignment instance.
	 *
	 * @return the primary key of this kaleo task assignment instance
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this kaleo task assignment instance.
	 *
	 * @param primaryKey the primary key of this kaleo task assignment instance
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the kaleo task assignment instance ID of this kaleo task assignment instance.
	 *
	 * @return the kaleo task assignment instance ID of this kaleo task assignment instance
	 */
	public long getKaleoTaskAssignmentInstanceId();

	/**
	 * Sets the kaleo task assignment instance ID of this kaleo task assignment instance.
	 *
	 * @param kaleoTaskAssignmentInstanceId the kaleo task assignment instance ID of this kaleo task assignment instance
	 */
	public void setKaleoTaskAssignmentInstanceId(
		long kaleoTaskAssignmentInstanceId);

	/**
	 * Returns the group ID of this kaleo task assignment instance.
	 *
	 * @return the group ID of this kaleo task assignment instance
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this kaleo task assignment instance.
	 *
	 * @param groupId the group ID of this kaleo task assignment instance
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this kaleo task assignment instance.
	 *
	 * @return the company ID of this kaleo task assignment instance
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this kaleo task assignment instance.
	 *
	 * @param companyId the company ID of this kaleo task assignment instance
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this kaleo task assignment instance.
	 *
	 * @return the user ID of this kaleo task assignment instance
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this kaleo task assignment instance.
	 *
	 * @param userId the user ID of this kaleo task assignment instance
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this kaleo task assignment instance.
	 *
	 * @return the user uuid of this kaleo task assignment instance
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this kaleo task assignment instance.
	 *
	 * @param userUuid the user uuid of this kaleo task assignment instance
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this kaleo task assignment instance.
	 *
	 * @return the user name of this kaleo task assignment instance
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this kaleo task assignment instance.
	 *
	 * @param userName the user name of this kaleo task assignment instance
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this kaleo task assignment instance.
	 *
	 * @return the create date of this kaleo task assignment instance
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this kaleo task assignment instance.
	 *
	 * @param createDate the create date of this kaleo task assignment instance
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this kaleo task assignment instance.
	 *
	 * @return the modified date of this kaleo task assignment instance
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this kaleo task assignment instance.
	 *
	 * @param modifiedDate the modified date of this kaleo task assignment instance
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the kaleo definition ID of this kaleo task assignment instance.
	 *
	 * @return the kaleo definition ID of this kaleo task assignment instance
	 */
	public long getKaleoDefinitionId();

	/**
	 * Sets the kaleo definition ID of this kaleo task assignment instance.
	 *
	 * @param kaleoDefinitionId the kaleo definition ID of this kaleo task assignment instance
	 */
	public void setKaleoDefinitionId(long kaleoDefinitionId);

	/**
	 * Returns the kaleo instance ID of this kaleo task assignment instance.
	 *
	 * @return the kaleo instance ID of this kaleo task assignment instance
	 */
	public long getKaleoInstanceId();

	/**
	 * Sets the kaleo instance ID of this kaleo task assignment instance.
	 *
	 * @param kaleoInstanceId the kaleo instance ID of this kaleo task assignment instance
	 */
	public void setKaleoInstanceId(long kaleoInstanceId);

	/**
	 * Returns the kaleo instance token ID of this kaleo task assignment instance.
	 *
	 * @return the kaleo instance token ID of this kaleo task assignment instance
	 */
	public long getKaleoInstanceTokenId();

	/**
	 * Sets the kaleo instance token ID of this kaleo task assignment instance.
	 *
	 * @param kaleoInstanceTokenId the kaleo instance token ID of this kaleo task assignment instance
	 */
	public void setKaleoInstanceTokenId(long kaleoInstanceTokenId);

	/**
	 * Returns the kaleo task instance token ID of this kaleo task assignment instance.
	 *
	 * @return the kaleo task instance token ID of this kaleo task assignment instance
	 */
	public long getKaleoTaskInstanceTokenId();

	/**
	 * Sets the kaleo task instance token ID of this kaleo task assignment instance.
	 *
	 * @param kaleoTaskInstanceTokenId the kaleo task instance token ID of this kaleo task assignment instance
	 */
	public void setKaleoTaskInstanceTokenId(long kaleoTaskInstanceTokenId);

	/**
	 * Returns the kaleo task ID of this kaleo task assignment instance.
	 *
	 * @return the kaleo task ID of this kaleo task assignment instance
	 */
	public long getKaleoTaskId();

	/**
	 * Sets the kaleo task ID of this kaleo task assignment instance.
	 *
	 * @param kaleoTaskId the kaleo task ID of this kaleo task assignment instance
	 */
	public void setKaleoTaskId(long kaleoTaskId);

	/**
	 * Returns the kaleo task name of this kaleo task assignment instance.
	 *
	 * @return the kaleo task name of this kaleo task assignment instance
	 */
	@AutoEscape
	public String getKaleoTaskName();

	/**
	 * Sets the kaleo task name of this kaleo task assignment instance.
	 *
	 * @param kaleoTaskName the kaleo task name of this kaleo task assignment instance
	 */
	public void setKaleoTaskName(String kaleoTaskName);

	/**
	 * Returns the assignee class name of this kaleo task assignment instance.
	 *
	 * @return the assignee class name of this kaleo task assignment instance
	 */
	@AutoEscape
	public String getAssigneeClassName();

	/**
	 * Sets the assignee class name of this kaleo task assignment instance.
	 *
	 * @param assigneeClassName the assignee class name of this kaleo task assignment instance
	 */
	public void setAssigneeClassName(String assigneeClassName);

	/**
	 * Returns the assignee class p k of this kaleo task assignment instance.
	 *
	 * @return the assignee class p k of this kaleo task assignment instance
	 */
	public long getAssigneeClassPK();

	/**
	 * Sets the assignee class p k of this kaleo task assignment instance.
	 *
	 * @param assigneeClassPK the assignee class p k of this kaleo task assignment instance
	 */
	public void setAssigneeClassPK(long assigneeClassPK);

	/**
	 * Returns the completed of this kaleo task assignment instance.
	 *
	 * @return the completed of this kaleo task assignment instance
	 */
	public boolean getCompleted();

	/**
	 * Returns <code>true</code> if this kaleo task assignment instance is completed.
	 *
	 * @return <code>true</code> if this kaleo task assignment instance is completed; <code>false</code> otherwise
	 */
	public boolean isCompleted();

	/**
	 * Sets whether this kaleo task assignment instance is completed.
	 *
	 * @param completed the completed of this kaleo task assignment instance
	 */
	public void setCompleted(boolean completed);

	/**
	 * Returns the completion date of this kaleo task assignment instance.
	 *
	 * @return the completion date of this kaleo task assignment instance
	 */
	public Date getCompletionDate();

	/**
	 * Sets the completion date of this kaleo task assignment instance.
	 *
	 * @param completionDate the completion date of this kaleo task assignment instance
	 */
	public void setCompletionDate(Date completionDate);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignmentInstance kaleoTaskAssignmentInstance);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignmentInstance> toCacheModel();

	@Override
	public com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignmentInstance toEscapedModel();

	@Override
	public com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignmentInstance toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}