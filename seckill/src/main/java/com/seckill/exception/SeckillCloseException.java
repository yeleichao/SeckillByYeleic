package com.seckill.exception;

/**
 * 秒杀关闭异常
 * 2017年4月13日09:15:39
 * @author yeleichao
 *
 */
public class SeckillCloseException extends SeckillException{

	public SeckillCloseException(String message, Throwable cause) {
		super(message, cause);
	}

	public SeckillCloseException(String message) {
		super(message);
	}

	
}
