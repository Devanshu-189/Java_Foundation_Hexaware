package com.hexaware.vis.entities;

public class PremiumReminder {
    private int reminderId;
    private int policyId;
    private String reminderDate;

    public PremiumReminder() {}

    public PremiumReminder(int reminderId, int policyId, String reminderDate) {
        this.reminderId = reminderId;
        this.policyId = policyId;
        this.reminderDate = reminderDate;
    }

	public int getReminderId() {
		return reminderId;
	}

	public void setReminderId(int reminderId) {
		this.reminderId = reminderId;
	}

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public String getReminderDate() {
		return reminderDate;
	}

	public void setReminderDate(String reminderDate) {
		this.reminderDate = reminderDate;
	}

    @Override
    public String toString() {
        return "PremiumReminder{" + "reminderId=" + reminderId + ", policyId=" + policyId + '}';
    }
}
