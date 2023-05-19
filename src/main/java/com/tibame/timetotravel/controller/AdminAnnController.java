package com.tibame.timetotravel.controller;

import com.tibame.timetotravel.Service.AdminAnnService;
import com.tibame.timetotravel.Entity.Ann;
import com.tibame.timetotravel.common.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Map;

@RestController
@RequestMapping("/AdminAnnController")
public class AdminAnnController {

    @Autowired
    private AdminAnnService adminAnnService;
      //此為重導寫法，可以指定導到哪個頁面
    @RequestMapping("/redirect")
    public RedirectView redirect(){
        return new RedirectView("/html/admin_ann.html");
    }

    @PostMapping("/anns")
    public String insert(@RequestBody Ann ann){
        adminAnnService.insert(ann);
        return "執行資料庫的 Insert 操作";
    }

    @PutMapping("/anns/{annId}")
    public String update(@PathVariable Integer annId,
                         @RequestBody Ann ann){
        return adminAnnService.update(annId,ann);
    }

    @DeleteMapping("/anns/{annId}")
    public String delete(@PathVariable Integer annId) {
        adminAnnService.deleteById(annId);
        return "執行資料庫的 Delete 操作";
    }

//    @GetMapping("/anns/{annId}")
//    public AnnVO readById(@PathVariable Integer annId){
//        return adminAnnRepository.findById(annId).orElse(null);
//    }

//    @GetMapping("/anns")
//    public List<AnnVO> readAll(){
//        return adminAnnRepository.findAll();
//    }

    @GetMapping("/anns/page/{currPage}/{rows}")
    public PageBean<Ann> readByPage(@PathVariable Integer currPage, @PathVariable Integer rows){
        System.out.println("分頁搜尋");
        return adminAnnService.findAnnPageByRowData(currPage,rows);
    }

    @GetMapping("/anns/page/{currPage}/{rows}/{startDate}/{endDate}")
    public PageBean<Ann> readByDateRange(@PathVariable Integer currPage, @PathVariable Integer rows, @PathVariable String startDate, @PathVariable String endDate){
        System.out.println("日期範圍搜尋");
        return adminAnnService.findAnnPageByDateRange(startDate,endDate,currPage,rows);
    }

    @GetMapping("/anns/page/{currPage}/{rows}/keywords/{keyword}")
    public PageBean<Ann> readByKeWords(@PathVariable Integer currPage, @PathVariable Integer rows, @PathVariable String keyword){
        System.out.println("關鍵字搜尋");
        return adminAnnService.findAnnPageByKeyWords(keyword,currPage,rows);
    }
}