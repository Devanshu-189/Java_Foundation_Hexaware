package com.hexaware.vis.services;

import java.util.List;

import com.hexaware.vis.entities.Policy;

public interface PolicyService {
    
    Policy getPolicyById(Long policyId);

    List<Policy> getPoliciesByUserId(Long userId);

    Policy activatePolicy(Long policyId);

    Policy expirePolicy(Long policyId);
}

