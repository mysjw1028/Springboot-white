package site.metacoding.white;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import site.metacoding.white.domain.Third;

//고급데이터 받기 (json,x-www-form-머시기,text)

@RestController
public class ThirdController {

	@GetMapping("/third/{id}")
	public String getData(@PathVariable Integer id) {
		return "id : " + id;
	}

	@PostMapping("/third")
	public String postData(Third third) {
		return "id : " + third.getId() + ",title :" + third.getTitle() + ",content :" + third.getContent();// requestdto 트랜스 오브젝트																								
	}

	// UPDATE third SET title = ? ,content = ? WHERE id =? 프로토콜이라서 지켜야한다
	@PutMapping("/third/{id}")
	public String putData(@PathVariable Integer id, Third third) {// where절에 걸리는거는 주소로 보내야한다. @PathVariable가 프라이머리키라서								
		return third.toString();// 쿼리스트링은 검색할때 씀
	}

	@PutMapping("/third/{id}/json")
	public String putJsonData(@PathVariable Integer id,@RequestBody Third third) {
		return third.toString()+"주소로 받은거"+id;//@RequestBody 클래스값을 넣을때 json을 넣겠다 하는거
	}
}
