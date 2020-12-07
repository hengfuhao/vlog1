package com.gem.vlog.controller;

import com.gem.vlog.common.ResponseResult;
import com.gem.vlog.common.ResultCode;
import com.gem.vlog.model.Card;
import com.gem.vlog.utils.DataUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName CardController
 * @Description TODO
 * @Author admin
 * @Date 2020/12/3
 **/
@RestController
@RequestMapping(value = "api")
public class CardController {

    @GetMapping("cards")
    public ResponseResult getCard(){
        List<Card> cards = DataUtil.initCards();
        return ResponseResult.success(cards);
    }
}
