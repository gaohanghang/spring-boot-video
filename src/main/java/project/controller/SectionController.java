package project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import project.util.FfmpegDevideVideo;
import project.util.FileUtil;
import project.util.VideoFileOperate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther kejiefu
 * @Date 2018/9/10 0010
 */
@Controller
public class SectionController {

    private static final Logger logger = LoggerFactory.getLogger(SectionController.class);

    @Value("${file.save.path}")
    private String fileSavePath;

    @RequestMapping("/section")
    public void section(String filePath, int eachPartTime, HttpServletRequest request, HttpServletResponse response) throws Exception {
        String videoTime = FfmpegDevideVideo.getVideoTime(new File(filePath));
        if (StringUtils.isEmpty(eachPartTime)) {
            eachPartTime = 140;
        }
        project.util.VideoFileOperate videoFileOperate = new VideoFileOperate();
        videoFileOperate.cutVideo(filePath, eachPartTime);
    }


}
