package site.metacoding.white.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter//얘가 없으면 json으로 컴버팅이 안된다
@AllArgsConstructor
public class RespDto<T> {
	private Integer code;//-1 실패, 1 성공
	private String msg; // 통신결과를 메시지로 담기
	private T body;//제네릭 T를 넣어서 해결해야한다
}
