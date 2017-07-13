package com.etoak.action;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class TestUploadAction {
	//单个上传
	@RequestMapping("/FileUpload")
	public String FileUpload(@RequestParam("file") MultipartFile file) throws Exception {
		if(!file.isEmpty()){  
            try {  
                //这里将上传得到的文件保存至 d:\\temp\\file 目录  
                FileUtils.copyInputStreamToFile(file.getInputStream(), new File("C:\\",file.getOriginalFilename()));  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
        return "success"; 
	}
	@RequestMapping("/upload")
	public String upload(){
		return "upload";
	}
	//批量上传
	@RequestMapping("uploadMoreFile")
	public String uploadMoreFile(MultipartHttpServletRequest multiRequest){
		Iterator<String> filesNames = multiRequest.getFileNames(); //获得所有的文件名  
        while(filesNames.hasNext()){    //迭代，对单个文件进行操作  
            String fileName =filesNames.next();  
            MultipartFile file =  multiRequest.getFile(fileName);  
            if(!file.isEmpty()){  
                
                try {
					FileUtils.copyInputStreamToFile(file.getInputStream(), new File("C:\\test\\",file.getOriginalFilename()));
				} catch (IOException e) {
					e.printStackTrace();
				}  
            }  

        }  
		return "success";
	}
}
