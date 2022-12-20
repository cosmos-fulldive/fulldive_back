package com.fulldive.back.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@Data
public class CategoryEntity {
	private String userId;
	private String categoryId;
	private String categoryNameKr;
	private String categoryNameEn;
	private Timestamp createTimestamp;
}
