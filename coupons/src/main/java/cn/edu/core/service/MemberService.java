package cn.edu.core.service;

import org.springframework.stereotype.Service;

import cn.edu.core.bean.Member;
@Service
public interface MemberService {

	/**
	 * 获取会员信息
	 * @param userId
	 * @return
	 */
	Member getMemberInfo(String userId);

}
