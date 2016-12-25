package com.ff.daum.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ff.daum.service.GuestbookService;
import com.ff.daum.vo.GuestbookVo;
import com.ff.dto.JSON;

@Controller
@RequestMapping("/guestbook")
public class GuestbookController {
	
	@Autowired
	private GuestbookService guestbookService;

	@ResponseBody
	@RequestMapping("")
	public JSON list() {
		List<GuestbookVo> list =guestbookService.list();
		return JSON.success(list);
	}
	
	@ResponseBody
	@RequestMapping("/write")
	public JSON write(@ModelAttribute GuestbookVo vo) {
		GuestbookVo vo2 = guestbookService.write(vo);
		return JSON.success(vo2);
	}

}
