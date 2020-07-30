package me.ht;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Configutre Bean으로 등록
@EnableConfigurationProperties(HolomanProperties.class) // holomanProperties 를 활용하여 Properties에 설정된 값들을 읽은 뒤 Bean의 초기값으로
														// 설정
public class HolomanConfiguration {

	@Bean
	@ConditionalOnMissingBean // Conmponent Scan 단계에서 해당 Bean이 없으면 Cnofigure 단계에서 해당 Bean을 아래와 같이 초기화하여 등록한다.
	public Holoman holoman(HolomanProperties properties) {
		// 인자로 받는 Properties를 사용하기 위해서는 EnableConfigurationProperties 어노테이션을 활용하여야함.
		Holoman holoman = new Holoman();
		holoman.setHowLong(properties.getHowLong()); // 프로퍼티 파일에 설정된 값을 읽어들여 셋팅함.
		holoman.setName(properties.getName());
		return holoman;
	}
}
