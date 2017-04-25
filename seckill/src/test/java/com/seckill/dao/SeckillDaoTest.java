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

@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SeckillDaoTest {

	//注入Dao实现类依赖
	@Autowired
	private SeckillDao seckillDao;
	
	@Test
	public void testQueryById(){
		long id = 1000;
		Seckill seckill = seckillDao.queryById(id);
		System.out.println(seckill.getName());
		System.out.println(seckill);
	}
	
	@Test
	public void testQueryAll(){
		List<Seckill> seckill = seckillDao.queryAll(0, 100);
		for(Seckill sec:seckill){
			System.out.println(sec);
		}
		
	}
}









