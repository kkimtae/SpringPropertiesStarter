package me.ht;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// 롬복을 이용한 소스경량화
// 그러나 자동생성이 되므로 lombok을 설치해줘야하고, 또 AOP 이슈가 있어서
// 특정 조건에서는 에러가 발생할 수 있으므로 잘사용하여야함.
@Getter
@Setter
@ToString
public class Holoman {
	String name;
	int howLong;
}
