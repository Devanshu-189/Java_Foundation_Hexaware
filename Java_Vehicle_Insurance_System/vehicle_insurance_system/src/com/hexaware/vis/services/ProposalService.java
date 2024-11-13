package com.hexaware.vis.services;

import java.util.List;

import com.hexaware.vis.entities.Proposal;

public interface ProposalService {

    Proposal submitProposal(Proposal proposal);

    Proposal getProposalById(Long proposalId);

    List<Proposal> getProposalsByUserId(Long userId);

    Proposal updateProposalStatus(Long proposalId, String status);
}

