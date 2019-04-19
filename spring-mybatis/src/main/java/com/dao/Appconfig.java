package com.dao;

import javax.activation.DataSource;

@Configuration
@MapperScan("com.dao")
@ComponentScan("com")
public class Appconfig {

    @Bean
    @Autowired
    public SqlSessionFactoryBean sqlSessionFactoryBean (DataSource dataSource){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }

    @Bean
    public DataSource dateSource (){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        driverManagerDataSource.setPassword("root3306");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/mysqltest?serverTimezone=GMT");
        return driverManagerDataSource;
    }
}