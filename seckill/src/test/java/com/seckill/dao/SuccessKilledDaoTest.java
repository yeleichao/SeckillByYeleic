package com.seckill.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * 配置spring和junit整合，junit启动时加载springIOC容器
 * spring-test,junit
 * @author yeleichao
 *
 */

import com.seckill.entity.Seckill;
import com.seckill.entity.SuccessKilled;

@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccessKilledDaoTest {

	//注入Dao实现类依赖
	@Autowired
	private SuccessKilledDao successKilledDao;
	
	@Test
	public void testInsertSuccessKilled(){
		long id = 1000L;
		long phone = 13502181181L;
		int insertCount = successKilledDao.insertSuccessKilled(id, phone);
		System.out.println("insertCount="+insertCount);
		
	}
	
	@Test
	public void testQueryByIdWithSeckill(){
		long id = 1000L;
		long phone = 13502181181L;
		SuccessKilled successKilled = successKilledDao.queryByIdWithSeckill(id,phone);
		System.out.println(successKilled);
	}
}









