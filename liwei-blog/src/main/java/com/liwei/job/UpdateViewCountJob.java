package com.liwei.job;

import com.liwei.domain.entity.Article;
import com.liwei.service.ArticleService;
import com.liwei.utils.RedisCache;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
* @Auther:又菜又爱玩的炜
* @Description:
* @Date:2023/11/8
*/
@Component
public class UpdateViewCountJob implements ApplicationContextAware {

    @Autowired
    private RedisCache redisCache;

    @Autowired
    private ArticleService articleService;



    private static ApplicationContext context;

    @Scheduled(cron = "0/55 * * * * ?")
    public void updateViewCount(){
        //获取redis中的浏览量
        Map<String, Integer> viewCountMap = redisCache.getCacheMap("article:viewCount");

        List<Article> articles = viewCountMap.entrySet()
                .stream()
                .map(entry -> new Article(Long.valueOf(entry.getKey()), entry.getValue().longValue()))
                .collect(Collectors.toList());
        //更新到数据库中
        articleService.updateBatchById(articles);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }
}