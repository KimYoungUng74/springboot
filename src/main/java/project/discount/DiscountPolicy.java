package project.discount;

import project.member.Member;

public interface DiscountPolicy {
    /**
    * @retrun 할인 대상 금액
    */
    int discount(Member member, int price);
    
}
