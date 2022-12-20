package com.fulldive.back.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@Data
public class StoreEntity {
	private String storeId;
	private String storeName;
	private String storePrice;
	private String storeBrand;
	private String storeCollaborationArtistId;
	private Timestamp storeTimestamp;
	private String storeContentImage;
	private String storeContentUrl;
	private Timestamp createTimestamp;
}
