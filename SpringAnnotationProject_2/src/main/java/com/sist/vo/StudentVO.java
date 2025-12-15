package com.sist.vo;
/*
 * 		vo => mapper(SQL) => DAO => Service => MainClass 호출
 * 		----------------------------------------------------
 * 		| 클래스 관계도 : application-*.xml
 * 					  ----------------- 자바
 * */
import lombok.Data;

@Data
public class StudentVO {
	private int hakbun,kor,eng,math;
	private String name;
}
