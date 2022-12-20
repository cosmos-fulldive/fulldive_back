package com.fulldive.back.service;

import java.util.Map;

public interface PaymentServiceImpl {

	int paymentInsert(Map<String, Object> params);
	int paymentUpdate(Map<String, Object> params);
	int paymentDelete(Map<String, Object> params);
}
