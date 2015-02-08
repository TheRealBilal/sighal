package applimedical.sighal.web.utils;

import javax.el.ELContext;
import javax.faces.FacesException;
import javax.faces.context.FacesContext;

public class ManagedBan {
    /**
     * Returns managed bean by the given name. The bean must be registered either per faces-config.xml or annotation.
     *
     * @param beanName managed bean name
     * @return Object managed bean instance
     * @throws FacesException if the managed bean can be not accessed
     */
    public static Object getManagedBean(final String beanName) {
        FacesContext fc = FacesContext.getCurrentInstance();

        Object bean;
        try {
            ELContext elContext = fc.getELContext();
            bean = elContext.getELResolver().getValue(elContext, null, beanName);
        } catch (RuntimeException e) {
            throw new FacesException(e.getMessage(), e);
        }

        if (bean == null) {
            throw new FacesException("Managed bean with name '" + beanName + "' was not found. Check your faces-config.xml or @ManagedBean annotation.");
            
        }

        return bean;
    }

}
