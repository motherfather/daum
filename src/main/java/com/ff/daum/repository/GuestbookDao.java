package com.ff.daum.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ff.daum.vo.GuestbookVo;

@Repository
public class GuestbookDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public Long write(GuestbookVo vo) {
		sqlSession.insert("guestbook.write", vo);
		return vo.getNo();
	}
	
	public GuestbookVo get(Long no) {
		return sqlSession.selectOne("guestbook.get", no);
	}
	
	public List<GuestbookVo> list() {
		return sqlSession.selectList("guestbook.list");
	}

}
