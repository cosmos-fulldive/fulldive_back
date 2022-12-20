package com.fulldive.back.store;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.Map;

@Repository
public class PaymentStore implements PaymentStoreImpl{
	
	private final String ReadOnlyMapper = "PaymentReadOnlyMapper.";
	private final String DMLMapper = "PaymentDMLMapper.";
	
	@Inject
    SqlSession sqlSession;

	@Override
	public int paymentInsert(Map<String, Object> params) {
		return sqlSession.insert(DMLMapper+"paymentInsert", params);
	}

	@Override
	public int paymentUpdate(Map<String, Object> params) {
		return sqlSession.update(DMLMapper+"paymentUpdate", params);
	}

	@Override
	public int paymentDelete(Map<String, Object> params) {
		return sqlSession.delete(DMLMapper+"paymentDelete", params);
	}

}
