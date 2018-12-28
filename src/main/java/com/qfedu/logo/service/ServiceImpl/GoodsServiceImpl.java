package com.qfedu.logo.service.ServiceImpl;

;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qfedu.logo.mapper.GoodsMapper;
import com.qfedu.logo.mapper.ImgMapper;
import com.qfedu.logo.pojo.Goods;
import com.qfedu.logo.pojo.Img;
import com.qfedu.logo.service.GoodsService;
import com.qfedu.logo.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private ImgMapper imgMapper;

    @Override
    public boolean addGoods(String gname, String price, String desc, Integer stypeid, MultipartFile[] multipartFiles) throws IOException {

        Goods goods = new Goods();
        goods.setGname(gname);
        goods.setPrice(price);
        goods.setDescs(desc);
        goods.setTypeid(stypeid);
        System.out.println(goods);

        goodsMapper.insert(goods);

        // 图片保存,并且获取每张图片的名字
        List<Img> Imgs = new ArrayList<Img>();
        for (int i = 0; i < multipartFiles.length; i++) {

            String imgName = System.currentTimeMillis() + Math.random() * 100 + multipartFiles[i].getOriginalFilename();
            File file = new File("D:\\Documents\\HBuilderProjects\\二组\\img\\goodsImg\\" + imgName);

            multipartFiles[i].transferTo(file);
            Img img = new Img();

            img.setImgurl(imgName);
            img.setGoodsid(goods.getGid());
            Imgs.add(img);

        }

        //int i =1/0;
        // 插入配图表


        imgMapper.insertImg(Imgs);

        return true;

    }

    @Override
    public ResponseVo<Goods> getGoods(Integer tid,Integer pageNum, Integer pageSize) {

        PageHelper.startPage(pageNum, pageSize);
        List<Goods> list = goodsMapper.getGoods(tid);
        PageInfo<Goods> page = new PageInfo<Goods>(list);
        ResponseVo<Goods> vo = ResponseVo.OK();

        List<Goods> count = goodsMapper.getGoods(tid);
        System.out.println(count.size());

        vo.setData(page.getList());
        vo.setCount(count.size());

        return vo;

    }

    @Override
    public Goods goodsDetail(Integer gid) {
        return goodsMapper.goodsDetail(gid);
    }
    
    @Override
    public List<Goods> getGoodsImg(Integer gid) {
        return goodsMapper.selectGoodsById(gid);
    }
    
    @Override
    public List<Goods> wselectGoodsByShopcarId(String[] shopcarIds) {
        return goodsMapper.wselectGoodsByShopcarId(shopcarIds);
    }

    @Override
    public ResponseVo<Img> getImg(Integer goodsid) {
        ResponseVo<Img> vo = ResponseVo.OK();
        vo.setData(imgMapper.selectImg(goodsid));


        return vo;
    }

//    @Override
//    public R addGoods(Goods goods) {
//
//
//        if (goodsMapper.insert(goods)>0) {
//            return RUtil.setOK("添加成功");
//        } else {
//            return RUtil.setERROR("添加失败");
//        }
//
//    }
}
