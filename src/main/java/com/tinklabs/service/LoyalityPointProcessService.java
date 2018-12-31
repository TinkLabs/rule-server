package com.tinklabs.service;

import com.tinklabs.dto.Member;
import com.tinklabs.dto.Order;

public interface LoyalityPointProcessService {
    public void process(Member member, Order order);
    //public void upgradeMemberTier(Member member);
}
