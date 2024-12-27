package com.example.functionimplementation.discount;

import com.example.functionimplementation.member.Member;

public interface DiscountPolicy {
    int discount(Member member, int price);
}
