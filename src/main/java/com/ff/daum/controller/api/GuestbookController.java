package com.ff.daum.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ff.daum.service.GuestbookService;
import com.ff.daum.vo.GuestbookVo;

@Controller
@RequestMapping("/guestbook")
public class GuestbookController {
	
	@Autowired
	private GuestbookService guestbookService;
	
	@RequestMapping("/write")
	public void write(@ModelAttribute GuestbookVo vo) {
		System.out.println(vo);
		guestbookService.write(vo);
	}

}
