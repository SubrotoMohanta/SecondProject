package com.project.RestSpring.config;

import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
//import org.springframework.core.env.Environment;
import org.hibernate.cfg.Environment;

/**
 * @author yuva
 * @date 11-02-2016
 * @description used for test
 * @version 1.0
 * 
 */

@Configuration
@EnableTransactionManagement
public class PersistConfig {

	@Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/ABIINFOMATION");
        dataSource.setUsername("yuva");
        dataSource.setPassword("yuva");
        return dataSource;
    }  
	
	 private Properties getHibernateProperties() {
	        Properties properties = new Properties();
	        properties.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
	        properties.put("hibernate.show_sql", true);
	        properties.put("hibernate.hbm2ddl.auto","update");
	        properties.put("hibernate.format_sql",true);
	        return properties;        
	    }
	 @Bean
	    public LocalSessionFactoryBean sessionFactory() {
	        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
	        sessionFactory.setDataSource(getDataSource());
	        sessionFactory.setPackagesToScan(new String[] { "com.project.RestSpring.datamodel" });
	        sessionFactory.setHibernateProperties(getHibernateProperties());
	        return sessionFactory;
	     }
	
	@Bean
    public HibernateTemplate getHibernateTemplate(SessionFactory sessionFactory) throws IOException
    {
        HibernateTemplate htemp = new HibernateTemplate(sessionFactory);
      /*  htemp.setCheckWriteOperations(false);
        htemp.setSessionFactory(sessionFactory());*/
       
        return htemp;
    }
	
	
	@Bean
	   public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
	       HibernateTransactionManager txManager = new HibernateTransactionManager(sessionFactory);
	       return txManager;
	   }
   /* @Value("${hibernate.dialect}")
    private String dialect;
    @Value("${hibernate.hbm2ddl.auto}")
    private String hbm2ddlAuto;
    @Value("${hibernate.ejb.naming_strategy}")
    private String hibernateNamingStrategy;
    @Value("${hibernate.ejb.connectionReleaseStrategy}")
    private String connectionReleaseStrategy;
    @Value("${hibernate.show_sql}")
    private String showSql;
    @Value("${hibernate.format_sql}")
    private String formatSql;
    @Value("${dataSource.modm}")
    private String dataSourceMtdm;
    @Value("${dataSource.oltpPrefix}")
    private String dataSourcePrefix;
    @Value("${dataSource.oltpAnyDataSource}")
    private String oltpAnyDataSource;

    @Bean(name ="jpaEntityManager")
    public LocalContainerEntityManagerFactoryBean configureEntityManagerFactory() {
	LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
	// entityManagerFactoryBean.setPackagesToScan (
	// "com.abi.claimBook.dm.oltp" );
	entityManagerFactoryBean.setPackagesToScan("com.abi.claimbook.dm.oltp");
	entityManagerFactoryBean.setPersistenceProviderClass(HibernatePersistenceProvider.class);

	Properties jpaProterties = new Properties();
	jpaProterties.put(Environment.DIALECT, dialect);
	jpaProterties.put(Environment.FORMAT_SQL, formatSql);
	jpaProterties.put(Environment.GENERATE_STATISTICS, true);
	jpaProterties.put("hibernate.ejb.naming_strategy", hibernateNamingStrategy);
	jpaProterties.put(Environment.SHOW_SQL, showSql);
	jpaProterties.put(Environment.FORMAT_SQL, formatSql);
	jpaProterties.put(Environment.RELEASE_CONNECTIONS, connectionReleaseStrategy);
	jpaProterties.put(Environment.DIALECT, dialect);
	// jpaProterties.put(Environment.HBM2DDL_AUTO, hbm2ddlAuto);
	jpaProterties.put(Environment.MULTI_TENANT, "DATABASE");
	jpaProterties.put(Environment.AUTOCOMMIT, "COMMIT");
	jpaProterties.put(Environment.MULTI_TENANT_CONNECTION_PROVIDER,
		"org.hibernate.engine.jdbc.connections.spi.DataSourceBasedMultiTenantConnectionProviderImpl");
	jpaProterties.put(Environment.DATASOURCE, dataSourcePrefix);
	jpaProterties.put("hibernate.multi_tenant.datasource.identifier_for_any", oltpAnyDataSource);
	entityManagerFactoryBean.setJpaProperties(jpaProterties);

	return entityManagerFactoryBean;
	
    }
    
    @Bean(name = "jpaTransactionManager")
    public PlatformTransactionManager annotationDrivenTransactionManager() {
	JpaTransactionManager oltpTransactionManager = new JpaTransactionManager();
	oltpTransactionManager.setEntityManagerFactory(configureEntityManagerFactory().getObject());
	return oltpTransactionManager;
    }*/
    
}
