import project.util.FfmpegDevideVideo;
import project.util.VideoFileOperate;

import java.io.File;
import java.io.IOException;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2020-06-15 23:28
 **/
public class Test2 {

    public static final String VIDEO_PATH = "/Users/gaohanghang/MUDR-109/MUDR-109.mp4";
    public static final String OUTPUT_PATH = "/Users/gaohanghang/MUDR-109/file";

    public static void main(String[] args) throws Exception {

        String videoTime = FfmpegDevideVideo.getVideoTime(new File(VIDEO_PATH));

        System.out.println(videoTime);

        VideoFileOperate videoFileOperate = new VideoFileOperate();
        videoFileOperate.cutVideo(VIDEO_PATH, 140);

        // 将VIDEO_PATH分割为3分钟一段，VIDEO_PATH总共29分钟,如果结尾有不足3分钟的拼接的最后一段视频上
        //FfmpegDevideVideo.splitVideoFile(VIDEO_PATH, OUTPUT_PATH, 29, 3, true);

    }

}
