package com.water.Mulbburi.community.dto;

import lombok.Data;

@Data
public class AttachmentDTO {
	
    private Long no;
    private Long refBoardNo;
    private String originalName;
    private String savedName;
    private String savePath;
    private String fileType;
    private String commnuityPath;
    private String status;
	public void setCommunityPath(String string) {
		// TODO Auto-generated method stub
		
	}

}
