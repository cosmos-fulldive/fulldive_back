package com.fulldive.back.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MailEntity {

    private String fromAddress;
    private List<String> toAddressList = new ArrayList<>();
    private List<String> ccAddressList = new ArrayList<>();
    private List<String> bccAddressList = new ArrayList<>();
    private String subject; // 제목
    private String content; // 메일 내용
    private boolean isUseHtmlYn; // 메일 형식이 HTML인지 여부(true, false)
//    private List<AtchFileDto> attachFileList = new ArrayList<>();

}
