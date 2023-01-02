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
	private String userId;
	private String userEmail;
	private String userPassword;
	private String userChkEmail;
	private String userNickname;
	private String userBirth;
	private String userName;
	private String userAccess;
	private String userPhone;
	private String userProfileImage;
	private String userGender;
	private String userNation;
	private String userAddress;
	private Integer userComet;
	private Integer userTicketCount;
	private Integer userTicketECount;
	private Integer userTicketNCount;
	private Integer userTicketPCount;
	private String artistCategory;
	private String artistDescription;
	private String artistSnsI;
	private String artistSnsF;
	private String artistSnsT;
	private String artistSnsY;
	private String artistSnsW;
	private String artist;
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
