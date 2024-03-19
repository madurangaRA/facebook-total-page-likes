package com.mitra.FacebookTotalPageLikes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TotalLikesService {
    private final String accessToken;

    public TotalLikesService(@Value("${facebook.access.token}") String accessToken) {
        this.accessToken = accessToken;
    }

    public long getTotalPageLikes(String pageId) {
//        FacebookClient client = new DefaultFacebookClient(accessToken, Version.LATEST);
//        Page page = client.fetchObject(pageId, Page.class);
//        return page.getFanCount();
        return 1000;
    }
}
