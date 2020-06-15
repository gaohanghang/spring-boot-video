package project.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import project.Application;

import java.io.File;

public class FileUtil {

    private static final Logger log = LoggerFactory.getLogger(FileUtil.class);

    public static void createDirectories(String pathname) {
        File directories = new File(pathname);
        if (directories.exists()) {
            log.info("文件上传根目录已创建");
        } else { // 如果目录不存在就创建目录
            if (directories.mkdirs()) {
                log.info("创建多级目录成功");
            } else {
                log.info("创建多级目录失败");
            }
        }
    }

}
