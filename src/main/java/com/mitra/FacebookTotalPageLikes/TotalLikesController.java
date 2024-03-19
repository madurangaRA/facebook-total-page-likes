package com.mitra.FacebookTotalPageLikes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/facebook")
public class TotalLikesController {
    private final TotalLikesService totalLikesService;

    public TotalLikesController(TotalLikesService totalLikesService) {
        this.totalLikesService = totalLikesService;
    }

    @GetMapping("/total-likes/{pageId}")
    public long getTotalPageLikes(@PathVariable String pageId) {
        return totalLikesService.getTotalPageLikes(pageId);
    }
}
