package com.dubbo.xp;

import org.springframework.stereotype.Service;

@Service
public class DubboRemoteServiceImpl implements IDubboRemoteService {

	@Override
	public void sayHi(String name) {
		System.out.println("Hello " + name);
	}

}
