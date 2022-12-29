package com.fulldive.back.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class StageEntity {
	private String stageId;
	private String userId;
	private String stageTitle;
	private String stageImage;
	private String stageLocation;
	private String stageTimestamp;
	private String stageArtistId;
	private String stageDescription;
	private String stageThumbnailImage;
	private String stageTicketPrice;
	private String stageCurrent;
	private String stageTimeDifference;
	private String stageStreamKey;
	private String stageCombineId;
	private String createTimestamp;
}
