/**
 * Copyright (c) 2000-2006 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portlet.journal.service;

/**
 * <a href="JournalContentSearchLocalService.java.html"><b><i>View Source</i></b></a>
 *
 * @author  Brian Wing Shun Chan
 *
 */
public interface JournalContentSearchLocalService {
	public void checkContentSearches(java.lang.String companyId)
		throws com.liferay.portal.SystemException, 
			com.liferay.portal.PortalException;

	public void deleteArticleContentSearches(java.lang.String companyId,
		long groupId, java.lang.String articleId)
		throws com.liferay.portal.SystemException;

	public void deleteLayoutContentSearches(java.lang.String layoutId,
		java.lang.String ownerId) throws com.liferay.portal.SystemException;

	public void deleteOwnerContentSearches(java.lang.String ownerId)
		throws com.liferay.portal.SystemException;

	public java.util.List getArticleContentSearches()
		throws com.liferay.portal.SystemException;

	public java.util.List getArticleContentSearches(
		java.lang.String companyId, long groupId, java.lang.String articleId)
		throws com.liferay.portal.SystemException;

	public java.util.List getLayoutIds(java.lang.String ownerId, long groupId,
		java.lang.String articleId) throws com.liferay.portal.SystemException;

	public int getLayoutIdsCount(java.lang.String ownerId, long groupId,
		java.lang.String articleId) throws com.liferay.portal.SystemException;

	public com.liferay.portlet.journal.model.JournalContentSearch updateContentSearch(
		java.lang.String portletId, java.lang.String layoutId,
		java.lang.String ownerId, java.lang.String companyId, long groupId,
		java.lang.String articleId)
		throws com.liferay.portal.SystemException, 
			com.liferay.portal.PortalException;

	public java.util.List updateContentSearch(java.lang.String portletId,
		java.lang.String layoutId, java.lang.String ownerId,
		java.lang.String companyId, long groupId, java.lang.String[] articleIds)
		throws com.liferay.portal.SystemException, 
			com.liferay.portal.PortalException;
}