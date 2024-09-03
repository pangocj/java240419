package xyz.itwill09.dto;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class Employee {
	//@NotNull : 전달값이 [null]인 경우 에러를 발생하는 어노테이션
	//@NotBlank : 전달값이 [null]이거나 전달값에 공백이 있는 경우 에러를 발생하는 어노테이션
	//@NotEmpty : 전달값이 [null]이거나 비어있는(NullString) 경우 에러를 발생하는 어노테이션
	//message 속성 : 뷰에게 제공될 에러메세지를 속성값으로 설정
	// => message 속성을 생략한 경우 기본적으로 제공되는 에러메세지를 뷰에게 전달하여 출력
	@NotEmpty(message = "아이디를 입력해 주세요.")
	private String id;
	@NotEmpty(message = "비밀번호를 입력해 주세요.")
	private String passwd;
	@NotEmpty(message = "이름을 입력해 주세요.")
	private String name;
	@NotEmpty(message = "이메일을 입력해 주세요.")
	private String email;
	@NotEmpty(message = "성별을 입력해 주세요.")
	private String gender;
}
