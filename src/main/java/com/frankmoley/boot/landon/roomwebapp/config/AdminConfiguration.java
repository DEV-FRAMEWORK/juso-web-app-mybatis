package com.frankmoley.boot.landon.roomwebapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

import com.frankmoley.boot.landon.roomwebapp.pension.dao.AdminDao;
//import com.ktds.dao.CodeDao;
//import com.ktds.dao.CompetitionDao;
//import com.ktds.dao.ContractDao;
//import com.ktds.dao.CustomerDao;
//import com.ktds.dao.MonitorDao;
//import com.ktds.dao.ServiceApplyDao;
//import com.ktds.dao.UtilDao;
//import com.ktds.dao.impl.AdminDaoImpl;
//import com.ktds.dao.impl.CodeDaoImpl;
//import com.ktds.dao.impl.CompetitionDaoImpl;
//import com.ktds.dao.impl.ContractDaoImpl;
//import com.ktds.dao.impl.CustomerDaoImpl;
//import com.ktds.dao.impl.MonitorDaoImpl;
//import com.ktds.dao.impl.ServiceApplyDaoImpl;
//import com.ktds.dao.impl.UtilDaoImpl; 
import com.frankmoley.boot.landon.roomwebapp.pension.dao.impl.AdminDaoImpl;

@Configuration
public class AdminConfiguration {
  
//  @Bean
//  public TilesConfigurer tilesConfigurer() {
//	  final TilesConfigurer configurer = new TilesConfigurer();
//	  configurer.setDefinitions(new String[] {"WEB-INF/tiles/tiles.xml"});
//	  configurer.setCheckRefresh(true);
//	  return configurer;
//  }
//  
//  @Bean
//  public TilesViewResolver tilesViewResolver() {
//	  final TilesViewResolver resolver = new TilesViewResolver();
//	  resolver.setViewClass(TilesView.class);
//	  return resolver;
//  }
  
//  @Bean
//  public UtilDao utilDao() {
//	return new UtilDaoImpl(); 
//  }
//  
//  @Bean
//  public CodeDao codeDao() {
//	return new CodeDaoImpl(); 
//  }
  
  @Bean
  public AdminDao adminDao() {
	return new AdminDaoImpl();
  }
  
//  @Bean
//  public CustomerDao customerDao() {
//	return new CustomerDaoImpl();
//  }
//  
//  @Bean
//  public ContractDao contractDao() {
//	return new ContractDaoImpl();
//  }
//  
//  @Bean
//  public CompetitionDao competitionDao() {
//	return new CompetitionDaoImpl();
//  }
//  
//  @Bean
//  public ServiceApplyDao serviceApplyDao() {
//	return new ServiceApplyDaoImpl();
//  }
//  
//  @Bean
//  public MonitorDao monitorDao() {
//	return new MonitorDaoImpl();
//  }

}