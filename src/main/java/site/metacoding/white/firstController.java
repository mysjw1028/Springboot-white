package site.metacoding.white;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstController {

	@GetMapping("/first")
	public String getData() {
		return "<h1>get data</h1>";
	}
	@PostMapping("/first")
	public String postData() {
		return "<h1>post data</h1>";
	}
	@PutMapping("/first")
	public String putData() {
		return "<h1>put data</h1>";
	}
	@DeleteMapping("/first")
	public String deleteData() {
		return "<h1>delete data</h1>";
	}
}
