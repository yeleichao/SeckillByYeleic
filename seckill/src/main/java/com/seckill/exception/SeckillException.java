package com.seckill.exception;

/**
 * 秒杀相关业务异常
 * 2017年4月13日09:17:52
 * @author yeleichao
 *
 */
public class SeckillException extends RuntimeException{

	public SeckillException(String message, Throwable cause) {
		super(message, cause);
	}

	public SeckillException(String message) {
		super(message);
	}

	
}
