package com.example.functionimplementation;

import com.example.functionimplementation.member.Grade;
import com.example.functionimplementation.member.Member;
import com.example.functionimplementation.member.MemberService;
import com.example.functionimplementation.member.MemberServiceImpl;
import com.example.functionimplementation.order.Order;
import com.example.functionimplementation.order.OrderService;
import com.example.functionimplementation.order.OrderServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FunctionImplementationApplication {

	public static void main(String[] args) {
//		SpringApplication.run(FunctionImplementationApplication.class, args);
		MemberService memberService = new MemberServiceImpl();
		OrderService orderService = new OrderServiceImpl();
		long memberId = 1L;
		Member member = new Member(memberId, "test", Grade.VIP);
		memberService.join(member);
		Order order = orderService.createOrder(memberId, "USB", 24900);
		System.out.println(order);
	}

}
