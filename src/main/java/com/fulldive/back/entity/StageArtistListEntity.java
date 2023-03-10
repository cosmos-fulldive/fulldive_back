package com.fulldive.back.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class StageArtistListEntity {
	private String stageId;
	private String artistId;
	private String artistName;
	private String artistImage;
}
