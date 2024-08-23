package xyz.itwill05.lombok;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDAO memberDAO;
	
	public MemberServiceImpl() {
		log.info("### MemberServiceImpl 클래스의 기본 생성자 호출 ###");
	}
	
	@Override
	public void addMember(Member member) {
		log.info("*** MemberDAOImpl 클래스의 addMember(Member member) 메소드 호출 ***");
		memberDAO.insertMember(member);
	}

	@Override
	public void modifyMember(Member member) {
		log.info("*** MemberDAOImpl 클래스의 modifyMember(Member member) 메소드 호출 ***");
		memberDAO.updateMember(member);
	}

	@Override
	public void removeMember(String id) {
		log.info("*** MemberDAOImpl 클래스의 removeMember(String id) 메소드 호출 ***");
		memberDAO.deleteMember(id);
	}

	@Override
	public Member getMember(String id) {
		log.info("*** MemberDAOImpl 클래스의 getMember(String id) 메소드 호출 ***");
		return memberDAO.selectMember(id);
	}

	@Override
	public List<Member> getMemberList() {
		log.info("*** MemberDAOImpl 클래스의 getMemberList() 메소드 호출 ***");
		return memberDAO.selectMemberList();
	}

}
