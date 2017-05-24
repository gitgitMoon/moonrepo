package org.bisun.controller;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.bisun.persistence.QnaDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class QnaTest {
	
	private Logger logger = Logger.getLogger(QnaTest.class);
	
	@Inject
	QnaDAO dao;
	
	@Test
	public void timeTest(){
		logger.info("------------------------");
		logger.info(dao.getTime());
		logger.info("------------------------");
		
	}

}
