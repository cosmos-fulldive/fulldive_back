package com.fulldive.back.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@Data
public class PayHistoryEntity {
	private String paymentId;
	private String paymentSendId;
	private String paymentReceptionId;
	private String paymentPrice;
	private String paymentContent;
	private Timestamp paymentTimestamp;
	private Timestamp createTimestamp;
}
