package com.water.Mulbburi.order;


import java.util.Date;

import lombok.Data;

@Data
public class OrderDTO {

	/* 상품 가격 */
	private int sbNo;
	/* 상품 이름 */
	private String sbName;
	/* 상품 가격 */
	private int sbPrice;
	/* 회원 번호 */
	private long memberNo;
	/* 회원 이름 */
	private String memberName;
	/* 회원 이메일 */
	private String eamil;
	/* 회원 전화번호 */
	private String phone;
	/* 회원 상세주소 */
	private String dtAddress;
	/* 회원 기본주소 */
	private String bsAddress;
	/* 회원 우편번호 */
	private String orderPostCode;
	/* 주문 상태 */
	private String orderAbleStatus;
	/* 주문 날짜 */
	private Date orderDate;
	/* 주문 수량 */
	private int orderAmount;
	
	
}
