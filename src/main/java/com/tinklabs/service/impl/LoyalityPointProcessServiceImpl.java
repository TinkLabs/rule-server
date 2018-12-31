package com.tinklabs.service.impl;

import com.tinklabs.dto.LoyalityPointsTransaction;
import com.tinklabs.dto.Member;
import com.tinklabs.dto.Order;
import com.tinklabs.service.LoyalityPointCalculatorService;
import com.tinklabs.service.LoyalityPointProcessService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: ruleserver
 * @description:
 * @author: Landin
 * @create: 2018-12-30 23:22
 **/
@Slf4j
@Service
public class LoyalityPointProcessServiceImpl implements LoyalityPointProcessService {



//    @Autowired
//    CustomerDAO customerDAO;
//    @Autowired
//    CustomerRegisterService customerRegisterService;
      @Autowired
      private LoyalityPointCalculatorService loyalityPointCalculatorService;
//    @Autowired
//    LoyalityPointsTransactionDAO loyalityPointsTransactionDAO;
    @Override
    public void process(Member member, Order order) {
        if (log.isDebugEnabled()) {
            log.debug("Loyality point calculation started for customer: " + (member != null ? member.getMemberId() : null) + " For order " + (order != null ? order.getOrderId() : null));
        }

        if (member != null && order != null) {
            LoyalityPointsTransaction loyalityPointsTransaction = new LoyalityPointsTransaction();
            loyalityPointsTransaction.setAmount(order.getOrderAmount());
            loyalityPointsTransaction.setLoyalityCardId(member.getMemberId());
            loyalityPointsTransaction.setTransactionDatetime(order.getOrderDate());
            loyalityPointsTransaction.setTransactionId(order.getOrderId());

            long pointEarned = loyalityPointCalculatorService.calculate(member, order);
            loyalityPointsTransaction.setPointsEarned(pointEarned);

           // loyalityPointsTransactionDAO.save(loyalityPointsTransaction);
            //call csp transaction service.
            //int updatedLoyalityPoints = customer.getLoyalityPoints() + pointEarned;

            //call csp member service
//            upgradeCustomerClass(customer);
//            customer.setLoyalityPoints(updatedLoyalityPoints);
//            customerDAO.update(customer);

            log.debug("Loyality point calculation Completed for member: " + member.getMemberId() + " For order " + order.getOrderId());
        }

    }

//    public void upgradeMemberTier(Member member){
//        long totalSpending = customer.getTotalSpending();
//
//        if(totalSpending>50000) {
//            customer.setCustomerClass(CustomerClass.GOLD);
//        } else if(totalSpending>25000 && totalSpending<50000) {
//            customer.setCustomerClass(CustomerClass.SILVER);
//        } else {
//            customer.setCustomerClass(CustomerClass.Normal);
//        }
//
//        log.info("CustomerId: "+customer.getLoyalityCardId()+" Class is set to: "+customer.getCustomerClass().getValue());
//    }
}
