package com.hexaware.vis.entities;

public class Document {
    private Long documentId;
    private Proposal proposal;
    private String documentPath;
    private String documentType;

    public Document() {}

    public Document(Long documentId, Proposal proposal, String documentPath, String documentType) {
        this.documentId = documentId;
        this.proposal = proposal;
        this.documentPath = documentPath;
        this.documentType = documentType;
    }

    public Long getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Long documentId) {
        this.documentId = documentId;
    }

    public Proposal getProposal() {
        return proposal;
    }

    public void setProposal(Proposal proposal) {
        this.proposal = proposal;
    }

    public String getDocumentPath() {
        return documentPath;
    }

    public void setDocumentPath(String documentPath) {
        this.documentPath = documentPath;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }
}
