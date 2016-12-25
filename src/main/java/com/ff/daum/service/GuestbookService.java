package com.ff.daum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ff.daum.repository.GuestbookDao;
import com.ff.daum.vo.GuestbookVo;

@Service
public class GuestbookService {
	
	@Autowired
	private GuestbookDao guestbookDao;
	
	public GuestbookVo write(GuestbookVo vo) {
		Long no = guestbookDao.write(vo);
		return guestbookDao.get(no);
	}
	
	public List<GuestbookVo> list() {
		return guestbookDao.list();
	}

}
