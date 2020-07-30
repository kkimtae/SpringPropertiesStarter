package me.ht;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

// Properties 파일에서 holoman으로 시작하는 properties를 읽어들여 변수명에 맍는 값을 대입
@ConfigurationProperties("holoman")
@Getter
@Setter
public class HolomanProperties {
	String name;
	int howLong;
}
