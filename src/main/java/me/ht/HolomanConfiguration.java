package me.ht;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Configutre Bean���� ���
@EnableConfigurationProperties(HolomanProperties.class) // holomanProperties �� Ȱ���Ͽ� Properties�� ������ ������ ���� �� Bean�� �ʱⰪ����
														// ����
public class HolomanConfiguration {

	@Bean
	@ConditionalOnMissingBean // Conmponent Scan �ܰ迡�� �ش� Bean�� ������ Cnofigure �ܰ迡�� �ش� Bean�� �Ʒ��� ���� �ʱ�ȭ�Ͽ� ����Ѵ�.
	public Holoman holoman(HolomanProperties properties) {
		// ���ڷ� �޴� Properties�� ����ϱ� ���ؼ��� EnableConfigurationProperties ������̼��� Ȱ���Ͽ�����.
		Holoman holoman = new Holoman();
		holoman.setHowLong(properties.getHowLong()); // ������Ƽ ���Ͽ� ������ ���� �о�鿩 ������.
		holoman.setName(properties.getName());
		return holoman;
	}
}
