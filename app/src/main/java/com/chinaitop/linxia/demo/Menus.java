package com.chinaitop.linxia.demo;

import com.chinaitop.linxia.demo.activity.AnQuan.AnquanActivity;
import com.chinaitop.linxia.demo.activity.AnQuan.ChuLiangJiZhiLiangXinXiActivity;
import com.chinaitop.linxia.demo.activity.AnQuan.LuJing.LujingList;
import com.chinaitop.linxia.demo.activity.AnQuan.LuJing.LujingListActivity;
import com.chinaitop.linxia.demo.activity.AppStore.StoreActivity;
import com.chinaitop.linxia.demo.activity.BaoSongActivity;
import com.chinaitop.linxia.demo.activity.FenXi.ChuBeiKuQingKuangActivity;
import com.chinaitop.linxia.demo.activity.FenXi.LiangShiJiaoYiQingKuangActivity;
import com.chinaitop.linxia.demo.activity.FenXi.LiangShiShouGouShuJuActivity;
import com.chinaitop.linxia.demo.activity.FenXi.ZongHeFenXiActivity;
import com.chinaitop.linxia.demo.activity.JianGuan.KuJiJianGuanActivity;
import com.chinaitop.linxia.demo.activity.JianGuan.LiangKuDongTaiGuanLiActivity;
import com.chinaitop.linxia.demo.activity.JianGuan.LiangQing.LiangQingCeKongActivity;
import com.chinaitop.linxia.demo.activity.JianGuan.TongJiFenXiActivity;
import com.chinaitop.linxia.demo.activity.JianGuan.liangkudongtaiguanli.ChuRuKuXinXiActivity;
import com.chinaitop.linxia.demo.activity.JianGuan.liangkudongtaiguanli.KuCunQingKuangActivity;
import com.chinaitop.linxia.demo.activity.JianGuan.liangkudongtaiguanli.LiangKuCangChuQingKuangActivity;
import com.chinaitop.linxia.demo.activity.JianGuan.liangkudongtaiguanli.LiangKuFenBuQingKuangActivity;
import com.chinaitop.linxia.demo.activity.JianGuan.liangkudongtaiguanli.LunHuanXinXiActivity;
import com.chinaitop.linxia.demo.activity.MainActivity;
import com.chinaitop.linxia.demo.activity.YuAnActivity;
import com.chinaitop.linxia.demo.activity.ZhiFa.ZhifaActivity;
import com.chinaitop.linxia.demo.activity.anquanguanli.AnQuanGuanLiPingTaiActivity;
import com.chinaitop.linxia.demo.activity.anquanguanli.YiDongJianKongActivity;
import com.chinaitop.linxia.demo.activity.anquanguanli.YiDongSheBeiAnQuanGuanLiActivity;
import com.chinaitop.linxia.demo.activity.anquanguanli.YiDongSheBeiXinXiGuanLiActivity;
import com.chinaitop.linxia.demo.activity.yidongjieru.AnQuanJianChaActivity;
import com.chinaitop.linxia.demo.activity.yidongjieru.CeLueGuanLiActivity;
import com.chinaitop.linxia.demo.activity.yidongjieru.JieRuGuanLiActivity;
import com.chinaitop.linxia.demo.activity.yidongjieru.YiDongJieRuPingTaiActivity;
import com.chinaitop.linxia.demo.activity.yidongjieru.ZhiNengJieRuActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yaoju on 2017/12/25.
 */

public class Menus {
    public static List<MenuItem> main1 = new ArrayList<>();
    public static List<MenuItem> main2 = new ArrayList<>();
    public static List<MenuItem> main3 = new ArrayList<>();

    // 库级管理
    public static List<MenuItem> modulesKuJiGuanLi = new ArrayList<>();
    // 库级管理 - 粮库动态管理
    public static List<MenuItem> modulesLiangKuDongTaiGuanLi = new ArrayList<>();
    // 综合分析
    public static List<MenuItem> modulesZongHeFenXi = new ArrayList<>();
    // 安全管理平台
    public static List<MenuItem> modulesAnQuanGuanLiPingTai = new ArrayList<>();

    // 移动接入平台
    public static List<MenuItem> modulesYiDongJieRuPingTai = new ArrayList<>();

    //五 质量安全管理
    public static List<MenuItem> moduleZhiliang = new ArrayList<>();
    //移动执法管理
    public static List<MenuItem> moduleYidongZhifa = new ArrayList<>();

    static {
        MenuItem menuItem = new MenuItem("应急预案", R.mipmap.main1, YuAnActivity.class);
        main1.add(menuItem);
        menuItem = new MenuItem("协同办公", R.mipmap.main2, Menus.class);
        main1.add(menuItem);
        menuItem = new MenuItem("库级监管", R.mipmap.main3, KuJiJianGuanActivity.class);
        main1.add(menuItem);
        menuItem = new MenuItem("价格报送", R.mipmap.main4, BaoSongActivity.class);
        main1.add(menuItem);
        menuItem = new MenuItem("综合分析", R.mipmap.main5, ZongHeFenXiActivity.class);
        main1.add(menuItem);
        menuItem = new MenuItem("质量安全管理", R.mipmap.main6, AnquanActivity.class);
        main1.add(menuItem);
        menuItem = new MenuItem("移动执法管理", R.mipmap.main7, ZhifaActivity.class);
        main1.add(menuItem);

        menuItem = new MenuItem("安全管理平台", R.mipmap.main8, AnQuanGuanLiPingTaiActivity.class);
        main2.add(menuItem);
        menuItem = new MenuItem("移动开发平台", R.mipmap.main9, MainActivity.class);
        main2.add(menuItem);
        menuItem = new MenuItem("移动接入平台", R.mipmap.main10, YiDongJieRuPingTaiActivity.class);
        main2.add(menuItem);

        menuItem = new MenuItem("应用商店", R.mipmap.main11, StoreActivity.class);
        main3.add(menuItem);

        // 库级管理
        menuItem = new MenuItem("粮库动态管理", R.mipmap.kuji_1, LiangKuDongTaiGuanLiActivity.class);
        modulesKuJiGuanLi.add(menuItem);
        menuItem = new MenuItem("粮情测控", R.mipmap.kuji_2, LiangQingCeKongActivity.class);
        modulesKuJiGuanLi.add(menuItem);
        menuItem = new MenuItem("统计分析", R.mipmap.kuji_3, TongJiFenXiActivity.class);
        modulesKuJiGuanLi.add(menuItem);

        // 库级管理 - 粮库动态管理
        menuItem = new MenuItem("粮库分布情况", R.mipmap.liangkui_1, LiangKuFenBuQingKuangActivity.class);
        modulesLiangKuDongTaiGuanLi.add(menuItem);
        menuItem = new MenuItem("粮库仓储情况", R.mipmap.liangkui_2, LiangKuCangChuQingKuangActivity.class);
        modulesLiangKuDongTaiGuanLi.add(menuItem);
        menuItem = new MenuItem("库存情况", R.mipmap.liangkui_3, KuCunQingKuangActivity.class);
        modulesLiangKuDongTaiGuanLi.add(menuItem);
        menuItem = new MenuItem("出入库信息", R.mipmap.liangkui_4, ChuRuKuXinXiActivity.class);
        modulesLiangKuDongTaiGuanLi.add(menuItem);
        menuItem = new MenuItem("轮换信息", R.mipmap.liangkui_5, LunHuanXinXiActivity.class);
        modulesLiangKuDongTaiGuanLi.add(menuItem);

        // 综合分析
        menuItem = new MenuItem("粮食收购数据", R.mipmap.zonghe_1, LiangShiShouGouShuJuActivity.class);
        modulesZongHeFenXi.add(menuItem);
        menuItem = new MenuItem("储备库情况", R.mipmap.zonghe_2, ChuBeiKuQingKuangActivity.class);
        modulesZongHeFenXi.add(menuItem);
        menuItem = new MenuItem("粮食交易情况", R.mipmap.zonghe_3, LiangShiJiaoYiQingKuangActivity.class);
        modulesZongHeFenXi.add(menuItem);

        //五 质量安全管理
        menuItem = new MenuItem("粮食流通路径", R.mipmap.zhiliang_1, LujingListActivity.class);
        moduleZhiliang.add(menuItem);
        menuItem = new MenuItem("储粮及质量信息", R.mipmap.zhiliang_2, ChuLiangJiZhiLiangXinXiActivity.class);
        moduleZhiliang.add(menuItem);


        // 安全管理平台
        menuItem = new MenuItem("移动设备信息管理", R.mipmap.anquan_1, YiDongSheBeiXinXiGuanLiActivity.class);
        modulesAnQuanGuanLiPingTai.add(menuItem);
        menuItem = new MenuItem("移动设备安全管理", R.mipmap.anquan_2, YiDongSheBeiAnQuanGuanLiActivity.class);
        modulesAnQuanGuanLiPingTai.add(menuItem);
        menuItem = new MenuItem("移动设备运行监控", R.mipmap.anquan_3, YiDongJianKongActivity.class);
        modulesAnQuanGuanLiPingTai.add(menuItem);

        // 移动接入平台
        menuItem = new MenuItem("安全检查", R.mipmap.ic_launcher_round, AnQuanJianChaActivity.class);
        modulesYiDongJieRuPingTai.add(menuItem);
        menuItem = new MenuItem("智能接入", R.mipmap.ic_launcher_round, ZhiNengJieRuActivity.class);
        modulesYiDongJieRuPingTai.add(menuItem);
        menuItem = new MenuItem("策略管理", R.mipmap.ic_launcher_round, CeLueGuanLiActivity.class);
        modulesYiDongJieRuPingTai.add(menuItem);
        menuItem = new MenuItem("接入管理", R.mipmap.ic_launcher_round, JieRuGuanLiActivity.class);
        modulesYiDongJieRuPingTai.add(menuItem);

    }

}
