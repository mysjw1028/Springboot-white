package site.metacoding.white;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import site.metacoding.white.domain.Four;
import site.metacoding.white.dto.RespDto;

@RestController
public class FourController {

	@GetMapping("/four")
	public Four getData() {
		Four four = new Four();
		four.setTitle("제목");
		four.setContent("내용");
		return four;
		//DS가 four 오브젝트를 리턴받고, 해당 오브젝트를 MessageConverter(getter를 때려서 접근)에게 전달 ->(파싱 전략이 json) mvc에서 자동으로 만들어줌
		//데이터를 리턴받고 싶으면 오브젝트로 받아서 
		//위 코드로하면 안된다, 
	}
	@GetMapping("/four/data")
	public ResponseEntity<Four> getData2() {//이쪽도 한번 더 정리하기 (와일드카드<?> 오브젝트상속하는무언가)
		Four four = new Four();
		four.setTitle("제목");
		four.setContent("내용");
		return new ResponseEntity<>(four, HttpStatus.CREATED);	//DS가 four 오브젝트를 리턴받고, 해당 오브젝트를 MessageConverter(getter를 때려서 접근)에게 전달
	}//바디의 값을 읽어서 판단을 하게되서 표준이 안생기게 된다.
	
	@GetMapping("/four/dto")
	public RespDto<Four> getData3() {
		Four four = new Four();
		four.setTitle("제목");
		four.setContent("내용");
		return new RespDto<>(1, "성공", four);//제네릭으로해서 들어감 응답할 바디가 없으면 null 구분할려면 코드가 필요하다 
		
	}
}
