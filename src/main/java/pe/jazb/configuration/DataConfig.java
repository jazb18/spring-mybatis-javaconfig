package pe.jazb.configuration;

import javax.naming.NamingException;
import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jndi.JndiTemplate;

@Configuration
@MapperScan("pe.jazb.dao")

public class DataConfig {

	@Bean
	public DataSource dataSource() throws NamingException {
		JndiTemplate jndiTemplate = new JndiTemplate();
		DataSource datasource = (DataSource) jndiTemplate.lookup("java:jboss/datasource/jdbc/mysqlDS");
		return datasource;
	}

	@Bean
	public DataSourceTransactionManager dataSourceTransactionManager() throws NamingException {
		return new DataSourceTransactionManager(dataSource());
	}

	@Bean
	public SqlSessionFactoryBean sqlSessionFactory(ApplicationContext ap) throws Exception {
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setTypeAliasesPackage("pe.jazb.domain");
		return sessionFactory;
	}
}
