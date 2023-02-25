package com.otb.yamujige.usedgoods.service;


import com.otb.yamujige.usedgoods.repository.UsedGoodsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsedGoodsService {

    private final UsedGoodsRepository usedGoodsRepository;
}
