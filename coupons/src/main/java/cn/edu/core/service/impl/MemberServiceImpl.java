package cn.edu.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.core.bean.Member;
import cn.edu.core.dao.MemberDao;
import cn.edu.core.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberDao memberDao;
	
	/**
	 * 获取会员信息
	 */
	@Override
	public Member getMemberInfo(String userId) {
		// TODO Auto-generated method stub
		return memberDao.getMemberInfo(userId);
	}

}
