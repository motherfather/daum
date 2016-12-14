package com.ff.daum.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ff.daum.repository.GuestbookDao;
import com.ff.daum.vo.GuestbookVo;

@Service
public class GuestbookService {
	
	@Autowired
	private GuestbookDao guestbookDao;
	
	public void write(GuestbookVo vo) {
		guestbookDao.write(vo);
	}

}
