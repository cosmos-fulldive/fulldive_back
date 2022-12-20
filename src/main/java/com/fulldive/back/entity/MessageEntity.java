package com.fulldive.back.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@Data
public class MessageEntity {
	private String username;
    private String content;
    private Date date;

}
