package project;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import project.member.Grade;
import project.member.Member;
import project.member.MemberService;
import project.member.MemberServiceImpl;
import project.order.Order;
import project.order.OrderService;
import project.order.OrderServiceImpl;

@SpringBootApplication
public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();
        
        long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);
        
        Order order = orderService.createOrder(memberId, "itemA", 10000);
        
        System.out.println("order = " + order);
        System.out.println("order.calculaterPrice() = " + order.calculaterPrice());
    }
}