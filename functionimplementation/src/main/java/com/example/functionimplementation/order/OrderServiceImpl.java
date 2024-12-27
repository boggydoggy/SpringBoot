package com.example.functionimplementation.order;

import com.example.functionimplementation.discount.DiscountPolicy;
import com.example.functionimplementation.discount.FixedDiscountPolicy;
import com.example.functionimplementation.member.Member;
import com.example.functionimplementation.member.MemberRepository;
import com.example.functionimplementation.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {
    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixedDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
