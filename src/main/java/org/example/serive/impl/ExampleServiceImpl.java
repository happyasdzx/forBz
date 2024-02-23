package org.example.serive.impl;

import lombok.extern.slf4j.Slf4j;
import org.example.annotion.WebLog;
import org.example.serive.ExampleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *
 * </p>
 *
 * @author zeqiang.sheng
 * @since 2024/2/23
 */
@Service
@Slf4j
public class ExampleServiceImpl implements ExampleService {
	@Override
	@WebLog
	public String test() {
		log.error("hello");
		return "Hello BaoZi";
	}

	@Override
	public String error() {
		throw new RuntimeException("自定义异常");
	}
}
