package xyz.itwill.boot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import xyz.itwill.boot.dto.BoardDTO;
import xyz.itwill.boot.entity.BoardEntity;
import xyz.itwill.boot.repository.BoardRepository;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
	private final BoardRepository boardRepository;
	
	@Override
	public void addBoard(BoardDTO boardDTO) {
		//DTO 객체를 Entity 객체로 변환하여 저장
		BoardEntity boardEntity=boardDTO.toBoardEntity();
		
		//JpaRepository.save(Entity entity) : 매개변수로 전달받은 Entity 객체로 테이블에 행을
		//삽입하여 저장하는 메소드
		boardRepository.save(boardEntity);
	}

	@Override
	public List<BoardDTO> getBoardList() {
		//JpaRepository.findAll() : 테이블에 저장된 모든 행을 검색하여 List 객체로 반환하는 메소드
		// => 하나의 행은 Entity 객체로 변환하여 List 객체의 요소값으로 저장 
		List<BoardEntity> boardEntityList=boardRepository.findAll();
		List<BoardDTO> boardDTOList=new ArrayList<BoardDTO>();
		for(BoardEntity entity : boardEntityList) {
			boardDTOList.add(entity.toBoardDTO());
		}
		return boardDTOList;
	}
}








