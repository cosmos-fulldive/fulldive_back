package com.fulldive.back.entity;

import lombok.*;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CometEntity {
//	@Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
	private String cometId;
	private String userId;
	private String cometUseState;
	private String cometPurchaseTimestamp;
    private String cometSalesTimestamp;
	private String paymentId;


	private String createTimestamp;
}

