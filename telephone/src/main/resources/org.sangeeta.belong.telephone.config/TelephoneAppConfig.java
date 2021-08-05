package org.sangeeta.belong.telephone.config;
public class TelephoneAppConfig extends ResourceConfig {
    public TelephoneAppConfig() {
        register(new org.glassfish.hk2.utilities.binding.AbstractBinder() {

            @Override
            protected void configure() {
                bind(CustomerDAOImpl.class).to(CustomerDAO.class).in(Singleton.class);
                bind(CustomerServiceImpl.class).to(CustomerService.class).in(Singleton.class);                
            }
        });
        
        packages("org.sangeeta.belong.telephone");
    }
}