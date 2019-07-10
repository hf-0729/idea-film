package com.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

@Controller
public class UploadAction {

    @RequestMapping("/upload")
    @ResponseBody
    public String upload(MultipartRequest mr) throws IOException {
        //支持界面任意   迭代器
        Iterator<String> it = mr.getFileNames();
        if (it.hasNext() == false) {

            return "";
        }
        String name = it.next();
        MultipartFile img = mr.getFile(name);

        //得到原来的文件名
        String oname = img.getOriginalFilename();
        //后缀名
        int index = oname.lastIndexOf(".");
        String ename = oname.substring(index);
        //新的名字
        String nname = System.currentTimeMillis() + ename;

        //要存放的路径
        String spath = System.getProperty("ROOT") + "/tmp";
        File spathfile = new File(spath);
        if (spathfile.exists() == false) {
            spathfile.mkdirs();
        }

        //传输
        File spathtmp = new File(spathfile, nname);
        img.transferTo(spathtmp);

        return "/tmp/" + nname;

    }
}
