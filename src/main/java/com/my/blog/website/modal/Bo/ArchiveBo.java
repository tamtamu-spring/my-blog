package com.my.blog.website.modal.Bo;

import java.io.Serializable;
import java.util.List;

import com.my.blog.website.modal.Vo.ContentVo;

/**
 * Created by 13 on 2017/2/23.
 */
public class ArchiveBo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String date;
    private String count;
    private List<ContentVo> articles;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public List<ContentVo> getArticles() {
        return articles;
    }

    public void setArticles(List<ContentVo> articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return "Archive [" +
                "date='" + date + '\'' +
                ", count='" + count + '\'' +
                ", articles=" + articles +
                ']';
    }
}
