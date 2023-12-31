package project.discount;

import project.member.Grade;
import project.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {
    
    private int discountFixAmount = 1000; // 1000원 할인
    
    /**
    * @retrun 할인 대상 금액
    */
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }
    }
    
}
