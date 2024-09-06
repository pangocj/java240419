package xyz.itwill09.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
@RequestMapping("/file")
public class FileController {
	@RequestMapping(value = "/upload1", method = RequestMethod.GET)
	public String uploadOne() {
		return "file/form_one";
	}
	
	//요청 처리 메소드의 매개변수를 MultipartHttpServletRequest 인터페이스로 작성하면 Front
	//Controller로부터 MultipartHttpServletRequest 객체를 제공받아 사용
	// => MultipartHttpServletRequest 객체 : [multipart/form-data] 형식으로 전달된 값 또는
	//파일을 처리하기 위한 객체
	@RequestMapping(value = "/upload1", method = RequestMethod.POST)
	public String uploadOne(MultipartHttpServletRequest request) throws IOException {
		String uploaderName=request.getParameter("uploaderName");
		
		//MultipartHttpServletRequest.getFile(String name) : 전달파일의 정보가 저장된
		//MultipartFile 객체를 반환하는 메소드 
		MultipartFile uploaderFile=request.getFile("uploaderFile");
		
		//MultipartFile 객체에 저장된 전달파일에 대한 검증
		//MultipartFile.isEmpty() : MultipartFile 객체에 파일정보가 저장되어 있는 경우 [false]를
		//반환하고 파일정보가 저장되어 있지 않은 경우 [true]를 반환하는 메소드
		if(uploaderFile.isEmpty()) {
			return "file/upload_fail";
		}
		
		//MultipartFile.getContentType() : MultipartFile 객체에 저장된 전달파일의 형태(MimeType)를
		//반환하는 메소드
		System.out.println("파일 형태(MimeType) = "+uploaderFile.getContentType());
		//MultipartFile.getBytes() : MultipartFile 객체에 저장된 전달파일의 내용을 byte 배열로
		//반환하는 메소드
		System.out.println("파일 크기(Byte) = "+uploaderFile.getBytes().length);
		
		//전달파일이 저장될 서버 디렉토리(폴더)의 시스템 경로를 반환받아 저장
		String uploadDirectory=request.getServletContext().getRealPath("/resources/images/upload");
		System.out.println("uploadDirectory = "+uploadDirectory);
		
		//MultipartFile.getOriginalFilename() : MultipartFile 객체에 저장된 전달파일의 이름을
		//반환하는 메소드 - 원본 파일명
		String uploadFilename=uploaderFile.getOriginalFilename(); 

		//서버 디렉토리에 저장될 파일에 대한 정보가 저장된 File 객체 생성 - 업로드 처리될 파일 설정
		File file=new File(uploadDirectory, uploadFilename);
		
		//MultipartFile.transferTo(File file) : MultipartFile 객체에 저장된 전달파일을 File 객체에
		//저장된 파일로 저장되도록 업로드 처리하는 메소드		
		uploaderFile.transferTo(file);
		
		request.setAttribute("uploaderName", uploaderName);
		request.setAttribute("uploadFilename", uploadFilename);
		
		return "file/upload_success_one";
	}
}













