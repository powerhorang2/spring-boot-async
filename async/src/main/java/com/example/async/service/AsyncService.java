package com.example.async.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class AsyncService {

	@Async
	public void hello() {
		
		for(int i = 0; i < 10; i ++) {
			try {
				Thread.sleep(2000);
				log.info("thread sleep...");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
