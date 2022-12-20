package com.fulldive.back.store;

import java.util.Map;

public interface PaymentStoreImpl {
	
	int paymentInsert(Map<String, Object> params);
	int paymentUpdate(Map<String, Object> params);
	int paymentDelete(Map<String, Object> params);
	
}
