package com.liwei;

import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.Region;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import org.junit.jupiter.api.Test;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

/*
* @Auther:又菜又爱玩的炜
* @Description:OSS测试
* @Date:2023/11/7
*/
@SpringBootTest
@ConfigurationProperties(prefix = "oss")
public class OSSTest{

    private String accessKey;

    private String secretKey;

    private String bucket;

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    @Test
    public void testOss(){
        //构造一个带指定 Region 对象的配置类
        Configuration cfg = new Configuration(Region.huadongZheJiang2());
//        cfg.resumableUploadAPIVersion = Configuration.ResumableUploadAPIVersion.V2;// 指定分片上传版本
        //...其他参数参考类注释

        UploadManager uploadManager = new UploadManager(cfg);
        //...生成上传凭证，然后准备上传
//        String accessKey = "DPLW2G2zJcXnHXKE7KZ0atXtVa8UD_4krskpNixS";
//        String secretKey = "ulx2aRYgJpRtphJChh6jnSPdUaqQpA8iGc2PWnQA";
//        String bucket = "liw-blog";

        //默认不指定key的情况下，以文件内容的hash值作为文件名
        String key = "2023/lw.JPG";

        try {
            /*byte[] uploadBytes = "hello qiniu cloud".getBytes("utf-8");
            ByteArrayInputStream byteInputStream=new ByteArrayInputStream(uploadBytes);*/
            InputStream inputStream = new FileInputStream("D:\\PictureFile\\iron.jpg");
            Auth auth = Auth.create(accessKey, secretKey);
            String upToken = auth.uploadToken(bucket);

            try {
                Response response = uploadManager.put(inputStream,key,upToken,null, null);
                //解析上传成功的结果
                DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
                System.out.println(putRet.key);
                System.out.println(putRet.hash);
            } catch (QiniuException ex) {
                ex.printStackTrace();
                if (ex.response != null) {
                    System.err.println(ex.response);

                    try {
                        String body = ex.response.toString();
                        System.err.println(body);
                    } catch (Exception ignored) {
                    }
                }
            }
        } catch (Exception ex) {
            //ignore
        }


    }
}