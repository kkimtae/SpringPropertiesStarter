package me.ht;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

// Properties ���Ͽ��� holoman���� �����ϴ� properties�� �о�鿩 ������ ���� ���� ����
@ConfigurationProperties("holoman")
@Getter
@Setter
public class HolomanProperties {
	String name;
	int howLong;
}
