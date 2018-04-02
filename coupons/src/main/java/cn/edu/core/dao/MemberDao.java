package cn.edu.core.dao;

import cn.edu.core.bean.Member;

public interface MemberDao {

	/**
	 * 获取会员信息
	 * @param userId
	 * @return
	 */
	Member getMemberInfo(String userId);

}
