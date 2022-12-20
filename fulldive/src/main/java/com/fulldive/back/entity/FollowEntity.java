package com.fulldive.back.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@Data
public class FollowEntity {
	private String followId;
	private String followArtistId;
	private String followUserId;
	private Timestamp followTimestamp;
	private Timestamp createTimestamp;
	
}
