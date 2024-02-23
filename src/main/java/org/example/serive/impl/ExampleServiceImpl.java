package org.example.serive.impl;

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
public class ExampleServiceImpl implements ExampleService {
	@Override
	public String test() {
		return "Hello BaoZi";
	}
}
