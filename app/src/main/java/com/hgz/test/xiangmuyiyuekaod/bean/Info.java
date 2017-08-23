package com.hgz.test.xiangmuyiyuekaod.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2017/8/23.
 */

public class Info {

    /**
     * resultcode : 200
     * reason : Return Successd!
     * result : {"data":[{"id":"1329","name":"中石油顺丰航南加油站","area":"daxing","areaname":"北京市 大兴区","address":"北京市大兴区榆垡镇京开路新桥村路段,路西","brandname":"中石油","type":"直营店","discount":"打折加油站","exhaust":"京Ⅴ","position":"116.3172946622,39.5362185745","lon":"116.330482","lat":"39.547871","price":{"E90":"5.62","E93":"6","E97":"6.39","E0":"5.63"},"gastprice":{"92#":"5.56","95#":"5.92","0#车柴":"5.17"},"fwlsmc":"银联卡,信用卡支付,加油卡,便利店,洗车服务,发卡充值网点,加油卡充值业务"},{"id":"1330","name":"中石油京开高速加油站","area":"daxing","areaname":"北京市 大兴区","address":"北京市大兴区榆垡镇106国道东胡林路段路东,森林假日高尔夫俱乐部附近","brandname":"中石油","type":"直营店","discount":"打折加油站","exhaust":"京Ⅴ","position":"116.3156848352,39.48334392","lon":"116.32883","lat":"39.495089","price":{"E90":"5.62","E93":"6","E97":"6.39","E0":"5.63"},"gastprice":{"92#":"5.56","95#":"5.92","0#车柴":"5.17"},"fwlsmc":"银联卡,信用卡支付,加油卡,便利店,发卡充值网点,卫生间,银联卡充值,加油卡充值业务"},{"id":"1331","name":"中石油华星加油站","area":"daxing","areaname":"北京市 大兴区","address":"北京市大兴区榆垡镇胡林路与京开公路交叉处北京野生动物园附近","brandname":"中石油","type":"直营店","discount":"打折加油站","exhaust":"京Ⅴ","position":"116.3165462983,39.500404636","lon":"116.329665","lat":"39.512098","price":{"E90":"5.62","E93":"6","E97":"6.39","E0":"5.63"},"gastprice":{"92#":"5.56","95#":"5.92","0#车柴":"5.17"},"fwlsmc":"银联卡,信用卡支付,加油卡,便利店,银联卡充值,加油卡充值业务"},{"id":"1332","name":"中石化永定加油站","area":"daxing","areaname":"北京市 大兴区","address":"北京市大兴区榆垡镇十里铺,左堤路与106国道交叉口,榆垡公路动物防疫检查站对面","brandname":"中石化","type":"直营店","discount":"打折加油站","exhaust":"京Ⅴ","position":"116.3106463961,39.4723672506","lon":"116.32368","lat":"39.484343","price":{"E90":"5.62","E93":"6","E97":"6.39","E0":"5.63"},"gastprice":{"92#":"5.56","95#":"5.92","0#车柴":"5.17"},"fwlsmc":"加油卡,便利店,柴油自助加油,92#自助加油,95#自助加油,发卡充值网点,卫生间,银联卡充值,移动二维码业务,加油卡充值业务,公交卡充值,出租车数据采集"},{"id":"1862","name":"北京石油四季春加油站","area":"shunyi","areaname":"北京市 顺义区","address":"北京市顺义区牛栏山镇114乡道与京沈路交叉口,北京泽顺堂大药店附近","brandname":"国企","type":"其他","discount":"打折加油站","exhaust":"京Ⅴ","position":"116.6351960111,40.185936992","lon":"116.646632","lat":"40.19851","price":{"E90":"5.62","E93":"6","E97":"6.39","E0":"5.63"},"gastprice":{"92#":"5.56","95#":"5.92","0#车柴":"5.17"},"fwlsmc":"银联卡,信用卡支付,加油卡,便利店,洗车服务"},{"id":"1863","name":"中石化燕体加油站","area":"shunyi","areaname":"北京市 顺义区","address":"北京市顺义区马坡镇京沈路武卷路段,路西,马坡中学附近","brandname":"中石化","type":"直营店","discount":"打折加油站","exhaust":"京Ⅴ","position":"116.6341164458,40.1710058168","lon":"116.646388","lat":"40.184711","price":{"E90":"5.62","E93":"6","E97":"6.39","E0":"5.63"},"gastprice":{"92#":"5.56","0#车柴":"5.17"},"fwlsmc":"信用卡支付,加油卡,便利店,发卡充值网点,卫生间,移动二维码业务,加油卡充值业务,出租车数据采集"},{"id":"1864","name":"中图石油宝利泰德加油站","area":"shunyi","areaname":"北京市 顺义区","address":"北京市顺义区马坡镇白马路与京沈路交叉口向南路西,隆华购物中心附近","brandname":"中石油","type":"其他","discount":"打折加油站","exhaust":"京Ⅴ","position":"116.6324703769,40.1621208637","lon":"116.644731","lat":"40.174697","price":{"E90":"5.62","E93":"6","E97":"6.39","E0":"5.63"},"gastprice":{"92#":"5.56","95#":"5.92","0#车柴":"5.17"},"fwlsmc":"加油卡,便利店,洗车服务,卫生间"},{"id":"1865","name":"中石化顺力达加油站","area":"shunyi","areaname":"北京市 顺义区","address":"北京市顺义区赵全营镇西陈各庄,南陈路与昌金路交叉口,路南,高星光电设备厂附近","brandname":"中石化","type":"直营店","discount":"打折加油站","exhaust":"京Ⅴ","position":"116.6119566737,40.2057264055","lon":"116.625026","lat":"40.217938","price":{"E90":"5.62","E93":"6","E97":"6.39","E0":"5.63"},"gastprice":{"92#":"5.56","95#":"5.92","0#车柴":"5.17"},"fwlsmc":"加油卡,便利店,柴油自助加油,92#自助加油,95#自助加油,发卡充值网点,卫生间,移动二维码业务,加油卡充值业务,出租车数据采集"},{"id":"3619","name":"京泉加油站(只供柴油)","area":"fangshan","areaname":"北京市 房山区","address":"北京市房山区霞云岭乡京昆路凉水泉路段路南,霞云岭供电所附近","brandname":"社会民营","type":"其他","discount":"非打折加油站","exhaust":"京Ⅴ","position":"115.756393,39.746019","lon":"115.76298945203","lat":"39.751798345058","price":{"E90":"5.62","E93":"6","E97":"6.39","E0":"5.63"},"gastprice":{"0#车柴":"5.17"},"fwlsmc":""},{"id":"3620","name":"京东加油站(不对外加油)","area":"fangshan","areaname":"北京市 房山区","address":"北京市房山区城关镇京周路小田庄路段路南,房山区实验中学对面","brandname":"社会民营","type":"其他","discount":"非打折加油站","exhaust":"京Ⅴ","position":"116.0314658231,39.7026370935","lon":"116.044121","lat":"39.715402","price":{"E90":"5.62","E93":"6","E97":"6.39","E0":"5.63"},"gastprice":{"92#":"5.56","95#":"5.92"},"fwlsmc":""},{"id":"3622","name":"中石化龙禹石油良鑫源加油站","area":"fangshan","areaname":"北京市 房山区","address":"北京市房山区窦店镇房窑路西安庄路段路北","brandname":"中石化","type":"联营","discount":"非打折加油站","exhaust":"京Ⅴ","position":"116.0552198303,39.6412644518","lon":"116.068118","lat":"39.654172","price":{"E90":"5.62","E93":"6","E97":"6.39","E0":"5.63"},"gastprice":{"92#":"5.56","0#车柴":"5.17"},"fwlsmc":"银联卡,信用卡支付,加油卡,便利店,发卡充值网点,卫生间,加油卡充值业务"},{"id":"3623","name":"中石化宝合祥加油站","area":"fangshan","areaname":"北京市 房山区","address":"北京市房山区窦店镇大窦路田家村路段路西,田家园小区附近","brandname":"中石化","type":"直营店","discount":"打折加油站","exhaust":"京Ⅴ","position":"116.0621947107,39.6528436272","lon":"116.075201","lat":"39.665086","price":{"E90":"5.62","E93":"6","E97":"6.39","E0":"5.63"},"gastprice":{"92#":"5.56","95#":"5.92","0#车柴":"5.17"},"fwlsmc":"加油卡,便利店,柴油自助加油,发卡充值网点,卫生间,银联卡充值,移动二维码业务,加油卡充值业务,公交卡充值,出租车数据采集"},{"id":"3624","name":"中石化窦店加油站","area":"fangshan","areaname":"北京市 房山区","address":"北京市房山区G107(京深路)","brandname":"中石化","type":"直营店","discount":"打折加油站","exhaust":"京Ⅴ","position":"116.0719669455,39.6473332465","lon":"116.085354","lat":"39.659275","price":{"E90":"5.62","E93":"6","E97":"6.39","E0":"5.63"},"gastprice":{"92#":"5.56","95#":"5.92","0#车柴":"5.17"},"fwlsmc":"加油卡,便利店,柴油自助加油,92#自助加油,95#自助加油,发卡充值网点,卫生间,银联卡充值,移动二维码业务,加油卡充值业务"},{"id":"3625","name":"中石化鑫燕东加油站","area":"fangshan","areaname":"北京市 房山区","address":"北京市房山区窦店镇京深路七里店村路段路东,北京名族大学附近","brandname":"中石化","type":"直营店","discount":"打折加油站","exhaust":"京Ⅴ","position":"116.0857540373,39.6600497989","lon":"116.098555","lat":"39.671356","price":{"E90":"5.62","E93":"6","E97":"6.39","E0":"5.63"},"gastprice":{"92#":"5.56","95#":"5.92","0#车柴":"5.17"},"fwlsmc":"加油卡,便利店,发卡充值网点,卫生间,银联卡充值,移动二维码业务,加油卡充值业务,出租车数据采集"},{"id":"3626","name":"中石化京石路二站加油站","area":"fangshan","areaname":"北京市 房山区","address":"北京市房山区窦店镇京石高速窦店服务区西侧","brandname":"中石化","type":"直营店","discount":"打折加油站","exhaust":"京Ⅴ","position":"116.0732720219,39.6225360817","lon":"116.086329","lat":"39.634324","price":{"E90":"5.62","E93":"6","E97":"6.39","E0":"5.63"},"gastprice":{"92#":"5.56","95#":"5.92","0#车柴":"5.17"},"fwlsmc":"银联卡,信用卡支付,加油卡,便利店,柴油自助加油,发卡充值网点,餐饮,卫生间,银联卡充值,移动二维码业务,加油卡充值业务"},{"id":"3627","name":"中石化京石路一站加油站","area":"fangshan","areaname":"北京市 房山区","address":"北京市房山窦店镇京石高速窦店服务区东侧","brandname":"中石化","type":"直营店","discount":"打折加油站","exhaust":"京Ⅴ","position":"116.0747865667,39.6230711694","lon":"116.087919","lat":"39.634614","price":{"E90":"5.62","E93":"6","E97":"6.39","E0":"5.63"},"gastprice":{"92#":"5.56","95#":"5.92","0#车柴":"5.17"},"fwlsmc":"银联卡,信用卡支付,加油卡,便利店,发卡充值网点,卫生间,银联卡充值,移动二维码业务,加油卡充值业务"},{"id":"3629","name":"壳牌十三里加油站","area":"fangshan","areaname":"北京市 房山区","address":"北京市房山区阎村镇京深路小十三里路段路西,北京民族大学附近","brandname":"壳牌","type":"直营店","discount":"打折加油站","exhaust":"京Ⅴ","position":"116.0937830138,39.6709419972","lon":"116.106919","lat":"39.682515","price":{"E90":"5.62","E93":"6","E97":"6.39","E0":"5.63"},"gastprice":{"92#":"5.66","95#":"5.92","0#车柴":"5.17"},"fwlsmc":"银联卡,信用卡支付,加油卡,便利店,发卡充值网点,卫生间,银联卡充值,加油卡充值业务"},{"id":"3638","name":"中石化旧宫东大桥加油站","area":"daxing","areaname":"北京市 大兴区","address":"北京市大兴区旧宫镇小红门路与东马路交叉口向东路南,旧宫地铁站附近","brandname":"中石化","type":"直营店","discount":"打折加油站","exhaust":"京Ⅴ","position":"116.4543169423,39.8001070929","lon":"116.467749","lat":"39.811457","price":{"E90":"5.62","E93":"6","E97":"6.39","E0":"5.63"},"gastprice":{"92#":"5.56","95#":"5.92","0#车柴":"5.17"},"fwlsmc":"加油卡,便利店,柴油自助加油,92#自助加油,95#自助加油,发卡充值网点,银联卡充值,加油卡充值业务"},{"id":"3639","name":"中石化三元石油旧宫加油站","area":"daxing","areaname":"北京市 大兴区","address":"北京市大兴区小红门路与旧宫东路交叉口向西路北","brandname":"中石化","type":"联营","discount":"打折加油站","exhaust":"京Ⅴ","position":"116.4453704243,39.8010713773","lon":"116.458728","lat":"39.812523","price":{"E90":"5.62","E93":"6","E97":"6.39","E0":"5.63"},"gastprice":{"92#":"5.56","95#":"5.92","0#车柴":"5.17"},"fwlsmc":"加油卡,便利店,发卡充值网点,卫生间,银联卡充值,加油卡充值业务"},{"id":"3640","name":"中石化国凯加油站","area":"daxing","areaname":"北京市 大兴区","address":"北京市大兴区旧宫镇东马路与三台山路交叉口向北路西,北京军联骨科医院附近","brandname":"中石化","type":"直营店","discount":"打折加油站","exhaust":"京Ⅴ","position":"116.4618528057,39.8068189187","lon":"116.475487","lat":"39.817994","price":{"E90":"5.62","E93":"6","E97":"6.39","E0":"5.63"},"gastprice":{"92#":"5.56","95#":"5.92","0#车柴":"5.17"},"fwlsmc":"加油卡,便利店,柴油自助加油,92#自助加油,95#自助加油,98#自助加油,发卡充值网点,卫生间,银联卡充值,移动二维码业务,加油卡充值业务,公交卡充值"}],"pageinfo":{"pnums":20,"current":1,"allpage":54}}
     * error_code : 0
     */

    private String resultcode;
    private String reason;
    private ResultBean result;
    private int error_code;

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * data : [{"id":"1329","name":"中石油顺丰航南加油站","area":"daxing","areaname":"北京市 大兴区","address":"北京市大兴区榆垡镇京开路新桥村路段,路西","brandname":"中石油","type":"直营店","discount":"打折加油站","exhaust":"京Ⅴ","position":"116.3172946622,39.5362185745","lon":"116.330482","lat":"39.547871","price":{"E90":"5.62","E93":"6","E97":"6.39","E0":"5.63"},"gastprice":{"92#":"5.56","95#":"5.92","0#车柴":"5.17"},"fwlsmc":"银联卡,信用卡支付,加油卡,便利店,洗车服务,发卡充值网点,加油卡充值业务"},{"id":"1330","name":"中石油京开高速加油站","area":"daxing","areaname":"北京市 大兴区","address":"北京市大兴区榆垡镇106国道东胡林路段路东,森林假日高尔夫俱乐部附近","brandname":"中石油","type":"直营店","discount":"打折加油站","exhaust":"京Ⅴ","position":"116.3156848352,39.48334392","lon":"116.32883","lat":"39.495089","price":{"E90":"5.62","E93":"6","E97":"6.39","E0":"5.63"},"gastprice":{"92#":"5.56","95#":"5.92","0#车柴":"5.17"},"fwlsmc":"银联卡,信用卡支付,加油卡,便利店,发卡充值网点,卫生间,银联卡充值,加油卡充值业务"},{"id":"1331","name":"中石油华星加油站","area":"daxing","areaname":"北京市 大兴区","address":"北京市大兴区榆垡镇胡林路与京开公路交叉处北京野生动物园附近","brandname":"中石油","type":"直营店","discount":"打折加油站","exhaust":"京Ⅴ","position":"116.3165462983,39.500404636","lon":"116.329665","lat":"39.512098","price":{"E90":"5.62","E93":"6","E97":"6.39","E0":"5.63"},"gastprice":{"92#":"5.56","95#":"5.92","0#车柴":"5.17"},"fwlsmc":"银联卡,信用卡支付,加油卡,便利店,银联卡充值,加油卡充值业务"},{"id":"1332","name":"中石化永定加油站","area":"daxing","areaname":"北京市 大兴区","address":"北京市大兴区榆垡镇十里铺,左堤路与106国道交叉口,榆垡公路动物防疫检查站对面","brandname":"中石化","type":"直营店","discount":"打折加油站","exhaust":"京Ⅴ","position":"116.3106463961,39.4723672506","lon":"116.32368","lat":"39.484343","price":{"E90":"5.62","E93":"6","E97":"6.39","E0":"5.63"},"gastprice":{"92#":"5.56","95#":"5.92","0#车柴":"5.17"},"fwlsmc":"加油卡,便利店,柴油自助加油,92#自助加油,95#自助加油,发卡充值网点,卫生间,银联卡充值,移动二维码业务,加油卡充值业务,公交卡充值,出租车数据采集"},{"id":"1862","name":"北京石油四季春加油站","area":"shunyi","areaname":"北京市 顺义区","address":"北京市顺义区牛栏山镇114乡道与京沈路交叉口,北京泽顺堂大药店附近","brandname":"国企","type":"其他","discount":"打折加油站","exhaust":"京Ⅴ","position":"116.6351960111,40.185936992","lon":"116.646632","lat":"40.19851","price":{"E90":"5.62","E93":"6","E97":"6.39","E0":"5.63"},"gastprice":{"92#":"5.56","95#":"5.92","0#车柴":"5.17"},"fwlsmc":"银联卡,信用卡支付,加油卡,便利店,洗车服务"},{"id":"1863","name":"中石化燕体加油站","area":"shunyi","areaname":"北京市 顺义区","address":"北京市顺义区马坡镇京沈路武卷路段,路西,马坡中学附近","brandname":"中石化","type":"直营店","discount":"打折加油站","exhaust":"京Ⅴ","position":"116.6341164458,40.1710058168","lon":"116.646388","lat":"40.184711","price":{"E90":"5.62","E93":"6","E97":"6.39","E0":"5.63"},"gastprice":{"92#":"5.56","0#车柴":"5.17"},"fwlsmc":"信用卡支付,加油卡,便利店,发卡充值网点,卫生间,移动二维码业务,加油卡充值业务,出租车数据采集"},{"id":"1864","name":"中图石油宝利泰德加油站","area":"shunyi","areaname":"北京市 顺义区","address":"北京市顺义区马坡镇白马路与京沈路交叉口向南路西,隆华购物中心附近","brandname":"中石油","type":"其他","discount":"打折加油站","exhaust":"京Ⅴ","position":"116.6324703769,40.1621208637","lon":"116.644731","lat":"40.174697","price":{"E90":"5.62","E93":"6","E97":"6.39","E0":"5.63"},"gastprice":{"92#":"5.56","95#":"5.92","0#车柴":"5.17"},"fwlsmc":"加油卡,便利店,洗车服务,卫生间"},{"id":"1865","name":"中石化顺力达加油站","area":"shunyi","areaname":"北京市 顺义区","address":"北京市顺义区赵全营镇西陈各庄,南陈路与昌金路交叉口,路南,高星光电设备厂附近","brandname":"中石化","type":"直营店","discount":"打折加油站","exhaust":"京Ⅴ","position":"116.6119566737,40.2057264055","lon":"116.625026","lat":"40.217938","price":{"E90":"5.62","E93":"6","E97":"6.39","E0":"5.63"},"gastprice":{"92#":"5.56","95#":"5.92","0#车柴":"5.17"},"fwlsmc":"加油卡,便利店,柴油自助加油,92#自助加油,95#自助加油,发卡充值网点,卫生间,移动二维码业务,加油卡充值业务,出租车数据采集"},{"id":"3619","name":"京泉加油站(只供柴油)","area":"fangshan","areaname":"北京市 房山区","address":"北京市房山区霞云岭乡京昆路凉水泉路段路南,霞云岭供电所附近","brandname":"社会民营","type":"其他","discount":"非打折加油站","exhaust":"京Ⅴ","position":"115.756393,39.746019","lon":"115.76298945203","lat":"39.751798345058","price":{"E90":"5.62","E93":"6","E97":"6.39","E0":"5.63"},"gastprice":{"0#车柴":"5.17"},"fwlsmc":""},{"id":"3620","name":"京东加油站(不对外加油)","area":"fangshan","areaname":"北京市 房山区","address":"北京市房山区城关镇京周路小田庄路段路南,房山区实验中学对面","brandname":"社会民营","type":"其他","discount":"非打折加油站","exhaust":"京Ⅴ","position":"116.0314658231,39.7026370935","lon":"116.044121","lat":"39.715402","price":{"E90":"5.62","E93":"6","E97":"6.39","E0":"5.63"},"gastprice":{"92#":"5.56","95#":"5.92"},"fwlsmc":""},{"id":"3622","name":"中石化龙禹石油良鑫源加油站","area":"fangshan","areaname":"北京市 房山区","address":"北京市房山区窦店镇房窑路西安庄路段路北","brandname":"中石化","type":"联营","discount":"非打折加油站","exhaust":"京Ⅴ","position":"116.0552198303,39.6412644518","lon":"116.068118","lat":"39.654172","price":{"E90":"5.62","E93":"6","E97":"6.39","E0":"5.63"},"gastprice":{"92#":"5.56","0#车柴":"5.17"},"fwlsmc":"银联卡,信用卡支付,加油卡,便利店,发卡充值网点,卫生间,加油卡充值业务"},{"id":"3623","name":"中石化宝合祥加油站","area":"fangshan","areaname":"北京市 房山区","address":"北京市房山区窦店镇大窦路田家村路段路西,田家园小区附近","brandname":"中石化","type":"直营店","discount":"打折加油站","exhaust":"京Ⅴ","position":"116.0621947107,39.6528436272","lon":"116.075201","lat":"39.665086","price":{"E90":"5.62","E93":"6","E97":"6.39","E0":"5.63"},"gastprice":{"92#":"5.56","95#":"5.92","0#车柴":"5.17"},"fwlsmc":"加油卡,便利店,柴油自助加油,发卡充值网点,卫生间,银联卡充值,移动二维码业务,加油卡充值业务,公交卡充值,出租车数据采集"},{"id":"3624","name":"中石化窦店加油站","area":"fangshan","areaname":"北京市 房山区","address":"北京市房山区G107(京深路)","brandname":"中石化","type":"直营店","discount":"打折加油站","exhaust":"京Ⅴ","position":"116.0719669455,39.6473332465","lon":"116.085354","lat":"39.659275","price":{"E90":"5.62","E93":"6","E97":"6.39","E0":"5.63"},"gastprice":{"92#":"5.56","95#":"5.92","0#车柴":"5.17"},"fwlsmc":"加油卡,便利店,柴油自助加油,92#自助加油,95#自助加油,发卡充值网点,卫生间,银联卡充值,移动二维码业务,加油卡充值业务"},{"id":"3625","name":"中石化鑫燕东加油站","area":"fangshan","areaname":"北京市 房山区","address":"北京市房山区窦店镇京深路七里店村路段路东,北京名族大学附近","brandname":"中石化","type":"直营店","discount":"打折加油站","exhaust":"京Ⅴ","position":"116.0857540373,39.6600497989","lon":"116.098555","lat":"39.671356","price":{"E90":"5.62","E93":"6","E97":"6.39","E0":"5.63"},"gastprice":{"92#":"5.56","95#":"5.92","0#车柴":"5.17"},"fwlsmc":"加油卡,便利店,发卡充值网点,卫生间,银联卡充值,移动二维码业务,加油卡充值业务,出租车数据采集"},{"id":"3626","name":"中石化京石路二站加油站","area":"fangshan","areaname":"北京市 房山区","address":"北京市房山区窦店镇京石高速窦店服务区西侧","brandname":"中石化","type":"直营店","discount":"打折加油站","exhaust":"京Ⅴ","position":"116.0732720219,39.6225360817","lon":"116.086329","lat":"39.634324","price":{"E90":"5.62","E93":"6","E97":"6.39","E0":"5.63"},"gastprice":{"92#":"5.56","95#":"5.92","0#车柴":"5.17"},"fwlsmc":"银联卡,信用卡支付,加油卡,便利店,柴油自助加油,发卡充值网点,餐饮,卫生间,银联卡充值,移动二维码业务,加油卡充值业务"},{"id":"3627","name":"中石化京石路一站加油站","area":"fangshan","areaname":"北京市 房山区","address":"北京市房山窦店镇京石高速窦店服务区东侧","brandname":"中石化","type":"直营店","discount":"打折加油站","exhaust":"京Ⅴ","position":"116.0747865667,39.6230711694","lon":"116.087919","lat":"39.634614","price":{"E90":"5.62","E93":"6","E97":"6.39","E0":"5.63"},"gastprice":{"92#":"5.56","95#":"5.92","0#车柴":"5.17"},"fwlsmc":"银联卡,信用卡支付,加油卡,便利店,发卡充值网点,卫生间,银联卡充值,移动二维码业务,加油卡充值业务"},{"id":"3629","name":"壳牌十三里加油站","area":"fangshan","areaname":"北京市 房山区","address":"北京市房山区阎村镇京深路小十三里路段路西,北京民族大学附近","brandname":"壳牌","type":"直营店","discount":"打折加油站","exhaust":"京Ⅴ","position":"116.0937830138,39.6709419972","lon":"116.106919","lat":"39.682515","price":{"E90":"5.62","E93":"6","E97":"6.39","E0":"5.63"},"gastprice":{"92#":"5.66","95#":"5.92","0#车柴":"5.17"},"fwlsmc":"银联卡,信用卡支付,加油卡,便利店,发卡充值网点,卫生间,银联卡充值,加油卡充值业务"},{"id":"3638","name":"中石化旧宫东大桥加油站","area":"daxing","areaname":"北京市 大兴区","address":"北京市大兴区旧宫镇小红门路与东马路交叉口向东路南,旧宫地铁站附近","brandname":"中石化","type":"直营店","discount":"打折加油站","exhaust":"京Ⅴ","position":"116.4543169423,39.8001070929","lon":"116.467749","lat":"39.811457","price":{"E90":"5.62","E93":"6","E97":"6.39","E0":"5.63"},"gastprice":{"92#":"5.56","95#":"5.92","0#车柴":"5.17"},"fwlsmc":"加油卡,便利店,柴油自助加油,92#自助加油,95#自助加油,发卡充值网点,银联卡充值,加油卡充值业务"},{"id":"3639","name":"中石化三元石油旧宫加油站","area":"daxing","areaname":"北京市 大兴区","address":"北京市大兴区小红门路与旧宫东路交叉口向西路北","brandname":"中石化","type":"联营","discount":"打折加油站","exhaust":"京Ⅴ","position":"116.4453704243,39.8010713773","lon":"116.458728","lat":"39.812523","price":{"E90":"5.62","E93":"6","E97":"6.39","E0":"5.63"},"gastprice":{"92#":"5.56","95#":"5.92","0#车柴":"5.17"},"fwlsmc":"加油卡,便利店,发卡充值网点,卫生间,银联卡充值,加油卡充值业务"},{"id":"3640","name":"中石化国凯加油站","area":"daxing","areaname":"北京市 大兴区","address":"北京市大兴区旧宫镇东马路与三台山路交叉口向北路西,北京军联骨科医院附近","brandname":"中石化","type":"直营店","discount":"打折加油站","exhaust":"京Ⅴ","position":"116.4618528057,39.8068189187","lon":"116.475487","lat":"39.817994","price":{"E90":"5.62","E93":"6","E97":"6.39","E0":"5.63"},"gastprice":{"92#":"5.56","95#":"5.92","0#车柴":"5.17"},"fwlsmc":"加油卡,便利店,柴油自助加油,92#自助加油,95#自助加油,98#自助加油,发卡充值网点,卫生间,银联卡充值,移动二维码业务,加油卡充值业务,公交卡充值"}]
         * pageinfo : {"pnums":20,"current":1,"allpage":54}
         */

        private PageinfoBean pageinfo;
        private List<DataBean> data;

        public PageinfoBean getPageinfo() {
            return pageinfo;
        }

        public void setPageinfo(PageinfoBean pageinfo) {
            this.pageinfo = pageinfo;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class PageinfoBean {
            /**
             * pnums : 20
             * current : 1
             * allpage : 54
             */

            private int pnums;
            private int current;
            private int allpage;

            public int getPnums() {
                return pnums;
            }

            public void setPnums(int pnums) {
                this.pnums = pnums;
            }

            public int getCurrent() {
                return current;
            }

            public void setCurrent(int current) {
                this.current = current;
            }

            public int getAllpage() {
                return allpage;
            }

            public void setAllpage(int allpage) {
                this.allpage = allpage;
            }
        }

        public static class DataBean {
            /**
             * id : 1329
             * name : 中石油顺丰航南加油站
             * area : daxing
             * areaname : 北京市 大兴区
             * address : 北京市大兴区榆垡镇京开路新桥村路段,路西
             * brandname : 中石油
             * type : 直营店
             * discount : 打折加油站
             * exhaust : 京Ⅴ
             * position : 116.3172946622,39.5362185745
             * lon : 116.330482
             * lat : 39.547871
             * price : {"E90":"5.62","E93":"6","E97":"6.39","E0":"5.63"}
             * gastprice : {"92#":"5.56","95#":"5.92","0#车柴":"5.17"}
             * fwlsmc : 银联卡,信用卡支付,加油卡,便利店,洗车服务,发卡充值网点,加油卡充值业务
             */

            private String id;
            private String name;
            private String area;
            private String areaname;
            private String address;
            private String brandname;
            private String type;
            private String discount;
            private String exhaust;
            private String position;
            private String lon;
            private String lat;
            private PriceBean price;
            private GastpriceBean gastprice;
            private String fwlsmc;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getAreaname() {
                return areaname;
            }

            public void setAreaname(String areaname) {
                this.areaname = areaname;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getBrandname() {
                return brandname;
            }

            public void setBrandname(String brandname) {
                this.brandname = brandname;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getDiscount() {
                return discount;
            }

            public void setDiscount(String discount) {
                this.discount = discount;
            }

            public String getExhaust() {
                return exhaust;
            }

            public void setExhaust(String exhaust) {
                this.exhaust = exhaust;
            }

            public String getPosition() {
                return position;
            }

            public void setPosition(String position) {
                this.position = position;
            }

            public String getLon() {
                return lon;
            }

            public void setLon(String lon) {
                this.lon = lon;
            }

            public String getLat() {
                return lat;
            }

            public void setLat(String lat) {
                this.lat = lat;
            }

            public PriceBean getPrice() {
                return price;
            }

            public void setPrice(PriceBean price) {
                this.price = price;
            }

            public GastpriceBean getGastprice() {
                return gastprice;
            }

            public void setGastprice(GastpriceBean gastprice) {
                this.gastprice = gastprice;
            }

            public String getFwlsmc() {
                return fwlsmc;
            }

            public void setFwlsmc(String fwlsmc) {
                this.fwlsmc = fwlsmc;
            }

            public static class PriceBean {
                /**
                 * E90 : 5.62
                 * E93 : 6
                 * E97 : 6.39
                 * E0 : 5.63
                 */

                private String E90;
                private String E93;
                private String E97;
                private String E0;

                public String getE90() {
                    return E90;
                }

                public void setE90(String E90) {
                    this.E90 = E90;
                }

                public String getE93() {
                    return E93;
                }

                public void setE93(String E93) {
                    this.E93 = E93;
                }

                public String getE97() {
                    return E97;
                }

                public void setE97(String E97) {
                    this.E97 = E97;
                }

                public String getE0() {
                    return E0;
                }

                public void setE0(String E0) {
                    this.E0 = E0;
                }
            }

            public static class GastpriceBean {
                @SerializedName("92#")
                private String _$_92297; // FIXME check this code
                @SerializedName("95#")
                private String _$_95241; // FIXME check this code
                @SerializedName("0#车柴")
                private String _$_077; // FIXME check this code

                public String get_$_92297() {
                    return _$_92297;
                }

                public void set_$_92297(String _$_92297) {
                    this._$_92297 = _$_92297;
                }

                public String get_$_95241() {
                    return _$_95241;
                }

                public void set_$_95241(String _$_95241) {
                    this._$_95241 = _$_95241;
                }

                public String get_$_077() {
                    return _$_077;
                }

                public void set_$_077(String _$_077) {
                    this._$_077 = _$_077;
                }
            }
        }
    }
}
