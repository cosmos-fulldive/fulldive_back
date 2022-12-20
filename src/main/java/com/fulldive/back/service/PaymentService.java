package com.fulldive.back.service;

import com.fulldive.back.store.PaymentStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service
public class PaymentService implements PaymentServiceImpl {
	
	@Autowired
    private PaymentStore paymentStore;


	@Override
	public int paymentInsert(Map<String, Object> params) {
		return paymentStore.paymentInsert(params);
	}


	@Override
	public int paymentUpdate(Map<String, Object> params) {
		return paymentStore.paymentUpdate(params);
	}


	@Override
	public int paymentDelete(Map<String, Object> params) {
		return paymentStore.paymentDelete(params);
	}

	

}
