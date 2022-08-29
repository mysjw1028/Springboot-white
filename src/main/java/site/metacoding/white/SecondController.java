package site.metacoding.white;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

//데이터 받기
// Get - >  http body가 없음 ->QueryString -> Form(GET)-> 브라우저 (주소 뒤 ? 붙이기)
//Post, put -> http body 담아준다. ->Form (Post)
//Delete -> http body가 없음 -> QueryString. PathVariable(PK)

@RestController // 메모리 띄우기
public class SecondController {
	@GetMapping("/second/{id}") // PK(id)가 1인것
	public String getData(@PathVariable Integer id) {
		return "id : " + id;
	}

	// Query String = x-www-form머시기 타입/무슨 요청을 해도 다 보낼수 있다

	@GetMapping("/second")
	public String getData2(String title, String content) {
		return "title : " + title + ",content" + content;
	}

	// BR -> title ->제목&content=내용,x-www머시기 (content-type)
	@PostMapping("/second") // body에 담아서 보냄
	public String postData(String title, String content) {// 스프링 파싱 기본전략 : x-www-form-머시기
		return "title : " + title + ",content" + content;
	}

	@PutMapping("/second")
	public String putData(String title, String content) {// 스프링 파싱 기본전략 : x-www-form-머시기 - >이형식으로 보내야함 
		return "title : " + title + ",content" + content;
	}

	@DeleteMapping("/second")
	public String deleteData(@PathVariable Integer id) {// 스프링 파싱 기본전략 : x-www-form-머시기
		return id+"delet ok";
	}
}
