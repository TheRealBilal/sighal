package applimedical.sighal.api.pojo;

import java.io.Serializable;


public class PersonnelServicePk implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5154487456515202307L;

	private Long personnelId;

	private Long serviceId;

	public Long getPersonnelId() {
		return personnelId;
	}
	public void setPersonnelId(Long personnelId) {
		this.personnelId = personnelId;
	}
	public Long getServiceId() {
		return serviceId;
	}
	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}

	/**
	 * (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonnelServicePk other = (PersonnelServicePk) obj;
		if (personnelId != other.personnelId)
			return false;
		if (serviceId != other.serviceId)
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		return ((personnelId == null) ? 0 : personnelId.hashCode())
				^ ((serviceId == null) ? 0 : serviceId.hashCode());
	}
	
}
