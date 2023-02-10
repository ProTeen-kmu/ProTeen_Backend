package com.ProTeen.backend.faq.controller;

import com.ProTeen.backend.faq.domain.Faq;
import com.ProTeen.backend.faq.domain.Info;
import com.ProTeen.backend.faq.service.FaqService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("faq")
public class FaqController {

    private final FaqService faqService;

    @GetMapping("/read")
    public ResponseEntity<?> view(){
        List<Faq> faqs = faqService.serachAll();
        return ResponseEntity.ok().body(faqs);
    }
    @GetMapping("/read/{categoryId}") //info임
    public ResponseEntity<?> categoryView(@PathVariable Long categoryId){
        Optional<Info> info = faqService.searchByCategory(categoryId);
        return ResponseEntity.ok().body(info.get());
    }

}
