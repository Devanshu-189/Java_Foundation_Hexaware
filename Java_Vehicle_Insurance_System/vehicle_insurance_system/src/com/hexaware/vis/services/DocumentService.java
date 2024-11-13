package com.hexaware.vis.services;

import java.util.List;

import com.hexaware.vis.entities.Document;

public interface DocumentService {
    
    Document uploadDocument(Long proposalId, String documentPath, String documentType);

    Document getDocumentById(Long documentId);

    List<Document> getDocumentsByProposalId(Long proposalId);
}

