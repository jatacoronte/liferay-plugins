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

package com.liferay.asset.sharing.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for AssetSharingEntry. This utility wraps
 * {@link com.liferay.asset.sharing.service.impl.AssetSharingEntryLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AssetSharingEntryLocalService
 * @see com.liferay.asset.sharing.service.base.AssetSharingEntryLocalServiceBaseImpl
 * @see com.liferay.asset.sharing.service.impl.AssetSharingEntryLocalServiceImpl
 * @generated
 */
public class AssetSharingEntryLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.asset.sharing.service.impl.AssetSharingEntryLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the asset sharing entry to the database. Also notifies the appropriate model listeners.
	*
	* @param assetSharingEntry the asset sharing entry
	* @return the asset sharing entry that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.asset.sharing.model.AssetSharingEntry addAssetSharingEntry(
		com.liferay.asset.sharing.model.AssetSharingEntry assetSharingEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addAssetSharingEntry(assetSharingEntry);
	}

	/**
	* Creates a new asset sharing entry with the primary key. Does not add the asset sharing entry to the database.
	*
	* @param assetSharingEntryPK the primary key for the new asset sharing entry
	* @return the new asset sharing entry
	*/
	public static com.liferay.asset.sharing.model.AssetSharingEntry createAssetSharingEntry(
		com.liferay.asset.sharing.service.persistence.AssetSharingEntryPK assetSharingEntryPK) {
		return getService().createAssetSharingEntry(assetSharingEntryPK);
	}

	/**
	* Deletes the asset sharing entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assetSharingEntryPK the primary key of the asset sharing entry
	* @return the asset sharing entry that was removed
	* @throws PortalException if a asset sharing entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.asset.sharing.model.AssetSharingEntry deleteAssetSharingEntry(
		com.liferay.asset.sharing.service.persistence.AssetSharingEntryPK assetSharingEntryPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteAssetSharingEntry(assetSharingEntryPK);
	}

	/**
	* Deletes the asset sharing entry from the database. Also notifies the appropriate model listeners.
	*
	* @param assetSharingEntry the asset sharing entry
	* @return the asset sharing entry that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.asset.sharing.model.AssetSharingEntry deleteAssetSharingEntry(
		com.liferay.asset.sharing.model.AssetSharingEntry assetSharingEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteAssetSharingEntry(assetSharingEntry);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.asset.sharing.model.impl.AssetSharingEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.asset.sharing.model.impl.AssetSharingEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.asset.sharing.model.AssetSharingEntry fetchAssetSharingEntry(
		com.liferay.asset.sharing.service.persistence.AssetSharingEntryPK assetSharingEntryPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchAssetSharingEntry(assetSharingEntryPK);
	}

	/**
	* Returns the asset sharing entry with the primary key.
	*
	* @param assetSharingEntryPK the primary key of the asset sharing entry
	* @return the asset sharing entry
	* @throws PortalException if a asset sharing entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.asset.sharing.model.AssetSharingEntry getAssetSharingEntry(
		com.liferay.asset.sharing.service.persistence.AssetSharingEntryPK assetSharingEntryPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAssetSharingEntry(assetSharingEntryPK);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the asset sharing entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.asset.sharing.model.impl.AssetSharingEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of asset sharing entries
	* @param end the upper bound of the range of asset sharing entries (not inclusive)
	* @return the range of asset sharing entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.asset.sharing.model.AssetSharingEntry> getAssetSharingEntries(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAssetSharingEntries(start, end);
	}

	/**
	* Returns the number of asset sharing entries.
	*
	* @return the number of asset sharing entries
	* @throws SystemException if a system exception occurred
	*/
	public static int getAssetSharingEntriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAssetSharingEntriesCount();
	}

	/**
	* Updates the asset sharing entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param assetSharingEntry the asset sharing entry
	* @return the asset sharing entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.asset.sharing.model.AssetSharingEntry updateAssetSharingEntry(
		com.liferay.asset.sharing.model.AssetSharingEntry assetSharingEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateAssetSharingEntry(assetSharingEntry);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void addAssetSharingEntries(long classNameId, long classPK,
		java.util.Map<java.lang.Long, long[]> sharedToClassPKsMap)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addAssetSharingEntries(classNameId, classPK, sharedToClassPKsMap);
	}

	public static void addAssetSharingEntry(long classNameId, long classPK,
		long sharedToClassNameId, long sharedToClassPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addAssetSharingEntry(classNameId, classPK, sharedToClassNameId,
			sharedToClassPK);
	}

	public static void deleteAssetSharingEntries(long classNameId, long classPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteAssetSharingEntries(classNameId, classPK);
	}

	public static java.util.List<com.liferay.asset.sharing.model.AssetSharingEntry> getAssetSharingEntries(
		long classNameId, long classPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAssetSharingEntries(classNameId, classPK);
	}

	public static java.util.List<com.liferay.asset.sharing.model.AssetSharingEntry> getAssetSharingEntries(
		long classNameId, long classPK, long sharedToClassNameId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getAssetSharingEntries(classNameId, classPK,
			sharedToClassNameId);
	}

	public static java.util.List<com.liferay.asset.sharing.model.AssetSharingEntry> getSharedToAssetSharingEntries(
		long sharedToClassNameId, long sharedToClassPK, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getSharedToAssetSharingEntries(sharedToClassNameId,
			sharedToClassPK, start, end);
	}

	public static java.util.List<com.liferay.asset.sharing.model.AssetSharingEntry> getSharedToAssetSharingEntries(
		long classNameId, long sharedToClassNameId, long sharedToClassPK,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getSharedToAssetSharingEntries(classNameId,
			sharedToClassNameId, sharedToClassPK, start, end);
	}

	public static int getSharedToAssetSharingEntriesCount(
		long sharedToClassNameId, long sharedToClassPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getSharedToAssetSharingEntriesCount(sharedToClassNameId,
			sharedToClassPK);
	}

	public static int getSharedToAssetSharingEntriesCount(long classNameId,
		long sharedToClassNameId, long sharedToClassPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getSharedToAssetSharingEntriesCount(classNameId,
			sharedToClassNameId, sharedToClassPK);
	}

	public static java.util.List<java.lang.Object[]> search(long userId,
		long[] classNameIds,
		java.util.Map<java.lang.Long, long[]> sharedToClassPKsMap, int start,
		int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .search(userId, classNameIds, sharedToClassPKsMap, start, end);
	}

	public static int searchCount(long userId, long[] classNameIds,
		java.util.Map<java.lang.Long, long[]> sharedToClassPKsMap)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .searchCount(userId, classNameIds, sharedToClassPKsMap);
	}

	public static void clearService() {
		_service = null;
	}

	public static AssetSharingEntryLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					AssetSharingEntryLocalService.class.getName());

			if (invokableLocalService instanceof AssetSharingEntryLocalService) {
				_service = (AssetSharingEntryLocalService)invokableLocalService;
			}
			else {
				_service = new AssetSharingEntryLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(AssetSharingEntryLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(AssetSharingEntryLocalService service) {
	}

	private static AssetSharingEntryLocalService _service;
}