package com.seckill.exception;

/**
 * 重复秒杀异常（运行期异常）
 * 2017年4月13日09:12:26
 * @author yeleichao
 *
 */
public class RepeatKillException extends SeckillException{

	public RepeatKillException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public RepeatKillException(String message) {
		super(message);
		
	}

	
}
