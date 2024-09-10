package xyz.itwill09.service;

import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import xyz.itwill09.dao.UserinfoDAO;
import xyz.itwill09.dto.Userinfo;
import xyz.itwill09.exception.ExistsUserinfoException;

//사용자로부터 입력받아 전달된 문자열(비밀번호)을 암호화 처리하는 방법
//1.jbcrypt 라이브러리를 프로젝트에 빌드 처리 - 메이븐 : pom.xml
//2.BCrypt.hashpw(String password, String salt) 정적메소드를 호출하여 문자열(비밀번호)를 암호화 처리 
// => 메소드의 매개변수에는 암호화 처리할 문자열과 첨가물의 문자열을 전달받아 암호화 처리
// => 첨가물에 의해 비밀번호가 다르게 암호화 처리
// => BCrypt.gensalt(int log_bounds) : 매개변수에 첨가물의 길이를 전달받아 첨가물을 생성하여
//반환하는 정적메소드 - 매개변수에 값을 전달하지 않으면 기본값으로 [10]으로 설정
//3.BCrypt.checkpw(String plainText, String hashed) 정적메소드를 호출하여 일반 문자열과 암호화
//처리된 문자열을 비교하여 다른 경우 [false]를 반환하고 같은 경우 [true]를 반환받아 처리

@Service
@RequiredArgsConstructor
public class UserinfoServiceImpl implements UserinfoService {
	private final UserinfoDAO userinfoDAO;
	
	@Override
	public void addUserinfo(Userinfo userinfo) {
		if(userinfoDAO.selectUserinfo(userinfo.getUserid()) != null) {
			//예외를 명확히 구분하여 예외 처리시 사용하기 위해 예외클래스를 작성해 예외 발생
			throw new ExistsUserinfoException("이미 사용중인 아이디를 입력 하였습니다.", userinfo);
		}
		
		//매개변수로 전달받은 회원정보의 비밀번호를 암호화 처리하여 필드값 변경
		String hashedPassword=BCrypt.hashpw(userinfo.getPassword(), BCrypt.gensalt());
		userinfo.setPassword(hashedPassword);
		
		userinfoDAO.insertUserinfo(userinfo);	
	}

	@Override
	public void modifyUserinfo(Userinfo userinfo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeUserinfo(String userid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Userinfo getUserinfo(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Userinfo> getUserinfoList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Userinfo loginAuth(Userinfo userinfo) {
		// TODO Auto-generated method stub
		return null;
	}

}
