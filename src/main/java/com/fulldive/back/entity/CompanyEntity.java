package com.fulldive.back.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CompanyEntity {
//	@Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
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

	private String companyId;
	private String companyCategoryCode;
	private String companyRegisterNumber;
	private String companyNation;
	private String companyCity;
	private String companyAddressDetail;
	private String companyBusiness;
	private String companySector;
	private String companyRegisterPhone;
	private String companyRegisterCellularPhone;

	private String createTimestamp;
}

