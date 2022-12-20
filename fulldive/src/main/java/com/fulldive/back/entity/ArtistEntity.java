package com.fulldive.back.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@Data
public class ArtistEntity {
	private String userId;
	private String artistCategory;
	private String artistDescription;
	private String artistSnsI;
	private String artistSnsF;
	private String artistSnsT;
	private String artistSnsY;
	private String artistSnsW;
	private String artist;
	private Timestamp createTimestamp;

}
