package com.fulldive.back.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name="TB_FULLDIVE_USER")
public class UserEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private String userId;
	@Column
	private String userEmail;
	@Column
	private String userPassword;
	@Column
	private String userChkEmail;
	@Column
	private String userNickname;
	@Column
	private String userBirth;
	@Column
	private String userName;
	@Column
	private String userAccess;
	@Column
	private String userPhone;
	@Column
	private String userProfileImage;
	@Column
	private String userGender;
	@Column
	private String userNation;
	@Column
	private String userAddress;
	@Column
	private Integer userComet;
	@Column
	private String createTimestamp;
}

