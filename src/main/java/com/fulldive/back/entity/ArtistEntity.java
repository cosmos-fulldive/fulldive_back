package com.fulldive.back.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.sql.Timestamp;

@Getter
@Setter
@Data
public class ArtistEntity {
	private String artistId;
	private String artistName;
	private String artistEmail;
	private String artistBirth;
	private String artistGender;
	private String artistMember;
	private String artistPhone;
	private String artistNation;
	private String artistAccept;
	private String artistCategory;
	private String artistDescription;
	private String artistSnsI;
	private String artistSnsF;
	private String artistSnsT;
	private String artistSnsY;
	private String artistSnsW;
	private String artistPassword;
	private String categoryNameKr;
	private String categoryNameKr1;
	private String categoryNameKr2;
	private String categoryNameKr3;
	private String categoryNameEn;
	private String categoryNameEn1;
	private String categoryNameEn2;
	private String categoryNameEn3;
	private Timestamp createTimestamp;

}
