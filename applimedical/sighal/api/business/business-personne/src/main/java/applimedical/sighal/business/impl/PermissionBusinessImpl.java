package applimedical.sighal.business.impl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import applimedical.sighal.api.pojo.Permission;
import applimedical.sighal.business.BaseBusinessImpl;
import applimedical.sighal.business.PermissionBusiness;

@Service("permissionBusiness")
@Transactional
public class PermissionBusinessImpl extends BaseBusinessImpl<Permission, Long>
   implements PermissionBusiness {

}
